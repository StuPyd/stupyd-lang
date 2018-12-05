grammar stuPyd;
//decls: waiting for write

@lexer::header{
from stuPydParser import stuPydParser
from antlr4.Token import CommonToken
}

@lexer::members{
    self.lastToken = None
    self.tokens = []
    self.indentStack = []

def emit(self,t=None):
    if t == None :
        s = self._factory.create(self._tokenFactorySourcePair, self._type, self._text, self._channel, self._tokenStartCharIndex,
                                 self.getCharIndex()-1, self._tokenStartLine, self._tokenStartColumn)
        self.emitToken(s)
        #print(s)
        self.tokens.append(s)
        return s
    else:
        self.emitToken(t)
        self.tokens.append(t)
        #print(t)
        return t

def commonToken(self,type,text):
    stop = self.getCharIndex()-1
    if len(text)==0 :
        start = stop
    else:
        start = stop - len(text)+1
    return CommonToken(self._tokenFactorySourcePair,type,self.DEFAULT_TOKEN_CHANNEL,start,stop)

def createDedent(self):
    dedent = self.commonToken(stuPydParser.DEDENT,'')
    dedent.line = self.lastToken.line
    return dedent

@staticmethod
def getIndentationCount(spaces):
    count = 0
    for ch in spaces:
        if ch == '\t':
            count +=( 4 - (count%4))
        elif ch == ' ':
            count += 1
        else :
            pass
    # print(count)
    return count

def nextToken(self):
    # Check if the end-of-file is ahead and there are still some DEDENTS expected
    if(self._input.LA(1)==Token.EOF and len(self.indentStack)!=0):
        # Remove ant trailing EOF tokens from our buffer
        i = len(self.tokens)-1
        while i>= 0 :
            if(self.tokens[i].type==Token.EOF):
                self.tokens.pop(i)
            i-=1
        # First emit an extra line break that serves as the end of the stmt
        self.emit(self.commonToken(stuPydParser.NEWLINE,'\n'))
        # Now emit as much DEDENT tokens as needed
        while len(self.indentStack)!=0 :
            self.emit(self.createDedent())
            self.indentStack.pop()
        # put the EOF back on the token stream .
        self.emit(self.commonToken(stuPydParser.EOF,'<EOF>'))
    next = super().nextToken()
    if (next.channel == Token.DEFAULT_CHANNEL):
        # Keep track of the last token on the default channel
        self.lastToken = next
    if len(self.tokens) == 0 :
        # print(next)
        return next
    else :
        temp = self.tokens[0]
        self.tokens.pop(0)
        #print(temp)
        return temp

def atStartOfInput(self):
    if super().getCharIndex()==0 and super().line==1 :
        # print('True')
        return True
    else:
        # print('False')
        return False
}

tokens{INDENT,DEDENT}

file_input:
    (NEWLINE|stmt)*EOF
;
stmt:
    compound_stmt
    |simple_stmt
    |precom_stmt
    ;

precom_stmt:
    '#DECOMPILE' #preDec
    ;

simple_stmt
    :small_stmt (';'small_stmt)*(';')?NEWLINE;

small_stmt
	:decls
	|gv_stmt
	|output
	//|...
	;

compound_stmt:
    if_stmt
    |while_stmt
    //....
;

gv_stmt
	:expr '->' prmy #GvExp
	|boolval '->' prmy #GvBool
	;

decls	:	(decl)+;

decl	:	vartype tarlist
		//type subscription tarlist NEWLINE
;

vartype	:
		'num'
		|'bool'
		|'string'
		|'void'
		|'struct'
		;

tarlist
	:target ( ',' target )*
	{}
;

target
	:ID     #Tarid
	//|attribute
	|subscription   #TarSub
		;

subscription
	:	subscription'[' expr ']' #Subsc
		|ID     #Subfinal
		;

prmy	:	ID      #Prid
		|subscription   #Prsub
		//|attribute
		;

expr 	:	expr '+' term	#Eadd
		|expr '-' term	#Esub
		//|'(' expr ')'	#Einc
		|term		#Eterm
		;

term	:    term '*' unary	#Tmul
		|term '/' unary	#Tdiv
		//|'(' term ')'	#Tinc
		|unary	#Tunary
		;

unary	:
        '-'unary		#Udis
		|unary '^' factor	#Usqr
		//|'('unary')'	#Uinc
		|factor	#Ufac
		;

factor	:NUMBER	#Fnum
        |'('expr')'  #Finc
		|STRING	#FString
		|prmy	#Fprmy
		//|call
		//|loc
		|'('boolval')' #Fbool
	;

boolval :  boolval '|' join   #Bor
        |join           #Bjoin
        ;

join :  join '&' equality  #Jand
        |equality   #Jeql
        ;

equality:   equality '=' rel    #Eeql
        |rel                    #Erel
        ;
rel :   expr '>' expr   #Rbig
        |expr '<' expr  #Rsml
        |expr '>=' expr #Rbe
        |expr '<=' expr #Rse
        |'!'basebool     #Rnot
        |basebool   #Rbase
        |prmy   #Rprmy
;

basebool:'TRUE' #Btrue
        |'FALSE'    #Bfalse
        |'('boolval')' #Binc
       ;

output: expr
;

while_stmt: while_judge suite
;

while_judge:    'while' boolval ':'
;

if_stmt : if_judge suite else_stmt
;

if_judge : 'if' boolval ':'
;

else_stmt:
    'else' ':' suite #isElse
    |   #NotElse
    ;
suite   :
    simple_stmt
    |NEWLINE INDENT (stmt)+ DEDENT
;

NUMBER
	: INT
	| FLOAT
	;

fragment SPACES : [ \t]+;

NEWLINE
    :
    ( {self.atStartOfInput()}?   SPACES
   | ( '\r'? '\n' | '\r' ) SPACES?
   )
   {
        newLine = self.text
        for i in newLine :
            if i == '\r' or i == '\n' or i == '\f':
                pass
            else:
                newLine.replace(str(i),'')

        spaces = self.text.replace('\r','')
        spaces = self.text.replace('\n','')
        spaces = self.text.replace('\f','')

        next = self._input.LA(1)

        if(next=='\r' or next == '\n' or next == '\f' or next == '<EOF>'):
            self.skip()
        else:
            self.emit(self.commonToken(self.NEWLINE,newLine))
            indent = self.getIndentationCount(spaces)
            previous = 0
            if len(self.indentStack) != 0 :
                previous = self.indentStack.pop()
                self.indentStack.append(previous)
                # it is equal to indentStack.peek()
            if indent==previous :
                # skip indents of the same size as the present indent-size
                self.skip()
            elif indent > previous :
                self.indentStack.append(indent)
                self.emit(self.commonToken(stuPydParser.INDENT,spaces))
            else:
                # Possibly emit more than 1 DEDENT token
                while len(self.indentStack)!=0 and self.indentStack[len(self.indentStack)-1]>indent:
                    self.emit(self.createDedent())
                    self.indentStack.pop()
   }
;
BLANK : (SPACES|COMMENT)+ ->skip
;

ID :
	('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment COMMENT
 : '//' ~[\r\n\f]*
 ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;


fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

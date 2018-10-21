from .stuPydLexer import stuPydLexer
from .stuPydParser import stuPydParser
from .stuPydListener import stuPydListener

class extendListener(stuPydListener):
     # listener members
    def __init__(self):
        # Variable Table relative
        self.varTable = []
        self.k = 0 ;
        self.tempVarLoc=-1
        # Value Table relative
        self.valueTable=[]
        self.locValueTable = 0
        # code_obj and relative， added by muchensun
        self.code_obj = {}
        self.code_index = 0
        self.current_instruction = []

    # added by muchensun
    def add_to_code_obj(self, code, attr):
        self.current_instruction = [code, attr]
        self.code_obj[self.code_index] = self.current_instruction
        self.code_index = self.code_index + 2

    # added by muchensun
    def print_relatives(self):
        print("constants: ", self.valueTable)  # print relative attributes
        print("variables: ", self.varTable)
        print("code object:")
        for key, value in self.code_obj.items():
            print('\t{key}: {value}'.format(key=key, value=value))
        print('\n')

    def findVarTable(self,s):
        i=0
        for temps in self.varTable:
            if temps == s :
                return i
            i=i+1
        return -1

    def getNewValueLocation(self):
        rt = self.locValueTable
        self.locValueTable = self.locValueTable + 1
        return rt

    def findLocationOfValueTable(self,v):
        i = 0
        for str in self.valueTable :
            if self.valueTable[i] == v :
                return i
            i=i+1
        # str is a float although i named it str
        tempLoc = self.getNewValueLocation()
        #self.valueTable.append(v)
        self.valueTable.append(v)
        return tempLoc

    def exitTarget(self, ctx:stuPydParser.TargetContext):
        sInTarget = ctx.ID().getText()
        tl = self.findVarTable(sInTarget)
        if(tl==-1):
            i = self.k
            #self.varTable[i]=sInTarget
            self.varTable.append(sInTarget)
            #print('FAST_DECL\t%d'%self.k)
            self.add_to_code_obj(1, self.k)
            self.k=self.k + 1
        else:
            print('Error.\n')

    def exitFnum(self, ctx: stuPydParser.FnumContext):
        s = ctx.getText()
        tl=self.findLocationOfValueTable(s)
        #print('LOAT_NUM\t%d'%tl)
        self.add_to_code_obj(0, tl)

    def exitFprmy(self, ctx:stuPydParser.FprmyContext):
        #print('LOAD_FAST\t%d'%self.tempVarLoc)
        self.add_to_code_obj(3, self.tempVarLoc)

    # added by muchensun
    def exitFString(self, ctx:stuPydParser.FStringContext):
        s = ctx.getText()
        tl = self.findLocationOfValueTable(s)
        # print('LOAT_STRING\t%d'%tl)
        self.add_to_code_obj(17, tl)

    def exitUfac(self, ctx:stuPydParser.UfacContext):
        pass

    def exitTunary(self, ctx:stuPydParser.TunaryContext):
        pass

    def exitEterm(self, ctx:stuPydParser.EtermContext):
        pass

    def exitEadd(self, ctx:stuPydParser.EaddContext):
        #print('ADD_TWO_NUMBERS()')
        self.add_to_code_obj(4, -1)

    def exitEsub(self, ctx: stuPydParser.EsubContext):
        #print('SUB_TWO_NUMBERS()')
        self.add_to_code_obj(5, -1)

    def exitGv_stmt(self, ctx:stuPydParser.Gv_stmtContext):
        gvVarName = ctx.prmy().getText()
        varLoc = self.findVarTable(gvVarName)
        #print('STORE_FAST\t%d'%varLoc)
        self.add_to_code_obj(2, varLoc)

    def exitPrmy(self, ctx: stuPydParser.PrmyContext):
        IDname = ctx.ID().getText()
        self.tempVarLoc = self.findVarTable(IDname)

    def exitTmul(self, ctx: stuPydParser.TmulContext):
        #print('MUL_TWO_NUMBERS()')
        self.add_to_code_obj(6, -1)

    # added by muchen
    def exitOutput(self, ctx:stuPydParser.OutputContext):
        pass
        IDname = ctx.ID().getText()
        IDLoc = self.findVarTable(IDname)
        self.add_to_code_obj(3, IDLoc)
        self.add_to_code_obj(7, -1)

    # added by muchen
    def exitSimple_stmt(self, ctx:stuPydParser.Simple_stmtContext):
        #pass
        self.add_to_code_obj(13, -1)    # add QUIT instruction

        #self.print_relatives()

        # stupyd = Interpreter(self.code_obj, self.valueTable, self.varTable)
        # stupyd.run_code()
        #stupyd.print_running_env()
        #stupyd.dis()
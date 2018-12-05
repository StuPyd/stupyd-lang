from stuPydLexer import stuPydLexer
from stuPydParser import stuPydParser
from stuPydListener import stuPydListener
from stupydInterpreter import Interpreter

class extendListener(stuPydListener):
     # listener members
    def __init__(self):
        # Variable Table relative
        self.varTable = []
        self.k = 0
        self.tempVarLoc=-1
        # Value Table relative
        self.valueTable=[]
        self.locValueTable = 0
        # Array Operation relative
        self.subLevel = 0 # Mark Array 's dimension .
        self.currentName = "" # Store the primary name of an array
        self.subscr_flag = 0 # Mark a flag . GV_STMT and OUTPUT will add instrument while it is 1
        # code_obj and relative， added by muchensun
        self.code_obj = {}
        self.code_index = 0
        self.current_instruction = []
        self.boolReslut = False
        self.whileStack = []
        #precompile flags
        self.printDecomInfoFlag = 0


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
        i = 0;
        for str in self.valueTable :
            if self.valueTable[i] == v :
                return i
            i=i+1
        # str is a float although i named it str
        tempLoc = self.getNewValueLocation()
        #self.valueTable.append(v)
        self.valueTable.append(int(v))
        return tempLoc

    #  Functions below added by Lu Luming

    def exitStmt(self, ctx:stuPydParser.StmtContext):
        if(self.printDecomInfoFlag==1):
            print("")

    def exitPreDec(self, ctx:stuPydParser.PreDecContext):
        self.printDecomInfoFlag=1

    def exitTarid(self, ctx:stuPydParser.TargetContext):
        sInTarget = ctx.ID().getText()
        tl = self.findVarTable(sInTarget)
        if(tl==-1):
            i = self.k
            #self.varTable[i]=sInTarget
            self.varTable.append(sInTarget)
            if(self.printDecomInfoFlag==1):print('FAST_DECL\t%d'%self.k)
            self.add_to_code_obj(1, self.k)
            self.k=self.k + 1
        else:
            print('Error.\n')

    def exitFnum(self, ctx: stuPydParser.FnumContext):
        s=ctx.getText()
        tl=self.findLocationOfValueTable(s)
        if (self.printDecomInfoFlag == 1):print('LOAD_CONST\t%d\t%f'%(tl,float(s)))
        self.add_to_code_obj(0, tl)

    def exitFprmy(self, ctx:stuPydParser.FprmyContext):
        pass
        # Below : the old version to operate prmy in expr . but now abundant .
        if (self.printDecomInfoFlag == 1):print('LOAD_FAST\t%d'%self.tempVarLoc)
        self.add_to_code_obj(3, self.tempVarLoc)

    def exitUfac(self, ctx:stuPydParser.UfacContext):
        pass

    def exitTunary(self, ctx:stuPydParser.TunaryContext):
        pass

    def exitEterm(self, ctx:stuPydParser.EtermContext):
        pass

    def exitEadd(self, ctx:stuPydParser.EaddContext):
        if (self.printDecomInfoFlag == 1):print('ADD_TWO_NUMBERS()')
        self.add_to_code_obj(4, -1)

    def exitEsub(self, ctx: stuPydParser.EsubContext):
        if (self.printDecomInfoFlag == 1):print('SUB_TWO_NUMBERS()')
        self.add_to_code_obj(5, -1)

    def exitGvExp(self, ctx: stuPydParser.GvExpContext):
        if(self.subscr_flag==1):
            if(self.printDecomInfoFlag == 1):
                print ("STORE_SUBSCR\t-1")
            self.add_to_code_obj(20,-1)
            self.subscr_flag = 0
        varLoc = self.tempVarLoc
        if (self.printDecomInfoFlag == 1):
            print('STORE_FAST\t%d'%varLoc)
        self.add_to_code_obj(2, varLoc)

    # EDIT ON 2018-8-14

    def exitGvBool(self, ctx:stuPydParser.GvBoolContext):
        gvVarName = ctx.prmy().getText()
        varLoc = self.findVarTable(gvVarName)
        if (self.printDecomInfoFlag == 1):print('STORE_FAST\t%d'%varLoc)
        self.add_to_code_obj(2, varLoc)

    def exitPrid(self, ctx: stuPydParser.PrmyContext):
        IDname = ctx.ID().getText()
        self.tempVarLoc = self.findVarTable(IDname)
        # if (self.printDecomInfoFlag == 1 ):
            # print('LOAD_FAST\t%d'%self.tempVarLoc)
        # self.add_to_code_obj(3, self.tempVarLoc)

    def exitTmul(self, ctx: stuPydParser.TmulContext):
        if (self.printDecomInfoFlag == 1):print('MUL_TWO_NUMBERS()')
        self.add_to_code_obj(6, -1)

    # added by muchen
    def enterOutput(self, ctx:stuPydParser.OutputContext):
        if (self.printDecomInfoFlag == 1 ):
            print('LOAD_FAST\t%d'%self.tempVarLoc)
        self.add_to_code_obj(3, self.tempVarLoc)

    def exitOutput(self, ctx:stuPydParser.OutputContext):
        if(self.subscr_flag==1):
            if(self.printDecomInfoFlag == 1):
                print ('LOAD_SUBSCR/t-1')
            self.add_to_code_obj(19,-1)

        if (self.printDecomInfoFlag == 1):print('print')
        self.add_to_code_obj(7, -1)
        self.subscr_flag = 0

    # added by muchen
    def exitSimple_stmt(self, ctx:stuPydParser.Simple_stmtContext):
        pass

    def exitFile_input(self, ctx:stuPydParser.File_inputContext):
        self.add_to_code_obj(13, -1)  # add QUIT instruction

        # self.print_relatives()

        stupyd = Interpreter(self.code_obj, self.valueTable, self.varTable)
        stupyd.run_code()
        #stupyd.print_running_env()

    def exitBtrue(self, ctx:stuPydParser.BtrueContext):
        if (self.printDecomInfoFlag == 1):print("LOAD_BOOL\t1")
        self.add_to_code_obj(16,1)

    def exitBfalse(self, ctx:stuPydParser.BfalseContext):
        if (self.printDecomInfoFlag == 1):print("LOAD_BOOL\t0")
        self.add_to_code_obj(16, 0)

    def exitRnot(self, ctx:stuPydParser.RnotContext):
        if (self.printDecomInfoFlag == 1):print("NO\t")

    def exitRbig(self, ctx:stuPydParser.RbigContext):
        if (self.printDecomInfoFlag == 1):print("COMPARE_TWO_NUMBERS\t1")
        self.add_to_code_obj(8, 1)

    def exitRsml(self, ctx:stuPydParser.RsmlContext):
        if (self.printDecomInfoFlag == 1):print("COMPARE_TWO_NUMBERS\t0")
        self.add_to_code_obj(8, 0)

    def exitRbe(self, ctx:stuPydParser.RbeContext):
        if (self.printDecomInfoFlag == 1):print("COMPARE_TWO_NUMBERS\t4")
        self.add_to_code_obj(8, 4)

    def exitRse(self, ctx:stuPydParser.RseContext):
        if (self.printDecomInfoFlag == 1):print("COMPARE_TWO_NUMBERS\t3")
        self.add_to_code_obj(8, 3)

    def exitEeql(self, ctx:stuPydParser.EeqlContext):
        if (self.printDecomInfoFlag == 1):print("COMPARE_TWO_NUMBERS\t2")
        self.add_to_code_obj(8, 2)

    def exitJand(self, ctx:stuPydParser.JandContext):
        if (self.printDecomInfoFlag == 1):print("AND\t")
        self.add_to_code_obj(13,-1)

    def exitBor(self, ctx:stuPydParser.BorContext):
        if (self.printDecomInfoFlag == 1):print("OR\t")
        self.add_to_code_obj(14, -1)

    def exitRprmy(self, ctx:stuPydParser.RprmyContext):
        if (self.printDecomInfoFlag == 1):print('LOAD_FAST\t%d\t%s' % (self.tempVarLoc,self.varTable[self.tempVarLoc]))
        self.add_to_code_obj(3, self.tempVarLoc)

    def enterWhile_stmt(self, ctx:stuPydParser.While_stmtContext):
        if (self.printDecomInfoFlag == 1):print("WHILE_LOOP()")
        self.add_to_code_obj(11,-1)
        self.whileStack.append(self.code_index - 2)

    def exitWhile_judge(self, ctx:stuPydParser.While_judgeContext):
        # I store in the code_obj but without parameters .
        # Then put location into whileStack . so that I can change it when "while_stmt"ends .
        if (self.printDecomInfoFlag == 1):print("JUMP_IF_FALSE\t//parameters behind the nearest JUMP")
        self.add_to_code_obj(10,-1)
        self.whileStack.append(self.code_index-2)

    def exitWhile_stmt(self, ctx:stuPydParser.While_stmtContext):
        JIFLoc = self.whileStack.pop()
        whileLoc = self.whileStack.pop()
        if (self.printDecomInfoFlag == 1):print("JUMP\t%d\t%d"%(whileLoc,self.code_index+2))
        JIFtarget = self.code_index
        self.add_to_code_obj(9,whileLoc)
        self.code_obj[JIFLoc] = (10,self.code_index)
        if (self.printDecomInfoFlag == 1):print(JIFLoc,'\t',self.code_obj[JIFLoc])

    def enterIf_stmt(self, ctx:stuPydParser.If_stmtContext):
        pass

    def exitIf_judge(self, ctx:stuPydParser.If_judgeContext):
        if (self.printDecomInfoFlag == 1): print("JUMP_IF_FALSE\t")
        self.add_to_code_obj(10, -1)
        self.whileStack.append(self.code_index - 2)

    def enterIsElse(self, ctx:stuPydParser.IsElseContext):
        self.add_to_code_obj(9,-1)# Change after exit if_stmt
        JIFLoc = self.whileStack.pop()
        self.code_obj[JIFLoc] = (10,self.code_index)
        self.whileStack.append(self.code_index-2)

    def enterNotElse(self, ctx:stuPydParser.NotElseContext):
        JIFLoc = self.whileStack.pop()
        self.code_obj[JIFLoc] = (10, self.code_index)


    def exitIsElse(self, ctx:stuPydParser.IsElseContext):
        JMPLoc = self.whileStack.pop()
        self.code_obj[JMPLoc] = (9,self.code_index)

    def enterSuite(self, ctx:stuPydParser.SuiteContext):
        if (self.printDecomInfoFlag == 1):print('INDENT')

    def exitSuite(self, ctx:stuPydParser.SuiteContext):
        if (self.printDecomInfoFlag == 1):print('DEDENT')
    '''
    Arrays . 2018-11-25
    '''
    def exitSubfinal(self, ctx:stuPydParser.SubfinalContext):
        self.currentName = ctx.ID().getText()
        #print(self.currentName)

    def exitSubsc(self, ctx:stuPydParser.SubscContext):
         self.subLevel += 1
         i=0 #Wait for update


    def enterPrsub(self, ctx:stuPydParser.PrsubContext):
        IDname = self.currentName
        self.tempVarLoc = self.findVarTable(IDname)
        if (self.printDecomInfoFlag == 1):
            print('LOAD_FAST\t%d\t%s'%(self.tempVarLoc,self.varTable[self.tempVarLoc]))
        self.add_to_code_obj(3, self.tempVarLoc)
        self.subLevel = 0
        self.subscr_flag = 1

    def enterTarSub(self, ctx:stuPydParser.TarSubContext):
        pass

    def exitTarSub(self, ctx:stuPydParser.TarSubContext):
        self.subLevel = 0
        sInTarget = self.currentName
        tl = self.findVarTable(sInTarget)
        if (tl == -1):
            i = self.k
            # self.varTable[i]=sInTarget
            self.varTable.append(sInTarget)
            if (self.printDecomInfoFlag == 1): print('FAST_DECL\t%d' % self.k)
            self.add_to_code_obj(1, self.k)
            self.k = self.k + 1
        else:
            print('Error.\n')
        t=self.findVarTable(self.currentName)
        if(self.printDecomInfoFlag == 1):
            print("BUILD_ARRAY\t-1")
            print("STORE_FAST\t%d"%t)
            print("")
        self.add_to_code_obj(18,-1)
        self.add_to_code_obj(2,t)
# Generated from D:/stuPYd/stupyd_demo_4\stuPyd.g4 by ANTLR 4.7
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .stuPydParser import stuPydParser
else:
    from stuPydParser import stuPydParser

# This class defines a complete listener for a parse tree produced by stuPydParser.
class stuPydListener(ParseTreeListener):

    # Enter a parse tree produced by stuPydParser#file_input.
    def enterFile_input(self, ctx:stuPydParser.File_inputContext):
        pass

    # Exit a parse tree produced by stuPydParser#file_input.
    def exitFile_input(self, ctx:stuPydParser.File_inputContext):
        pass


    # Enter a parse tree produced by stuPydParser#stmt.
    def enterStmt(self, ctx:stuPydParser.StmtContext):
        pass

    # Exit a parse tree produced by stuPydParser#stmt.
    def exitStmt(self, ctx:stuPydParser.StmtContext):
        pass


    # Enter a parse tree produced by stuPydParser#preDec.
    def enterPreDec(self, ctx:stuPydParser.PreDecContext):
        pass

    # Exit a parse tree produced by stuPydParser#preDec.
    def exitPreDec(self, ctx:stuPydParser.PreDecContext):
        pass


    # Enter a parse tree produced by stuPydParser#simple_stmt.
    def enterSimple_stmt(self, ctx:stuPydParser.Simple_stmtContext):
        pass

    # Exit a parse tree produced by stuPydParser#simple_stmt.
    def exitSimple_stmt(self, ctx:stuPydParser.Simple_stmtContext):
        pass


    # Enter a parse tree produced by stuPydParser#small_stmt.
    def enterSmall_stmt(self, ctx:stuPydParser.Small_stmtContext):
        pass

    # Exit a parse tree produced by stuPydParser#small_stmt.
    def exitSmall_stmt(self, ctx:stuPydParser.Small_stmtContext):
        pass


    # Enter a parse tree produced by stuPydParser#compound_stmt.
    def enterCompound_stmt(self, ctx:stuPydParser.Compound_stmtContext):
        pass

    # Exit a parse tree produced by stuPydParser#compound_stmt.
    def exitCompound_stmt(self, ctx:stuPydParser.Compound_stmtContext):
        pass


    # Enter a parse tree produced by stuPydParser#GvExp.
    def enterGvExp(self, ctx:stuPydParser.GvExpContext):
        pass

    # Exit a parse tree produced by stuPydParser#GvExp.
    def exitGvExp(self, ctx:stuPydParser.GvExpContext):
        pass


    # Enter a parse tree produced by stuPydParser#GvBool.
    def enterGvBool(self, ctx:stuPydParser.GvBoolContext):
        pass

    # Exit a parse tree produced by stuPydParser#GvBool.
    def exitGvBool(self, ctx:stuPydParser.GvBoolContext):
        pass


    # Enter a parse tree produced by stuPydParser#decls.
    def enterDecls(self, ctx:stuPydParser.DeclsContext):
        pass

    # Exit a parse tree produced by stuPydParser#decls.
    def exitDecls(self, ctx:stuPydParser.DeclsContext):
        pass


    # Enter a parse tree produced by stuPydParser#decl.
    def enterDecl(self, ctx:stuPydParser.DeclContext):
        pass

    # Exit a parse tree produced by stuPydParser#decl.
    def exitDecl(self, ctx:stuPydParser.DeclContext):
        pass


    # Enter a parse tree produced by stuPydParser#vartype.
    def enterVartype(self, ctx:stuPydParser.VartypeContext):
        pass

    # Exit a parse tree produced by stuPydParser#vartype.
    def exitVartype(self, ctx:stuPydParser.VartypeContext):
        pass


    # Enter a parse tree produced by stuPydParser#tarlist.
    def enterTarlist(self, ctx:stuPydParser.TarlistContext):
        pass

    # Exit a parse tree produced by stuPydParser#tarlist.
    def exitTarlist(self, ctx:stuPydParser.TarlistContext):
        pass


    # Enter a parse tree produced by stuPydParser#Tarid.
    def enterTarid(self, ctx:stuPydParser.TaridContext):
        pass

    # Exit a parse tree produced by stuPydParser#Tarid.
    def exitTarid(self, ctx:stuPydParser.TaridContext):
        pass


    # Enter a parse tree produced by stuPydParser#TarSub.
    def enterTarSub(self, ctx:stuPydParser.TarSubContext):
        pass

    # Exit a parse tree produced by stuPydParser#TarSub.
    def exitTarSub(self, ctx:stuPydParser.TarSubContext):
        pass


    # Enter a parse tree produced by stuPydParser#Subfinal.
    def enterSubfinal(self, ctx:stuPydParser.SubfinalContext):
        pass

    # Exit a parse tree produced by stuPydParser#Subfinal.
    def exitSubfinal(self, ctx:stuPydParser.SubfinalContext):
        pass


    # Enter a parse tree produced by stuPydParser#Subsc.
    def enterSubsc(self, ctx:stuPydParser.SubscContext):
        pass

    # Exit a parse tree produced by stuPydParser#Subsc.
    def exitSubsc(self, ctx:stuPydParser.SubscContext):
        pass


    # Enter a parse tree produced by stuPydParser#Prid.
    def enterPrid(self, ctx:stuPydParser.PridContext):
        pass

    # Exit a parse tree produced by stuPydParser#Prid.
    def exitPrid(self, ctx:stuPydParser.PridContext):
        pass


    # Enter a parse tree produced by stuPydParser#Prsub.
    def enterPrsub(self, ctx:stuPydParser.PrsubContext):
        pass

    # Exit a parse tree produced by stuPydParser#Prsub.
    def exitPrsub(self, ctx:stuPydParser.PrsubContext):
        pass


    # Enter a parse tree produced by stuPydParser#Eterm.
    def enterEterm(self, ctx:stuPydParser.EtermContext):
        pass

    # Exit a parse tree produced by stuPydParser#Eterm.
    def exitEterm(self, ctx:stuPydParser.EtermContext):
        pass


    # Enter a parse tree produced by stuPydParser#Esub.
    def enterEsub(self, ctx:stuPydParser.EsubContext):
        pass

    # Exit a parse tree produced by stuPydParser#Esub.
    def exitEsub(self, ctx:stuPydParser.EsubContext):
        pass


    # Enter a parse tree produced by stuPydParser#Eadd.
    def enterEadd(self, ctx:stuPydParser.EaddContext):
        pass

    # Exit a parse tree produced by stuPydParser#Eadd.
    def exitEadd(self, ctx:stuPydParser.EaddContext):
        pass


    # Enter a parse tree produced by stuPydParser#Tunary.
    def enterTunary(self, ctx:stuPydParser.TunaryContext):
        pass

    # Exit a parse tree produced by stuPydParser#Tunary.
    def exitTunary(self, ctx:stuPydParser.TunaryContext):
        pass


    # Enter a parse tree produced by stuPydParser#Tmul.
    def enterTmul(self, ctx:stuPydParser.TmulContext):
        pass

    # Exit a parse tree produced by stuPydParser#Tmul.
    def exitTmul(self, ctx:stuPydParser.TmulContext):
        pass


    # Enter a parse tree produced by stuPydParser#Tdiv.
    def enterTdiv(self, ctx:stuPydParser.TdivContext):
        pass

    # Exit a parse tree produced by stuPydParser#Tdiv.
    def exitTdiv(self, ctx:stuPydParser.TdivContext):
        pass


    # Enter a parse tree produced by stuPydParser#Udis.
    def enterUdis(self, ctx:stuPydParser.UdisContext):
        pass

    # Exit a parse tree produced by stuPydParser#Udis.
    def exitUdis(self, ctx:stuPydParser.UdisContext):
        pass


    # Enter a parse tree produced by stuPydParser#Usqr.
    def enterUsqr(self, ctx:stuPydParser.UsqrContext):
        pass

    # Exit a parse tree produced by stuPydParser#Usqr.
    def exitUsqr(self, ctx:stuPydParser.UsqrContext):
        pass


    # Enter a parse tree produced by stuPydParser#Ufac.
    def enterUfac(self, ctx:stuPydParser.UfacContext):
        pass

    # Exit a parse tree produced by stuPydParser#Ufac.
    def exitUfac(self, ctx:stuPydParser.UfacContext):
        pass


    # Enter a parse tree produced by stuPydParser#Fnum.
    def enterFnum(self, ctx:stuPydParser.FnumContext):
        pass

    # Exit a parse tree produced by stuPydParser#Fnum.
    def exitFnum(self, ctx:stuPydParser.FnumContext):
        pass


    # Enter a parse tree produced by stuPydParser#Finc.
    def enterFinc(self, ctx:stuPydParser.FincContext):
        pass

    # Exit a parse tree produced by stuPydParser#Finc.
    def exitFinc(self, ctx:stuPydParser.FincContext):
        pass


    # Enter a parse tree produced by stuPydParser#FString.
    def enterFString(self, ctx:stuPydParser.FStringContext):
        pass

    # Exit a parse tree produced by stuPydParser#FString.
    def exitFString(self, ctx:stuPydParser.FStringContext):
        pass


    # Enter a parse tree produced by stuPydParser#Fprmy.
    def enterFprmy(self, ctx:stuPydParser.FprmyContext):
        pass

    # Exit a parse tree produced by stuPydParser#Fprmy.
    def exitFprmy(self, ctx:stuPydParser.FprmyContext):
        pass


    # Enter a parse tree produced by stuPydParser#Fbool.
    def enterFbool(self, ctx:stuPydParser.FboolContext):
        pass

    # Exit a parse tree produced by stuPydParser#Fbool.
    def exitFbool(self, ctx:stuPydParser.FboolContext):
        pass


    # Enter a parse tree produced by stuPydParser#Bor.
    def enterBor(self, ctx:stuPydParser.BorContext):
        pass

    # Exit a parse tree produced by stuPydParser#Bor.
    def exitBor(self, ctx:stuPydParser.BorContext):
        pass


    # Enter a parse tree produced by stuPydParser#Bjoin.
    def enterBjoin(self, ctx:stuPydParser.BjoinContext):
        pass

    # Exit a parse tree produced by stuPydParser#Bjoin.
    def exitBjoin(self, ctx:stuPydParser.BjoinContext):
        pass


    # Enter a parse tree produced by stuPydParser#Jeql.
    def enterJeql(self, ctx:stuPydParser.JeqlContext):
        pass

    # Exit a parse tree produced by stuPydParser#Jeql.
    def exitJeql(self, ctx:stuPydParser.JeqlContext):
        pass


    # Enter a parse tree produced by stuPydParser#Jand.
    def enterJand(self, ctx:stuPydParser.JandContext):
        pass

    # Exit a parse tree produced by stuPydParser#Jand.
    def exitJand(self, ctx:stuPydParser.JandContext):
        pass


    # Enter a parse tree produced by stuPydParser#Erel.
    def enterErel(self, ctx:stuPydParser.ErelContext):
        pass

    # Exit a parse tree produced by stuPydParser#Erel.
    def exitErel(self, ctx:stuPydParser.ErelContext):
        pass


    # Enter a parse tree produced by stuPydParser#Eeql.
    def enterEeql(self, ctx:stuPydParser.EeqlContext):
        pass

    # Exit a parse tree produced by stuPydParser#Eeql.
    def exitEeql(self, ctx:stuPydParser.EeqlContext):
        pass


    # Enter a parse tree produced by stuPydParser#Rbig.
    def enterRbig(self, ctx:stuPydParser.RbigContext):
        pass

    # Exit a parse tree produced by stuPydParser#Rbig.
    def exitRbig(self, ctx:stuPydParser.RbigContext):
        pass


    # Enter a parse tree produced by stuPydParser#Rsml.
    def enterRsml(self, ctx:stuPydParser.RsmlContext):
        pass

    # Exit a parse tree produced by stuPydParser#Rsml.
    def exitRsml(self, ctx:stuPydParser.RsmlContext):
        pass


    # Enter a parse tree produced by stuPydParser#Rbe.
    def enterRbe(self, ctx:stuPydParser.RbeContext):
        pass

    # Exit a parse tree produced by stuPydParser#Rbe.
    def exitRbe(self, ctx:stuPydParser.RbeContext):
        pass


    # Enter a parse tree produced by stuPydParser#Rse.
    def enterRse(self, ctx:stuPydParser.RseContext):
        pass

    # Exit a parse tree produced by stuPydParser#Rse.
    def exitRse(self, ctx:stuPydParser.RseContext):
        pass


    # Enter a parse tree produced by stuPydParser#Rnot.
    def enterRnot(self, ctx:stuPydParser.RnotContext):
        pass

    # Exit a parse tree produced by stuPydParser#Rnot.
    def exitRnot(self, ctx:stuPydParser.RnotContext):
        pass


    # Enter a parse tree produced by stuPydParser#Rbase.
    def enterRbase(self, ctx:stuPydParser.RbaseContext):
        pass

    # Exit a parse tree produced by stuPydParser#Rbase.
    def exitRbase(self, ctx:stuPydParser.RbaseContext):
        pass


    # Enter a parse tree produced by stuPydParser#Rprmy.
    def enterRprmy(self, ctx:stuPydParser.RprmyContext):
        pass

    # Exit a parse tree produced by stuPydParser#Rprmy.
    def exitRprmy(self, ctx:stuPydParser.RprmyContext):
        pass


    # Enter a parse tree produced by stuPydParser#Btrue.
    def enterBtrue(self, ctx:stuPydParser.BtrueContext):
        pass

    # Exit a parse tree produced by stuPydParser#Btrue.
    def exitBtrue(self, ctx:stuPydParser.BtrueContext):
        pass


    # Enter a parse tree produced by stuPydParser#Bfalse.
    def enterBfalse(self, ctx:stuPydParser.BfalseContext):
        pass

    # Exit a parse tree produced by stuPydParser#Bfalse.
    def exitBfalse(self, ctx:stuPydParser.BfalseContext):
        pass


    # Enter a parse tree produced by stuPydParser#Binc.
    def enterBinc(self, ctx:stuPydParser.BincContext):
        pass

    # Exit a parse tree produced by stuPydParser#Binc.
    def exitBinc(self, ctx:stuPydParser.BincContext):
        pass


    # Enter a parse tree produced by stuPydParser#output.
    def enterOutput(self, ctx:stuPydParser.OutputContext):
        pass

    # Exit a parse tree produced by stuPydParser#output.
    def exitOutput(self, ctx:stuPydParser.OutputContext):
        pass


    # Enter a parse tree produced by stuPydParser#while_stmt.
    def enterWhile_stmt(self, ctx:stuPydParser.While_stmtContext):
        pass

    # Exit a parse tree produced by stuPydParser#while_stmt.
    def exitWhile_stmt(self, ctx:stuPydParser.While_stmtContext):
        pass


    # Enter a parse tree produced by stuPydParser#while_judge.
    def enterWhile_judge(self, ctx:stuPydParser.While_judgeContext):
        pass

    # Exit a parse tree produced by stuPydParser#while_judge.
    def exitWhile_judge(self, ctx:stuPydParser.While_judgeContext):
        pass


    # Enter a parse tree produced by stuPydParser#if_stmt.
    def enterIf_stmt(self, ctx:stuPydParser.If_stmtContext):
        pass

    # Exit a parse tree produced by stuPydParser#if_stmt.
    def exitIf_stmt(self, ctx:stuPydParser.If_stmtContext):
        pass


    # Enter a parse tree produced by stuPydParser#if_judge.
    def enterIf_judge(self, ctx:stuPydParser.If_judgeContext):
        pass

    # Exit a parse tree produced by stuPydParser#if_judge.
    def exitIf_judge(self, ctx:stuPydParser.If_judgeContext):
        pass


    # Enter a parse tree produced by stuPydParser#isElse.
    def enterIsElse(self, ctx:stuPydParser.IsElseContext):
        pass

    # Exit a parse tree produced by stuPydParser#isElse.
    def exitIsElse(self, ctx:stuPydParser.IsElseContext):
        pass


    # Enter a parse tree produced by stuPydParser#NotElse.
    def enterNotElse(self, ctx:stuPydParser.NotElseContext):
        pass

    # Exit a parse tree produced by stuPydParser#NotElse.
    def exitNotElse(self, ctx:stuPydParser.NotElseContext):
        pass


    # Enter a parse tree produced by stuPydParser#suite.
    def enterSuite(self, ctx:stuPydParser.SuiteContext):
        pass

    # Exit a parse tree produced by stuPydParser#suite.
    def exitSuite(self, ctx:stuPydParser.SuiteContext):
        pass



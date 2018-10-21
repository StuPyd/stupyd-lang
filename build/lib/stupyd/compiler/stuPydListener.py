# Generated from /Users/muchen/python_smc/stupyd_demo_3/stuPyd.g4 by ANTLR 4.7
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .stuPydParser import stuPydParser
else:
    from stuPydParser import stuPydParser

# This class defines a complete listener for a parse tree produced by stuPydParser.
class stuPydListener(ParseTreeListener):

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


    # Enter a parse tree produced by stuPydParser#gv_stmt.
    def enterGv_stmt(self, ctx:stuPydParser.Gv_stmtContext):
        pass

    # Exit a parse tree produced by stuPydParser#gv_stmt.
    def exitGv_stmt(self, ctx:stuPydParser.Gv_stmtContext):
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


    # Enter a parse tree produced by stuPydParser#target.
    def enterTarget(self, ctx:stuPydParser.TargetContext):
        pass

    # Exit a parse tree produced by stuPydParser#target.
    def exitTarget(self, ctx:stuPydParser.TargetContext):
        pass


    # Enter a parse tree produced by stuPydParser#prmy.
    def enterPrmy(self, ctx:stuPydParser.PrmyContext):
        pass

    # Exit a parse tree produced by stuPydParser#prmy.
    def exitPrmy(self, ctx:stuPydParser.PrmyContext):
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


    # Enter a parse tree produced by stuPydParser#Unot.
    def enterUnot(self, ctx:stuPydParser.UnotContext):
        pass

    # Exit a parse tree produced by stuPydParser#Unot.
    def exitUnot(self, ctx:stuPydParser.UnotContext):
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


    # Enter a parse tree produced by stuPydParser#Ftrue.
    def enterFtrue(self, ctx:stuPydParser.FtrueContext):
        pass

    # Exit a parse tree produced by stuPydParser#Ftrue.
    def exitFtrue(self, ctx:stuPydParser.FtrueContext):
        pass


    # Enter a parse tree produced by stuPydParser#Ffalse.
    def enterFfalse(self, ctx:stuPydParser.FfalseContext):
        pass

    # Exit a parse tree produced by stuPydParser#Ffalse.
    def exitFfalse(self, ctx:stuPydParser.FfalseContext):
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


    # Enter a parse tree produced by stuPydParser#output.
    def enterOutput(self, ctx:stuPydParser.OutputContext):
        pass

    # Exit a parse tree produced by stuPydParser#output.
    def exitOutput(self, ctx:stuPydParser.OutputContext):
        pass



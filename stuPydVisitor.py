# Generated from /Users/muchen/python_smc/stupyd_demo_3/stuPyd.g4 by ANTLR 4.7
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .stuPydParser import stuPydParser
else:
    from stuPydParser import stuPydParser

# This class defines a complete generic visitor for a parse tree produced by stuPydParser.

class stuPydVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by stuPydParser#simple_stmt.
    def visitSimple_stmt(self, ctx:stuPydParser.Simple_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#small_stmt.
    def visitSmall_stmt(self, ctx:stuPydParser.Small_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#gv_stmt.
    def visitGv_stmt(self, ctx:stuPydParser.Gv_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#decls.
    def visitDecls(self, ctx:stuPydParser.DeclsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#decl.
    def visitDecl(self, ctx:stuPydParser.DeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#vartype.
    def visitVartype(self, ctx:stuPydParser.VartypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#tarlist.
    def visitTarlist(self, ctx:stuPydParser.TarlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#target.
    def visitTarget(self, ctx:stuPydParser.TargetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#prmy.
    def visitPrmy(self, ctx:stuPydParser.PrmyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#Eterm.
    def visitEterm(self, ctx:stuPydParser.EtermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#Esub.
    def visitEsub(self, ctx:stuPydParser.EsubContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#Eadd.
    def visitEadd(self, ctx:stuPydParser.EaddContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#Tunary.
    def visitTunary(self, ctx:stuPydParser.TunaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#Tmul.
    def visitTmul(self, ctx:stuPydParser.TmulContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#Tdiv.
    def visitTdiv(self, ctx:stuPydParser.TdivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#Udis.
    def visitUdis(self, ctx:stuPydParser.UdisContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#Unot.
    def visitUnot(self, ctx:stuPydParser.UnotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#Usqr.
    def visitUsqr(self, ctx:stuPydParser.UsqrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#Ufac.
    def visitUfac(self, ctx:stuPydParser.UfacContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#Fnum.
    def visitFnum(self, ctx:stuPydParser.FnumContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#Finc.
    def visitFinc(self, ctx:stuPydParser.FincContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#Ftrue.
    def visitFtrue(self, ctx:stuPydParser.FtrueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#Ffalse.
    def visitFfalse(self, ctx:stuPydParser.FfalseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#FString.
    def visitFString(self, ctx:stuPydParser.FStringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#Fprmy.
    def visitFprmy(self, ctx:stuPydParser.FprmyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by stuPydParser#output.
    def visitOutput(self, ctx:stuPydParser.OutputContext):
        return self.visitChildren(ctx)



del stuPydParser
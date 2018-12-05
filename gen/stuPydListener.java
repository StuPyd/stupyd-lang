// Generated from D:/stuPYd/stupyd_demo_4\stuPyd.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link stuPydParser}.
 */
public interface stuPydListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link stuPydParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(stuPydParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link stuPydParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(stuPydParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link stuPydParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(stuPydParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link stuPydParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(stuPydParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GvExp}
	 * labeled alternative in {@link stuPydParser#gv_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGvExp(stuPydParser.GvExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GvExp}
	 * labeled alternative in {@link stuPydParser#gv_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGvExp(stuPydParser.GvExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GvBool}
	 * labeled alternative in {@link stuPydParser#gv_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGvBool(stuPydParser.GvBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GvBool}
	 * labeled alternative in {@link stuPydParser#gv_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGvBool(stuPydParser.GvBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link stuPydParser#boolgv_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBoolgv_stmt(stuPydParser.Boolgv_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link stuPydParser#boolgv_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBoolgv_stmt(stuPydParser.Boolgv_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link stuPydParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(stuPydParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link stuPydParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(stuPydParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link stuPydParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(stuPydParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link stuPydParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(stuPydParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link stuPydParser#vartype}.
	 * @param ctx the parse tree
	 */
	void enterVartype(stuPydParser.VartypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link stuPydParser#vartype}.
	 * @param ctx the parse tree
	 */
	void exitVartype(stuPydParser.VartypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link stuPydParser#tarlist}.
	 * @param ctx the parse tree
	 */
	void enterTarlist(stuPydParser.TarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link stuPydParser#tarlist}.
	 * @param ctx the parse tree
	 */
	void exitTarlist(stuPydParser.TarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link stuPydParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(stuPydParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link stuPydParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(stuPydParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link stuPydParser#prmy}.
	 * @param ctx the parse tree
	 */
	void enterPrmy(stuPydParser.PrmyContext ctx);
	/**
	 * Exit a parse tree produced by {@link stuPydParser#prmy}.
	 * @param ctx the parse tree
	 */
	void exitPrmy(stuPydParser.PrmyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eterm}
	 * labeled alternative in {@link stuPydParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEterm(stuPydParser.EtermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eterm}
	 * labeled alternative in {@link stuPydParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEterm(stuPydParser.EtermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Esub}
	 * labeled alternative in {@link stuPydParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEsub(stuPydParser.EsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Esub}
	 * labeled alternative in {@link stuPydParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEsub(stuPydParser.EsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eadd}
	 * labeled alternative in {@link stuPydParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEadd(stuPydParser.EaddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eadd}
	 * labeled alternative in {@link stuPydParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEadd(stuPydParser.EaddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tunary}
	 * labeled alternative in {@link stuPydParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTunary(stuPydParser.TunaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tunary}
	 * labeled alternative in {@link stuPydParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTunary(stuPydParser.TunaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tmul}
	 * labeled alternative in {@link stuPydParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTmul(stuPydParser.TmulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tmul}
	 * labeled alternative in {@link stuPydParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTmul(stuPydParser.TmulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tdiv}
	 * labeled alternative in {@link stuPydParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTdiv(stuPydParser.TdivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tdiv}
	 * labeled alternative in {@link stuPydParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTdiv(stuPydParser.TdivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Udis}
	 * labeled alternative in {@link stuPydParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUdis(stuPydParser.UdisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Udis}
	 * labeled alternative in {@link stuPydParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUdis(stuPydParser.UdisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Usqr}
	 * labeled alternative in {@link stuPydParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUsqr(stuPydParser.UsqrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Usqr}
	 * labeled alternative in {@link stuPydParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUsqr(stuPydParser.UsqrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ufac}
	 * labeled alternative in {@link stuPydParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUfac(stuPydParser.UfacContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ufac}
	 * labeled alternative in {@link stuPydParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUfac(stuPydParser.UfacContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fnum}
	 * labeled alternative in {@link stuPydParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFnum(stuPydParser.FnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fnum}
	 * labeled alternative in {@link stuPydParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFnum(stuPydParser.FnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Finc}
	 * labeled alternative in {@link stuPydParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFinc(stuPydParser.FincContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Finc}
	 * labeled alternative in {@link stuPydParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFinc(stuPydParser.FincContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FString}
	 * labeled alternative in {@link stuPydParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFString(stuPydParser.FStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FString}
	 * labeled alternative in {@link stuPydParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFString(stuPydParser.FStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fprmy}
	 * labeled alternative in {@link stuPydParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFprmy(stuPydParser.FprmyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fprmy}
	 * labeled alternative in {@link stuPydParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFprmy(stuPydParser.FprmyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fbool}
	 * labeled alternative in {@link stuPydParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFbool(stuPydParser.FboolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fbool}
	 * labeled alternative in {@link stuPydParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFbool(stuPydParser.FboolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bor}
	 * labeled alternative in {@link stuPydParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBor(stuPydParser.BorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bor}
	 * labeled alternative in {@link stuPydParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBor(stuPydParser.BorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bjoin}
	 * labeled alternative in {@link stuPydParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBjoin(stuPydParser.BjoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bjoin}
	 * labeled alternative in {@link stuPydParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBjoin(stuPydParser.BjoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jeql}
	 * labeled alternative in {@link stuPydParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJeql(stuPydParser.JeqlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jeql}
	 * labeled alternative in {@link stuPydParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJeql(stuPydParser.JeqlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jand}
	 * labeled alternative in {@link stuPydParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJand(stuPydParser.JandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jand}
	 * labeled alternative in {@link stuPydParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJand(stuPydParser.JandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Erel}
	 * labeled alternative in {@link stuPydParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterErel(stuPydParser.ErelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Erel}
	 * labeled alternative in {@link stuPydParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitErel(stuPydParser.ErelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eeql}
	 * labeled alternative in {@link stuPydParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEeql(stuPydParser.EeqlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eeql}
	 * labeled alternative in {@link stuPydParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEeql(stuPydParser.EeqlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rbig}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRbig(stuPydParser.RbigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rbig}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRbig(stuPydParser.RbigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rsml}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRsml(stuPydParser.RsmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rsml}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRsml(stuPydParser.RsmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rbe}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRbe(stuPydParser.RbeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rbe}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRbe(stuPydParser.RbeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rse}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRse(stuPydParser.RseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rse}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRse(stuPydParser.RseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rnot}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRnot(stuPydParser.RnotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rnot}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRnot(stuPydParser.RnotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rbase}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRbase(stuPydParser.RbaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rbase}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRbase(stuPydParser.RbaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Btrue}
	 * labeled alternative in {@link stuPydParser#basebool}.
	 * @param ctx the parse tree
	 */
	void enterBtrue(stuPydParser.BtrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Btrue}
	 * labeled alternative in {@link stuPydParser#basebool}.
	 * @param ctx the parse tree
	 */
	void exitBtrue(stuPydParser.BtrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bfalse}
	 * labeled alternative in {@link stuPydParser#basebool}.
	 * @param ctx the parse tree
	 */
	void enterBfalse(stuPydParser.BfalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bfalse}
	 * labeled alternative in {@link stuPydParser#basebool}.
	 * @param ctx the parse tree
	 */
	void exitBfalse(stuPydParser.BfalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binc}
	 * labeled alternative in {@link stuPydParser#basebool}.
	 * @param ctx the parse tree
	 */
	void enterBinc(stuPydParser.BincContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binc}
	 * labeled alternative in {@link stuPydParser#basebool}.
	 * @param ctx the parse tree
	 */
	void exitBinc(stuPydParser.BincContext ctx);
	/**
	 * Enter a parse tree produced by {@link stuPydParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(stuPydParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link stuPydParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(stuPydParser.OutputContext ctx);
}
// Generated from D:/stuPYd/stupyd_demo_4\stuPyd.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link stuPydParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface stuPydVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link stuPydParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(stuPydParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link stuPydParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(stuPydParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GvExp}
	 * labeled alternative in {@link stuPydParser#gv_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGvExp(stuPydParser.GvExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GvBool}
	 * labeled alternative in {@link stuPydParser#gv_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGvBool(stuPydParser.GvBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link stuPydParser#boolgv_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolgv_stmt(stuPydParser.Boolgv_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link stuPydParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(stuPydParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link stuPydParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(stuPydParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link stuPydParser#vartype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVartype(stuPydParser.VartypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link stuPydParser#tarlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarlist(stuPydParser.TarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link stuPydParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(stuPydParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link stuPydParser#prmy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrmy(stuPydParser.PrmyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eterm}
	 * labeled alternative in {@link stuPydParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEterm(stuPydParser.EtermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Esub}
	 * labeled alternative in {@link stuPydParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsub(stuPydParser.EsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eadd}
	 * labeled alternative in {@link stuPydParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEadd(stuPydParser.EaddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tunary}
	 * labeled alternative in {@link stuPydParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTunary(stuPydParser.TunaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tmul}
	 * labeled alternative in {@link stuPydParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmul(stuPydParser.TmulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tdiv}
	 * labeled alternative in {@link stuPydParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTdiv(stuPydParser.TdivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Udis}
	 * labeled alternative in {@link stuPydParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdis(stuPydParser.UdisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Usqr}
	 * labeled alternative in {@link stuPydParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsqr(stuPydParser.UsqrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ufac}
	 * labeled alternative in {@link stuPydParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUfac(stuPydParser.UfacContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fnum}
	 * labeled alternative in {@link stuPydParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnum(stuPydParser.FnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Finc}
	 * labeled alternative in {@link stuPydParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinc(stuPydParser.FincContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FString}
	 * labeled alternative in {@link stuPydParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFString(stuPydParser.FStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fprmy}
	 * labeled alternative in {@link stuPydParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFprmy(stuPydParser.FprmyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fbool}
	 * labeled alternative in {@link stuPydParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFbool(stuPydParser.FboolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bor}
	 * labeled alternative in {@link stuPydParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBor(stuPydParser.BorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bjoin}
	 * labeled alternative in {@link stuPydParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBjoin(stuPydParser.BjoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Jeql}
	 * labeled alternative in {@link stuPydParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJeql(stuPydParser.JeqlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Jand}
	 * labeled alternative in {@link stuPydParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJand(stuPydParser.JandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Erel}
	 * labeled alternative in {@link stuPydParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErel(stuPydParser.ErelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eeql}
	 * labeled alternative in {@link stuPydParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEeql(stuPydParser.EeqlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rbig}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRbig(stuPydParser.RbigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rsml}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRsml(stuPydParser.RsmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rbe}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRbe(stuPydParser.RbeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rse}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRse(stuPydParser.RseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rnot}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRnot(stuPydParser.RnotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rbase}
	 * labeled alternative in {@link stuPydParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRbase(stuPydParser.RbaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Btrue}
	 * labeled alternative in {@link stuPydParser#basebool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBtrue(stuPydParser.BtrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bfalse}
	 * labeled alternative in {@link stuPydParser#basebool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfalse(stuPydParser.BfalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Binc}
	 * labeled alternative in {@link stuPydParser#basebool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinc(stuPydParser.BincContext ctx);
	/**
	 * Visit a parse tree produced by {@link stuPydParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(stuPydParser.OutputContext ctx);
}
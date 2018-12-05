// Generated from D:/stuPYd/stupyd_demo_4\stuPyd.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class stuPydParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, NUMBER=27, INDENT=28, NEWLINE=29, ID=30, INT=31, FLOAT=32, 
		STRING=33, CHAR=34, BLANK=35;
	public static final int
		RULE_simple_stmt = 0, RULE_small_stmt = 1, RULE_gv_stmt = 2, RULE_boolgv_stmt = 3, 
		RULE_decls = 4, RULE_decl = 5, RULE_vartype = 6, RULE_tarlist = 7, RULE_target = 8, 
		RULE_prmy = 9, RULE_expr = 10, RULE_term = 11, RULE_unary = 12, RULE_factor = 13, 
		RULE_bool = 14, RULE_join = 15, RULE_equality = 16, RULE_rel = 17, RULE_basebool = 18, 
		RULE_output = 19;
	public static final String[] ruleNames = {
		"simple_stmt", "small_stmt", "gv_stmt", "boolgv_stmt", "decls", "decl", 
		"vartype", "tarlist", "target", "prmy", "expr", "term", "unary", "factor", 
		"bool", "join", "equality", "rel", "basebool", "output"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'->'", "'int'", "'real'", "'bool'", "'string'", "'void'", "'struct'", 
		"','", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'|'", "'&'", 
		"'='", "'>'", "'<'", "'>='", "'<='", "'!'", "'TRUE'", "'FALSE'", "'print'", 
		null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "NUMBER", "INDENT", "NEWLINE", "ID", "INT", "FLOAT", 
		"STRING", "CHAR", "BLANK"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "stuPyd.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public stuPydParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Simple_stmtContext extends ParserRuleContext {
		public List<Small_stmtContext> small_stmt() {
			return getRuleContexts(Small_stmtContext.class);
		}
		public Small_stmtContext small_stmt(int i) {
			return getRuleContext(Small_stmtContext.class,i);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_simple_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				small_stmt();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__13) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << NUMBER) | (1L << NEWLINE) | (1L << ID) | (1L << STRING))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Small_stmtContext extends ParserRuleContext {
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public Gv_stmtContext gv_stmt() {
			return getRuleContext(Gv_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(stuPydParser.NEWLINE, 0); }
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterSmall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitSmall_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitSmall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_small_stmt);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				decls();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				gv_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				output();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Gv_stmtContext extends ParserRuleContext {
		public Gv_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gv_stmt; }
	 
		public Gv_stmtContext() { }
		public void copyFrom(Gv_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GvExpContext extends Gv_stmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrmyContext prmy() {
			return getRuleContext(PrmyContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(stuPydParser.NEWLINE, 0); }
		public GvExpContext(Gv_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterGvExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitGvExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitGvExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GvBoolContext extends Gv_stmtContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public PrmyContext prmy() {
			return getRuleContext(PrmyContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(stuPydParser.NEWLINE, 0); }
		public GvBoolContext(Gv_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterGvBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitGvBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitGvBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gv_stmtContext gv_stmt() throws RecognitionException {
		Gv_stmtContext _localctx = new Gv_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_gv_stmt);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new GvExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				expr(0);
				setState(53);
				match(T__0);
				setState(54);
				prmy();
				setState(55);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new GvBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				bool(0);
				setState(58);
				match(T__0);
				setState(59);
				prmy();
				setState(60);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolgv_stmtContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public PrmyContext prmy() {
			return getRuleContext(PrmyContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(stuPydParser.NEWLINE, 0); }
		public Boolgv_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolgv_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterBoolgv_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitBoolgv_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitBoolgv_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolgv_stmtContext boolgv_stmt() throws RecognitionException {
		Boolgv_stmtContext _localctx = new Boolgv_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_boolgv_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			bool(0);
			setState(65);
			match(T__0);
			setState(66);
			prmy();
			setState(67);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclsContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(69);
					decl();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(72); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
		}
		public TarlistContext tarlist() {
			return getRuleContext(TarlistContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(stuPydParser.NEWLINE, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			vartype();
			setState(75);
			tarlist();
			setState(76);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VartypeContext extends ParserRuleContext {
		public VartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vartype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterVartype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitVartype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitVartype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VartypeContext vartype() throws RecognitionException {
		VartypeContext _localctx = new VartypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TarlistContext extends ParserRuleContext {
		public List<TargetContext> target() {
			return getRuleContexts(TargetContext.class);
		}
		public TargetContext target(int i) {
			return getRuleContext(TargetContext.class,i);
		}
		public TarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tarlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterTarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitTarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitTarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TarlistContext tarlist() throws RecognitionException {
		TarlistContext _localctx = new TarlistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tarlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			target();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(81);
				match(T__7);
				setState(82);
				target();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(stuPydParser.ID, 0); }
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ID);


				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrmyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(stuPydParser.ID, 0); }
		public PrmyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prmy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterPrmy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitPrmy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitPrmy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrmyContext prmy() throws RecognitionException {
		PrmyContext _localctx = new PrmyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prmy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EtermContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EtermContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterEterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitEterm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitEterm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EsubContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EsubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterEsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitEsub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitEsub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EaddContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EaddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterEadd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitEadd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitEadd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EtermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(96);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(104);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new EaddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(99);
						match(T__8);
						setState(100);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new EsubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(102);
						match(T__9);
						setState(103);
						term(0);
						}
						break;
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TunaryContext extends TermContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TunaryContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterTunary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitTunary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitTunary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TmulContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TmulContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterTmul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitTmul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitTmul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TdivContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TdivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterTdiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitTdiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitTdiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TunaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(110);
			unary(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new TmulContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(112);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(113);
						match(T__10);
						setState(114);
						unary(0);
						}
						break;
					case 2:
						{
						_localctx = new TdivContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(115);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(116);
						match(T__11);
						setState(117);
						unary(0);
						}
						break;
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	 
		public UnaryContext() { }
		public void copyFrom(UnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UdisContext extends UnaryContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public UdisContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterUdis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitUdis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitUdis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UsqrContext extends UnaryContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UsqrContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterUsqr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitUsqr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitUsqr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UfacContext extends UnaryContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UfacContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterUfac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitUfac(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitUfac(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		return unary(0);
	}

	private UnaryContext unary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnaryContext _localctx = new UnaryContext(_ctx, _parentState);
		UnaryContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_unary, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				_localctx = new UdisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(124);
				match(T__9);
				setState(125);
				unary(3);
				}
				break;
			case T__13:
			case NUMBER:
			case ID:
			case STRING:
				{
				_localctx = new UfacContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UsqrContext(new UnaryContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_unary);
					setState(129);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(130);
					match(T__12);
					setState(131);
					factor();
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FnumContext extends FactorContext {
		public TerminalNode NUMBER() { return getToken(stuPydParser.NUMBER, 0); }
		public FnumContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterFnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitFnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitFnum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FboolContext extends FactorContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public FboolContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterFbool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitFbool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitFbool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FincContext extends FactorContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FincContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterFinc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitFinc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitFinc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FStringContext extends FactorContext {
		public TerminalNode STRING() { return getToken(stuPydParser.STRING, 0); }
		public FStringContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterFString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitFString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitFString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FprmyContext extends FactorContext {
		public PrmyContext prmy() {
			return getRuleContext(PrmyContext.class,0);
		}
		public FprmyContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterFprmy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitFprmy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitFprmy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_factor);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new FnumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(NUMBER);
				}
				break;
			case 2:
				_localctx = new FincContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__13);
				setState(139);
				expr(0);
				setState(140);
				match(T__14);
				}
				break;
			case 3:
				_localctx = new FStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new FprmyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				prmy();
				}
				break;
			case 5:
				_localctx = new FboolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(T__13);
				setState(145);
				bool(0);
				setState(146);
				match(T__14);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BorContext extends BoolContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public BorContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterBor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitBor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitBor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BjoinContext extends BoolContext {
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public BjoinContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterBjoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitBjoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitBjoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		return bool(0);
	}

	private BoolContext bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolContext _localctx = new BoolContext(_ctx, _parentState);
		BoolContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_bool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BjoinContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(151);
			join(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BorContext(new BoolContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bool);
					setState(153);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(154);
					match(T__15);
					setState(155);
					join(0);
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinContext extends ParserRuleContext {
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
	 
		public JoinContext() { }
		public void copyFrom(JoinContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JeqlContext extends JoinContext {
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public JeqlContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterJeql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitJeql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitJeql(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JandContext extends JoinContext {
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public JandContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterJand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitJand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitJand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		return join(0);
	}

	private JoinContext join(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JoinContext _localctx = new JoinContext(_ctx, _parentState);
		JoinContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_join, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JeqlContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(162);
			equality(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JandContext(new JoinContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_join);
					setState(164);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(165);
					match(T__16);
					setState(166);
					equality(0);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityContext extends ParserRuleContext {
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
	 
		public EqualityContext() { }
		public void copyFrom(EqualityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErelContext extends EqualityContext {
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public ErelContext(EqualityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterErel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitErel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitErel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EeqlContext extends EqualityContext {
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public EeqlContext(EqualityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterEeql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitEeql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitEeql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		return equality(0);
	}

	private EqualityContext equality(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityContext _localctx = new EqualityContext(_ctx, _parentState);
		EqualityContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_equality, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ErelContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(173);
			rel();
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EeqlContext(new EqualityContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_equality);
					setState(175);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(176);
					match(T__17);
					setState(177);
					rel();
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelContext extends ParserRuleContext {
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
	 
		public RelContext() { }
		public void copyFrom(RelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RbaseContext extends RelContext {
		public BaseboolContext basebool() {
			return getRuleContext(BaseboolContext.class,0);
		}
		public RbaseContext(RelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterRbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitRbase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitRbase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RbeContext extends RelContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RbeContext(RelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterRbe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitRbe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitRbe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RseContext extends RelContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RseContext(RelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterRse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitRse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitRse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RsmlContext extends RelContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RsmlContext(RelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterRsml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitRsml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitRsml(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RnotContext extends RelContext {
		public BaseboolContext basebool() {
			return getRuleContext(BaseboolContext.class,0);
		}
		public RnotContext(RelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterRnot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitRnot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitRnot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RbigContext extends RelContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RbigContext(RelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterRbig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitRbig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitRbig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rel);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new RbigContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				expr(0);
				setState(184);
				match(T__18);
				setState(185);
				expr(0);
				}
				break;
			case 2:
				_localctx = new RsmlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				expr(0);
				setState(188);
				match(T__19);
				setState(189);
				expr(0);
				}
				break;
			case 3:
				_localctx = new RbeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				expr(0);
				setState(192);
				match(T__20);
				setState(193);
				expr(0);
				}
				break;
			case 4:
				_localctx = new RseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				expr(0);
				setState(196);
				match(T__21);
				setState(197);
				expr(0);
				}
				break;
			case 5:
				_localctx = new RnotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				match(T__22);
				setState(200);
				basebool();
				}
				break;
			case 6:
				_localctx = new RbaseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				basebool();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseboolContext extends ParserRuleContext {
		public BaseboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basebool; }
	 
		public BaseboolContext() { }
		public void copyFrom(BaseboolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BincContext extends BaseboolContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BincContext(BaseboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterBinc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitBinc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitBinc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BtrueContext extends BaseboolContext {
		public BtrueContext(BaseboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterBtrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitBtrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitBtrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BfalseContext extends BaseboolContext {
		public BfalseContext(BaseboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterBfalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitBfalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitBfalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseboolContext basebool() throws RecognitionException {
		BaseboolContext _localctx = new BaseboolContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_basebool);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				_localctx = new BtrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new BfalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__24);
				}
				break;
			case T__13:
				_localctx = new BincContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(T__13);
				setState(207);
				bool(0);
				setState(208);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(stuPydParser.ID, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stuPydListener ) ((stuPydListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stuPydVisitor ) return ((stuPydVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__25);
			setState(213);
			match(T__13);
			setState(214);
			match(ID);
			setState(215);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 11:
			return term_sempred((TermContext)_localctx, predIndex);
		case 12:
			return unary_sempred((UnaryContext)_localctx, predIndex);
		case 14:
			return bool_sempred((BoolContext)_localctx, predIndex);
		case 15:
			return join_sempred((JoinContext)_localctx, predIndex);
		case 16:
			return equality_sempred((EqualityContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean unary_sempred(UnaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bool_sempred(BoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean join_sempred(JoinContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean equality_sempred(EqualityContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\65\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\6\6I\n\6\r\6\16\6J\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\7\tV\n\t\f\t\16\tY\13\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\fk\n\f\f\f\16\fn\13\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\ry\n\r\f\r\16\r|\13\r\3\16\3\16\3\16\3\16\5\16\u0082"+
		"\n\16\3\16\3\16\3\16\7\16\u0087\n\16\f\16\16\16\u008a\13\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0097\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u009f\n\20\f\20\16\20\u00a2\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u00aa\n\21\f\21\16\21\u00ad\13\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u00b5\n\22\f\22\16\22\u00b8\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00cd\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d5"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\2\b\26\30\32\36 \"\26\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(\2\3\3\2\4\t\2\u00e3\2+\3\2\2\2\4\64"+
		"\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\nH\3\2\2\2\fL\3\2\2\2\16P\3\2\2\2\20R\3"+
		"\2\2\2\22\\\3\2\2\2\24_\3\2\2\2\26a\3\2\2\2\30o\3\2\2\2\32\u0081\3\2\2"+
		"\2\34\u0096\3\2\2\2\36\u0098\3\2\2\2 \u00a3\3\2\2\2\"\u00ae\3\2\2\2$\u00cc"+
		"\3\2\2\2&\u00d4\3\2\2\2(\u00d6\3\2\2\2*,\5\4\3\2+*\3\2\2\2,-\3\2\2\2-"+
		"+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/\65\5\n\6\2\60\65\5\6\4\2\61\65\5\26\f"+
		"\2\62\65\5(\25\2\63\65\7\37\2\2\64/\3\2\2\2\64\60\3\2\2\2\64\61\3\2\2"+
		"\2\64\62\3\2\2\2\64\63\3\2\2\2\65\5\3\2\2\2\66\67\5\26\f\2\678\7\3\2\2"+
		"89\5\24\13\29:\7\37\2\2:A\3\2\2\2;<\5\36\20\2<=\7\3\2\2=>\5\24\13\2>?"+
		"\7\37\2\2?A\3\2\2\2@\66\3\2\2\2@;\3\2\2\2A\7\3\2\2\2BC\5\36\20\2CD\7\3"+
		"\2\2DE\5\24\13\2EF\7\37\2\2F\t\3\2\2\2GI\5\f\7\2HG\3\2\2\2IJ\3\2\2\2J"+
		"H\3\2\2\2JK\3\2\2\2K\13\3\2\2\2LM\5\16\b\2MN\5\20\t\2NO\7\37\2\2O\r\3"+
		"\2\2\2PQ\t\2\2\2Q\17\3\2\2\2RW\5\22\n\2ST\7\n\2\2TV\5\22\n\2US\3\2\2\2"+
		"VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\b\t\1\2[\21\3\2\2"+
		"\2\\]\7 \2\2]^\b\n\1\2^\23\3\2\2\2_`\7 \2\2`\25\3\2\2\2ab\b\f\1\2bc\5"+
		"\30\r\2cl\3\2\2\2de\f\5\2\2ef\7\13\2\2fk\5\30\r\2gh\f\4\2\2hi\7\f\2\2"+
		"ik\5\30\r\2jd\3\2\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\27\3\2"+
		"\2\2nl\3\2\2\2op\b\r\1\2pq\5\32\16\2qz\3\2\2\2rs\f\5\2\2st\7\r\2\2ty\5"+
		"\32\16\2uv\f\4\2\2vw\7\16\2\2wy\5\32\16\2xr\3\2\2\2xu\3\2\2\2y|\3\2\2"+
		"\2zx\3\2\2\2z{\3\2\2\2{\31\3\2\2\2|z\3\2\2\2}~\b\16\1\2~\177\7\f\2\2\177"+
		"\u0082\5\32\16\5\u0080\u0082\5\34\17\2\u0081}\3\2\2\2\u0081\u0080\3\2"+
		"\2\2\u0082\u0088\3\2\2\2\u0083\u0084\f\4\2\2\u0084\u0085\7\17\2\2\u0085"+
		"\u0087\5\34\17\2\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\33\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u0097\7\35\2\2\u008c\u008d\7\20\2\2\u008d\u008e\5\26\f\2\u008e\u008f"+
		"\7\21\2\2\u008f\u0097\3\2\2\2\u0090\u0097\7#\2\2\u0091\u0097\5\24\13\2"+
		"\u0092\u0093\7\20\2\2\u0093\u0094\5\36\20\2\u0094\u0095\7\21\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u008b\3\2\2\2\u0096\u008c\3\2\2\2\u0096\u0090\3\2"+
		"\2\2\u0096\u0091\3\2\2\2\u0096\u0092\3\2\2\2\u0097\35\3\2\2\2\u0098\u0099"+
		"\b\20\1\2\u0099\u009a\5 \21\2\u009a\u00a0\3\2\2\2\u009b\u009c\f\4\2\2"+
		"\u009c\u009d\7\22\2\2\u009d\u009f\5 \21\2\u009e\u009b\3\2\2\2\u009f\u00a2"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\37\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a4\b\21\1\2\u00a4\u00a5\5\"\22\2\u00a5\u00ab\3"+
		"\2\2\2\u00a6\u00a7\f\4\2\2\u00a7\u00a8\7\23\2\2\u00a8\u00aa\5\"\22\2\u00a9"+
		"\u00a6\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac!\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\b\22\1\2\u00af\u00b0"+
		"\5$\23\2\u00b0\u00b6\3\2\2\2\u00b1\u00b2\f\4\2\2\u00b2\u00b3\7\24\2\2"+
		"\u00b3\u00b5\5$\23\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7#\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00ba\5\26\f\2\u00ba\u00bb\7\25\2\2\u00bb\u00bc\5\26\f\2\u00bc\u00cd"+
		"\3\2\2\2\u00bd\u00be\5\26\f\2\u00be\u00bf\7\26\2\2\u00bf\u00c0\5\26\f"+
		"\2\u00c0\u00cd\3\2\2\2\u00c1\u00c2\5\26\f\2\u00c2\u00c3\7\27\2\2\u00c3"+
		"\u00c4\5\26\f\2\u00c4\u00cd\3\2\2\2\u00c5\u00c6\5\26\f\2\u00c6\u00c7\7"+
		"\30\2\2\u00c7\u00c8\5\26\f\2\u00c8\u00cd\3\2\2\2\u00c9\u00ca\7\31\2\2"+
		"\u00ca\u00cd\5&\24\2\u00cb\u00cd\5&\24\2\u00cc\u00b9\3\2\2\2\u00cc\u00bd"+
		"\3\2\2\2\u00cc\u00c1\3\2\2\2\u00cc\u00c5\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd%\3\2\2\2\u00ce\u00d5\7\32\2\2\u00cf\u00d5\7\33\2"+
		"\2\u00d0\u00d1\7\20\2\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\7\21\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2"+
		"\2\2\u00d5\'\3\2\2\2\u00d6\u00d7\7\34\2\2\u00d7\u00d8\7\20\2\2\u00d8\u00d9"+
		"\7 \2\2\u00d9\u00da\7\21\2\2\u00da)\3\2\2\2\23-\64@JWjlxz\u0081\u0088"+
		"\u0096\u00a0\u00ab\u00b6\u00cc\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
package gen;// Generated from /home/sadegh/Projects/cool-lang/res/Cool.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, UnaryOperator=27, BinaryOperator=28, BoolLiteral=29, 
		IntLiteral=30, StringLiteral=31, Identifier=32, TypeIdentifier=33, MultilineComment=34, 
		SingleLineComment=35, Whitespace=36;
	public static final int
		RULE_program = 0, RULE_classDefinition = 1, RULE_methodDefinition = 2, 
		RULE_fieldDeclaration = 3, RULE_parameterDeclaration = 4, RULE_expr = 5, 
		RULE_statements = 6, RULE_conditional_statement = 7, RULE_while_loop_statement = 8, 
		RULE_let_in_statement = 9, RULE_let_expr = 10, RULE_case_of_statement = 11, 
		RULE_literals = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDefinition", "methodDefinition", "fieldDeclaration", 
			"parameterDeclaration", "expr", "statements", "conditional_statement", 
			"while_loop_statement", "let_in_statement", "let_expr", "case_of_statement", 
			"literals"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'inherits'", "'{'", "'}'", "';'", "'('", "','", "')'", 
			"':'", "'<-'", "'@'", "'.'", "'new'", "'if'", "'then'", "'else'", "'fi'", 
			"'while'", "'loop'", "'pool'", "'in'", "'let'", "'case'", "'of'", "'=>'", 
			"'esac'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "UnaryOperator", "BinaryOperator", "BoolLiteral", "IntLiteral", 
			"StringLiteral", "Identifier", "TypeIdentifier", "MultilineComment", 
			"SingleLineComment", "Whitespace"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Cool.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CoolParser.EOF, 0); }
		public List<ClassDefinitionContext> classDefinition() {
			return getRuleContexts(ClassDefinitionContext.class);
		}
		public ClassDefinitionContext classDefinition(int i) {
			return getRuleContext(ClassDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				classDefinition();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(31);
			match(EOF);
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

	public static class ClassDefinitionContext extends ParserRuleContext {
		public Token className;
		public Token parentName;
		public List<TerminalNode> TypeIdentifier() { return getTokens(CoolParser.TypeIdentifier); }
		public TerminalNode TypeIdentifier(int i) {
			return getToken(CoolParser.TypeIdentifier, i);
		}
		public List<MethodDefinitionContext> methodDefinition() {
			return getRuleContexts(MethodDefinitionContext.class);
		}
		public MethodDefinitionContext methodDefinition(int i) {
			return getRuleContext(MethodDefinitionContext.class,i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__0);
			setState(34);
			((ClassDefinitionContext)_localctx).className = match(TypeIdentifier);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(35);
				match(T__1);
				setState(36);
				((ClassDefinitionContext)_localctx).parentName = match(TypeIdentifier);
				}
			}

			setState(39);
			match(T__2);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(40);
					methodDefinition();
					}
					break;
				case 2:
					{
					setState(41);
					fieldDeclaration();
					}
					break;
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(T__3);
			setState(48);
			match(T__4);
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

	public static class MethodDefinitionContext extends ParserRuleContext {
		public Token methodName;
		public ParameterDeclarationContext parameters;
		public Token returnType;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CoolParser.Identifier, 0); }
		public TerminalNode TypeIdentifier() { return getToken(CoolParser.TypeIdentifier, 0); }
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((MethodDefinitionContext)_localctx).methodName = match(Identifier);
			setState(51);
			match(T__5);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(52);
				((MethodDefinitionContext)_localctx).parameters = parameterDeclaration();
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(53);
					match(T__6);
					setState(54);
					parameterDeclaration();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(62);
			match(T__7);
			setState(63);
			match(T__8);
			setState(64);
			((MethodDefinitionContext)_localctx).returnType = match(TypeIdentifier);
			setState(65);
			match(T__2);
			setState(66);
			expr(0);
			setState(67);
			match(T__3);
			setState(68);
			match(T__4);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public Token fieldName;
		public Token fieldType;
		public TerminalNode Identifier() { return getToken(CoolParser.Identifier, 0); }
		public TerminalNode TypeIdentifier() { return getToken(CoolParser.TypeIdentifier, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			((FieldDeclarationContext)_localctx).fieldName = match(Identifier);
			setState(71);
			match(T__8);
			setState(72);
			((FieldDeclarationContext)_localctx).fieldType = match(TypeIdentifier);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(73);
				match(T__9);
				setState(74);
				expr(0);
				}
			}

			setState(77);
			match(T__4);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public Token parameterName;
		public Token parameterType;
		public TerminalNode Identifier() { return getToken(CoolParser.Identifier, 0); }
		public TerminalNode TypeIdentifier() { return getToken(CoolParser.TypeIdentifier, 0); }
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((ParameterDeclarationContext)_localctx).parameterName = match(Identifier);
			setState(80);
			match(T__8);
			setState(81);
			((ParameterDeclarationContext)_localctx).parameterType = match(TypeIdentifier);
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
	public static class VariableAccessContext extends ExprContext {
		public TerminalNode Identifier() { return getToken(CoolParser.Identifier, 0); }
		public VariableAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterVariableAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitVariableAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitVariableAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableAssignmentContext extends ExprContext {
		public TerminalNode Identifier() { return getToken(CoolParser.Identifier, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableAssignmentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementContext extends ExprContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryOperationContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BinaryOperator() { return getToken(CoolParser.BinaryOperator, 0); }
		public BinaryOperationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterBinaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitBinaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitBinaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOperationContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode UnaryOperator() { return getToken(CoolParser.UnaryOperator, 0); }
		public UnaryOperationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralContext extends ExprContext {
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public LiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstantiationContext extends ExprContext {
		public TerminalNode TypeIdentifier() { return getToken(CoolParser.TypeIdentifier, 0); }
		public InstantiationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(CoolParser.Identifier, 0); }
		public TerminalNode TypeIdentifier() { return getToken(CoolParser.TypeIdentifier, 0); }
		public MethodCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitMethodCall(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(84);
				match(T__2);
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(85);
					expr(0);
					setState(86);
					match(T__4);
					}
					}
					setState(90); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__21) | (1L << T__22) | (1L << UnaryOperator) | (1L << BoolLiteral) | (1L << IntLiteral) | (1L << StringLiteral) | (1L << Identifier))) != 0) );
				setState(92);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				literals();
				}
				break;
			case 3:
				{
				_localctx = new StatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				statements();
				}
				break;
			case 4:
				{
				_localctx = new UnaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				((UnaryOperationContext)_localctx).op = match(UnaryOperator);
				setState(97);
				expr(6);
				}
				break;
			case 5:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(T__5);
				setState(99);
				expr(0);
				setState(100);
				match(T__7);
				}
				break;
			case 6:
				{
				_localctx = new VariableAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(Identifier);
				}
				break;
			case 7:
				{
				_localctx = new VariableAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(Identifier);
				setState(104);
				match(T__9);
				setState(105);
				expr(2);
				}
				break;
			case 8:
				{
				_localctx = new InstantiationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(T__12);
				setState(107);
				match(TypeIdentifier);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOperationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(111);
						((BinaryOperationContext)_localctx).op = match(BinaryOperator);
						setState(112);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new MethodCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(119);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__10 || _la==T__11) {
							{
							setState(116);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__10) {
								{
								setState(114);
								match(T__10);
								setState(115);
								match(TypeIdentifier);
								}
							}

							setState(118);
							match(T__11);
							}
						}

						setState(121);
						match(Identifier);
						setState(122);
						match(T__5);
						setState(131);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__21) | (1L << T__22) | (1L << UnaryOperator) | (1L << BoolLiteral) | (1L << IntLiteral) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
							{
							setState(123);
							expr(0);
							setState(128);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__6) {
								{
								{
								setState(124);
								match(T__6);
								setState(125);
								expr(0);
								}
								}
								setState(130);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(133);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(138);
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

	public static class StatementsContext extends ParserRuleContext {
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public While_loop_statementContext while_loop_statement() {
			return getRuleContext(While_loop_statementContext.class,0);
		}
		public Let_in_statementContext let_in_statement() {
			return getRuleContext(Let_in_statementContext.class,0);
		}
		public Case_of_statementContext case_of_statement() {
			return getRuleContext(Case_of_statementContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				conditional_statement();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				while_loop_statement();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				let_in_statement();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				case_of_statement();
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

	public static class Conditional_statementContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterConditional_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitConditional_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitConditional_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditional_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__13);
			setState(146);
			expr(0);
			setState(147);
			match(T__14);
			setState(148);
			expr(0);
			setState(149);
			match(T__15);
			setState(150);
			expr(0);
			setState(151);
			match(T__16);
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

	public static class While_loop_statementContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public While_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterWhile_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitWhile_loop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitWhile_loop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loop_statementContext while_loop_statement() throws RecognitionException {
		While_loop_statementContext _localctx = new While_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__17);
			setState(154);
			expr(0);
			setState(155);
			match(T__18);
			setState(156);
			expr(0);
			setState(157);
			match(T__19);
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

	public static class Let_in_statementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Let_exprContext> let_expr() {
			return getRuleContexts(Let_exprContext.class);
		}
		public Let_exprContext let_expr(int i) {
			return getRuleContext(Let_exprContext.class,i);
		}
		public Let_in_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_in_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterLet_in_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitLet_in_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitLet_in_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_in_statementContext let_in_statement() throws RecognitionException {
		Let_in_statementContext _localctx = new Let_in_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_let_in_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				let_expr();
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__21 );
			setState(164);
			match(T__20);
			setState(165);
			expr(0);
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

	public static class Let_exprContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CoolParser.Identifier, 0); }
		public TerminalNode TypeIdentifier() { return getToken(CoolParser.TypeIdentifier, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Let_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterLet_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitLet_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitLet_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_exprContext let_expr() throws RecognitionException {
		Let_exprContext _localctx = new Let_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_let_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__21);
			setState(168);
			match(Identifier);
			setState(169);
			match(T__8);
			setState(170);
			match(TypeIdentifier);
			{
			setState(171);
			match(T__9);
			setState(172);
			expr(0);
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

	public static class Case_of_statementContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CoolParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CoolParser.Identifier, i);
		}
		public List<TerminalNode> TypeIdentifier() { return getTokens(CoolParser.TypeIdentifier); }
		public TerminalNode TypeIdentifier(int i) {
			return getToken(CoolParser.TypeIdentifier, i);
		}
		public Case_of_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_of_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterCase_of_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitCase_of_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitCase_of_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_of_statementContext case_of_statement() throws RecognitionException {
		Case_of_statementContext _localctx = new Case_of_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_case_of_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__22);
			setState(175);
			expr(0);
			setState(176);
			match(T__23);
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177);
				match(Identifier);
				setState(178);
				match(T__8);
				setState(179);
				match(TypeIdentifier);
				setState(180);
				match(T__24);
				setState(181);
				expr(0);
				setState(182);
				match(T__4);
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(188);
			match(T__25);
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

	public static class LiteralsContext extends ParserRuleContext {
		public TerminalNode BoolLiteral() { return getToken(CoolParser.BoolLiteral, 0); }
		public TerminalNode IntLiteral() { return getToken(CoolParser.IntLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(CoolParser.StringLiteral, 0); }
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BoolLiteral) | (1L << IntLiteral) | (1L << StringLiteral))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\5\3(\n\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\5\4?\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\6\7[\n\7\r\7\16\7\\\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7w\n\7\3\7\5\7z\n\7\3\7\3\7\3\7\3\7\3\7\7\7\u0081\n\7\f\7\16\7\u0084"+
		"\13\7\5\7\u0086\n\7\3\7\7\7\u0089\n\7\f\7\16\7\u008c\13\7\3\b\3\b\3\b"+
		"\3\b\5\b\u0092\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\6\13\u00a3\n\13\r\13\16\13\u00a4\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00bb\n\r"+
		"\r\r\16\r\u00bc\3\r\3\r\3\16\3\16\3\16\2\3\f\17\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\2\3\3\2\37!\2\u00cf\2\35\3\2\2\2\4#\3\2\2\2\6\64\3\2\2\2\bH"+
		"\3\2\2\2\nQ\3\2\2\2\fn\3\2\2\2\16\u0091\3\2\2\2\20\u0093\3\2\2\2\22\u009b"+
		"\3\2\2\2\24\u00a2\3\2\2\2\26\u00a9\3\2\2\2\30\u00b0\3\2\2\2\32\u00c0\3"+
		"\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2"+
		"\2\2 !\3\2\2\2!\"\7\2\2\3\"\3\3\2\2\2#$\7\3\2\2$\'\7#\2\2%&\7\4\2\2&("+
		"\7#\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2).\7\5\2\2*-\5\6\4\2+-\5\b\5\2"+
		",*\3\2\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3"+
		"\2\2\2\61\62\7\6\2\2\62\63\7\7\2\2\63\5\3\2\2\2\64\65\7\"\2\2\65>\7\b"+
		"\2\2\66;\5\n\6\2\678\7\t\2\28:\5\n\6\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2"+
		";<\3\2\2\2<?\3\2\2\2=;\3\2\2\2>\66\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\n\2"+
		"\2AB\7\13\2\2BC\7#\2\2CD\7\5\2\2DE\5\f\7\2EF\7\6\2\2FG\7\7\2\2G\7\3\2"+
		"\2\2HI\7\"\2\2IJ\7\13\2\2JM\7#\2\2KL\7\f\2\2LN\5\f\7\2MK\3\2\2\2MN\3\2"+
		"\2\2NO\3\2\2\2OP\7\7\2\2P\t\3\2\2\2QR\7\"\2\2RS\7\13\2\2ST\7#\2\2T\13"+
		"\3\2\2\2UV\b\7\1\2VZ\7\5\2\2WX\5\f\7\2XY\7\7\2\2Y[\3\2\2\2ZW\3\2\2\2["+
		"\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\6\2\2_o\3\2\2\2`o\5\32"+
		"\16\2ao\5\16\b\2bc\7\35\2\2co\5\f\7\bde\7\b\2\2ef\5\f\7\2fg\7\n\2\2go"+
		"\3\2\2\2ho\7\"\2\2ij\7\"\2\2jk\7\f\2\2ko\5\f\7\4lm\7\17\2\2mo\7#\2\2n"+
		"U\3\2\2\2n`\3\2\2\2na\3\2\2\2nb\3\2\2\2nd\3\2\2\2nh\3\2\2\2ni\3\2\2\2"+
		"nl\3\2\2\2o\u008a\3\2\2\2pq\f\7\2\2qr\7\36\2\2r\u0089\5\f\7\bsy\f\f\2"+
		"\2tu\7\r\2\2uw\7#\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xz\7\16\2\2yv\3\2\2"+
		"\2yz\3\2\2\2z{\3\2\2\2{|\7\"\2\2|\u0085\7\b\2\2}\u0082\5\f\7\2~\177\7"+
		"\t\2\2\177\u0081\5\f\7\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"}\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\7\n\2\2"+
		"\u0088p\3\2\2\2\u0088s\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\r\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0092\5"+
		"\20\t\2\u008e\u0092\5\22\n\2\u008f\u0092\5\24\13\2\u0090\u0092\5\30\r"+
		"\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\17\3\2\2\2\u0093\u0094\7\20\2\2\u0094\u0095\5\f\7\2\u0095"+
		"\u0096\7\21\2\2\u0096\u0097\5\f\7\2\u0097\u0098\7\22\2\2\u0098\u0099\5"+
		"\f\7\2\u0099\u009a\7\23\2\2\u009a\21\3\2\2\2\u009b\u009c\7\24\2\2\u009c"+
		"\u009d\5\f\7\2\u009d\u009e\7\25\2\2\u009e\u009f\5\f\7\2\u009f\u00a0\7"+
		"\26\2\2\u00a0\23\3\2\2\2\u00a1\u00a3\5\26\f\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\7\27\2\2\u00a7\u00a8\5\f\7\2\u00a8\25\3\2\2\2\u00a9\u00aa"+
		"\7\30\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7\13\2\2\u00ac\u00ad\7#\2\2"+
		"\u00ad\u00ae\7\f\2\2\u00ae\u00af\5\f\7\2\u00af\27\3\2\2\2\u00b0\u00b1"+
		"\7\31\2\2\u00b1\u00b2\5\f\7\2\u00b2\u00ba\7\32\2\2\u00b3\u00b4\7\"\2\2"+
		"\u00b4\u00b5\7\13\2\2\u00b5\u00b6\7#\2\2\u00b6\u00b7\7\33\2\2\u00b7\u00b8"+
		"\5\f\7\2\u00b8\u00b9\7\7\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b3\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\7\34\2\2\u00bf\31\3\2\2\2\u00c0\u00c1\t\2\2\2\u00c1\33"+
		"\3\2\2\2\24\37\',.;>M\\nvy\u0082\u0085\u0088\u008a\u0091\u00a4\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
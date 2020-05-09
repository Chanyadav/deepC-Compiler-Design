// Generated from com\deepc\deepcdemo\deepc.g4 by ANTLR 4.5.1
package com.deepc.deepcdemo;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class deepcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, DIGIT=93, COMMENT=94, 
		WHITESPACE=95;
	public static final int
		RULE_string = 0, RULE_lowerCharacter = 1, RULE_upperCharacter = 2, RULE_identifier = 3, 
		RULE_program = 4, RULE_block = 5, RULE_declarationList = 6, RULE_declaration = 7, 
		RULE_commandList = 8, RULE_command = 9, RULE_ternarycondition = 10, RULE_for_range = 11, 
		RULE_elsepart = 12, RULE_if_condition = 13, RULE_while_condition = 14, 
		RULE_for_condition = 15, RULE_initialize = 16, RULE_ternary = 17, RULE_cond1 = 18, 
		RULE_cond2 = 19, RULE_endCondition = 20, RULE_booleanValue = 21, RULE_booleanValueList = 22, 
		RULE_expression = 23, RULE_term1 = 24, RULE_term2 = 25, RULE_print = 26, 
		RULE_primary = 27;
	public static final String[] ruleNames = {
		"string", "lowerCharacter", "upperCharacter", "identifier", "program", 
		"block", "declarationList", "declaration", "commandList", "command", "ternarycondition", 
		"for_range", "elsepart", "if_condition", "while_condition", "for_condition", 
		"initialize", "ternary", "cond1", "cond2", "endCondition", "booleanValue", 
		"booleanValueList", "expression", "term1", "term2", "print", "primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", 
		"'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", 
		"'u'", "'v'", "'w'", "'x'", "'y'", "'z'", "'A'", "'B'", "'C'", "'D'", 
		"'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", 
		"'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", 
		"'Y'", "'Z'", "'.'", "'begin'", "';'", "'end'", "'integer'", "'booleanValue'", 
		"'string'", "':='", "'if'", "'then'", "'end_if'", "'while'", "'do'", "'end_while'", 
		"'for'", "'('", "')'", "'end_for'", "'?'", "'in'", "'range'", "','", "'else'", 
		"':'", "'+'", "'-'", "'true'", "'false'", "'=='", "'!='", "'not'", "'<'", 
		"'>'", "'>='", "'<='", "'and'", "'or'", "'*'", "'/'", "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "DIGIT", "COMMENT", 
		"WHITESPACE"
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
	public String getGrammarFileName() { return "deepc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public deepcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StringContext extends ParserRuleContext {
		public List<LowerCharacterContext> lowerCharacter() {
			return getRuleContexts(LowerCharacterContext.class);
		}
		public LowerCharacterContext lowerCharacter(int i) {
			return getRuleContext(LowerCharacterContext.class,i);
		}
		public List<UpperCharacterContext> upperCharacter() {
			return getRuleContexts(UpperCharacterContext.class);
		}
		public UpperCharacterContext upperCharacter(int i) {
			return getRuleContext(UpperCharacterContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(58);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
					{
					setState(56);
					lowerCharacter();
					}
					break;
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
					{
					setState(57);
					upperCharacter();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0) );
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

	public static class LowerCharacterContext extends ParserRuleContext {
		public LowerCharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowerCharacter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterLowerCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitLowerCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitLowerCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowerCharacterContext lowerCharacter() throws RecognitionException {
		LowerCharacterContext _localctx = new LowerCharacterContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lowerCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class UpperCharacterContext extends ParserRuleContext {
		public UpperCharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upperCharacter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterUpperCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitUpperCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitUpperCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpperCharacterContext upperCharacter() throws RecognitionException {
		UpperCharacterContext _localctx = new UpperCharacterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_upperCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class IdentifierContext extends ParserRuleContext {
		public LowerCharacterContext lowerCharacter() {
			return getRuleContext(LowerCharacterContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			lowerCharacter();
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

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			block();
			setState(69);
			match(T__52);
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

	public static class BlockContext extends ParserRuleContext {
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public CommandListContext commandList() {
			return getRuleContext(CommandListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__53);
			setState(72);
			declarationList();
			setState(73);
			match(T__54);
			setState(74);
			commandList();
			setState(75);
			match(T__54);
			setState(76);
			match(T__55);
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

	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarationList);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				declaration();
				setState(80);
				match(T__54);
				setState(81);
				declarationList();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NodecContext extends DeclarationContext {
		public NodecContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterNodec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitNodec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitNodec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAssignmentContext extends DeclarationContext {
		public IdentifierContext name;
		public StringContext val;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringAssignmentContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterStringAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitStringAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitStringAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringDeclarationContext extends DeclarationContext {
		public Token datatype;
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterStringDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitStringDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitStringDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAssignmentContext extends DeclarationContext {
		public IdentifierContext name;
		public BooleanValueContext val;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanAssignmentContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterBooleanAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitBooleanAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitBooleanAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDeclarationContext extends DeclarationContext {
		public Token datatype;
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BooleanDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterBooleanDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitBooleanDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitBooleanDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntAssignmentContext extends DeclarationContext {
		public IdentifierContext name;
		public PrimaryContext val;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public IntAssignmentContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterIntAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitIntAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitIntAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDeclarationContext extends DeclarationContext {
		public Token datatype;
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterIntDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitIntDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitIntDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new IntDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				((IntDeclarationContext)_localctx).datatype = match(T__56);
				setState(86);
				((IntDeclarationContext)_localctx).name = identifier();
				}
				break;
			case 2:
				_localctx = new BooleanDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				((BooleanDeclarationContext)_localctx).datatype = match(T__57);
				setState(88);
				((BooleanDeclarationContext)_localctx).name = identifier();
				}
				break;
			case 3:
				_localctx = new StringDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				((StringDeclarationContext)_localctx).datatype = match(T__58);
				setState(90);
				((StringDeclarationContext)_localctx).name = identifier();
				}
				break;
			case 4:
				_localctx = new IntAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(T__56);
				setState(92);
				((IntAssignmentContext)_localctx).name = identifier();
				setState(93);
				match(T__59);
				setState(94);
				((IntAssignmentContext)_localctx).val = primary();
				}
				break;
			case 5:
				_localctx = new BooleanAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				match(T__57);
				setState(97);
				((BooleanAssignmentContext)_localctx).name = identifier();
				setState(98);
				match(T__59);
				setState(99);
				((BooleanAssignmentContext)_localctx).val = booleanValue();
				}
				break;
			case 6:
				_localctx = new StringAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				match(T__58);
				setState(102);
				((StringAssignmentContext)_localctx).name = identifier();
				setState(103);
				match(T__59);
				setState(104);
				((StringAssignmentContext)_localctx).val = string();
				}
				break;
			case 7:
				_localctx = new NodecContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
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

	public static class CommandListContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommandListContext commandList() {
			return getRuleContext(CommandListContext.class,0);
		}
		public CommandListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterCommandList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitCommandList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitCommandList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandListContext commandList() throws RecognitionException {
		CommandListContext _localctx = new CommandListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commandList);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				command();
				setState(111);
				match(T__54);
				setState(112);
				commandList();
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends CommandContext {
		public While_conditionContext while_condition() {
			return getRuleContext(While_conditionContext.class,0);
		}
		public CommandListContext commandList() {
			return getRuleContext(CommandListContext.class,0);
		}
		public WhileStatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLoopStatementContext extends CommandContext {
		public InitializeContext initialize() {
			return getRuleContext(InitializeContext.class,0);
		}
		public For_conditionContext for_condition() {
			return getRuleContext(For_conditionContext.class,0);
		}
		public EndConditionContext endCondition() {
			return getRuleContext(EndConditionContext.class,0);
		}
		public CommandListContext commandList() {
			return getRuleContext(CommandListContext.class,0);
		}
		public ForLoopStatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterForLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitForLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitForLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLoopPythonContext extends CommandContext {
		public For_rangeContext for_range() {
			return getRuleContext(For_rangeContext.class,0);
		}
		public CommandListContext commandList() {
			return getRuleContext(CommandListContext.class,0);
		}
		public ForLoopPythonContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterForLoopPython(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitForLoopPython(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitForLoopPython(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DummyEndContext extends CommandContext {
		public EndConditionContext endCondition() {
			return getRuleContext(EndConditionContext.class,0);
		}
		public DummyEndContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterDummyEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitDummyEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitDummyEnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintdummyContext extends CommandContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrintdummyContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterPrintdummy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitPrintdummy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitPrintdummy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStatementContext extends CommandContext {
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public CommandListContext commandList() {
			return getRuleContext(CommandListContext.class,0);
		}
		public ElsepartContext elsepart() {
			return getRuleContext(ElsepartContext.class,0);
		}
		public IfElseStatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolTernaryContext extends CommandContext {
		public BooleanValueListContext booleanValueList() {
			return getRuleContext(BooleanValueListContext.class,0);
		}
		public TernaryconditionContext ternarycondition() {
			return getRuleContext(TernaryconditionContext.class,0);
		}
		public TernaryContext ternary() {
			return getRuleContext(TernaryContext.class,0);
		}
		public BoolTernaryContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterBoolTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitBoolTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitBoolTernary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitializeDummy1Context extends CommandContext {
		public InitializeContext initialize() {
			return getRuleContext(InitializeContext.class,0);
		}
		public InitializeDummy1Context(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterInitializeDummy1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitInitializeDummy1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitInitializeDummy1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_command);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(T__60);
				setState(117);
				if_condition();
				setState(118);
				match(T__61);
				setState(119);
				commandList();
				setState(120);
				elsepart();
				setState(121);
				match(T__62);
				}
				break;
			case 2:
				_localctx = new BoolTernaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				booleanValueList();
				setState(124);
				ternarycondition();
				setState(125);
				ternary();
				}
				break;
			case 3:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(T__63);
				setState(128);
				while_condition();
				setState(129);
				match(T__64);
				setState(130);
				commandList();
				setState(131);
				match(T__65);
				}
				break;
			case 4:
				_localctx = new ForLoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(T__66);
				setState(134);
				match(T__67);
				setState(135);
				initialize();
				setState(136);
				match(T__54);
				setState(137);
				for_condition();
				setState(138);
				match(T__54);
				setState(139);
				endCondition();
				setState(140);
				match(T__68);
				setState(141);
				match(T__64);
				setState(142);
				commandList();
				setState(143);
				match(T__69);
				}
				break;
			case 5:
				_localctx = new ForLoopPythonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				match(T__66);
				setState(146);
				for_range();
				setState(147);
				commandList();
				setState(148);
				match(T__69);
				}
				break;
			case 6:
				_localctx = new InitializeDummy1Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				initialize();
				}
				break;
			case 7:
				_localctx = new PrintdummyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				print();
				}
				break;
			case 8:
				_localctx = new DummyEndContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(152);
				endCondition();
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

	public static class TernaryconditionContext extends ParserRuleContext {
		public TernaryconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternarycondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterTernarycondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitTernarycondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitTernarycondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryconditionContext ternarycondition() throws RecognitionException {
		TernaryconditionContext _localctx = new TernaryconditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ternarycondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__70);
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

	public static class For_rangeContext extends ParserRuleContext {
		public IdentifierContext name;
		public Token begin;
		public Token end;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> DIGIT() { return getTokens(deepcParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(deepcParser.DIGIT, i);
		}
		public For_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterFor_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitFor_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitFor_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_rangeContext for_range() throws RecognitionException {
		For_rangeContext _localctx = new For_rangeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((For_rangeContext)_localctx).name = identifier();
			setState(158);
			match(T__71);
			setState(159);
			match(T__72);
			setState(160);
			match(T__67);
			setState(161);
			((For_rangeContext)_localctx).begin = match(DIGIT);
			setState(162);
			match(T__73);
			setState(163);
			((For_rangeContext)_localctx).end = match(DIGIT);
			setState(164);
			match(T__68);
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

	public static class ElsepartContext extends ParserRuleContext {
		public CommandListContext commandList() {
			return getRuleContext(CommandListContext.class,0);
		}
		public ElsepartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsepart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterElsepart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitElsepart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitElsepart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsepartContext elsepart() throws RecognitionException {
		ElsepartContext _localctx = new ElsepartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elsepart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__74);
			setState(167);
			commandList();
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

	public static class If_conditionContext extends ParserRuleContext {
		public BooleanValueListContext booleanValueList() {
			return getRuleContext(BooleanValueListContext.class,0);
		}
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitIf_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitIf_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			booleanValueList();
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

	public static class While_conditionContext extends ParserRuleContext {
		public BooleanValueListContext booleanValueList() {
			return getRuleContext(BooleanValueListContext.class,0);
		}
		public While_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterWhile_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitWhile_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitWhile_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_conditionContext while_condition() throws RecognitionException {
		While_conditionContext _localctx = new While_conditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			booleanValueList();
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

	public static class For_conditionContext extends ParserRuleContext {
		public BooleanValueListContext booleanValueList() {
			return getRuleContext(BooleanValueListContext.class,0);
		}
		public For_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterFor_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitFor_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitFor_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_conditionContext for_condition() throws RecognitionException {
		For_conditionContext _localctx = new For_conditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			booleanValueList();
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

	public static class InitializeContext extends ParserRuleContext {
		public InitializeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialize; }
	 
		public InitializeContext() { }
		public void copyFrom(InitializeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableExpressionAssignmentContext extends InitializeContext {
		public IdentifierContext name;
		public ExpressionContext val;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableExpressionAssignmentContext(InitializeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterVariableExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitVariableExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitVariableExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableBooleanAssignmentContext extends InitializeContext {
		public IdentifierContext name;
		public BooleanValueContext val;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public VariableBooleanAssignmentContext(InitializeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterVariableBooleanAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitVariableBooleanAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitVariableBooleanAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableStringAssignmentContext extends InitializeContext {
		public IdentifierContext name;
		public StringContext val;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public VariableStringAssignmentContext(InitializeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterVariableStringAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitVariableStringAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitVariableStringAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializeContext initialize() throws RecognitionException {
		InitializeContext _localctx = new InitializeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_initialize);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new VariableExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				((VariableExpressionAssignmentContext)_localctx).name = identifier();
				setState(176);
				match(T__59);
				setState(177);
				((VariableExpressionAssignmentContext)_localctx).val = expression(0);
				}
				break;
			case 2:
				_localctx = new VariableBooleanAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				((VariableBooleanAssignmentContext)_localctx).name = identifier();
				setState(180);
				match(T__59);
				setState(181);
				((VariableBooleanAssignmentContext)_localctx).val = booleanValue();
				}
				break;
			case 3:
				_localctx = new VariableStringAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				((VariableStringAssignmentContext)_localctx).name = identifier();
				setState(184);
				match(T__59);
				setState(185);
				((VariableStringAssignmentContext)_localctx).val = string();
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

	public static class TernaryContext extends ParserRuleContext {
		public TernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary; }
	 
		public TernaryContext() { }
		public void copyFrom(TernaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TernaryInitializeContext extends TernaryContext {
		public Cond1Context cond1() {
			return getRuleContext(Cond1Context.class,0);
		}
		public Cond2Context cond2() {
			return getRuleContext(Cond2Context.class,0);
		}
		public TernaryInitializeContext(TernaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterTernaryInitialize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitTernaryInitialize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitTernaryInitialize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernarbooleanValueContext extends TernaryContext {
		public List<BooleanValueContext> booleanValue() {
			return getRuleContexts(BooleanValueContext.class);
		}
		public BooleanValueContext booleanValue(int i) {
			return getRuleContext(BooleanValueContext.class,i);
		}
		public TernarbooleanValueContext(TernaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterTernarbooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitTernarbooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitTernarbooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryContext ternary() throws RecognitionException {
		TernaryContext _localctx = new TernaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ternary);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new TernaryInitializeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				cond1();
				setState(190);
				match(T__75);
				setState(191);
				cond2();
				}
				break;
			case 2:
				_localctx = new TernarbooleanValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				booleanValue();
				setState(194);
				match(T__75);
				setState(195);
				booleanValue();
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

	public static class Cond1Context extends ParserRuleContext {
		public InitializeContext initialize() {
			return getRuleContext(InitializeContext.class,0);
		}
		public Cond1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterCond1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitCond1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitCond1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond1Context cond1() throws RecognitionException {
		Cond1Context _localctx = new Cond1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_cond1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			initialize();
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

	public static class Cond2Context extends ParserRuleContext {
		public InitializeContext initialize() {
			return getRuleContext(InitializeContext.class,0);
		}
		public Cond2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterCond2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitCond2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitCond2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond2Context cond2() throws RecognitionException {
		Cond2Context _localctx = new Cond2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_cond2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			initialize();
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

	public static class EndConditionContext extends ParserRuleContext {
		public EndConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endCondition; }
	 
		public EndConditionContext() { }
		public void copyFrom(EndConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecrementalContext extends EndConditionContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DecrementalContext(EndConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterDecremental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitDecremental(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitDecremental(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementalContext extends EndConditionContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IncrementalContext(EndConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterIncremental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitIncremental(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitIncremental(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitializeDummy2Context extends EndConditionContext {
		public InitializeContext initialize() {
			return getRuleContext(InitializeContext.class,0);
		}
		public InitializeDummy2Context(EndConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterInitializeDummy2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitInitializeDummy2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitInitializeDummy2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndConditionContext endCondition() throws RecognitionException {
		EndConditionContext _localctx = new EndConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_endCondition);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new InitializeDummy2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				initialize();
				}
				break;
			case 2:
				_localctx = new IncrementalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				((IncrementalContext)_localctx).name = identifier();
				setState(205);
				match(T__76);
				setState(206);
				match(T__76);
				}
				break;
			case 3:
				_localctx = new DecrementalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				((DecrementalContext)_localctx).name = identifier();
				setState(209);
				match(T__77);
				setState(210);
				match(T__77);
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

	public static class BooleanValueContext extends ParserRuleContext {
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	 
		public BooleanValueContext() { }
		public void copyFrom(BooleanValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LesserThanOrEqualContext extends BooleanValueContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LesserThanOrEqualContext(BooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterLesserThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitLesserThanOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitLesserThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueStatementContext extends BooleanValueContext {
		public TrueStatementContext(BooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterTrueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitTrueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitTrueStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegationContext extends BooleanValueContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public NegationContext(BooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends BooleanValueContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessThanContext(BooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseStatementContext extends BooleanValueContext {
		public FalseStatementContext(BooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterFalseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitFalseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitFalseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotequalExpressionContext extends BooleanValueContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotequalExpressionContext(BooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterNotequalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitNotequalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitNotequalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualExpressionContext extends BooleanValueContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualExpressionContext(BooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanContext extends BooleanValueContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterThanContext(BooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanOrEqualContext extends BooleanValueContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterThanOrEqualContext(BooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterGreaterThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitGreaterThanOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitGreaterThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_booleanValue);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new TrueStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(T__78);
				}
				break;
			case 2:
				_localctx = new FalseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(T__79);
				}
				break;
			case 3:
				_localctx = new EqualExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				expression(0);
				setState(217);
				match(T__80);
				setState(218);
				expression(0);
				}
				break;
			case 4:
				_localctx = new NotequalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				expression(0);
				setState(221);
				match(T__81);
				setState(222);
				expression(0);
				}
				break;
			case 5:
				_localctx = new NegationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				match(T__82);
				setState(225);
				match(T__67);
				setState(226);
				booleanValue();
				setState(227);
				match(T__68);
				}
				break;
			case 6:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				expression(0);
				setState(230);
				match(T__83);
				setState(231);
				expression(0);
				}
				break;
			case 7:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(233);
				expression(0);
				setState(234);
				match(T__84);
				setState(235);
				expression(0);
				}
				break;
			case 8:
				_localctx = new GreaterThanOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				expression(0);
				setState(238);
				match(T__85);
				setState(239);
				expression(0);
				}
				break;
			case 9:
				_localctx = new LesserThanOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(241);
				expression(0);
				setState(242);
				match(T__86);
				setState(243);
				expression(0);
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

	public static class BooleanValueListContext extends ParserRuleContext {
		public BooleanValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValueList; }
	 
		public BooleanValueListContext() { }
		public void copyFrom(BooleanValueListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalOrRelationContext extends BooleanValueListContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanValueListContext booleanValueList() {
			return getRuleContext(BooleanValueListContext.class,0);
		}
		public LogicalOrRelationContext(BooleanValueListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterLogicalOrRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitLogicalOrRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitLogicalOrRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndRelationContext extends BooleanValueListContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanValueListContext booleanValueList() {
			return getRuleContext(BooleanValueListContext.class,0);
		}
		public LogicalAndRelationContext(BooleanValueListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterLogicalAndRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitLogicalAndRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitLogicalAndRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDummyContext extends BooleanValueListContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanDummyContext(BooleanValueListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterBooleanDummy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitBooleanDummy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitBooleanDummy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueListContext booleanValueList() throws RecognitionException {
		BooleanValueListContext _localctx = new BooleanValueListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_booleanValueList);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new BooleanDummyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				booleanValue();
				}
				break;
			case 2:
				_localctx = new LogicalAndRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				booleanValue();
				setState(249);
				match(T__87);
				setState(250);
				booleanValueList();
				}
				break;
			case 3:
				_localctx = new LogicalOrRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				booleanValue();
				setState(253);
				match(T__88);
				setState(254);
				booleanValueList();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubtractionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public SubtractionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term1dummyContext extends ExpressionContext {
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public Term1dummyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterTerm1dummy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitTerm1dummy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitTerm1dummy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public AdditionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Term1dummyContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(259);
			term1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(267);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(262);
						match(T__76);
						setState(263);
						term1(0);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(264);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(265);
						match(T__77);
						setState(266);
						term1(0);
						}
						break;
					}
					} 
				}
				setState(271);
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

	public static class Term1Context extends ParserRuleContext {
		public Term1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term1; }
	 
		public Term1Context() { }
		public void copyFrom(Term1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivisionContext extends Term1Context {
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public Term2Context term2() {
			return getRuleContext(Term2Context.class,0);
		}
		public DivisionContext(Term1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dummyterm2Context extends Term1Context {
		public Term2Context term2() {
			return getRuleContext(Term2Context.class,0);
		}
		public Dummyterm2Context(Term1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterDummyterm2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitDummyterm2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitDummyterm2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends Term1Context {
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public Term2Context term2() {
			return getRuleContext(Term2Context.class,0);
		}
		public MultiplicationContext(Term1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term1Context term1() throws RecognitionException {
		return term1(0);
	}

	private Term1Context term1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term1Context _localctx = new Term1Context(_ctx, _parentState);
		Term1Context _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_term1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Dummyterm2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(273);
			term2();
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new Term1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term1);
						setState(275);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(276);
						match(T__89);
						setState(277);
						term2();
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new Term1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term1);
						setState(278);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(279);
						match(T__90);
						setState(280);
						term2();
						}
						break;
					}
					} 
				}
				setState(285);
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

	public static class Term2Context extends ParserRuleContext {
		public Term2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term2; }
	 
		public Term2Context() { }
		public void copyFrom(Term2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberContext extends Term2Context {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public NumberContext(Term2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketExpressionContext extends Term2Context {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracketExpressionContext(Term2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterBracketExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitBracketExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitBracketExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierVariableContext extends Term2Context {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierVariableContext(Term2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterIdentifierVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitIdentifierVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitIdentifierVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term2Context term2() throws RecognitionException {
		Term2Context _localctx = new Term2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_term2);
		try {
			setState(292);
			switch (_input.LA(1)) {
			case T__67:
				_localctx = new BracketExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(T__67);
				setState(287);
				expression(0);
				setState(288);
				match(T__68);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				_localctx = new IdentifierVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				((IdentifierVariableContext)_localctx).name = identifier();
				}
				break;
			case DIGIT:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				primary();
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

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintstringContext extends PrintContext {
		public StringContext name;
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public PrintstringContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterPrintstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitPrintstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitPrintstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintidentifierContext extends PrintContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrintidentifierContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterPrintidentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitPrintidentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitPrintidentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_print);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new PrintidentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(T__91);
				setState(295);
				match(T__67);
				setState(296);
				((PrintidentifierContext)_localctx).name = identifier();
				setState(297);
				match(T__68);
				}
				break;
			case 2:
				_localctx = new PrintstringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(T__91);
				setState(300);
				match(T__67);
				setState(301);
				((PrintstringContext)_localctx).name = string();
				setState(302);
				match(T__68);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(deepcParser.DIGIT, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deepcListener ) ((deepcListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deepcVisitor ) return ((deepcVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(DIGIT);
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
		case 23:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 24:
			return term1_sempred((Term1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term1_sempred(Term1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3a\u0137\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\6\2=\n\2\r\2\16\2>\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\5\bV\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tn\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\5\nu\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009c\n\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00be\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00c8\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00d7\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f8\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0103\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u010e\n\31\f\31\16\31\u0111\13\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u011c\n\32\f\32\16\32\u011f\13\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0127\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u0133\n\34\3\35\3\35\3\35\2\4\60\62\36"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\4\3\2"+
		"\3\34\3\2\35\66\u0141\2<\3\2\2\2\4@\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\nF\3"+
		"\2\2\2\fI\3\2\2\2\16U\3\2\2\2\20m\3\2\2\2\22t\3\2\2\2\24\u009b\3\2\2\2"+
		"\26\u009d\3\2\2\2\30\u009f\3\2\2\2\32\u00a8\3\2\2\2\34\u00ab\3\2\2\2\36"+
		"\u00ad\3\2\2\2 \u00af\3\2\2\2\"\u00bd\3\2\2\2$\u00c7\3\2\2\2&\u00c9\3"+
		"\2\2\2(\u00cb\3\2\2\2*\u00d6\3\2\2\2,\u00f7\3\2\2\2.\u0102\3\2\2\2\60"+
		"\u0104\3\2\2\2\62\u0112\3\2\2\2\64\u0126\3\2\2\2\66\u0132\3\2\2\28\u0134"+
		"\3\2\2\2:=\5\4\3\2;=\5\6\4\2<:\3\2\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>"+
		"?\3\2\2\2?\3\3\2\2\2@A\t\2\2\2A\5\3\2\2\2BC\t\3\2\2C\7\3\2\2\2DE\5\4\3"+
		"\2E\t\3\2\2\2FG\5\f\7\2GH\7\67\2\2H\13\3\2\2\2IJ\78\2\2JK\5\16\b\2KL\7"+
		"9\2\2LM\5\22\n\2MN\79\2\2NO\7:\2\2O\r\3\2\2\2PV\5\20\t\2QR\5\20\t\2RS"+
		"\79\2\2ST\5\16\b\2TV\3\2\2\2UP\3\2\2\2UQ\3\2\2\2V\17\3\2\2\2WX\7;\2\2"+
		"Xn\5\b\5\2YZ\7<\2\2Zn\5\b\5\2[\\\7=\2\2\\n\5\b\5\2]^\7;\2\2^_\5\b\5\2"+
		"_`\7>\2\2`a\58\35\2an\3\2\2\2bc\7<\2\2cd\5\b\5\2de\7>\2\2ef\5,\27\2fn"+
		"\3\2\2\2gh\7=\2\2hi\5\b\5\2ij\7>\2\2jk\5\2\2\2kn\3\2\2\2ln\3\2\2\2mW\3"+
		"\2\2\2mY\3\2\2\2m[\3\2\2\2m]\3\2\2\2mb\3\2\2\2mg\3\2\2\2ml\3\2\2\2n\21"+
		"\3\2\2\2ou\5\24\13\2pq\5\24\13\2qr\79\2\2rs\5\22\n\2su\3\2\2\2to\3\2\2"+
		"\2tp\3\2\2\2u\23\3\2\2\2vw\7?\2\2wx\5\34\17\2xy\7@\2\2yz\5\22\n\2z{\5"+
		"\32\16\2{|\7A\2\2|\u009c\3\2\2\2}~\5.\30\2~\177\5\26\f\2\177\u0080\5$"+
		"\23\2\u0080\u009c\3\2\2\2\u0081\u0082\7B\2\2\u0082\u0083\5\36\20\2\u0083"+
		"\u0084\7C\2\2\u0084\u0085\5\22\n\2\u0085\u0086\7D\2\2\u0086\u009c\3\2"+
		"\2\2\u0087\u0088\7E\2\2\u0088\u0089\7F\2\2\u0089\u008a\5\"\22\2\u008a"+
		"\u008b\79\2\2\u008b\u008c\5 \21\2\u008c\u008d\79\2\2\u008d\u008e\5*\26"+
		"\2\u008e\u008f\7G\2\2\u008f\u0090\7C\2\2\u0090\u0091\5\22\n\2\u0091\u0092"+
		"\7H\2\2\u0092\u009c\3\2\2\2\u0093\u0094\7E\2\2\u0094\u0095\5\30\r\2\u0095"+
		"\u0096\5\22\n\2\u0096\u0097\7H\2\2\u0097\u009c\3\2\2\2\u0098\u009c\5\""+
		"\22\2\u0099\u009c\5\66\34\2\u009a\u009c\5*\26\2\u009bv\3\2\2\2\u009b}"+
		"\3\2\2\2\u009b\u0081\3\2\2\2\u009b\u0087\3\2\2\2\u009b\u0093\3\2\2\2\u009b"+
		"\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\25\3\2\2"+
		"\2\u009d\u009e\7I\2\2\u009e\27\3\2\2\2\u009f\u00a0\5\b\5\2\u00a0\u00a1"+
		"\7J\2\2\u00a1\u00a2\7K\2\2\u00a2\u00a3\7F\2\2\u00a3\u00a4\7_\2\2\u00a4"+
		"\u00a5\7L\2\2\u00a5\u00a6\7_\2\2\u00a6\u00a7\7G\2\2\u00a7\31\3\2\2\2\u00a8"+
		"\u00a9\7M\2\2\u00a9\u00aa\5\22\n\2\u00aa\33\3\2\2\2\u00ab\u00ac\5.\30"+
		"\2\u00ac\35\3\2\2\2\u00ad\u00ae\5.\30\2\u00ae\37\3\2\2\2\u00af\u00b0\5"+
		".\30\2\u00b0!\3\2\2\2\u00b1\u00b2\5\b\5\2\u00b2\u00b3\7>\2\2\u00b3\u00b4"+
		"\5\60\31\2\u00b4\u00be\3\2\2\2\u00b5\u00b6\5\b\5\2\u00b6\u00b7\7>\2\2"+
		"\u00b7\u00b8\5,\27\2\u00b8\u00be\3\2\2\2\u00b9\u00ba\5\b\5\2\u00ba\u00bb"+
		"\7>\2\2\u00bb\u00bc\5\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b1\3\2\2\2\u00bd"+
		"\u00b5\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be#\3\2\2\2\u00bf\u00c0\5&\24\2"+
		"\u00c0\u00c1\7N\2\2\u00c1\u00c2\5(\25\2\u00c2\u00c8\3\2\2\2\u00c3\u00c4"+
		"\5,\27\2\u00c4\u00c5\7N\2\2\u00c5\u00c6\5,\27\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00bf\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8%\3\2\2\2\u00c9\u00ca\5\"\22\2"+
		"\u00ca\'\3\2\2\2\u00cb\u00cc\5\"\22\2\u00cc)\3\2\2\2\u00cd\u00d7\5\"\22"+
		"\2\u00ce\u00cf\5\b\5\2\u00cf\u00d0\7O\2\2\u00d0\u00d1\7O\2\2\u00d1\u00d7"+
		"\3\2\2\2\u00d2\u00d3\5\b\5\2\u00d3\u00d4\7P\2\2\u00d4\u00d5\7P\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00cd\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d2\3\2"+
		"\2\2\u00d7+\3\2\2\2\u00d8\u00f8\7Q\2\2\u00d9\u00f8\7R\2\2\u00da\u00db"+
		"\5\60\31\2\u00db\u00dc\7S\2\2\u00dc\u00dd\5\60\31\2\u00dd\u00f8\3\2\2"+
		"\2\u00de\u00df\5\60\31\2\u00df\u00e0\7T\2\2\u00e0\u00e1\5\60\31\2\u00e1"+
		"\u00f8\3\2\2\2\u00e2\u00e3\7U\2\2\u00e3\u00e4\7F\2\2\u00e4\u00e5\5,\27"+
		"\2\u00e5\u00e6\7G\2\2\u00e6\u00f8\3\2\2\2\u00e7\u00e8\5\60\31\2\u00e8"+
		"\u00e9\7V\2\2\u00e9\u00ea\5\60\31\2\u00ea\u00f8\3\2\2\2\u00eb\u00ec\5"+
		"\60\31\2\u00ec\u00ed\7W\2\2\u00ed\u00ee\5\60\31\2\u00ee\u00f8\3\2\2\2"+
		"\u00ef\u00f0\5\60\31\2\u00f0\u00f1\7X\2\2\u00f1\u00f2\5\60\31\2\u00f2"+
		"\u00f8\3\2\2\2\u00f3\u00f4\5\60\31\2\u00f4\u00f5\7Y\2\2\u00f5\u00f6\5"+
		"\60\31\2\u00f6\u00f8\3\2\2\2\u00f7\u00d8\3\2\2\2\u00f7\u00d9\3\2\2\2\u00f7"+
		"\u00da\3\2\2\2\u00f7\u00de\3\2\2\2\u00f7\u00e2\3\2\2\2\u00f7\u00e7\3\2"+
		"\2\2\u00f7\u00eb\3\2\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f8"+
		"-\3\2\2\2\u00f9\u0103\5,\27\2\u00fa\u00fb\5,\27\2\u00fb\u00fc\7Z\2\2\u00fc"+
		"\u00fd\5.\30\2\u00fd\u0103\3\2\2\2\u00fe\u00ff\5,\27\2\u00ff\u0100\7["+
		"\2\2\u0100\u0101\5.\30\2\u0101\u0103\3\2\2\2\u0102\u00f9\3\2\2\2\u0102"+
		"\u00fa\3\2\2\2\u0102\u00fe\3\2\2\2\u0103/\3\2\2\2\u0104\u0105\b\31\1\2"+
		"\u0105\u0106\5\62\32\2\u0106\u010f\3\2\2\2\u0107\u0108\f\5\2\2\u0108\u0109"+
		"\7O\2\2\u0109\u010e\5\62\32\2\u010a\u010b\f\4\2\2\u010b\u010c\7P\2\2\u010c"+
		"\u010e\5\62\32\2\u010d\u0107\3\2\2\2\u010d\u010a\3\2\2\2\u010e\u0111\3"+
		"\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\61\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0113\b\32\1\2\u0113\u0114\5\64\33\2\u0114\u011d"+
		"\3\2\2\2\u0115\u0116\f\5\2\2\u0116\u0117\7\\\2\2\u0117\u011c\5\64\33\2"+
		"\u0118\u0119\f\4\2\2\u0119\u011a\7]\2\2\u011a\u011c\5\64\33\2\u011b\u0115"+
		"\3\2\2\2\u011b\u0118\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\63\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7F\2\2"+
		"\u0121\u0122\5\60\31\2\u0122\u0123\7G\2\2\u0123\u0127\3\2\2\2\u0124\u0127"+
		"\5\b\5\2\u0125\u0127\58\35\2\u0126\u0120\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0125\3\2\2\2\u0127\65\3\2\2\2\u0128\u0129\7^\2\2\u0129\u012a\7F\2\2"+
		"\u012a\u012b\5\b\5\2\u012b\u012c\7G\2\2\u012c\u0133\3\2\2\2\u012d\u012e"+
		"\7^\2\2\u012e\u012f\7F\2\2\u012f\u0130\5\2\2\2\u0130\u0131\7G\2\2\u0131"+
		"\u0133\3\2\2\2\u0132\u0128\3\2\2\2\u0132\u012d\3\2\2\2\u0133\67\3\2\2"+
		"\2\u0134\u0135\7_\2\2\u01359\3\2\2\2\23<>Umt\u009b\u00bd\u00c7\u00d6\u00f7"+
		"\u0102\u010d\u010f\u011b\u011d\u0126\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
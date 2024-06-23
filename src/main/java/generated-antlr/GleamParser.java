// Generated from java-escape by ANTLR 4.11.1
package se.clau.gleam;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GleamParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AS=1, ASSERT=2, CASE=3, CONST=4, EXTERNAL=5, FN=6, IF=7, IMPORT=8, LET=9, 
		OPAQUE=10, PUB=11, TODO=12, TRY=13, TYPE=14, USE=15, TRUE=16, FALSE=17, 
		LEFT_PAREN=18, RIGHT_PAREN=19, LEFT_SQUARE=20, RIGHT_SQUARE=21, LEFT_BRACE=22, 
		RIGHT_BRACE=23, PLUS=24, MINUS=25, STAR=26, SLASH=27, LESS=28, GREATER=29, 
		LESS_EQUAL=30, GREATER_EQUAL=31, PERCENT=32, PLUS_DOT=33, MINUS_DOT=34, 
		STAR_DOT=35, SLASH_DOT=36, LESS_DOT=37, GREATER_DOT=38, LESS_EQUAL_DOT=39, 
		GREATER_EQUAL_DOT=40, LT_GT=41, COLON=42, COMMA=43, HASH=44, BANG=45, 
		EQUAL=46, EQUAL_EQUAL=47, NOT_EQUAL=48, VBAR=49, VBAR_VBAR=50, AMPER_AMPER=51, 
		LT_LT=52, GT_GT=53, PIPE=54, DOT=55, R_ARROW=56, L_ARROW=57, DOT_DOT=58, 
		END_OF_FILE=59, COMMENT_NORMAL=60, COMMENT_DOC=61, COMMENT_MODULE=62, 
		NAME=63, UP_NAME=64, DISCARD_NAME=65, ID=66, INTEGER=67, DECIMAL=68, BINARY=69, 
		HEX=70, OCTAL=71, FLOAT=72, STRING=73, WHITESPACE=74, ERRCHAR=75;
	public static final int
		RULE_source_file = 0, RULE_target_group = 1, RULE_module = 2, RULE_unqualified_import = 3, 
		RULE_unqualified_imports = 4, RULE_imports = 5, RULE_constant_function_parameter_types = 6, 
		RULE_constant_type_function = 7, RULE_constant_tuple = 8, RULE_constant_type_tuple = 9, 
		RULE_constant_type_arguement = 10, RULE_constant_type_arguements = 11, 
		RULE_constant_list = 12, RULE_constant_record_argument = 13, RULE_constant_record_arguments = 14, 
		RULE_constant_record = 15, RULE_bit_string_segment_option_size = 16, RULE_bit_string_named_segment_option = 17, 
		RULE_bit_string_segment_option = 18, RULE_bit_string_segment_options = 19, 
		RULE_constant_bit_string_segment = 20, RULE_constant_bit_string = 21, 
		RULE_constant_type = 22, RULE_constant_type_special = 23, RULE_constant_type_annotation = 24, 
		RULE_constant_field_access = 25, RULE_constant_value = 26, RULE_constant = 27, 
		RULE_type_parameters = 28, RULE_type_name = 29, RULE_external_type = 30, 
		RULE_function_parameter_types = 31, RULE_tuple_type = 32, RULE_function_type = 33, 
		RULE_type_base = 34, RULE_type_annotation = 35, RULE_type_argument = 36, 
		RULE_type_arguments = 37, RULE_type = 38, RULE_external_function_body = 39, 
		RULE_external_function_parameter = 40, RULE_external_function_parameters = 41, 
		RULE_external_function = 42, RULE_function_parameter_args = 43, RULE_function_parameter = 44, 
		RULE_function_parameters = 45, RULE_function_body = 46, RULE_function = 47, 
		RULE_list_pattern_tail = 48, RULE_list_pattern = 49, RULE_pattern_bit_string_segment = 50, 
		RULE_pattern_bit_string = 51, RULE_tuple_pattern = 52, RULE_pattern_spread = 53, 
		RULE_record_pattern_argument = 54, RULE_record_pattern_arguments = 55, 
		RULE_record_pattern = 56, RULE_pattern = 57, RULE_try = 58, RULE_expression_seq = 59, 
		RULE_argument = 60, RULE_arguments = 61, RULE_record = 62, RULE_expression_bit_string_segment = 63, 
		RULE_expression_bit_string = 64, RULE_todo = 65, RULE_tuple = 66, RULE_list = 67, 
		RULE_anonymous_function_parameter_args = 68, RULE_anonymous_function_parameter = 69, 
		RULE_anonymous_function_parameters = 70, RULE_anonymous_function = 71, 
		RULE_expression_group = 72, RULE_case_clause_tuple_access = 73, RULE_case_clause_guard_unit = 74, 
		RULE_case_clause_guard_binary_operator = 75, RULE_case_clause_guard_expression = 76, 
		RULE_case_clause_guard = 77, RULE_case_clause_pattern = 78, RULE_case_clause_patterns = 79, 
		RULE_case_clause = 80, RULE_case_clauses = 81, RULE_case_subjects = 82, 
		RULE_case = 83, RULE_use_args = 84, RULE_use = 85, RULE_assignment = 86, 
		RULE_let = 87, RULE_assert = 88, RULE_negation = 89, RULE_record_update_argument = 90, 
		RULE_record_update_arguments = 91, RULE_record_update = 92, RULE_call_or_access_options = 93, 
		RULE_call_or_access = 94, RULE_expression_literal = 95, RULE_expression_unit = 96, 
		RULE_expression = 97, RULE_data_constructor_argument = 98, RULE_data_constructor_arguments = 99, 
		RULE_data_constructor = 100, RULE_data_constructors = 101, RULE_type_definition = 102, 
		RULE_type_alias = 103, RULE_statement = 104, RULE_identifier = 105, RULE_constructor_name = 106, 
		RULE_type_identifier = 107, RULE_discard = 108, RULE_label = 109, RULE_type_parameter = 110, 
		RULE_type_var = 111, RULE_type_hole = 112, RULE_hole = 113, RULE_discard_param = 114, 
		RULE_name_param = 115, RULE_labeled_name_param = 116, RULE_labeled_discard_param = 117, 
		RULE_remote_constructor_name = 118, RULE_remote_type_identifier = 119, 
		RULE_visibility_modifier = 120, RULE_opacity_modifier = 121;
	private static String[] makeRuleNames() {
		return new String[] {
			"source_file", "target_group", "module", "unqualified_import", "unqualified_imports", 
			"imports", "constant_function_parameter_types", "constant_type_function", 
			"constant_tuple", "constant_type_tuple", "constant_type_arguement", "constant_type_arguements", 
			"constant_list", "constant_record_argument", "constant_record_arguments", 
			"constant_record", "bit_string_segment_option_size", "bit_string_named_segment_option", 
			"bit_string_segment_option", "bit_string_segment_options", "constant_bit_string_segment", 
			"constant_bit_string", "constant_type", "constant_type_special", "constant_type_annotation", 
			"constant_field_access", "constant_value", "constant", "type_parameters", 
			"type_name", "external_type", "function_parameter_types", "tuple_type", 
			"function_type", "type_base", "type_annotation", "type_argument", "type_arguments", 
			"type", "external_function_body", "external_function_parameter", "external_function_parameters", 
			"external_function", "function_parameter_args", "function_parameter", 
			"function_parameters", "function_body", "function", "list_pattern_tail", 
			"list_pattern", "pattern_bit_string_segment", "pattern_bit_string", "tuple_pattern", 
			"pattern_spread", "record_pattern_argument", "record_pattern_arguments", 
			"record_pattern", "pattern", "try", "expression_seq", "argument", "arguments", 
			"record", "expression_bit_string_segment", "expression_bit_string", "todo", 
			"tuple", "list", "anonymous_function_parameter_args", "anonymous_function_parameter", 
			"anonymous_function_parameters", "anonymous_function", "expression_group", 
			"case_clause_tuple_access", "case_clause_guard_unit", "case_clause_guard_binary_operator", 
			"case_clause_guard_expression", "case_clause_guard", "case_clause_pattern", 
			"case_clause_patterns", "case_clause", "case_clauses", "case_subjects", 
			"case", "use_args", "use", "assignment", "let", "assert", "negation", 
			"record_update_argument", "record_update_arguments", "record_update", 
			"call_or_access_options", "call_or_access", "expression_literal", "expression_unit", 
			"expression", "data_constructor_argument", "data_constructor_arguments", 
			"data_constructor", "data_constructors", "type_definition", "type_alias", 
			"statement", "identifier", "constructor_name", "type_identifier", "discard", 
			"label", "type_parameter", "type_var", "type_hole", "hole", "discard_param", 
			"name_param", "labeled_name_param", "labeled_discard_param", "remote_constructor_name", 
			"remote_type_identifier", "visibility_modifier", "opacity_modifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'as'", "'assert'", "'case'", "'const'", "'external'", "'fn'", 
			"'if'", "'import'", "'let'", "'opaque'", "'pub'", "'todo'", "'try'", 
			"'type'", "'use'", "'True'", "'False'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'%'", 
			"'+.'", "'-.'", "'*.'", "'/.'", "'<.'", "'>.'", "'<=.'", "'>=.'", "'<>'", 
			"':'", "','", "'#'", "'!'", "'='", "'=='", "'!='", "'|'", "'||'", "'&&'", 
			"'<<'", "'>>'", "'|>'", "'.'", "'->'", "'<-'", "'..'", "'EOF'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AS", "ASSERT", "CASE", "CONST", "EXTERNAL", "FN", "IF", "IMPORT", 
			"LET", "OPAQUE", "PUB", "TODO", "TRY", "TYPE", "USE", "TRUE", "FALSE", 
			"LEFT_PAREN", "RIGHT_PAREN", "LEFT_SQUARE", "RIGHT_SQUARE", "LEFT_BRACE", 
			"RIGHT_BRACE", "PLUS", "MINUS", "STAR", "SLASH", "LESS", "GREATER", "LESS_EQUAL", 
			"GREATER_EQUAL", "PERCENT", "PLUS_DOT", "MINUS_DOT", "STAR_DOT", "SLASH_DOT", 
			"LESS_DOT", "GREATER_DOT", "LESS_EQUAL_DOT", "GREATER_EQUAL_DOT", "LT_GT", 
			"COLON", "COMMA", "HASH", "BANG", "EQUAL", "EQUAL_EQUAL", "NOT_EQUAL", 
			"VBAR", "VBAR_VBAR", "AMPER_AMPER", "LT_LT", "GT_GT", "PIPE", "DOT", 
			"R_ARROW", "L_ARROW", "DOT_DOT", "END_OF_FILE", "COMMENT_NORMAL", "COMMENT_DOC", 
			"COMMENT_MODULE", "NAME", "UP_NAME", "DISCARD_NAME", "ID", "INTEGER", 
			"DECIMAL", "BINARY", "HEX", "OCTAL", "FLOAT", "STRING", "WHITESPACE", 
			"ERRCHAR"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GleamParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Source_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GleamParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Expression_seqContext> expression_seq() {
			return getRuleContexts(Expression_seqContext.class);
		}
		public Expression_seqContext expression_seq(int i) {
			return getRuleContext(Expression_seqContext.class,i);
		}
		public List<Target_groupContext> target_group() {
			return getRuleContexts(Target_groupContext.class);
		}
		public Target_groupContext target_group(int i) {
			return getRuleContext(Target_groupContext.class,i);
		}
		public Source_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterSource_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitSource_file(this);
		}
	}

	public final Source_fileContext source_file() throws RecognitionException {
		Source_fileContext _localctx = new Source_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -9218815660663767044L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 777L) != 0) {
				{
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(244);
					statement();
					}
					break;
				case 2:
					{
					setState(245);
					expression_seq();
					}
					break;
				case 3:
					{
					setState(246);
					target_group();
					}
					break;
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Target_groupContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GleamParser.IF, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GleamParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GleamParser.RIGHT_BRACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Target_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterTarget_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitTarget_group(this);
		}
	}

	public final Target_groupContext target_group() throws RecognitionException {
		Target_groupContext _localctx = new Target_groupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_target_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(IF);
			{
			setState(255);
			identifier();
			}
			setState(256);
			match(LEFT_BRACE);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 19824L) != 0) {
				{
				{
				setState(257);
				statement();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(RIGHT_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GleamParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GleamParser.NAME, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(GleamParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(GleamParser.SLASH, i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(NAME);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(266);
				match(SLASH);
				setState(267);
				match(NAME);
				}
				}
				setState(272);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unqualified_importContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GleamParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GleamParser.NAME, i);
		}
		public TerminalNode AS() { return getToken(GleamParser.AS, 0); }
		public List<TerminalNode> UP_NAME() { return getTokens(GleamParser.UP_NAME); }
		public TerminalNode UP_NAME(int i) {
			return getToken(GleamParser.UP_NAME, i);
		}
		public Unqualified_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualified_import; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterUnqualified_import(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitUnqualified_import(this);
		}
	}

	public final Unqualified_importContext unqualified_import() throws RecognitionException {
		Unqualified_importContext _localctx = new Unqualified_importContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unqualified_import);
		int _la;
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(NAME);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(274);
					match(AS);
					setState(275);
					match(NAME);
					}
				}

				}
				break;
			case UP_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(UP_NAME);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(279);
					match(AS);
					setState(280);
					match(UP_NAME);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class Unqualified_importsContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(GleamParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GleamParser.RIGHT_BRACE, 0); }
		public List<Unqualified_importContext> unqualified_import() {
			return getRuleContexts(Unqualified_importContext.class);
		}
		public Unqualified_importContext unqualified_import(int i) {
			return getRuleContext(Unqualified_importContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Unqualified_importsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualified_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterUnqualified_imports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitUnqualified_imports(this);
		}
	}

	public final Unqualified_importsContext unqualified_imports() throws RecognitionException {
		Unqualified_importsContext _localctx = new Unqualified_importsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unqualified_imports);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(LEFT_BRACE);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME || _la==UP_NAME) {
				{
				setState(286);
				unqualified_import();
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(287);
						match(COMMA);
						setState(288);
						unqualified_import();
						}
						} 
					}
					setState(293);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(294);
					match(COMMA);
					}
				}

				}
			}

			setState(299);
			match(RIGHT_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(GleamParser.IMPORT, 0); }
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GleamParser.DOT, 0); }
		public Unqualified_importsContext unqualified_imports() {
			return getRuleContext(Unqualified_importsContext.class,0);
		}
		public TerminalNode AS() { return getToken(GleamParser.AS, 0); }
		public TerminalNode NAME() { return getToken(GleamParser.NAME, 0); }
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitImports(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(IMPORT);
			setState(302);
			module();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(303);
				match(DOT);
				setState(304);
				unqualified_imports();
				}
			}

			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(307);
				match(AS);
				setState(308);
				match(NAME);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_function_parameter_typesContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<Constant_type_specialContext> constant_type_special() {
			return getRuleContexts(Constant_type_specialContext.class);
		}
		public Constant_type_specialContext constant_type_special(int i) {
			return getRuleContext(Constant_type_specialContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Constant_function_parameter_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_function_parameter_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_function_parameter_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_function_parameter_types(this);
		}
	}

	public final Constant_function_parameter_typesContext constant_function_parameter_types() throws RecognitionException {
		Constant_function_parameter_typesContext _localctx = new Constant_function_parameter_typesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constant_function_parameter_types);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(LEFT_PAREN);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 432345839105474561L) != 0) {
				{
				setState(312);
				constant_type_special();
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(313);
						match(COMMA);
						setState(314);
						constant_type_special();
						}
						} 
					}
					setState(319);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(320);
					match(COMMA);
					}
				}

				}
			}

			setState(325);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_type_functionContext extends ParserRuleContext {
		public TerminalNode FN() { return getToken(GleamParser.FN, 0); }
		public TerminalNode R_ARROW() { return getToken(GleamParser.R_ARROW, 0); }
		public Constant_type_specialContext constant_type_special() {
			return getRuleContext(Constant_type_specialContext.class,0);
		}
		public Constant_function_parameter_typesContext constant_function_parameter_types() {
			return getRuleContext(Constant_function_parameter_typesContext.class,0);
		}
		public Constant_type_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_type_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_type_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_type_function(this);
		}
	}

	public final Constant_type_functionContext constant_type_function() throws RecognitionException {
		Constant_type_functionContext _localctx = new Constant_type_functionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant_type_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(FN);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(328);
				constant_function_parameter_types();
				}
			}

			setState(331);
			match(R_ARROW);
			setState(332);
			constant_type_special();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_tupleContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(GleamParser.HASH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<Constant_valueContext> constant_value() {
			return getRuleContexts(Constant_valueContext.class);
		}
		public Constant_valueContext constant_value(int i) {
			return getRuleContext(Constant_valueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Constant_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_tuple(this);
		}
	}

	public final Constant_tupleContext constant_tuple() throws RecognitionException {
		Constant_tupleContext _localctx = new Constant_tupleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constant_tuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(HASH);
			setState(335);
			match(LEFT_PAREN);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 218846863380447251L) != 0) {
				{
				setState(336);
				constant_value();
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(337);
						match(COMMA);
						setState(338);
						constant_value();
						}
						} 
					}
					setState(343);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(344);
					match(COMMA);
					}
				}

				}
			}

			setState(349);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_type_tupleContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(GleamParser.HASH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<Constant_type_specialContext> constant_type_special() {
			return getRuleContexts(Constant_type_specialContext.class);
		}
		public Constant_type_specialContext constant_type_special(int i) {
			return getRuleContext(Constant_type_specialContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Constant_type_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_type_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_type_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_type_tuple(this);
		}
	}

	public final Constant_type_tupleContext constant_type_tuple() throws RecognitionException {
		Constant_type_tupleContext _localctx = new Constant_type_tupleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constant_type_tuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(HASH);
			setState(352);
			match(LEFT_PAREN);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 432345839105474561L) != 0) {
				{
				setState(353);
				constant_type_special();
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(354);
						match(COMMA);
						setState(355);
						constant_type_special();
						}
						} 
					}
					setState(360);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(361);
					match(COMMA);
					}
				}

				}
			}

			setState(366);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_type_arguementContext extends ParserRuleContext {
		public Constant_type_specialContext constant_type_special() {
			return getRuleContext(Constant_type_specialContext.class,0);
		}
		public Constant_type_arguementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_type_arguement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_type_arguement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_type_arguement(this);
		}
	}

	public final Constant_type_arguementContext constant_type_arguement() throws RecognitionException {
		Constant_type_arguementContext _localctx = new Constant_type_arguementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constant_type_arguement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			constant_type_special();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_type_arguementsContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<Constant_type_arguementContext> constant_type_arguement() {
			return getRuleContexts(Constant_type_arguementContext.class);
		}
		public Constant_type_arguementContext constant_type_arguement(int i) {
			return getRuleContext(Constant_type_arguementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Constant_type_arguementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_type_arguements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_type_arguements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_type_arguements(this);
		}
	}

	public final Constant_type_arguementsContext constant_type_arguements() throws RecognitionException {
		Constant_type_arguementsContext _localctx = new Constant_type_arguementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constant_type_arguements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(LEFT_PAREN);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 432345839105474561L) != 0) {
				{
				setState(371);
				constant_type_arguement();
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(372);
						match(COMMA);
						setState(373);
						constant_type_arguement();
						}
						} 
					}
					setState(378);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(379);
					match(COMMA);
					}
				}

				}
			}

			setState(384);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_listContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE() { return getToken(GleamParser.LEFT_SQUARE, 0); }
		public TerminalNode RIGHT_SQUARE() { return getToken(GleamParser.RIGHT_SQUARE, 0); }
		public List<Constant_valueContext> constant_value() {
			return getRuleContexts(Constant_valueContext.class);
		}
		public Constant_valueContext constant_value(int i) {
			return getRuleContext(Constant_valueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Constant_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_list(this);
		}
	}

	public final Constant_listContext constant_list() throws RecognitionException {
		Constant_listContext _localctx = new Constant_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constant_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(LEFT_SQUARE);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 218846863380447251L) != 0) {
				{
				setState(387);
				constant_value();
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(388);
						match(COMMA);
						setState(389);
						constant_value();
						}
						} 
					}
					setState(394);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(395);
					match(COMMA);
					}
				}

				}
			}

			setState(400);
			match(RIGHT_SQUARE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_record_argumentContext extends ParserRuleContext {
		public Constant_valueContext constant_value() {
			return getRuleContext(Constant_valueContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GleamParser.COLON, 0); }
		public Constant_record_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_record_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_record_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_record_argument(this);
		}
	}

	public final Constant_record_argumentContext constant_record_argument() throws RecognitionException {
		Constant_record_argumentContext _localctx = new Constant_record_argumentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constant_record_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(402);
				label();
				setState(403);
				match(COLON);
				}
				break;
			}
			setState(407);
			constant_value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_record_argumentsContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<Constant_record_argumentContext> constant_record_argument() {
			return getRuleContexts(Constant_record_argumentContext.class);
		}
		public Constant_record_argumentContext constant_record_argument(int i) {
			return getRuleContext(Constant_record_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Constant_record_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_record_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_record_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_record_arguments(this);
		}
	}

	public final Constant_record_argumentsContext constant_record_arguments() throws RecognitionException {
		Constant_record_argumentsContext _localctx = new Constant_record_argumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constant_record_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(LEFT_PAREN);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 218846863380447251L) != 0) {
				{
				setState(410);
				constant_record_argument();
				{
				setState(411);
				match(COMMA);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 218846863380447251L) != 0) {
					{
					{
					setState(412);
					constant_record_argument();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(418);
					match(COMMA);
					}
				}

				}
				}
			}

			setState(423);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_recordContext extends ParserRuleContext {
		public Constructor_nameContext constructor_name() {
			return getRuleContext(Constructor_nameContext.class,0);
		}
		public Remote_constructor_nameContext remote_constructor_name() {
			return getRuleContext(Remote_constructor_nameContext.class,0);
		}
		public Constant_record_argumentsContext constant_record_arguments() {
			return getRuleContext(Constant_record_argumentsContext.class,0);
		}
		public Constant_recordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_record(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_record(this);
		}
	}

	public final Constant_recordContext constant_record() throws RecognitionException {
		Constant_recordContext _localctx = new Constant_recordContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constant_record);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_NAME:
				{
				setState(425);
				constructor_name();
				}
				break;
			case NAME:
				{
				setState(426);
				remote_constructor_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(429);
				constant_record_arguments();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bit_string_segment_option_sizeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode INTEGER() { return getToken(GleamParser.INTEGER, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public Bit_string_segment_option_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_string_segment_option_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterBit_string_segment_option_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitBit_string_segment_option_size(this);
		}
	}

	public final Bit_string_segment_option_sizeContext bit_string_segment_option_size() throws RecognitionException {
		Bit_string_segment_option_sizeContext _localctx = new Bit_string_segment_option_sizeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bit_string_segment_option_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			identifier();
			setState(433);
			match(LEFT_PAREN);
			setState(434);
			match(INTEGER);
			setState(435);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bit_string_named_segment_optionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Bit_string_segment_option_sizeContext bit_string_segment_option_size() {
			return getRuleContext(Bit_string_segment_option_sizeContext.class,0);
		}
		public Bit_string_named_segment_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_string_named_segment_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterBit_string_named_segment_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitBit_string_named_segment_option(this);
		}
	}

	public final Bit_string_named_segment_optionContext bit_string_named_segment_option() throws RecognitionException {
		Bit_string_named_segment_optionContext _localctx = new Bit_string_named_segment_optionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bit_string_named_segment_option);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				bit_string_segment_option_size();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bit_string_segment_optionContext extends ParserRuleContext {
		public Bit_string_named_segment_optionContext bit_string_named_segment_option() {
			return getRuleContext(Bit_string_named_segment_optionContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(GleamParser.INTEGER, 0); }
		public Bit_string_segment_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_string_segment_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterBit_string_segment_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitBit_string_segment_option(this);
		}
	}

	public final Bit_string_segment_optionContext bit_string_segment_option() throws RecognitionException {
		Bit_string_segment_optionContext _localctx = new Bit_string_segment_optionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bit_string_segment_option);
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				bit_string_named_segment_option();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(INTEGER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bit_string_segment_optionsContext extends ParserRuleContext {
		public List<Bit_string_segment_optionContext> bit_string_segment_option() {
			return getRuleContexts(Bit_string_segment_optionContext.class);
		}
		public Bit_string_segment_optionContext bit_string_segment_option(int i) {
			return getRuleContext(Bit_string_segment_optionContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(GleamParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(GleamParser.MINUS, i);
		}
		public Bit_string_segment_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_string_segment_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterBit_string_segment_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitBit_string_segment_options(this);
		}
	}

	public final Bit_string_segment_optionsContext bit_string_segment_options() throws RecognitionException {
		Bit_string_segment_optionsContext _localctx = new Bit_string_segment_optionsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bit_string_segment_options);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			bit_string_segment_option();
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(446);
					match(MINUS);
					setState(447);
					bit_string_segment_option();
					}
					} 
				}
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(453);
				match(MINUS);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_bit_string_segmentContext extends ParserRuleContext {
		public Constant_valueContext constant_value() {
			return getRuleContext(Constant_valueContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GleamParser.COLON, 0); }
		public Bit_string_segment_optionsContext bit_string_segment_options() {
			return getRuleContext(Bit_string_segment_optionsContext.class,0);
		}
		public Constant_bit_string_segmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_bit_string_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_bit_string_segment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_bit_string_segment(this);
		}
	}

	public final Constant_bit_string_segmentContext constant_bit_string_segment() throws RecognitionException {
		Constant_bit_string_segmentContext _localctx = new Constant_bit_string_segmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constant_bit_string_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			constant_value();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(457);
				match(COLON);
				setState(458);
				bit_string_segment_options();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_bit_stringContext extends ParserRuleContext {
		public TerminalNode LT_LT() { return getToken(GleamParser.LT_LT, 0); }
		public TerminalNode GT_GT() { return getToken(GleamParser.GT_GT, 0); }
		public List<Constant_bit_string_segmentContext> constant_bit_string_segment() {
			return getRuleContexts(Constant_bit_string_segmentContext.class);
		}
		public Constant_bit_string_segmentContext constant_bit_string_segment(int i) {
			return getRuleContext(Constant_bit_string_segmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Constant_bit_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_bit_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_bit_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_bit_string(this);
		}
	}

	public final Constant_bit_stringContext constant_bit_string() throws RecognitionException {
		Constant_bit_stringContext _localctx = new Constant_bit_stringContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constant_bit_string);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(LT_LT);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 218846863380447251L) != 0) {
				{
				setState(462);
				constant_bit_string_segment();
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(463);
						match(COMMA);
						setState(464);
						constant_bit_string_segment();
						}
						} 
					}
					setState(469);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(470);
					match(COMMA);
					}
				}

				}
			}

			setState(475);
			match(GT_GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_typeContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Remote_type_identifierContext remote_type_identifier() {
			return getRuleContext(Remote_type_identifierContext.class,0);
		}
		public Constant_type_arguementsContext constant_type_arguements() {
			return getRuleContext(Constant_type_arguementsContext.class,0);
		}
		public Constant_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_type(this);
		}
	}

	public final Constant_typeContext constant_type() throws RecognitionException {
		Constant_typeContext _localctx = new Constant_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constant_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_NAME:
				{
				setState(477);
				type_identifier();
				}
				break;
			case NAME:
				{
				setState(478);
				remote_type_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(481);
				constant_type_arguements();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_type_specialContext extends ParserRuleContext {
		public Type_holeContext type_hole() {
			return getRuleContext(Type_holeContext.class,0);
		}
		public Constant_type_tupleContext constant_type_tuple() {
			return getRuleContext(Constant_type_tupleContext.class,0);
		}
		public Constant_type_functionContext constant_type_function() {
			return getRuleContext(Constant_type_functionContext.class,0);
		}
		public Constant_typeContext constant_type() {
			return getRuleContext(Constant_typeContext.class,0);
		}
		public Constant_type_specialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_type_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_type_special(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_type_special(this);
		}
	}

	public final Constant_type_specialContext constant_type_special() throws RecognitionException {
		Constant_type_specialContext _localctx = new Constant_type_specialContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constant_type_special);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				type_hole();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				constant_type_tuple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				constant_type_function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				constant_type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_type_annotationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(GleamParser.COLON, 0); }
		public Constant_typeContext constant_type() {
			return getRuleContext(Constant_typeContext.class,0);
		}
		public Constant_type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_type_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_type_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_type_annotation(this);
		}
	}

	public final Constant_type_annotationContext constant_type_annotation() throws RecognitionException {
		Constant_type_annotationContext _localctx = new Constant_type_annotationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constant_type_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(COLON);
			setState(491);
			constant_type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_field_accessContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GleamParser.DOT, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Constant_field_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_field_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_field_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_field_access(this);
		}
	}

	public final Constant_field_accessContext constant_field_access() throws RecognitionException {
		Constant_field_accessContext _localctx = new Constant_field_accessContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constant_field_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			identifier();
			setState(494);
			match(DOT);
			setState(495);
			label();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_valueContext extends ParserRuleContext {
		public Constant_tupleContext constant_tuple() {
			return getRuleContext(Constant_tupleContext.class,0);
		}
		public Constant_listContext constant_list() {
			return getRuleContext(Constant_listContext.class,0);
		}
		public Constant_bit_stringContext constant_bit_string() {
			return getRuleContext(Constant_bit_stringContext.class,0);
		}
		public Constant_recordContext constant_record() {
			return getRuleContext(Constant_recordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Constant_field_accessContext constant_field_access() {
			return getRuleContext(Constant_field_accessContext.class,0);
		}
		public Expression_literalContext expression_literal() {
			return getRuleContext(Expression_literalContext.class,0);
		}
		public Constant_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant_value(this);
		}
	}

	public final Constant_valueContext constant_value() throws RecognitionException {
		Constant_valueContext _localctx = new Constant_valueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constant_value);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				constant_tuple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				constant_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				constant_bit_string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(500);
				constant_record();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(501);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(502);
				constant_field_access();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(503);
				expression_literal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GleamParser.CONST, 0); }
		public TerminalNode NAME() { return getToken(GleamParser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(GleamParser.EQUAL, 0); }
		public Constant_valueContext constant_value() {
			return getRuleContext(Constant_valueContext.class,0);
		}
		public Visibility_modifierContext visibility_modifier() {
			return getRuleContext(Visibility_modifierContext.class,0);
		}
		public Constant_type_annotationContext constant_type_annotation() {
			return getRuleContext(Constant_type_annotationContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUB) {
				{
				setState(506);
				visibility_modifier();
				}
			}

			setState(509);
			match(CONST);
			setState(510);
			match(NAME);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(511);
				constant_type_annotation();
				}
			}

			setState(514);
			match(EQUAL);
			setState(515);
			constant_value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_parametersContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<Type_parameterContext> type_parameter() {
			return getRuleContexts(Type_parameterContext.class);
		}
		public Type_parameterContext type_parameter(int i) {
			return getRuleContext(Type_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Type_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterType_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitType_parameters(this);
		}
	}

	public final Type_parametersContext type_parameters() throws RecognitionException {
		Type_parametersContext _localctx = new Type_parametersContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_type_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(LEFT_PAREN);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(518);
				type_parameter();
				setState(523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(519);
						match(COMMA);
						setState(520);
						type_parameter();
						}
						} 
					}
					setState(525);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(526);
					match(COMMA);
					}
				}

				}
			}

			setState(531);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_nameContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Remote_type_identifierContext remote_type_identifier() {
			return getRuleContext(Remote_type_identifierContext.class,0);
		}
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_NAME:
				{
				setState(533);
				type_identifier();
				}
				break;
			case NAME:
				{
				setState(534);
				remote_type_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(537);
				type_parameters();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class External_typeContext extends ParserRuleContext {
		public TerminalNode EXTERNAL() { return getToken(GleamParser.EXTERNAL, 0); }
		public TerminalNode TYPE() { return getToken(GleamParser.TYPE, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Visibility_modifierContext visibility_modifier() {
			return getRuleContext(Visibility_modifierContext.class,0);
		}
		public External_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterExternal_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitExternal_type(this);
		}
	}

	public final External_typeContext external_type() throws RecognitionException {
		External_typeContext _localctx = new External_typeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_external_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUB) {
				{
				setState(540);
				visibility_modifier();
				}
			}

			setState(543);
			match(EXTERNAL);
			setState(544);
			match(TYPE);
			setState(545);
			type_name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_parameter_typesContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<Type_baseContext> type_base() {
			return getRuleContexts(Type_baseContext.class);
		}
		public Type_baseContext type_base(int i) {
			return getRuleContext(Type_baseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Function_parameter_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterFunction_parameter_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitFunction_parameter_types(this);
		}
	}

	public final Function_parameter_typesContext function_parameter_types() throws RecognitionException {
		Function_parameter_typesContext _localctx = new Function_parameter_typesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_function_parameter_types);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(LEFT_PAREN);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 432345839105474561L) != 0) {
				{
				setState(548);
				type_base();
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(549);
						match(COMMA);
						setState(550);
						type_base();
						}
						} 
					}
					setState(555);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(556);
					match(COMMA);
					}
				}

				}
			}

			setState(561);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_typeContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(GleamParser.HASH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<Type_baseContext> type_base() {
			return getRuleContexts(Type_baseContext.class);
		}
		public Type_baseContext type_base(int i) {
			return getRuleContext(Type_baseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterTuple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitTuple_type(this);
		}
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tuple_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(HASH);
			setState(564);
			match(LEFT_PAREN);
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 432345839105474561L) != 0) {
				{
				setState(565);
				type_base();
				setState(570);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(566);
						match(COMMA);
						setState(567);
						type_base();
						}
						} 
					}
					setState(572);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(573);
					match(COMMA);
					}
				}

				}
			}

			setState(578);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_typeContext extends ParserRuleContext {
		public TerminalNode FN() { return getToken(GleamParser.FN, 0); }
		public TerminalNode R_ARROW() { return getToken(GleamParser.R_ARROW, 0); }
		public Type_baseContext type_base() {
			return getRuleContext(Type_baseContext.class,0);
		}
		public Function_parameter_typesContext function_parameter_types() {
			return getRuleContext(Function_parameter_typesContext.class,0);
		}
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterFunction_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitFunction_type(this);
		}
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(FN);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(581);
				function_parameter_types();
				}
			}

			setState(584);
			match(R_ARROW);
			setState(585);
			type_base();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_baseContext extends ParserRuleContext {
		public Type_holeContext type_hole() {
			return getRuleContext(Type_holeContext.class,0);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_varContext type_var() {
			return getRuleContext(Type_varContext.class,0);
		}
		public Type_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterType_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitType_base(this);
		}
	}

	public final Type_baseContext type_base() throws RecognitionException {
		Type_baseContext _localctx = new Type_baseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type_base);
		try {
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				type_hole();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				tuple_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				function_type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(590);
				type();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(591);
				type_var();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_annotationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(GleamParser.COLON, 0); }
		public Type_baseContext type_base() {
			return getRuleContext(Type_baseContext.class,0);
		}
		public Type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterType_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitType_annotation(this);
		}
	}

	public final Type_annotationContext type_annotation() throws RecognitionException {
		Type_annotationContext _localctx = new Type_annotationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_type_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(COLON);
			setState(595);
			type_base();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_argumentContext extends ParserRuleContext {
		public Type_baseContext type_base() {
			return getRuleContext(Type_baseContext.class,0);
		}
		public Type_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterType_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitType_argument(this);
		}
	}

	public final Type_argumentContext type_argument() throws RecognitionException {
		Type_argumentContext _localctx = new Type_argumentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			type_base();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_argumentsContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<Type_argumentContext> type_argument() {
			return getRuleContexts(Type_argumentContext.class);
		}
		public Type_argumentContext type_argument(int i) {
			return getRuleContext(Type_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Type_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterType_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitType_arguments(this);
		}
	}

	public final Type_argumentsContext type_arguments() throws RecognitionException {
		Type_argumentsContext _localctx = new Type_argumentsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_type_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(LEFT_PAREN);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 432345839105474561L) != 0) {
				{
				setState(600);
				type_argument();
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(601);
						match(COMMA);
						setState(602);
						type_argument();
						}
						} 
					}
					setState(607);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(608);
					match(COMMA);
					}
				}

				}
			}

			setState(613);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Remote_type_identifierContext remote_type_identifier() {
			return getRuleContext(Remote_type_identifierContext.class,0);
		}
		public Type_argumentsContext type_arguments() {
			return getRuleContext(Type_argumentsContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_NAME:
				{
				setState(615);
				type_identifier();
				}
				break;
			case NAME:
				{
				setState(616);
				remote_type_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(619);
				type_arguments();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class External_function_bodyContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(GleamParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GleamParser.STRING, i);
		}
		public External_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterExternal_function_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitExternal_function_body(this);
		}
	}

	public final External_function_bodyContext external_function_body() throws RecognitionException {
		External_function_bodyContext _localctx = new External_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_external_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(STRING);
			setState(623);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class External_function_parameterContext extends ParserRuleContext {
		public Type_baseContext type_base() {
			return getRuleContext(Type_baseContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GleamParser.COLON, 0); }
		public External_function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_function_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterExternal_function_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitExternal_function_parameter(this);
		}
	}

	public final External_function_parameterContext external_function_parameter() throws RecognitionException {
		External_function_parameterContext _localctx = new External_function_parameterContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_external_function_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(625);
				identifier();
				setState(626);
				match(COLON);
				}
				break;
			}
			setState(630);
			type_base();
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

	@SuppressWarnings("CheckReturnValue")
	public static class External_function_parametersContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<External_function_parameterContext> external_function_parameter() {
			return getRuleContexts(External_function_parameterContext.class);
		}
		public External_function_parameterContext external_function_parameter(int i) {
			return getRuleContext(External_function_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public External_function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterExternal_function_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitExternal_function_parameters(this);
		}
	}

	public final External_function_parametersContext external_function_parameters() throws RecognitionException {
		External_function_parametersContext _localctx = new External_function_parametersContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_external_function_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(LEFT_PAREN);
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 432345839105474561L) != 0) {
				{
				setState(633);
				external_function_parameter();
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(634);
						match(COMMA);
						setState(635);
						external_function_parameter();
						}
						} 
					}
					setState(640);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(641);
					match(COMMA);
					}
				}

				}
			}

			setState(646);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class External_functionContext extends ParserRuleContext {
		public TerminalNode EXTERNAL() { return getToken(GleamParser.EXTERNAL, 0); }
		public TerminalNode FN() { return getToken(GleamParser.FN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public External_function_parametersContext external_function_parameters() {
			return getRuleContext(External_function_parametersContext.class,0);
		}
		public TerminalNode R_ARROW() { return getToken(GleamParser.R_ARROW, 0); }
		public Type_baseContext type_base() {
			return getRuleContext(Type_baseContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(GleamParser.EQUAL, 0); }
		public External_function_bodyContext external_function_body() {
			return getRuleContext(External_function_bodyContext.class,0);
		}
		public Visibility_modifierContext visibility_modifier() {
			return getRuleContext(Visibility_modifierContext.class,0);
		}
		public External_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterExternal_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitExternal_function(this);
		}
	}

	public final External_functionContext external_function() throws RecognitionException {
		External_functionContext _localctx = new External_functionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_external_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUB) {
				{
				setState(648);
				visibility_modifier();
				}
			}

			setState(651);
			match(EXTERNAL);
			setState(652);
			match(FN);
			setState(653);
			identifier();
			setState(654);
			external_function_parameters();
			setState(655);
			match(R_ARROW);
			setState(656);
			type_base();
			setState(657);
			match(EQUAL);
			setState(658);
			external_function_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_parameter_argsContext extends ParserRuleContext {
		public Labeled_discard_paramContext labeled_discard_param() {
			return getRuleContext(Labeled_discard_paramContext.class,0);
		}
		public Discard_paramContext discard_param() {
			return getRuleContext(Discard_paramContext.class,0);
		}
		public Labeled_name_paramContext labeled_name_param() {
			return getRuleContext(Labeled_name_paramContext.class,0);
		}
		public Name_paramContext name_param() {
			return getRuleContext(Name_paramContext.class,0);
		}
		public Function_parameter_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterFunction_parameter_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitFunction_parameter_args(this);
		}
	}

	public final Function_parameter_argsContext function_parameter_args() throws RecognitionException {
		Function_parameter_argsContext _localctx = new Function_parameter_argsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_function_parameter_args);
		try {
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				labeled_discard_param();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				discard_param();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(662);
				labeled_name_param();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(663);
				name_param();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_parameterContext extends ParserRuleContext {
		public Function_parameter_argsContext function_parameter_args() {
			return getRuleContext(Function_parameter_argsContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterFunction_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitFunction_parameter(this);
		}
	}

	public final Function_parameterContext function_parameter() throws RecognitionException {
		Function_parameterContext _localctx = new Function_parameterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_function_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			function_parameter_args();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(667);
				type_annotation();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_parametersContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<Function_parameterContext> function_parameter() {
			return getRuleContexts(Function_parameterContext.class);
		}
		public Function_parameterContext function_parameter(int i) {
			return getRuleContext(Function_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterFunction_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitFunction_parameters(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_function_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(LEFT_PAREN);
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME || _la==DISCARD_NAME) {
				{
				setState(671);
				function_parameter();
				setState(676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(672);
						match(COMMA);
						setState(673);
						function_parameter();
						}
						} 
					}
					setState(678);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(679);
					match(COMMA);
					}
				}

				}
			}

			setState(684);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(GleamParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GleamParser.RIGHT_BRACE, 0); }
		public Expression_seqContext expression_seq() {
			return getRuleContext(Expression_seqContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitFunction_body(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(LEFT_BRACE);
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -9218815660663786932L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 777L) != 0) {
				{
				setState(687);
				expression_seq();
				}
			}

			setState(690);
			match(RIGHT_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FN() { return getToken(GleamParser.FN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Visibility_modifierContext visibility_modifier() {
			return getRuleContext(Visibility_modifierContext.class,0);
		}
		public TerminalNode R_ARROW() { return getToken(GleamParser.R_ARROW, 0); }
		public Type_baseContext type_base() {
			return getRuleContext(Type_baseContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUB) {
				{
				setState(692);
				visibility_modifier();
				}
			}

			setState(695);
			match(FN);
			setState(696);
			identifier();
			setState(697);
			function_parameters();
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==R_ARROW) {
				{
				setState(698);
				match(R_ARROW);
				setState(699);
				type_base();
				}
			}

			setState(702);
			function_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_pattern_tailContext extends ParserRuleContext {
		public TerminalNode DOT_DOT() { return getToken(GleamParser.DOT_DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DiscardContext discard() {
			return getRuleContext(DiscardContext.class,0);
		}
		public List_pattern_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_pattern_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterList_pattern_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitList_pattern_tail(this);
		}
	}

	public final List_pattern_tailContext list_pattern_tail() throws RecognitionException {
		List_pattern_tailContext _localctx = new List_pattern_tailContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_list_pattern_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(DOT_DOT);
			setState(707);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(705);
				identifier();
				}
				break;
			case DISCARD_NAME:
				{
				setState(706);
				discard();
				}
				break;
			case RIGHT_SQUARE:
				break;
			default:
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_patternContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE() { return getToken(GleamParser.LEFT_SQUARE, 0); }
		public TerminalNode RIGHT_SQUARE() { return getToken(GleamParser.RIGHT_SQUARE, 0); }
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List_pattern_tailContext list_pattern_tail() {
			return getRuleContext(List_pattern_tailContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public List_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterList_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitList_pattern(this);
		}
	}

	public final List_patternContext list_pattern() throws RecognitionException {
		List_patternContext _localctx = new List_patternContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_list_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(LEFT_SQUARE);
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 219409813333868563L) != 0) {
				{
				setState(710);
				pattern();
				setState(715);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(711);
						match(COMMA);
						setState(712);
						pattern();
						}
						} 
					}
					setState(717);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(718);
					match(COMMA);
					}
				}

				}
			}

			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_DOT) {
				{
				setState(723);
				list_pattern_tail();
				}
			}

			setState(726);
			match(RIGHT_SQUARE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pattern_bit_string_segmentContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GleamParser.COLON, 0); }
		public Bit_string_segment_optionsContext bit_string_segment_options() {
			return getRuleContext(Bit_string_segment_optionsContext.class,0);
		}
		public Pattern_bit_string_segmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_bit_string_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterPattern_bit_string_segment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitPattern_bit_string_segment(this);
		}
	}

	public final Pattern_bit_string_segmentContext pattern_bit_string_segment() throws RecognitionException {
		Pattern_bit_string_segmentContext _localctx = new Pattern_bit_string_segmentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_pattern_bit_string_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			pattern();
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(729);
				match(COLON);
				setState(730);
				bit_string_segment_options();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pattern_bit_stringContext extends ParserRuleContext {
		public TerminalNode LT_LT() { return getToken(GleamParser.LT_LT, 0); }
		public TerminalNode GT_GT() { return getToken(GleamParser.GT_GT, 0); }
		public List<Pattern_bit_string_segmentContext> pattern_bit_string_segment() {
			return getRuleContexts(Pattern_bit_string_segmentContext.class);
		}
		public Pattern_bit_string_segmentContext pattern_bit_string_segment(int i) {
			return getRuleContext(Pattern_bit_string_segmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Pattern_bit_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_bit_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterPattern_bit_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitPattern_bit_string(this);
		}
	}

	public final Pattern_bit_stringContext pattern_bit_string() throws RecognitionException {
		Pattern_bit_stringContext _localctx = new Pattern_bit_stringContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_pattern_bit_string);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(LT_LT);
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 219409813333868563L) != 0) {
				{
				setState(734);
				pattern_bit_string_segment();
				setState(739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(735);
						match(COMMA);
						setState(736);
						pattern_bit_string_segment();
						}
						} 
					}
					setState(741);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(742);
					match(COMMA);
					}
				}

				}
			}

			setState(747);
			match(GT_GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_patternContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(GleamParser.HASH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Tuple_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterTuple_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitTuple_pattern(this);
		}
	}

	public final Tuple_patternContext tuple_pattern() throws RecognitionException {
		Tuple_patternContext _localctx = new Tuple_patternContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_tuple_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(HASH);
			setState(750);
			match(LEFT_PAREN);
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 219409813333868563L) != 0) {
				{
				setState(751);
				pattern();
				setState(756);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(752);
						match(COMMA);
						setState(753);
						pattern();
						}
						} 
					}
					setState(758);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(759);
					match(COMMA);
					}
				}

				}
			}

			setState(764);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pattern_spreadContext extends ParserRuleContext {
		public TerminalNode DOT_DOT() { return getToken(GleamParser.DOT_DOT, 0); }
		public TerminalNode COMMA() { return getToken(GleamParser.COMMA, 0); }
		public Pattern_spreadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_spread; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterPattern_spread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitPattern_spread(this);
		}
	}

	public final Pattern_spreadContext pattern_spread() throws RecognitionException {
		Pattern_spreadContext _localctx = new Pattern_spreadContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_pattern_spread);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(766);
			match(DOT_DOT);
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(767);
				match(COMMA);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class Record_pattern_argumentContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GleamParser.COLON, 0); }
		public Record_pattern_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_pattern_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterRecord_pattern_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitRecord_pattern_argument(this);
		}
	}

	public final Record_pattern_argumentContext record_pattern_argument() throws RecognitionException {
		Record_pattern_argumentContext _localctx = new Record_pattern_argumentContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_record_pattern_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(770);
				label();
				setState(771);
				match(COLON);
				}
				break;
			}
			setState(775);
			pattern();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Record_pattern_argumentsContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<Record_pattern_argumentContext> record_pattern_argument() {
			return getRuleContexts(Record_pattern_argumentContext.class);
		}
		public Record_pattern_argumentContext record_pattern_argument(int i) {
			return getRuleContext(Record_pattern_argumentContext.class,i);
		}
		public Pattern_spreadContext pattern_spread() {
			return getRuleContext(Pattern_spreadContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Record_pattern_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_pattern_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterRecord_pattern_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitRecord_pattern_arguments(this);
		}
	}

	public final Record_pattern_argumentsContext record_pattern_arguments() throws RecognitionException {
		Record_pattern_argumentsContext _localctx = new Record_pattern_argumentsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_record_pattern_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(LEFT_PAREN);
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 219409813333868563L) != 0) {
				{
				setState(778);
				record_pattern_argument();
				setState(783);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(779);
						match(COMMA);
						setState(780);
						record_pattern_argument();
						}
						} 
					}
					setState(785);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(786);
					match(COMMA);
					}
				}

				}
			}

			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_DOT) {
				{
				setState(791);
				pattern_spread();
				}
			}

			setState(794);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Record_patternContext extends ParserRuleContext {
		public Constructor_nameContext constructor_name() {
			return getRuleContext(Constructor_nameContext.class,0);
		}
		public Remote_constructor_nameContext remote_constructor_name() {
			return getRuleContext(Remote_constructor_nameContext.class,0);
		}
		public Record_pattern_argumentsContext record_pattern_arguments() {
			return getRuleContext(Record_pattern_argumentsContext.class,0);
		}
		public Record_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterRecord_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitRecord_pattern(this);
		}
	}

	public final Record_patternContext record_pattern() throws RecognitionException {
		Record_patternContext _localctx = new Record_patternContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_record_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_NAME:
				{
				setState(796);
				constructor_name();
				}
				break;
			case NAME:
				{
				setState(797);
				remote_constructor_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(800);
				record_pattern_arguments();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DiscardContext discard() {
			return getRuleContext(DiscardContext.class,0);
		}
		public Record_patternContext record_pattern() {
			return getRuleContext(Record_patternContext.class,0);
		}
		public Expression_literalContext expression_literal() {
			return getRuleContext(Expression_literalContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Pattern_bit_stringContext pattern_bit_string() {
			return getRuleContext(Pattern_bit_stringContext.class,0);
		}
		public List_patternContext list_pattern() {
			return getRuleContext(List_patternContext.class,0);
		}
		public TerminalNode AS() { return getToken(GleamParser.AS, 0); }
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(803);
				identifier();
				}
				break;
			case 2:
				{
				setState(804);
				discard();
				}
				break;
			case 3:
				{
				setState(805);
				record_pattern();
				}
				break;
			case 4:
				{
				setState(806);
				expression_literal();
				}
				break;
			case 5:
				{
				setState(807);
				tuple_pattern();
				}
				break;
			case 6:
				{
				setState(808);
				pattern_bit_string();
				}
				break;
			case 7:
				{
				setState(809);
				list_pattern();
				}
				break;
			}
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(812);
				match(AS);
				setState(813);
				identifier();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TryContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(GleamParser.TRY, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(GleamParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public TryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterTry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitTry(this);
		}
	}

	public final TryContext try_() throws RecognitionException {
		TryContext _localctx = new TryContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_try);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(TRY);
			setState(817);
			pattern();
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(818);
				type_annotation();
				}
			}

			setState(821);
			match(EQUAL);
			setState(822);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_seqContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TryContext> try_() {
			return getRuleContexts(TryContext.class);
		}
		public TryContext try_(int i) {
			return getRuleContext(TryContext.class,i);
		}
		public Expression_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterExpression_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitExpression_seq(this);
		}
	}

	public final Expression_seqContext expression_seq() throws RecognitionException {
		Expression_seqContext _localctx = new Expression_seqContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_expression_seq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(826); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(826);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ASSERT:
					case CASE:
					case FN:
					case LET:
					case TODO:
					case USE:
					case TRUE:
					case FALSE:
					case LEFT_SQUARE:
					case LEFT_BRACE:
					case HASH:
					case BANG:
					case LT_LT:
					case NAME:
					case UP_NAME:
					case INTEGER:
					case FLOAT:
					case STRING:
						{
						setState(824);
						expression(0);
						}
						break;
					case TRY:
						{
						setState(825);
						try_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(828); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public HoleContext hole() {
			return getRuleContext(HoleContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GleamParser.COLON, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(830);
				label();
				setState(831);
				match(COLON);
				}
				break;
			}
			setState(837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISCARD_NAME:
				{
				setState(835);
				hole();
				}
				break;
			case ASSERT:
			case CASE:
			case FN:
			case LET:
			case TODO:
			case USE:
			case TRUE:
			case FALSE:
			case LEFT_SQUARE:
			case LEFT_BRACE:
			case HASH:
			case BANG:
			case LT_LT:
			case NAME:
			case UP_NAME:
			case INTEGER:
			case FLOAT:
			case STRING:
				{
				setState(836);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(LEFT_PAREN);
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -9218815660663795124L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 779L) != 0) {
				{
				setState(840);
				argument();
				setState(845);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(841);
						match(COMMA);
						setState(842);
						argument();
						}
						} 
					}
					setState(847);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(848);
					match(COMMA);
					}
				}

				}
			}

			setState(853);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RecordContext extends ParserRuleContext {
		public Constructor_nameContext constructor_name() {
			return getRuleContext(Constructor_nameContext.class,0);
		}
		public Remote_constructor_nameContext remote_constructor_name() {
			return getRuleContext(Remote_constructor_nameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitRecord(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_record);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_NAME:
				{
				setState(855);
				constructor_name();
				}
				break;
			case NAME:
				{
				setState(856);
				remote_constructor_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(859);
				arguments();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_bit_string_segmentContext extends ParserRuleContext {
		public Expression_unitContext expression_unit() {
			return getRuleContext(Expression_unitContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GleamParser.COLON, 0); }
		public Bit_string_segment_optionsContext bit_string_segment_options() {
			return getRuleContext(Bit_string_segment_optionsContext.class,0);
		}
		public Expression_bit_string_segmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_bit_string_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterExpression_bit_string_segment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitExpression_bit_string_segment(this);
		}
	}

	public final Expression_bit_string_segmentContext expression_bit_string_segment() throws RecognitionException {
		Expression_bit_string_segmentContext _localctx = new Expression_bit_string_segmentContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_expression_bit_string_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			expression_unit();
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(863);
				match(COLON);
				setState(864);
				bit_string_segment_options();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_bit_stringContext extends ParserRuleContext {
		public TerminalNode LT_LT() { return getToken(GleamParser.LT_LT, 0); }
		public TerminalNode GT_GT() { return getToken(GleamParser.GT_GT, 0); }
		public List<Expression_bit_string_segmentContext> expression_bit_string_segment() {
			return getRuleContexts(Expression_bit_string_segmentContext.class);
		}
		public Expression_bit_string_segmentContext expression_bit_string_segment(int i) {
			return getRuleContext(Expression_bit_string_segmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Expression_bit_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_bit_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterExpression_bit_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitExpression_bit_string(this);
		}
	}

	public final Expression_bit_stringContext expression_bit_string() throws RecognitionException {
		Expression_bit_stringContext _localctx = new Expression_bit_stringContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_expression_bit_string);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(LT_LT);
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -9218815660663795124L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 777L) != 0) {
				{
				setState(868);
				expression_bit_string_segment();
				setState(873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(869);
						match(COMMA);
						setState(870);
						expression_bit_string_segment();
						}
						} 
					}
					setState(875);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(876);
					match(COMMA);
					}
				}

				}
			}

			setState(881);
			match(GT_GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TodoContext extends ParserRuleContext {
		public TerminalNode TODO() { return getToken(GleamParser.TODO, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode STRING() { return getToken(GleamParser.STRING, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public TodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_todo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterTodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitTodo(this);
		}
	}

	public final TodoContext todo() throws RecognitionException {
		TodoContext _localctx = new TodoContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_todo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(TODO);
			setState(887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(884);
				match(LEFT_PAREN);
				setState(885);
				match(STRING);
				setState(886);
				match(RIGHT_PAREN);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(GleamParser.HASH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitTuple(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_tuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(HASH);
			setState(890);
			match(LEFT_PAREN);
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -9218815660663795124L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 777L) != 0) {
				{
				setState(891);
				expression(0);
				setState(896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(892);
						match(COMMA);
						setState(893);
						expression(0);
						}
						} 
					}
					setState(898);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(899);
					match(COMMA);
					}
				}

				}
			}

			setState(904);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE() { return getToken(GleamParser.LEFT_SQUARE, 0); }
		public TerminalNode RIGHT_SQUARE() { return getToken(GleamParser.RIGHT_SQUARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public TerminalNode DOT_DOT() { return getToken(GleamParser.DOT_DOT, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			match(LEFT_SQUARE);
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -9218815660663795124L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 777L) != 0) {
				{
				setState(907);
				expression(0);
				setState(915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(912);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(908);
							match(COMMA);
							setState(909);
							expression(0);
							}
							} 
						}
						setState(914);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
					}
					}
					break;
				}
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(917);
					match(COMMA);
					}
				}

				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_DOT) {
					{
					setState(920);
					match(DOT_DOT);
					setState(921);
					expression(0);
					}
				}

				}
			}

			setState(926);
			match(RIGHT_SQUARE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Anonymous_function_parameter_argsContext extends ParserRuleContext {
		public Discard_paramContext discard_param() {
			return getRuleContext(Discard_paramContext.class,0);
		}
		public Name_paramContext name_param() {
			return getRuleContext(Name_paramContext.class,0);
		}
		public Anonymous_function_parameter_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function_parameter_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterAnonymous_function_parameter_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitAnonymous_function_parameter_args(this);
		}
	}

	public final Anonymous_function_parameter_argsContext anonymous_function_parameter_args() throws RecognitionException {
		Anonymous_function_parameter_argsContext _localctx = new Anonymous_function_parameter_argsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_anonymous_function_parameter_args);
		try {
			setState(930);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISCARD_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				discard_param();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
				name_param();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Anonymous_function_parameterContext extends ParserRuleContext {
		public Anonymous_function_parameter_argsContext anonymous_function_parameter_args() {
			return getRuleContext(Anonymous_function_parameter_argsContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Anonymous_function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterAnonymous_function_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitAnonymous_function_parameter(this);
		}
	}

	public final Anonymous_function_parameterContext anonymous_function_parameter() throws RecognitionException {
		Anonymous_function_parameterContext _localctx = new Anonymous_function_parameterContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_anonymous_function_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			anonymous_function_parameter_args();
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(933);
				type_annotation();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Anonymous_function_parametersContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<Anonymous_function_parameterContext> anonymous_function_parameter() {
			return getRuleContexts(Anonymous_function_parameterContext.class);
		}
		public Anonymous_function_parameterContext anonymous_function_parameter(int i) {
			return getRuleContext(Anonymous_function_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Anonymous_function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterAnonymous_function_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitAnonymous_function_parameters(this);
		}
	}

	public final Anonymous_function_parametersContext anonymous_function_parameters() throws RecognitionException {
		Anonymous_function_parametersContext _localctx = new Anonymous_function_parametersContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_anonymous_function_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(LEFT_PAREN);
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME || _la==DISCARD_NAME) {
				{
				setState(937);
				anonymous_function_parameter();
				setState(942);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(938);
						match(COMMA);
						setState(939);
						anonymous_function_parameter();
						}
						} 
					}
					setState(944);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				}
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(945);
					match(COMMA);
					}
				}

				}
			}

			setState(950);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Anonymous_functionContext extends ParserRuleContext {
		public TerminalNode FN() { return getToken(GleamParser.FN, 0); }
		public Anonymous_function_parametersContext anonymous_function_parameters() {
			return getRuleContext(Anonymous_function_parametersContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode R_ARROW() { return getToken(GleamParser.R_ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Anonymous_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterAnonymous_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitAnonymous_function(this);
		}
	}

	public final Anonymous_functionContext anonymous_function() throws RecognitionException {
		Anonymous_functionContext _localctx = new Anonymous_functionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_anonymous_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(FN);
			setState(953);
			anonymous_function_parameters();
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==R_ARROW) {
				{
				setState(954);
				match(R_ARROW);
				setState(955);
				type();
				}
			}

			setState(958);
			function_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_groupContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(GleamParser.LEFT_BRACE, 0); }
		public Expression_seqContext expression_seq() {
			return getRuleContext(Expression_seqContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GleamParser.RIGHT_BRACE, 0); }
		public Expression_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterExpression_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitExpression_group(this);
		}
	}

	public final Expression_groupContext expression_group() throws RecognitionException {
		Expression_groupContext _localctx = new Expression_groupContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_expression_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(LEFT_BRACE);
			setState(961);
			expression_seq();
			setState(962);
			match(RIGHT_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_clause_tuple_accessContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GleamParser.DOT, 0); }
		public TerminalNode INTEGER() { return getToken(GleamParser.INTEGER, 0); }
		public Case_clause_tuple_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause_tuple_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterCase_clause_tuple_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitCase_clause_tuple_access(this);
		}
	}

	public final Case_clause_tuple_accessContext case_clause_tuple_access() throws RecognitionException {
		Case_clause_tuple_accessContext _localctx = new Case_clause_tuple_accessContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_case_clause_tuple_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			identifier();
			setState(965);
			match(DOT);
			setState(966);
			match(INTEGER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_clause_guard_unitContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Case_clause_tuple_accessContext case_clause_tuple_access() {
			return getRuleContext(Case_clause_tuple_accessContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(GleamParser.LEFT_BRACE, 0); }
		public Case_clause_guard_expressionContext case_clause_guard_expression() {
			return getRuleContext(Case_clause_guard_expressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GleamParser.RIGHT_BRACE, 0); }
		public Constant_valueContext constant_value() {
			return getRuleContext(Constant_valueContext.class,0);
		}
		public Case_clause_guard_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause_guard_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterCase_clause_guard_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitCase_clause_guard_unit(this);
		}
	}

	public final Case_clause_guard_unitContext case_clause_guard_unit() throws RecognitionException {
		Case_clause_guard_unitContext _localctx = new Case_clause_guard_unitContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_case_clause_guard_unit);
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				case_clause_tuple_access();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(970);
				match(LEFT_BRACE);
				setState(971);
				case_clause_guard_expression(0);
				setState(972);
				match(RIGHT_BRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(974);
				constant_value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_clause_guard_binary_operatorContext extends ParserRuleContext {
		public TerminalNode VBAR_VBAR() { return getToken(GleamParser.VBAR_VBAR, 0); }
		public TerminalNode AMPER_AMPER() { return getToken(GleamParser.AMPER_AMPER, 0); }
		public TerminalNode EQUAL_EQUAL() { return getToken(GleamParser.EQUAL_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(GleamParser.NOT_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(GleamParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(GleamParser.LESS_EQUAL, 0); }
		public TerminalNode LESS_DOT() { return getToken(GleamParser.LESS_DOT, 0); }
		public TerminalNode LESS_EQUAL_DOT() { return getToken(GleamParser.LESS_EQUAL_DOT, 0); }
		public TerminalNode GREATER() { return getToken(GleamParser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(GleamParser.GREATER_EQUAL, 0); }
		public TerminalNode GREATER_DOT() { return getToken(GleamParser.GREATER_DOT, 0); }
		public TerminalNode GREATER_EQUAL_DOT() { return getToken(GleamParser.GREATER_EQUAL_DOT, 0); }
		public Case_clause_guard_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause_guard_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterCase_clause_guard_binary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitCase_clause_guard_binary_operator(this);
		}
	}

	public final Case_clause_guard_binary_operatorContext case_clause_guard_binary_operator() throws RecognitionException {
		Case_clause_guard_binary_operatorContext _localctx = new Case_clause_guard_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_case_clause_guard_binary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3801977796427776L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_clause_guard_expressionContext extends ParserRuleContext {
		public Case_clause_guard_unitContext case_clause_guard_unit() {
			return getRuleContext(Case_clause_guard_unitContext.class,0);
		}
		public List<Case_clause_guard_expressionContext> case_clause_guard_expression() {
			return getRuleContexts(Case_clause_guard_expressionContext.class);
		}
		public Case_clause_guard_expressionContext case_clause_guard_expression(int i) {
			return getRuleContext(Case_clause_guard_expressionContext.class,i);
		}
		public Case_clause_guard_binary_operatorContext case_clause_guard_binary_operator() {
			return getRuleContext(Case_clause_guard_binary_operatorContext.class,0);
		}
		public Case_clause_guard_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause_guard_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterCase_clause_guard_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitCase_clause_guard_expression(this);
		}
	}

	public final Case_clause_guard_expressionContext case_clause_guard_expression() throws RecognitionException {
		return case_clause_guard_expression(0);
	}

	private Case_clause_guard_expressionContext case_clause_guard_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Case_clause_guard_expressionContext _localctx = new Case_clause_guard_expressionContext(_ctx, _parentState);
		Case_clause_guard_expressionContext _prevctx = _localctx;
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_case_clause_guard_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(980);
			case_clause_guard_unit();
			}
			_ctx.stop = _input.LT(-1);
			setState(988);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Case_clause_guard_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_case_clause_guard_expression);
					setState(982);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(983);
					case_clause_guard_binary_operator();
					setState(984);
					case_clause_guard_expression(3);
					}
					} 
				}
				setState(990);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_clause_guardContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GleamParser.IF, 0); }
		public Case_clause_guard_expressionContext case_clause_guard_expression() {
			return getRuleContext(Case_clause_guard_expressionContext.class,0);
		}
		public Case_clause_guardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterCase_clause_guard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitCase_clause_guard(this);
		}
	}

	public final Case_clause_guardContext case_clause_guard() throws RecognitionException {
		Case_clause_guardContext _localctx = new Case_clause_guardContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_case_clause_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			match(IF);
			setState(992);
			case_clause_guard_expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_clause_patternContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Case_clause_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterCase_clause_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitCase_clause_pattern(this);
		}
	}

	public final Case_clause_patternContext case_clause_pattern() throws RecognitionException {
		Case_clause_patternContext _localctx = new Case_clause_patternContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_case_clause_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			pattern();
			setState(999);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(995);
					match(COMMA);
					setState(996);
					pattern();
					}
					} 
				}
				setState(1001);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1002);
				match(COMMA);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_clause_patternsContext extends ParserRuleContext {
		public List<Case_clause_patternContext> case_clause_pattern() {
			return getRuleContexts(Case_clause_patternContext.class);
		}
		public Case_clause_patternContext case_clause_pattern(int i) {
			return getRuleContext(Case_clause_patternContext.class,i);
		}
		public List<TerminalNode> VBAR() { return getTokens(GleamParser.VBAR); }
		public TerminalNode VBAR(int i) {
			return getToken(GleamParser.VBAR, i);
		}
		public Case_clause_patternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause_patterns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterCase_clause_patterns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitCase_clause_patterns(this);
		}
	}

	public final Case_clause_patternsContext case_clause_patterns() throws RecognitionException {
		Case_clause_patternsContext _localctx = new Case_clause_patternsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_case_clause_patterns);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			case_clause_pattern();
			setState(1010);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1006);
					match(VBAR);
					setState(1007);
					case_clause_pattern();
					}
					} 
				}
				setState(1012);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VBAR) {
				{
				setState(1013);
				match(VBAR);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_clauseContext extends ParserRuleContext {
		public Case_clause_patternsContext case_clause_patterns() {
			return getRuleContext(Case_clause_patternsContext.class,0);
		}
		public TerminalNode R_ARROW() { return getToken(GleamParser.R_ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Case_clause_guardContext case_clause_guard() {
			return getRuleContext(Case_clause_guardContext.class,0);
		}
		public Case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterCase_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitCase_clause(this);
		}
	}

	public final Case_clauseContext case_clause() throws RecognitionException {
		Case_clauseContext _localctx = new Case_clauseContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			case_clause_patterns();
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1017);
				case_clause_guard();
				}
			}

			setState(1020);
			match(R_ARROW);
			setState(1021);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_clausesContext extends ParserRuleContext {
		public List<Case_clauseContext> case_clause() {
			return getRuleContexts(Case_clauseContext.class);
		}
		public Case_clauseContext case_clause(int i) {
			return getRuleContext(Case_clauseContext.class,i);
		}
		public Case_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterCase_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitCase_clauses(this);
		}
	}

	public final Case_clausesContext case_clauses() throws RecognitionException {
		Case_clausesContext _localctx = new Case_clausesContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_case_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1023);
				case_clause();
				}
				}
				setState(1026); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 219409813333868563L) != 0 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_subjectsContext extends ParserRuleContext {
		public Expression_seqContext expression_seq() {
			return getRuleContext(Expression_seqContext.class,0);
		}
		public Case_subjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_subjects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterCase_subjects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitCase_subjects(this);
		}
	}

	public final Case_subjectsContext case_subjects() throws RecognitionException {
		Case_subjectsContext _localctx = new Case_subjectsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_case_subjects);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			expression_seq();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GleamParser.CASE, 0); }
		public Case_subjectsContext case_subjects() {
			return getRuleContext(Case_subjectsContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(GleamParser.LEFT_BRACE, 0); }
		public Case_clausesContext case_clauses() {
			return getRuleContext(Case_clausesContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GleamParser.RIGHT_BRACE, 0); }
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitCase(this);
		}
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			match(CASE);
			setState(1031);
			case_subjects();
			setState(1032);
			match(LEFT_BRACE);
			setState(1033);
			case_clauses();
			setState(1034);
			match(RIGHT_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Use_argsContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GleamParser.COMMA, 0); }
		public Use_argsContext use_args() {
			return getRuleContext(Use_argsContext.class,0);
		}
		public Use_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterUse_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitUse_args(this);
		}
	}

	public final Use_argsContext use_args() throws RecognitionException {
		Use_argsContext _localctx = new Use_argsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_use_args);
		try {
			setState(1041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				identifier();
				setState(1038);
				match(COMMA);
				setState(1039);
				use_args();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(GleamParser.USE, 0); }
		public TerminalNode L_ARROW() { return getToken(GleamParser.L_ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Use_argsContext use_args() {
			return getRuleContext(Use_argsContext.class,0);
		}
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitUse(this);
		}
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_use);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			match(USE);
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(1044);
				use_args();
				}
			}

			setState(1047);
			match(L_ARROW);
			setState(1048);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(GleamParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			pattern();
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1051);
				type_annotation();
				}
			}

			setState(1054);
			match(EQUAL);
			setState(1055);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(GleamParser.LET, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitLet(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			match(LET);
			setState(1058);
			assignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssertContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(GleamParser.ASSERT, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterAssert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitAssert(this);
		}
	}

	public final AssertContext assert_() throws RecognitionException {
		AssertContext _localctx = new AssertContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_assert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			match(ASSERT);
			setState(1061);
			assignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NegationContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(GleamParser.BANG, 0); }
		public Expression_unitContext expression_unit() {
			return getRuleContext(Expression_unitContext.class,0);
		}
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitNegation(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			match(BANG);
			setState(1064);
			expression_unit();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Record_update_argumentContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GleamParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Record_update_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_update_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterRecord_update_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitRecord_update_argument(this);
		}
	}

	public final Record_update_argumentContext record_update_argument() throws RecognitionException {
		Record_update_argumentContext _localctx = new Record_update_argumentContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_record_update_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			label();
			setState(1067);
			match(COLON);
			setState(1068);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Record_update_argumentsContext extends ParserRuleContext {
		public List<Record_update_argumentContext> record_update_argument() {
			return getRuleContexts(Record_update_argumentContext.class);
		}
		public Record_update_argumentContext record_update_argument(int i) {
			return getRuleContext(Record_update_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Record_update_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_update_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterRecord_update_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitRecord_update_arguments(this);
		}
	}

	public final Record_update_argumentsContext record_update_arguments() throws RecognitionException {
		Record_update_argumentsContext _localctx = new Record_update_argumentsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_record_update_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			record_update_argument();
			setState(1075);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1071);
					match(COMMA);
					setState(1072);
					record_update_argument();
					}
					} 
				}
				setState(1077);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1078);
				match(COMMA);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Record_updateContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode DOT_DOT() { return getToken(GleamParser.DOT_DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GleamParser.COMMA, 0); }
		public Record_update_argumentsContext record_update_arguments() {
			return getRuleContext(Record_update_argumentsContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public Constructor_nameContext constructor_name() {
			return getRuleContext(Constructor_nameContext.class,0);
		}
		public Remote_constructor_nameContext remote_constructor_name() {
			return getRuleContext(Remote_constructor_nameContext.class,0);
		}
		public Record_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterRecord_update(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitRecord_update(this);
		}
	}

	public final Record_updateContext record_update() throws RecognitionException {
		Record_updateContext _localctx = new Record_updateContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_record_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_NAME:
				{
				setState(1081);
				constructor_name();
				}
				break;
			case NAME:
				{
				setState(1082);
				remote_constructor_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1085);
			match(LEFT_PAREN);
			setState(1086);
			match(DOT_DOT);
			setState(1087);
			expression(0);
			setState(1088);
			match(COMMA);
			setState(1089);
			record_update_arguments();
			setState(1090);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Call_or_access_optionsContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GleamParser.DOT, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(GleamParser.INTEGER, 0); }
		public Call_or_access_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_or_access_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterCall_or_access_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitCall_or_access_options(this);
		}
	}

	public final Call_or_access_optionsContext call_or_access_options() throws RecognitionException {
		Call_or_access_optionsContext _localctx = new Call_or_access_optionsContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_call_or_access_options);
		try {
			setState(1097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1092);
				arguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1093);
				match(DOT);
				setState(1094);
				label();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1095);
				match(DOT);
				setState(1096);
				match(INTEGER);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Call_or_accessContext extends ParserRuleContext {
		public CaseContext case_() {
			return getRuleContext(CaseContext.class,0);
		}
		public Call_or_access_optionsContext call_or_access_options() {
			return getRuleContext(Call_or_access_optionsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Expression_groupContext expression_group() {
			return getRuleContext(Expression_groupContext.class,0);
		}
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GleamParser.DOT, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Record_updateContext record_update() {
			return getRuleContext(Record_updateContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(GleamParser.INTEGER, 0); }
		public Anonymous_functionContext anonymous_function() {
			return getRuleContext(Anonymous_functionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Call_or_accessContext call_or_access() {
			return getRuleContext(Call_or_accessContext.class,0);
		}
		public Call_or_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_or_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterCall_or_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitCall_or_access(this);
		}
	}

	public final Call_or_accessContext call_or_access() throws RecognitionException {
		return call_or_access(0);
	}

	private Call_or_accessContext call_or_access(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Call_or_accessContext _localctx = new Call_or_accessContext(_ctx, _parentState);
		Call_or_accessContext _prevctx = _localctx;
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_call_or_access, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1100);
				case_();
				setState(1101);
				call_or_access_options();
				}
				break;
			case 2:
				{
				setState(1103);
				identifier();
				setState(1104);
				call_or_access_options();
				}
				break;
			case 3:
				{
				setState(1106);
				expression_group();
				setState(1107);
				call_or_access_options();
				}
				break;
			case 4:
				{
				setState(1109);
				record();
				setState(1110);
				match(DOT);
				setState(1111);
				label();
				}
				break;
			case 5:
				{
				setState(1113);
				record_update();
				setState(1114);
				match(DOT);
				setState(1115);
				label();
				}
				break;
			case 6:
				{
				setState(1117);
				tuple();
				setState(1118);
				match(DOT);
				setState(1119);
				match(INTEGER);
				}
				break;
			case 7:
				{
				setState(1121);
				anonymous_function();
				setState(1122);
				arguments();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Call_or_accessContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_call_or_access);
					setState(1126);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(1127);
					call_or_access_options();
					}
					} 
				}
				setState(1132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_literalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GleamParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(GleamParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(GleamParser.FLOAT, 0); }
		public TerminalNode TRUE() { return getToken(GleamParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GleamParser.FALSE, 0); }
		public Expression_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterExpression_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitExpression_literal(this);
		}
	}

	public final Expression_literalContext expression_literal() throws RecognitionException {
		Expression_literalContext _localctx = new Expression_literalContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_expression_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			_la = _input.LA(1);
			if ( !((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 218424581927469059L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_unitContext extends ParserRuleContext {
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public Anonymous_functionContext anonymous_function() {
			return getRuleContext(Anonymous_functionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TodoContext todo() {
			return getRuleContext(TodoContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Expression_bit_stringContext expression_bit_string() {
			return getRuleContext(Expression_bit_stringContext.class,0);
		}
		public Expression_groupContext expression_group() {
			return getRuleContext(Expression_groupContext.class,0);
		}
		public CaseContext case_() {
			return getRuleContext(CaseContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public AssertContext assert_() {
			return getRuleContext(AssertContext.class,0);
		}
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public Record_updateContext record_update() {
			return getRuleContext(Record_updateContext.class,0);
		}
		public Call_or_accessContext call_or_access() {
			return getRuleContext(Call_or_accessContext.class,0);
		}
		public Expression_literalContext expression_literal() {
			return getRuleContext(Expression_literalContext.class,0);
		}
		public Expression_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterExpression_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitExpression_unit(this);
		}
	}

	public final Expression_unitContext expression_unit() throws RecognitionException {
		Expression_unitContext _localctx = new Expression_unitContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_expression_unit);
		try {
			setState(1151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1135);
				record();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1136);
				anonymous_function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1137);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1138);
				todo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1139);
				tuple();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1140);
				list();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1141);
				expression_bit_string();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1142);
				expression_group();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1143);
				case_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1144);
				let();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1145);
				use();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1146);
				assert_();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1147);
				negation();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1148);
				record_update();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1149);
				call_or_access(0);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1150);
				expression_literal();
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode MINUS() { return getToken(GleamParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitMinus(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode VBAR_VBAR() { return getToken(GleamParser.VBAR_VBAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode STAR() { return getToken(GleamParser.STAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitStar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtgtContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LT_GT() { return getToken(GleamParser.LT_GT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LtgtContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterLtgt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitLtgt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LESS() { return getToken(GleamParser.LESS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LtContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitLt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode EQUAL_EQUAL() { return getToken(GleamParser.EQUAL_EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitEq(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode GREATER() { return getToken(GleamParser.GREATER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GtContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitGt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusfContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode MINUS_DOT() { return getToken(GleamParser.MINUS_DOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MinusfContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterMinusf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitMinusf(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PercentContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode PERCENT() { return getToken(GleamParser.PERCENT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PercentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitPercent(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode PLUS() { return getToken(GleamParser.PLUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitPlus(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusfContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode PLUS_DOT() { return getToken(GleamParser.PLUS_DOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PlusfContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterPlusf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitPlusf(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitContext extends ExpressionContext {
		public Expression_unitContext expression_unit() {
			return getRuleContext(Expression_unitContext.class,0);
		}
		public UnitContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitUnit(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SlashfContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode SLASH_DOT() { return getToken(GleamParser.SLASH_DOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SlashfContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterSlashf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitSlashf(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode AMPER_AMPER() { return getToken(GleamParser.AMPER_AMPER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitAnd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtfContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode GREATER_DOT() { return getToken(GleamParser.GREATER_DOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GtfContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterGtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitGtf(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GteContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode GREATER_EQUAL() { return getToken(GleamParser.GREATER_EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GteContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterGte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitGte(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PipeContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode PIPE() { return getToken(GleamParser.PIPE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PipeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterPipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitPipe(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SlashContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode SLASH() { return getToken(GleamParser.SLASH, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SlashContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitSlash(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeqContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT_EQUAL() { return getToken(GleamParser.NOT_EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NeqContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterNeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitNeq(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtefContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LESS_EQUAL_DOT() { return getToken(GleamParser.LESS_EQUAL_DOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LtefContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterLtef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitLtef(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LteContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LESS_EQUAL() { return getToken(GleamParser.LESS_EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LteContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterLte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitLte(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtefContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode GREATER_EQUAL_DOT() { return getToken(GleamParser.GREATER_EQUAL_DOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GtefContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterGtef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitGtef(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarfContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode STAR_DOT() { return getToken(GleamParser.STAR_DOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StarfContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterStarf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitStarf(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtfContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LESS_DOT() { return getToken(GleamParser.LESS_DOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LtfContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterLtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitLtf(this);
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
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new UnitContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1154);
			expression_unit();
			}
			_ctx.stop = _input.LT(-1);
			setState(1227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
					case 1:
						{
						_localctx = new EqContext(new ExpressionContext(_parentctx, _parentState));
						((EqContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1156);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1157);
						match(EQUAL_EQUAL);
						setState(1158);
						((EqContext)_localctx).right = expression(24);
						}
						break;
					case 2:
						{
						_localctx = new NeqContext(new ExpressionContext(_parentctx, _parentState));
						((NeqContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1159);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1160);
						match(NOT_EQUAL);
						setState(1161);
						((NeqContext)_localctx).right = expression(23);
						}
						break;
					case 3:
						{
						_localctx = new LtContext(new ExpressionContext(_parentctx, _parentState));
						((LtContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1162);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1163);
						match(LESS);
						setState(1164);
						((LtContext)_localctx).right = expression(22);
						}
						break;
					case 4:
						{
						_localctx = new LteContext(new ExpressionContext(_parentctx, _parentState));
						((LteContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1165);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1166);
						match(LESS_EQUAL);
						setState(1167);
						((LteContext)_localctx).right = expression(21);
						}
						break;
					case 5:
						{
						_localctx = new LtfContext(new ExpressionContext(_parentctx, _parentState));
						((LtfContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1168);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1169);
						match(LESS_DOT);
						setState(1170);
						((LtfContext)_localctx).right = expression(20);
						}
						break;
					case 6:
						{
						_localctx = new LtefContext(new ExpressionContext(_parentctx, _parentState));
						((LtefContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1171);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1172);
						match(LESS_EQUAL_DOT);
						setState(1173);
						((LtefContext)_localctx).right = expression(19);
						}
						break;
					case 7:
						{
						_localctx = new GtContext(new ExpressionContext(_parentctx, _parentState));
						((GtContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1174);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1175);
						match(GREATER);
						setState(1176);
						((GtContext)_localctx).right = expression(18);
						}
						break;
					case 8:
						{
						_localctx = new GteContext(new ExpressionContext(_parentctx, _parentState));
						((GteContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1177);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1178);
						match(GREATER_EQUAL);
						setState(1179);
						((GteContext)_localctx).right = expression(17);
						}
						break;
					case 9:
						{
						_localctx = new GtfContext(new ExpressionContext(_parentctx, _parentState));
						((GtfContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1180);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1181);
						match(GREATER_DOT);
						setState(1182);
						((GtfContext)_localctx).right = expression(16);
						}
						break;
					case 10:
						{
						_localctx = new GtefContext(new ExpressionContext(_parentctx, _parentState));
						((GtefContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1183);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1184);
						match(GREATER_EQUAL_DOT);
						setState(1185);
						((GtefContext)_localctx).right = expression(15);
						}
						break;
					case 11:
						{
						_localctx = new LtgtContext(new ExpressionContext(_parentctx, _parentState));
						((LtgtContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1186);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1187);
						match(LT_GT);
						setState(1188);
						((LtgtContext)_localctx).right = expression(14);
						}
						break;
					case 12:
						{
						_localctx = new PipeContext(new ExpressionContext(_parentctx, _parentState));
						((PipeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1189);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1190);
						match(PIPE);
						setState(1191);
						((PipeContext)_localctx).right = expression(13);
						}
						break;
					case 13:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						((PlusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1192);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1193);
						match(PLUS);
						setState(1194);
						((PlusContext)_localctx).right = expression(12);
						}
						break;
					case 14:
						{
						_localctx = new PlusfContext(new ExpressionContext(_parentctx, _parentState));
						((PlusfContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1195);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1196);
						match(PLUS_DOT);
						setState(1197);
						((PlusfContext)_localctx).right = expression(11);
						}
						break;
					case 15:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						((MinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1198);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1199);
						match(MINUS);
						setState(1200);
						((MinusContext)_localctx).right = expression(10);
						}
						break;
					case 16:
						{
						_localctx = new MinusfContext(new ExpressionContext(_parentctx, _parentState));
						((MinusfContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1201);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1202);
						match(MINUS_DOT);
						setState(1203);
						((MinusfContext)_localctx).right = expression(9);
						}
						break;
					case 17:
						{
						_localctx = new StarContext(new ExpressionContext(_parentctx, _parentState));
						((StarContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1204);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1205);
						match(STAR);
						setState(1206);
						((StarContext)_localctx).right = expression(8);
						}
						break;
					case 18:
						{
						_localctx = new StarfContext(new ExpressionContext(_parentctx, _parentState));
						((StarfContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1207);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1208);
						match(STAR_DOT);
						setState(1209);
						((StarfContext)_localctx).right = expression(7);
						}
						break;
					case 19:
						{
						_localctx = new SlashContext(new ExpressionContext(_parentctx, _parentState));
						((SlashContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1210);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1211);
						match(SLASH);
						setState(1212);
						((SlashContext)_localctx).right = expression(6);
						}
						break;
					case 20:
						{
						_localctx = new SlashfContext(new ExpressionContext(_parentctx, _parentState));
						((SlashfContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1213);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1214);
						match(SLASH_DOT);
						setState(1215);
						((SlashfContext)_localctx).right = expression(5);
						}
						break;
					case 21:
						{
						_localctx = new PercentContext(new ExpressionContext(_parentctx, _parentState));
						((PercentContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1216);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1217);
						match(PERCENT);
						setState(1218);
						((PercentContext)_localctx).right = expression(4);
						}
						break;
					case 22:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1219);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1220);
						match(AMPER_AMPER);
						setState(1221);
						((AndContext)_localctx).right = expression(3);
						}
						break;
					case 23:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1222);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1223);
						match(VBAR_VBAR);
						setState(1224);
						((OrContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(1229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Data_constructor_argumentContext extends ParserRuleContext {
		public Type_baseContext type_base() {
			return getRuleContext(Type_baseContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GleamParser.COLON, 0); }
		public Data_constructor_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_constructor_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterData_constructor_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitData_constructor_argument(this);
		}
	}

	public final Data_constructor_argumentContext data_constructor_argument() throws RecognitionException {
		Data_constructor_argumentContext _localctx = new Data_constructor_argumentContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_data_constructor_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1230);
				label();
				setState(1231);
				match(COLON);
				}
				break;
			}
			setState(1235);
			type_base();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Data_constructor_argumentsContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GleamParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GleamParser.RIGHT_PAREN, 0); }
		public List<Data_constructor_argumentContext> data_constructor_argument() {
			return getRuleContexts(Data_constructor_argumentContext.class);
		}
		public Data_constructor_argumentContext data_constructor_argument(int i) {
			return getRuleContext(Data_constructor_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GleamParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GleamParser.COMMA, i);
		}
		public Data_constructor_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_constructor_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterData_constructor_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitData_constructor_arguments(this);
		}
	}

	public final Data_constructor_argumentsContext data_constructor_arguments() throws RecognitionException {
		Data_constructor_argumentsContext _localctx = new Data_constructor_argumentsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_data_constructor_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			match(LEFT_PAREN);
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 432345839105474561L) != 0) {
				{
				setState(1238);
				data_constructor_argument();
				setState(1243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1239);
						match(COMMA);
						setState(1240);
						data_constructor_argument();
						}
						} 
					}
					setState(1245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				}
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1246);
					match(COMMA);
					}
				}

				}
			}

			setState(1251);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Data_constructorContext extends ParserRuleContext {
		public Constructor_nameContext constructor_name() {
			return getRuleContext(Constructor_nameContext.class,0);
		}
		public Data_constructor_argumentsContext data_constructor_arguments() {
			return getRuleContext(Data_constructor_argumentsContext.class,0);
		}
		public Data_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterData_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitData_constructor(this);
		}
	}

	public final Data_constructorContext data_constructor() throws RecognitionException {
		Data_constructorContext _localctx = new Data_constructorContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_data_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			constructor_name();
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(1254);
				data_constructor_arguments();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Data_constructorsContext extends ParserRuleContext {
		public List<Data_constructorContext> data_constructor() {
			return getRuleContexts(Data_constructorContext.class);
		}
		public Data_constructorContext data_constructor(int i) {
			return getRuleContext(Data_constructorContext.class,i);
		}
		public Data_constructorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_constructors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterData_constructors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitData_constructors(this);
		}
	}

	public final Data_constructorsContext data_constructors() throws RecognitionException {
		Data_constructorsContext _localctx = new Data_constructorsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_data_constructors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1257);
				data_constructor();
				}
				}
				setState(1260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==UP_NAME );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_definitionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GleamParser.TYPE, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(GleamParser.LEFT_BRACE, 0); }
		public Data_constructorsContext data_constructors() {
			return getRuleContext(Data_constructorsContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GleamParser.RIGHT_BRACE, 0); }
		public Visibility_modifierContext visibility_modifier() {
			return getRuleContext(Visibility_modifierContext.class,0);
		}
		public Opacity_modifierContext opacity_modifier() {
			return getRuleContext(Opacity_modifierContext.class,0);
		}
		public Type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterType_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitType_definition(this);
		}
	}

	public final Type_definitionContext type_definition() throws RecognitionException {
		Type_definitionContext _localctx = new Type_definitionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUB) {
				{
				setState(1262);
				visibility_modifier();
				}
			}

			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPAQUE) {
				{
				setState(1265);
				opacity_modifier();
				}
			}

			setState(1268);
			match(TYPE);
			setState(1269);
			type_name();
			setState(1270);
			match(LEFT_BRACE);
			setState(1271);
			data_constructors();
			setState(1272);
			match(RIGHT_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_aliasContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GleamParser.TYPE, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(GleamParser.EQUAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Visibility_modifierContext visibility_modifier() {
			return getRuleContext(Visibility_modifierContext.class,0);
		}
		public Opacity_modifierContext opacity_modifier() {
			return getRuleContext(Opacity_modifierContext.class,0);
		}
		public Type_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterType_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitType_alias(this);
		}
	}

	public final Type_aliasContext type_alias() throws RecognitionException {
		Type_aliasContext _localctx = new Type_aliasContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_type_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUB) {
				{
				setState(1274);
				visibility_modifier();
				}
			}

			setState(1278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPAQUE) {
				{
				setState(1277);
				opacity_modifier();
				}
			}

			setState(1280);
			match(TYPE);
			setState(1281);
			type_name();
			setState(1282);
			match(EQUAL);
			setState(1283);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public External_typeContext external_type() {
			return getRuleContext(External_typeContext.class,0);
		}
		public External_functionContext external_function() {
			return getRuleContext(External_functionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Type_definitionContext type_definition() {
			return getRuleContext(Type_definitionContext.class,0);
		}
		public Type_aliasContext type_alias() {
			return getRuleContext(Type_aliasContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_statement);
		try {
			setState(1292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1285);
				imports();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1286);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1287);
				external_type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1288);
				external_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1289);
				function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1290);
				type_definition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1291);
				type_alias();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GleamParser.NAME, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			match(NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constructor_nameContext extends ParserRuleContext {
		public TerminalNode UP_NAME() { return getToken(GleamParser.UP_NAME, 0); }
		public Constructor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterConstructor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitConstructor_name(this);
		}
	}

	public final Constructor_nameContext constructor_name() throws RecognitionException {
		Constructor_nameContext _localctx = new Constructor_nameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constructor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			match(UP_NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_identifierContext extends ParserRuleContext {
		public TerminalNode UP_NAME() { return getToken(GleamParser.UP_NAME, 0); }
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterType_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitType_identifier(this);
		}
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			match(UP_NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DiscardContext extends ParserRuleContext {
		public TerminalNode DISCARD_NAME() { return getToken(GleamParser.DISCARD_NAME, 0); }
		public DiscardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterDiscard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitDiscard(this);
		}
	}

	public final DiscardContext discard() throws RecognitionException {
		DiscardContext _localctx = new DiscardContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_discard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			match(DISCARD_NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GleamParser.NAME, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			match(NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_parameterContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GleamParser.NAME, 0); }
		public Type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterType_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitType_parameter(this);
		}
	}

	public final Type_parameterContext type_parameter() throws RecognitionException {
		Type_parameterContext _localctx = new Type_parameterContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_type_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			match(NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_varContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GleamParser.NAME, 0); }
		public Type_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterType_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitType_var(this);
		}
	}

	public final Type_varContext type_var() throws RecognitionException {
		Type_varContext _localctx = new Type_varContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_type_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			match(NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_holeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GleamParser.NAME, 0); }
		public Type_holeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_hole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterType_hole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitType_hole(this);
		}
	}

	public final Type_holeContext type_hole() throws RecognitionException {
		Type_holeContext _localctx = new Type_holeContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_type_hole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			match(NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HoleContext extends ParserRuleContext {
		public TerminalNode DISCARD_NAME() { return getToken(GleamParser.DISCARD_NAME, 0); }
		public HoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterHole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitHole(this);
		}
	}

	public final HoleContext hole() throws RecognitionException {
		HoleContext _localctx = new HoleContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_hole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			match(DISCARD_NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Discard_paramContext extends ParserRuleContext {
		public DiscardContext discard() {
			return getRuleContext(DiscardContext.class,0);
		}
		public Discard_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discard_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterDiscard_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitDiscard_param(this);
		}
	}

	public final Discard_paramContext discard_param() throws RecognitionException {
		Discard_paramContext _localctx = new Discard_paramContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_discard_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			discard();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Name_paramContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Name_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterName_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitName_param(this);
		}
	}

	public final Name_paramContext name_param() throws RecognitionException {
		Name_paramContext _localctx = new Name_paramContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_name_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Labeled_name_paramContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Labeled_name_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_name_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterLabeled_name_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitLabeled_name_param(this);
		}
	}

	public final Labeled_name_paramContext labeled_name_param() throws RecognitionException {
		Labeled_name_paramContext _localctx = new Labeled_name_paramContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_labeled_name_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			label();
			setState(1317);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Labeled_discard_paramContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public DiscardContext discard() {
			return getRuleContext(DiscardContext.class,0);
		}
		public Labeled_discard_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_discard_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterLabeled_discard_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitLabeled_discard_param(this);
		}
	}

	public final Labeled_discard_paramContext labeled_discard_param() throws RecognitionException {
		Labeled_discard_paramContext _localctx = new Labeled_discard_paramContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_labeled_discard_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			label();
			setState(1320);
			discard();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Remote_constructor_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GleamParser.DOT, 0); }
		public Constructor_nameContext constructor_name() {
			return getRuleContext(Constructor_nameContext.class,0);
		}
		public Remote_constructor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remote_constructor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterRemote_constructor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitRemote_constructor_name(this);
		}
	}

	public final Remote_constructor_nameContext remote_constructor_name() throws RecognitionException {
		Remote_constructor_nameContext _localctx = new Remote_constructor_nameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_remote_constructor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			identifier();
			setState(1323);
			match(DOT);
			setState(1324);
			constructor_name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Remote_type_identifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GleamParser.DOT, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Remote_type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remote_type_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterRemote_type_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitRemote_type_identifier(this);
		}
	}

	public final Remote_type_identifierContext remote_type_identifier() throws RecognitionException {
		Remote_type_identifierContext _localctx = new Remote_type_identifierContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_remote_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			identifier();
			setState(1327);
			match(DOT);
			setState(1328);
			type_identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Visibility_modifierContext extends ParserRuleContext {
		public TerminalNode PUB() { return getToken(GleamParser.PUB, 0); }
		public Visibility_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterVisibility_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitVisibility_modifier(this);
		}
	}

	public final Visibility_modifierContext visibility_modifier() throws RecognitionException {
		Visibility_modifierContext _localctx = new Visibility_modifierContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_visibility_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			match(PUB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Opacity_modifierContext extends ParserRuleContext {
		public TerminalNode OPAQUE() { return getToken(GleamParser.OPAQUE, 0); }
		public Opacity_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opacity_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).enterOpacity_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GleamListener ) ((GleamListener)listener).exitOpacity_modifier(this);
		}
	}

	public final Opacity_modifierContext opacity_modifier() throws RecognitionException {
		Opacity_modifierContext _localctx = new Opacity_modifierContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_opacity_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			match(OPAQUE);
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
		case 76:
			return case_clause_guard_expression_sempred((Case_clause_guard_expressionContext)_localctx, predIndex);
		case 94:
			return call_or_access_sempred((Call_or_accessContext)_localctx, predIndex);
		case 97:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean case_clause_guard_expression_sempred(Case_clause_guard_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean call_or_access_sempred(Call_or_accessContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 23);
		case 3:
			return precpred(_ctx, 22);
		case 4:
			return precpred(_ctx, 21);
		case 5:
			return precpred(_ctx, 20);
		case 6:
			return precpred(_ctx, 19);
		case 7:
			return precpred(_ctx, 18);
		case 8:
			return precpred(_ctx, 17);
		case 9:
			return precpred(_ctx, 16);
		case 10:
			return precpred(_ctx, 15);
		case 11:
			return precpred(_ctx, 14);
		case 12:
			return precpred(_ctx, 13);
		case 13:
			return precpred(_ctx, 12);
		case 14:
			return precpred(_ctx, 11);
		case 15:
			return precpred(_ctx, 10);
		case 16:
			return precpred(_ctx, 9);
		case 17:
			return precpred(_ctx, 8);
		case 18:
			return precpred(_ctx, 7);
		case 19:
			return precpred(_ctx, 6);
		case 20:
			return precpred(_ctx, 5);
		case 21:
			return precpred(_ctx, 4);
		case 22:
			return precpred(_ctx, 3);
		case 23:
			return precpred(_ctx, 2);
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001K\u0537\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007m\u0002"+
		"n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007r\u0002"+
		"s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007w\u0002"+
		"x\u0007x\u0002y\u0007y\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u00f8\b\u0000\n\u0000\f\u0000\u00fb\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0103\b\u0001\n"+
		"\u0001\f\u0001\u0106\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u010d\b\u0002\n\u0002\f\u0002\u0110\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0115\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u011a\b\u0003\u0003\u0003\u011c\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0122"+
		"\b\u0004\n\u0004\f\u0004\u0125\t\u0004\u0001\u0004\u0003\u0004\u0128\b"+
		"\u0004\u0003\u0004\u012a\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0132\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0136\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u013c\b\u0006\n\u0006\f\u0006\u013f\t\u0006\u0001\u0006"+
		"\u0003\u0006\u0142\b\u0006\u0003\u0006\u0144\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u014a\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0154"+
		"\b\b\n\b\f\b\u0157\t\b\u0001\b\u0003\b\u015a\b\b\u0003\b\u015c\b\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0165\b\t\n"+
		"\t\f\t\u0168\t\t\u0001\t\u0003\t\u016b\b\t\u0003\t\u016d\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0177\b\u000b\n\u000b\f\u000b\u017a\t\u000b\u0001\u000b\u0003\u000b"+
		"\u017d\b\u000b\u0003\u000b\u017f\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u0187\b\f\n\f\f\f\u018a\t\f\u0001\f"+
		"\u0003\f\u018d\b\f\u0003\f\u018f\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0196\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u019e\b\u000e\n\u000e\f\u000e\u01a1\t\u000e\u0001"+
		"\u000e\u0003\u000e\u01a4\b\u000e\u0003\u000e\u01a6\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u01ac\b\u000f\u0001\u000f"+
		"\u0003\u000f\u01af\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u01b8\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u01bc\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u01c1\b\u0013\n\u0013\f\u0013\u01c4\t\u0013\u0001\u0013\u0003"+
		"\u0013\u01c7\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01cc"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01d2"+
		"\b\u0015\n\u0015\f\u0015\u01d5\t\u0015\u0001\u0015\u0003\u0015\u01d8\b"+
		"\u0015\u0003\u0015\u01da\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u01e0\b\u0016\u0001\u0016\u0003\u0016\u01e3\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01e9\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u01f9\b\u001a\u0001\u001b\u0003\u001b"+
		"\u01fc\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0201\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u020a\b\u001c\n\u001c\f\u001c\u020d\t\u001c"+
		"\u0001\u001c\u0003\u001c\u0210\b\u001c\u0003\u001c\u0212\b\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u0218\b\u001d\u0001"+
		"\u001d\u0003\u001d\u021b\b\u001d\u0001\u001e\u0003\u001e\u021e\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u0228\b\u001f\n\u001f\f\u001f\u022b"+
		"\t\u001f\u0001\u001f\u0003\u001f\u022e\b\u001f\u0003\u001f\u0230\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0239"+
		"\b \n \f \u023c\t \u0001 \u0003 \u023f\b \u0003 \u0241\b \u0001 \u0001"+
		" \u0001!\u0001!\u0003!\u0247\b!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u0251\b\"\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0005%\u025c\b%\n%\f%\u025f\t%\u0001%\u0003"+
		"%\u0262\b%\u0003%\u0264\b%\u0001%\u0001%\u0001&\u0001&\u0003&\u026a\b"+
		"&\u0001&\u0003&\u026d\b&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001("+
		"\u0003(\u0275\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0005)\u027d"+
		"\b)\n)\f)\u0280\t)\u0001)\u0003)\u0283\b)\u0003)\u0285\b)\u0001)\u0001"+
		")\u0001*\u0003*\u028a\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0003+\u0299\b+\u0001,\u0001"+
		",\u0003,\u029d\b,\u0001-\u0001-\u0001-\u0001-\u0005-\u02a3\b-\n-\f-\u02a6"+
		"\t-\u0001-\u0003-\u02a9\b-\u0003-\u02ab\b-\u0001-\u0001-\u0001.\u0001"+
		".\u0003.\u02b1\b.\u0001.\u0001.\u0001/\u0003/\u02b6\b/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u02bd\b/\u0001/\u0001/\u00010\u00010\u00010\u0003"+
		"0\u02c4\b0\u00011\u00011\u00011\u00011\u00051\u02ca\b1\n1\f1\u02cd\t1"+
		"\u00011\u00031\u02d0\b1\u00031\u02d2\b1\u00011\u00031\u02d5\b1\u00011"+
		"\u00011\u00012\u00012\u00012\u00032\u02dc\b2\u00013\u00013\u00013\u0001"+
		"3\u00053\u02e2\b3\n3\f3\u02e5\t3\u00013\u00033\u02e8\b3\u00033\u02ea\b"+
		"3\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00054\u02f3\b4\n4"+
		"\f4\u02f6\t4\u00014\u00034\u02f9\b4\u00034\u02fb\b4\u00014\u00014\u0001"+
		"5\u00015\u00035\u0301\b5\u00016\u00016\u00016\u00036\u0306\b6\u00016\u0001"+
		"6\u00017\u00017\u00017\u00017\u00057\u030e\b7\n7\f7\u0311\t7\u00017\u0003"+
		"7\u0314\b7\u00037\u0316\b7\u00017\u00037\u0319\b7\u00017\u00017\u0001"+
		"8\u00018\u00038\u031f\b8\u00018\u00038\u0322\b8\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00039\u032b\b9\u00019\u00019\u00039\u032f\b9\u0001"+
		":\u0001:\u0001:\u0003:\u0334\b:\u0001:\u0001:\u0001:\u0001;\u0001;\u0004"+
		";\u033b\b;\u000b;\f;\u033c\u0001<\u0001<\u0001<\u0003<\u0342\b<\u0001"+
		"<\u0001<\u0003<\u0346\b<\u0001=\u0001=\u0001=\u0001=\u0005=\u034c\b=\n"+
		"=\f=\u034f\t=\u0001=\u0003=\u0352\b=\u0003=\u0354\b=\u0001=\u0001=\u0001"+
		">\u0001>\u0003>\u035a\b>\u0001>\u0003>\u035d\b>\u0001?\u0001?\u0001?\u0003"+
		"?\u0362\b?\u0001@\u0001@\u0001@\u0001@\u0005@\u0368\b@\n@\f@\u036b\t@"+
		"\u0001@\u0003@\u036e\b@\u0003@\u0370\b@\u0001@\u0001@\u0001A\u0001A\u0001"+
		"A\u0001A\u0003A\u0378\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0005B\u037f"+
		"\bB\nB\fB\u0382\tB\u0001B\u0003B\u0385\bB\u0003B\u0387\bB\u0001B\u0001"+
		"B\u0001C\u0001C\u0001C\u0001C\u0005C\u038f\bC\nC\fC\u0392\tC\u0003C\u0394"+
		"\bC\u0001C\u0003C\u0397\bC\u0001C\u0001C\u0003C\u039b\bC\u0003C\u039d"+
		"\bC\u0001C\u0001C\u0001D\u0001D\u0003D\u03a3\bD\u0001E\u0001E\u0003E\u03a7"+
		"\bE\u0001F\u0001F\u0001F\u0001F\u0005F\u03ad\bF\nF\fF\u03b0\tF\u0001F"+
		"\u0003F\u03b3\bF\u0003F\u03b5\bF\u0001F\u0001F\u0001G\u0001G\u0001G\u0001"+
		"G\u0003G\u03bd\bG\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001I\u0001"+
		"I\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0003"+
		"J\u03d0\bJ\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001"+
		"L\u0005L\u03db\bL\nL\fL\u03de\tL\u0001M\u0001M\u0001M\u0001N\u0001N\u0001"+
		"N\u0005N\u03e6\bN\nN\fN\u03e9\tN\u0001N\u0003N\u03ec\bN\u0001O\u0001O"+
		"\u0001O\u0005O\u03f1\bO\nO\fO\u03f4\tO\u0001O\u0003O\u03f7\bO\u0001P\u0001"+
		"P\u0003P\u03fb\bP\u0001P\u0001P\u0001P\u0001Q\u0004Q\u0401\bQ\u000bQ\f"+
		"Q\u0402\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"T\u0001T\u0001T\u0001T\u0001T\u0003T\u0412\bT\u0001U\u0001U\u0003U\u0416"+
		"\bU\u0001U\u0001U\u0001U\u0001V\u0001V\u0003V\u041d\bV\u0001V\u0001V\u0001"+
		"V\u0001W\u0001W\u0001W\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0005[\u0432\b[\n[\f[\u0435"+
		"\t[\u0001[\u0003[\u0438\b[\u0001\\\u0001\\\u0003\\\u043c\b\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0003]\u044a\b]\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u0465"+
		"\b^\u0001^\u0001^\u0005^\u0469\b^\n^\f^\u046c\t^\u0001_\u0001_\u0001`"+
		"\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001"+
		"`\u0001`\u0001`\u0001`\u0001`\u0001`\u0003`\u0480\b`\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0005"+
		"a\u04ca\ba\na\fa\u04cd\ta\u0001b\u0001b\u0001b\u0003b\u04d2\bb\u0001b"+
		"\u0001b\u0001c\u0001c\u0001c\u0001c\u0005c\u04da\bc\nc\fc\u04dd\tc\u0001"+
		"c\u0003c\u04e0\bc\u0003c\u04e2\bc\u0001c\u0001c\u0001d\u0001d\u0003d\u04e8"+
		"\bd\u0001e\u0004e\u04eb\be\u000be\fe\u04ec\u0001f\u0003f\u04f0\bf\u0001"+
		"f\u0003f\u04f3\bf\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001g\u0003"+
		"g\u04fc\bg\u0001g\u0003g\u04ff\bg\u0001g\u0001g\u0001g\u0001g\u0001g\u0001"+
		"h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0003h\u050d\bh\u0001i\u0001"+
		"i\u0001j\u0001j\u0001k\u0001k\u0001l\u0001l\u0001m\u0001m\u0001n\u0001"+
		"n\u0001o\u0001o\u0001p\u0001p\u0001q\u0001q\u0001r\u0001r\u0001s\u0001"+
		"s\u0001t\u0001t\u0001t\u0001u\u0001u\u0001u\u0001v\u0001v\u0001v\u0001"+
		"v\u0001w\u0001w\u0001w\u0001w\u0001x\u0001x\u0001y\u0001y\u0001y\u0000"+
		"\u0003\u0098\u00bc\u00c2z\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u0000\u0002\u0004\u0000\u001c\u001f%(/023\u0003\u0000\u0010\u0011"+
		"CCHI\u05a1\u0000\u00f9\u0001\u0000\u0000\u0000\u0002\u00fe\u0001\u0000"+
		"\u0000\u0000\u0004\u0109\u0001\u0000\u0000\u0000\u0006\u011b\u0001\u0000"+
		"\u0000\u0000\b\u011d\u0001\u0000\u0000\u0000\n\u012d\u0001\u0000\u0000"+
		"\u0000\f\u0137\u0001\u0000\u0000\u0000\u000e\u0147\u0001\u0000\u0000\u0000"+
		"\u0010\u014e\u0001\u0000\u0000\u0000\u0012\u015f\u0001\u0000\u0000\u0000"+
		"\u0014\u0170\u0001\u0000\u0000\u0000\u0016\u0172\u0001\u0000\u0000\u0000"+
		"\u0018\u0182\u0001\u0000\u0000\u0000\u001a\u0195\u0001\u0000\u0000\u0000"+
		"\u001c\u0199\u0001\u0000\u0000\u0000\u001e\u01ab\u0001\u0000\u0000\u0000"+
		" \u01b0\u0001\u0000\u0000\u0000\"\u01b7\u0001\u0000\u0000\u0000$\u01bb"+
		"\u0001\u0000\u0000\u0000&\u01bd\u0001\u0000\u0000\u0000(\u01c8\u0001\u0000"+
		"\u0000\u0000*\u01cd\u0001\u0000\u0000\u0000,\u01df\u0001\u0000\u0000\u0000"+
		".\u01e8\u0001\u0000\u0000\u00000\u01ea\u0001\u0000\u0000\u00002\u01ed"+
		"\u0001\u0000\u0000\u00004\u01f8\u0001\u0000\u0000\u00006\u01fb\u0001\u0000"+
		"\u0000\u00008\u0205\u0001\u0000\u0000\u0000:\u0217\u0001\u0000\u0000\u0000"+
		"<\u021d\u0001\u0000\u0000\u0000>\u0223\u0001\u0000\u0000\u0000@\u0233"+
		"\u0001\u0000\u0000\u0000B\u0244\u0001\u0000\u0000\u0000D\u0250\u0001\u0000"+
		"\u0000\u0000F\u0252\u0001\u0000\u0000\u0000H\u0255\u0001\u0000\u0000\u0000"+
		"J\u0257\u0001\u0000\u0000\u0000L\u0269\u0001\u0000\u0000\u0000N\u026e"+
		"\u0001\u0000\u0000\u0000P\u0274\u0001\u0000\u0000\u0000R\u0278\u0001\u0000"+
		"\u0000\u0000T\u0289\u0001\u0000\u0000\u0000V\u0298\u0001\u0000\u0000\u0000"+
		"X\u029a\u0001\u0000\u0000\u0000Z\u029e\u0001\u0000\u0000\u0000\\\u02ae"+
		"\u0001\u0000\u0000\u0000^\u02b5\u0001\u0000\u0000\u0000`\u02c0\u0001\u0000"+
		"\u0000\u0000b\u02c5\u0001\u0000\u0000\u0000d\u02d8\u0001\u0000\u0000\u0000"+
		"f\u02dd\u0001\u0000\u0000\u0000h\u02ed\u0001\u0000\u0000\u0000j\u02fe"+
		"\u0001\u0000\u0000\u0000l\u0305\u0001\u0000\u0000\u0000n\u0309\u0001\u0000"+
		"\u0000\u0000p\u031e\u0001\u0000\u0000\u0000r\u032a\u0001\u0000\u0000\u0000"+
		"t\u0330\u0001\u0000\u0000\u0000v\u033a\u0001\u0000\u0000\u0000x\u0341"+
		"\u0001\u0000\u0000\u0000z\u0347\u0001\u0000\u0000\u0000|\u0359\u0001\u0000"+
		"\u0000\u0000~\u035e\u0001\u0000\u0000\u0000\u0080\u0363\u0001\u0000\u0000"+
		"\u0000\u0082\u0373\u0001\u0000\u0000\u0000\u0084\u0379\u0001\u0000\u0000"+
		"\u0000\u0086\u038a\u0001\u0000\u0000\u0000\u0088\u03a2\u0001\u0000\u0000"+
		"\u0000\u008a\u03a4\u0001\u0000\u0000\u0000\u008c\u03a8\u0001\u0000\u0000"+
		"\u0000\u008e\u03b8\u0001\u0000\u0000\u0000\u0090\u03c0\u0001\u0000\u0000"+
		"\u0000\u0092\u03c4\u0001\u0000\u0000\u0000\u0094\u03cf\u0001\u0000\u0000"+
		"\u0000\u0096\u03d1\u0001\u0000\u0000\u0000\u0098\u03d3\u0001\u0000\u0000"+
		"\u0000\u009a\u03df\u0001\u0000\u0000\u0000\u009c\u03e2\u0001\u0000\u0000"+
		"\u0000\u009e\u03ed\u0001\u0000\u0000\u0000\u00a0\u03f8\u0001\u0000\u0000"+
		"\u0000\u00a2\u0400\u0001\u0000\u0000\u0000\u00a4\u0404\u0001\u0000\u0000"+
		"\u0000\u00a6\u0406\u0001\u0000\u0000\u0000\u00a8\u0411\u0001\u0000\u0000"+
		"\u0000\u00aa\u0413\u0001\u0000\u0000\u0000\u00ac\u041a\u0001\u0000\u0000"+
		"\u0000\u00ae\u0421\u0001\u0000\u0000\u0000\u00b0\u0424\u0001\u0000\u0000"+
		"\u0000\u00b2\u0427\u0001\u0000\u0000\u0000\u00b4\u042a\u0001\u0000\u0000"+
		"\u0000\u00b6\u042e\u0001\u0000\u0000\u0000\u00b8\u043b\u0001\u0000\u0000"+
		"\u0000\u00ba\u0449\u0001\u0000\u0000\u0000\u00bc\u0464\u0001\u0000\u0000"+
		"\u0000\u00be\u046d\u0001\u0000\u0000\u0000\u00c0\u047f\u0001\u0000\u0000"+
		"\u0000\u00c2\u0481\u0001\u0000\u0000\u0000\u00c4\u04d1\u0001\u0000\u0000"+
		"\u0000\u00c6\u04d5\u0001\u0000\u0000\u0000\u00c8\u04e5\u0001\u0000\u0000"+
		"\u0000\u00ca\u04ea\u0001\u0000\u0000\u0000\u00cc\u04ef\u0001\u0000\u0000"+
		"\u0000\u00ce\u04fb\u0001\u0000\u0000\u0000\u00d0\u050c\u0001\u0000\u0000"+
		"\u0000\u00d2\u050e\u0001\u0000\u0000\u0000\u00d4\u0510\u0001\u0000\u0000"+
		"\u0000\u00d6\u0512\u0001\u0000\u0000\u0000\u00d8\u0514\u0001\u0000\u0000"+
		"\u0000\u00da\u0516\u0001\u0000\u0000\u0000\u00dc\u0518\u0001\u0000\u0000"+
		"\u0000\u00de\u051a\u0001\u0000\u0000\u0000\u00e0\u051c\u0001\u0000\u0000"+
		"\u0000\u00e2\u051e\u0001\u0000\u0000\u0000\u00e4\u0520\u0001\u0000\u0000"+
		"\u0000\u00e6\u0522\u0001\u0000\u0000\u0000\u00e8\u0524\u0001\u0000\u0000"+
		"\u0000\u00ea\u0527\u0001\u0000\u0000\u0000\u00ec\u052a\u0001\u0000\u0000"+
		"\u0000\u00ee\u052e\u0001\u0000\u0000\u0000\u00f0\u0532\u0001\u0000\u0000"+
		"\u0000\u00f2\u0534\u0001\u0000\u0000\u0000\u00f4\u00f8\u0003\u00d0h\u0000"+
		"\u00f5\u00f8\u0003v;\u0000\u00f6\u00f8\u0003\u0002\u0001\u0000\u00f7\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0005\u0000\u0000\u0001\u00fd\u0001\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0005\u0007\u0000\u0000\u00ff\u0100\u0003\u00d2i\u0000\u0100\u0104\u0005"+
		"\u0016\u0000\u0000\u0101\u0103\u0003\u00d0h\u0000\u0102\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u0017"+
		"\u0000\u0000\u0108\u0003\u0001\u0000\u0000\u0000\u0109\u010e\u0005?\u0000"+
		"\u0000\u010a\u010b\u0005\u001b\u0000\u0000\u010b\u010d\u0005?\u0000\u0000"+
		"\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u0005\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0111\u0114\u0005?\u0000\u0000\u0112\u0113\u0005\u0001\u0000\u0000\u0113"+
		"\u0115\u0005?\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115\u011c\u0001\u0000\u0000\u0000\u0116\u0119"+
		"\u0005@\u0000\u0000\u0117\u0118\u0005\u0001\u0000\u0000\u0118\u011a\u0005"+
		"@\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000"+
		"\u0000\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u0111\u0001\u0000"+
		"\u0000\u0000\u011b\u0116\u0001\u0000\u0000\u0000\u011c\u0007\u0001\u0000"+
		"\u0000\u0000\u011d\u0129\u0005\u0016\u0000\u0000\u011e\u0123\u0003\u0006"+
		"\u0003\u0000\u011f\u0120\u0005+\u0000\u0000\u0120\u0122\u0003\u0006\u0003"+
		"\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000"+
		"\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000"+
		"\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000"+
		"\u0000\u0126\u0128\u0005+\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000"+
		"\u0129\u011e\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u0017\u0000\u0000"+
		"\u012c\t\u0001\u0000\u0000\u0000\u012d\u012e\u0005\b\u0000\u0000\u012e"+
		"\u0131\u0003\u0004\u0002\u0000\u012f\u0130\u00057\u0000\u0000\u0130\u0132"+
		"\u0003\b\u0004\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001"+
		"\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0134\u0005"+
		"\u0001\u0000\u0000\u0134\u0136\u0005?\u0000\u0000\u0135\u0133\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u000b\u0001\u0000"+
		"\u0000\u0000\u0137\u0143\u0005\u0012\u0000\u0000\u0138\u013d\u0003.\u0017"+
		"\u0000\u0139\u013a\u0005+\u0000\u0000\u013a\u013c\u0003.\u0017\u0000\u013b"+
		"\u0139\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d"+
		"\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e"+
		"\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140"+
		"\u0142\u0005+\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0138"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0013\u0000\u0000\u0146\r\u0001"+
		"\u0000\u0000\u0000\u0147\u0149\u0005\u0006\u0000\u0000\u0148\u014a\u0003"+
		"\f\u0006\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u00058\u0000"+
		"\u0000\u014c\u014d\u0003.\u0017\u0000\u014d\u000f\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0005,\u0000\u0000\u014f\u015b\u0005\u0012\u0000\u0000\u0150"+
		"\u0155\u00034\u001a\u0000\u0151\u0152\u0005+\u0000\u0000\u0152\u0154\u0003"+
		"4\u001a\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000"+
		"\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000"+
		"\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0158\u015a\u0005+\u0000\u0000\u0159\u0158\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000"+
		"\u0000\u015b\u0150\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u0013\u0000"+
		"\u0000\u015e\u0011\u0001\u0000\u0000\u0000\u015f\u0160\u0005,\u0000\u0000"+
		"\u0160\u016c\u0005\u0012\u0000\u0000\u0161\u0166\u0003.\u0017\u0000\u0162"+
		"\u0163\u0005+\u0000\u0000\u0163\u0165\u0003.\u0017\u0000\u0164\u0162\u0001"+
		"\u0000\u0000\u0000\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001"+
		"\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u016a\u0001"+
		"\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u016b\u0005"+
		"+\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000"+
		"\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c\u0161\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0005\u0013\u0000\u0000\u016f\u0013\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0003.\u0017\u0000\u0171\u0015\u0001\u0000\u0000"+
		"\u0000\u0172\u017e\u0005\u0012\u0000\u0000\u0173\u0178\u0003\u0014\n\u0000"+
		"\u0174\u0175\u0005+\u0000\u0000\u0175\u0177\u0003\u0014\n\u0000\u0176"+
		"\u0174\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178"+
		"\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179"+
		"\u017c\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b"+
		"\u017d\u0005+\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d"+
		"\u0001\u0000\u0000\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u0173"+
		"\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0005\u0013\u0000\u0000\u0181\u0017"+
		"\u0001\u0000\u0000\u0000\u0182\u018e\u0005\u0014\u0000\u0000\u0183\u0188"+
		"\u00034\u001a\u0000\u0184\u0185\u0005+\u0000\u0000\u0185\u0187\u00034"+
		"\u001a\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u018a\u0001\u0000"+
		"\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000"+
		"\u0000\u0000\u0189\u018c\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000"+
		"\u0000\u0000\u018b\u018d\u0005+\u0000\u0000\u018c\u018b\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018f\u0001\u0000\u0000"+
		"\u0000\u018e\u0183\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0005\u0015\u0000"+
		"\u0000\u0191\u0019\u0001\u0000\u0000\u0000\u0192\u0193\u0003\u00dam\u0000"+
		"\u0193\u0194\u0005*\u0000\u0000\u0194\u0196\u0001\u0000\u0000\u0000\u0195"+
		"\u0192\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196"+
		"\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u00034\u001a\u0000\u0198\u001b"+
		"\u0001\u0000\u0000\u0000\u0199\u01a5\u0005\u0012\u0000\u0000\u019a\u019b"+
		"\u0003\u001a\r\u0000\u019b\u019f\u0005+\u0000\u0000\u019c\u019e\u0003"+
		"\u001a\r\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000"+
		"\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a4\u0005+\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a5\u019a\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005\u0013\u0000"+
		"\u0000\u01a8\u001d\u0001\u0000\u0000\u0000\u01a9\u01ac\u0003\u00d4j\u0000"+
		"\u01aa\u01ac\u0003\u00ecv\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad"+
		"\u01af\u0003\u001c\u000e\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01ae"+
		"\u01af\u0001\u0000\u0000\u0000\u01af\u001f\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b1\u0003\u00d2i\u0000\u01b1\u01b2\u0005\u0012\u0000\u0000\u01b2\u01b3"+
		"\u0005C\u0000\u0000\u01b3\u01b4\u0005\u0013\u0000\u0000\u01b4!\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b8\u0003\u00d2i\u0000\u01b6\u01b8\u0003 \u0010\u0000"+
		"\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b8#\u0001\u0000\u0000\u0000\u01b9\u01bc\u0003\"\u0011\u0000\u01ba"+
		"\u01bc\u0005C\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01ba"+
		"\u0001\u0000\u0000\u0000\u01bc%\u0001\u0000\u0000\u0000\u01bd\u01c2\u0003"+
		"$\u0012\u0000\u01be\u01bf\u0005\u0019\u0000\u0000\u01bf\u01c1\u0003$\u0012"+
		"\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c7\u0005\u0019\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\'\u0001\u0000\u0000\u0000"+
		"\u01c8\u01cb\u00034\u001a\u0000\u01c9\u01ca\u0005*\u0000\u0000\u01ca\u01cc"+
		"\u0003&\u0013\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001"+
		"\u0000\u0000\u0000\u01cc)\u0001\u0000\u0000\u0000\u01cd\u01d9\u00054\u0000"+
		"\u0000\u01ce\u01d3\u0003(\u0014\u0000\u01cf\u01d0\u0005+\u0000\u0000\u01d0"+
		"\u01d2\u0003(\u0014\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d8\u0005+\u0000\u0000\u01d7\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da\u0001"+
		"\u0000\u0000\u0000\u01d9\u01ce\u0001\u0000\u0000\u0000\u01d9\u01da\u0001"+
		"\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u0005"+
		"5\u0000\u0000\u01dc+\u0001\u0000\u0000\u0000\u01dd\u01e0\u0003\u00d6k"+
		"\u0000\u01de\u01e0\u0003\u00eew\u0000\u01df\u01dd\u0001\u0000\u0000\u0000"+
		"\u01df\u01de\u0001\u0000\u0000\u0000\u01e0\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e3\u0003\u0016\u000b\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3-\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e9\u0003\u00e0p\u0000\u01e5\u01e9\u0003\u0012\t\u0000\u01e6\u01e9"+
		"\u0003\u000e\u0007\u0000\u01e7\u01e9\u0003,\u0016\u0000\u01e8\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9/\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u0005*\u0000\u0000\u01eb\u01ec\u0003,\u0016\u0000"+
		"\u01ec1\u0001\u0000\u0000\u0000\u01ed\u01ee\u0003\u00d2i\u0000\u01ee\u01ef"+
		"\u00057\u0000\u0000\u01ef\u01f0\u0003\u00dam\u0000\u01f03\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f9\u0003\u0010\b\u0000\u01f2\u01f9\u0003\u0018\f"+
		"\u0000\u01f3\u01f9\u0003*\u0015\u0000\u01f4\u01f9\u0003\u001e\u000f\u0000"+
		"\u01f5\u01f9\u0003\u00d2i\u0000\u01f6\u01f9\u00032\u0019\u0000\u01f7\u01f9"+
		"\u0003\u00be_\u0000\u01f8\u01f1\u0001\u0000\u0000\u0000\u01f8\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f3\u0001\u0000\u0000\u0000\u01f8\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f5\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f95\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fc\u0003\u00f0x\u0000\u01fb\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fe\u0005\u0004\u0000\u0000\u01fe\u0200\u0005?\u0000\u0000"+
		"\u01ff\u0201\u00030\u0018\u0000\u0200\u01ff\u0001\u0000\u0000\u0000\u0200"+
		"\u0201\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0005.\u0000\u0000\u0203\u0204\u00034\u001a\u0000\u02047\u0001"+
		"\u0000\u0000\u0000\u0205\u0211\u0005\u0012\u0000\u0000\u0206\u020b\u0003"+
		"\u00dcn\u0000\u0207\u0208\u0005+\u0000\u0000\u0208\u020a\u0003\u00dcn"+
		"\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000"+
		"\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000"+
		"\u0000\u020c\u020f\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000"+
		"\u0000\u020e\u0210\u0005+\u0000\u0000\u020f\u020e\u0001\u0000\u0000\u0000"+
		"\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0212\u0001\u0000\u0000\u0000"+
		"\u0211\u0206\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000"+
		"\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0214\u0005\u0013\u0000\u0000"+
		"\u02149\u0001\u0000\u0000\u0000\u0215\u0218\u0003\u00d6k\u0000\u0216\u0218"+
		"\u0003\u00eew\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0217\u0216\u0001"+
		"\u0000\u0000\u0000\u0218\u021a\u0001\u0000\u0000\u0000\u0219\u021b\u0003"+
		"8\u001c\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000"+
		"\u0000\u0000\u021b;\u0001\u0000\u0000\u0000\u021c\u021e\u0003\u00f0x\u0000"+
		"\u021d\u021c\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0220\u0005\u0005\u0000\u0000"+
		"\u0220\u0221\u0005\u000e\u0000\u0000\u0221\u0222\u0003:\u001d\u0000\u0222"+
		"=\u0001\u0000\u0000\u0000\u0223\u022f\u0005\u0012\u0000\u0000\u0224\u0229"+
		"\u0003D\"\u0000\u0225\u0226\u0005+\u0000\u0000\u0226\u0228\u0003D\"\u0000"+
		"\u0227\u0225\u0001\u0000\u0000\u0000\u0228\u022b\u0001\u0000\u0000\u0000"+
		"\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000"+
		"\u022a\u022d\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000"+
		"\u022c\u022e\u0005+\u0000\u0000\u022d\u022c\u0001\u0000\u0000\u0000\u022d"+
		"\u022e\u0001\u0000\u0000\u0000\u022e\u0230\u0001\u0000\u0000\u0000\u022f"+
		"\u0224\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230"+
		"\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u0005\u0013\u0000\u0000\u0232"+
		"?\u0001\u0000\u0000\u0000\u0233\u0234\u0005,\u0000\u0000\u0234\u0240\u0005"+
		"\u0012\u0000\u0000\u0235\u023a\u0003D\"\u0000\u0236\u0237\u0005+\u0000"+
		"\u0000\u0237\u0239\u0003D\"\u0000\u0238\u0236\u0001\u0000\u0000\u0000"+
		"\u0239\u023c\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023e\u0001\u0000\u0000\u0000"+
		"\u023c\u023a\u0001\u0000\u0000\u0000\u023d\u023f\u0005+\u0000\u0000\u023e"+
		"\u023d\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f"+
		"\u0241\u0001\u0000\u0000\u0000\u0240\u0235\u0001\u0000\u0000\u0000\u0240"+
		"\u0241\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0005\u0013\u0000\u0000\u0243A\u0001\u0000\u0000\u0000\u0244\u0246"+
		"\u0005\u0006\u0000\u0000\u0245\u0247\u0003>\u001f\u0000\u0246\u0245\u0001"+
		"\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0248\u0001"+
		"\u0000\u0000\u0000\u0248\u0249\u00058\u0000\u0000\u0249\u024a\u0003D\""+
		"\u0000\u024aC\u0001\u0000\u0000\u0000\u024b\u0251\u0003\u00e0p\u0000\u024c"+
		"\u0251\u0003@ \u0000\u024d\u0251\u0003B!\u0000\u024e\u0251\u0003L&\u0000"+
		"\u024f\u0251\u0003\u00deo\u0000\u0250\u024b\u0001\u0000\u0000\u0000\u0250"+
		"\u024c\u0001\u0000\u0000\u0000\u0250\u024d\u0001\u0000\u0000\u0000\u0250"+
		"\u024e\u0001\u0000\u0000\u0000\u0250\u024f\u0001\u0000\u0000\u0000\u0251"+
		"E\u0001\u0000\u0000\u0000\u0252\u0253\u0005*\u0000\u0000\u0253\u0254\u0003"+
		"D\"\u0000\u0254G\u0001\u0000\u0000\u0000\u0255\u0256\u0003D\"\u0000\u0256"+
		"I\u0001\u0000\u0000\u0000\u0257\u0263\u0005\u0012\u0000\u0000\u0258\u025d"+
		"\u0003H$\u0000\u0259\u025a\u0005+\u0000\u0000\u025a\u025c\u0003H$\u0000"+
		"\u025b\u0259\u0001\u0000\u0000\u0000\u025c\u025f\u0001\u0000\u0000\u0000"+
		"\u025d\u025b\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000"+
		"\u025e\u0261\u0001\u0000\u0000\u0000\u025f\u025d\u0001\u0000\u0000\u0000"+
		"\u0260\u0262\u0005+\u0000\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0261"+
		"\u0262\u0001\u0000\u0000\u0000\u0262\u0264\u0001\u0000\u0000\u0000\u0263"+
		"\u0258\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264"+
		"\u0265\u0001\u0000\u0000\u0000\u0265\u0266\u0005\u0013\u0000\u0000\u0266"+
		"K\u0001\u0000\u0000\u0000\u0267\u026a\u0003\u00d6k\u0000\u0268\u026a\u0003"+
		"\u00eew\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u0269\u0268\u0001\u0000"+
		"\u0000\u0000\u026a\u026c\u0001\u0000\u0000\u0000\u026b\u026d\u0003J%\u0000"+
		"\u026c\u026b\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000"+
		"\u026dM\u0001\u0000\u0000\u0000\u026e\u026f\u0005I\u0000\u0000\u026f\u0270"+
		"\u0005I\u0000\u0000\u0270O\u0001\u0000\u0000\u0000\u0271\u0272\u0003\u00d2"+
		"i\u0000\u0272\u0273\u0005*\u0000\u0000\u0273\u0275\u0001\u0000\u0000\u0000"+
		"\u0274\u0271\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000"+
		"\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0277\u0003D\"\u0000\u0277"+
		"Q\u0001\u0000\u0000\u0000\u0278\u0284\u0005\u0012\u0000\u0000\u0279\u027e"+
		"\u0003P(\u0000\u027a\u027b\u0005+\u0000\u0000\u027b\u027d\u0003P(\u0000"+
		"\u027c\u027a\u0001\u0000\u0000\u0000\u027d\u0280\u0001\u0000\u0000\u0000"+
		"\u027e\u027c\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000"+
		"\u027f\u0282\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000"+
		"\u0281\u0283\u0005+\u0000\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0282"+
		"\u0283\u0001\u0000\u0000\u0000\u0283\u0285\u0001\u0000\u0000\u0000\u0284"+
		"\u0279\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285"+
		"\u0286\u0001\u0000\u0000\u0000\u0286\u0287\u0005\u0013\u0000\u0000\u0287"+
		"S\u0001\u0000\u0000\u0000\u0288\u028a\u0003\u00f0x\u0000\u0289\u0288\u0001"+
		"\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028b\u0001"+
		"\u0000\u0000\u0000\u028b\u028c\u0005\u0005\u0000\u0000\u028c\u028d\u0005"+
		"\u0006\u0000\u0000\u028d\u028e\u0003\u00d2i\u0000\u028e\u028f\u0003R)"+
		"\u0000\u028f\u0290\u00058\u0000\u0000\u0290\u0291\u0003D\"\u0000\u0291"+
		"\u0292\u0005.\u0000\u0000\u0292\u0293\u0003N\'\u0000\u0293U\u0001\u0000"+
		"\u0000\u0000\u0294\u0299\u0003\u00eau\u0000\u0295\u0299\u0003\u00e4r\u0000"+
		"\u0296\u0299\u0003\u00e8t\u0000\u0297\u0299\u0003\u00e6s\u0000\u0298\u0294"+
		"\u0001\u0000\u0000\u0000\u0298\u0295\u0001\u0000\u0000\u0000\u0298\u0296"+
		"\u0001\u0000\u0000\u0000\u0298\u0297\u0001\u0000\u0000\u0000\u0299W\u0001"+
		"\u0000\u0000\u0000\u029a\u029c\u0003V+\u0000\u029b\u029d\u0003F#\u0000"+
		"\u029c\u029b\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000\u0000"+
		"\u029dY\u0001\u0000\u0000\u0000\u029e\u02aa\u0005\u0012\u0000\u0000\u029f"+
		"\u02a4\u0003X,\u0000\u02a0\u02a1\u0005+\u0000\u0000\u02a1\u02a3\u0003"+
		"X,\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a3\u02a6\u0001\u0000\u0000"+
		"\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a8\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a9\u0005+\u0000\u0000\u02a8\u02a7\u0001\u0000\u0000\u0000"+
		"\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02ab\u0001\u0000\u0000\u0000"+
		"\u02aa\u029f\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000"+
		"\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005\u0013\u0000\u0000"+
		"\u02ad[\u0001\u0000\u0000\u0000\u02ae\u02b0\u0005\u0016\u0000\u0000\u02af"+
		"\u02b1\u0003v;\u0000\u02b0\u02af\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001"+
		"\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005"+
		"\u0017\u0000\u0000\u02b3]\u0001\u0000\u0000\u0000\u02b4\u02b6\u0003\u00f0"+
		"x\u0000\u02b5\u02b4\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02b8\u0005\u0006\u0000"+
		"\u0000\u02b8\u02b9\u0003\u00d2i\u0000\u02b9\u02bc\u0003Z-\u0000\u02ba"+
		"\u02bb\u00058\u0000\u0000\u02bb\u02bd\u0003D\"\u0000\u02bc\u02ba\u0001"+
		"\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02be\u0001"+
		"\u0000\u0000\u0000\u02be\u02bf\u0003\\.\u0000\u02bf_\u0001\u0000\u0000"+
		"\u0000\u02c0\u02c3\u0005:\u0000\u0000\u02c1\u02c4\u0003\u00d2i\u0000\u02c2"+
		"\u02c4\u0003\u00d8l\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c2"+
		"\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4a\u0001"+
		"\u0000\u0000\u0000\u02c5\u02d1\u0005\u0014\u0000\u0000\u02c6\u02cb\u0003"+
		"r9\u0000\u02c7\u02c8\u0005+\u0000\u0000\u02c8\u02ca\u0003r9\u0000\u02c9"+
		"\u02c7\u0001\u0000\u0000\u0000\u02ca\u02cd\u0001\u0000\u0000\u0000\u02cb"+
		"\u02c9\u0001\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc"+
		"\u02cf\u0001\u0000\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02ce"+
		"\u02d0\u0005+\u0000\u0000\u02cf\u02ce\u0001\u0000\u0000\u0000\u02cf\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d0\u02d2\u0001\u0000\u0000\u0000\u02d1\u02c6"+
		"\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d4"+
		"\u0001\u0000\u0000\u0000\u02d3\u02d5\u0003`0\u0000\u02d4\u02d3\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000"+
		"\u0000\u0000\u02d6\u02d7\u0005\u0015\u0000\u0000\u02d7c\u0001\u0000\u0000"+
		"\u0000\u02d8\u02db\u0003r9\u0000\u02d9\u02da\u0005*\u0000\u0000\u02da"+
		"\u02dc\u0003&\u0013\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02db\u02dc"+
		"\u0001\u0000\u0000\u0000\u02dce\u0001\u0000\u0000\u0000\u02dd\u02e9\u0005"+
		"4\u0000\u0000\u02de\u02e3\u0003d2\u0000\u02df\u02e0\u0005+\u0000\u0000"+
		"\u02e0\u02e2\u0003d2\u0000\u02e1\u02df\u0001\u0000\u0000\u0000\u02e2\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e7\u0001\u0000\u0000\u0000\u02e5\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e8\u0005+\u0000\u0000\u02e7\u02e6\u0001"+
		"\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02ea\u0001"+
		"\u0000\u0000\u0000\u02e9\u02de\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001"+
		"\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ec\u0005"+
		"5\u0000\u0000\u02ecg\u0001\u0000\u0000\u0000\u02ed\u02ee\u0005,\u0000"+
		"\u0000\u02ee\u02fa\u0005\u0012\u0000\u0000\u02ef\u02f4\u0003r9\u0000\u02f0"+
		"\u02f1\u0005+\u0000\u0000\u02f1\u02f3\u0003r9\u0000\u02f2\u02f0\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f6\u0001\u0000\u0000\u0000\u02f4\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5\u02f8\u0001"+
		"\u0000\u0000\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f7\u02f9\u0005"+
		"+\u0000\u0000\u02f8\u02f7\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000"+
		"\u0000\u0000\u02f9\u02fb\u0001\u0000\u0000\u0000\u02fa\u02ef\u0001\u0000"+
		"\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fc\u02fd\u0005\u0013\u0000\u0000\u02fdi\u0001\u0000\u0000"+
		"\u0000\u02fe\u0300\u0005:\u0000\u0000\u02ff\u0301\u0005+\u0000\u0000\u0300"+
		"\u02ff\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301"+
		"k\u0001\u0000\u0000\u0000\u0302\u0303\u0003\u00dam\u0000\u0303\u0304\u0005"+
		"*\u0000\u0000\u0304\u0306\u0001\u0000\u0000\u0000\u0305\u0302\u0001\u0000"+
		"\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000"+
		"\u0000\u0000\u0307\u0308\u0003r9\u0000\u0308m\u0001\u0000\u0000\u0000"+
		"\u0309\u0315\u0005\u0012\u0000\u0000\u030a\u030f\u0003l6\u0000\u030b\u030c"+
		"\u0005+\u0000\u0000\u030c\u030e\u0003l6\u0000\u030d\u030b\u0001\u0000"+
		"\u0000\u0000\u030e\u0311\u0001\u0000\u0000\u0000\u030f\u030d\u0001\u0000"+
		"\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310\u0313\u0001\u0000"+
		"\u0000\u0000\u0311\u030f\u0001\u0000\u0000\u0000\u0312\u0314\u0005+\u0000"+
		"\u0000\u0313\u0312\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000\u0000"+
		"\u0000\u0314\u0316\u0001\u0000\u0000\u0000\u0315\u030a\u0001\u0000\u0000"+
		"\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0318\u0001\u0000\u0000"+
		"\u0000\u0317\u0319\u0003j5\u0000\u0318\u0317\u0001\u0000\u0000\u0000\u0318"+
		"\u0319\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a"+
		"\u031b\u0005\u0013\u0000\u0000\u031bo\u0001\u0000\u0000\u0000\u031c\u031f"+
		"\u0003\u00d4j\u0000\u031d\u031f\u0003\u00ecv\u0000\u031e\u031c\u0001\u0000"+
		"\u0000\u0000\u031e\u031d\u0001\u0000\u0000\u0000\u031f\u0321\u0001\u0000"+
		"\u0000\u0000\u0320\u0322\u0003n7\u0000\u0321\u0320\u0001\u0000\u0000\u0000"+
		"\u0321\u0322\u0001\u0000\u0000\u0000\u0322q\u0001\u0000\u0000\u0000\u0323"+
		"\u032b\u0003\u00d2i\u0000\u0324\u032b\u0003\u00d8l\u0000\u0325\u032b\u0003"+
		"p8\u0000\u0326\u032b\u0003\u00be_\u0000\u0327\u032b\u0003h4\u0000\u0328"+
		"\u032b\u0003f3\u0000\u0329\u032b\u0003b1\u0000\u032a\u0323\u0001\u0000"+
		"\u0000\u0000\u032a\u0324\u0001\u0000\u0000\u0000\u032a\u0325\u0001\u0000"+
		"\u0000\u0000\u032a\u0326\u0001\u0000\u0000\u0000\u032a\u0327\u0001\u0000"+
		"\u0000\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032a\u0329\u0001\u0000"+
		"\u0000\u0000\u032b\u032e\u0001\u0000\u0000\u0000\u032c\u032d\u0005\u0001"+
		"\u0000\u0000\u032d\u032f\u0003\u00d2i\u0000\u032e\u032c\u0001\u0000\u0000"+
		"\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032fs\u0001\u0000\u0000\u0000"+
		"\u0330\u0331\u0005\r\u0000\u0000\u0331\u0333\u0003r9\u0000\u0332\u0334"+
		"\u0003F#\u0000\u0333\u0332\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000"+
		"\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335\u0336\u0005.\u0000"+
		"\u0000\u0336\u0337\u0003\u00c2a\u0000\u0337u\u0001\u0000\u0000\u0000\u0338"+
		"\u033b\u0003\u00c2a\u0000\u0339\u033b\u0003t:\u0000\u033a\u0338\u0001"+
		"\u0000\u0000\u0000\u033a\u0339\u0001\u0000\u0000\u0000\u033b\u033c\u0001"+
		"\u0000\u0000\u0000\u033c\u033a\u0001\u0000\u0000\u0000\u033c\u033d\u0001"+
		"\u0000\u0000\u0000\u033dw\u0001\u0000\u0000\u0000\u033e\u033f\u0003\u00da"+
		"m\u0000\u033f\u0340\u0005*\u0000\u0000\u0340\u0342\u0001\u0000\u0000\u0000"+
		"\u0341\u033e\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000\u0000\u0000"+
		"\u0342\u0345\u0001\u0000\u0000\u0000\u0343\u0346\u0003\u00e2q\u0000\u0344"+
		"\u0346\u0003\u00c2a\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0345\u0344"+
		"\u0001\u0000\u0000\u0000\u0346y\u0001\u0000\u0000\u0000\u0347\u0353\u0005"+
		"\u0012\u0000\u0000\u0348\u034d\u0003x<\u0000\u0349\u034a\u0005+\u0000"+
		"\u0000\u034a\u034c\u0003x<\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034c"+
		"\u034f\u0001\u0000\u0000\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034d"+
		"\u034e\u0001\u0000\u0000\u0000\u034e\u0351\u0001\u0000\u0000\u0000\u034f"+
		"\u034d\u0001\u0000\u0000\u0000\u0350\u0352\u0005+\u0000\u0000\u0351\u0350"+
		"\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000\u0000\u0000\u0352\u0354"+
		"\u0001\u0000\u0000\u0000\u0353\u0348\u0001\u0000\u0000\u0000\u0353\u0354"+
		"\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000\u0355\u0356"+
		"\u0005\u0013\u0000\u0000\u0356{\u0001\u0000\u0000\u0000\u0357\u035a\u0003"+
		"\u00d4j\u0000\u0358\u035a\u0003\u00ecv\u0000\u0359\u0357\u0001\u0000\u0000"+
		"\u0000\u0359\u0358\u0001\u0000\u0000\u0000\u035a\u035c\u0001\u0000\u0000"+
		"\u0000\u035b\u035d\u0003z=\u0000\u035c\u035b\u0001\u0000\u0000\u0000\u035c"+
		"\u035d\u0001\u0000\u0000\u0000\u035d}\u0001\u0000\u0000\u0000\u035e\u0361"+
		"\u0003\u00c0`\u0000\u035f\u0360\u0005*\u0000\u0000\u0360\u0362\u0003&"+
		"\u0013\u0000\u0361\u035f\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000"+
		"\u0000\u0000\u0362\u007f\u0001\u0000\u0000\u0000\u0363\u036f\u00054\u0000"+
		"\u0000\u0364\u0369\u0003~?\u0000\u0365\u0366\u0005+\u0000\u0000\u0366"+
		"\u0368\u0003~?\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0368\u036b\u0001"+
		"\u0000\u0000\u0000\u0369\u0367\u0001\u0000\u0000\u0000\u0369\u036a\u0001"+
		"\u0000\u0000\u0000\u036a\u036d\u0001\u0000\u0000\u0000\u036b\u0369\u0001"+
		"\u0000\u0000\u0000\u036c\u036e\u0005+\u0000\u0000\u036d\u036c\u0001\u0000"+
		"\u0000\u0000\u036d\u036e\u0001\u0000\u0000\u0000\u036e\u0370\u0001\u0000"+
		"\u0000\u0000\u036f\u0364\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000"+
		"\u0000\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u0372\u00055\u0000"+
		"\u0000\u0372\u0081\u0001\u0000\u0000\u0000\u0373\u0377\u0005\f\u0000\u0000"+
		"\u0374\u0375\u0005\u0012\u0000\u0000\u0375\u0376\u0005I\u0000\u0000\u0376"+
		"\u0378\u0005\u0013\u0000\u0000\u0377\u0374\u0001\u0000\u0000\u0000\u0377"+
		"\u0378\u0001\u0000\u0000\u0000\u0378\u0083\u0001\u0000\u0000\u0000\u0379"+
		"\u037a\u0005,\u0000\u0000\u037a\u0386\u0005\u0012\u0000\u0000\u037b\u0380"+
		"\u0003\u00c2a\u0000\u037c\u037d\u0005+\u0000\u0000\u037d\u037f\u0003\u00c2"+
		"a\u0000\u037e\u037c\u0001\u0000\u0000\u0000\u037f\u0382\u0001\u0000\u0000"+
		"\u0000\u0380\u037e\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000"+
		"\u0000\u0381\u0384\u0001\u0000\u0000\u0000\u0382\u0380\u0001\u0000\u0000"+
		"\u0000\u0383\u0385\u0005+\u0000\u0000\u0384\u0383\u0001\u0000\u0000\u0000"+
		"\u0384\u0385\u0001\u0000\u0000\u0000\u0385\u0387\u0001\u0000\u0000\u0000"+
		"\u0386\u037b\u0001\u0000\u0000\u0000\u0386\u0387\u0001\u0000\u0000\u0000"+
		"\u0387\u0388\u0001\u0000\u0000\u0000\u0388\u0389\u0005\u0013\u0000\u0000"+
		"\u0389\u0085\u0001\u0000\u0000\u0000\u038a\u039c\u0005\u0014\u0000\u0000"+
		"\u038b\u0393\u0003\u00c2a\u0000\u038c\u038d\u0005+\u0000\u0000\u038d\u038f"+
		"\u0003\u00c2a\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038f\u0392\u0001"+
		"\u0000\u0000\u0000\u0390\u038e\u0001\u0000\u0000\u0000\u0390\u0391\u0001"+
		"\u0000\u0000\u0000\u0391\u0394\u0001\u0000\u0000\u0000\u0392\u0390\u0001"+
		"\u0000\u0000\u0000\u0393\u0390\u0001\u0000\u0000\u0000\u0393\u0394\u0001"+
		"\u0000\u0000\u0000\u0394\u0396\u0001\u0000\u0000\u0000\u0395\u0397\u0005"+
		"+\u0000\u0000\u0396\u0395\u0001\u0000\u0000\u0000\u0396\u0397\u0001\u0000"+
		"\u0000\u0000\u0397\u039a\u0001\u0000\u0000\u0000\u0398\u0399\u0005:\u0000"+
		"\u0000\u0399\u039b\u0003\u00c2a\u0000\u039a\u0398\u0001\u0000\u0000\u0000"+
		"\u039a\u039b\u0001\u0000\u0000\u0000\u039b\u039d\u0001\u0000\u0000\u0000"+
		"\u039c\u038b\u0001\u0000\u0000\u0000\u039c\u039d\u0001\u0000\u0000\u0000"+
		"\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u039f\u0005\u0015\u0000\u0000"+
		"\u039f\u0087\u0001\u0000\u0000\u0000\u03a0\u03a3\u0003\u00e4r\u0000\u03a1"+
		"\u03a3\u0003\u00e6s\u0000\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a2\u03a1"+
		"\u0001\u0000\u0000\u0000\u03a3\u0089\u0001\u0000\u0000\u0000\u03a4\u03a6"+
		"\u0003\u0088D\u0000\u03a5\u03a7\u0003F#\u0000\u03a6\u03a5\u0001\u0000"+
		"\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7\u008b\u0001\u0000"+
		"\u0000\u0000\u03a8\u03b4\u0005\u0012\u0000\u0000\u03a9\u03ae\u0003\u008a"+
		"E\u0000\u03aa\u03ab\u0005+\u0000\u0000\u03ab\u03ad\u0003\u008aE\u0000"+
		"\u03ac\u03aa\u0001\u0000\u0000\u0000\u03ad\u03b0\u0001\u0000\u0000\u0000"+
		"\u03ae\u03ac\u0001\u0000\u0000\u0000\u03ae\u03af\u0001\u0000\u0000\u0000"+
		"\u03af\u03b2\u0001\u0000\u0000\u0000\u03b0\u03ae\u0001\u0000\u0000\u0000"+
		"\u03b1\u03b3\u0005+\u0000\u0000\u03b2\u03b1\u0001\u0000\u0000\u0000\u03b2"+
		"\u03b3\u0001\u0000\u0000\u0000\u03b3\u03b5\u0001\u0000\u0000\u0000\u03b4"+
		"\u03a9\u0001\u0000\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5"+
		"\u03b6\u0001\u0000\u0000\u0000\u03b6\u03b7\u0005\u0013\u0000\u0000\u03b7"+
		"\u008d\u0001\u0000\u0000\u0000\u03b8\u03b9\u0005\u0006\u0000\u0000\u03b9"+
		"\u03bc\u0003\u008cF\u0000\u03ba\u03bb\u00058\u0000\u0000\u03bb\u03bd\u0003"+
		"L&\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000"+
		"\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03bf\u0003\\.\u0000"+
		"\u03bf\u008f\u0001\u0000\u0000\u0000\u03c0\u03c1\u0005\u0016\u0000\u0000"+
		"\u03c1\u03c2\u0003v;\u0000\u03c2\u03c3\u0005\u0017\u0000\u0000\u03c3\u0091"+
		"\u0001\u0000\u0000\u0000\u03c4\u03c5\u0003\u00d2i\u0000\u03c5\u03c6\u0005"+
		"7\u0000\u0000\u03c6\u03c7\u0005C\u0000\u0000\u03c7\u0093\u0001\u0000\u0000"+
		"\u0000\u03c8\u03d0\u0003\u00d2i\u0000\u03c9\u03d0\u0003\u0092I\u0000\u03ca"+
		"\u03cb\u0005\u0016\u0000\u0000\u03cb\u03cc\u0003\u0098L\u0000\u03cc\u03cd"+
		"\u0005\u0017\u0000\u0000\u03cd\u03d0\u0001\u0000\u0000\u0000\u03ce\u03d0"+
		"\u00034\u001a\u0000\u03cf\u03c8\u0001\u0000\u0000\u0000\u03cf\u03c9\u0001"+
		"\u0000\u0000\u0000\u03cf\u03ca\u0001\u0000\u0000\u0000\u03cf\u03ce\u0001"+
		"\u0000\u0000\u0000\u03d0\u0095\u0001\u0000\u0000\u0000\u03d1\u03d2\u0007"+
		"\u0000\u0000\u0000\u03d2\u0097\u0001\u0000\u0000\u0000\u03d3\u03d4\u0006"+
		"L\uffff\uffff\u0000\u03d4\u03d5\u0003\u0094J\u0000\u03d5\u03dc\u0001\u0000"+
		"\u0000\u0000\u03d6\u03d7\n\u0002\u0000\u0000\u03d7\u03d8\u0003\u0096K"+
		"\u0000\u03d8\u03d9\u0003\u0098L\u0003\u03d9\u03db\u0001\u0000\u0000\u0000"+
		"\u03da\u03d6\u0001\u0000\u0000\u0000\u03db\u03de\u0001\u0000\u0000\u0000"+
		"\u03dc\u03da\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001\u0000\u0000\u0000"+
		"\u03dd\u0099\u0001\u0000\u0000\u0000\u03de\u03dc\u0001\u0000\u0000\u0000"+
		"\u03df\u03e0\u0005\u0007\u0000\u0000\u03e0\u03e1\u0003\u0098L\u0000\u03e1"+
		"\u009b\u0001\u0000\u0000\u0000\u03e2\u03e7\u0003r9\u0000\u03e3\u03e4\u0005"+
		"+\u0000\u0000\u03e4\u03e6\u0003r9\u0000\u03e5\u03e3\u0001\u0000\u0000"+
		"\u0000\u03e6\u03e9\u0001\u0000\u0000\u0000\u03e7\u03e5\u0001\u0000\u0000"+
		"\u0000\u03e7\u03e8\u0001\u0000\u0000\u0000\u03e8\u03eb\u0001\u0000\u0000"+
		"\u0000\u03e9\u03e7\u0001\u0000\u0000\u0000\u03ea\u03ec\u0005+\u0000\u0000"+
		"\u03eb\u03ea\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000"+
		"\u03ec\u009d\u0001\u0000\u0000\u0000\u03ed\u03f2\u0003\u009cN\u0000\u03ee"+
		"\u03ef\u00051\u0000\u0000\u03ef\u03f1\u0003\u009cN\u0000\u03f0\u03ee\u0001"+
		"\u0000\u0000\u0000\u03f1\u03f4\u0001\u0000\u0000\u0000\u03f2\u03f0\u0001"+
		"\u0000\u0000\u0000\u03f2\u03f3\u0001\u0000\u0000\u0000\u03f3\u03f6\u0001"+
		"\u0000\u0000\u0000\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f5\u03f7\u0005"+
		"1\u0000\u0000\u03f6\u03f5\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000"+
		"\u0000\u0000\u03f7\u009f\u0001\u0000\u0000\u0000\u03f8\u03fa\u0003\u009e"+
		"O\u0000\u03f9\u03fb\u0003\u009aM\u0000\u03fa\u03f9\u0001\u0000\u0000\u0000"+
		"\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u03fc\u0001\u0000\u0000\u0000"+
		"\u03fc\u03fd\u00058\u0000\u0000\u03fd\u03fe\u0003\u00c2a\u0000\u03fe\u00a1"+
		"\u0001\u0000\u0000\u0000\u03ff\u0401\u0003\u00a0P\u0000\u0400\u03ff\u0001"+
		"\u0000\u0000\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0400\u0001"+
		"\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000\u0403\u00a3\u0001"+
		"\u0000\u0000\u0000\u0404\u0405\u0003v;\u0000\u0405\u00a5\u0001\u0000\u0000"+
		"\u0000\u0406\u0407\u0005\u0003\u0000\u0000\u0407\u0408\u0003\u00a4R\u0000"+
		"\u0408\u0409\u0005\u0016\u0000\u0000\u0409\u040a\u0003\u00a2Q\u0000\u040a"+
		"\u040b\u0005\u0017\u0000\u0000\u040b\u00a7\u0001\u0000\u0000\u0000\u040c"+
		"\u0412\u0003\u00d2i\u0000\u040d\u040e\u0003\u00d2i\u0000\u040e\u040f\u0005"+
		"+\u0000\u0000\u040f\u0410\u0003\u00a8T\u0000\u0410\u0412\u0001\u0000\u0000"+
		"\u0000\u0411\u040c\u0001\u0000\u0000\u0000\u0411\u040d\u0001\u0000\u0000"+
		"\u0000\u0412\u00a9\u0001\u0000\u0000\u0000\u0413\u0415\u0005\u000f\u0000"+
		"\u0000\u0414\u0416\u0003\u00a8T\u0000\u0415\u0414\u0001\u0000\u0000\u0000"+
		"\u0415\u0416\u0001\u0000\u0000\u0000\u0416\u0417\u0001\u0000\u0000\u0000"+
		"\u0417\u0418\u00059\u0000\u0000\u0418\u0419\u0003\u00c2a\u0000\u0419\u00ab"+
		"\u0001\u0000\u0000\u0000\u041a\u041c\u0003r9\u0000\u041b\u041d\u0003F"+
		"#\u0000\u041c\u041b\u0001\u0000\u0000\u0000\u041c\u041d\u0001\u0000\u0000"+
		"\u0000\u041d\u041e\u0001\u0000\u0000\u0000\u041e\u041f\u0005.\u0000\u0000"+
		"\u041f\u0420\u0003\u00c2a\u0000\u0420\u00ad\u0001\u0000\u0000\u0000\u0421"+
		"\u0422\u0005\t\u0000\u0000\u0422\u0423\u0003\u00acV\u0000\u0423\u00af"+
		"\u0001\u0000\u0000\u0000\u0424\u0425\u0005\u0002\u0000\u0000\u0425\u0426"+
		"\u0003\u00acV\u0000\u0426\u00b1\u0001\u0000\u0000\u0000\u0427\u0428\u0005"+
		"-\u0000\u0000\u0428\u0429\u0003\u00c0`\u0000\u0429\u00b3\u0001\u0000\u0000"+
		"\u0000\u042a\u042b\u0003\u00dam\u0000\u042b\u042c\u0005*\u0000\u0000\u042c"+
		"\u042d\u0003\u00c2a\u0000\u042d\u00b5\u0001\u0000\u0000\u0000\u042e\u0433"+
		"\u0003\u00b4Z\u0000\u042f\u0430\u0005+\u0000\u0000\u0430\u0432\u0003\u00b4"+
		"Z\u0000\u0431\u042f\u0001\u0000\u0000\u0000\u0432\u0435\u0001\u0000\u0000"+
		"\u0000\u0433\u0431\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000"+
		"\u0000\u0434\u0437\u0001\u0000\u0000\u0000\u0435\u0433\u0001\u0000\u0000"+
		"\u0000\u0436\u0438\u0005+\u0000\u0000\u0437\u0436\u0001\u0000\u0000\u0000"+
		"\u0437\u0438\u0001\u0000\u0000\u0000\u0438\u00b7\u0001\u0000\u0000\u0000"+
		"\u0439\u043c\u0003\u00d4j\u0000\u043a\u043c\u0003\u00ecv\u0000\u043b\u0439"+
		"\u0001\u0000\u0000\u0000\u043b\u043a\u0001\u0000\u0000\u0000\u043c\u043d"+
		"\u0001\u0000\u0000\u0000\u043d\u043e\u0005\u0012\u0000\u0000\u043e\u043f"+
		"\u0005:\u0000\u0000\u043f\u0440\u0003\u00c2a\u0000\u0440\u0441\u0005+"+
		"\u0000\u0000\u0441\u0442\u0003\u00b6[\u0000\u0442\u0443\u0005\u0013\u0000"+
		"\u0000\u0443\u00b9\u0001\u0000\u0000\u0000\u0444\u044a\u0003z=\u0000\u0445"+
		"\u0446\u00057\u0000\u0000\u0446\u044a\u0003\u00dam\u0000\u0447\u0448\u0005"+
		"7\u0000\u0000\u0448\u044a\u0005C\u0000\u0000\u0449\u0444\u0001\u0000\u0000"+
		"\u0000\u0449\u0445\u0001\u0000\u0000\u0000\u0449\u0447\u0001\u0000\u0000"+
		"\u0000\u044a\u00bb\u0001\u0000\u0000\u0000\u044b\u044c\u0006^\uffff\uffff"+
		"\u0000\u044c\u044d\u0003\u00a6S\u0000\u044d\u044e\u0003\u00ba]\u0000\u044e"+
		"\u0465\u0001\u0000\u0000\u0000\u044f\u0450\u0003\u00d2i\u0000\u0450\u0451"+
		"\u0003\u00ba]\u0000\u0451\u0465\u0001\u0000\u0000\u0000\u0452\u0453\u0003"+
		"\u0090H\u0000\u0453\u0454\u0003\u00ba]\u0000\u0454\u0465\u0001\u0000\u0000"+
		"\u0000\u0455\u0456\u0003|>\u0000\u0456\u0457\u00057\u0000\u0000\u0457"+
		"\u0458\u0003\u00dam\u0000\u0458\u0465\u0001\u0000\u0000\u0000\u0459\u045a"+
		"\u0003\u00b8\\\u0000\u045a\u045b\u00057\u0000\u0000\u045b\u045c\u0003"+
		"\u00dam\u0000\u045c\u0465\u0001\u0000\u0000\u0000\u045d\u045e\u0003\u0084"+
		"B\u0000\u045e\u045f\u00057\u0000\u0000\u045f\u0460\u0005C\u0000\u0000"+
		"\u0460\u0465\u0001\u0000\u0000\u0000\u0461\u0462\u0003\u008eG\u0000\u0462"+
		"\u0463\u0003z=\u0000\u0463\u0465\u0001\u0000\u0000\u0000\u0464\u044b\u0001"+
		"\u0000\u0000\u0000\u0464\u044f\u0001\u0000\u0000\u0000\u0464\u0452\u0001"+
		"\u0000\u0000\u0000\u0464\u0455\u0001\u0000\u0000\u0000\u0464\u0459\u0001"+
		"\u0000\u0000\u0000\u0464\u045d\u0001\u0000\u0000\u0000\u0464\u0461\u0001"+
		"\u0000\u0000\u0000\u0465\u046a\u0001\u0000\u0000\u0000\u0466\u0467\n\b"+
		"\u0000\u0000\u0467\u0469\u0003\u00ba]\u0000\u0468\u0466\u0001\u0000\u0000"+
		"\u0000\u0469\u046c\u0001\u0000\u0000\u0000\u046a\u0468\u0001\u0000\u0000"+
		"\u0000\u046a\u046b\u0001\u0000\u0000\u0000\u046b\u00bd\u0001\u0000\u0000"+
		"\u0000\u046c\u046a\u0001\u0000\u0000\u0000\u046d\u046e\u0007\u0001\u0000"+
		"\u0000\u046e\u00bf\u0001\u0000\u0000\u0000\u046f\u0480\u0003|>\u0000\u0470"+
		"\u0480\u0003\u008eG\u0000\u0471\u0480\u0003\u00d2i\u0000\u0472\u0480\u0003"+
		"\u0082A\u0000\u0473\u0480\u0003\u0084B\u0000\u0474\u0480\u0003\u0086C"+
		"\u0000\u0475\u0480\u0003\u0080@\u0000\u0476\u0480\u0003\u0090H\u0000\u0477"+
		"\u0480\u0003\u00a6S\u0000\u0478\u0480\u0003\u00aeW\u0000\u0479\u0480\u0003"+
		"\u00aaU\u0000\u047a\u0480\u0003\u00b0X\u0000\u047b\u0480\u0003\u00b2Y"+
		"\u0000\u047c\u0480\u0003\u00b8\\\u0000\u047d\u0480\u0003\u00bc^\u0000"+
		"\u047e\u0480\u0003\u00be_\u0000\u047f\u046f\u0001\u0000\u0000\u0000\u047f"+
		"\u0470\u0001\u0000\u0000\u0000\u047f\u0471\u0001\u0000\u0000\u0000\u047f"+
		"\u0472\u0001\u0000\u0000\u0000\u047f\u0473\u0001\u0000\u0000\u0000\u047f"+
		"\u0474\u0001\u0000\u0000\u0000\u047f\u0475\u0001\u0000\u0000\u0000\u047f"+
		"\u0476\u0001\u0000\u0000\u0000\u047f\u0477\u0001\u0000\u0000\u0000\u047f"+
		"\u0478\u0001\u0000\u0000\u0000\u047f\u0479\u0001\u0000\u0000\u0000\u047f"+
		"\u047a\u0001\u0000\u0000\u0000\u047f\u047b\u0001\u0000\u0000\u0000\u047f"+
		"\u047c\u0001\u0000\u0000\u0000\u047f\u047d\u0001\u0000\u0000\u0000\u047f"+
		"\u047e\u0001\u0000\u0000\u0000\u0480\u00c1\u0001\u0000\u0000\u0000\u0481"+
		"\u0482\u0006a\uffff\uffff\u0000\u0482\u0483\u0003\u00c0`\u0000\u0483\u04cb"+
		"\u0001\u0000\u0000\u0000\u0484\u0485\n\u0017\u0000\u0000\u0485\u0486\u0005"+
		"/\u0000\u0000\u0486\u04ca\u0003\u00c2a\u0018\u0487\u0488\n\u0016\u0000"+
		"\u0000\u0488\u0489\u00050\u0000\u0000\u0489\u04ca\u0003\u00c2a\u0017\u048a"+
		"\u048b\n\u0015\u0000\u0000\u048b\u048c\u0005\u001c\u0000\u0000\u048c\u04ca"+
		"\u0003\u00c2a\u0016\u048d\u048e\n\u0014\u0000\u0000\u048e\u048f\u0005"+
		"\u001e\u0000\u0000\u048f\u04ca\u0003\u00c2a\u0015\u0490\u0491\n\u0013"+
		"\u0000\u0000\u0491\u0492\u0005%\u0000\u0000\u0492\u04ca\u0003\u00c2a\u0014"+
		"\u0493\u0494\n\u0012\u0000\u0000\u0494\u0495\u0005\'\u0000\u0000\u0495"+
		"\u04ca\u0003\u00c2a\u0013\u0496\u0497\n\u0011\u0000\u0000\u0497\u0498"+
		"\u0005\u001d\u0000\u0000\u0498\u04ca\u0003\u00c2a\u0012\u0499\u049a\n"+
		"\u0010\u0000\u0000\u049a\u049b\u0005\u001f\u0000\u0000\u049b\u04ca\u0003"+
		"\u00c2a\u0011\u049c\u049d\n\u000f\u0000\u0000\u049d\u049e\u0005&\u0000"+
		"\u0000\u049e\u04ca\u0003\u00c2a\u0010\u049f\u04a0\n\u000e\u0000\u0000"+
		"\u04a0\u04a1\u0005(\u0000\u0000\u04a1\u04ca\u0003\u00c2a\u000f\u04a2\u04a3"+
		"\n\r\u0000\u0000\u04a3\u04a4\u0005)\u0000\u0000\u04a4\u04ca\u0003\u00c2"+
		"a\u000e\u04a5\u04a6\n\f\u0000\u0000\u04a6\u04a7\u00056\u0000\u0000\u04a7"+
		"\u04ca\u0003\u00c2a\r\u04a8\u04a9\n\u000b\u0000\u0000\u04a9\u04aa\u0005"+
		"\u0018\u0000\u0000\u04aa\u04ca\u0003\u00c2a\f\u04ab\u04ac\n\n\u0000\u0000"+
		"\u04ac\u04ad\u0005!\u0000\u0000\u04ad\u04ca\u0003\u00c2a\u000b\u04ae\u04af"+
		"\n\t\u0000\u0000\u04af\u04b0\u0005\u0019\u0000\u0000\u04b0\u04ca\u0003"+
		"\u00c2a\n\u04b1\u04b2\n\b\u0000\u0000\u04b2\u04b3\u0005\"\u0000\u0000"+
		"\u04b3\u04ca\u0003\u00c2a\t\u04b4\u04b5\n\u0007\u0000\u0000\u04b5\u04b6"+
		"\u0005\u001a\u0000\u0000\u04b6\u04ca\u0003\u00c2a\b\u04b7\u04b8\n\u0006"+
		"\u0000\u0000\u04b8\u04b9\u0005#\u0000\u0000\u04b9\u04ca\u0003\u00c2a\u0007"+
		"\u04ba\u04bb\n\u0005\u0000\u0000\u04bb\u04bc\u0005\u001b\u0000\u0000\u04bc"+
		"\u04ca\u0003\u00c2a\u0006\u04bd\u04be\n\u0004\u0000\u0000\u04be\u04bf"+
		"\u0005$\u0000\u0000\u04bf\u04ca\u0003\u00c2a\u0005\u04c0\u04c1\n\u0003"+
		"\u0000\u0000\u04c1\u04c2\u0005 \u0000\u0000\u04c2\u04ca\u0003\u00c2a\u0004"+
		"\u04c3\u04c4\n\u0002\u0000\u0000\u04c4\u04c5\u00053\u0000\u0000\u04c5"+
		"\u04ca\u0003\u00c2a\u0003\u04c6\u04c7\n\u0001\u0000\u0000\u04c7\u04c8"+
		"\u00052\u0000\u0000\u04c8\u04ca\u0003\u00c2a\u0002\u04c9\u0484\u0001\u0000"+
		"\u0000\u0000\u04c9\u0487\u0001\u0000\u0000\u0000\u04c9\u048a\u0001\u0000"+
		"\u0000\u0000\u04c9\u048d\u0001\u0000\u0000\u0000\u04c9\u0490\u0001\u0000"+
		"\u0000\u0000\u04c9\u0493\u0001\u0000\u0000\u0000\u04c9\u0496\u0001\u0000"+
		"\u0000\u0000\u04c9\u0499\u0001\u0000\u0000\u0000\u04c9\u049c\u0001\u0000"+
		"\u0000\u0000\u04c9\u049f\u0001\u0000\u0000\u0000\u04c9\u04a2\u0001\u0000"+
		"\u0000\u0000\u04c9\u04a5\u0001\u0000\u0000\u0000\u04c9\u04a8\u0001\u0000"+
		"\u0000\u0000\u04c9\u04ab\u0001\u0000\u0000\u0000\u04c9\u04ae\u0001\u0000"+
		"\u0000\u0000\u04c9\u04b1\u0001\u0000\u0000\u0000\u04c9\u04b4\u0001\u0000"+
		"\u0000\u0000\u04c9\u04b7\u0001\u0000\u0000\u0000\u04c9\u04ba\u0001\u0000"+
		"\u0000\u0000\u04c9\u04bd\u0001\u0000\u0000\u0000\u04c9\u04c0\u0001\u0000"+
		"\u0000\u0000\u04c9\u04c3\u0001\u0000\u0000\u0000\u04c9\u04c6\u0001\u0000"+
		"\u0000\u0000\u04ca\u04cd\u0001\u0000\u0000\u0000\u04cb\u04c9\u0001\u0000"+
		"\u0000\u0000\u04cb\u04cc\u0001\u0000\u0000\u0000\u04cc\u00c3\u0001\u0000"+
		"\u0000\u0000\u04cd\u04cb\u0001\u0000\u0000\u0000\u04ce\u04cf\u0003\u00da"+
		"m\u0000\u04cf\u04d0\u0005*\u0000\u0000\u04d0\u04d2\u0001\u0000\u0000\u0000"+
		"\u04d1\u04ce\u0001\u0000\u0000\u0000\u04d1\u04d2\u0001\u0000\u0000\u0000"+
		"\u04d2\u04d3\u0001\u0000\u0000\u0000\u04d3\u04d4\u0003D\"\u0000\u04d4"+
		"\u00c5\u0001\u0000\u0000\u0000\u04d5\u04e1\u0005\u0012\u0000\u0000\u04d6"+
		"\u04db\u0003\u00c4b\u0000\u04d7\u04d8\u0005+\u0000\u0000\u04d8\u04da\u0003"+
		"\u00c4b\u0000\u04d9\u04d7\u0001\u0000\u0000\u0000\u04da\u04dd\u0001\u0000"+
		"\u0000\u0000\u04db\u04d9\u0001\u0000\u0000\u0000\u04db\u04dc\u0001\u0000"+
		"\u0000\u0000\u04dc\u04df\u0001\u0000\u0000\u0000\u04dd\u04db\u0001\u0000"+
		"\u0000\u0000\u04de\u04e0\u0005+\u0000\u0000\u04df\u04de\u0001\u0000\u0000"+
		"\u0000\u04df\u04e0\u0001\u0000\u0000\u0000\u04e0\u04e2\u0001\u0000\u0000"+
		"\u0000\u04e1\u04d6\u0001\u0000\u0000\u0000\u04e1\u04e2\u0001\u0000\u0000"+
		"\u0000\u04e2\u04e3\u0001\u0000\u0000\u0000\u04e3\u04e4\u0005\u0013\u0000"+
		"\u0000\u04e4\u00c7\u0001\u0000\u0000\u0000\u04e5\u04e7\u0003\u00d4j\u0000"+
		"\u04e6\u04e8\u0003\u00c6c\u0000\u04e7\u04e6\u0001\u0000\u0000\u0000\u04e7"+
		"\u04e8\u0001\u0000\u0000\u0000\u04e8\u00c9\u0001\u0000\u0000\u0000\u04e9"+
		"\u04eb\u0003\u00c8d\u0000\u04ea\u04e9\u0001\u0000\u0000\u0000\u04eb\u04ec"+
		"\u0001\u0000\u0000\u0000\u04ec\u04ea\u0001\u0000\u0000\u0000\u04ec\u04ed"+
		"\u0001\u0000\u0000\u0000\u04ed\u00cb\u0001\u0000\u0000\u0000\u04ee\u04f0"+
		"\u0003\u00f0x\u0000\u04ef\u04ee\u0001\u0000\u0000\u0000\u04ef\u04f0\u0001"+
		"\u0000\u0000\u0000\u04f0\u04f2\u0001\u0000\u0000\u0000\u04f1\u04f3\u0003"+
		"\u00f2y\u0000\u04f2\u04f1\u0001\u0000\u0000\u0000\u04f2\u04f3\u0001\u0000"+
		"\u0000\u0000\u04f3\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f5\u0005\u000e"+
		"\u0000\u0000\u04f5\u04f6\u0003:\u001d\u0000\u04f6\u04f7\u0005\u0016\u0000"+
		"\u0000\u04f7\u04f8\u0003\u00cae\u0000\u04f8\u04f9\u0005\u0017\u0000\u0000"+
		"\u04f9\u00cd\u0001\u0000\u0000\u0000\u04fa\u04fc\u0003\u00f0x\u0000\u04fb"+
		"\u04fa\u0001\u0000\u0000\u0000\u04fb\u04fc\u0001\u0000\u0000\u0000\u04fc"+
		"\u04fe\u0001\u0000\u0000\u0000\u04fd\u04ff\u0003\u00f2y\u0000\u04fe\u04fd"+
		"\u0001\u0000\u0000\u0000\u04fe\u04ff\u0001\u0000\u0000\u0000\u04ff\u0500"+
		"\u0001\u0000\u0000\u0000\u0500\u0501\u0005\u000e\u0000\u0000\u0501\u0502"+
		"\u0003:\u001d\u0000\u0502\u0503\u0005.\u0000\u0000\u0503\u0504\u0003L"+
		"&\u0000\u0504\u00cf\u0001\u0000\u0000\u0000\u0505\u050d\u0003\n\u0005"+
		"\u0000\u0506\u050d\u00036\u001b\u0000\u0507\u050d\u0003<\u001e\u0000\u0508"+
		"\u050d\u0003T*\u0000\u0509\u050d\u0003^/\u0000\u050a\u050d\u0003\u00cc"+
		"f\u0000\u050b\u050d\u0003\u00ceg\u0000\u050c\u0505\u0001\u0000\u0000\u0000"+
		"\u050c\u0506\u0001\u0000\u0000\u0000\u050c\u0507\u0001\u0000\u0000\u0000"+
		"\u050c\u0508\u0001\u0000\u0000\u0000\u050c\u0509\u0001\u0000\u0000\u0000"+
		"\u050c\u050a\u0001\u0000\u0000\u0000\u050c\u050b\u0001\u0000\u0000\u0000"+
		"\u050d\u00d1\u0001\u0000\u0000\u0000\u050e\u050f\u0005?\u0000\u0000\u050f"+
		"\u00d3\u0001\u0000\u0000\u0000\u0510\u0511\u0005@\u0000\u0000\u0511\u00d5"+
		"\u0001\u0000\u0000\u0000\u0512\u0513\u0005@\u0000\u0000\u0513\u00d7\u0001"+
		"\u0000\u0000\u0000\u0514\u0515\u0005A\u0000\u0000\u0515\u00d9\u0001\u0000"+
		"\u0000\u0000\u0516\u0517\u0005?\u0000\u0000\u0517\u00db\u0001\u0000\u0000"+
		"\u0000\u0518\u0519\u0005?\u0000\u0000\u0519\u00dd\u0001\u0000\u0000\u0000"+
		"\u051a\u051b\u0005?\u0000\u0000\u051b\u00df\u0001\u0000\u0000\u0000\u051c"+
		"\u051d\u0005?\u0000\u0000\u051d\u00e1\u0001\u0000\u0000\u0000\u051e\u051f"+
		"\u0005A\u0000\u0000\u051f\u00e3\u0001\u0000\u0000\u0000\u0520\u0521\u0003"+
		"\u00d8l\u0000\u0521\u00e5\u0001\u0000\u0000\u0000\u0522\u0523\u0003\u00d2"+
		"i\u0000\u0523\u00e7\u0001\u0000\u0000\u0000\u0524\u0525\u0003\u00dam\u0000"+
		"\u0525\u0526\u0003\u00d2i\u0000\u0526\u00e9\u0001\u0000\u0000\u0000\u0527"+
		"\u0528\u0003\u00dam\u0000\u0528\u0529\u0003\u00d8l\u0000\u0529\u00eb\u0001"+
		"\u0000\u0000\u0000\u052a\u052b\u0003\u00d2i\u0000\u052b\u052c\u00057\u0000"+
		"\u0000\u052c\u052d\u0003\u00d4j\u0000\u052d\u00ed\u0001\u0000\u0000\u0000"+
		"\u052e\u052f\u0003\u00d2i\u0000\u052f\u0530\u00057\u0000\u0000\u0530\u0531"+
		"\u0003\u00d6k\u0000\u0531\u00ef\u0001\u0000\u0000\u0000\u0532\u0533\u0005"+
		"\u000b\u0000\u0000\u0533\u00f1\u0001\u0000\u0000\u0000\u0534\u0535\u0005"+
		"\n\u0000\u0000\u0535\u00f3\u0001\u0000\u0000\u0000\u00a2\u00f7\u00f9\u0104"+
		"\u010e\u0114\u0119\u011b\u0123\u0127\u0129\u0131\u0135\u013d\u0141\u0143"+
		"\u0149\u0155\u0159\u015b\u0166\u016a\u016c\u0178\u017c\u017e\u0188\u018c"+
		"\u018e\u0195\u019f\u01a3\u01a5\u01ab\u01ae\u01b7\u01bb\u01c2\u01c6\u01cb"+
		"\u01d3\u01d7\u01d9\u01df\u01e2\u01e8\u01f8\u01fb\u0200\u020b\u020f\u0211"+
		"\u0217\u021a\u021d\u0229\u022d\u022f\u023a\u023e\u0240\u0246\u0250\u025d"+
		"\u0261\u0263\u0269\u026c\u0274\u027e\u0282\u0284\u0289\u0298\u029c\u02a4"+
		"\u02a8\u02aa\u02b0\u02b5\u02bc\u02c3\u02cb\u02cf\u02d1\u02d4\u02db\u02e3"+
		"\u02e7\u02e9\u02f4\u02f8\u02fa\u0300\u0305\u030f\u0313\u0315\u0318\u031e"+
		"\u0321\u032a\u032e\u0333\u033a\u033c\u0341\u0345\u034d\u0351\u0353\u0359"+
		"\u035c\u0361\u0369\u036d\u036f\u0377\u0380\u0384\u0386\u0390\u0393\u0396"+
		"\u039a\u039c\u03a2\u03a6\u03ae\u03b2\u03b4\u03bc\u03cf\u03dc\u03e7\u03eb"+
		"\u03f2\u03f6\u03fa\u0402\u0411\u0415\u041c\u0433\u0437\u043b\u0449\u0464"+
		"\u046a\u047f\u04c9\u04cb\u04d1\u04db\u04df\u04e1\u04e7\u04ec\u04ef\u04f2"+
		"\u04fb\u04fe\u050c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
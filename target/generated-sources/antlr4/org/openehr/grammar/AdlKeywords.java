// Generated from org/openehr/grammar/AdlKeywords.g4 by ANTLR 4.5
package org.openehr.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AdlKeywords extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SYM_ARCHETYPE=1, SYM_TEMPLATE_OVERLAY=2, SYM_TEMPLATE=3, SYM_OPERATIONAL_TEMPLATE=4, 
		SYM_SPECIALIZE=5, SYM_LANGUAGE=6, SYM_DESCRIPTION=7, SYM_DEFINITION=8, 
		SYM_RULES=9, SYM_TERMINOLOGY=10, SYM_ANNOTATIONS=11, SYM_COMPONENT_TERMINOLOGIES=12, 
		SYM_EXISTENCE=13, SYM_OCCURRENCES=14, SYM_CARDINALITY=15, SYM_ORDERED=16, 
		SYM_UNORDERED=17, SYM_UNIQUE=18, SYM_USE_NODE=19, SYM_USE_ARCHETYPE=20, 
		SYM_ALLOW_ARCHETYPE=21, SYM_INCLUDE=22, SYM_EXCLUDE=23, SYM_AFTER=24, 
		SYM_BEFORE=25, SYM_CLOSED=26, SYM_THEN=27, SYM_AND=28, SYM_OR=29, SYM_XOR=30, 
		SYM_NOT=31, SYM_IMPLIES=32, SYM_FOR_ALL=33, SYM_EXISTS=34, SYM_MATCHES=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SYM_ARCHETYPE", "SYM_TEMPLATE_OVERLAY", "SYM_TEMPLATE", "SYM_OPERATIONAL_TEMPLATE", 
		"SYM_SPECIALIZE", "SYM_LANGUAGE", "SYM_DESCRIPTION", "SYM_DEFINITION", 
		"SYM_RULES", "SYM_TERMINOLOGY", "SYM_ANNOTATIONS", "SYM_COMPONENT_TERMINOLOGIES", 
		"SYM_EXISTENCE", "SYM_OCCURRENCES", "SYM_CARDINALITY", "SYM_ORDERED", 
		"SYM_UNORDERED", "SYM_UNIQUE", "SYM_USE_NODE", "SYM_USE_ARCHETYPE", "SYM_ALLOW_ARCHETYPE", 
		"SYM_INCLUDE", "SYM_EXCLUDE", "SYM_AFTER", "SYM_BEFORE", "SYM_CLOSED", 
		"SYM_THEN", "SYM_AND", "SYM_OR", "SYM_XOR", "SYM_NOT", "SYM_IMPLIES", 
		"SYM_FOR_ALL", "SYM_EXISTS", "SYM_MATCHES"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SYM_ARCHETYPE", "SYM_TEMPLATE_OVERLAY", "SYM_TEMPLATE", "SYM_OPERATIONAL_TEMPLATE", 
		"SYM_SPECIALIZE", "SYM_LANGUAGE", "SYM_DESCRIPTION", "SYM_DEFINITION", 
		"SYM_RULES", "SYM_TERMINOLOGY", "SYM_ANNOTATIONS", "SYM_COMPONENT_TERMINOLOGIES", 
		"SYM_EXISTENCE", "SYM_OCCURRENCES", "SYM_CARDINALITY", "SYM_ORDERED", 
		"SYM_UNORDERED", "SYM_UNIQUE", "SYM_USE_NODE", "SYM_USE_ARCHETYPE", "SYM_ALLOW_ARCHETYPE", 
		"SYM_INCLUDE", "SYM_EXCLUDE", "SYM_AFTER", "SYM_BEFORE", "SYM_CLOSED", 
		"SYM_THEN", "SYM_AND", "SYM_OR", "SYM_XOR", "SYM_NOT", "SYM_IMPLIES", 
		"SYM_FOR_ALL", "SYM_EXISTS", "SYM_MATCHES"
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


	public AdlKeywords(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AdlKeywords.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u01ab\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01aa\n$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\33\4\2CC"+
		"cc\4\2TTtt\4\2EEee\4\2JJjj\4\2GGgg\4\2VVvv\4\2[[{{\4\2RRrr\4\2OOoo\4\2"+
		"NNnn\4\2QQqq\4\2XXxx\4\2KKkk\4\2PPpp\4\2UUuu\6\2UU\\\\uu||\4\2IIii\4\2"+
		"WWww\4\2FFff\4\2HHhh\4\2ZZzz\4\2SSss\3\2aa\4\2YYyy\4\2DDdd\u01ac\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I"+
		"\3\2\2\2\5S\3\2\2\2\7d\3\2\2\2\tm\3\2\2\2\13\u0082\3\2\2\2\r\u008e\3\2"+
		"\2\2\17\u0098\3\2\2\2\21\u00a5\3\2\2\2\23\u00b1\3\2\2\2\25\u00b8\3\2\2"+
		"\2\27\u00c5\3\2\2\2\31\u00d2\3\2\2\2\33\u00eb\3\2\2\2\35\u00f5\3\2\2\2"+
		"\37\u0101\3\2\2\2!\u010d\3\2\2\2#\u0115\3\2\2\2%\u011f\3\2\2\2\'\u0126"+
		"\3\2\2\2)\u012f\3\2\2\2+\u013d\3\2\2\2-\u014d\3\2\2\2/\u0155\3\2\2\2\61"+
		"\u015d\3\2\2\2\63\u0163\3\2\2\2\65\u016a\3\2\2\2\67\u0171\3\2\2\29\u0176"+
		"\3\2\2\2;\u017a\3\2\2\2=\u017d\3\2\2\2?\u0181\3\2\2\2A\u0185\3\2\2\2C"+
		"\u018d\3\2\2\2E\u0195\3\2\2\2G\u01a9\3\2\2\2IJ\t\2\2\2JK\t\3\2\2KL\t\4"+
		"\2\2LM\t\5\2\2MN\t\6\2\2NO\t\7\2\2OP\t\b\2\2PQ\t\t\2\2QR\t\6\2\2R\4\3"+
		"\2\2\2ST\t\7\2\2TU\t\6\2\2UV\t\n\2\2VW\t\t\2\2WX\t\13\2\2XY\t\2\2\2YZ"+
		"\t\7\2\2Z[\t\6\2\2[\\\7a\2\2\\]\t\f\2\2]^\t\r\2\2^_\t\6\2\2_`\t\3\2\2"+
		"`a\t\13\2\2ab\t\2\2\2bc\t\b\2\2c\6\3\2\2\2de\t\7\2\2ef\t\6\2\2fg\t\n\2"+
		"\2gh\t\t\2\2hi\t\13\2\2ij\t\2\2\2jk\t\7\2\2kl\t\6\2\2l\b\3\2\2\2mn\t\f"+
		"\2\2no\t\t\2\2op\t\6\2\2pq\t\3\2\2qr\t\2\2\2rs\t\7\2\2st\t\16\2\2tu\t"+
		"\f\2\2uv\t\17\2\2vw\t\2\2\2wx\t\13\2\2xy\7a\2\2yz\t\7\2\2z{\t\6\2\2{|"+
		"\t\n\2\2|}\t\t\2\2}~\t\13\2\2~\177\t\2\2\2\177\u0080\t\7\2\2\u0080\u0081"+
		"\t\6\2\2\u0081\n\3\2\2\2\u0082\u0083\7\f\2\2\u0083\u0084\t\20\2\2\u0084"+
		"\u0085\t\t\2\2\u0085\u0086\t\6\2\2\u0086\u0087\t\4\2\2\u0087\u0088\t\16"+
		"\2\2\u0088\u0089\t\2\2\2\u0089\u008a\t\13\2\2\u008a\u008b\t\16\2\2\u008b"+
		"\u008c\t\21\2\2\u008c\u008d\t\6\2\2\u008d\f\3\2\2\2\u008e\u008f\7\f\2"+
		"\2\u008f\u0090\t\13\2\2\u0090\u0091\t\2\2\2\u0091\u0092\t\17\2\2\u0092"+
		"\u0093\t\22\2\2\u0093\u0094\t\23\2\2\u0094\u0095\t\2\2\2\u0095\u0096\t"+
		"\22\2\2\u0096\u0097\t\6\2\2\u0097\16\3\2\2\2\u0098\u0099\7\f\2\2\u0099"+
		"\u009a\t\24\2\2\u009a\u009b\t\6\2\2\u009b\u009c\t\20\2\2\u009c\u009d\t"+
		"\4\2\2\u009d\u009e\t\3\2\2\u009e\u009f\t\16\2\2\u009f\u00a0\t\t\2\2\u00a0"+
		"\u00a1\t\7\2\2\u00a1\u00a2\t\16\2\2\u00a2\u00a3\t\f\2\2\u00a3\u00a4\t"+
		"\17\2\2\u00a4\20\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6\u00a7\t\24\2\2\u00a7"+
		"\u00a8\t\6\2\2\u00a8\u00a9\t\25\2\2\u00a9\u00aa\t\16\2\2\u00aa\u00ab\t"+
		"\17\2\2\u00ab\u00ac\t\16\2\2\u00ac\u00ad\t\7\2\2\u00ad\u00ae\t\16\2\2"+
		"\u00ae\u00af\t\f\2\2\u00af\u00b0\t\17\2\2\u00b0\22\3\2\2\2\u00b1\u00b2"+
		"\7\f\2\2\u00b2\u00b3\t\3\2\2\u00b3\u00b4\t\23\2\2\u00b4\u00b5\t\13\2\2"+
		"\u00b5\u00b6\t\6\2\2\u00b6\u00b7\t\20\2\2\u00b7\24\3\2\2\2\u00b8\u00b9"+
		"\7\f\2\2\u00b9\u00ba\t\7\2\2\u00ba\u00bb\t\6\2\2\u00bb\u00bc\t\3\2\2\u00bc"+
		"\u00bd\t\n\2\2\u00bd\u00be\t\16\2\2\u00be\u00bf\t\17\2\2\u00bf\u00c0\t"+
		"\f\2\2\u00c0\u00c1\t\13\2\2\u00c1\u00c2\t\f\2\2\u00c2\u00c3\t\22\2\2\u00c3"+
		"\u00c4\t\b\2\2\u00c4\26\3\2\2\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\t\2\2"+
		"\2\u00c7\u00c8\t\17\2\2\u00c8\u00c9\t\17\2\2\u00c9\u00ca\t\f\2\2\u00ca"+
		"\u00cb\t\7\2\2\u00cb\u00cc\t\2\2\2\u00cc\u00cd\t\7\2\2\u00cd\u00ce\t\16"+
		"\2\2\u00ce\u00cf\t\f\2\2\u00cf\u00d0\t\17\2\2\u00d0\u00d1\t\20\2\2\u00d1"+
		"\30\3\2\2\2\u00d2\u00d3\7\f\2\2\u00d3\u00d4\t\4\2\2\u00d4\u00d5\t\f\2"+
		"\2\u00d5\u00d6\t\n\2\2\u00d6\u00d7\t\t\2\2\u00d7\u00d8\t\f\2\2\u00d8\u00d9"+
		"\t\17\2\2\u00d9\u00da\t\6\2\2\u00da\u00db\t\17\2\2\u00db\u00dc\t\7\2\2"+
		"\u00dc\u00dd\7a\2\2\u00dd\u00de\t\7\2\2\u00de\u00df\t\6\2\2\u00df\u00e0"+
		"\t\3\2\2\u00e0\u00e1\t\n\2\2\u00e1\u00e2\t\16\2\2\u00e2\u00e3\t\17\2\2"+
		"\u00e3\u00e4\t\f\2\2\u00e4\u00e5\t\13\2\2\u00e5\u00e6\t\f\2\2\u00e6\u00e7"+
		"\t\22\2\2\u00e7\u00e8\t\16\2\2\u00e8\u00e9\t\6\2\2\u00e9\u00ea\t\20\2"+
		"\2\u00ea\32\3\2\2\2\u00eb\u00ec\t\6\2\2\u00ec\u00ed\t\26\2\2\u00ed\u00ee"+
		"\t\16\2\2\u00ee\u00ef\t\20\2\2\u00ef\u00f0\t\7\2\2\u00f0\u00f1\t\6\2\2"+
		"\u00f1\u00f2\t\17\2\2\u00f2\u00f3\t\4\2\2\u00f3\u00f4\t\6\2\2\u00f4\34"+
		"\3\2\2\2\u00f5\u00f6\t\f\2\2\u00f6\u00f7\t\4\2\2\u00f7\u00f8\t\4\2\2\u00f8"+
		"\u00f9\t\23\2\2\u00f9\u00fa\t\3\2\2\u00fa\u00fb\t\3\2\2\u00fb\u00fc\t"+
		"\6\2\2\u00fc\u00fd\t\17\2\2\u00fd\u00fe\t\4\2\2\u00fe\u00ff\t\6\2\2\u00ff"+
		"\u0100\t\20\2\2\u0100\36\3\2\2\2\u0101\u0102\t\4\2\2\u0102\u0103\t\2\2"+
		"\2\u0103\u0104\t\3\2\2\u0104\u0105\t\24\2\2\u0105\u0106\t\16\2\2\u0106"+
		"\u0107\t\17\2\2\u0107\u0108\t\2\2\2\u0108\u0109\t\13\2\2\u0109\u010a\t"+
		"\16\2\2\u010a\u010b\t\7\2\2\u010b\u010c\t\b\2\2\u010c \3\2\2\2\u010d\u010e"+
		"\t\f\2\2\u010e\u010f\t\3\2\2\u010f\u0110\t\24\2\2\u0110\u0111\t\6\2\2"+
		"\u0111\u0112\t\3\2\2\u0112\u0113\t\6\2\2\u0113\u0114\t\24\2\2\u0114\""+
		"\3\2\2\2\u0115\u0116\t\23\2\2\u0116\u0117\t\17\2\2\u0117\u0118\t\f\2\2"+
		"\u0118\u0119\t\3\2\2\u0119\u011a\t\24\2\2\u011a\u011b\t\6\2\2\u011b\u011c"+
		"\t\3\2\2\u011c\u011d\t\6\2\2\u011d\u011e\t\24\2\2\u011e$\3\2\2\2\u011f"+
		"\u0120\t\23\2\2\u0120\u0121\t\17\2\2\u0121\u0122\t\16\2\2\u0122\u0123"+
		"\t\27\2\2\u0123\u0124\t\23\2\2\u0124\u0125\t\6\2\2\u0125&\3\2\2\2\u0126"+
		"\u0127\t\23\2\2\u0127\u0128\t\20\2\2\u0128\u0129\t\6\2\2\u0129\u012a\t"+
		"\30\2\2\u012a\u012b\t\17\2\2\u012b\u012c\t\f\2\2\u012c\u012d\t\24\2\2"+
		"\u012d\u012e\t\6\2\2\u012e(\3\2\2\2\u012f\u0130\t\23\2\2\u0130\u0131\t"+
		"\20\2\2\u0131\u0132\t\6\2\2\u0132\u0133\t\30\2\2\u0133\u0134\t\2\2\2\u0134"+
		"\u0135\t\3\2\2\u0135\u0136\t\4\2\2\u0136\u0137\t\5\2\2\u0137\u0138\t\6"+
		"\2\2\u0138\u0139\t\7\2\2\u0139\u013a\t\b\2\2\u013a\u013b\t\t\2\2\u013b"+
		"\u013c\t\6\2\2\u013c*\3\2\2\2\u013d\u013e\t\2\2\2\u013e\u013f\t\13\2\2"+
		"\u013f\u0140\t\13\2\2\u0140\u0141\t\f\2\2\u0141\u0142\t\31\2\2\u0142\u0143"+
		"\t\30\2\2\u0143\u0144\t\2\2\2\u0144\u0145\t\3\2\2\u0145\u0146\t\4\2\2"+
		"\u0146\u0147\t\5\2\2\u0147\u0148\t\6\2\2\u0148\u0149\t\7\2\2\u0149\u014a"+
		"\t\b\2\2\u014a\u014b\t\t\2\2\u014b\u014c\t\6\2\2\u014c,\3\2\2\2\u014d"+
		"\u014e\t\16\2\2\u014e\u014f\t\17\2\2\u014f\u0150\t\4\2\2\u0150\u0151\t"+
		"\13\2\2\u0151\u0152\t\23\2\2\u0152\u0153\t\24\2\2\u0153\u0154\t\6\2\2"+
		"\u0154.\3\2\2\2\u0155\u0156\t\6\2\2\u0156\u0157\t\26\2\2\u0157\u0158\t"+
		"\4\2\2\u0158\u0159\t\13\2\2\u0159\u015a\t\23\2\2\u015a\u015b\t\24\2\2"+
		"\u015b\u015c\t\6\2\2\u015c\60\3\2\2\2\u015d\u015e\t\2\2\2\u015e\u015f"+
		"\t\25\2\2\u015f\u0160\t\7\2\2\u0160\u0161\t\6\2\2\u0161\u0162\t\3\2\2"+
		"\u0162\62\3\2\2\2\u0163\u0164\t\32\2\2\u0164\u0165\t\6\2\2\u0165\u0166"+
		"\t\25\2\2\u0166\u0167\t\f\2\2\u0167\u0168\t\3\2\2\u0168\u0169\t\6\2\2"+
		"\u0169\64\3\2\2\2\u016a\u016b\t\4\2\2\u016b\u016c\t\13\2\2\u016c\u016d"+
		"\t\f\2\2\u016d\u016e\t\20\2\2\u016e\u016f\t\6\2\2\u016f\u0170\t\24\2\2"+
		"\u0170\66\3\2\2\2\u0171\u0172\t\7\2\2\u0172\u0173\t\5\2\2\u0173\u0174"+
		"\t\6\2\2\u0174\u0175\t\17\2\2\u01758\3\2\2\2\u0176\u0177\t\2\2\2\u0177"+
		"\u0178\t\17\2\2\u0178\u0179\t\24\2\2\u0179:\3\2\2\2\u017a\u017b\t\f\2"+
		"\2\u017b\u017c\t\3\2\2\u017c<\3\2\2\2\u017d\u017e\t\26\2\2\u017e\u017f"+
		"\t\f\2\2\u017f\u0180\t\3\2\2\u0180>\3\2\2\2\u0181\u0182\t\17\2\2\u0182"+
		"\u0183\t\f\2\2\u0183\u0184\t\7\2\2\u0184@\3\2\2\2\u0185\u0186\t\16\2\2"+
		"\u0186\u0187\t\n\2\2\u0187\u0188\t\t\2\2\u0188\u0189\t\13\2\2\u0189\u018a"+
		"\t\16\2\2\u018a\u018b\t\6\2\2\u018b\u018c\t\20\2\2\u018cB\3\2\2\2\u018d"+
		"\u018e\t\25\2\2\u018e\u018f\t\f\2\2\u018f\u0190\t\3\2\2\u0190\u0191\t"+
		"\30\2\2\u0191\u0192\t\2\2\2\u0192\u0193\t\13\2\2\u0193\u0194\t\13\2\2"+
		"\u0194D\3\2\2\2\u0195\u0196\t\6\2\2\u0196\u0197\t\26\2\2\u0197\u0198\t"+
		"\16\2\2\u0198\u0199\t\20\2\2\u0199\u019a\t\7\2\2\u019a\u019b\t\20\2\2"+
		"\u019bF\3\2\2\2\u019c\u019d\t\n\2\2\u019d\u019e\t\2\2\2\u019e\u019f\t"+
		"\7\2\2\u019f\u01a0\t\4\2\2\u01a0\u01a1\t\5\2\2\u01a1\u01a2\t\6\2\2\u01a2"+
		"\u01aa\t\20\2\2\u01a3\u01a4\t\16\2\2\u01a4\u01a5\t\20\2\2\u01a5\u01a6"+
		"\7a\2\2\u01a6\u01a7\t\16\2\2\u01a7\u01aa\t\17\2\2\u01a8\u01aa\7\u220a"+
		"\2\2\u01a9\u019c\3\2\2\2\u01a9\u01a3\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"H\3\2\2\2\4\2\u01a9\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
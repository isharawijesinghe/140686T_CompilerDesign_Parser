// Generated from Cminus.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CminusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMI_COLON=1, OPEN_SQUARE_BRACKET=2, CLOSE_SQUARE_BRACKET=3, INT=4, VOID=5, 
		OPEN_BRACKET=6, CLOSE_BRACKET=7, COMMA=8, OPEN_PARENTHESIS=9, CLOSE_PARENTHESIS=10, 
		IF=11, ELSE=12, WHILE=13, RETURN=14, EQUAL=15, GREATER_THAN_EQUAL=16, 
		GREATER_THAN=17, LESS_THAN=18, LESS_THAN_EQUAL=19, IS_EQUAL=20, NOT_EQUAL=21, 
		PLUS=22, MINUS=23, MULTIPLY=24, DIVIDE=25, ID=26, NUM=27, LETTER=28, DIGIT=29, 
		WS=30, COMMENTS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEMI_COLON", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "INT", "VOID", 
		"OPEN_BRACKET", "CLOSE_BRACKET", "COMMA", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", 
		"IF", "ELSE", "WHILE", "RETURN", "EQUAL", "GREATER_THAN_EQUAL", "GREATER_THAN", 
		"LESS_THAN", "LESS_THAN_EQUAL", "IS_EQUAL", "NOT_EQUAL", "PLUS", "MINUS", 
		"MULTIPLY", "DIVIDE", "ID", "NUM", "LETTER", "DIGIT", "WS", "COMMENTS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'['", "']'", "'int'", "'void'", "'('", "')'", "','", "'{'", 
		"'}'", "'if'", "'else'", "'while'", "'return'", "'='", "'>='", "'>'", 
		"'<'", "'<='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMI_COLON", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "INT", 
		"VOID", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA", "OPEN_PARENTHESIS", 
		"CLOSE_PARENTHESIS", "IF", "ELSE", "WHILE", "RETURN", "EQUAL", "GREATER_THAN_EQUAL", 
		"GREATER_THAN", "LESS_THAN", "LESS_THAN_EQUAL", "IS_EQUAL", "NOT_EQUAL", 
		"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "ID", "NUM", "LETTER", "DIGIT", 
		"WS", "COMMENTS"
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


	public CminusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cminus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\7\33\u008c\n\33"+
		"\f\33\16\33\u008f\13\33\3\34\3\34\7\34\u0093\n\34\f\34\16\34\u0096\13"+
		"\34\3\35\3\35\3\36\3\36\3\37\6\37\u009d\n\37\r\37\16\37\u009e\3\37\3\37"+
		"\3 \3 \3 \3 \7 \u00a7\n \f \16 \u00aa\13 \3 \3 \3 \3 \3 \3 \3 \5 \u00b3"+
		"\n \3 \3 \3\u00a8\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!\3\2\5\4\2C\\c|\5\2\13\f\17\17\"\"\3\2\f\f\2\u00ba"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2"+
		"\2\13K\3\2\2\2\rP\3\2\2\2\17R\3\2\2\2\21T\3\2\2\2\23V\3\2\2\2\25X\3\2"+
		"\2\2\27Z\3\2\2\2\31]\3\2\2\2\33b\3\2\2\2\35h\3\2\2\2\37o\3\2\2\2!q\3\2"+
		"\2\2#t\3\2\2\2%v\3\2\2\2\'x\3\2\2\2){\3\2\2\2+~\3\2\2\2-\u0081\3\2\2\2"+
		"/\u0083\3\2\2\2\61\u0085\3\2\2\2\63\u0087\3\2\2\2\65\u0089\3\2\2\2\67"+
		"\u0090\3\2\2\29\u0097\3\2\2\2;\u0099\3\2\2\2=\u009c\3\2\2\2?\u00b2\3\2"+
		"\2\2AB\7=\2\2B\4\3\2\2\2CD\7]\2\2D\6\3\2\2\2EF\7_\2\2F\b\3\2\2\2GH\7k"+
		"\2\2HI\7p\2\2IJ\7v\2\2J\n\3\2\2\2KL\7x\2\2LM\7q\2\2MN\7k\2\2NO\7f\2\2"+
		"O\f\3\2\2\2PQ\7*\2\2Q\16\3\2\2\2RS\7+\2\2S\20\3\2\2\2TU\7.\2\2U\22\3\2"+
		"\2\2VW\7}\2\2W\24\3\2\2\2XY\7\177\2\2Y\26\3\2\2\2Z[\7k\2\2[\\\7h\2\2\\"+
		"\30\3\2\2\2]^\7g\2\2^_\7n\2\2_`\7u\2\2`a\7g\2\2a\32\3\2\2\2bc\7y\2\2c"+
		"d\7j\2\2de\7k\2\2ef\7n\2\2fg\7g\2\2g\34\3\2\2\2hi\7t\2\2ij\7g\2\2jk\7"+
		"v\2\2kl\7w\2\2lm\7t\2\2mn\7p\2\2n\36\3\2\2\2op\7?\2\2p \3\2\2\2qr\7@\2"+
		"\2rs\7?\2\2s\"\3\2\2\2tu\7@\2\2u$\3\2\2\2vw\7>\2\2w&\3\2\2\2xy\7>\2\2"+
		"yz\7?\2\2z(\3\2\2\2{|\7?\2\2|}\7?\2\2}*\3\2\2\2~\177\7#\2\2\177\u0080"+
		"\7?\2\2\u0080,\3\2\2\2\u0081\u0082\7-\2\2\u0082.\3\2\2\2\u0083\u0084\7"+
		"/\2\2\u0084\60\3\2\2\2\u0085\u0086\7,\2\2\u0086\62\3\2\2\2\u0087\u0088"+
		"\7\61\2\2\u0088\64\3\2\2\2\u0089\u008d\59\35\2\u008a\u008c\59\35\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\66\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0094\5;\36\2\u0091\u0093"+
		"\5;\36\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u00958\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\t\2\2\2"+
		"\u0098:\3\2\2\2\u0099\u009a\4\62;\2\u009a<\3\2\2\2\u009b\u009d\t\3\2\2"+
		"\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\37\2\2\u00a1>\3\2\2\2\u00a2"+
		"\u00a3\7\61\2\2\u00a3\u00a4\7,\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a7\13"+
		"\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7,"+
		"\2\2\u00ac\u00b3\7\61\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00af\7\61\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\n\4\2\2\u00b1\u00b3\7\f\2\2\u00b2\u00a2\3\2"+
		"\2\2\u00b2\u00ad\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b \2\2\u00b5"+
		"@\3\2\2\2\b\2\u008d\u0094\u009e\u00a8\u00b2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
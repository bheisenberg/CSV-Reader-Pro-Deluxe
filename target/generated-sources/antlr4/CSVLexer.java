// Generated from CSV.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSVLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, CHAR=2, LOWER=3, UPPER=4, NUMBER=5, WHITESPACE=6, NEWLINE=7, 
		IGNORE=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"STRING", "CHAR", "LOWER", "UPPER", "NUMBER", "WHITESPACE", "NEWLINE", 
		"IGNORE"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING", "CHAR", "LOWER", "UPPER", "NUMBER", "WHITESPACE", "NEWLINE", 
		"IGNORE"
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


	public CSVLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CSV.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\62\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\25\n"+
		"\2\r\2\16\2\26\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\6\b(\n\b\r\b\16\b)\3\t\6\t-\n\t\r\t\16\t.\3\t\3\t\2\2\n\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\b\3\2c|\3\2C\\\3\2\62;\4\2\13\13\"\""+
		"\4\2\f\f\17\17\3\2..\67\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\24\3\2\2\2\5\34"+
		"\3\2\2\2\7\36\3\2\2\2\t \3\2\2\2\13\"\3\2\2\2\r$\3\2\2\2\17\'\3\2\2\2"+
		"\21,\3\2\2\2\23\25\5\5\3\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26"+
		"\27\3\2\2\2\27\4\3\2\2\2\30\35\5\7\4\2\31\35\5\t\5\2\32\35\5\13\6\2\33"+
		"\35\5\r\7\2\34\30\3\2\2\2\34\31\3\2\2\2\34\32\3\2\2\2\34\33\3\2\2\2\35"+
		"\6\3\2\2\2\36\37\t\2\2\2\37\b\3\2\2\2 !\t\3\2\2!\n\3\2\2\2\"#\t\4\2\2"+
		"#\f\3\2\2\2$%\t\5\2\2%\16\3\2\2\2&(\t\6\2\2\'&\3\2\2\2()\3\2\2\2)\'\3"+
		"\2\2\2)*\3\2\2\2*\20\3\2\2\2+-\t\7\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2."+
		"/\3\2\2\2/\60\3\2\2\2\60\61\b\t\2\2\61\22\3\2\2\2\7\2\26\34).\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
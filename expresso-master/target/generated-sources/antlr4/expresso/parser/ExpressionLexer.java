// Generated from Expression.g4 by ANTLR 4.4

package expresso.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUM=2, VAR=3, SIGN=4, WS=5, PLUS=6, MULTIPLY=7, VARIABLE=8, CONSTANT=9, 
		LEFT_PAREN=10, RIGHT_PAREN=11, WHITESPACE=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'"
	};
	public static final String[] ruleNames = {
		"T__0", "NUM", "VAR", "SIGN", "WS", "PLUS", "MULTIPLY", "VARIABLE", "CONSTANT", 
		"LEFT_PAREN", "RIGHT_PAREN", "WHITESPACE"
	};


	    // This method makes the lexer or parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        removeErrorListeners();
	        addErrorListener(new ExceptionThrowingErrorListener());
	    }
	    
	    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer,
	                Object offendingSymbol, int line, int charPositionInLine,
	                String msg, RecognitionException e) {
	            throw new RuntimeException(msg);
	        }
	    }


	public ExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16Z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\6\3\37\n\3\r\3\16\3 \3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\t\60\n\t\r\t\16\t\61\3\n\7\n\65\n"+
		"\n\f\n\16\n8\13\n\3\n\3\n\6\n<\n\n\r\n\16\n=\3\n\6\nA\n\n\r\n\16\nB\3"+
		"\n\3\n\7\nG\n\n\f\n\16\nJ\13\n\5\nL\n\n\5\nN\n\n\3\13\3\13\3\f\3\f\3\r"+
		"\6\rU\n\r\r\r\16\rV\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\3\2\b\3\2\62;\3\2c|\4\2--//\4\2C\\c|\3\2\60\60"+
		"\3\2\"\"b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\36\3\2\2\2\7\"\3\2\2\2\t$\3\2\2\2"+
		"\13&\3\2\2\2\r*\3\2\2\2\17,\3\2\2\2\21/\3\2\2\2\23M\3\2\2\2\25O\3\2\2"+
		"\2\27Q\3\2\2\2\31T\3\2\2\2\33\34\7`\2\2\34\4\3\2\2\2\35\37\t\2\2\2\36"+
		"\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\6\3\2\2\2\"#\t\3\2\2#\b"+
		"\3\2\2\2$%\t\4\2\2%\n\3\2\2\2&\'\7\"\2\2\'(\3\2\2\2()\b\6\2\2)\f\3\2\2"+
		"\2*+\7-\2\2+\16\3\2\2\2,-\7,\2\2-\20\3\2\2\2.\60\t\5\2\2/.\3\2\2\2\60"+
		"\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\22\3\2\2\2\63\65\t\2\2\2\64\63"+
		"\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2"+
		"\29;\t\6\2\2:<\t\2\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>N\3\2\2"+
		"\2?A\t\2\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CK\3\2\2\2DH\t\6\2"+
		"\2EG\t\2\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2"+
		"\2KD\3\2\2\2KL\3\2\2\2LN\3\2\2\2M\66\3\2\2\2M@\3\2\2\2N\24\3\2\2\2OP\7"+
		"*\2\2P\26\3\2\2\2QR\7+\2\2R\30\3\2\2\2SU\t\7\2\2TS\3\2\2\2UV\3\2\2\2V"+
		"T\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\b\r\2\2Y\32\3\2\2\2\f\2 \61\66=BHKMV\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
package org.xtext.uma.usex.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUsexLexer extends Lexer {
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=5;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_ASTERISK=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalUsexLexer() {;} 
    public InternalUsexLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalUsexLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalUsex.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:11:7: ( 'model' )
            // InternalUsex.g:11:9: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:12:7: ( 'class' )
            // InternalUsex.g:12:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:13:7: ( 'attributes' )
            // InternalUsex.g:13:9: 'attributes'
            {
            match("attributes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:14:7: ( 'operations' )
            // InternalUsex.g:14:9: 'operations'
            {
            match("operations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:15:7: ( 'constraints' )
            // InternalUsex.g:15:9: 'constraints'
            {
            match("constraints"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:16:7: ( 'end' )
            // InternalUsex.g:16:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:17:7: ( ':' )
            // InternalUsex.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:18:7: ( 'init' )
            // InternalUsex.g:18:9: 'init'
            {
            match("init"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:19:7: ( 'derived' )
            // InternalUsex.g:19:9: 'derived'
            {
            match("derived"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:20:7: ( 'String' )
            // InternalUsex.g:20:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:21:7: ( 'Real' )
            // InternalUsex.g:21:9: 'Real'
            {
            match("Real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:22:7: ( 'Integer' )
            // InternalUsex.g:22:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:23:7: ( 'Boolean' )
            // InternalUsex.g:23:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:24:7: ( '(' )
            // InternalUsex.g:24:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:25:7: ( ')' )
            // InternalUsex.g:25:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:26:7: ( 'begin' )
            // InternalUsex.g:26:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:27:7: ( '=' )
            // InternalUsex.g:27:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:28:7: ( ',' )
            // InternalUsex.g:28:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:29:7: ( 'pre' )
            // InternalUsex.g:29:9: 'pre'
            {
            match("pre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:30:7: ( 'post' )
            // InternalUsex.g:30:9: 'post'
            {
            match("post"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:31:7: ( 'inv' )
            // InternalUsex.g:31:9: 'inv'
            {
            match("inv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:32:7: ( 'association' )
            // InternalUsex.g:32:9: 'association'
            {
            match("association"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:33:7: ( 'between' )
            // InternalUsex.g:33:9: 'between'
            {
            match("between"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:34:7: ( 'composition' )
            // InternalUsex.g:34:9: 'composition'
            {
            match("composition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:35:7: ( '[' )
            // InternalUsex.g:35:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:36:7: ( ']' )
            // InternalUsex.g:36:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:37:7: ( 'role' )
            // InternalUsex.g:37:9: 'role'
            {
            match("role"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:38:7: ( '..' )
            // InternalUsex.g:38:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:1839:10: ( ( '-' )? ( '0' .. '9' )+ )
            // InternalUsex.g:1839:12: ( '-' )? ( '0' .. '9' )+
            {
            // InternalUsex.g:1839:12: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalUsex.g:1839:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalUsex.g:1839:17: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUsex.g:1839:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:1841:13: ( ( '-' )? RULE_INT '.' RULE_INT )
            // InternalUsex.g:1841:15: ( '-' )? RULE_INT '.' RULE_INT
            {
            // InternalUsex.g:1841:15: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUsex.g:1841:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:1843:14: ( ( 'true' | 'false' ) )
            // InternalUsex.g:1843:16: ( 'true' | 'false' )
            {
            // InternalUsex.g:1843:16: ( 'true' | 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='t') ) {
                alt4=1;
            }
            else if ( (LA4_0=='f') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUsex.g:1843:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalUsex.g:1843:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ASTERISK"
    public final void mRULE_ASTERISK() throws RecognitionException {
        try {
            int _type = RULE_ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:1845:15: ( '*' )
            // InternalUsex.g:1845:17: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASTERISK"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:1847:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalUsex.g:1847:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalUsex.g:1847:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUsex.g:1847:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalUsex.g:1847:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUsex.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:1849:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalUsex.g:1849:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalUsex.g:1849:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUsex.g:1849:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalUsex.g:1849:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalUsex.g:1849:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUsex.g:1849:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalUsex.g:1849:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalUsex.g:1849:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalUsex.g:1849:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUsex.g:1849:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:1851:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalUsex.g:1851:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalUsex.g:1851:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUsex.g:1851:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:1853:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalUsex.g:1853:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalUsex.g:1853:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUsex.g:1853:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalUsex.g:1853:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUsex.g:1853:41: ( '\\r' )? '\\n'
                    {
                    // InternalUsex.g:1853:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalUsex.g:1853:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:1855:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalUsex.g:1855:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalUsex.g:1855:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUsex.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUsex.g:1857:16: ( . )
            // InternalUsex.g:1857:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalUsex.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_INT | RULE_DOUBLE | RULE_BOOLEAN | RULE_ASTERISK | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=38;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalUsex.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalUsex.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalUsex.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalUsex.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalUsex.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalUsex.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalUsex.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalUsex.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalUsex.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalUsex.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalUsex.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalUsex.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalUsex.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalUsex.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalUsex.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalUsex.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalUsex.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalUsex.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalUsex.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalUsex.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalUsex.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalUsex.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalUsex.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalUsex.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalUsex.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalUsex.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalUsex.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalUsex.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalUsex.g:1:178: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // InternalUsex.g:1:187: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 31 :
                // InternalUsex.g:1:199: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 32 :
                // InternalUsex.g:1:212: RULE_ASTERISK
                {
                mRULE_ASTERISK(); 

                }
                break;
            case 33 :
                // InternalUsex.g:1:226: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // InternalUsex.g:1:234: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalUsex.g:1:246: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // InternalUsex.g:1:262: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // InternalUsex.g:1:278: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // InternalUsex.g:1:286: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\5\44\1\uffff\6\44\2\uffff\1\44\2\uffff\1\44\2\uffff\1\44\2\42\1\77\2\44\1\uffff\1\42\1\uffff\3\42\2\uffff\1\44\1\uffff\6\44\1\uffff\6\44\2\uffff\1\44\2\uffff\2\44\2\uffff\1\44\2\uffff\1\77\1\uffff\2\44\5\uffff\7\44\1\144\1\44\1\146\7\44\1\156\13\44\1\uffff\1\172\1\uffff\2\44\1\175\4\44\1\uffff\1\u0082\1\u0083\1\u0084\1\44\1\u0086\1\u0087\5\44\1\uffff\2\44\1\uffff\2\44\1\u0091\1\44\3\uffff\1\u0084\2\uffff\6\44\1\u0099\2\44\1\uffff\6\44\1\u00a2\1\uffff\1\u00a3\1\u00a4\1\u00a5\5\44\4\uffff\7\44\1\u00b2\1\44\1\u00b4\1\u00b5\1\u00b6\1\uffff\1\u00b7\4\uffff";
    static final String DFA15_eofS =
        "\u00b8\uffff";
    static final String DFA15_minS =
        "\1\0\1\157\1\154\1\163\1\160\1\156\1\uffff\1\156\1\145\1\164\1\145\1\156\1\157\2\uffff\1\145\2\uffff\1\157\2\uffff\1\157\1\56\1\55\1\56\1\162\1\141\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\144\1\uffff\1\141\1\155\1\164\1\163\1\145\1\144\1\uffff\1\151\2\162\1\141\1\164\1\157\2\uffff\1\147\2\uffff\1\145\1\163\2\uffff\1\154\2\uffff\1\56\1\uffff\1\165\1\154\5\uffff\1\145\2\163\1\160\1\162\1\157\1\162\1\60\1\164\1\60\2\151\1\154\1\145\1\154\1\151\1\167\1\60\1\164\2\145\1\163\1\154\1\163\1\164\1\157\1\151\1\143\1\141\1\uffff\1\60\1\uffff\1\166\1\156\1\60\1\147\1\145\1\156\1\145\1\uffff\3\60\1\145\2\60\1\162\1\163\1\142\1\151\1\164\1\uffff\1\145\1\147\1\uffff\1\145\1\141\1\60\1\145\3\uffff\1\60\2\uffff\1\141\1\151\1\165\1\141\1\151\1\144\1\60\1\162\1\156\1\uffff\1\156\1\151\3\164\1\157\1\60\1\uffff\3\60\1\156\1\151\1\145\1\151\1\156\4\uffff\1\164\1\157\1\163\1\157\2\163\1\156\1\60\1\156\3\60\1\uffff\1\60\4\uffff";
    static final String DFA15_maxS =
        "\1\uffff\2\157\1\164\1\160\1\156\1\uffff\1\156\1\145\1\164\1\145\1\156\1\157\2\uffff\1\145\2\uffff\1\162\2\uffff\1\157\1\56\2\71\1\162\1\141\1\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\144\1\uffff\1\141\1\156\1\164\1\163\1\145\1\144\1\uffff\1\166\2\162\1\141\1\164\1\157\2\uffff\1\164\2\uffff\1\145\1\163\2\uffff\1\154\2\uffff\1\71\1\uffff\1\165\1\154\5\uffff\1\145\2\163\1\160\1\162\1\157\1\162\1\172\1\164\1\172\2\151\1\154\1\145\1\154\1\151\1\167\1\172\1\164\2\145\1\163\1\154\1\163\1\164\1\157\1\151\1\143\1\141\1\uffff\1\172\1\uffff\1\166\1\156\1\172\1\147\1\145\1\156\1\145\1\uffff\3\172\1\145\2\172\1\162\1\163\1\142\1\151\1\164\1\uffff\1\145\1\147\1\uffff\1\145\1\141\1\172\1\145\3\uffff\1\172\2\uffff\1\141\1\151\1\165\1\141\1\151\1\144\1\172\1\162\1\156\1\uffff\1\156\1\151\3\164\1\157\1\172\1\uffff\3\172\1\156\1\151\1\145\1\151\1\156\4\uffff\1\164\1\157\1\163\1\157\2\163\1\156\1\172\1\156\3\172\1\uffff\1\172\4\uffff";
    static final String DFA15_acceptS =
        "\6\uffff\1\7\6\uffff\1\16\1\17\1\uffff\1\21\1\22\1\uffff\1\31\1\32\6\uffff\1\40\1\uffff\1\41\3\uffff\1\45\1\46\1\uffff\1\41\6\uffff\1\7\6\uffff\1\16\1\17\1\uffff\1\21\1\22\2\uffff\1\31\1\32\1\uffff\1\34\1\36\1\uffff\1\35\2\uffff\1\40\1\42\1\43\1\44\1\45\35\uffff\1\6\1\uffff\1\25\7\uffff\1\23\13\uffff\1\10\2\uffff\1\13\4\uffff\1\24\1\33\1\37\1\uffff\1\1\1\2\11\uffff\1\20\7\uffff\1\12\10\uffff\1\11\1\14\1\15\1\27\14\uffff\1\3\1\uffff\1\4\1\5\1\30\1\26";
    static final String DFA15_specialS =
        "\1\1\35\uffff\1\0\1\2\u0098\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\36\4\42\1\37\1\15\1\16\1\33\1\42\1\21\1\27\1\26\1\40\12\30\1\6\2\42\1\20\3\42\1\35\1\14\6\35\1\13\10\35\1\12\1\11\7\35\1\23\1\42\1\24\1\34\1\35\1\42\1\3\1\17\1\2\1\10\1\5\1\32\2\35\1\7\3\35\1\1\1\35\1\4\1\22\1\35\1\25\1\35\1\31\6\35\uff85\42",
            "\1\43",
            "\1\45\2\uffff\1\46",
            "\1\50\1\47",
            "\1\51",
            "\1\52",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "\1\64",
            "",
            "",
            "\1\70\2\uffff\1\67",
            "",
            "",
            "\1\73",
            "\1\74",
            "\1\75\2\uffff\12\76",
            "\1\75\1\uffff\12\76",
            "\1\100",
            "\1\101",
            "",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\0\103",
            "\0\103",
            "\1\104\4\uffff\1\105",
            "",
            "",
            "\1\107",
            "",
            "\1\110",
            "\1\112\1\111",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "\1\117\14\uffff\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "\1\126\14\uffff\1\127",
            "",
            "",
            "\1\130",
            "\1\131",
            "",
            "",
            "\1\132",
            "",
            "",
            "\1\75\1\uffff\12\76",
            "",
            "\1\133",
            "\1\134",
            "",
            "",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\145",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\173",
            "\1\174",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0085",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "",
            "\1\u008f",
            "\1\u0090",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0092",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "",
            "",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b3",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_INT | RULE_DOUBLE | RULE_BOOLEAN | RULE_ASTERISK | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_30 = input.LA(1);

                        s = -1;
                        if ( ((LA15_30>='\u0000' && LA15_30<='\uFFFF')) ) {s = 67;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='m') ) {s = 1;}

                        else if ( (LA15_0=='c') ) {s = 2;}

                        else if ( (LA15_0=='a') ) {s = 3;}

                        else if ( (LA15_0=='o') ) {s = 4;}

                        else if ( (LA15_0=='e') ) {s = 5;}

                        else if ( (LA15_0==':') ) {s = 6;}

                        else if ( (LA15_0=='i') ) {s = 7;}

                        else if ( (LA15_0=='d') ) {s = 8;}

                        else if ( (LA15_0=='S') ) {s = 9;}

                        else if ( (LA15_0=='R') ) {s = 10;}

                        else if ( (LA15_0=='I') ) {s = 11;}

                        else if ( (LA15_0=='B') ) {s = 12;}

                        else if ( (LA15_0=='(') ) {s = 13;}

                        else if ( (LA15_0==')') ) {s = 14;}

                        else if ( (LA15_0=='b') ) {s = 15;}

                        else if ( (LA15_0=='=') ) {s = 16;}

                        else if ( (LA15_0==',') ) {s = 17;}

                        else if ( (LA15_0=='p') ) {s = 18;}

                        else if ( (LA15_0=='[') ) {s = 19;}

                        else if ( (LA15_0==']') ) {s = 20;}

                        else if ( (LA15_0=='r') ) {s = 21;}

                        else if ( (LA15_0=='.') ) {s = 22;}

                        else if ( (LA15_0=='-') ) {s = 23;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 24;}

                        else if ( (LA15_0=='t') ) {s = 25;}

                        else if ( (LA15_0=='f') ) {s = 26;}

                        else if ( (LA15_0=='*') ) {s = 27;}

                        else if ( (LA15_0=='^') ) {s = 28;}

                        else if ( (LA15_0=='A'||(LA15_0>='C' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='Q')||(LA15_0>='T' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='l')||LA15_0=='n'||LA15_0=='q'||LA15_0=='s'||(LA15_0>='u' && LA15_0<='z')) ) {s = 29;}

                        else if ( (LA15_0=='\"') ) {s = 30;}

                        else if ( (LA15_0=='\'') ) {s = 31;}

                        else if ( (LA15_0=='/') ) {s = 32;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 33;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||LA15_0=='+'||(LA15_0>=';' && LA15_0<='<')||(LA15_0>='>' && LA15_0<='@')||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_31 = input.LA(1);

                        s = -1;
                        if ( ((LA15_31>='\u0000' && LA15_31<='\uFFFF')) ) {s = 67;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
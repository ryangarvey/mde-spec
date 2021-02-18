package org.mde.spec.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_CUSTOM_COMMAND=6;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_UNQUOTED=9;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalSpecLexer() {;} 
    public InternalSpecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSpecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSpec.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:11:7: ( 'text' )
            // InternalSpec.g:11:9: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:12:7: ( 'class' )
            // InternalSpec.g:12:9: 'class'
            {
            match("class"); 


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
            // InternalSpec.g:13:7: ( 'value' )
            // InternalSpec.g:13:9: 'value'
            {
            match("value"); 


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
            // InternalSpec.g:14:7: ( 'second' )
            // InternalSpec.g:14:9: 'second'
            {
            match("second"); 


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
            // InternalSpec.g:15:7: ( 'seconds' )
            // InternalSpec.g:15:9: 'seconds'
            {
            match("seconds"); 


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
            // InternalSpec.g:16:7: ( 'button' )
            // InternalSpec.g:16:9: 'button'
            {
            match("button"); 


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
            // InternalSpec.g:17:7: ( 'element' )
            // InternalSpec.g:17:9: 'element'
            {
            match("element"); 


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
            // InternalSpec.g:18:7: ( 'link' )
            // InternalSpec.g:18:9: 'link'
            {
            match("link"); 


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
            // InternalSpec.g:19:7: ( 'input' )
            // InternalSpec.g:19:9: 'input'
            {
            match("input"); 


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
            // InternalSpec.g:20:7: ( 'textarea' )
            // InternalSpec.g:20:9: 'textarea'
            {
            match("textarea"); 


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
            // InternalSpec.g:21:7: ( 'Open' )
            // InternalSpec.g:21:9: 'Open'
            {
            match("Open"); 


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
            // InternalSpec.g:22:7: ( '$' )
            // InternalSpec.g:22:9: '$'
            {
            match('$'); 

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
            // InternalSpec.g:23:7: ( 'Click' )
            // InternalSpec.g:23:9: 'Click'
            {
            match("Click"); 


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
            // InternalSpec.g:24:7: ( 'on' )
            // InternalSpec.g:24:9: 'on'
            {
            match("on"); 


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
            // InternalSpec.g:25:7: ( 'at' )
            // InternalSpec.g:25:9: 'at'
            {
            match("at"); 


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
            // InternalSpec.g:26:7: ( 'Within' )
            // InternalSpec.g:26:9: 'Within'
            {
            match("Within"); 


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
            // InternalSpec.g:27:7: ( 'Select' )
            // InternalSpec.g:27:9: 'Select'
            {
            match("Select"); 


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
            // InternalSpec.g:28:7: ( 'visible' )
            // InternalSpec.g:28:9: 'visible'
            {
            match("visible"); 


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
            // InternalSpec.g:29:7: ( 'Store' )
            // InternalSpec.g:29:9: 'Store'
            {
            match("Store"); 


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
            // InternalSpec.g:30:7: ( 'to' )
            // InternalSpec.g:30:9: 'to'
            {
            match("to"); 


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
            // InternalSpec.g:31:7: ( 'be' )
            // InternalSpec.g:31:9: 'be'
            {
            match("be"); 


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
            // InternalSpec.g:32:7: ( 'Remember' )
            // InternalSpec.g:32:9: 'Remember'
            {
            match("Remember"); 


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
            // InternalSpec.g:33:7: ( 'as' )
            // InternalSpec.g:33:9: 'as'
            {
            match("as"); 


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
            // InternalSpec.g:34:7: ( 'Property' )
            // InternalSpec.g:34:9: 'Property'
            {
            match("Property"); 


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
            // InternalSpec.g:35:7: ( 'should' )
            // InternalSpec.g:35:9: 'should'
            {
            match("should"); 


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
            // InternalSpec.g:36:7: ( 'not' )
            // InternalSpec.g:36:9: 'not'
            {
            match("not"); 


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
            // InternalSpec.g:37:7: ( 'Type' )
            // InternalSpec.g:37:9: 'Type'
            {
            match("Type"); 


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
            // InternalSpec.g:38:7: ( 'Sleep' )
            // InternalSpec.g:38:9: 'Sleep'
            {
            match("Sleep"); 


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
            // InternalSpec.g:39:7: ( 'for' )
            // InternalSpec.g:39:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:40:7: ( '{' )
            // InternalSpec.g:40:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:41:7: ( ',' )
            // InternalSpec.g:41:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:42:7: ( '}' )
            // InternalSpec.g:42:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_CUSTOM_COMMAND"
    public final void mRULE_CUSTOM_COMMAND() throws RecognitionException {
        try {
            int _type = RULE_CUSTOM_COMMAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:2535:21: ( '!' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSpec.g:2535:23: '!' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('!'); 
            // InternalSpec.g:2535:27: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSpec.g:2535:27: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop1;
                }
            } while (true);

            // InternalSpec.g:2535:43: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpec.g:2535:44: ( '\\r' )? '\\n'
                    {
                    // InternalSpec.g:2535:44: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalSpec.g:2535:44: '\\r'
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
    // $ANTLR end "RULE_CUSTOM_COMMAND"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:2537:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSpec.g:2537:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalSpec.g:2537:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSpec.g:2537:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop4;
                }
            } while (true);

            // InternalSpec.g:2537:39: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpec.g:2537:40: ( '\\r' )? '\\n'
                    {
                    // InternalSpec.g:2537:40: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSpec.g:2537:40: '\\r'
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

    // $ANTLR start "RULE_UNQUOTED"
    public final void mRULE_UNQUOTED() throws RecognitionException {
        try {
            int _type = RULE_UNQUOTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:2539:15: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' )* )
            // InternalSpec.g:2539:17: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' )*
            {
            // InternalSpec.g:2539:17: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='-'||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSpec.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNQUOTED"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:2541:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSpec.g:2541:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSpec.g:2541:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpec.g:2541:11: '^'
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

            // InternalSpec.g:2541:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSpec.g:
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
            	    break loop9;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:2543:10: ( ( '0' .. '9' )+ )
            // InternalSpec.g:2543:12: ( '0' .. '9' )+
            {
            // InternalSpec.g:2543:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSpec.g:2543:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:2545:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSpec.g:2545:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSpec.g:2545:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSpec.g:2545:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSpec.g:2545:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSpec.g:2545:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSpec.g:2545:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSpec.g:2545:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSpec.g:2545:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSpec.g:2545:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSpec.g:2545:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop12;
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
            // InternalSpec.g:2547:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSpec.g:2547:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSpec.g:2547:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSpec.g:2547:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:2549:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSpec.g:2549:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSpec.g:2549:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSpec.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalSpec.g:2551:16: ( . )
            // InternalSpec.g:2551:18: .
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
        // InternalSpec.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_CUSTOM_COMMAND | RULE_SL_COMMENT | RULE_UNQUOTED | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=41;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalSpec.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalSpec.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalSpec.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalSpec.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalSpec.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalSpec.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalSpec.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalSpec.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalSpec.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalSpec.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalSpec.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalSpec.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalSpec.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalSpec.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalSpec.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalSpec.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalSpec.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalSpec.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalSpec.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalSpec.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalSpec.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalSpec.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalSpec.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalSpec.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalSpec.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalSpec.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalSpec.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalSpec.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalSpec.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalSpec.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalSpec.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalSpec.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalSpec.g:1:202: RULE_CUSTOM_COMMAND
                {
                mRULE_CUSTOM_COMMAND(); 

                }
                break;
            case 34 :
                // InternalSpec.g:1:222: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // InternalSpec.g:1:238: RULE_UNQUOTED
                {
                mRULE_UNQUOTED(); 

                }
                break;
            case 36 :
                // InternalSpec.g:1:252: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // InternalSpec.g:1:260: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // InternalSpec.g:1:269: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // InternalSpec.g:1:281: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // InternalSpec.g:1:297: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // InternalSpec.g:1:305: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\12\33\1\uffff\12\33\5\uffff\1\33\1\uffff\1\43\2\uffff\3\43\2\uffff\1\33\1\113\1\33\1\uffff\6\33\1\122\4\33\1\uffff\1\33\1\130\1\131\1\132\11\33\11\uffff\1\33\1\uffff\6\33\1\uffff\5\33\3\uffff\6\33\1\166\1\33\1\170\1\172\7\33\1\u0082\1\33\1\u0084\7\33\1\uffff\1\u008c\1\uffff\1\33\1\uffff\1\u008e\1\u008f\5\33\1\uffff\1\u0095\1\uffff\1\u0096\2\33\1\u0099\1\u009a\2\33\1\uffff\1\33\2\uffff\1\33\1\u00a0\1\u00a1\1\u00a2\1\33\2\uffff\1\u00a4\1\u00a5\2\uffff\3\33\1\u00a9\1\u00aa\3\uffff\1\u00ab\2\uffff\2\33\1\u00ae\3\uffff\1\u00af\1\u00b0\3\uffff";
    static final String DFA16_eofS =
        "\u00b1\uffff";
    static final String DFA16_minS =
        "\1\0\11\60\1\uffff\12\60\5\uffff\1\60\1\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\60\1\55\1\60\1\uffff\6\60\1\55\4\60\1\uffff\1\60\3\55\11\60\11\uffff\1\60\1\uffff\6\60\1\uffff\5\60\3\uffff\6\60\1\55\1\60\2\55\7\60\1\55\1\60\1\55\7\60\1\uffff\1\55\1\uffff\1\60\1\uffff\2\55\5\60\1\uffff\1\55\1\uffff\1\55\2\60\2\55\2\60\1\uffff\1\60\2\uffff\1\60\3\55\1\60\2\uffff\2\55\2\uffff\3\60\2\55\3\uffff\1\55\2\uffff\2\60\1\55\3\uffff\2\55\3\uffff";
    static final String DFA16_maxS =
        "\1\uffff\11\172\1\uffff\12\172\5\uffff\1\172\1\uffff\1\172\2\uffff\2\uffff\1\52\2\uffff\3\172\1\uffff\13\172\1\uffff\15\172\11\uffff\1\172\1\uffff\6\172\1\uffff\5\172\3\uffff\33\172\1\uffff\1\172\1\uffff\1\172\1\uffff\7\172\1\uffff\1\172\1\uffff\7\172\1\uffff\1\172\2\uffff\5\172\2\uffff\2\172\2\uffff\5\172\3\uffff\1\172\2\uffff\3\172\3\uffff\2\172\3\uffff";
    static final String DFA16_acceptS =
        "\12\uffff\1\14\12\uffff\1\36\1\37\1\40\1\41\1\42\1\uffff\1\43\1\uffff\1\43\1\45\3\uffff\1\50\1\51\3\uffff\1\44\13\uffff\1\14\15\uffff\1\36\1\37\1\40\1\41\1\42\1\45\1\46\1\47\1\50\1\uffff\1\24\6\uffff\1\25\5\uffff\1\16\1\17\1\27\33\uffff\1\32\1\uffff\1\35\1\uffff\1\1\7\uffff\1\10\1\uffff\1\13\7\uffff\1\33\1\uffff\1\2\1\3\5\uffff\1\11\1\15\2\uffff\1\23\1\34\5\uffff\1\4\1\31\1\6\1\uffff\1\20\1\21\3\uffff\1\22\1\5\1\7\2\uffff\1\12\1\26\1\30";
    static final String DFA16_specialS =
        "\1\0\36\uffff\1\2\1\1\u0090\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\30\1\37\1\31\1\12\2\43\1\40\4\43\1\26\1\35\1\43\1\41\12\36\7\43\2\32\1\13\13\32\1\11\1\21\1\32\1\20\1\17\1\23\2\32\1\16\3\32\3\43\1\34\1\32\1\43\1\15\1\5\1\2\1\32\1\6\1\24\2\32\1\10\2\32\1\7\1\32\1\22\1\14\3\32\1\4\1\1\1\32\1\3\4\32\1\25\1\43\1\27\uff82\43",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\44\11\46\1\45\13\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\50\16\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\1\51\7\46\1\52\21\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\53\2\46\1\54\22\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\56\17\46\1\55\5\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\57\16\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\60\21\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\61\14\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\17\46\1\62\12\46",
            "",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\64\16\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\65\14\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\67\1\66\6\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\70\21\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\71\6\46\1\73\7\46\1\72\6\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\74\25\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46\1\75\10\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\76\13\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\30\46\1\77\1\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\100\13\46",
            "",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\0\107",
            "\0\107",
            "\1\110",
            "",
            "",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\27\46\1\112\2\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\1\114\31\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\115\16\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\116\7\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\2\46\1\117\27\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\120\13\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\121\6\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\123\25\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\124\14\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\17\46\1\125\12\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\126\25\46",
            "",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\127\21\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\133\6\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\134\16\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\135\13\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\136\25\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\14\46\1\137\15\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\140\13\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\141\6\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\17\46\1\142\12\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46\1\143\10\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\144\6\46",
            "",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\145\7\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\24\46\1\146\5\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\147\21\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\150\13\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\24\46\1\151\5\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\152\6\46",
            "",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\14\46\1\153\15\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\12\46\1\154\17\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\24\46\1\155\5\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\156\14\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\2\46\1\157\27\46",
            "",
            "",
            "",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\7\46\1\160\22\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\161\25\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46\1\162\10\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\163\25\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\164\25\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\17\46\1\165\12\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\167\25\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\1\171\31\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\173\7\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\174\25\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\1\46\1\175\30\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\176\14\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\177\16\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\u0080\13\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\u0081\25\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\u0083\6\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\12\46\1\u0085\17\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\u0086\21\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\2\46\1\u0087\27\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\u0088\25\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\17\46\1\u0089\12\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\14\46\1\u008a\15\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\u008b\25\46",
            "",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46\1\u008d\10\46",
            "",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\u0090\16\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46\1\u0091\26\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46\1\u0092\26\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\u0093\14\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\u0094\14\46",
            "",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\u0097\14\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\u0098\6\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\1\46\1\u009b\30\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46\1\u009c\10\46",
            "",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\u009d\25\46",
            "",
            "",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\u009e\25\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\u009f\7\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\u00a3\6\46",
            "",
            "",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\u00a6\25\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\u00a7\6\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\1\u00a8\31\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46\1\u00ac\10\46",
            "\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\30\46\1\u00ad\1\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\33\2\uffff\12\47\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_CUSTOM_COMMAND | RULE_SL_COMMENT | RULE_UNQUOTED | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='t') ) {s = 1;}

                        else if ( (LA16_0=='c') ) {s = 2;}

                        else if ( (LA16_0=='v') ) {s = 3;}

                        else if ( (LA16_0=='s') ) {s = 4;}

                        else if ( (LA16_0=='b') ) {s = 5;}

                        else if ( (LA16_0=='e') ) {s = 6;}

                        else if ( (LA16_0=='l') ) {s = 7;}

                        else if ( (LA16_0=='i') ) {s = 8;}

                        else if ( (LA16_0=='O') ) {s = 9;}

                        else if ( (LA16_0=='$') ) {s = 10;}

                        else if ( (LA16_0=='C') ) {s = 11;}

                        else if ( (LA16_0=='o') ) {s = 12;}

                        else if ( (LA16_0=='a') ) {s = 13;}

                        else if ( (LA16_0=='W') ) {s = 14;}

                        else if ( (LA16_0=='S') ) {s = 15;}

                        else if ( (LA16_0=='R') ) {s = 16;}

                        else if ( (LA16_0=='P') ) {s = 17;}

                        else if ( (LA16_0=='n') ) {s = 18;}

                        else if ( (LA16_0=='T') ) {s = 19;}

                        else if ( (LA16_0=='f') ) {s = 20;}

                        else if ( (LA16_0=='{') ) {s = 21;}

                        else if ( (LA16_0==',') ) {s = 22;}

                        else if ( (LA16_0=='}') ) {s = 23;}

                        else if ( (LA16_0=='!') ) {s = 24;}

                        else if ( (LA16_0=='#') ) {s = 25;}

                        else if ( ((LA16_0>='A' && LA16_0<='B')||(LA16_0>='D' && LA16_0<='N')||LA16_0=='Q'||(LA16_0>='U' && LA16_0<='V')||(LA16_0>='X' && LA16_0<='Z')||LA16_0=='_'||LA16_0=='d'||(LA16_0>='g' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='k')||LA16_0=='m'||(LA16_0>='p' && LA16_0<='r')||LA16_0=='u'||(LA16_0>='w' && LA16_0<='z')) ) {s = 26;}

                        else if ( (LA16_0=='^') ) {s = 28;}

                        else if ( (LA16_0=='-') ) {s = 29;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 30;}

                        else if ( (LA16_0=='\"') ) {s = 31;}

                        else if ( (LA16_0=='\'') ) {s = 32;}

                        else if ( (LA16_0=='/') ) {s = 33;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 34;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='%' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='+')||LA16_0=='.'||(LA16_0>=':' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 35;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_32 = input.LA(1);

                        s = -1;
                        if ( ((LA16_32>='\u0000' && LA16_32<='\uFFFF')) ) {s = 71;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_31 = input.LA(1);

                        s = -1;
                        if ( ((LA16_31>='\u0000' && LA16_31<='\uFFFF')) ) {s = 71;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
package org.mde.spec.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


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
    public static final int RULE_CUSTOM_COMMAND=5;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=4;
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
            // InternalSpec.g:11:7: ( 'Open' )
            // InternalSpec.g:11:9: 'Open'
            {
            match("Open"); 


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
            // InternalSpec.g:12:7: ( '$' )
            // InternalSpec.g:12:9: '$'
            {
            match('$'); 

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
            // InternalSpec.g:13:7: ( 'Click' )
            // InternalSpec.g:13:9: 'Click'
            {
            match("Click"); 


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
            // InternalSpec.g:14:7: ( 'on' )
            // InternalSpec.g:14:9: 'on'
            {
            match("on"); 


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
            // InternalSpec.g:15:7: ( 'at' )
            // InternalSpec.g:15:9: 'at'
            {
            match("at"); 


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
            // InternalSpec.g:16:7: ( 'Within' )
            // InternalSpec.g:16:9: 'Within'
            {
            match("Within"); 


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
            // InternalSpec.g:17:7: ( 'Select' )
            // InternalSpec.g:17:9: 'Select'
            {
            match("Select"); 


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
            // InternalSpec.g:18:7: ( 'visible' )
            // InternalSpec.g:18:9: 'visible'
            {
            match("visible"); 


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
            // InternalSpec.g:19:7: ( 'Store' )
            // InternalSpec.g:19:9: 'Store'
            {
            match("Store"); 


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
            // InternalSpec.g:20:7: ( 'to' )
            // InternalSpec.g:20:9: 'to'
            {
            match("to"); 


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
            // InternalSpec.g:21:7: ( 'be' )
            // InternalSpec.g:21:9: 'be'
            {
            match("be"); 


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
            // InternalSpec.g:22:7: ( 'Remember' )
            // InternalSpec.g:22:9: 'Remember'
            {
            match("Remember"); 


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
            // InternalSpec.g:23:7: ( 'as' )
            // InternalSpec.g:23:9: 'as'
            {
            match("as"); 


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
            // InternalSpec.g:24:7: ( 'Property' )
            // InternalSpec.g:24:9: 'Property'
            {
            match("Property"); 


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
            // InternalSpec.g:25:7: ( 'text' )
            // InternalSpec.g:25:9: 'text'
            {
            match("text"); 


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
            // InternalSpec.g:26:7: ( 'class' )
            // InternalSpec.g:26:9: 'class'
            {
            match("class"); 


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
            // InternalSpec.g:27:7: ( 'value' )
            // InternalSpec.g:27:9: 'value'
            {
            match("value"); 


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
            // InternalSpec.g:28:7: ( 'should' )
            // InternalSpec.g:28:9: 'should'
            {
            match("should"); 


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
            // InternalSpec.g:29:7: ( 'not' )
            // InternalSpec.g:29:9: 'not'
            {
            match("not"); 


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
            // InternalSpec.g:30:7: ( 'Type' )
            // InternalSpec.g:30:9: 'Type'
            {
            match("Type"); 


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
            // InternalSpec.g:31:7: ( 'Sleep' )
            // InternalSpec.g:31:9: 'Sleep'
            {
            match("Sleep"); 


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
            // InternalSpec.g:32:7: ( 'for' )
            // InternalSpec.g:32:9: 'for'
            {
            match("for"); 


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
            // InternalSpec.g:33:7: ( 'second' )
            // InternalSpec.g:33:9: 'second'
            {
            match("second"); 


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
            // InternalSpec.g:34:7: ( 'seconds' )
            // InternalSpec.g:34:9: 'seconds'
            {
            match("seconds"); 


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
            // InternalSpec.g:35:7: ( '{' )
            // InternalSpec.g:35:9: '{'
            {
            match('{'); 

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
            // InternalSpec.g:36:7: ( ',' )
            // InternalSpec.g:36:9: ','
            {
            match(','); 

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
            // InternalSpec.g:37:7: ( '}' )
            // InternalSpec.g:37:9: '}'
            {
            match('}'); 

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
            // InternalSpec.g:38:7: ( 'button' )
            // InternalSpec.g:38:9: 'button'
            {
            match("button"); 


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
            // InternalSpec.g:39:7: ( 'element' )
            // InternalSpec.g:39:9: 'element'
            {
            match("element"); 


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
            // InternalSpec.g:40:7: ( 'link' )
            // InternalSpec.g:40:9: 'link'
            {
            match("link"); 


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
            // InternalSpec.g:41:7: ( 'input' )
            // InternalSpec.g:41:9: 'input'
            {
            match("input"); 


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
            // InternalSpec.g:42:7: ( 'textarea' )
            // InternalSpec.g:42:9: 'textarea'
            {
            match("textarea"); 


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
            // InternalSpec.g:1190:21: ( '!' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSpec.g:1190:23: '!' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('!'); 
            // InternalSpec.g:1190:27: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSpec.g:1190:27: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSpec.g:1190:43: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpec.g:1190:44: ( '\\r' )? '\\n'
                    {
                    // InternalSpec.g:1190:44: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalSpec.g:1190:44: '\\r'
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
            // InternalSpec.g:1192:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSpec.g:1192:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalSpec.g:1192:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSpec.g:1192:23: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSpec.g:1192:39: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpec.g:1192:40: ( '\\r' )? '\\n'
                    {
                    // InternalSpec.g:1192:40: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSpec.g:1192:40: '\\r'
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
            // InternalSpec.g:1194:15: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' )* )
            // InternalSpec.g:1194:17: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' )*
            {
            // InternalSpec.g:1194:17: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' )*
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
            // InternalSpec.g:1196:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSpec.g:1196:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSpec.g:1196:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpec.g:1196:11: '^'
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

            // InternalSpec.g:1196:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalSpec.g:1198:10: ( ( '0' .. '9' )+ )
            // InternalSpec.g:1198:12: ( '0' .. '9' )+
            {
            // InternalSpec.g:1198:12: ( '0' .. '9' )+
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
            	    // InternalSpec.g:1198:13: '0' .. '9'
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
            // InternalSpec.g:1200:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSpec.g:1200:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSpec.g:1200:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalSpec.g:1200:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSpec.g:1200:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalSpec.g:1200:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSpec.g:1200:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalSpec.g:1200:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSpec.g:1200:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalSpec.g:1200:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSpec.g:1200:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalSpec.g:1202:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSpec.g:1202:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSpec.g:1202:24: ( options {greedy=false; } : . )*
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
            	    // InternalSpec.g:1202:52: .
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
            // InternalSpec.g:1204:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSpec.g:1204:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSpec.g:1204:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalSpec.g:1206:16: ( . )
            // InternalSpec.g:1206:18: .
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
        "\2\33\1\uffff\17\33\3\uffff\3\33\2\uffff\1\33\1\uffff\1\43\2\uffff\3\43\2\uffff\2\33\2\uffff\1\33\1\114\1\115\1\116\6\33\1\125\1\33\1\127\11\33\3\uffff\3\33\6\uffff\2\33\3\uffff\6\33\1\uffff\1\33\1\uffff\6\33\1\163\1\33\1\165\3\33\1\171\7\33\1\u0082\6\33\1\uffff\1\u0089\1\uffff\1\33\1\u008b\1\33\1\uffff\1\u008d\2\33\1\u0090\1\u0091\1\33\1\u0093\1\33\1\uffff\3\33\1\u0098\2\33\1\uffff\1\33\1\uffff\1\u009c\1\uffff\1\u009d\1\u009e\2\uffff\1\33\1\uffff\1\33\1\u00a1\2\33\1\uffff\1\u00a4\1\u00a6\1\33\3\uffff\1\u00a8\1\33\1\uffff\2\33\1\uffff\1\u00ac\1\uffff\1\u00ad\1\uffff\1\u00ae\1\u00af\1\u00b0\5\uffff";
    static final String DFA16_eofS =
        "\u00b1\uffff";
    static final String DFA16_minS =
        "\1\0\1\60\1\uffff\17\60\3\uffff\3\60\2\uffff\1\60\1\uffff\1\101\2\uffff\2\0\1\52\2\uffff\2\60\2\uffff\1\60\3\55\6\60\1\55\1\60\1\55\11\60\3\uffff\3\60\6\uffff\2\60\3\uffff\6\60\1\uffff\1\60\1\uffff\6\60\1\55\1\60\1\55\3\60\1\55\7\60\1\55\6\60\1\uffff\1\55\1\uffff\1\60\1\55\1\60\1\uffff\1\55\2\60\2\55\1\60\1\55\1\60\1\uffff\3\60\1\55\2\60\1\uffff\1\60\1\uffff\1\55\1\uffff\2\55\2\uffff\1\60\1\uffff\1\60\1\55\2\60\1\uffff\2\55\1\60\3\uffff\1\55\1\60\1\uffff\2\60\1\uffff\1\55\1\uffff\1\55\1\uffff\3\55\5\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\172\1\uffff\17\172\3\uffff\3\172\2\uffff\1\172\1\uffff\1\172\2\uffff\2\uffff\1\52\2\uffff\2\172\2\uffff\26\172\3\uffff\3\172\6\uffff\2\172\3\uffff\6\172\1\uffff\1\172\1\uffff\33\172\1\uffff\1\172\1\uffff\3\172\1\uffff\10\172\1\uffff\6\172\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\2\uffff\1\172\1\uffff\4\172\1\uffff\3\172\3\uffff\2\172\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3\172\5\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\17\uffff\1\31\1\32\1\33\3\uffff\1\41\1\42\1\uffff\1\43\1\uffff\1\43\1\45\3\uffff\1\50\1\51\2\uffff\1\44\1\2\26\uffff\1\31\1\32\1\33\3\uffff\1\41\1\42\1\45\1\46\1\47\1\50\2\uffff\1\4\1\5\1\15\6\uffff\1\12\1\uffff\1\13\33\uffff\1\23\1\uffff\1\26\3\uffff\1\1\10\uffff\1\17\6\uffff\1\24\1\uffff\1\36\1\uffff\1\3\2\uffff\1\11\1\25\1\uffff\1\21\4\uffff\1\20\3\uffff\1\37\1\6\1\7\2\uffff\1\34\2\uffff\1\22\1\uffff\1\27\1\uffff\1\10\3\uffff\1\30\1\35\1\40\1\14\1\16";
    static final String DFA16_specialS =
        "\1\1\36\uffff\1\2\1\0\u0090\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\30\1\37\1\31\1\2\2\43\1\40\4\43\1\23\1\35\1\43\1\41\12\36\7\43\2\32\1\3\13\32\1\1\1\14\1\32\1\13\1\7\1\20\2\32\1\6\3\32\3\43\1\34\1\32\1\43\1\5\1\12\1\15\1\32\1\25\1\21\2\32\1\27\2\32\1\26\1\32\1\17\1\4\3\32\1\16\1\11\1\32\1\10\4\32\1\22\1\43\1\24\uff82\43",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45\1\44\12\45",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\50\16\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\51\14\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\53\1\52\6\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\54\21\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\55\6\45\1\57\7\45\1\56\6\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\1\61\7\45\1\60\21\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\63\11\45\1\62\13\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\64\17\45\1\65\5\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\66\25\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\67\10\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\70\16\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\72\2\45\1\71\22\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\73\13\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\30\45\1\74\1\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\75\13\45",
            "",
            "",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\101\16\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\102\21\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\103\14\45",
            "",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\0\107",
            "\0\107",
            "\1\110",
            "",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\112\25\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\113\21\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\117\6\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\120\16\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\121\13\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\122\25\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\123\7\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\124\16\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\27\45\1\126\2\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\130\6\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\14\45\1\131\15\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\132\13\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\1\133\31\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\134\13\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\2\45\1\135\27\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\136\6\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45\1\137\12\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\140\10\45",
            "",
            "",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\141\25\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\142\14\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45\1\143\12\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\144\14\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\2\45\1\145\27\45",
            "",
            "",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\7\45\1\146\22\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\147\25\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\150\10\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\151\25\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\152\21\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\24\45\1\153\5\45",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\154\6\45",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\155\6\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\156\25\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45\1\157\12\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\160\7\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\24\45\1\161\5\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\162\13\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\164\25\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\14\45\1\166\15\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\12\45\1\167\17\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\24\45\1\170\5\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\12\45\1\172\17\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\173\21\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\2\45\1\174\27\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\175\25\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45\1\176\12\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\1\45\1\177\30\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u0080\25\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\1\u0081\31\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\u0083\13\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\14\45\1\u0084\15\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u0085\25\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\u0086\7\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\u0087\16\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\u0088\14\45",
            "",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u008a\25\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\u008c\6\45",
            "",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\u008e\14\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\u008f\6\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\u0092\16\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\u0094\10\45",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\u0095\14\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\1\45\1\u0096\30\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\u0097\10\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\3\45\1\u0099\26\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\3\45\1\u009a\26\45",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\u009b\14\45",
            "",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u009f\25\45",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u00a0\25\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u00a2\25\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\u00a3\6\45",
            "",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\u00a5\7\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\u00a7\6\45",
            "",
            "",
            "",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\1\u00a9\31\45",
            "",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\u00aa\10\45",
            "\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\30\45\1\u00ab\1\45",
            "",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\33\2\uffff\12\46\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
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
                        int LA16_32 = input.LA(1);

                        s = -1;
                        if ( ((LA16_32>='\u0000' && LA16_32<='\uFFFF')) ) {s = 71;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='O') ) {s = 1;}

                        else if ( (LA16_0=='$') ) {s = 2;}

                        else if ( (LA16_0=='C') ) {s = 3;}

                        else if ( (LA16_0=='o') ) {s = 4;}

                        else if ( (LA16_0=='a') ) {s = 5;}

                        else if ( (LA16_0=='W') ) {s = 6;}

                        else if ( (LA16_0=='S') ) {s = 7;}

                        else if ( (LA16_0=='v') ) {s = 8;}

                        else if ( (LA16_0=='t') ) {s = 9;}

                        else if ( (LA16_0=='b') ) {s = 10;}

                        else if ( (LA16_0=='R') ) {s = 11;}

                        else if ( (LA16_0=='P') ) {s = 12;}

                        else if ( (LA16_0=='c') ) {s = 13;}

                        else if ( (LA16_0=='s') ) {s = 14;}

                        else if ( (LA16_0=='n') ) {s = 15;}

                        else if ( (LA16_0=='T') ) {s = 16;}

                        else if ( (LA16_0=='f') ) {s = 17;}

                        else if ( (LA16_0=='{') ) {s = 18;}

                        else if ( (LA16_0==',') ) {s = 19;}

                        else if ( (LA16_0=='}') ) {s = 20;}

                        else if ( (LA16_0=='e') ) {s = 21;}

                        else if ( (LA16_0=='l') ) {s = 22;}

                        else if ( (LA16_0=='i') ) {s = 23;}

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
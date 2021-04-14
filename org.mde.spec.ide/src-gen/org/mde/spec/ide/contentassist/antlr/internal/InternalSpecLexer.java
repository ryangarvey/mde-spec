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
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_CUSTOM_COMMAND=5;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:11:7: ( 'second' )
            // InternalSpec.g:11:9: 'second'
            {
            match("second"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:12:7: ( 'seconds' )
            // InternalSpec.g:12:9: 'seconds'
            {
            match("seconds"); 


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
            // InternalSpec.g:13:7: ( 'Chrome' )
            // InternalSpec.g:13:9: 'Chrome'
            {
            match("Chrome"); 


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
            // InternalSpec.g:14:7: ( 'Firefox' )
            // InternalSpec.g:14:9: 'Firefox'
            {
            match("Firefox"); 


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
            // InternalSpec.g:15:7: ( 'Explorer' )
            // InternalSpec.g:15:9: 'Explorer'
            {
            match("Explorer"); 


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
            // InternalSpec.g:16:7: ( 'Edge' )
            // InternalSpec.g:16:9: 'Edge'
            {
            match("Edge"); 


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
            // InternalSpec.g:17:7: ( 'Opera' )
            // InternalSpec.g:17:9: 'Opera'
            {
            match("Opera"); 


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
            // InternalSpec.g:18:7: ( 'Safari' )
            // InternalSpec.g:18:9: 'Safari'
            {
            match("Safari"); 


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
            // InternalSpec.g:19:7: ( 'button' )
            // InternalSpec.g:19:9: 'button'
            {
            match("button"); 


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
            // InternalSpec.g:20:7: ( 'element' )
            // InternalSpec.g:20:9: 'element'
            {
            match("element"); 


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
            // InternalSpec.g:21:7: ( 'link' )
            // InternalSpec.g:21:9: 'link'
            {
            match("link"); 


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
            // InternalSpec.g:22:7: ( 'input' )
            // InternalSpec.g:22:9: 'input'
            {
            match("input"); 


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
            // InternalSpec.g:23:7: ( 'textarea' )
            // InternalSpec.g:23:9: 'textarea'
            {
            match("textarea"); 


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
            // InternalSpec.g:24:7: ( 'text' )
            // InternalSpec.g:24:9: 'text'
            {
            match("text"); 


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
            // InternalSpec.g:25:7: ( 'class' )
            // InternalSpec.g:25:9: 'class'
            {
            match("class"); 


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
            // InternalSpec.g:26:7: ( 'value' )
            // InternalSpec.g:26:9: 'value'
            {
            match("value"); 


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
            // InternalSpec.g:27:7: ( 'should be' )
            // InternalSpec.g:27:9: 'should be'
            {
            match("should be"); 


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
            // InternalSpec.g:28:7: ( 'should not be' )
            // InternalSpec.g:28:9: 'should not be'
            {
            match("should not be"); 


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
            // InternalSpec.g:29:7: ( 'on' )
            // InternalSpec.g:29:9: 'on'
            {
            match("on"); 


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
            // InternalSpec.g:30:7: ( 'at' )
            // InternalSpec.g:30:9: 'at'
            {
            match("at"); 


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
            // InternalSpec.g:31:7: ( 'visible' )
            // InternalSpec.g:31:9: 'visible'
            {
            match("visible"); 


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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:33:7: ( '{' )
            // InternalSpec.g:33:9: '{'
            {
            match('{'); 

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
            // InternalSpec.g:34:7: ( ',' )
            // InternalSpec.g:34:9: ','
            {
            match(','); 

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
            // InternalSpec.g:35:7: ( '}' )
            // InternalSpec.g:35:9: '}'
            {
            match('}'); 

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
            // InternalSpec.g:36:7: ( 'Perform' )
            // InternalSpec.g:36:9: 'Perform'
            {
            match("Perform"); 


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
            // InternalSpec.g:37:7: ( 'times' )
            // InternalSpec.g:37:9: 'times'
            {
            match("times"); 


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
            // InternalSpec.g:38:7: ( ':' )
            // InternalSpec.g:38:9: ':'
            {
            match(':'); 

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
            // InternalSpec.g:39:7: ( '\\n\\n' )
            // InternalSpec.g:39:9: '\\n\\n'
            {
            match("\n\n"); 


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
            // InternalSpec.g:40:7: ( 'Store' )
            // InternalSpec.g:40:9: 'Store'
            {
            match("Store"); 


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
            // InternalSpec.g:41:7: ( 'as' )
            // InternalSpec.g:41:9: 'as'
            {
            match("as"); 


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
            // InternalSpec.g:42:7: ( 'Using' )
            // InternalSpec.g:42:9: 'Using'
            {
            match("Using"); 


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
            // InternalSpec.g:43:7: ( 'Open' )
            // InternalSpec.g:43:9: 'Open'
            {
            match("Open"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:44:7: ( 'Click' )
            // InternalSpec.g:44:9: 'Click'
            {
            match("Click"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:45:7: ( 'Within' )
            // InternalSpec.g:45:9: 'Within'
            {
            match("Within"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:46:7: ( 'Select' )
            // InternalSpec.g:46:9: 'Select'
            {
            match("Select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:47:7: ( 'Property' )
            // InternalSpec.g:47:9: 'Property'
            {
            match("Property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:48:7: ( 'Type' )
            // InternalSpec.g:48:9: 'Type'
            {
            match("Type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:49:7: ( 'Sleep' )
            // InternalSpec.g:49:9: 'Sleep'
            {
            match("Sleep"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "RULE_CUSTOM_COMMAND"
    public final void mRULE_CUSTOM_COMMAND() throws RecognitionException {
        try {
            int _type = RULE_CUSTOM_COMMAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:2553:21: ( '!' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSpec.g:2553:23: '!' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('!'); 
            // InternalSpec.g:2553:27: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSpec.g:2553:27: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSpec.g:2553:43: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpec.g:2553:44: ( '\\r' )? '\\n'
                    {
                    // InternalSpec.g:2553:44: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalSpec.g:2553:44: '\\r'
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
            // InternalSpec.g:2555:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSpec.g:2555:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalSpec.g:2555:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSpec.g:2555:23: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSpec.g:2555:39: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpec.g:2555:40: ( '\\r' )? '\\n'
                    {
                    // InternalSpec.g:2555:40: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSpec.g:2555:40: '\\r'
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpec.g:2557:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSpec.g:2557:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSpec.g:2557:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSpec.g:2557:11: '^'
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

            // InternalSpec.g:2557:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
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
            	    break loop8;
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
            // InternalSpec.g:2559:10: ( ( '0' .. '9' )+ )
            // InternalSpec.g:2559:12: ( '0' .. '9' )+
            {
            // InternalSpec.g:2559:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSpec.g:2559:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // InternalSpec.g:2561:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSpec.g:2561:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSpec.g:2561:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpec.g:2561:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSpec.g:2561:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSpec.g:2561:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSpec.g:2561:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSpec.g:2561:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSpec.g:2561:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSpec.g:2561:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSpec.g:2561:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // InternalSpec.g:2563:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSpec.g:2563:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSpec.g:2563:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSpec.g:2563:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // InternalSpec.g:2565:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSpec.g:2565:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSpec.g:2565:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalSpec.g:2567:16: ( . )
            // InternalSpec.g:2567:18: .
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
        // InternalSpec.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_CUSTOM_COMMAND | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=47;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalSpec.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalSpec.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalSpec.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalSpec.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalSpec.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalSpec.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalSpec.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalSpec.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalSpec.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalSpec.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalSpec.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalSpec.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalSpec.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalSpec.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalSpec.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalSpec.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalSpec.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalSpec.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalSpec.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalSpec.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalSpec.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalSpec.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalSpec.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalSpec.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalSpec.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalSpec.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalSpec.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalSpec.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalSpec.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalSpec.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalSpec.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalSpec.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalSpec.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalSpec.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalSpec.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalSpec.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalSpec.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalSpec.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalSpec.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalSpec.g:1:244: RULE_CUSTOM_COMMAND
                {
                mRULE_CUSTOM_COMMAND(); 

                }
                break;
            case 41 :
                // InternalSpec.g:1:264: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // InternalSpec.g:1:280: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 43 :
                // InternalSpec.g:1:288: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 44 :
                // InternalSpec.g:1:297: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 45 :
                // InternalSpec.g:1:309: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // InternalSpec.g:1:325: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 47 :
                // InternalSpec.g:1:333: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\20\46\3\uffff\1\46\1\uffff\1\105\3\46\2\uffff\1\43\2\uffff\3\43\2\uffff\2\46\1\uffff\23\46\1\143\1\144\1\145\1\46\3\uffff\2\46\1\uffff\1\151\1\uffff\3\46\5\uffff\25\46\3\uffff\1\u0083\2\46\1\uffff\11\46\1\u008f\1\46\1\u0091\6\46\1\u0098\1\46\1\u009b\4\46\1\uffff\4\46\1\u00a4\3\46\1\u00a8\2\46\1\uffff\1\u00ab\1\uffff\1\46\1\u00ad\1\46\1\u00af\2\46\1\uffff\1\u00b2\1\46\1\uffff\1\u00b4\1\u00b5\1\u00b6\3\46\1\u00ba\1\46\1\uffff\1\u00bd\1\46\1\u00bf\1\uffff\2\46\1\uffff\1\u00c2\1\uffff\1\u00c3\1\uffff\1\u00c4\1\46\1\uffff\1\46\3\uffff\3\46\1\uffff\1\u00ca\1\u00cb\3\uffff\1\u00ce\1\46\3\uffff\1\u00d0\1\46\1\u00d2\1\u00d3\1\46\5\uffff\1\u00d5\1\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff";
    static final String DFA15_eofS =
        "\u00d8\uffff";
    static final String DFA15_minS =
        "\1\0\1\145\1\150\1\151\1\144\1\160\1\141\1\165\1\154\1\151\1\156\1\145\1\154\1\141\1\156\1\163\1\157\3\uffff\1\145\1\uffff\1\12\1\163\1\151\1\171\2\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\143\1\157\1\uffff\1\162\1\151\1\162\1\160\1\147\1\145\1\146\1\157\1\154\1\145\1\164\1\145\1\156\1\160\1\170\1\155\1\141\1\154\1\163\3\60\1\162\3\uffff\1\162\1\157\1\uffff\1\11\1\uffff\1\151\1\164\1\160\5\uffff\1\157\1\165\1\157\1\143\1\145\1\154\1\145\1\156\1\141\1\162\2\145\1\164\1\155\1\153\1\165\1\164\1\145\1\163\1\165\1\151\3\uffff\1\60\1\146\1\160\1\uffff\1\156\1\150\1\145\1\156\1\154\1\155\1\153\1\146\1\157\1\60\1\141\1\60\1\162\1\145\1\143\1\160\1\157\1\145\1\60\1\164\1\60\2\163\1\145\1\142\1\uffff\1\157\1\145\1\147\1\151\1\60\2\144\1\145\1\60\1\157\1\162\1\uffff\1\60\1\uffff\1\151\1\60\1\164\1\60\2\156\1\uffff\1\60\1\162\1\uffff\3\60\1\154\2\162\1\60\1\156\1\uffff\1\60\1\40\1\60\1\uffff\1\170\1\145\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\164\1\uffff\1\145\3\uffff\1\145\1\155\1\164\1\uffff\2\60\1\uffff\1\142\1\uffff\1\60\1\162\3\uffff\1\60\1\141\2\60\1\171\5\uffff\1\60\1\uffff\1\60\2\uffff\1\60\3\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\150\1\154\1\151\1\170\1\160\1\164\1\165\1\154\1\151\1\156\1\151\1\154\1\151\1\156\1\164\1\157\3\uffff\1\162\1\uffff\1\12\1\163\1\151\1\171\2\uffff\1\172\2\uffff\2\uffff\1\52\2\uffff\1\143\1\157\1\uffff\1\162\1\151\1\162\1\160\1\147\1\145\1\146\1\157\1\154\1\145\1\164\1\145\1\156\1\160\1\170\1\155\1\141\1\154\1\163\3\172\1\162\3\uffff\1\162\1\157\1\uffff\1\40\1\uffff\1\151\1\164\1\160\5\uffff\1\157\1\165\1\157\1\143\1\145\1\154\1\145\1\162\1\141\1\162\2\145\1\164\1\155\1\153\1\165\1\164\1\145\1\163\1\165\1\151\3\uffff\1\172\1\146\1\160\1\uffff\1\156\1\150\1\145\1\156\1\154\1\155\1\153\1\146\1\157\1\172\1\141\1\172\1\162\1\145\1\143\1\160\1\157\1\145\1\172\1\164\1\172\2\163\1\145\1\142\1\uffff\1\157\1\145\1\147\1\151\1\172\2\144\1\145\1\172\1\157\1\162\1\uffff\1\172\1\uffff\1\151\1\172\1\164\1\172\2\156\1\uffff\1\172\1\162\1\uffff\3\172\1\154\2\162\1\172\1\156\1\uffff\1\172\1\40\1\172\1\uffff\1\170\1\145\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\164\1\uffff\1\145\3\uffff\1\145\1\155\1\164\1\uffff\2\172\1\uffff\1\156\1\uffff\1\172\1\162\3\uffff\1\172\1\141\2\172\1\171\5\uffff\1\172\1\uffff\1\172\2\uffff\1\172\3\uffff";
    static final String DFA15_acceptS =
        "\21\uffff\1\27\1\30\1\31\1\uffff\1\34\4\uffff\1\50\1\51\1\uffff\1\52\1\53\3\uffff\1\56\1\57\2\uffff\1\52\27\uffff\1\27\1\30\1\31\2\uffff\1\34\1\uffff\1\56\3\uffff\1\50\1\51\1\53\1\54\1\55\25\uffff\1\23\1\24\1\37\3\uffff\1\35\31\uffff\1\26\13\uffff\1\6\1\uffff\1\41\6\uffff\1\13\2\uffff\1\16\10\uffff\1\46\3\uffff\1\42\2\uffff\1\7\1\uffff\1\36\1\uffff\1\47\2\uffff\1\14\1\uffff\1\33\1\17\1\20\3\uffff\1\40\2\uffff\1\1\1\uffff\1\3\2\uffff\1\10\1\44\1\11\5\uffff\1\43\1\2\1\21\1\22\1\4\1\uffff\1\12\1\uffff\1\25\1\32\1\uffff\1\5\1\15\1\45";
    static final String DFA15_specialS =
        "\1\1\36\uffff\1\2\1\0\u00b7\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\43\1\42\1\26\2\43\1\42\22\43\1\42\1\32\1\37\1\33\3\43\1\40\4\43\1\22\2\43\1\41\12\36\1\25\6\43\2\35\1\2\1\35\1\4\1\3\10\35\1\5\1\24\2\35\1\6\1\31\1\27\1\35\1\30\3\35\3\43\1\34\1\35\1\43\1\17\1\7\1\14\1\35\1\10\1\20\2\35\1\12\2\35\1\11\2\35\1\16\3\35\1\1\1\13\1\35\1\15\4\35\1\21\1\43\1\23\uff82\43",
            "\1\44\2\uffff\1\45",
            "\1\47\3\uffff\1\50",
            "\1\51",
            "\1\53\23\uffff\1\52",
            "\1\54",
            "\1\55\3\uffff\1\57\6\uffff\1\60\7\uffff\1\56",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65\3\uffff\1\66",
            "\1\67",
            "\1\70\7\uffff\1\71",
            "\1\72",
            "\1\74\1\73",
            "\1\75",
            "",
            "",
            "",
            "\1\101\14\uffff\1\102",
            "",
            "\1\104",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\0\114",
            "\0\114",
            "\1\115",
            "",
            "",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\146",
            "",
            "",
            "",
            "\1\147",
            "\1\150",
            "",
            "\2\105\2\uffff\1\105\22\uffff\1\105",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "",
            "",
            "",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\165\3\uffff\1\164",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0084",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0090",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0099",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\u009a\31\46",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00ac",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ae",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b3",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00bb",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\u00bc\7\46",
            "\1\u00be",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "",
            "",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00cc\13\uffff\1\u00cd",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00cf",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00d1",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00d4",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_CUSTOM_COMMAND | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_32 = input.LA(1);

                        s = -1;
                        if ( ((LA15_32>='\u0000' && LA15_32<='\uFFFF')) ) {s = 76;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='s') ) {s = 1;}

                        else if ( (LA15_0=='C') ) {s = 2;}

                        else if ( (LA15_0=='F') ) {s = 3;}

                        else if ( (LA15_0=='E') ) {s = 4;}

                        else if ( (LA15_0=='O') ) {s = 5;}

                        else if ( (LA15_0=='S') ) {s = 6;}

                        else if ( (LA15_0=='b') ) {s = 7;}

                        else if ( (LA15_0=='e') ) {s = 8;}

                        else if ( (LA15_0=='l') ) {s = 9;}

                        else if ( (LA15_0=='i') ) {s = 10;}

                        else if ( (LA15_0=='t') ) {s = 11;}

                        else if ( (LA15_0=='c') ) {s = 12;}

                        else if ( (LA15_0=='v') ) {s = 13;}

                        else if ( (LA15_0=='o') ) {s = 14;}

                        else if ( (LA15_0=='a') ) {s = 15;}

                        else if ( (LA15_0=='f') ) {s = 16;}

                        else if ( (LA15_0=='{') ) {s = 17;}

                        else if ( (LA15_0==',') ) {s = 18;}

                        else if ( (LA15_0=='}') ) {s = 19;}

                        else if ( (LA15_0=='P') ) {s = 20;}

                        else if ( (LA15_0==':') ) {s = 21;}

                        else if ( (LA15_0=='\n') ) {s = 22;}

                        else if ( (LA15_0=='U') ) {s = 23;}

                        else if ( (LA15_0=='W') ) {s = 24;}

                        else if ( (LA15_0=='T') ) {s = 25;}

                        else if ( (LA15_0=='!') ) {s = 26;}

                        else if ( (LA15_0=='#') ) {s = 27;}

                        else if ( (LA15_0=='^') ) {s = 28;}

                        else if ( ((LA15_0>='A' && LA15_0<='B')||LA15_0=='D'||(LA15_0>='G' && LA15_0<='N')||(LA15_0>='Q' && LA15_0<='R')||LA15_0=='V'||(LA15_0>='X' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='d'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='k')||(LA15_0>='m' && LA15_0<='n')||(LA15_0>='p' && LA15_0<='r')||LA15_0=='u'||(LA15_0>='w' && LA15_0<='z')) ) {s = 29;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 30;}

                        else if ( (LA15_0=='\"') ) {s = 31;}

                        else if ( (LA15_0=='\'') ) {s = 32;}

                        else if ( (LA15_0=='/') ) {s = 33;}

                        else if ( (LA15_0=='\t'||LA15_0=='\r'||LA15_0==' ') ) {s = 34;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='$' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||(LA15_0>=';' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_31 = input.LA(1);

                        s = -1;
                        if ( ((LA15_31>='\u0000' && LA15_31<='\uFFFF')) ) {s = 76;}

                        else s = 35;

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
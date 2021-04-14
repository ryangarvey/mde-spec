package org.mde.spec.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mde.spec.services.SpecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_CUSTOM_COMMAND", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Using'", "'Open'", "'Click'", "'on'", "'at'", "'Within'", "'Select'", "'visible'", "'Property'", "'Type'", "'Sleep'", "'for'", "'second'", "'seconds'", "'{'", "','", "'}'", "'Perform'", "'times'", "':'", "'\\n\\n'", "'Store'", "'as'", "'Chrome'", "'Firefox'", "'Explorer'", "'Edge'", "'Opera'", "'Safari'", "'button'", "'element'", "'link'", "'input'", "'textarea'", "'text'", "'class'", "'value'", "'should be'", "'should not be'"
    };
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


        public InternalSpecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpecParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpec.g"; }



     	private SpecGrammarAccess grammarAccess;

        public InternalSpecParser(TokenStream input, SpecGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SpecGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSpec.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSpec.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalSpec.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSpec.g:72:1: ruleModel returns [EObject current=null] : ( (lv_commands_0_0= ruleCommand ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:78:2: ( ( (lv_commands_0_0= ruleCommand ) )* )
            // InternalSpec.g:79:2: ( (lv_commands_0_0= ruleCommand ) )*
            {
            // InternalSpec.g:79:2: ( (lv_commands_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_SL_COMMENT && LA1_0<=RULE_CUSTOM_COMMAND)||(LA1_0>=12 && LA1_0<=14)||(LA1_0>=17 && LA1_0<=18)||(LA1_0>=20 && LA1_0<=22)||LA1_0==29||LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSpec.g:80:3: (lv_commands_0_0= ruleCommand )
            	    {
            	    // InternalSpec.g:80:3: (lv_commands_0_0= ruleCommand )
            	    // InternalSpec.g:81:4: lv_commands_0_0= ruleCommand
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_commands_0_0=ruleCommand();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"commands",
            	    					lv_commands_0_0,
            	    					"org.mde.spec.Spec.Command");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // InternalSpec.g:101:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalSpec.g:101:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalSpec.g:102:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalSpec.g:108:1: ruleCommand returns [EObject current=null] : (this_UsingCommand_0= ruleUsingCommand | this_OpenCommand_1= ruleOpenCommand | this_ClickCommand_2= ruleClickCommand | this_SelectCommand_3= ruleSelectCommand | this_PropertyCommand_4= rulePropertyCommand | this_TypeCommand_5= ruleTypeCommand | this_SleepCommand_6= ruleSleepCommand | this_LoopCommand_7= ruleLoopCommand | ( () this_SL_COMMENT_9= RULE_SL_COMMENT ) | ( (lv_custom_10_0= RULE_CUSTOM_COMMAND ) ) | this_VarDeclaration_11= ruleVarDeclaration ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_9=null;
        Token lv_custom_10_0=null;
        EObject this_UsingCommand_0 = null;

        EObject this_OpenCommand_1 = null;

        EObject this_ClickCommand_2 = null;

        EObject this_SelectCommand_3 = null;

        EObject this_PropertyCommand_4 = null;

        EObject this_TypeCommand_5 = null;

        EObject this_SleepCommand_6 = null;

        EObject this_LoopCommand_7 = null;

        EObject this_VarDeclaration_11 = null;



        	enterRule();

        try {
            // InternalSpec.g:114:2: ( (this_UsingCommand_0= ruleUsingCommand | this_OpenCommand_1= ruleOpenCommand | this_ClickCommand_2= ruleClickCommand | this_SelectCommand_3= ruleSelectCommand | this_PropertyCommand_4= rulePropertyCommand | this_TypeCommand_5= ruleTypeCommand | this_SleepCommand_6= ruleSleepCommand | this_LoopCommand_7= ruleLoopCommand | ( () this_SL_COMMENT_9= RULE_SL_COMMENT ) | ( (lv_custom_10_0= RULE_CUSTOM_COMMAND ) ) | this_VarDeclaration_11= ruleVarDeclaration ) )
            // InternalSpec.g:115:2: (this_UsingCommand_0= ruleUsingCommand | this_OpenCommand_1= ruleOpenCommand | this_ClickCommand_2= ruleClickCommand | this_SelectCommand_3= ruleSelectCommand | this_PropertyCommand_4= rulePropertyCommand | this_TypeCommand_5= ruleTypeCommand | this_SleepCommand_6= ruleSleepCommand | this_LoopCommand_7= ruleLoopCommand | ( () this_SL_COMMENT_9= RULE_SL_COMMENT ) | ( (lv_custom_10_0= RULE_CUSTOM_COMMAND ) ) | this_VarDeclaration_11= ruleVarDeclaration )
            {
            // InternalSpec.g:115:2: (this_UsingCommand_0= ruleUsingCommand | this_OpenCommand_1= ruleOpenCommand | this_ClickCommand_2= ruleClickCommand | this_SelectCommand_3= ruleSelectCommand | this_PropertyCommand_4= rulePropertyCommand | this_TypeCommand_5= ruleTypeCommand | this_SleepCommand_6= ruleSleepCommand | this_LoopCommand_7= ruleLoopCommand | ( () this_SL_COMMENT_9= RULE_SL_COMMENT ) | ( (lv_custom_10_0= RULE_CUSTOM_COMMAND ) ) | this_VarDeclaration_11= ruleVarDeclaration )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 17:
            case 18:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
                }
                break;
            case 22:
                {
                alt2=7;
                }
                break;
            case 29:
                {
                alt2=8;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt2=9;
                }
                break;
            case RULE_CUSTOM_COMMAND:
                {
                alt2=10;
                }
                break;
            case 33:
                {
                alt2=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSpec.g:116:3: this_UsingCommand_0= ruleUsingCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getUsingCommandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UsingCommand_0=ruleUsingCommand();

                    state._fsp--;


                    			current = this_UsingCommand_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSpec.g:125:3: this_OpenCommand_1= ruleOpenCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getOpenCommandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpenCommand_1=ruleOpenCommand();

                    state._fsp--;


                    			current = this_OpenCommand_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSpec.g:134:3: this_ClickCommand_2= ruleClickCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getClickCommandParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickCommand_2=ruleClickCommand();

                    state._fsp--;


                    			current = this_ClickCommand_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSpec.g:143:3: this_SelectCommand_3= ruleSelectCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getSelectCommandParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectCommand_3=ruleSelectCommand();

                    state._fsp--;


                    			current = this_SelectCommand_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSpec.g:152:3: this_PropertyCommand_4= rulePropertyCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getPropertyCommandParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyCommand_4=rulePropertyCommand();

                    state._fsp--;


                    			current = this_PropertyCommand_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSpec.g:161:3: this_TypeCommand_5= ruleTypeCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getTypeCommandParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeCommand_5=ruleTypeCommand();

                    state._fsp--;


                    			current = this_TypeCommand_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSpec.g:170:3: this_SleepCommand_6= ruleSleepCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getSleepCommandParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SleepCommand_6=ruleSleepCommand();

                    state._fsp--;


                    			current = this_SleepCommand_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSpec.g:179:3: this_LoopCommand_7= ruleLoopCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getLoopCommandParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoopCommand_7=ruleLoopCommand();

                    state._fsp--;


                    			current = this_LoopCommand_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSpec.g:188:3: ( () this_SL_COMMENT_9= RULE_SL_COMMENT )
                    {
                    // InternalSpec.g:188:3: ( () this_SL_COMMENT_9= RULE_SL_COMMENT )
                    // InternalSpec.g:189:4: () this_SL_COMMENT_9= RULE_SL_COMMENT
                    {
                    // InternalSpec.g:189:4: ()
                    // InternalSpec.g:190:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getCommandAction_8_0(),
                    						current);
                    				

                    }

                    this_SL_COMMENT_9=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

                    				newLeafNode(this_SL_COMMENT_9, grammarAccess.getCommandAccess().getSL_COMMENTTerminalRuleCall_8_1());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSpec.g:202:3: ( (lv_custom_10_0= RULE_CUSTOM_COMMAND ) )
                    {
                    // InternalSpec.g:202:3: ( (lv_custom_10_0= RULE_CUSTOM_COMMAND ) )
                    // InternalSpec.g:203:4: (lv_custom_10_0= RULE_CUSTOM_COMMAND )
                    {
                    // InternalSpec.g:203:4: (lv_custom_10_0= RULE_CUSTOM_COMMAND )
                    // InternalSpec.g:204:5: lv_custom_10_0= RULE_CUSTOM_COMMAND
                    {
                    lv_custom_10_0=(Token)match(input,RULE_CUSTOM_COMMAND,FOLLOW_2); 

                    					newLeafNode(lv_custom_10_0, grammarAccess.getCommandAccess().getCustomCUSTOM_COMMANDTerminalRuleCall_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCommandRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"custom",
                    						lv_custom_10_0,
                    						"org.mde.spec.Spec.CUSTOM_COMMAND");
                    				

                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalSpec.g:221:3: this_VarDeclaration_11= ruleVarDeclaration
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getVarDeclarationParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarDeclaration_11=ruleVarDeclaration();

                    state._fsp--;


                    			current = this_VarDeclaration_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleUsingCommand"
    // InternalSpec.g:233:1: entryRuleUsingCommand returns [EObject current=null] : iv_ruleUsingCommand= ruleUsingCommand EOF ;
    public final EObject entryRuleUsingCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsingCommand = null;


        try {
            // InternalSpec.g:233:53: (iv_ruleUsingCommand= ruleUsingCommand EOF )
            // InternalSpec.g:234:2: iv_ruleUsingCommand= ruleUsingCommand EOF
            {
             newCompositeNode(grammarAccess.getUsingCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsingCommand=ruleUsingCommand();

            state._fsp--;

             current =iv_ruleUsingCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUsingCommand"


    // $ANTLR start "ruleUsingCommand"
    // InternalSpec.g:240:1: ruleUsingCommand returns [EObject current=null] : ( ( (lv_name_0_0= 'Using' ) ) ( (lv_browser_1_0= ruleBrowser ) ) ) ;
    public final EObject ruleUsingCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_browser_1_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:246:2: ( ( ( (lv_name_0_0= 'Using' ) ) ( (lv_browser_1_0= ruleBrowser ) ) ) )
            // InternalSpec.g:247:2: ( ( (lv_name_0_0= 'Using' ) ) ( (lv_browser_1_0= ruleBrowser ) ) )
            {
            // InternalSpec.g:247:2: ( ( (lv_name_0_0= 'Using' ) ) ( (lv_browser_1_0= ruleBrowser ) ) )
            // InternalSpec.g:248:3: ( (lv_name_0_0= 'Using' ) ) ( (lv_browser_1_0= ruleBrowser ) )
            {
            // InternalSpec.g:248:3: ( (lv_name_0_0= 'Using' ) )
            // InternalSpec.g:249:4: (lv_name_0_0= 'Using' )
            {
            // InternalSpec.g:249:4: (lv_name_0_0= 'Using' )
            // InternalSpec.g:250:5: lv_name_0_0= 'Using'
            {
            lv_name_0_0=(Token)match(input,12,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getUsingCommandAccess().getNameUsingKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsingCommandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Using");
            				

            }


            }

            // InternalSpec.g:262:3: ( (lv_browser_1_0= ruleBrowser ) )
            // InternalSpec.g:263:4: (lv_browser_1_0= ruleBrowser )
            {
            // InternalSpec.g:263:4: (lv_browser_1_0= ruleBrowser )
            // InternalSpec.g:264:5: lv_browser_1_0= ruleBrowser
            {

            					newCompositeNode(grammarAccess.getUsingCommandAccess().getBrowserBrowserEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_browser_1_0=ruleBrowser();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUsingCommandRule());
            					}
            					set(
            						current,
            						"browser",
            						lv_browser_1_0,
            						"org.mde.spec.Spec.Browser");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUsingCommand"


    // $ANTLR start "entryRuleOpenCommand"
    // InternalSpec.g:285:1: entryRuleOpenCommand returns [EObject current=null] : iv_ruleOpenCommand= ruleOpenCommand EOF ;
    public final EObject entryRuleOpenCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenCommand = null;


        try {
            // InternalSpec.g:285:52: (iv_ruleOpenCommand= ruleOpenCommand EOF )
            // InternalSpec.g:286:2: iv_ruleOpenCommand= ruleOpenCommand EOF
            {
             newCompositeNode(grammarAccess.getOpenCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpenCommand=ruleOpenCommand();

            state._fsp--;

             current =iv_ruleOpenCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpenCommand"


    // $ANTLR start "ruleOpenCommand"
    // InternalSpec.g:292:1: ruleOpenCommand returns [EObject current=null] : ( () ( (lv_name_1_0= 'Open' ) ) ( ( (lv_val_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleOpenCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_val_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSpec.g:298:2: ( ( () ( (lv_name_1_0= 'Open' ) ) ( ( (lv_val_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalSpec.g:299:2: ( () ( (lv_name_1_0= 'Open' ) ) ( ( (lv_val_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalSpec.g:299:2: ( () ( (lv_name_1_0= 'Open' ) ) ( ( (lv_val_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalSpec.g:300:3: () ( (lv_name_1_0= 'Open' ) ) ( ( (lv_val_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalSpec.g:300:3: ()
            // InternalSpec.g:301:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpenCommandAccess().getOpenCommandAction_0(),
            					current);
            			

            }

            // InternalSpec.g:307:3: ( (lv_name_1_0= 'Open' ) )
            // InternalSpec.g:308:4: (lv_name_1_0= 'Open' )
            {
            // InternalSpec.g:308:4: (lv_name_1_0= 'Open' )
            // InternalSpec.g:309:5: lv_name_1_0= 'Open'
            {
            lv_name_1_0=(Token)match(input,13,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOpenCommandAccess().getNameOpenKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpenCommandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "Open");
            				

            }


            }

            // InternalSpec.g:321:3: ( ( (lv_val_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpec.g:322:4: ( (lv_val_2_0= RULE_STRING ) )
                    {
                    // InternalSpec.g:322:4: ( (lv_val_2_0= RULE_STRING ) )
                    // InternalSpec.g:323:5: (lv_val_2_0= RULE_STRING )
                    {
                    // InternalSpec.g:323:5: (lv_val_2_0= RULE_STRING )
                    // InternalSpec.g:324:6: lv_val_2_0= RULE_STRING
                    {
                    lv_val_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_val_2_0, grammarAccess.getOpenCommandAccess().getValSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpenCommandRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:341:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalSpec.g:341:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSpec.g:342:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSpec.g:342:5: (otherlv_3= RULE_ID )
                    // InternalSpec.g:343:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpenCommandRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getOpenCommandAccess().getVarVarDeclarationCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpenCommand"


    // $ANTLR start "entryRuleClickCommand"
    // InternalSpec.g:359:1: entryRuleClickCommand returns [EObject current=null] : iv_ruleClickCommand= ruleClickCommand EOF ;
    public final EObject entryRuleClickCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickCommand = null;


        try {
            // InternalSpec.g:359:53: (iv_ruleClickCommand= ruleClickCommand EOF )
            // InternalSpec.g:360:2: iv_ruleClickCommand= ruleClickCommand EOF
            {
             newCompositeNode(grammarAccess.getClickCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickCommand=ruleClickCommand();

            state._fsp--;

             current =iv_ruleClickCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClickCommand"


    // $ANTLR start "ruleClickCommand"
    // InternalSpec.g:366:1: ruleClickCommand returns [EObject current=null] : ( ( (lv_name_0_0= 'Click' ) ) ( (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) ) | (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) ) ) ) ;
    public final EObject ruleClickCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_selector_2_0 = null;

        EObject lv_point_4_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:372:2: ( ( ( (lv_name_0_0= 'Click' ) ) ( (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) ) | (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) ) ) ) )
            // InternalSpec.g:373:2: ( ( (lv_name_0_0= 'Click' ) ) ( (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) ) | (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) ) ) )
            {
            // InternalSpec.g:373:2: ( ( (lv_name_0_0= 'Click' ) ) ( (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) ) | (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) ) ) )
            // InternalSpec.g:374:3: ( (lv_name_0_0= 'Click' ) ) ( (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) ) | (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) ) )
            {
            // InternalSpec.g:374:3: ( (lv_name_0_0= 'Click' ) )
            // InternalSpec.g:375:4: (lv_name_0_0= 'Click' )
            {
            // InternalSpec.g:375:4: (lv_name_0_0= 'Click' )
            // InternalSpec.g:376:5: lv_name_0_0= 'Click'
            {
            lv_name_0_0=(Token)match(input,14,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getClickCommandAccess().getNameClickKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickCommandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Click");
            				

            }


            }

            // InternalSpec.g:388:3: ( (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) ) | (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSpec.g:389:4: (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:389:4: (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) )
                    // InternalSpec.g:390:5: otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_7); 

                    					newLeafNode(otherlv_1, grammarAccess.getClickCommandAccess().getOnKeyword_1_0_0());
                    				
                    // InternalSpec.g:394:5: ( (lv_selector_2_0= ruleSelector ) )
                    // InternalSpec.g:395:6: (lv_selector_2_0= ruleSelector )
                    {
                    // InternalSpec.g:395:6: (lv_selector_2_0= ruleSelector )
                    // InternalSpec.g:396:7: lv_selector_2_0= ruleSelector
                    {

                    							newCompositeNode(grammarAccess.getClickCommandAccess().getSelectorSelectorParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_selector_2_0=ruleSelector();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClickCommandRule());
                    							}
                    							set(
                    								current,
                    								"selector",
                    								lv_selector_2_0,
                    								"org.mde.spec.Spec.Selector");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:415:4: (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) )
                    {
                    // InternalSpec.g:415:4: (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) )
                    // InternalSpec.g:416:5: otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    					newLeafNode(otherlv_3, grammarAccess.getClickCommandAccess().getAtKeyword_1_1_0());
                    				
                    // InternalSpec.g:420:5: ( (lv_point_4_0= rulePoint ) )
                    // InternalSpec.g:421:6: (lv_point_4_0= rulePoint )
                    {
                    // InternalSpec.g:421:6: (lv_point_4_0= rulePoint )
                    // InternalSpec.g:422:7: lv_point_4_0= rulePoint
                    {

                    							newCompositeNode(grammarAccess.getClickCommandAccess().getPointPointParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_point_4_0=rulePoint();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClickCommandRule());
                    							}
                    							set(
                    								current,
                    								"point",
                    								lv_point_4_0,
                    								"org.mde.spec.Spec.Point");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClickCommand"


    // $ANTLR start "entryRuleSelectCommand"
    // InternalSpec.g:445:1: entryRuleSelectCommand returns [EObject current=null] : iv_ruleSelectCommand= ruleSelectCommand EOF ;
    public final EObject entryRuleSelectCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCommand = null;


        try {
            // InternalSpec.g:445:54: (iv_ruleSelectCommand= ruleSelectCommand EOF )
            // InternalSpec.g:446:2: iv_ruleSelectCommand= ruleSelectCommand EOF
            {
             newCompositeNode(grammarAccess.getSelectCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectCommand=ruleSelectCommand();

            state._fsp--;

             current =iv_ruleSelectCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectCommand"


    // $ANTLR start "ruleSelectCommand"
    // InternalSpec.g:452:1: ruleSelectCommand returns [EObject current=null] : ( ( ( (lv_name_0_0= 'Within' ) ) ( (lv_value_1_0= ruleSelector ) ) ) | ( ( (lv_name_2_0= 'Select' ) ) (otherlv_3= 'visible' )? ( (lv_value_4_0= ruleSelector ) ) ) ) ;
    public final EObject ruleSelectCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:458:2: ( ( ( ( (lv_name_0_0= 'Within' ) ) ( (lv_value_1_0= ruleSelector ) ) ) | ( ( (lv_name_2_0= 'Select' ) ) (otherlv_3= 'visible' )? ( (lv_value_4_0= ruleSelector ) ) ) ) )
            // InternalSpec.g:459:2: ( ( ( (lv_name_0_0= 'Within' ) ) ( (lv_value_1_0= ruleSelector ) ) ) | ( ( (lv_name_2_0= 'Select' ) ) (otherlv_3= 'visible' )? ( (lv_value_4_0= ruleSelector ) ) ) )
            {
            // InternalSpec.g:459:2: ( ( ( (lv_name_0_0= 'Within' ) ) ( (lv_value_1_0= ruleSelector ) ) ) | ( ( (lv_name_2_0= 'Select' ) ) (otherlv_3= 'visible' )? ( (lv_value_4_0= ruleSelector ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpec.g:460:3: ( ( (lv_name_0_0= 'Within' ) ) ( (lv_value_1_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:460:3: ( ( (lv_name_0_0= 'Within' ) ) ( (lv_value_1_0= ruleSelector ) ) )
                    // InternalSpec.g:461:4: ( (lv_name_0_0= 'Within' ) ) ( (lv_value_1_0= ruleSelector ) )
                    {
                    // InternalSpec.g:461:4: ( (lv_name_0_0= 'Within' ) )
                    // InternalSpec.g:462:5: (lv_name_0_0= 'Within' )
                    {
                    // InternalSpec.g:462:5: (lv_name_0_0= 'Within' )
                    // InternalSpec.g:463:6: lv_name_0_0= 'Within'
                    {
                    lv_name_0_0=(Token)match(input,17,FOLLOW_7); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getSelectCommandAccess().getNameWithinKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectCommandRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_0, "Within");
                    					

                    }


                    }

                    // InternalSpec.g:475:4: ( (lv_value_1_0= ruleSelector ) )
                    // InternalSpec.g:476:5: (lv_value_1_0= ruleSelector )
                    {
                    // InternalSpec.g:476:5: (lv_value_1_0= ruleSelector )
                    // InternalSpec.g:477:6: lv_value_1_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getSelectCommandAccess().getValueSelectorParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectCommandRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.mde.spec.Spec.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:496:3: ( ( (lv_name_2_0= 'Select' ) ) (otherlv_3= 'visible' )? ( (lv_value_4_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:496:3: ( ( (lv_name_2_0= 'Select' ) ) (otherlv_3= 'visible' )? ( (lv_value_4_0= ruleSelector ) ) )
                    // InternalSpec.g:497:4: ( (lv_name_2_0= 'Select' ) ) (otherlv_3= 'visible' )? ( (lv_value_4_0= ruleSelector ) )
                    {
                    // InternalSpec.g:497:4: ( (lv_name_2_0= 'Select' ) )
                    // InternalSpec.g:498:5: (lv_name_2_0= 'Select' )
                    {
                    // InternalSpec.g:498:5: (lv_name_2_0= 'Select' )
                    // InternalSpec.g:499:6: lv_name_2_0= 'Select'
                    {
                    lv_name_2_0=(Token)match(input,18,FOLLOW_9); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getSelectCommandAccess().getNameSelectKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectCommandRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_2_0, "Select");
                    					

                    }


                    }

                    // InternalSpec.g:511:4: (otherlv_3= 'visible' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==19) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSpec.g:512:5: otherlv_3= 'visible'
                            {
                            otherlv_3=(Token)match(input,19,FOLLOW_7); 

                            					newLeafNode(otherlv_3, grammarAccess.getSelectCommandAccess().getVisibleKeyword_1_1());
                            				

                            }
                            break;

                    }

                    // InternalSpec.g:517:4: ( (lv_value_4_0= ruleSelector ) )
                    // InternalSpec.g:518:5: (lv_value_4_0= ruleSelector )
                    {
                    // InternalSpec.g:518:5: (lv_value_4_0= ruleSelector )
                    // InternalSpec.g:519:6: lv_value_4_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getSelectCommandAccess().getValueSelectorParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectCommandRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.mde.spec.Spec.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectCommand"


    // $ANTLR start "entryRuleSelector"
    // InternalSpec.g:541:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalSpec.g:541:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalSpec.g:542:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalSpec.g:548:1: ruleSelector returns [EObject current=null] : ( ( (lv_type_0_0= ruleElementType ) )? ( ( (otherlv_1= RULE_ID ) ) | ( (lv_val_2_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_val_2_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:554:2: ( ( ( (lv_type_0_0= ruleElementType ) )? ( ( (otherlv_1= RULE_ID ) ) | ( (lv_val_2_0= RULE_STRING ) ) ) ) )
            // InternalSpec.g:555:2: ( ( (lv_type_0_0= ruleElementType ) )? ( ( (otherlv_1= RULE_ID ) ) | ( (lv_val_2_0= RULE_STRING ) ) ) )
            {
            // InternalSpec.g:555:2: ( ( (lv_type_0_0= ruleElementType ) )? ( ( (otherlv_1= RULE_ID ) ) | ( (lv_val_2_0= RULE_STRING ) ) ) )
            // InternalSpec.g:556:3: ( (lv_type_0_0= ruleElementType ) )? ( ( (otherlv_1= RULE_ID ) ) | ( (lv_val_2_0= RULE_STRING ) ) )
            {
            // InternalSpec.g:556:3: ( (lv_type_0_0= ruleElementType ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=41 && LA7_0<=45)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSpec.g:557:4: (lv_type_0_0= ruleElementType )
                    {
                    // InternalSpec.g:557:4: (lv_type_0_0= ruleElementType )
                    // InternalSpec.g:558:5: lv_type_0_0= ruleElementType
                    {

                    					newCompositeNode(grammarAccess.getSelectorAccess().getTypeElementTypeEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_type_0_0=ruleElementType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectorRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_0,
                    						"org.mde.spec.Spec.ElementType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSpec.g:575:3: ( ( (otherlv_1= RULE_ID ) ) | ( (lv_val_2_0= RULE_STRING ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpec.g:576:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalSpec.g:576:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSpec.g:577:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSpec.g:577:5: (otherlv_1= RULE_ID )
                    // InternalSpec.g:578:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectorRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getSelectorAccess().getVarVarDeclarationCrossReference_1_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:590:4: ( (lv_val_2_0= RULE_STRING ) )
                    {
                    // InternalSpec.g:590:4: ( (lv_val_2_0= RULE_STRING ) )
                    // InternalSpec.g:591:5: (lv_val_2_0= RULE_STRING )
                    {
                    // InternalSpec.g:591:5: (lv_val_2_0= RULE_STRING )
                    // InternalSpec.g:592:6: lv_val_2_0= RULE_STRING
                    {
                    lv_val_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_val_2_0, grammarAccess.getSelectorAccess().getValSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRulePropertyCommand"
    // InternalSpec.g:613:1: entryRulePropertyCommand returns [EObject current=null] : iv_rulePropertyCommand= rulePropertyCommand EOF ;
    public final EObject entryRulePropertyCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCommand = null;


        try {
            // InternalSpec.g:613:56: (iv_rulePropertyCommand= rulePropertyCommand EOF )
            // InternalSpec.g:614:2: iv_rulePropertyCommand= rulePropertyCommand EOF
            {
             newCompositeNode(grammarAccess.getPropertyCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyCommand=rulePropertyCommand();

            state._fsp--;

             current =iv_rulePropertyCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyCommand"


    // $ANTLR start "rulePropertyCommand"
    // InternalSpec.g:620:1: rulePropertyCommand returns [EObject current=null] : ( ( (lv_name_0_0= 'Property' ) ) ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( ( (lv_val_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject rulePropertyCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_val_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_prop_1_0 = null;

        Enumerator lv_cond_2_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:626:2: ( ( ( (lv_name_0_0= 'Property' ) ) ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( ( (lv_val_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalSpec.g:627:2: ( ( (lv_name_0_0= 'Property' ) ) ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( ( (lv_val_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalSpec.g:627:2: ( ( (lv_name_0_0= 'Property' ) ) ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( ( (lv_val_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            // InternalSpec.g:628:3: ( (lv_name_0_0= 'Property' ) ) ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( ( (lv_val_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalSpec.g:628:3: ( (lv_name_0_0= 'Property' ) )
            // InternalSpec.g:629:4: (lv_name_0_0= 'Property' )
            {
            // InternalSpec.g:629:4: (lv_name_0_0= 'Property' )
            // InternalSpec.g:630:5: lv_name_0_0= 'Property'
            {
            lv_name_0_0=(Token)match(input,20,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPropertyCommandAccess().getNamePropertyKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyCommandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Property");
            				

            }


            }

            // InternalSpec.g:642:3: ( (lv_prop_1_0= ruleProperty ) )
            // InternalSpec.g:643:4: (lv_prop_1_0= ruleProperty )
            {
            // InternalSpec.g:643:4: (lv_prop_1_0= ruleProperty )
            // InternalSpec.g:644:5: lv_prop_1_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getPropertyCommandAccess().getPropPropertyEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_prop_1_0=ruleProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyCommandRule());
            					}
            					set(
            						current,
            						"prop",
            						lv_prop_1_0,
            						"org.mde.spec.Spec.Property");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpec.g:661:3: ( (lv_cond_2_0= ruleCondition ) )
            // InternalSpec.g:662:4: (lv_cond_2_0= ruleCondition )
            {
            // InternalSpec.g:662:4: (lv_cond_2_0= ruleCondition )
            // InternalSpec.g:663:5: lv_cond_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getPropertyCommandAccess().getCondConditionEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_cond_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyCommandRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_2_0,
            						"org.mde.spec.Spec.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpec.g:680:3: ( ( (lv_val_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpec.g:681:4: ( (lv_val_3_0= RULE_STRING ) )
                    {
                    // InternalSpec.g:681:4: ( (lv_val_3_0= RULE_STRING ) )
                    // InternalSpec.g:682:5: (lv_val_3_0= RULE_STRING )
                    {
                    // InternalSpec.g:682:5: (lv_val_3_0= RULE_STRING )
                    // InternalSpec.g:683:6: lv_val_3_0= RULE_STRING
                    {
                    lv_val_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_val_3_0, grammarAccess.getPropertyCommandAccess().getValSTRINGTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyCommandRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:700:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalSpec.g:700:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSpec.g:701:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSpec.g:701:5: (otherlv_4= RULE_ID )
                    // InternalSpec.g:702:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyCommandRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getPropertyCommandAccess().getVarVarDeclarationCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyCommand"


    // $ANTLR start "entryRuleTypeCommand"
    // InternalSpec.g:718:1: entryRuleTypeCommand returns [EObject current=null] : iv_ruleTypeCommand= ruleTypeCommand EOF ;
    public final EObject entryRuleTypeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCommand = null;


        try {
            // InternalSpec.g:718:52: (iv_ruleTypeCommand= ruleTypeCommand EOF )
            // InternalSpec.g:719:2: iv_ruleTypeCommand= ruleTypeCommand EOF
            {
             newCompositeNode(grammarAccess.getTypeCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeCommand=ruleTypeCommand();

            state._fsp--;

             current =iv_ruleTypeCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeCommand"


    // $ANTLR start "ruleTypeCommand"
    // InternalSpec.g:725:1: ruleTypeCommand returns [EObject current=null] : ( ( (lv_name_0_0= 'Type' ) ) ( ( (lv_str_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleTypeCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_str_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSpec.g:731:2: ( ( ( (lv_name_0_0= 'Type' ) ) ( ( (lv_str_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalSpec.g:732:2: ( ( (lv_name_0_0= 'Type' ) ) ( ( (lv_str_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalSpec.g:732:2: ( ( (lv_name_0_0= 'Type' ) ) ( ( (lv_str_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalSpec.g:733:3: ( (lv_name_0_0= 'Type' ) ) ( ( (lv_str_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalSpec.g:733:3: ( (lv_name_0_0= 'Type' ) )
            // InternalSpec.g:734:4: (lv_name_0_0= 'Type' )
            {
            // InternalSpec.g:734:4: (lv_name_0_0= 'Type' )
            // InternalSpec.g:735:5: lv_name_0_0= 'Type'
            {
            lv_name_0_0=(Token)match(input,21,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTypeCommandAccess().getNameTypeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeCommandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Type");
            				

            }


            }

            // InternalSpec.g:747:3: ( ( (lv_str_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpec.g:748:4: ( (lv_str_1_0= RULE_STRING ) )
                    {
                    // InternalSpec.g:748:4: ( (lv_str_1_0= RULE_STRING ) )
                    // InternalSpec.g:749:5: (lv_str_1_0= RULE_STRING )
                    {
                    // InternalSpec.g:749:5: (lv_str_1_0= RULE_STRING )
                    // InternalSpec.g:750:6: lv_str_1_0= RULE_STRING
                    {
                    lv_str_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_str_1_0, grammarAccess.getTypeCommandAccess().getStrSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeCommandRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"str",
                    							lv_str_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:767:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalSpec.g:767:4: ( (otherlv_2= RULE_ID ) )
                    // InternalSpec.g:768:5: (otherlv_2= RULE_ID )
                    {
                    // InternalSpec.g:768:5: (otherlv_2= RULE_ID )
                    // InternalSpec.g:769:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeCommandRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getTypeCommandAccess().getVarVarDeclarationCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeCommand"


    // $ANTLR start "entryRuleSleepCommand"
    // InternalSpec.g:785:1: entryRuleSleepCommand returns [EObject current=null] : iv_ruleSleepCommand= ruleSleepCommand EOF ;
    public final EObject entryRuleSleepCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSleepCommand = null;


        try {
            // InternalSpec.g:785:53: (iv_ruleSleepCommand= ruleSleepCommand EOF )
            // InternalSpec.g:786:2: iv_ruleSleepCommand= ruleSleepCommand EOF
            {
             newCompositeNode(grammarAccess.getSleepCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSleepCommand=ruleSleepCommand();

            state._fsp--;

             current =iv_ruleSleepCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSleepCommand"


    // $ANTLR start "ruleSleepCommand"
    // InternalSpec.g:792:1: ruleSleepCommand returns [EObject current=null] : ( ( (lv_name_0_0= 'Sleep' ) ) otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) ) ;
    public final EObject ruleSleepCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_time_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSpec.g:798:2: ( ( ( (lv_name_0_0= 'Sleep' ) ) otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) ) )
            // InternalSpec.g:799:2: ( ( (lv_name_0_0= 'Sleep' ) ) otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) )
            {
            // InternalSpec.g:799:2: ( ( (lv_name_0_0= 'Sleep' ) ) otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) )
            // InternalSpec.g:800:3: ( (lv_name_0_0= 'Sleep' ) ) otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' )
            {
            // InternalSpec.g:800:3: ( (lv_name_0_0= 'Sleep' ) )
            // InternalSpec.g:801:4: (lv_name_0_0= 'Sleep' )
            {
            // InternalSpec.g:801:4: (lv_name_0_0= 'Sleep' )
            // InternalSpec.g:802:5: lv_name_0_0= 'Sleep'
            {
            lv_name_0_0=(Token)match(input,22,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSleepCommandAccess().getNameSleepKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSleepCommandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Sleep");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSleepCommandAccess().getForKeyword_1());
            		
            // InternalSpec.g:818:3: ( (lv_time_2_0= RULE_INT ) )
            // InternalSpec.g:819:4: (lv_time_2_0= RULE_INT )
            {
            // InternalSpec.g:819:4: (lv_time_2_0= RULE_INT )
            // InternalSpec.g:820:5: lv_time_2_0= RULE_INT
            {
            lv_time_2_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_time_2_0, grammarAccess.getSleepCommandAccess().getTimeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSleepCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSpec.g:836:3: (otherlv_3= 'second' | otherlv_4= 'seconds' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpec.g:837:4: otherlv_3= 'second'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSpec.g:842:4: otherlv_4= 'seconds'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSleepCommandAccess().getSecondsKeyword_3_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSleepCommand"


    // $ANTLR start "entryRulePoint"
    // InternalSpec.g:851:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalSpec.g:851:46: (iv_rulePoint= rulePoint EOF )
            // InternalSpec.g:852:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalSpec.g:858:1: rulePoint returns [EObject current=null] : (otherlv_0= '{' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= '}' ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSpec.g:864:2: ( (otherlv_0= '{' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= '}' ) )
            // InternalSpec.g:865:2: (otherlv_0= '{' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= '}' )
            {
            // InternalSpec.g:865:2: (otherlv_0= '{' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= '}' )
            // InternalSpec.g:866:3: otherlv_0= '{' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPointAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalSpec.g:870:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalSpec.g:871:4: (lv_x_1_0= RULE_INT )
            {
            // InternalSpec.g:871:4: (lv_x_1_0= RULE_INT )
            // InternalSpec.g:872:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_x_1_0, grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPointAccess().getCommaKeyword_2());
            		
            // InternalSpec.g:892:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalSpec.g:893:4: (lv_y_3_0= RULE_INT )
            {
            // InternalSpec.g:893:4: (lv_y_3_0= RULE_INT )
            // InternalSpec.g:894:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_y_3_0, grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPointAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleLoopCommand"
    // InternalSpec.g:918:1: entryRuleLoopCommand returns [EObject current=null] : iv_ruleLoopCommand= ruleLoopCommand EOF ;
    public final EObject entryRuleLoopCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopCommand = null;


        try {
            // InternalSpec.g:918:52: (iv_ruleLoopCommand= ruleLoopCommand EOF )
            // InternalSpec.g:919:2: iv_ruleLoopCommand= ruleLoopCommand EOF
            {
             newCompositeNode(grammarAccess.getLoopCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoopCommand=ruleLoopCommand();

            state._fsp--;

             current =iv_ruleLoopCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoopCommand"


    // $ANTLR start "ruleLoopCommand"
    // InternalSpec.g:925:1: ruleLoopCommand returns [EObject current=null] : (otherlv_0= 'Perform' ( (lv_times_1_0= RULE_INT ) ) otherlv_2= 'times' otherlv_3= ':' ( (lv_command_4_0= ruleCommand ) )* otherlv_5= '\\n\\n' ) ;
    public final EObject ruleLoopCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_times_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_command_4_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:931:2: ( (otherlv_0= 'Perform' ( (lv_times_1_0= RULE_INT ) ) otherlv_2= 'times' otherlv_3= ':' ( (lv_command_4_0= ruleCommand ) )* otherlv_5= '\\n\\n' ) )
            // InternalSpec.g:932:2: (otherlv_0= 'Perform' ( (lv_times_1_0= RULE_INT ) ) otherlv_2= 'times' otherlv_3= ':' ( (lv_command_4_0= ruleCommand ) )* otherlv_5= '\\n\\n' )
            {
            // InternalSpec.g:932:2: (otherlv_0= 'Perform' ( (lv_times_1_0= RULE_INT ) ) otherlv_2= 'times' otherlv_3= ':' ( (lv_command_4_0= ruleCommand ) )* otherlv_5= '\\n\\n' )
            // InternalSpec.g:933:3: otherlv_0= 'Perform' ( (lv_times_1_0= RULE_INT ) ) otherlv_2= 'times' otherlv_3= ':' ( (lv_command_4_0= ruleCommand ) )* otherlv_5= '\\n\\n'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopCommandAccess().getPerformKeyword_0());
            		
            // InternalSpec.g:937:3: ( (lv_times_1_0= RULE_INT ) )
            // InternalSpec.g:938:4: (lv_times_1_0= RULE_INT )
            {
            // InternalSpec.g:938:4: (lv_times_1_0= RULE_INT )
            // InternalSpec.g:939:5: lv_times_1_0= RULE_INT
            {
            lv_times_1_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_times_1_0, grammarAccess.getLoopCommandAccess().getTimesINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoopCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"times",
            						lv_times_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopCommandAccess().getTimesKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopCommandAccess().getColonKeyword_3());
            		
            // InternalSpec.g:963:3: ( (lv_command_4_0= ruleCommand ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_SL_COMMENT && LA12_0<=RULE_CUSTOM_COMMAND)||(LA12_0>=12 && LA12_0<=14)||(LA12_0>=17 && LA12_0<=18)||(LA12_0>=20 && LA12_0<=22)||LA12_0==29||LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSpec.g:964:4: (lv_command_4_0= ruleCommand )
            	    {
            	    // InternalSpec.g:964:4: (lv_command_4_0= ruleCommand )
            	    // InternalSpec.g:965:5: lv_command_4_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getLoopCommandAccess().getCommandCommandParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_command_4_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopCommandRule());
            	    					}
            	    					add(
            	    						current,
            	    						"command",
            	    						lv_command_4_0,
            	    						"org.mde.spec.Spec.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopCommandAccess().getControl000aControl000aKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoopCommand"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalSpec.g:990:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalSpec.g:990:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalSpec.g:991:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;

             current =iv_ruleVarDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalSpec.g:997:1: ruleVarDeclaration returns [EObject current=null] : (otherlv_0= 'Store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalSpec.g:1003:2: ( (otherlv_0= 'Store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalSpec.g:1004:2: (otherlv_0= 'Store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalSpec.g:1004:2: (otherlv_0= 'Store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalSpec.g:1005:3: otherlv_0= 'Store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getVarDeclarationAccess().getStoreKeyword_0());
            		
            // InternalSpec.g:1009:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpec.g:1010:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpec.g:1010:4: (lv_name_1_0= RULE_ID )
            // InternalSpec.g:1011:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getVarDeclarationAccess().getAsKeyword_2());
            		
            // InternalSpec.g:1031:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalSpec.g:1032:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalSpec.g:1032:4: (lv_value_3_0= RULE_STRING )
            // InternalSpec.g:1033:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getVarDeclarationAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "ruleBrowser"
    // InternalSpec.g:1053:1: ruleBrowser returns [Enumerator current=null] : ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) | (enumLiteral_2= 'Explorer' ) | (enumLiteral_3= 'Edge' ) | (enumLiteral_4= 'Opera' ) | (enumLiteral_5= 'Safari' ) ) ;
    public final Enumerator ruleBrowser() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalSpec.g:1059:2: ( ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) | (enumLiteral_2= 'Explorer' ) | (enumLiteral_3= 'Edge' ) | (enumLiteral_4= 'Opera' ) | (enumLiteral_5= 'Safari' ) ) )
            // InternalSpec.g:1060:2: ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) | (enumLiteral_2= 'Explorer' ) | (enumLiteral_3= 'Edge' ) | (enumLiteral_4= 'Opera' ) | (enumLiteral_5= 'Safari' ) )
            {
            // InternalSpec.g:1060:2: ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) | (enumLiteral_2= 'Explorer' ) | (enumLiteral_3= 'Edge' ) | (enumLiteral_4= 'Opera' ) | (enumLiteral_5= 'Safari' ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt13=1;
                }
                break;
            case 36:
                {
                alt13=2;
                }
                break;
            case 37:
                {
                alt13=3;
                }
                break;
            case 38:
                {
                alt13=4;
                }
                break;
            case 39:
                {
                alt13=5;
                }
                break;
            case 40:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSpec.g:1061:3: (enumLiteral_0= 'Chrome' )
                    {
                    // InternalSpec.g:1061:3: (enumLiteral_0= 'Chrome' )
                    // InternalSpec.g:1062:4: enumLiteral_0= 'Chrome'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getChromeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBrowserAccess().getChromeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:1069:3: (enumLiteral_1= 'Firefox' )
                    {
                    // InternalSpec.g:1069:3: (enumLiteral_1= 'Firefox' )
                    // InternalSpec.g:1070:4: enumLiteral_1= 'Firefox'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getFirefoxEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBrowserAccess().getFirefoxEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:1077:3: (enumLiteral_2= 'Explorer' )
                    {
                    // InternalSpec.g:1077:3: (enumLiteral_2= 'Explorer' )
                    // InternalSpec.g:1078:4: enumLiteral_2= 'Explorer'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getExplorerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBrowserAccess().getExplorerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:1085:3: (enumLiteral_3= 'Edge' )
                    {
                    // InternalSpec.g:1085:3: (enumLiteral_3= 'Edge' )
                    // InternalSpec.g:1086:4: enumLiteral_3= 'Edge'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getEdgeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBrowserAccess().getEdgeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:1093:3: (enumLiteral_4= 'Opera' )
                    {
                    // InternalSpec.g:1093:3: (enumLiteral_4= 'Opera' )
                    // InternalSpec.g:1094:4: enumLiteral_4= 'Opera'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getOperaEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBrowserAccess().getOperaEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSpec.g:1101:3: (enumLiteral_5= 'Safari' )
                    {
                    // InternalSpec.g:1101:3: (enumLiteral_5= 'Safari' )
                    // InternalSpec.g:1102:4: enumLiteral_5= 'Safari'
                    {
                    enumLiteral_5=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getSafariEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBrowserAccess().getSafariEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrowser"


    // $ANTLR start "ruleElementType"
    // InternalSpec.g:1112:1: ruleElementType returns [Enumerator current=null] : ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) ) ;
    public final Enumerator ruleElementType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSpec.g:1118:2: ( ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) ) )
            // InternalSpec.g:1119:2: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) )
            {
            // InternalSpec.g:1119:2: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt14=1;
                }
                break;
            case 42:
                {
                alt14=2;
                }
                break;
            case 43:
                {
                alt14=3;
                }
                break;
            case 44:
                {
                alt14=4;
                }
                break;
            case 45:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSpec.g:1120:3: (enumLiteral_0= 'button' )
                    {
                    // InternalSpec.g:1120:3: (enumLiteral_0= 'button' )
                    // InternalSpec.g:1121:4: enumLiteral_0= 'button'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:1128:3: (enumLiteral_1= 'element' )
                    {
                    // InternalSpec.g:1128:3: (enumLiteral_1= 'element' )
                    // InternalSpec.g:1129:4: enumLiteral_1= 'element'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:1136:3: (enumLiteral_2= 'link' )
                    {
                    // InternalSpec.g:1136:3: (enumLiteral_2= 'link' )
                    // InternalSpec.g:1137:4: enumLiteral_2= 'link'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:1144:3: (enumLiteral_3= 'input' )
                    {
                    // InternalSpec.g:1144:3: (enumLiteral_3= 'input' )
                    // InternalSpec.g:1145:4: enumLiteral_3= 'input'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:1152:3: (enumLiteral_4= 'textarea' )
                    {
                    // InternalSpec.g:1152:3: (enumLiteral_4= 'textarea' )
                    // InternalSpec.g:1153:4: enumLiteral_4= 'textarea'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getTextareaEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getElementTypeAccess().getTextareaEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "ruleProperty"
    // InternalSpec.g:1163:1: ruleProperty returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'value' ) ) ;
    public final Enumerator ruleProperty() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSpec.g:1169:2: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'value' ) ) )
            // InternalSpec.g:1170:2: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'value' ) )
            {
            // InternalSpec.g:1170:2: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'value' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt15=1;
                }
                break;
            case 47:
                {
                alt15=2;
                }
                break;
            case 48:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSpec.g:1171:3: (enumLiteral_0= 'text' )
                    {
                    // InternalSpec.g:1171:3: (enumLiteral_0= 'text' )
                    // InternalSpec.g:1172:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPropertyAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPropertyAccess().getTextEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:1179:3: (enumLiteral_1= 'class' )
                    {
                    // InternalSpec.g:1179:3: (enumLiteral_1= 'class' )
                    // InternalSpec.g:1180:4: enumLiteral_1= 'class'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getPropertyAccess().getClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPropertyAccess().getClassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:1187:3: (enumLiteral_2= 'value' )
                    {
                    // InternalSpec.g:1187:3: (enumLiteral_2= 'value' )
                    // InternalSpec.g:1188:4: enumLiteral_2= 'value'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPropertyAccess().getValueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPropertyAccess().getValueEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "ruleCondition"
    // InternalSpec.g:1198:1: ruleCondition returns [Enumerator current=null] : ( (enumLiteral_0= 'should be' ) | (enumLiteral_1= 'should not be' ) ) ;
    public final Enumerator ruleCondition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSpec.g:1204:2: ( ( (enumLiteral_0= 'should be' ) | (enumLiteral_1= 'should not be' ) ) )
            // InternalSpec.g:1205:2: ( (enumLiteral_0= 'should be' ) | (enumLiteral_1= 'should not be' ) )
            {
            // InternalSpec.g:1205:2: ( (enumLiteral_0= 'should be' ) | (enumLiteral_1= 'should not be' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49) ) {
                alt16=1;
            }
            else if ( (LA16_0==50) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSpec.g:1206:3: (enumLiteral_0= 'should be' )
                    {
                    // InternalSpec.g:1206:3: (enumLiteral_0= 'should be' )
                    // InternalSpec.g:1207:4: enumLiteral_0= 'should be'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getShouldBeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConditionAccess().getShouldBeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:1214:3: (enumLiteral_1= 'should not be' )
                    {
                    // InternalSpec.g:1214:3: (enumLiteral_1= 'should not be' )
                    // InternalSpec.g:1215:4: enumLiteral_1= 'should not be'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getShouldNotBeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConditionAccess().getShouldNotBeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000220767032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000001F800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00003E00000000C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00003E00000800C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000320767030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});

}
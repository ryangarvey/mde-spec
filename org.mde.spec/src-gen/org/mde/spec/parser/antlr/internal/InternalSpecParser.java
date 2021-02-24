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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_CUSTOM_COMMAND", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Open'", "'Click'", "'on'", "'at'", "'Within'", "'Select'", "'visible'", "'Store'", "'as'", "'Remember'", "'Property'", "'text'", "'class'", "'value'", "'should'", "'be'", "'not'", "'Type'", "'Sleep'", "'for'", "'second'", "'seconds'", "'{'", "','", "'}'", "'$'", "'button'", "'element'", "'link'", "'input'", "'textarea'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=4;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_CUSTOM_COMMAND=5;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

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

                if ( ((LA1_0>=RULE_SL_COMMENT && LA1_0<=RULE_CUSTOM_COMMAND)||(LA1_0>=12 && LA1_0<=13)||(LA1_0>=16 && LA1_0<=17)||LA1_0==19||(LA1_0>=21 && LA1_0<=22)||(LA1_0>=29 && LA1_0<=30)) ) {
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
    // InternalSpec.g:108:1: ruleCommand returns [EObject current=null] : (this_OpenCommand_0= ruleOpenCommand | this_ClickCommand_1= ruleClickCommand | this_StoreCommand_2= ruleStoreCommand | this_SelectCommand_3= ruleSelectCommand | this_RememberCommand_4= ruleRememberCommand | this_PropertyCommand_5= rulePropertyCommand | this_TypeCommand_6= ruleTypeCommand | this_SleepCommand_7= ruleSleepCommand | ( (lv_comment_8_0= RULE_SL_COMMENT ) ) | ( (lv_custom_9_0= RULE_CUSTOM_COMMAND ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_comment_8_0=null;
        Token lv_custom_9_0=null;
        EObject this_OpenCommand_0 = null;

        EObject this_ClickCommand_1 = null;

        EObject this_StoreCommand_2 = null;

        EObject this_SelectCommand_3 = null;

        EObject this_RememberCommand_4 = null;

        EObject this_PropertyCommand_5 = null;

        EObject this_TypeCommand_6 = null;

        EObject this_SleepCommand_7 = null;



        	enterRule();

        try {
            // InternalSpec.g:114:2: ( (this_OpenCommand_0= ruleOpenCommand | this_ClickCommand_1= ruleClickCommand | this_StoreCommand_2= ruleStoreCommand | this_SelectCommand_3= ruleSelectCommand | this_RememberCommand_4= ruleRememberCommand | this_PropertyCommand_5= rulePropertyCommand | this_TypeCommand_6= ruleTypeCommand | this_SleepCommand_7= ruleSleepCommand | ( (lv_comment_8_0= RULE_SL_COMMENT ) ) | ( (lv_custom_9_0= RULE_CUSTOM_COMMAND ) ) ) )
            // InternalSpec.g:115:2: (this_OpenCommand_0= ruleOpenCommand | this_ClickCommand_1= ruleClickCommand | this_StoreCommand_2= ruleStoreCommand | this_SelectCommand_3= ruleSelectCommand | this_RememberCommand_4= ruleRememberCommand | this_PropertyCommand_5= rulePropertyCommand | this_TypeCommand_6= ruleTypeCommand | this_SleepCommand_7= ruleSleepCommand | ( (lv_comment_8_0= RULE_SL_COMMENT ) ) | ( (lv_custom_9_0= RULE_CUSTOM_COMMAND ) ) )
            {
            // InternalSpec.g:115:2: (this_OpenCommand_0= ruleOpenCommand | this_ClickCommand_1= ruleClickCommand | this_StoreCommand_2= ruleStoreCommand | this_SelectCommand_3= ruleSelectCommand | this_RememberCommand_4= ruleRememberCommand | this_PropertyCommand_5= rulePropertyCommand | this_TypeCommand_6= ruleTypeCommand | this_SleepCommand_7= ruleSleepCommand | ( (lv_comment_8_0= RULE_SL_COMMENT ) ) | ( (lv_custom_9_0= RULE_CUSTOM_COMMAND ) ) )
            int alt2=10;
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
            case 19:
                {
                alt2=3;
                }
                break;
            case 16:
            case 17:
                {
                alt2=4;
                }
                break;
            case 21:
                {
                alt2=5;
                }
                break;
            case 22:
                {
                alt2=6;
                }
                break;
            case 29:
                {
                alt2=7;
                }
                break;
            case 30:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSpec.g:116:3: this_OpenCommand_0= ruleOpenCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getOpenCommandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpenCommand_0=ruleOpenCommand();

                    state._fsp--;


                    			current = this_OpenCommand_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSpec.g:125:3: this_ClickCommand_1= ruleClickCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getClickCommandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickCommand_1=ruleClickCommand();

                    state._fsp--;


                    			current = this_ClickCommand_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSpec.g:134:3: this_StoreCommand_2= ruleStoreCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getStoreCommandParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StoreCommand_2=ruleStoreCommand();

                    state._fsp--;


                    			current = this_StoreCommand_2;
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
                    // InternalSpec.g:152:3: this_RememberCommand_4= ruleRememberCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRememberCommandParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RememberCommand_4=ruleRememberCommand();

                    state._fsp--;


                    			current = this_RememberCommand_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSpec.g:161:3: this_PropertyCommand_5= rulePropertyCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getPropertyCommandParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyCommand_5=rulePropertyCommand();

                    state._fsp--;


                    			current = this_PropertyCommand_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSpec.g:170:3: this_TypeCommand_6= ruleTypeCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getTypeCommandParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeCommand_6=ruleTypeCommand();

                    state._fsp--;


                    			current = this_TypeCommand_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSpec.g:179:3: this_SleepCommand_7= ruleSleepCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getSleepCommandParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SleepCommand_7=ruleSleepCommand();

                    state._fsp--;


                    			current = this_SleepCommand_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSpec.g:188:3: ( (lv_comment_8_0= RULE_SL_COMMENT ) )
                    {
                    // InternalSpec.g:188:3: ( (lv_comment_8_0= RULE_SL_COMMENT ) )
                    // InternalSpec.g:189:4: (lv_comment_8_0= RULE_SL_COMMENT )
                    {
                    // InternalSpec.g:189:4: (lv_comment_8_0= RULE_SL_COMMENT )
                    // InternalSpec.g:190:5: lv_comment_8_0= RULE_SL_COMMENT
                    {
                    lv_comment_8_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

                    					newLeafNode(lv_comment_8_0, grammarAccess.getCommandAccess().getCommentSL_COMMENTTerminalRuleCall_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCommandRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_8_0,
                    						"org.mde.spec.Spec.SL_COMMENT");
                    				

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalSpec.g:207:3: ( (lv_custom_9_0= RULE_CUSTOM_COMMAND ) )
                    {
                    // InternalSpec.g:207:3: ( (lv_custom_9_0= RULE_CUSTOM_COMMAND ) )
                    // InternalSpec.g:208:4: (lv_custom_9_0= RULE_CUSTOM_COMMAND )
                    {
                    // InternalSpec.g:208:4: (lv_custom_9_0= RULE_CUSTOM_COMMAND )
                    // InternalSpec.g:209:5: lv_custom_9_0= RULE_CUSTOM_COMMAND
                    {
                    lv_custom_9_0=(Token)match(input,RULE_CUSTOM_COMMAND,FOLLOW_2); 

                    					newLeafNode(lv_custom_9_0, grammarAccess.getCommandAccess().getCustomCUSTOM_COMMANDTerminalRuleCall_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCommandRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"custom",
                    						lv_custom_9_0,
                    						"org.mde.spec.Spec.CUSTOM_COMMAND");
                    				

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleOpenCommand"
    // InternalSpec.g:229:1: entryRuleOpenCommand returns [EObject current=null] : iv_ruleOpenCommand= ruleOpenCommand EOF ;
    public final EObject entryRuleOpenCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenCommand = null;


        try {
            // InternalSpec.g:229:52: (iv_ruleOpenCommand= ruleOpenCommand EOF )
            // InternalSpec.g:230:2: iv_ruleOpenCommand= ruleOpenCommand EOF
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
    // InternalSpec.g:236:1: ruleOpenCommand returns [EObject current=null] : ( ( () otherlv_1= 'Open' this_STRING_2= RULE_STRING ) | (otherlv_3= 'Open' ( (lv_var_4_0= ruleVariable ) ) ) ) ;
    public final EObject ruleOpenCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_STRING_2=null;
        Token otherlv_3=null;
        EObject lv_var_4_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:242:2: ( ( ( () otherlv_1= 'Open' this_STRING_2= RULE_STRING ) | (otherlv_3= 'Open' ( (lv_var_4_0= ruleVariable ) ) ) ) )
            // InternalSpec.g:243:2: ( ( () otherlv_1= 'Open' this_STRING_2= RULE_STRING ) | (otherlv_3= 'Open' ( (lv_var_4_0= ruleVariable ) ) ) )
            {
            // InternalSpec.g:243:2: ( ( () otherlv_1= 'Open' this_STRING_2= RULE_STRING ) | (otherlv_3= 'Open' ( (lv_var_4_0= ruleVariable ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==37) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_STRING) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpec.g:244:3: ( () otherlv_1= 'Open' this_STRING_2= RULE_STRING )
                    {
                    // InternalSpec.g:244:3: ( () otherlv_1= 'Open' this_STRING_2= RULE_STRING )
                    // InternalSpec.g:245:4: () otherlv_1= 'Open' this_STRING_2= RULE_STRING
                    {
                    // InternalSpec.g:245:4: ()
                    // InternalSpec.g:246:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOpenCommandAccess().getOpenCommandAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getOpenCommandAccess().getOpenKeyword_0_1());
                    			
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				newLeafNode(this_STRING_2, grammarAccess.getOpenCommandAccess().getSTRINGTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:262:3: (otherlv_3= 'Open' ( (lv_var_4_0= ruleVariable ) ) )
                    {
                    // InternalSpec.g:262:3: (otherlv_3= 'Open' ( (lv_var_4_0= ruleVariable ) ) )
                    // InternalSpec.g:263:4: otherlv_3= 'Open' ( (lv_var_4_0= ruleVariable ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getOpenCommandAccess().getOpenKeyword_1_0());
                    			
                    // InternalSpec.g:267:4: ( (lv_var_4_0= ruleVariable ) )
                    // InternalSpec.g:268:5: (lv_var_4_0= ruleVariable )
                    {
                    // InternalSpec.g:268:5: (lv_var_4_0= ruleVariable )
                    // InternalSpec.g:269:6: lv_var_4_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getOpenCommandAccess().getVarVariableParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_var_4_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpenCommandRule());
                    						}
                    						set(
                    							current,
                    							"var",
                    							lv_var_4_0,
                    							"org.mde.spec.Spec.Variable");
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
    // $ANTLR end "ruleOpenCommand"


    // $ANTLR start "entryRuleClickCommand"
    // InternalSpec.g:291:1: entryRuleClickCommand returns [EObject current=null] : iv_ruleClickCommand= ruleClickCommand EOF ;
    public final EObject entryRuleClickCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickCommand = null;


        try {
            // InternalSpec.g:291:53: (iv_ruleClickCommand= ruleClickCommand EOF )
            // InternalSpec.g:292:2: iv_ruleClickCommand= ruleClickCommand EOF
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
    // InternalSpec.g:298:1: ruleClickCommand returns [EObject current=null] : ( ( (lv_cmd_0_0= 'Click' ) ) | (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) ) | (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) ) ) ;
    public final EObject ruleClickCommand() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_selector_3_0 = null;

        AntlrDatatypeRuleToken lv_point_6_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:304:2: ( ( ( (lv_cmd_0_0= 'Click' ) ) | (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) ) | (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) ) ) )
            // InternalSpec.g:305:2: ( ( (lv_cmd_0_0= 'Click' ) ) | (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) ) | (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) ) )
            {
            // InternalSpec.g:305:2: ( ( (lv_cmd_0_0= 'Click' ) ) | (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) ) | (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    alt4=2;
                    }
                    break;
                case 15:
                    {
                    alt4=3;
                    }
                    break;
                case EOF:
                case RULE_SL_COMMENT:
                case RULE_CUSTOM_COMMAND:
                case 12:
                case 13:
                case 16:
                case 17:
                case 19:
                case 21:
                case 22:
                case 29:
                case 30:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSpec.g:306:3: ( (lv_cmd_0_0= 'Click' ) )
                    {
                    // InternalSpec.g:306:3: ( (lv_cmd_0_0= 'Click' ) )
                    // InternalSpec.g:307:4: (lv_cmd_0_0= 'Click' )
                    {
                    // InternalSpec.g:307:4: (lv_cmd_0_0= 'Click' )
                    // InternalSpec.g:308:5: lv_cmd_0_0= 'Click'
                    {
                    lv_cmd_0_0=(Token)match(input,13,FOLLOW_2); 

                    					newLeafNode(lv_cmd_0_0, grammarAccess.getClickCommandAccess().getCmdClickKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClickCommandRule());
                    					}
                    					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "Click");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:321:3: (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:321:3: (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) )
                    // InternalSpec.g:322:4: otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getClickCommandAccess().getClickKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getClickCommandAccess().getOnKeyword_1_1());
                    			
                    // InternalSpec.g:330:4: ( (lv_selector_3_0= ruleSelector ) )
                    // InternalSpec.g:331:5: (lv_selector_3_0= ruleSelector )
                    {
                    // InternalSpec.g:331:5: (lv_selector_3_0= ruleSelector )
                    // InternalSpec.g:332:6: lv_selector_3_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getClickCommandAccess().getSelectorSelectorParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_selector_3_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClickCommandRule());
                    						}
                    						set(
                    							current,
                    							"selector",
                    							lv_selector_3_0,
                    							"org.mde.spec.Spec.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:351:3: (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) )
                    {
                    // InternalSpec.g:351:3: (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) )
                    // InternalSpec.g:352:4: otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getClickCommandAccess().getClickKeyword_2_0());
                    			
                    otherlv_5=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getClickCommandAccess().getAtKeyword_2_1());
                    			
                    // InternalSpec.g:360:4: ( (lv_point_6_0= rulePoint ) )
                    // InternalSpec.g:361:5: (lv_point_6_0= rulePoint )
                    {
                    // InternalSpec.g:361:5: (lv_point_6_0= rulePoint )
                    // InternalSpec.g:362:6: lv_point_6_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getClickCommandAccess().getPointPointParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_point_6_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClickCommandRule());
                    						}
                    						set(
                    							current,
                    							"point",
                    							lv_point_6_0,
                    							"org.mde.spec.Spec.Point");
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
    // $ANTLR end "ruleClickCommand"


    // $ANTLR start "entryRuleSelectCommand"
    // InternalSpec.g:384:1: entryRuleSelectCommand returns [EObject current=null] : iv_ruleSelectCommand= ruleSelectCommand EOF ;
    public final EObject entryRuleSelectCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCommand = null;


        try {
            // InternalSpec.g:384:54: (iv_ruleSelectCommand= ruleSelectCommand EOF )
            // InternalSpec.g:385:2: iv_ruleSelectCommand= ruleSelectCommand EOF
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
    // InternalSpec.g:391:1: ruleSelectCommand returns [EObject current=null] : ( (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) ) | (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) ) | (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) ) ) ;
    public final EObject ruleSelectCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;

        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:397:2: ( ( (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) ) | (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) ) | (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) ) ) )
            // InternalSpec.g:398:2: ( (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) ) | (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) ) | (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) ) )
            {
            // InternalSpec.g:398:2: ( (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) ) | (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) ) | (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==18) ) {
                    alt5=3;
                }
                else if ( ((LA5_2>=RULE_STRING && LA5_2<=RULE_ID)||(LA5_2>=38 && LA5_2<=42)) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpec.g:399:3: (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:399:3: (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) )
                    // InternalSpec.g:400:4: otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) )
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getSelectCommandAccess().getWithinKeyword_0_0());
                    			
                    // InternalSpec.g:404:4: ( (lv_value_1_0= ruleSelector ) )
                    // InternalSpec.g:405:5: (lv_value_1_0= ruleSelector )
                    {
                    // InternalSpec.g:405:5: (lv_value_1_0= ruleSelector )
                    // InternalSpec.g:406:6: lv_value_1_0= ruleSelector
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
                    // InternalSpec.g:425:3: (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:425:3: (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) )
                    // InternalSpec.g:426:4: otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getSelectCommandAccess().getSelectKeyword_1_0());
                    			
                    // InternalSpec.g:430:4: ( (lv_value_3_0= ruleSelector ) )
                    // InternalSpec.g:431:5: (lv_value_3_0= ruleSelector )
                    {
                    // InternalSpec.g:431:5: (lv_value_3_0= ruleSelector )
                    // InternalSpec.g:432:6: lv_value_3_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getSelectCommandAccess().getValueSelectorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectCommandRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.mde.spec.Spec.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:451:3: (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:451:3: (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) )
                    // InternalSpec.g:452:4: otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getSelectCommandAccess().getSelectKeyword_2_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getSelectCommandAccess().getVisibleKeyword_2_1());
                    			
                    // InternalSpec.g:460:4: ( (lv_value_6_0= ruleSelector ) )
                    // InternalSpec.g:461:5: (lv_value_6_0= ruleSelector )
                    {
                    // InternalSpec.g:461:5: (lv_value_6_0= ruleSelector )
                    // InternalSpec.g:462:6: lv_value_6_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getSelectCommandAccess().getValueSelectorParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_6_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectCommandRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
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
    // InternalSpec.g:484:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalSpec.g:484:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalSpec.g:485:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalSpec.g:491:1: ruleSelector returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_str_1_0= RULE_STRING ) ) | ( ( (lv_type_2_0= ruleElementType ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_type_4_0= ruleElementType ) ) ( (lv_str_5_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_str_1_0=null;
        Token otherlv_3=null;
        Token lv_str_5_0=null;
        Enumerator lv_type_2_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:497:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_str_1_0= RULE_STRING ) ) | ( ( (lv_type_2_0= ruleElementType ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_type_4_0= ruleElementType ) ) ( (lv_str_5_0= RULE_STRING ) ) ) ) )
            // InternalSpec.g:498:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_str_1_0= RULE_STRING ) ) | ( ( (lv_type_2_0= ruleElementType ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_type_4_0= ruleElementType ) ) ( (lv_str_5_0= RULE_STRING ) ) ) )
            {
            // InternalSpec.g:498:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_str_1_0= RULE_STRING ) ) | ( ( (lv_type_2_0= ruleElementType ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_type_4_0= ruleElementType ) ) ( (lv_str_5_0= RULE_STRING ) ) ) )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalSpec.g:499:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalSpec.g:499:3: ( (otherlv_0= RULE_ID ) )
                    // InternalSpec.g:500:4: (otherlv_0= RULE_ID )
                    {
                    // InternalSpec.g:500:4: (otherlv_0= RULE_ID )
                    // InternalSpec.g:501:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSelectorRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getVarVariableCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:513:3: ( (lv_str_1_0= RULE_STRING ) )
                    {
                    // InternalSpec.g:513:3: ( (lv_str_1_0= RULE_STRING ) )
                    // InternalSpec.g:514:4: (lv_str_1_0= RULE_STRING )
                    {
                    // InternalSpec.g:514:4: (lv_str_1_0= RULE_STRING )
                    // InternalSpec.g:515:5: lv_str_1_0= RULE_STRING
                    {
                    lv_str_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_str_1_0, grammarAccess.getSelectorAccess().getStrSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSelectorRule());
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
                case 3 :
                    // InternalSpec.g:532:3: ( ( (lv_type_2_0= ruleElementType ) ) ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalSpec.g:532:3: ( ( (lv_type_2_0= ruleElementType ) ) ( (otherlv_3= RULE_ID ) ) )
                    // InternalSpec.g:533:4: ( (lv_type_2_0= ruleElementType ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalSpec.g:533:4: ( (lv_type_2_0= ruleElementType ) )
                    // InternalSpec.g:534:5: (lv_type_2_0= ruleElementType )
                    {
                    // InternalSpec.g:534:5: (lv_type_2_0= ruleElementType )
                    // InternalSpec.g:535:6: lv_type_2_0= ruleElementType
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getTypeElementTypeEnumRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_type_2_0=ruleElementType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"org.mde.spec.Spec.ElementType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSpec.g:552:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSpec.g:553:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSpec.g:553:5: (otherlv_3= RULE_ID )
                    // InternalSpec.g:554:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectorRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getSelectorAccess().getVarVariableCrossReference_2_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:567:3: ( ( (lv_type_4_0= ruleElementType ) ) ( (lv_str_5_0= RULE_STRING ) ) )
                    {
                    // InternalSpec.g:567:3: ( ( (lv_type_4_0= ruleElementType ) ) ( (lv_str_5_0= RULE_STRING ) ) )
                    // InternalSpec.g:568:4: ( (lv_type_4_0= ruleElementType ) ) ( (lv_str_5_0= RULE_STRING ) )
                    {
                    // InternalSpec.g:568:4: ( (lv_type_4_0= ruleElementType ) )
                    // InternalSpec.g:569:5: (lv_type_4_0= ruleElementType )
                    {
                    // InternalSpec.g:569:5: (lv_type_4_0= ruleElementType )
                    // InternalSpec.g:570:6: lv_type_4_0= ruleElementType
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getTypeElementTypeEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_type_4_0=ruleElementType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.mde.spec.Spec.ElementType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSpec.g:587:4: ( (lv_str_5_0= RULE_STRING ) )
                    // InternalSpec.g:588:5: (lv_str_5_0= RULE_STRING )
                    {
                    // InternalSpec.g:588:5: (lv_str_5_0= RULE_STRING )
                    // InternalSpec.g:589:6: lv_str_5_0= RULE_STRING
                    {
                    lv_str_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_str_5_0, grammarAccess.getSelectorAccess().getStrSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"str",
                    							lv_str_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleStoreCommand"
    // InternalSpec.g:610:1: entryRuleStoreCommand returns [EObject current=null] : iv_ruleStoreCommand= ruleStoreCommand EOF ;
    public final EObject entryRuleStoreCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreCommand = null;


        try {
            // InternalSpec.g:610:53: (iv_ruleStoreCommand= ruleStoreCommand EOF )
            // InternalSpec.g:611:2: iv_ruleStoreCommand= ruleStoreCommand EOF
            {
             newCompositeNode(grammarAccess.getStoreCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStoreCommand=ruleStoreCommand();

            state._fsp--;

             current =iv_ruleStoreCommand; 
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
    // $ANTLR end "entryRuleStoreCommand"


    // $ANTLR start "ruleStoreCommand"
    // InternalSpec.g:617:1: ruleStoreCommand returns [EObject current=null] : (otherlv_0= 'Store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleStoreCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalSpec.g:623:2: ( (otherlv_0= 'Store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalSpec.g:624:2: (otherlv_0= 'Store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalSpec.g:624:2: (otherlv_0= 'Store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalSpec.g:625:3: otherlv_0= 'Store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreCommandAccess().getStoreKeyword_0());
            		
            // InternalSpec.g:629:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpec.g:630:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpec.g:630:4: (lv_name_1_0= RULE_ID )
            // InternalSpec.g:631:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStoreCommandAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreCommandAccess().getAsKeyword_2());
            		
            // InternalSpec.g:651:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalSpec.g:652:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalSpec.g:652:4: (lv_value_3_0= RULE_STRING )
            // InternalSpec.g:653:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getStoreCommandAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreCommandRule());
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
    // $ANTLR end "ruleStoreCommand"


    // $ANTLR start "entryRuleRememberCommand"
    // InternalSpec.g:673:1: entryRuleRememberCommand returns [EObject current=null] : iv_ruleRememberCommand= ruleRememberCommand EOF ;
    public final EObject entryRuleRememberCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRememberCommand = null;


        try {
            // InternalSpec.g:673:56: (iv_ruleRememberCommand= ruleRememberCommand EOF )
            // InternalSpec.g:674:2: iv_ruleRememberCommand= ruleRememberCommand EOF
            {
             newCompositeNode(grammarAccess.getRememberCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRememberCommand=ruleRememberCommand();

            state._fsp--;

             current =iv_ruleRememberCommand; 
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
    // $ANTLR end "entryRuleRememberCommand"


    // $ANTLR start "ruleRememberCommand"
    // InternalSpec.g:680:1: ruleRememberCommand returns [EObject current=null] : (otherlv_0= 'Remember' ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= RULE_ID ) ) ) ;
    public final EObject ruleRememberCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_var_3_0=null;
        AntlrDatatypeRuleToken lv_prop_1_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:686:2: ( (otherlv_0= 'Remember' ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= RULE_ID ) ) ) )
            // InternalSpec.g:687:2: (otherlv_0= 'Remember' ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= RULE_ID ) ) )
            {
            // InternalSpec.g:687:2: (otherlv_0= 'Remember' ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= RULE_ID ) ) )
            // InternalSpec.g:688:3: otherlv_0= 'Remember' ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRememberCommandAccess().getRememberKeyword_0());
            		
            // InternalSpec.g:692:3: ( (lv_prop_1_0= ruleProperty ) )
            // InternalSpec.g:693:4: (lv_prop_1_0= ruleProperty )
            {
            // InternalSpec.g:693:4: (lv_prop_1_0= ruleProperty )
            // InternalSpec.g:694:5: lv_prop_1_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getRememberCommandAccess().getPropPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_prop_1_0=ruleProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRememberCommandRule());
            					}
            					set(
            						current,
            						"prop",
            						lv_prop_1_0,
            						"org.mde.spec.Spec.Property");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRememberCommandAccess().getAsKeyword_2());
            		
            // InternalSpec.g:715:3: ( (lv_var_3_0= RULE_ID ) )
            // InternalSpec.g:716:4: (lv_var_3_0= RULE_ID )
            {
            // InternalSpec.g:716:4: (lv_var_3_0= RULE_ID )
            // InternalSpec.g:717:5: lv_var_3_0= RULE_ID
            {
            lv_var_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_var_3_0, grammarAccess.getRememberCommandAccess().getVarIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRememberCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleRememberCommand"


    // $ANTLR start "entryRulePropertyCommand"
    // InternalSpec.g:737:1: entryRulePropertyCommand returns [EObject current=null] : iv_rulePropertyCommand= rulePropertyCommand EOF ;
    public final EObject entryRulePropertyCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCommand = null;


        try {
            // InternalSpec.g:737:56: (iv_rulePropertyCommand= rulePropertyCommand EOF )
            // InternalSpec.g:738:2: iv_rulePropertyCommand= rulePropertyCommand EOF
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
    // InternalSpec.g:744:1: rulePropertyCommand returns [EObject current=null] : ( (otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= RULE_STRING ) ) ) | (otherlv_4= 'Property' ( (lv_prop_5_0= ruleProperty ) ) ( (lv_cond_6_0= ruleCondition ) ) ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject rulePropertyCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_prop_1_0 = null;

        AntlrDatatypeRuleToken lv_cond_2_0 = null;

        AntlrDatatypeRuleToken lv_prop_5_0 = null;

        AntlrDatatypeRuleToken lv_cond_6_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:750:2: ( ( (otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= RULE_STRING ) ) ) | (otherlv_4= 'Property' ( (lv_prop_5_0= ruleProperty ) ) ( (lv_cond_6_0= ruleCondition ) ) ( (otherlv_7= RULE_ID ) ) ) ) )
            // InternalSpec.g:751:2: ( (otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= RULE_STRING ) ) ) | (otherlv_4= 'Property' ( (lv_prop_5_0= ruleProperty ) ) ( (lv_cond_6_0= ruleCondition ) ) ( (otherlv_7= RULE_ID ) ) ) )
            {
            // InternalSpec.g:751:2: ( (otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= RULE_STRING ) ) ) | (otherlv_4= 'Property' ( (lv_prop_5_0= ruleProperty ) ) ( (lv_cond_6_0= ruleCondition ) ) ( (otherlv_7= RULE_ID ) ) ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalSpec.g:752:3: (otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= RULE_STRING ) ) )
                    {
                    // InternalSpec.g:752:3: (otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= RULE_STRING ) ) )
                    // InternalSpec.g:753:4: otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getPropertyCommandAccess().getPropertyKeyword_0_0());
                    			
                    // InternalSpec.g:757:4: ( (lv_prop_1_0= ruleProperty ) )
                    // InternalSpec.g:758:5: (lv_prop_1_0= ruleProperty )
                    {
                    // InternalSpec.g:758:5: (lv_prop_1_0= ruleProperty )
                    // InternalSpec.g:759:6: lv_prop_1_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getPropertyCommandAccess().getPropPropertyParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalSpec.g:776:4: ( (lv_cond_2_0= ruleCondition ) )
                    // InternalSpec.g:777:5: (lv_cond_2_0= ruleCondition )
                    {
                    // InternalSpec.g:777:5: (lv_cond_2_0= ruleCondition )
                    // InternalSpec.g:778:6: lv_cond_2_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getPropertyCommandAccess().getCondConditionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_4);
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

                    // InternalSpec.g:795:4: ( (lv_val_3_0= RULE_STRING ) )
                    // InternalSpec.g:796:5: (lv_val_3_0= RULE_STRING )
                    {
                    // InternalSpec.g:796:5: (lv_val_3_0= RULE_STRING )
                    // InternalSpec.g:797:6: lv_val_3_0= RULE_STRING
                    {
                    lv_val_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_val_3_0, grammarAccess.getPropertyCommandAccess().getValSTRINGTerminalRuleCall_0_3_0());
                    					

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


                    }
                    break;
                case 2 :
                    // InternalSpec.g:815:3: (otherlv_4= 'Property' ( (lv_prop_5_0= ruleProperty ) ) ( (lv_cond_6_0= ruleCondition ) ) ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalSpec.g:815:3: (otherlv_4= 'Property' ( (lv_prop_5_0= ruleProperty ) ) ( (lv_cond_6_0= ruleCondition ) ) ( (otherlv_7= RULE_ID ) ) )
                    // InternalSpec.g:816:4: otherlv_4= 'Property' ( (lv_prop_5_0= ruleProperty ) ) ( (lv_cond_6_0= ruleCondition ) ) ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getPropertyCommandAccess().getPropertyKeyword_1_0());
                    			
                    // InternalSpec.g:820:4: ( (lv_prop_5_0= ruleProperty ) )
                    // InternalSpec.g:821:5: (lv_prop_5_0= ruleProperty )
                    {
                    // InternalSpec.g:821:5: (lv_prop_5_0= ruleProperty )
                    // InternalSpec.g:822:6: lv_prop_5_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getPropertyCommandAccess().getPropPropertyParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_prop_5_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyCommandRule());
                    						}
                    						set(
                    							current,
                    							"prop",
                    							lv_prop_5_0,
                    							"org.mde.spec.Spec.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSpec.g:839:4: ( (lv_cond_6_0= ruleCondition ) )
                    // InternalSpec.g:840:5: (lv_cond_6_0= ruleCondition )
                    {
                    // InternalSpec.g:840:5: (lv_cond_6_0= ruleCondition )
                    // InternalSpec.g:841:6: lv_cond_6_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getPropertyCommandAccess().getCondConditionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_cond_6_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyCommandRule());
                    						}
                    						set(
                    							current,
                    							"cond",
                    							lv_cond_6_0,
                    							"org.mde.spec.Spec.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSpec.g:858:4: ( (otherlv_7= RULE_ID ) )
                    // InternalSpec.g:859:5: (otherlv_7= RULE_ID )
                    {
                    // InternalSpec.g:859:5: (otherlv_7= RULE_ID )
                    // InternalSpec.g:860:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyCommandRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getPropertyCommandAccess().getVarVariableCrossReference_1_3_0());
                    					

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
    // $ANTLR end "rulePropertyCommand"


    // $ANTLR start "entryRuleProperty"
    // InternalSpec.g:876:1: entryRuleProperty returns [String current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final String entryRuleProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProperty = null;


        try {
            // InternalSpec.g:876:48: (iv_ruleProperty= ruleProperty EOF )
            // InternalSpec.g:877:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty.getText(); 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalSpec.g:883:1: ruleProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'text' | kw= 'class' | kw= 'value' ) ;
    public final AntlrDatatypeRuleToken ruleProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpec.g:889:2: ( (kw= 'text' | kw= 'class' | kw= 'value' ) )
            // InternalSpec.g:890:2: (kw= 'text' | kw= 'class' | kw= 'value' )
            {
            // InternalSpec.g:890:2: (kw= 'text' | kw= 'class' | kw= 'value' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSpec.g:891:3: kw= 'text'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropertyAccess().getTextKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSpec.g:897:3: kw= 'class'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropertyAccess().getClassKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSpec.g:903:3: kw= 'value'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropertyAccess().getValueKeyword_2());
                    		

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


    // $ANTLR start "entryRuleCondition"
    // InternalSpec.g:912:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalSpec.g:912:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalSpec.g:913:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition.getText(); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalSpec.g:919:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) ) ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpec.g:925:2: ( ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) ) )
            // InternalSpec.g:926:2: ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) )
            {
            // InternalSpec.g:926:2: ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==27) ) {
                    alt9=1;
                }
                else if ( (LA9_1==28) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpec.g:927:3: (kw= 'should' kw= 'be' )
                    {
                    // InternalSpec.g:927:3: (kw= 'should' kw= 'be' )
                    // InternalSpec.g:928:4: kw= 'should' kw= 'be'
                    {
                    kw=(Token)match(input,26,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getShouldKeyword_0_0());
                    			
                    kw=(Token)match(input,27,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getBeKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:940:3: (kw= 'should' kw= 'not' kw= 'be' )
                    {
                    // InternalSpec.g:940:3: (kw= 'should' kw= 'not' kw= 'be' )
                    // InternalSpec.g:941:4: kw= 'should' kw= 'not' kw= 'be'
                    {
                    kw=(Token)match(input,26,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getShouldKeyword_1_0());
                    			
                    kw=(Token)match(input,28,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getNotKeyword_1_1());
                    			
                    kw=(Token)match(input,27,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getBeKeyword_1_2());
                    			

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


    // $ANTLR start "entryRuleTypeCommand"
    // InternalSpec.g:961:1: entryRuleTypeCommand returns [EObject current=null] : iv_ruleTypeCommand= ruleTypeCommand EOF ;
    public final EObject entryRuleTypeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCommand = null;


        try {
            // InternalSpec.g:961:52: (iv_ruleTypeCommand= ruleTypeCommand EOF )
            // InternalSpec.g:962:2: iv_ruleTypeCommand= ruleTypeCommand EOF
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
    // InternalSpec.g:968:1: ruleTypeCommand returns [EObject current=null] : ( (otherlv_0= 'Type' ( (lv_str_1_0= RULE_STRING ) ) ) | (otherlv_2= 'Type' ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleTypeCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_str_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSpec.g:974:2: ( ( (otherlv_0= 'Type' ( (lv_str_1_0= RULE_STRING ) ) ) | (otherlv_2= 'Type' ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalSpec.g:975:2: ( (otherlv_0= 'Type' ( (lv_str_1_0= RULE_STRING ) ) ) | (otherlv_2= 'Type' ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalSpec.g:975:2: ( (otherlv_0= 'Type' ( (lv_str_1_0= RULE_STRING ) ) ) | (otherlv_2= 'Type' ( (otherlv_3= RULE_ID ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_ID) ) {
                    alt10=2;
                }
                else if ( (LA10_1==RULE_STRING) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpec.g:976:3: (otherlv_0= 'Type' ( (lv_str_1_0= RULE_STRING ) ) )
                    {
                    // InternalSpec.g:976:3: (otherlv_0= 'Type' ( (lv_str_1_0= RULE_STRING ) ) )
                    // InternalSpec.g:977:4: otherlv_0= 'Type' ( (lv_str_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getTypeCommandAccess().getTypeKeyword_0_0());
                    			
                    // InternalSpec.g:981:4: ( (lv_str_1_0= RULE_STRING ) )
                    // InternalSpec.g:982:5: (lv_str_1_0= RULE_STRING )
                    {
                    // InternalSpec.g:982:5: (lv_str_1_0= RULE_STRING )
                    // InternalSpec.g:983:6: lv_str_1_0= RULE_STRING
                    {
                    lv_str_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_str_1_0, grammarAccess.getTypeCommandAccess().getStrSTRINGTerminalRuleCall_0_1_0());
                    					

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


                    }
                    break;
                case 2 :
                    // InternalSpec.g:1001:3: (otherlv_2= 'Type' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalSpec.g:1001:3: (otherlv_2= 'Type' ( (otherlv_3= RULE_ID ) ) )
                    // InternalSpec.g:1002:4: otherlv_2= 'Type' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeCommandAccess().getTypeKeyword_1_0());
                    			
                    // InternalSpec.g:1006:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSpec.g:1007:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSpec.g:1007:5: (otherlv_3= RULE_ID )
                    // InternalSpec.g:1008:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeCommandRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getTypeCommandAccess().getVarVariableCrossReference_1_1_0());
                    					

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
    // $ANTLR end "ruleTypeCommand"


    // $ANTLR start "entryRuleSleepCommand"
    // InternalSpec.g:1024:1: entryRuleSleepCommand returns [EObject current=null] : iv_ruleSleepCommand= ruleSleepCommand EOF ;
    public final EObject entryRuleSleepCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSleepCommand = null;


        try {
            // InternalSpec.g:1024:53: (iv_ruleSleepCommand= ruleSleepCommand EOF )
            // InternalSpec.g:1025:2: iv_ruleSleepCommand= ruleSleepCommand EOF
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
    // InternalSpec.g:1031:1: ruleSleepCommand returns [EObject current=null] : (otherlv_0= 'Sleep' otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) ) ;
    public final EObject ruleSleepCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_time_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSpec.g:1037:2: ( (otherlv_0= 'Sleep' otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) ) )
            // InternalSpec.g:1038:2: (otherlv_0= 'Sleep' otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) )
            {
            // InternalSpec.g:1038:2: (otherlv_0= 'Sleep' otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) )
            // InternalSpec.g:1039:3: otherlv_0= 'Sleep' otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSleepCommandAccess().getSleepKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSleepCommandAccess().getForKeyword_1());
            		
            // InternalSpec.g:1047:3: ( (lv_time_2_0= RULE_INT ) )
            // InternalSpec.g:1048:4: (lv_time_2_0= RULE_INT )
            {
            // InternalSpec.g:1048:4: (lv_time_2_0= RULE_INT )
            // InternalSpec.g:1049:5: lv_time_2_0= RULE_INT
            {
            lv_time_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

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

            // InternalSpec.g:1065:3: (otherlv_3= 'second' | otherlv_4= 'seconds' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            else if ( (LA11_0==33) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpec.g:1066:4: otherlv_3= 'second'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSpec.g:1071:4: otherlv_4= 'seconds'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_2); 

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
    // InternalSpec.g:1080:1: entryRulePoint returns [String current=null] : iv_rulePoint= rulePoint EOF ;
    public final String entryRulePoint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePoint = null;


        try {
            // InternalSpec.g:1080:45: (iv_rulePoint= rulePoint EOF )
            // InternalSpec.g:1081:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint.getText(); 
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
    // InternalSpec.g:1087:1: rulePoint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulePoint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalSpec.g:1093:2: ( (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' ) )
            // InternalSpec.g:1094:2: (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' )
            {
            // InternalSpec.g:1094:2: (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' )
            // InternalSpec.g:1095:3: kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}'
            {
            kw=(Token)match(input,34,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPointAccess().getLeftCurlyBracketKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_20); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getPointAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,35,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPointAccess().getCommaKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_21); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getPointAccess().getINTTerminalRuleCall_3());
            		
            kw=(Token)match(input,36,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPointAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleVariable"
    // InternalSpec.g:1128:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSpec.g:1128:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSpec.g:1129:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalSpec.g:1135:1: ruleVariable returns [EObject current=null] : (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSpec.g:1141:2: ( (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSpec.g:1142:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSpec.g:1142:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSpec.g:1143:3: otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getDollarSignKeyword_0());
            		
            // InternalSpec.g:1147:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpec.g:1148:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpec.g:1148:4: (lv_name_1_0= RULE_ID )
            // InternalSpec.g:1149:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "ruleElementType"
    // InternalSpec.g:1169:1: ruleElementType returns [Enumerator current=null] : ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) ) ;
    public final Enumerator ruleElementType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSpec.g:1175:2: ( ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) ) )
            // InternalSpec.g:1176:2: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) )
            {
            // InternalSpec.g:1176:2: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt12=1;
                }
                break;
            case 39:
                {
                alt12=2;
                }
                break;
            case 40:
                {
                alt12=3;
                }
                break;
            case 41:
                {
                alt12=4;
                }
                break;
            case 42:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSpec.g:1177:3: (enumLiteral_0= 'button' )
                    {
                    // InternalSpec.g:1177:3: (enumLiteral_0= 'button' )
                    // InternalSpec.g:1178:4: enumLiteral_0= 'button'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:1185:3: (enumLiteral_1= 'element' )
                    {
                    // InternalSpec.g:1185:3: (enumLiteral_1= 'element' )
                    // InternalSpec.g:1186:4: enumLiteral_1= 'element'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:1193:3: (enumLiteral_2= 'link' )
                    {
                    // InternalSpec.g:1193:3: (enumLiteral_2= 'link' )
                    // InternalSpec.g:1194:4: enumLiteral_2= 'link'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:1201:3: (enumLiteral_3= 'input' )
                    {
                    // InternalSpec.g:1201:3: (enumLiteral_3= 'input' )
                    // InternalSpec.g:1202:4: enumLiteral_3= 'input'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:1209:3: (enumLiteral_4= 'textarea' )
                    {
                    // InternalSpec.g:1209:3: (enumLiteral_4= 'textarea' )
                    // InternalSpec.g:1210:4: enumLiteral_4= 'textarea'
                    {
                    enumLiteral_4=(Token)match(input,42,FOLLOW_2); 

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

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\6\2\uffff\5\6\2\uffff";
    static final String dfa_3s = "\1\52\2\uffff\5\7\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\5\uffff\1\3\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\1\36\uffff\1\3\1\4\1\5\1\6\1\7",
            "",
            "",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "498:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_str_1_0= RULE_STRING ) ) | ( ( (lv_type_2_0= ruleElementType ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_type_4_0= ruleElementType ) ) ( (lv_str_5_0= RULE_STRING ) ) ) )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\26\1\27\3\32\2\33\2\6\2\uffff";
    static final String dfa_9s = "\1\26\1\31\3\32\1\34\1\33\2\7\2\uffff";
    static final String dfa_10s = "\11\uffff\1\1\1\2";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2\1\3\1\4",
            "\1\5",
            "\1\5",
            "\1\5",
            "\1\7\1\6",
            "\1\10",
            "\1\11\1\12",
            "\1\11\1\12",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "751:2: ( (otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= RULE_STRING ) ) ) | (otherlv_4= 'Property' ( (lv_prop_5_0= ruleProperty ) ) ( (lv_cond_6_0= ruleCondition ) ) ( (otherlv_7= RULE_ID ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000606B3032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000007C0000000C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});

}
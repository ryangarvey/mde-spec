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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_CUSTOM_COMMAND", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_UNQUOTED", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Open'", "'$'", "'Click'", "'on'", "'at'", "'Within'", "'Select'", "'visible'", "'Store'", "'to'", "'be'", "'Remember'", "'as'", "'Property'", "'text'", "'class'", "'value'", "'should'", "'not'", "'Type'", "'Sleep'", "'for'", "'second'", "'seconds'", "'{'", "','", "'}'", "'button'", "'element'", "'link'", "'input'", "'textarea'"
    };
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

                if ( ((LA1_0>=RULE_SL_COMMENT && LA1_0<=RULE_CUSTOM_COMMAND)||LA1_0==13||LA1_0==15||(LA1_0>=18 && LA1_0<=19)||LA1_0==21||LA1_0==24||LA1_0==26||(LA1_0>=32 && LA1_0<=33)) ) {
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
            case 13:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 18:
            case 19:
                {
                alt2=4;
                }
                break;
            case 24:
                {
                alt2=5;
                }
                break;
            case 26:
                {
                alt2=6;
                }
                break;
            case 32:
                {
                alt2=7;
                }
                break;
            case 33:
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
    // InternalSpec.g:236:1: ruleOpenCommand returns [EObject current=null] : (otherlv_0= 'Open' ( (lv_value_1_0= ruleVariableOrValue ) ) ) ;
    public final EObject ruleOpenCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:242:2: ( (otherlv_0= 'Open' ( (lv_value_1_0= ruleVariableOrValue ) ) ) )
            // InternalSpec.g:243:2: (otherlv_0= 'Open' ( (lv_value_1_0= ruleVariableOrValue ) ) )
            {
            // InternalSpec.g:243:2: (otherlv_0= 'Open' ( (lv_value_1_0= ruleVariableOrValue ) ) )
            // InternalSpec.g:244:3: otherlv_0= 'Open' ( (lv_value_1_0= ruleVariableOrValue ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpenCommandAccess().getOpenKeyword_0());
            		
            // InternalSpec.g:248:3: ( (lv_value_1_0= ruleVariableOrValue ) )
            // InternalSpec.g:249:4: (lv_value_1_0= ruleVariableOrValue )
            {
            // InternalSpec.g:249:4: (lv_value_1_0= ruleVariableOrValue )
            // InternalSpec.g:250:5: lv_value_1_0= ruleVariableOrValue
            {

            					newCompositeNode(grammarAccess.getOpenCommandAccess().getValueVariableOrValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleVariableOrValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpenCommandRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.mde.spec.Spec.VariableOrValue");
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
    // $ANTLR end "ruleOpenCommand"


    // $ANTLR start "entryRuleVariableOrValue"
    // InternalSpec.g:271:1: entryRuleVariableOrValue returns [EObject current=null] : iv_ruleVariableOrValue= ruleVariableOrValue EOF ;
    public final EObject entryRuleVariableOrValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableOrValue = null;


        try {
            // InternalSpec.g:271:56: (iv_ruleVariableOrValue= ruleVariableOrValue EOF )
            // InternalSpec.g:272:2: iv_ruleVariableOrValue= ruleVariableOrValue EOF
            {
             newCompositeNode(grammarAccess.getVariableOrValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableOrValue=ruleVariableOrValue();

            state._fsp--;

             current =iv_ruleVariableOrValue; 
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
    // $ANTLR end "entryRuleVariableOrValue"


    // $ANTLR start "ruleVariableOrValue"
    // InternalSpec.g:278:1: ruleVariableOrValue returns [EObject current=null] : ( (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) ) | ( (lv_val_2_0= RULE_STRING ) ) | ( (lv_element_3_0= ruleElementInScreen ) ) ) ;
    public final EObject ruleVariableOrValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_val_2_0=null;
        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:284:2: ( ( (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) ) | ( (lv_val_2_0= RULE_STRING ) ) | ( (lv_element_3_0= ruleElementInScreen ) ) ) )
            // InternalSpec.g:285:2: ( (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) ) | ( (lv_val_2_0= RULE_STRING ) ) | ( (lv_element_3_0= ruleElementInScreen ) ) )
            {
            // InternalSpec.g:285:2: ( (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) ) | ( (lv_val_2_0= RULE_STRING ) ) | ( (lv_element_3_0= ruleElementInScreen ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSpec.g:286:3: (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalSpec.g:286:3: (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) )
                    // InternalSpec.g:287:4: otherlv_0= '$' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getVariableOrValueAccess().getDollarSignKeyword_0_0());
                    			
                    // InternalSpec.g:291:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSpec.g:292:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSpec.g:292:5: (otherlv_1= RULE_ID )
                    // InternalSpec.g:293:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableOrValueRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getVariableOrValueAccess().getVarVariableCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:306:3: ( (lv_val_2_0= RULE_STRING ) )
                    {
                    // InternalSpec.g:306:3: ( (lv_val_2_0= RULE_STRING ) )
                    // InternalSpec.g:307:4: (lv_val_2_0= RULE_STRING )
                    {
                    // InternalSpec.g:307:4: (lv_val_2_0= RULE_STRING )
                    // InternalSpec.g:308:5: lv_val_2_0= RULE_STRING
                    {
                    lv_val_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_val_2_0, grammarAccess.getVariableOrValueAccess().getValSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableOrValueRule());
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
                case 3 :
                    // InternalSpec.g:325:3: ( (lv_element_3_0= ruleElementInScreen ) )
                    {
                    // InternalSpec.g:325:3: ( (lv_element_3_0= ruleElementInScreen ) )
                    // InternalSpec.g:326:4: (lv_element_3_0= ruleElementInScreen )
                    {
                    // InternalSpec.g:326:4: (lv_element_3_0= ruleElementInScreen )
                    // InternalSpec.g:327:5: lv_element_3_0= ruleElementInScreen
                    {

                    					newCompositeNode(grammarAccess.getVariableOrValueAccess().getElementElementInScreenParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_element_3_0=ruleElementInScreen();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableOrValueRule());
                    					}
                    					set(
                    						current,
                    						"element",
                    						lv_element_3_0,
                    						"org.mde.spec.Spec.ElementInScreen");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleVariableOrValue"


    // $ANTLR start "entryRuleClickCommand"
    // InternalSpec.g:348:1: entryRuleClickCommand returns [EObject current=null] : iv_ruleClickCommand= ruleClickCommand EOF ;
    public final EObject entryRuleClickCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickCommand = null;


        try {
            // InternalSpec.g:348:53: (iv_ruleClickCommand= ruleClickCommand EOF )
            // InternalSpec.g:349:2: iv_ruleClickCommand= ruleClickCommand EOF
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
    // InternalSpec.g:355:1: ruleClickCommand returns [EObject current=null] : ( ( (lv_cmd_0_0= 'Click' ) ) | (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) ) | (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) ) ) ;
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
            // InternalSpec.g:361:2: ( ( ( (lv_cmd_0_0= 'Click' ) ) | (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) ) | (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) ) ) )
            // InternalSpec.g:362:2: ( ( (lv_cmd_0_0= 'Click' ) ) | (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) ) | (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) ) )
            {
            // InternalSpec.g:362:2: ( ( (lv_cmd_0_0= 'Click' ) ) | (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) ) | (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_SL_COMMENT:
                case RULE_CUSTOM_COMMAND:
                case 13:
                case 15:
                case 18:
                case 19:
                case 21:
                case 24:
                case 26:
                case 32:
                case 33:
                    {
                    alt4=1;
                    }
                    break;
                case 16:
                    {
                    alt4=2;
                    }
                    break;
                case 17:
                    {
                    alt4=3;
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
                    // InternalSpec.g:363:3: ( (lv_cmd_0_0= 'Click' ) )
                    {
                    // InternalSpec.g:363:3: ( (lv_cmd_0_0= 'Click' ) )
                    // InternalSpec.g:364:4: (lv_cmd_0_0= 'Click' )
                    {
                    // InternalSpec.g:364:4: (lv_cmd_0_0= 'Click' )
                    // InternalSpec.g:365:5: lv_cmd_0_0= 'Click'
                    {
                    lv_cmd_0_0=(Token)match(input,15,FOLLOW_2); 

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
                    // InternalSpec.g:378:3: (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:378:3: (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) )
                    // InternalSpec.g:379:4: otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getClickCommandAccess().getClickKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getClickCommandAccess().getOnKeyword_1_1());
                    			
                    // InternalSpec.g:387:4: ( (lv_selector_3_0= ruleSelector ) )
                    // InternalSpec.g:388:5: (lv_selector_3_0= ruleSelector )
                    {
                    // InternalSpec.g:388:5: (lv_selector_3_0= ruleSelector )
                    // InternalSpec.g:389:6: lv_selector_3_0= ruleSelector
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
                    // InternalSpec.g:408:3: (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) )
                    {
                    // InternalSpec.g:408:3: (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) )
                    // InternalSpec.g:409:4: otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getClickCommandAccess().getClickKeyword_2_0());
                    			
                    otherlv_5=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getClickCommandAccess().getAtKeyword_2_1());
                    			
                    // InternalSpec.g:417:4: ( (lv_point_6_0= rulePoint ) )
                    // InternalSpec.g:418:5: (lv_point_6_0= rulePoint )
                    {
                    // InternalSpec.g:418:5: (lv_point_6_0= rulePoint )
                    // InternalSpec.g:419:6: lv_point_6_0= rulePoint
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
    // InternalSpec.g:441:1: entryRuleSelectCommand returns [EObject current=null] : iv_ruleSelectCommand= ruleSelectCommand EOF ;
    public final EObject entryRuleSelectCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCommand = null;


        try {
            // InternalSpec.g:441:54: (iv_ruleSelectCommand= ruleSelectCommand EOF )
            // InternalSpec.g:442:2: iv_ruleSelectCommand= ruleSelectCommand EOF
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
    // InternalSpec.g:448:1: ruleSelectCommand returns [EObject current=null] : ( (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) ) | (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) ) | (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) ) ) ;
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
            // InternalSpec.g:454:2: ( ( (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) ) | (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) ) | (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) ) ) )
            // InternalSpec.g:455:2: ( (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) ) | (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) ) | (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) ) )
            {
            // InternalSpec.g:455:2: ( (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) ) | (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) ) | (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==20) ) {
                    alt5=3;
                }
                else if ( ((LA5_2>=RULE_ID && LA5_2<=RULE_STRING)||LA5_2==14||(LA5_2>=40 && LA5_2<=44)) ) {
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
                    // InternalSpec.g:456:3: (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:456:3: (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) )
                    // InternalSpec.g:457:4: otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getSelectCommandAccess().getWithinKeyword_0_0());
                    			
                    // InternalSpec.g:461:4: ( (lv_value_1_0= ruleSelector ) )
                    // InternalSpec.g:462:5: (lv_value_1_0= ruleSelector )
                    {
                    // InternalSpec.g:462:5: (lv_value_1_0= ruleSelector )
                    // InternalSpec.g:463:6: lv_value_1_0= ruleSelector
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
                    // InternalSpec.g:482:3: (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:482:3: (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) )
                    // InternalSpec.g:483:4: otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getSelectCommandAccess().getSelectKeyword_1_0());
                    			
                    // InternalSpec.g:487:4: ( (lv_value_3_0= ruleSelector ) )
                    // InternalSpec.g:488:5: (lv_value_3_0= ruleSelector )
                    {
                    // InternalSpec.g:488:5: (lv_value_3_0= ruleSelector )
                    // InternalSpec.g:489:6: lv_value_3_0= ruleSelector
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
                    // InternalSpec.g:508:3: (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:508:3: (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) )
                    // InternalSpec.g:509:4: otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getSelectCommandAccess().getSelectKeyword_2_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getSelectCommandAccess().getVisibleKeyword_2_1());
                    			
                    // InternalSpec.g:517:4: ( (lv_value_6_0= ruleSelector ) )
                    // InternalSpec.g:518:5: (lv_value_6_0= ruleSelector )
                    {
                    // InternalSpec.g:518:5: (lv_value_6_0= ruleSelector )
                    // InternalSpec.g:519:6: lv_value_6_0= ruleSelector
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
    // InternalSpec.g:548:1: ruleSelector returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariableOrValue ) ) | ( ( (lv_type_1_0= ruleElementType ) ) ( (lv_val_2_0= ruleVariableOrValue ) ) ) ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        Enumerator lv_type_1_0 = null;

        EObject lv_val_2_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:554:2: ( ( ( (lv_var_0_0= ruleVariableOrValue ) ) | ( ( (lv_type_1_0= ruleElementType ) ) ( (lv_val_2_0= ruleVariableOrValue ) ) ) ) )
            // InternalSpec.g:555:2: ( ( (lv_var_0_0= ruleVariableOrValue ) ) | ( ( (lv_type_1_0= ruleElementType ) ) ( (lv_val_2_0= ruleVariableOrValue ) ) ) )
            {
            // InternalSpec.g:555:2: ( ( (lv_var_0_0= ruleVariableOrValue ) ) | ( ( (lv_type_1_0= ruleElementType ) ) ( (lv_val_2_0= ruleVariableOrValue ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||LA6_0==14) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=40 && LA6_0<=44)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpec.g:556:3: ( (lv_var_0_0= ruleVariableOrValue ) )
                    {
                    // InternalSpec.g:556:3: ( (lv_var_0_0= ruleVariableOrValue ) )
                    // InternalSpec.g:557:4: (lv_var_0_0= ruleVariableOrValue )
                    {
                    // InternalSpec.g:557:4: (lv_var_0_0= ruleVariableOrValue )
                    // InternalSpec.g:558:5: lv_var_0_0= ruleVariableOrValue
                    {

                    					newCompositeNode(grammarAccess.getSelectorAccess().getVarVariableOrValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_var_0_0=ruleVariableOrValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectorRule());
                    					}
                    					set(
                    						current,
                    						"var",
                    						lv_var_0_0,
                    						"org.mde.spec.Spec.VariableOrValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:576:3: ( ( (lv_type_1_0= ruleElementType ) ) ( (lv_val_2_0= ruleVariableOrValue ) ) )
                    {
                    // InternalSpec.g:576:3: ( ( (lv_type_1_0= ruleElementType ) ) ( (lv_val_2_0= ruleVariableOrValue ) ) )
                    // InternalSpec.g:577:4: ( (lv_type_1_0= ruleElementType ) ) ( (lv_val_2_0= ruleVariableOrValue ) )
                    {
                    // InternalSpec.g:577:4: ( (lv_type_1_0= ruleElementType ) )
                    // InternalSpec.g:578:5: (lv_type_1_0= ruleElementType )
                    {
                    // InternalSpec.g:578:5: (lv_type_1_0= ruleElementType )
                    // InternalSpec.g:579:6: lv_type_1_0= ruleElementType
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getTypeElementTypeEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_type_1_0=ruleElementType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_0,
                    							"org.mde.spec.Spec.ElementType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSpec.g:596:4: ( (lv_val_2_0= ruleVariableOrValue ) )
                    // InternalSpec.g:597:5: (lv_val_2_0= ruleVariableOrValue )
                    {
                    // InternalSpec.g:597:5: (lv_val_2_0= ruleVariableOrValue )
                    // InternalSpec.g:598:6: lv_val_2_0= ruleVariableOrValue
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getValVariableOrValueParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_val_2_0=ruleVariableOrValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_2_0,
                    							"org.mde.spec.Spec.VariableOrValue");
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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleStoreCommand"
    // InternalSpec.g:620:1: entryRuleStoreCommand returns [EObject current=null] : iv_ruleStoreCommand= ruleStoreCommand EOF ;
    public final EObject entryRuleStoreCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreCommand = null;


        try {
            // InternalSpec.g:620:53: (iv_ruleStoreCommand= ruleStoreCommand EOF )
            // InternalSpec.g:621:2: iv_ruleStoreCommand= ruleStoreCommand EOF
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
    // InternalSpec.g:627:1: ruleStoreCommand returns [EObject current=null] : (otherlv_0= 'Store' ( (lv_name_1_0= ruleVariable ) ) otherlv_2= 'to' otherlv_3= 'be' ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleStoreCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:633:2: ( (otherlv_0= 'Store' ( (lv_name_1_0= ruleVariable ) ) otherlv_2= 'to' otherlv_3= 'be' ( (lv_value_4_0= RULE_STRING ) ) ) )
            // InternalSpec.g:634:2: (otherlv_0= 'Store' ( (lv_name_1_0= ruleVariable ) ) otherlv_2= 'to' otherlv_3= 'be' ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // InternalSpec.g:634:2: (otherlv_0= 'Store' ( (lv_name_1_0= ruleVariable ) ) otherlv_2= 'to' otherlv_3= 'be' ( (lv_value_4_0= RULE_STRING ) ) )
            // InternalSpec.g:635:3: otherlv_0= 'Store' ( (lv_name_1_0= ruleVariable ) ) otherlv_2= 'to' otherlv_3= 'be' ( (lv_value_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreCommandAccess().getStoreKeyword_0());
            		
            // InternalSpec.g:639:3: ( (lv_name_1_0= ruleVariable ) )
            // InternalSpec.g:640:4: (lv_name_1_0= ruleVariable )
            {
            // InternalSpec.g:640:4: (lv_name_1_0= ruleVariable )
            // InternalSpec.g:641:5: lv_name_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getStoreCommandAccess().getNameVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoreCommandRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.mde.spec.Spec.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreCommandAccess().getToKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getStoreCommandAccess().getBeKeyword_3());
            		
            // InternalSpec.g:666:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalSpec.g:667:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalSpec.g:667:4: (lv_value_4_0= RULE_STRING )
            // InternalSpec.g:668:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getStoreCommandAccess().getValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
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
    // InternalSpec.g:688:1: entryRuleRememberCommand returns [EObject current=null] : iv_ruleRememberCommand= ruleRememberCommand EOF ;
    public final EObject entryRuleRememberCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRememberCommand = null;


        try {
            // InternalSpec.g:688:56: (iv_ruleRememberCommand= ruleRememberCommand EOF )
            // InternalSpec.g:689:2: iv_ruleRememberCommand= ruleRememberCommand EOF
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
    // InternalSpec.g:695:1: ruleRememberCommand returns [EObject current=null] : (otherlv_0= 'Remember' ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= ruleVariable ) ) ) ;
    public final EObject ruleRememberCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_prop_1_0 = null;

        EObject lv_var_3_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:701:2: ( (otherlv_0= 'Remember' ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= ruleVariable ) ) ) )
            // InternalSpec.g:702:2: (otherlv_0= 'Remember' ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= ruleVariable ) ) )
            {
            // InternalSpec.g:702:2: (otherlv_0= 'Remember' ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= ruleVariable ) ) )
            // InternalSpec.g:703:3: otherlv_0= 'Remember' ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= ruleVariable ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRememberCommandAccess().getRememberKeyword_0());
            		
            // InternalSpec.g:707:3: ( (lv_prop_1_0= ruleProperty ) )
            // InternalSpec.g:708:4: (lv_prop_1_0= ruleProperty )
            {
            // InternalSpec.g:708:4: (lv_prop_1_0= ruleProperty )
            // InternalSpec.g:709:5: lv_prop_1_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getRememberCommandAccess().getPropPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRememberCommandAccess().getAsKeyword_2());
            		
            // InternalSpec.g:730:3: ( (lv_var_3_0= ruleVariable ) )
            // InternalSpec.g:731:4: (lv_var_3_0= ruleVariable )
            {
            // InternalSpec.g:731:4: (lv_var_3_0= ruleVariable )
            // InternalSpec.g:732:5: lv_var_3_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getRememberCommandAccess().getVarVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_3_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRememberCommandRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_3_0,
            						"org.mde.spec.Spec.Variable");
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
    // $ANTLR end "ruleRememberCommand"


    // $ANTLR start "entryRulePropertyCommand"
    // InternalSpec.g:753:1: entryRulePropertyCommand returns [EObject current=null] : iv_rulePropertyCommand= rulePropertyCommand EOF ;
    public final EObject entryRulePropertyCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCommand = null;


        try {
            // InternalSpec.g:753:56: (iv_rulePropertyCommand= rulePropertyCommand EOF )
            // InternalSpec.g:754:2: iv_rulePropertyCommand= rulePropertyCommand EOF
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
    // InternalSpec.g:760:1: rulePropertyCommand returns [EObject current=null] : (otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= ruleVariableOrValue ) ) ) ;
    public final EObject rulePropertyCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_prop_1_0 = null;

        AntlrDatatypeRuleToken lv_cond_2_0 = null;

        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:766:2: ( (otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= ruleVariableOrValue ) ) ) )
            // InternalSpec.g:767:2: (otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= ruleVariableOrValue ) ) )
            {
            // InternalSpec.g:767:2: (otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= ruleVariableOrValue ) ) )
            // InternalSpec.g:768:3: otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= ruleVariableOrValue ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyCommandAccess().getPropertyKeyword_0());
            		
            // InternalSpec.g:772:3: ( (lv_prop_1_0= ruleProperty ) )
            // InternalSpec.g:773:4: (lv_prop_1_0= ruleProperty )
            {
            // InternalSpec.g:773:4: (lv_prop_1_0= ruleProperty )
            // InternalSpec.g:774:5: lv_prop_1_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getPropertyCommandAccess().getPropPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalSpec.g:791:3: ( (lv_cond_2_0= ruleCondition ) )
            // InternalSpec.g:792:4: (lv_cond_2_0= ruleCondition )
            {
            // InternalSpec.g:792:4: (lv_cond_2_0= ruleCondition )
            // InternalSpec.g:793:5: lv_cond_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getPropertyCommandAccess().getCondConditionParserRuleCall_2_0());
            				
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

            // InternalSpec.g:810:3: ( (lv_val_3_0= ruleVariableOrValue ) )
            // InternalSpec.g:811:4: (lv_val_3_0= ruleVariableOrValue )
            {
            // InternalSpec.g:811:4: (lv_val_3_0= ruleVariableOrValue )
            // InternalSpec.g:812:5: lv_val_3_0= ruleVariableOrValue
            {

            					newCompositeNode(grammarAccess.getPropertyCommandAccess().getValVariableOrValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_3_0=ruleVariableOrValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyCommandRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_3_0,
            						"org.mde.spec.Spec.VariableOrValue");
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
    // $ANTLR end "rulePropertyCommand"


    // $ANTLR start "entryRuleProperty"
    // InternalSpec.g:833:1: entryRuleProperty returns [String current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final String entryRuleProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProperty = null;


        try {
            // InternalSpec.g:833:48: (iv_ruleProperty= ruleProperty EOF )
            // InternalSpec.g:834:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalSpec.g:840:1: ruleProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'text' | kw= 'class' | kw= 'value' ) ;
    public final AntlrDatatypeRuleToken ruleProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpec.g:846:2: ( (kw= 'text' | kw= 'class' | kw= 'value' ) )
            // InternalSpec.g:847:2: (kw= 'text' | kw= 'class' | kw= 'value' )
            {
            // InternalSpec.g:847:2: (kw= 'text' | kw= 'class' | kw= 'value' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSpec.g:848:3: kw= 'text'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropertyAccess().getTextKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSpec.g:854:3: kw= 'class'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropertyAccess().getClassKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSpec.g:860:3: kw= 'value'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

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
    // InternalSpec.g:869:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalSpec.g:869:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalSpec.g:870:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalSpec.g:876:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) ) ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpec.g:882:2: ( ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) ) )
            // InternalSpec.g:883:2: ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) )
            {
            // InternalSpec.g:883:2: ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==23) ) {
                    alt8=1;
                }
                else if ( (LA8_1==31) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpec.g:884:3: (kw= 'should' kw= 'be' )
                    {
                    // InternalSpec.g:884:3: (kw= 'should' kw= 'be' )
                    // InternalSpec.g:885:4: kw= 'should' kw= 'be'
                    {
                    kw=(Token)match(input,30,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getShouldKeyword_0_0());
                    			
                    kw=(Token)match(input,23,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getBeKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:897:3: (kw= 'should' kw= 'not' kw= 'be' )
                    {
                    // InternalSpec.g:897:3: (kw= 'should' kw= 'not' kw= 'be' )
                    // InternalSpec.g:898:4: kw= 'should' kw= 'not' kw= 'be'
                    {
                    kw=(Token)match(input,30,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getShouldKeyword_1_0());
                    			
                    kw=(Token)match(input,31,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getNotKeyword_1_1());
                    			
                    kw=(Token)match(input,23,FOLLOW_2); 

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
    // InternalSpec.g:918:1: entryRuleTypeCommand returns [EObject current=null] : iv_ruleTypeCommand= ruleTypeCommand EOF ;
    public final EObject entryRuleTypeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCommand = null;


        try {
            // InternalSpec.g:918:52: (iv_ruleTypeCommand= ruleTypeCommand EOF )
            // InternalSpec.g:919:2: iv_ruleTypeCommand= ruleTypeCommand EOF
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
    // InternalSpec.g:925:1: ruleTypeCommand returns [EObject current=null] : (otherlv_0= 'Type' ( (lv_val_1_0= ruleVariableOrValue ) ) ) ;
    public final EObject ruleTypeCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:931:2: ( (otherlv_0= 'Type' ( (lv_val_1_0= ruleVariableOrValue ) ) ) )
            // InternalSpec.g:932:2: (otherlv_0= 'Type' ( (lv_val_1_0= ruleVariableOrValue ) ) )
            {
            // InternalSpec.g:932:2: (otherlv_0= 'Type' ( (lv_val_1_0= ruleVariableOrValue ) ) )
            // InternalSpec.g:933:3: otherlv_0= 'Type' ( (lv_val_1_0= ruleVariableOrValue ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeCommandAccess().getTypeKeyword_0());
            		
            // InternalSpec.g:937:3: ( (lv_val_1_0= ruleVariableOrValue ) )
            // InternalSpec.g:938:4: (lv_val_1_0= ruleVariableOrValue )
            {
            // InternalSpec.g:938:4: (lv_val_1_0= ruleVariableOrValue )
            // InternalSpec.g:939:5: lv_val_1_0= ruleVariableOrValue
            {

            					newCompositeNode(grammarAccess.getTypeCommandAccess().getValVariableOrValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleVariableOrValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeCommandRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.mde.spec.Spec.VariableOrValue");
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
    // $ANTLR end "ruleTypeCommand"


    // $ANTLR start "entryRuleSleepCommand"
    // InternalSpec.g:960:1: entryRuleSleepCommand returns [EObject current=null] : iv_ruleSleepCommand= ruleSleepCommand EOF ;
    public final EObject entryRuleSleepCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSleepCommand = null;


        try {
            // InternalSpec.g:960:53: (iv_ruleSleepCommand= ruleSleepCommand EOF )
            // InternalSpec.g:961:2: iv_ruleSleepCommand= ruleSleepCommand EOF
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
    // InternalSpec.g:967:1: ruleSleepCommand returns [EObject current=null] : (otherlv_0= 'Sleep' otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) ) ;
    public final EObject ruleSleepCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_time_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSpec.g:973:2: ( (otherlv_0= 'Sleep' otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) ) )
            // InternalSpec.g:974:2: (otherlv_0= 'Sleep' otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) )
            {
            // InternalSpec.g:974:2: (otherlv_0= 'Sleep' otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) )
            // InternalSpec.g:975:3: otherlv_0= 'Sleep' otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSleepCommandAccess().getSleepKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSleepCommandAccess().getForKeyword_1());
            		
            // InternalSpec.g:983:3: ( (lv_time_2_0= RULE_INT ) )
            // InternalSpec.g:984:4: (lv_time_2_0= RULE_INT )
            {
            // InternalSpec.g:984:4: (lv_time_2_0= RULE_INT )
            // InternalSpec.g:985:5: lv_time_2_0= RULE_INT
            {
            lv_time_2_0=(Token)match(input,RULE_INT,FOLLOW_21); 

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

            // InternalSpec.g:1001:3: (otherlv_3= 'second' | otherlv_4= 'seconds' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            else if ( (LA9_0==36) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpec.g:1002:4: otherlv_3= 'second'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSpec.g:1007:4: otherlv_4= 'seconds'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_2); 

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
    // InternalSpec.g:1016:1: entryRulePoint returns [String current=null] : iv_rulePoint= rulePoint EOF ;
    public final String entryRulePoint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePoint = null;


        try {
            // InternalSpec.g:1016:45: (iv_rulePoint= rulePoint EOF )
            // InternalSpec.g:1017:2: iv_rulePoint= rulePoint EOF
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
    // InternalSpec.g:1023:1: rulePoint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulePoint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalSpec.g:1029:2: ( (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' ) )
            // InternalSpec.g:1030:2: (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' )
            {
            // InternalSpec.g:1030:2: (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' )
            // InternalSpec.g:1031:3: kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}'
            {
            kw=(Token)match(input,37,FOLLOW_20); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPointAccess().getLeftCurlyBracketKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_22); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getPointAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,38,FOLLOW_20); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPointAccess().getCommaKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_23); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getPointAccess().getINTTerminalRuleCall_3());
            		
            kw=(Token)match(input,39,FOLLOW_2); 

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


    // $ANTLR start "entryRuleElementInScreen"
    // InternalSpec.g:1064:1: entryRuleElementInScreen returns [EObject current=null] : iv_ruleElementInScreen= ruleElementInScreen EOF ;
    public final EObject entryRuleElementInScreen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementInScreen = null;


        try {
            // InternalSpec.g:1064:56: (iv_ruleElementInScreen= ruleElementInScreen EOF )
            // InternalSpec.g:1065:2: iv_ruleElementInScreen= ruleElementInScreen EOF
            {
             newCompositeNode(grammarAccess.getElementInScreenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementInScreen=ruleElementInScreen();

            state._fsp--;

             current =iv_ruleElementInScreen; 
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
    // $ANTLR end "entryRuleElementInScreen"


    // $ANTLR start "ruleElementInScreen"
    // InternalSpec.g:1071:1: ruleElementInScreen returns [EObject current=null] : ( (lv_element_0_0= RULE_ID ) ) ;
    public final EObject ruleElementInScreen() throws RecognitionException {
        EObject current = null;

        Token lv_element_0_0=null;


        	enterRule();

        try {
            // InternalSpec.g:1077:2: ( ( (lv_element_0_0= RULE_ID ) ) )
            // InternalSpec.g:1078:2: ( (lv_element_0_0= RULE_ID ) )
            {
            // InternalSpec.g:1078:2: ( (lv_element_0_0= RULE_ID ) )
            // InternalSpec.g:1079:3: (lv_element_0_0= RULE_ID )
            {
            // InternalSpec.g:1079:3: (lv_element_0_0= RULE_ID )
            // InternalSpec.g:1080:4: lv_element_0_0= RULE_ID
            {
            lv_element_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_element_0_0, grammarAccess.getElementInScreenAccess().getElementIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getElementInScreenRule());
            				}
            				setWithLastConsumed(
            					current,
            					"element",
            					lv_element_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleElementInScreen"


    // $ANTLR start "entryRuleVariable"
    // InternalSpec.g:1099:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSpec.g:1099:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSpec.g:1100:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalSpec.g:1106:1: ruleVariable returns [EObject current=null] : (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSpec.g:1112:2: ( (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSpec.g:1113:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSpec.g:1113:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSpec.g:1114:3: otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getDollarSignKeyword_0());
            		
            // InternalSpec.g:1118:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpec.g:1119:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpec.g:1119:4: (lv_name_1_0= RULE_ID )
            // InternalSpec.g:1120:5: lv_name_1_0= RULE_ID
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
    // InternalSpec.g:1140:1: ruleElementType returns [Enumerator current=null] : ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) ) ;
    public final Enumerator ruleElementType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSpec.g:1146:2: ( ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) ) )
            // InternalSpec.g:1147:2: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) )
            {
            // InternalSpec.g:1147:2: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt10=1;
                }
                break;
            case 41:
                {
                alt10=2;
                }
                break;
            case 42:
                {
                alt10=3;
                }
                break;
            case 43:
                {
                alt10=4;
                }
                break;
            case 44:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSpec.g:1148:3: (enumLiteral_0= 'button' )
                    {
                    // InternalSpec.g:1148:3: (enumLiteral_0= 'button' )
                    // InternalSpec.g:1149:4: enumLiteral_0= 'button'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:1156:3: (enumLiteral_1= 'element' )
                    {
                    // InternalSpec.g:1156:3: (enumLiteral_1= 'element' )
                    // InternalSpec.g:1157:4: enumLiteral_1= 'element'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:1164:3: (enumLiteral_2= 'link' )
                    {
                    // InternalSpec.g:1164:3: (enumLiteral_2= 'link' )
                    // InternalSpec.g:1165:4: enumLiteral_2= 'link'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:1172:3: (enumLiteral_3= 'input' )
                    {
                    // InternalSpec.g:1172:3: (enumLiteral_3= 'input' )
                    // InternalSpec.g:1173:4: enumLiteral_3= 'input'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:1180:3: (enumLiteral_4= 'textarea' )
                    {
                    // InternalSpec.g:1180:3: (enumLiteral_4= 'textarea' )
                    // InternalSpec.g:1181:4: enumLiteral_4= 'textarea'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000003052CA032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000040C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00001F00000040C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});

}
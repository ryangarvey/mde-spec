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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_CUSTOM_COMMAND", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Open'", "'Click'", "'on'", "'at'", "'Within'", "'Select'", "'visible'", "'$'", "'Store'", "'as'", "'Remember'", "'Property'", "'text'", "'class'", "'value'", "'should'", "'be'", "'not'", "'Type'", "'Sleep'", "'for'", "'second'", "'seconds'", "'{'", "','", "'}'", "'button'", "'element'", "'link'", "'input'", "'textarea'"
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

                if ( ((LA1_0>=RULE_SL_COMMENT && LA1_0<=RULE_CUSTOM_COMMAND)||(LA1_0>=12 && LA1_0<=13)||(LA1_0>=16 && LA1_0<=17)||LA1_0==20||(LA1_0>=22 && LA1_0<=23)||(LA1_0>=30 && LA1_0<=31)) ) {
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
            case 20:
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
            case 22:
                {
                alt2=5;
                }
                break;
            case 23:
                {
                alt2=6;
                }
                break;
            case 30:
                {
                alt2=7;
                }
                break;
            case 31:
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
    // InternalSpec.g:236:1: ruleOpenCommand returns [EObject current=null] : ( () ( (lv_name_1_0= 'Open' ) ) ( ( (lv_val_2_0= RULE_STRING ) ) | ( (lv_var_3_0= ruleVariable ) ) ) ) ;
    public final EObject ruleOpenCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_val_2_0=null;
        EObject lv_var_3_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:242:2: ( ( () ( (lv_name_1_0= 'Open' ) ) ( ( (lv_val_2_0= RULE_STRING ) ) | ( (lv_var_3_0= ruleVariable ) ) ) ) )
            // InternalSpec.g:243:2: ( () ( (lv_name_1_0= 'Open' ) ) ( ( (lv_val_2_0= RULE_STRING ) ) | ( (lv_var_3_0= ruleVariable ) ) ) )
            {
            // InternalSpec.g:243:2: ( () ( (lv_name_1_0= 'Open' ) ) ( ( (lv_val_2_0= RULE_STRING ) ) | ( (lv_var_3_0= ruleVariable ) ) ) )
            // InternalSpec.g:244:3: () ( (lv_name_1_0= 'Open' ) ) ( ( (lv_val_2_0= RULE_STRING ) ) | ( (lv_var_3_0= ruleVariable ) ) )
            {
            // InternalSpec.g:244:3: ()
            // InternalSpec.g:245:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpenCommandAccess().getOpenCommandAction_0(),
            					current);
            			

            }

            // InternalSpec.g:251:3: ( (lv_name_1_0= 'Open' ) )
            // InternalSpec.g:252:4: (lv_name_1_0= 'Open' )
            {
            // InternalSpec.g:252:4: (lv_name_1_0= 'Open' )
            // InternalSpec.g:253:5: lv_name_1_0= 'Open'
            {
            lv_name_1_0=(Token)match(input,12,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOpenCommandAccess().getNameOpenKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpenCommandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "Open");
            				

            }


            }

            // InternalSpec.g:265:3: ( ( (lv_val_2_0= RULE_STRING ) ) | ( (lv_var_3_0= ruleVariable ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpec.g:266:4: ( (lv_val_2_0= RULE_STRING ) )
                    {
                    // InternalSpec.g:266:4: ( (lv_val_2_0= RULE_STRING ) )
                    // InternalSpec.g:267:5: (lv_val_2_0= RULE_STRING )
                    {
                    // InternalSpec.g:267:5: (lv_val_2_0= RULE_STRING )
                    // InternalSpec.g:268:6: lv_val_2_0= RULE_STRING
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
                    // InternalSpec.g:285:4: ( (lv_var_3_0= ruleVariable ) )
                    {
                    // InternalSpec.g:285:4: ( (lv_var_3_0= ruleVariable ) )
                    // InternalSpec.g:286:5: (lv_var_3_0= ruleVariable )
                    {
                    // InternalSpec.g:286:5: (lv_var_3_0= ruleVariable )
                    // InternalSpec.g:287:6: lv_var_3_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getOpenCommandAccess().getVarVariableParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_var_3_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpenCommandRule());
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
    // InternalSpec.g:309:1: entryRuleClickCommand returns [EObject current=null] : iv_ruleClickCommand= ruleClickCommand EOF ;
    public final EObject entryRuleClickCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickCommand = null;


        try {
            // InternalSpec.g:309:53: (iv_ruleClickCommand= ruleClickCommand EOF )
            // InternalSpec.g:310:2: iv_ruleClickCommand= ruleClickCommand EOF
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
    // InternalSpec.g:316:1: ruleClickCommand returns [EObject current=null] : ( ( (lv_name_0_0= 'Click' ) ) ( (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) ) | (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) ) )? ) ;
    public final EObject ruleClickCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_selector_2_0 = null;

        AntlrDatatypeRuleToken lv_point_4_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:322:2: ( ( ( (lv_name_0_0= 'Click' ) ) ( (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) ) | (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) ) )? ) )
            // InternalSpec.g:323:2: ( ( (lv_name_0_0= 'Click' ) ) ( (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) ) | (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) ) )? )
            {
            // InternalSpec.g:323:2: ( ( (lv_name_0_0= 'Click' ) ) ( (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) ) | (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) ) )? )
            // InternalSpec.g:324:3: ( (lv_name_0_0= 'Click' ) ) ( (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) ) | (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) ) )?
            {
            // InternalSpec.g:324:3: ( (lv_name_0_0= 'Click' ) )
            // InternalSpec.g:325:4: (lv_name_0_0= 'Click' )
            {
            // InternalSpec.g:325:4: (lv_name_0_0= 'Click' )
            // InternalSpec.g:326:5: lv_name_0_0= 'Click'
            {
            lv_name_0_0=(Token)match(input,13,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getClickCommandAccess().getNameClickKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickCommandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Click");
            				

            }


            }

            // InternalSpec.g:338:3: ( (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) ) | (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) ) )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            switch (alt4) {
                case 1 :
                    // InternalSpec.g:339:4: (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:339:4: (otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) ) )
                    // InternalSpec.g:340:5: otherlv_1= 'on' ( (lv_selector_2_0= ruleSelector ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(otherlv_1, grammarAccess.getClickCommandAccess().getOnKeyword_1_0_0());
                    				
                    // InternalSpec.g:344:5: ( (lv_selector_2_0= ruleSelector ) )
                    // InternalSpec.g:345:6: (lv_selector_2_0= ruleSelector )
                    {
                    // InternalSpec.g:345:6: (lv_selector_2_0= ruleSelector )
                    // InternalSpec.g:346:7: lv_selector_2_0= ruleSelector
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
                    // InternalSpec.g:365:4: (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) )
                    {
                    // InternalSpec.g:365:4: (otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) ) )
                    // InternalSpec.g:366:5: otherlv_3= 'at' ( (lv_point_4_0= rulePoint ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_7); 

                    					newLeafNode(otherlv_3, grammarAccess.getClickCommandAccess().getAtKeyword_1_1_0());
                    				
                    // InternalSpec.g:370:5: ( (lv_point_4_0= rulePoint ) )
                    // InternalSpec.g:371:6: (lv_point_4_0= rulePoint )
                    {
                    // InternalSpec.g:371:6: (lv_point_4_0= rulePoint )
                    // InternalSpec.g:372:7: lv_point_4_0= rulePoint
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
    // InternalSpec.g:395:1: entryRuleSelectCommand returns [EObject current=null] : iv_ruleSelectCommand= ruleSelectCommand EOF ;
    public final EObject entryRuleSelectCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCommand = null;


        try {
            // InternalSpec.g:395:54: (iv_ruleSelectCommand= ruleSelectCommand EOF )
            // InternalSpec.g:396:2: iv_ruleSelectCommand= ruleSelectCommand EOF
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
    // InternalSpec.g:402:1: ruleSelectCommand returns [EObject current=null] : ( ( ( (lv_name_0_0= 'Within' ) ) ( (lv_value_1_0= ruleSelector ) ) ) | ( ( (lv_name_2_0= 'Select' ) ) (otherlv_3= 'visible' )? ( (lv_value_4_0= ruleSelector ) ) ) ) ;
    public final EObject ruleSelectCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:408:2: ( ( ( ( (lv_name_0_0= 'Within' ) ) ( (lv_value_1_0= ruleSelector ) ) ) | ( ( (lv_name_2_0= 'Select' ) ) (otherlv_3= 'visible' )? ( (lv_value_4_0= ruleSelector ) ) ) ) )
            // InternalSpec.g:409:2: ( ( ( (lv_name_0_0= 'Within' ) ) ( (lv_value_1_0= ruleSelector ) ) ) | ( ( (lv_name_2_0= 'Select' ) ) (otherlv_3= 'visible' )? ( (lv_value_4_0= ruleSelector ) ) ) )
            {
            // InternalSpec.g:409:2: ( ( ( (lv_name_0_0= 'Within' ) ) ( (lv_value_1_0= ruleSelector ) ) ) | ( ( (lv_name_2_0= 'Select' ) ) (otherlv_3= 'visible' )? ( (lv_value_4_0= ruleSelector ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpec.g:410:3: ( ( (lv_name_0_0= 'Within' ) ) ( (lv_value_1_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:410:3: ( ( (lv_name_0_0= 'Within' ) ) ( (lv_value_1_0= ruleSelector ) ) )
                    // InternalSpec.g:411:4: ( (lv_name_0_0= 'Within' ) ) ( (lv_value_1_0= ruleSelector ) )
                    {
                    // InternalSpec.g:411:4: ( (lv_name_0_0= 'Within' ) )
                    // InternalSpec.g:412:5: (lv_name_0_0= 'Within' )
                    {
                    // InternalSpec.g:412:5: (lv_name_0_0= 'Within' )
                    // InternalSpec.g:413:6: lv_name_0_0= 'Within'
                    {
                    lv_name_0_0=(Token)match(input,16,FOLLOW_6); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getSelectCommandAccess().getNameWithinKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectCommandRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_0, "Within");
                    					

                    }


                    }

                    // InternalSpec.g:425:4: ( (lv_value_1_0= ruleSelector ) )
                    // InternalSpec.g:426:5: (lv_value_1_0= ruleSelector )
                    {
                    // InternalSpec.g:426:5: (lv_value_1_0= ruleSelector )
                    // InternalSpec.g:427:6: lv_value_1_0= ruleSelector
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
                    // InternalSpec.g:446:3: ( ( (lv_name_2_0= 'Select' ) ) (otherlv_3= 'visible' )? ( (lv_value_4_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:446:3: ( ( (lv_name_2_0= 'Select' ) ) (otherlv_3= 'visible' )? ( (lv_value_4_0= ruleSelector ) ) )
                    // InternalSpec.g:447:4: ( (lv_name_2_0= 'Select' ) ) (otherlv_3= 'visible' )? ( (lv_value_4_0= ruleSelector ) )
                    {
                    // InternalSpec.g:447:4: ( (lv_name_2_0= 'Select' ) )
                    // InternalSpec.g:448:5: (lv_name_2_0= 'Select' )
                    {
                    // InternalSpec.g:448:5: (lv_name_2_0= 'Select' )
                    // InternalSpec.g:449:6: lv_name_2_0= 'Select'
                    {
                    lv_name_2_0=(Token)match(input,17,FOLLOW_8); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getSelectCommandAccess().getNameSelectKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectCommandRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_2_0, "Select");
                    					

                    }


                    }

                    // InternalSpec.g:461:4: (otherlv_3= 'visible' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==18) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSpec.g:462:5: otherlv_3= 'visible'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getSelectCommandAccess().getVisibleKeyword_1_1());
                            				

                            }
                            break;

                    }

                    // InternalSpec.g:467:4: ( (lv_value_4_0= ruleSelector ) )
                    // InternalSpec.g:468:5: (lv_value_4_0= ruleSelector )
                    {
                    // InternalSpec.g:468:5: (lv_value_4_0= ruleSelector )
                    // InternalSpec.g:469:6: lv_value_4_0= ruleSelector
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
    // InternalSpec.g:491:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalSpec.g:491:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalSpec.g:492:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalSpec.g:498:1: ruleSelector returns [EObject current=null] : ( ( (lv_type_0_0= ruleElementType ) )? ( (otherlv_1= '$' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_str_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_str_3_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:504:2: ( ( ( (lv_type_0_0= ruleElementType ) )? ( (otherlv_1= '$' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_str_3_0= RULE_STRING ) ) ) ) )
            // InternalSpec.g:505:2: ( ( (lv_type_0_0= ruleElementType ) )? ( (otherlv_1= '$' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_str_3_0= RULE_STRING ) ) ) )
            {
            // InternalSpec.g:505:2: ( ( (lv_type_0_0= ruleElementType ) )? ( (otherlv_1= '$' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_str_3_0= RULE_STRING ) ) ) )
            // InternalSpec.g:506:3: ( (lv_type_0_0= ruleElementType ) )? ( (otherlv_1= '$' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_str_3_0= RULE_STRING ) ) )
            {
            // InternalSpec.g:506:3: ( (lv_type_0_0= ruleElementType ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=38 && LA7_0<=42)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSpec.g:507:4: (lv_type_0_0= ruleElementType )
                    {
                    // InternalSpec.g:507:4: (lv_type_0_0= ruleElementType )
                    // InternalSpec.g:508:5: lv_type_0_0= ruleElementType
                    {

                    					newCompositeNode(grammarAccess.getSelectorAccess().getTypeElementTypeEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_4);
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

            // InternalSpec.g:525:3: ( (otherlv_1= '$' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_str_3_0= RULE_STRING ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
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
                    // InternalSpec.g:526:4: (otherlv_1= '$' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalSpec.g:526:4: (otherlv_1= '$' ( (otherlv_2= RULE_ID ) ) )
                    // InternalSpec.g:527:5: otherlv_1= '$' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_9); 

                    					newLeafNode(otherlv_1, grammarAccess.getSelectorAccess().getDollarSignKeyword_1_0_0());
                    				
                    // InternalSpec.g:531:5: ( (otherlv_2= RULE_ID ) )
                    // InternalSpec.g:532:6: (otherlv_2= RULE_ID )
                    {
                    // InternalSpec.g:532:6: (otherlv_2= RULE_ID )
                    // InternalSpec.g:533:7: otherlv_2= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSelectorRule());
                    							}
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getVarVariableCrossReference_1_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:546:4: ( (lv_str_3_0= RULE_STRING ) )
                    {
                    // InternalSpec.g:546:4: ( (lv_str_3_0= RULE_STRING ) )
                    // InternalSpec.g:547:5: (lv_str_3_0= RULE_STRING )
                    {
                    // InternalSpec.g:547:5: (lv_str_3_0= RULE_STRING )
                    // InternalSpec.g:548:6: lv_str_3_0= RULE_STRING
                    {
                    lv_str_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_str_3_0, grammarAccess.getSelectorAccess().getStrSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"str",
                    							lv_str_3_0,
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


    // $ANTLR start "entryRuleStoreCommand"
    // InternalSpec.g:569:1: entryRuleStoreCommand returns [EObject current=null] : iv_ruleStoreCommand= ruleStoreCommand EOF ;
    public final EObject entryRuleStoreCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreCommand = null;


        try {
            // InternalSpec.g:569:53: (iv_ruleStoreCommand= ruleStoreCommand EOF )
            // InternalSpec.g:570:2: iv_ruleStoreCommand= ruleStoreCommand EOF
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
    // InternalSpec.g:576:1: ruleStoreCommand returns [EObject current=null] : ( ( (lv_name_0_0= 'Store' ) ) ( (lv_var_1_0= ruleVariable ) ) otherlv_2= 'as' ( (lv_val_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleStoreCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_val_3_0=null;
        EObject lv_var_1_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:582:2: ( ( ( (lv_name_0_0= 'Store' ) ) ( (lv_var_1_0= ruleVariable ) ) otherlv_2= 'as' ( (lv_val_3_0= RULE_STRING ) ) ) )
            // InternalSpec.g:583:2: ( ( (lv_name_0_0= 'Store' ) ) ( (lv_var_1_0= ruleVariable ) ) otherlv_2= 'as' ( (lv_val_3_0= RULE_STRING ) ) )
            {
            // InternalSpec.g:583:2: ( ( (lv_name_0_0= 'Store' ) ) ( (lv_var_1_0= ruleVariable ) ) otherlv_2= 'as' ( (lv_val_3_0= RULE_STRING ) ) )
            // InternalSpec.g:584:3: ( (lv_name_0_0= 'Store' ) ) ( (lv_var_1_0= ruleVariable ) ) otherlv_2= 'as' ( (lv_val_3_0= RULE_STRING ) )
            {
            // InternalSpec.g:584:3: ( (lv_name_0_0= 'Store' ) )
            // InternalSpec.g:585:4: (lv_name_0_0= 'Store' )
            {
            // InternalSpec.g:585:4: (lv_name_0_0= 'Store' )
            // InternalSpec.g:586:5: lv_name_0_0= 'Store'
            {
            lv_name_0_0=(Token)match(input,20,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getStoreCommandAccess().getNameStoreKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreCommandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Store");
            				

            }


            }

            // InternalSpec.g:598:3: ( (lv_var_1_0= ruleVariable ) )
            // InternalSpec.g:599:4: (lv_var_1_0= ruleVariable )
            {
            // InternalSpec.g:599:4: (lv_var_1_0= ruleVariable )
            // InternalSpec.g:600:5: lv_var_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getStoreCommandAccess().getVarVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_var_1_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoreCommandRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.mde.spec.Spec.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreCommandAccess().getAsKeyword_2());
            		
            // InternalSpec.g:621:3: ( (lv_val_3_0= RULE_STRING ) )
            // InternalSpec.g:622:4: (lv_val_3_0= RULE_STRING )
            {
            // InternalSpec.g:622:4: (lv_val_3_0= RULE_STRING )
            // InternalSpec.g:623:5: lv_val_3_0= RULE_STRING
            {
            lv_val_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_3_0, grammarAccess.getStoreCommandAccess().getValSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreCommandRule());
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
    // InternalSpec.g:643:1: entryRuleRememberCommand returns [EObject current=null] : iv_ruleRememberCommand= ruleRememberCommand EOF ;
    public final EObject entryRuleRememberCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRememberCommand = null;


        try {
            // InternalSpec.g:643:56: (iv_ruleRememberCommand= ruleRememberCommand EOF )
            // InternalSpec.g:644:2: iv_ruleRememberCommand= ruleRememberCommand EOF
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
    // InternalSpec.g:650:1: ruleRememberCommand returns [EObject current=null] : ( ( (lv_name_0_0= 'Remember' ) ) ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= ruleVariable ) ) ) ;
    public final EObject ruleRememberCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_prop_1_0 = null;

        EObject lv_var_3_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:656:2: ( ( ( (lv_name_0_0= 'Remember' ) ) ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= ruleVariable ) ) ) )
            // InternalSpec.g:657:2: ( ( (lv_name_0_0= 'Remember' ) ) ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= ruleVariable ) ) )
            {
            // InternalSpec.g:657:2: ( ( (lv_name_0_0= 'Remember' ) ) ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= ruleVariable ) ) )
            // InternalSpec.g:658:3: ( (lv_name_0_0= 'Remember' ) ) ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= ruleVariable ) )
            {
            // InternalSpec.g:658:3: ( (lv_name_0_0= 'Remember' ) )
            // InternalSpec.g:659:4: (lv_name_0_0= 'Remember' )
            {
            // InternalSpec.g:659:4: (lv_name_0_0= 'Remember' )
            // InternalSpec.g:660:5: lv_name_0_0= 'Remember'
            {
            lv_name_0_0=(Token)match(input,22,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRememberCommandAccess().getNameRememberKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRememberCommandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Remember");
            				

            }


            }

            // InternalSpec.g:672:3: ( (lv_prop_1_0= ruleProperty ) )
            // InternalSpec.g:673:4: (lv_prop_1_0= ruleProperty )
            {
            // InternalSpec.g:673:4: (lv_prop_1_0= ruleProperty )
            // InternalSpec.g:674:5: lv_prop_1_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getRememberCommandAccess().getPropPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRememberCommandAccess().getAsKeyword_2());
            		
            // InternalSpec.g:695:3: ( (lv_var_3_0= ruleVariable ) )
            // InternalSpec.g:696:4: (lv_var_3_0= ruleVariable )
            {
            // InternalSpec.g:696:4: (lv_var_3_0= ruleVariable )
            // InternalSpec.g:697:5: lv_var_3_0= ruleVariable
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
    // InternalSpec.g:718:1: entryRulePropertyCommand returns [EObject current=null] : iv_rulePropertyCommand= rulePropertyCommand EOF ;
    public final EObject entryRulePropertyCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCommand = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSpec.g:720:2: (iv_rulePropertyCommand= rulePropertyCommand EOF )
            // InternalSpec.g:721:2: iv_rulePropertyCommand= rulePropertyCommand EOF
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePropertyCommand"


    // $ANTLR start "rulePropertyCommand"
    // InternalSpec.g:730:1: rulePropertyCommand returns [EObject current=null] : ( ( (lv_name_0_0= 'Property' ) ) ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( ( (lv_val_3_0= RULE_STRING ) ) | (otherlv_4= '$' ( (otherlv_5= RULE_ID ) ) ) ) ) ;
    public final EObject rulePropertyCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_val_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_prop_1_0 = null;

        AntlrDatatypeRuleToken lv_cond_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSpec.g:737:2: ( ( ( (lv_name_0_0= 'Property' ) ) ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( ( (lv_val_3_0= RULE_STRING ) ) | (otherlv_4= '$' ( (otherlv_5= RULE_ID ) ) ) ) ) )
            // InternalSpec.g:738:2: ( ( (lv_name_0_0= 'Property' ) ) ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( ( (lv_val_3_0= RULE_STRING ) ) | (otherlv_4= '$' ( (otherlv_5= RULE_ID ) ) ) ) )
            {
            // InternalSpec.g:738:2: ( ( (lv_name_0_0= 'Property' ) ) ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( ( (lv_val_3_0= RULE_STRING ) ) | (otherlv_4= '$' ( (otherlv_5= RULE_ID ) ) ) ) )
            // InternalSpec.g:739:3: ( (lv_name_0_0= 'Property' ) ) ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( ( (lv_val_3_0= RULE_STRING ) ) | (otherlv_4= '$' ( (otherlv_5= RULE_ID ) ) ) )
            {
            // InternalSpec.g:739:3: ( (lv_name_0_0= 'Property' ) )
            // InternalSpec.g:740:4: (lv_name_0_0= 'Property' )
            {
            // InternalSpec.g:740:4: (lv_name_0_0= 'Property' )
            // InternalSpec.g:741:5: lv_name_0_0= 'Property'
            {
            lv_name_0_0=(Token)match(input,23,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPropertyCommandAccess().getNamePropertyKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyCommandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Property");
            				

            }


            }

            // InternalSpec.g:753:3: ( (lv_prop_1_0= ruleProperty ) )
            // InternalSpec.g:754:4: (lv_prop_1_0= ruleProperty )
            {
            // InternalSpec.g:754:4: (lv_prop_1_0= ruleProperty )
            // InternalSpec.g:755:5: lv_prop_1_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getPropertyCommandAccess().getPropPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalSpec.g:772:3: ( (lv_cond_2_0= ruleCondition ) )
            // InternalSpec.g:773:4: (lv_cond_2_0= ruleCondition )
            {
            // InternalSpec.g:773:4: (lv_cond_2_0= ruleCondition )
            // InternalSpec.g:774:5: lv_cond_2_0= ruleCondition
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

            // InternalSpec.g:791:3: ( ( (lv_val_3_0= RULE_STRING ) ) | (otherlv_4= '$' ( (otherlv_5= RULE_ID ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpec.g:792:4: ( (lv_val_3_0= RULE_STRING ) )
                    {
                    // InternalSpec.g:792:4: ( (lv_val_3_0= RULE_STRING ) )
                    // InternalSpec.g:793:5: (lv_val_3_0= RULE_STRING )
                    {
                    // InternalSpec.g:793:5: (lv_val_3_0= RULE_STRING )
                    // InternalSpec.g:794:6: lv_val_3_0= RULE_STRING
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
                    // InternalSpec.g:811:4: (otherlv_4= '$' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // InternalSpec.g:811:4: (otherlv_4= '$' ( (otherlv_5= RULE_ID ) ) )
                    // InternalSpec.g:812:5: otherlv_4= '$' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_9); 

                    					newLeafNode(otherlv_4, grammarAccess.getPropertyCommandAccess().getDollarSignKeyword_3_1_0());
                    				
                    // InternalSpec.g:816:5: ( (otherlv_5= RULE_ID ) )
                    // InternalSpec.g:817:6: (otherlv_5= RULE_ID )
                    {
                    // InternalSpec.g:817:6: (otherlv_5= RULE_ID )
                    // InternalSpec.g:818:7: otherlv_5= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPropertyCommandRule());
                    							}
                    						
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_5, grammarAccess.getPropertyCommandAccess().getVarVariableCrossReference_3_1_1_0());
                    						

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePropertyCommand"


    // $ANTLR start "entryRuleProperty"
    // InternalSpec.g:838:1: entryRuleProperty returns [String current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final String entryRuleProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProperty = null;


        try {
            // InternalSpec.g:838:48: (iv_ruleProperty= ruleProperty EOF )
            // InternalSpec.g:839:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalSpec.g:845:1: ruleProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'text' | kw= 'class' | kw= 'value' ) ;
    public final AntlrDatatypeRuleToken ruleProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpec.g:851:2: ( (kw= 'text' | kw= 'class' | kw= 'value' ) )
            // InternalSpec.g:852:2: (kw= 'text' | kw= 'class' | kw= 'value' )
            {
            // InternalSpec.g:852:2: (kw= 'text' | kw= 'class' | kw= 'value' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSpec.g:853:3: kw= 'text'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropertyAccess().getTextKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSpec.g:859:3: kw= 'class'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropertyAccess().getClassKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSpec.g:865:3: kw= 'value'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

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
    // InternalSpec.g:874:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalSpec.g:874:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalSpec.g:875:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalSpec.g:881:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) ) ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpec.g:887:2: ( ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) ) )
            // InternalSpec.g:888:2: ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) )
            {
            // InternalSpec.g:888:2: ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==28) ) {
                    alt11=1;
                }
                else if ( (LA11_1==29) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpec.g:889:3: (kw= 'should' kw= 'be' )
                    {
                    // InternalSpec.g:889:3: (kw= 'should' kw= 'be' )
                    // InternalSpec.g:890:4: kw= 'should' kw= 'be'
                    {
                    kw=(Token)match(input,27,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getShouldKeyword_0_0());
                    			
                    kw=(Token)match(input,28,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getBeKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:902:3: (kw= 'should' kw= 'not' kw= 'be' )
                    {
                    // InternalSpec.g:902:3: (kw= 'should' kw= 'not' kw= 'be' )
                    // InternalSpec.g:903:4: kw= 'should' kw= 'not' kw= 'be'
                    {
                    kw=(Token)match(input,27,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getShouldKeyword_1_0());
                    			
                    kw=(Token)match(input,29,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getNotKeyword_1_1());
                    			
                    kw=(Token)match(input,28,FOLLOW_2); 

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
    // InternalSpec.g:923:1: entryRuleTypeCommand returns [EObject current=null] : iv_ruleTypeCommand= ruleTypeCommand EOF ;
    public final EObject entryRuleTypeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCommand = null;


        try {
            // InternalSpec.g:923:52: (iv_ruleTypeCommand= ruleTypeCommand EOF )
            // InternalSpec.g:924:2: iv_ruleTypeCommand= ruleTypeCommand EOF
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
    // InternalSpec.g:930:1: ruleTypeCommand returns [EObject current=null] : ( ( (lv_name_0_0= 'Type' ) ) ( ( (lv_str_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleTypeCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_str_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSpec.g:936:2: ( ( ( (lv_name_0_0= 'Type' ) ) ( ( (lv_str_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalSpec.g:937:2: ( ( (lv_name_0_0= 'Type' ) ) ( ( (lv_str_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalSpec.g:937:2: ( ( (lv_name_0_0= 'Type' ) ) ( ( (lv_str_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalSpec.g:938:3: ( (lv_name_0_0= 'Type' ) ) ( ( (lv_str_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalSpec.g:938:3: ( (lv_name_0_0= 'Type' ) )
            // InternalSpec.g:939:4: (lv_name_0_0= 'Type' )
            {
            // InternalSpec.g:939:4: (lv_name_0_0= 'Type' )
            // InternalSpec.g:940:5: lv_name_0_0= 'Type'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTypeCommandAccess().getNameTypeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeCommandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Type");
            				

            }


            }

            // InternalSpec.g:952:3: ( ( (lv_str_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpec.g:953:4: ( (lv_str_1_0= RULE_STRING ) )
                    {
                    // InternalSpec.g:953:4: ( (lv_str_1_0= RULE_STRING ) )
                    // InternalSpec.g:954:5: (lv_str_1_0= RULE_STRING )
                    {
                    // InternalSpec.g:954:5: (lv_str_1_0= RULE_STRING )
                    // InternalSpec.g:955:6: lv_str_1_0= RULE_STRING
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
                    // InternalSpec.g:972:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalSpec.g:972:4: ( (otherlv_2= RULE_ID ) )
                    // InternalSpec.g:973:5: (otherlv_2= RULE_ID )
                    {
                    // InternalSpec.g:973:5: (otherlv_2= RULE_ID )
                    // InternalSpec.g:974:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeCommandRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getTypeCommandAccess().getVarVariableCrossReference_1_1_0());
                    					

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
    // InternalSpec.g:990:1: entryRuleSleepCommand returns [EObject current=null] : iv_ruleSleepCommand= ruleSleepCommand EOF ;
    public final EObject entryRuleSleepCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSleepCommand = null;


        try {
            // InternalSpec.g:990:53: (iv_ruleSleepCommand= ruleSleepCommand EOF )
            // InternalSpec.g:991:2: iv_ruleSleepCommand= ruleSleepCommand EOF
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
    // InternalSpec.g:997:1: ruleSleepCommand returns [EObject current=null] : ( ( (lv_name_0_0= 'Sleep' ) ) otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) ) ;
    public final EObject ruleSleepCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_time_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSpec.g:1003:2: ( ( ( (lv_name_0_0= 'Sleep' ) ) otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) ) )
            // InternalSpec.g:1004:2: ( ( (lv_name_0_0= 'Sleep' ) ) otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) )
            {
            // InternalSpec.g:1004:2: ( ( (lv_name_0_0= 'Sleep' ) ) otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) )
            // InternalSpec.g:1005:3: ( (lv_name_0_0= 'Sleep' ) ) otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' )
            {
            // InternalSpec.g:1005:3: ( (lv_name_0_0= 'Sleep' ) )
            // InternalSpec.g:1006:4: (lv_name_0_0= 'Sleep' )
            {
            // InternalSpec.g:1006:4: (lv_name_0_0= 'Sleep' )
            // InternalSpec.g:1007:5: lv_name_0_0= 'Sleep'
            {
            lv_name_0_0=(Token)match(input,31,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSleepCommandAccess().getNameSleepKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSleepCommandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Sleep");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSleepCommandAccess().getForKeyword_1());
            		
            // InternalSpec.g:1023:3: ( (lv_time_2_0= RULE_INT ) )
            // InternalSpec.g:1024:4: (lv_time_2_0= RULE_INT )
            {
            // InternalSpec.g:1024:4: (lv_time_2_0= RULE_INT )
            // InternalSpec.g:1025:5: lv_time_2_0= RULE_INT
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

            // InternalSpec.g:1041:3: (otherlv_3= 'second' | otherlv_4= 'seconds' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            else if ( (LA13_0==34) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSpec.g:1042:4: otherlv_3= 'second'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSpec.g:1047:4: otherlv_4= 'seconds'
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_2); 

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
    // InternalSpec.g:1056:1: entryRulePoint returns [String current=null] : iv_rulePoint= rulePoint EOF ;
    public final String entryRulePoint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePoint = null;


        try {
            // InternalSpec.g:1056:45: (iv_rulePoint= rulePoint EOF )
            // InternalSpec.g:1057:2: iv_rulePoint= rulePoint EOF
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
    // InternalSpec.g:1063:1: rulePoint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulePoint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalSpec.g:1069:2: ( (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' ) )
            // InternalSpec.g:1070:2: (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' )
            {
            // InternalSpec.g:1070:2: (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' )
            // InternalSpec.g:1071:3: kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}'
            {
            kw=(Token)match(input,35,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPointAccess().getLeftCurlyBracketKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_20); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getPointAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,36,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPointAccess().getCommaKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_21); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getPointAccess().getINTTerminalRuleCall_3());
            		
            kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalSpec.g:1104:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSpec.g:1104:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSpec.g:1105:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalSpec.g:1111:1: ruleVariable returns [EObject current=null] : (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSpec.g:1117:2: ( (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSpec.g:1118:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSpec.g:1118:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSpec.g:1119:3: otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getDollarSignKeyword_0());
            		
            // InternalSpec.g:1123:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpec.g:1124:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpec.g:1124:4: (lv_name_1_0= RULE_ID )
            // InternalSpec.g:1125:5: lv_name_1_0= RULE_ID
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
    // InternalSpec.g:1145:1: ruleElementType returns [Enumerator current=null] : ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) ) ;
    public final Enumerator ruleElementType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSpec.g:1151:2: ( ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) ) )
            // InternalSpec.g:1152:2: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) )
            {
            // InternalSpec.g:1152:2: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt14=1;
                }
                break;
            case 39:
                {
                alt14=2;
                }
                break;
            case 40:
                {
                alt14=3;
                }
                break;
            case 41:
                {
                alt14=4;
                }
                break;
            case 42:
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
                    // InternalSpec.g:1153:3: (enumLiteral_0= 'button' )
                    {
                    // InternalSpec.g:1153:3: (enumLiteral_0= 'button' )
                    // InternalSpec.g:1154:4: enumLiteral_0= 'button'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:1161:3: (enumLiteral_1= 'element' )
                    {
                    // InternalSpec.g:1161:3: (enumLiteral_1= 'element' )
                    // InternalSpec.g:1162:4: enumLiteral_1= 'element'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:1169:3: (enumLiteral_2= 'link' )
                    {
                    // InternalSpec.g:1169:3: (enumLiteral_2= 'link' )
                    // InternalSpec.g:1170:4: enumLiteral_2= 'link'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:1177:3: (enumLiteral_3= 'input' )
                    {
                    // InternalSpec.g:1177:3: (enumLiteral_3= 'input' )
                    // InternalSpec.g:1178:4: enumLiteral_3= 'input'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:1185:3: (enumLiteral_4= 'textarea' )
                    {
                    // InternalSpec.g:1185:3: (enumLiteral_4= 'textarea' )
                    // InternalSpec.g:1186:4: enumLiteral_4= 'textarea'
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000C0D33032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000007C000080040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000007C0000C0040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});

}
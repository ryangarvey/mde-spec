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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Open'", "'Click'", "'on'", "'at'", "'#'", "'Within'", "'Select'", "'visible'", "'Remember'", "'as'", "'Property'", "'Type'", "'Sleep'", "'for'", "'second'", "'seconds'", "'!'", "'text'", "'class'", "'value'", "'should'", "'be'", "'not'", "'{'", "','", "'}'", "'$'", "'button'", "'element'", "'link'", "'input'", "'textarea'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=15 && LA1_0<=17)||LA1_0==19||(LA1_0>=21 && LA1_0<=23)||LA1_0==27) ) {
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
    // InternalSpec.g:108:1: ruleCommand returns [EObject current=null] : (this_OpenCommand_0= ruleOpenCommand | this_ClickCommand_1= ruleClickCommand | this_CommentCommand_2= ruleCommentCommand | this_SelectCommand_3= ruleSelectCommand | this_RememberCommand_4= ruleRememberCommand | this_PropertyCommand_5= rulePropertyCommand | this_TypeCommand_6= ruleTypeCommand | this_SleepCommand_7= ruleSleepCommand | this_CustomCommand_8= ruleCustomCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_OpenCommand_0 = null;

        EObject this_ClickCommand_1 = null;

        EObject this_CommentCommand_2 = null;

        EObject this_SelectCommand_3 = null;

        EObject this_RememberCommand_4 = null;

        EObject this_PropertyCommand_5 = null;

        EObject this_TypeCommand_6 = null;

        EObject this_SleepCommand_7 = null;

        EObject this_CustomCommand_8 = null;



        	enterRule();

        try {
            // InternalSpec.g:114:2: ( (this_OpenCommand_0= ruleOpenCommand | this_ClickCommand_1= ruleClickCommand | this_CommentCommand_2= ruleCommentCommand | this_SelectCommand_3= ruleSelectCommand | this_RememberCommand_4= ruleRememberCommand | this_PropertyCommand_5= rulePropertyCommand | this_TypeCommand_6= ruleTypeCommand | this_SleepCommand_7= ruleSleepCommand | this_CustomCommand_8= ruleCustomCommand ) )
            // InternalSpec.g:115:2: (this_OpenCommand_0= ruleOpenCommand | this_ClickCommand_1= ruleClickCommand | this_CommentCommand_2= ruleCommentCommand | this_SelectCommand_3= ruleSelectCommand | this_RememberCommand_4= ruleRememberCommand | this_PropertyCommand_5= rulePropertyCommand | this_TypeCommand_6= ruleTypeCommand | this_SleepCommand_7= ruleSleepCommand | this_CustomCommand_8= ruleCustomCommand )
            {
            // InternalSpec.g:115:2: (this_OpenCommand_0= ruleOpenCommand | this_ClickCommand_1= ruleClickCommand | this_CommentCommand_2= ruleCommentCommand | this_SelectCommand_3= ruleSelectCommand | this_RememberCommand_4= ruleRememberCommand | this_PropertyCommand_5= rulePropertyCommand | this_TypeCommand_6= ruleTypeCommand | this_SleepCommand_7= ruleSleepCommand | this_CustomCommand_8= ruleCustomCommand )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 15:
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
            case 19:
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
            case 23:
                {
                alt2=8;
                }
                break;
            case 27:
                {
                alt2=9;
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
                    // InternalSpec.g:134:3: this_CommentCommand_2= ruleCommentCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCommentCommandParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommentCommand_2=ruleCommentCommand();

                    state._fsp--;


                    			current = this_CommentCommand_2;
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
                    // InternalSpec.g:188:3: this_CustomCommand_8= ruleCustomCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCustomCommandParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomCommand_8=ruleCustomCommand();

                    state._fsp--;


                    			current = this_CustomCommand_8;
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


    // $ANTLR start "entryRuleOpenCommand"
    // InternalSpec.g:200:1: entryRuleOpenCommand returns [EObject current=null] : iv_ruleOpenCommand= ruleOpenCommand EOF ;
    public final EObject entryRuleOpenCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenCommand = null;


        try {
            // InternalSpec.g:200:52: (iv_ruleOpenCommand= ruleOpenCommand EOF )
            // InternalSpec.g:201:2: iv_ruleOpenCommand= ruleOpenCommand EOF
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
    // InternalSpec.g:207:1: ruleOpenCommand returns [EObject current=null] : (otherlv_0= 'Open' ( (lv_value_1_0= ruleValue ) ) ) ;
    public final EObject ruleOpenCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:213:2: ( (otherlv_0= 'Open' ( (lv_value_1_0= ruleValue ) ) ) )
            // InternalSpec.g:214:2: (otherlv_0= 'Open' ( (lv_value_1_0= ruleValue ) ) )
            {
            // InternalSpec.g:214:2: (otherlv_0= 'Open' ( (lv_value_1_0= ruleValue ) ) )
            // InternalSpec.g:215:3: otherlv_0= 'Open' ( (lv_value_1_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpenCommandAccess().getOpenKeyword_0());
            		
            // InternalSpec.g:219:3: ( (lv_value_1_0= ruleValue ) )
            // InternalSpec.g:220:4: (lv_value_1_0= ruleValue )
            {
            // InternalSpec.g:220:4: (lv_value_1_0= ruleValue )
            // InternalSpec.g:221:5: lv_value_1_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getOpenCommandAccess().getValueValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpenCommandRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.mde.spec.Spec.Value");
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


    // $ANTLR start "entryRuleClickCommand"
    // InternalSpec.g:242:1: entryRuleClickCommand returns [EObject current=null] : iv_ruleClickCommand= ruleClickCommand EOF ;
    public final EObject entryRuleClickCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickCommand = null;


        try {
            // InternalSpec.g:242:53: (iv_ruleClickCommand= ruleClickCommand EOF )
            // InternalSpec.g:243:2: iv_ruleClickCommand= ruleClickCommand EOF
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
    // InternalSpec.g:249:1: ruleClickCommand returns [EObject current=null] : ( ( (lv_cmd_0_0= 'Click' ) ) | (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) ) | (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) ) ) ;
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
            // InternalSpec.g:255:2: ( ( ( (lv_cmd_0_0= 'Click' ) ) | (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) ) | (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) ) ) )
            // InternalSpec.g:256:2: ( ( (lv_cmd_0_0= 'Click' ) ) | (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) ) | (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) ) )
            {
            // InternalSpec.g:256:2: ( ( (lv_cmd_0_0= 'Click' ) ) | (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) ) | (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    alt3=2;
                    }
                    break;
                case 14:
                    {
                    alt3=3;
                    }
                    break;
                case EOF:
                case 11:
                case 12:
                case 15:
                case 16:
                case 17:
                case 19:
                case 21:
                case 22:
                case 23:
                case 27:
                    {
                    alt3=1;
                    }
                    break;
                default:
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
                    // InternalSpec.g:257:3: ( (lv_cmd_0_0= 'Click' ) )
                    {
                    // InternalSpec.g:257:3: ( (lv_cmd_0_0= 'Click' ) )
                    // InternalSpec.g:258:4: (lv_cmd_0_0= 'Click' )
                    {
                    // InternalSpec.g:258:4: (lv_cmd_0_0= 'Click' )
                    // InternalSpec.g:259:5: lv_cmd_0_0= 'Click'
                    {
                    lv_cmd_0_0=(Token)match(input,12,FOLLOW_2); 

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
                    // InternalSpec.g:272:3: (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:272:3: (otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) ) )
                    // InternalSpec.g:273:4: otherlv_1= 'Click' otherlv_2= 'on' ( (lv_selector_3_0= ruleSelector ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getClickCommandAccess().getClickKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getClickCommandAccess().getOnKeyword_1_1());
                    			
                    // InternalSpec.g:281:4: ( (lv_selector_3_0= ruleSelector ) )
                    // InternalSpec.g:282:5: (lv_selector_3_0= ruleSelector )
                    {
                    // InternalSpec.g:282:5: (lv_selector_3_0= ruleSelector )
                    // InternalSpec.g:283:6: lv_selector_3_0= ruleSelector
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
                    // InternalSpec.g:302:3: (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) )
                    {
                    // InternalSpec.g:302:3: (otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) ) )
                    // InternalSpec.g:303:4: otherlv_4= 'Click' otherlv_5= 'at' ( (lv_point_6_0= rulePoint ) )
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getClickCommandAccess().getClickKeyword_2_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getClickCommandAccess().getAtKeyword_2_1());
                    			
                    // InternalSpec.g:311:4: ( (lv_point_6_0= rulePoint ) )
                    // InternalSpec.g:312:5: (lv_point_6_0= rulePoint )
                    {
                    // InternalSpec.g:312:5: (lv_point_6_0= rulePoint )
                    // InternalSpec.g:313:6: lv_point_6_0= rulePoint
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


    // $ANTLR start "entryRuleCommentCommand"
    // InternalSpec.g:335:1: entryRuleCommentCommand returns [EObject current=null] : iv_ruleCommentCommand= ruleCommentCommand EOF ;
    public final EObject entryRuleCommentCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentCommand = null;


        try {
            // InternalSpec.g:335:55: (iv_ruleCommentCommand= ruleCommentCommand EOF )
            // InternalSpec.g:336:2: iv_ruleCommentCommand= ruleCommentCommand EOF
            {
             newCompositeNode(grammarAccess.getCommentCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommentCommand=ruleCommentCommand();

            state._fsp--;

             current =iv_ruleCommentCommand; 
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
    // $ANTLR end "entryRuleCommentCommand"


    // $ANTLR start "ruleCommentCommand"
    // InternalSpec.g:342:1: ruleCommentCommand returns [EObject current=null] : (otherlv_0= '#' ( (lv_str_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCommentCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_str_1_0=null;


        	enterRule();

        try {
            // InternalSpec.g:348:2: ( (otherlv_0= '#' ( (lv_str_1_0= RULE_STRING ) ) ) )
            // InternalSpec.g:349:2: (otherlv_0= '#' ( (lv_str_1_0= RULE_STRING ) ) )
            {
            // InternalSpec.g:349:2: (otherlv_0= '#' ( (lv_str_1_0= RULE_STRING ) ) )
            // InternalSpec.g:350:3: otherlv_0= '#' ( (lv_str_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentCommandAccess().getNumberSignKeyword_0());
            		
            // InternalSpec.g:354:3: ( (lv_str_1_0= RULE_STRING ) )
            // InternalSpec.g:355:4: (lv_str_1_0= RULE_STRING )
            {
            // InternalSpec.g:355:4: (lv_str_1_0= RULE_STRING )
            // InternalSpec.g:356:5: lv_str_1_0= RULE_STRING
            {
            lv_str_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_str_1_0, grammarAccess.getCommentCommandAccess().getStrSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentCommandRule());
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
    // $ANTLR end "ruleCommentCommand"


    // $ANTLR start "entryRuleSelectCommand"
    // InternalSpec.g:376:1: entryRuleSelectCommand returns [EObject current=null] : iv_ruleSelectCommand= ruleSelectCommand EOF ;
    public final EObject entryRuleSelectCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCommand = null;


        try {
            // InternalSpec.g:376:54: (iv_ruleSelectCommand= ruleSelectCommand EOF )
            // InternalSpec.g:377:2: iv_ruleSelectCommand= ruleSelectCommand EOF
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
    // InternalSpec.g:383:1: ruleSelectCommand returns [EObject current=null] : ( (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) ) | (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) ) | (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) ) ) ;
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
            // InternalSpec.g:389:2: ( ( (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) ) | (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) ) | (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) ) ) )
            // InternalSpec.g:390:2: ( (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) ) | (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) ) | (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) ) )
            {
            // InternalSpec.g:390:2: ( (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) ) | (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) ) | (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==18) ) {
                    alt4=3;
                }
                else if ( (LA4_2==RULE_STRING||(LA4_2>=37 && LA4_2<=42)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

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
                    // InternalSpec.g:391:3: (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:391:3: (otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) ) )
                    // InternalSpec.g:392:4: otherlv_0= 'Within' ( (lv_value_1_0= ruleSelector ) )
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getSelectCommandAccess().getWithinKeyword_0_0());
                    			
                    // InternalSpec.g:396:4: ( (lv_value_1_0= ruleSelector ) )
                    // InternalSpec.g:397:5: (lv_value_1_0= ruleSelector )
                    {
                    // InternalSpec.g:397:5: (lv_value_1_0= ruleSelector )
                    // InternalSpec.g:398:6: lv_value_1_0= ruleSelector
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
                    // InternalSpec.g:417:3: (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:417:3: (otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) ) )
                    // InternalSpec.g:418:4: otherlv_2= 'Select' ( (lv_value_3_0= ruleSelector ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getSelectCommandAccess().getSelectKeyword_1_0());
                    			
                    // InternalSpec.g:422:4: ( (lv_value_3_0= ruleSelector ) )
                    // InternalSpec.g:423:5: (lv_value_3_0= ruleSelector )
                    {
                    // InternalSpec.g:423:5: (lv_value_3_0= ruleSelector )
                    // InternalSpec.g:424:6: lv_value_3_0= ruleSelector
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
                    // InternalSpec.g:443:3: (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) )
                    {
                    // InternalSpec.g:443:3: (otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) ) )
                    // InternalSpec.g:444:4: otherlv_4= 'Select' otherlv_5= 'visible' ( (lv_value_6_0= ruleSelector ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getSelectCommandAccess().getSelectKeyword_2_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getSelectCommandAccess().getVisibleKeyword_2_1());
                    			
                    // InternalSpec.g:452:4: ( (lv_value_6_0= ruleSelector ) )
                    // InternalSpec.g:453:5: (lv_value_6_0= ruleSelector )
                    {
                    // InternalSpec.g:453:5: (lv_value_6_0= ruleSelector )
                    // InternalSpec.g:454:6: lv_value_6_0= ruleSelector
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


    // $ANTLR start "entryRuleRememberCommand"
    // InternalSpec.g:476:1: entryRuleRememberCommand returns [EObject current=null] : iv_ruleRememberCommand= ruleRememberCommand EOF ;
    public final EObject entryRuleRememberCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRememberCommand = null;


        try {
            // InternalSpec.g:476:56: (iv_ruleRememberCommand= ruleRememberCommand EOF )
            // InternalSpec.g:477:2: iv_ruleRememberCommand= ruleRememberCommand EOF
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
    // InternalSpec.g:483:1: ruleRememberCommand returns [EObject current=null] : (otherlv_0= 'Remember' ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= ruleVariable ) ) ) ;
    public final EObject ruleRememberCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_prop_1_0 = null;

        EObject lv_var_3_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:489:2: ( (otherlv_0= 'Remember' ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= ruleVariable ) ) ) )
            // InternalSpec.g:490:2: (otherlv_0= 'Remember' ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= ruleVariable ) ) )
            {
            // InternalSpec.g:490:2: (otherlv_0= 'Remember' ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= ruleVariable ) ) )
            // InternalSpec.g:491:3: otherlv_0= 'Remember' ( (lv_prop_1_0= ruleProperty ) ) otherlv_2= 'as' ( (lv_var_3_0= ruleVariable ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRememberCommandAccess().getRememberKeyword_0());
            		
            // InternalSpec.g:495:3: ( (lv_prop_1_0= ruleProperty ) )
            // InternalSpec.g:496:4: (lv_prop_1_0= ruleProperty )
            {
            // InternalSpec.g:496:4: (lv_prop_1_0= ruleProperty )
            // InternalSpec.g:497:5: lv_prop_1_0= ruleProperty
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

            otherlv_2=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRememberCommandAccess().getAsKeyword_2());
            		
            // InternalSpec.g:518:3: ( (lv_var_3_0= ruleVariable ) )
            // InternalSpec.g:519:4: (lv_var_3_0= ruleVariable )
            {
            // InternalSpec.g:519:4: (lv_var_3_0= ruleVariable )
            // InternalSpec.g:520:5: lv_var_3_0= ruleVariable
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
    // InternalSpec.g:541:1: entryRulePropertyCommand returns [EObject current=null] : iv_rulePropertyCommand= rulePropertyCommand EOF ;
    public final EObject entryRulePropertyCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCommand = null;


        try {
            // InternalSpec.g:541:56: (iv_rulePropertyCommand= rulePropertyCommand EOF )
            // InternalSpec.g:542:2: iv_rulePropertyCommand= rulePropertyCommand EOF
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
    // InternalSpec.g:548:1: rulePropertyCommand returns [EObject current=null] : (otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= ruleValue ) ) ) ;
    public final EObject rulePropertyCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_prop_1_0 = null;

        AntlrDatatypeRuleToken lv_cond_2_0 = null;

        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:554:2: ( (otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= ruleValue ) ) ) )
            // InternalSpec.g:555:2: (otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= ruleValue ) ) )
            {
            // InternalSpec.g:555:2: (otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= ruleValue ) ) )
            // InternalSpec.g:556:3: otherlv_0= 'Property' ( (lv_prop_1_0= ruleProperty ) ) ( (lv_cond_2_0= ruleCondition ) ) ( (lv_val_3_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyCommandAccess().getPropertyKeyword_0());
            		
            // InternalSpec.g:560:3: ( (lv_prop_1_0= ruleProperty ) )
            // InternalSpec.g:561:4: (lv_prop_1_0= ruleProperty )
            {
            // InternalSpec.g:561:4: (lv_prop_1_0= ruleProperty )
            // InternalSpec.g:562:5: lv_prop_1_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getPropertyCommandAccess().getPropPropertyParserRuleCall_1_0());
            				
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

            // InternalSpec.g:579:3: ( (lv_cond_2_0= ruleCondition ) )
            // InternalSpec.g:580:4: (lv_cond_2_0= ruleCondition )
            {
            // InternalSpec.g:580:4: (lv_cond_2_0= ruleCondition )
            // InternalSpec.g:581:5: lv_cond_2_0= ruleCondition
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

            // InternalSpec.g:598:3: ( (lv_val_3_0= ruleValue ) )
            // InternalSpec.g:599:4: (lv_val_3_0= ruleValue )
            {
            // InternalSpec.g:599:4: (lv_val_3_0= ruleValue )
            // InternalSpec.g:600:5: lv_val_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getPropertyCommandAccess().getValValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyCommandRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_3_0,
            						"org.mde.spec.Spec.Value");
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


    // $ANTLR start "entryRuleTypeCommand"
    // InternalSpec.g:621:1: entryRuleTypeCommand returns [EObject current=null] : iv_ruleTypeCommand= ruleTypeCommand EOF ;
    public final EObject entryRuleTypeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCommand = null;


        try {
            // InternalSpec.g:621:52: (iv_ruleTypeCommand= ruleTypeCommand EOF )
            // InternalSpec.g:622:2: iv_ruleTypeCommand= ruleTypeCommand EOF
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
    // InternalSpec.g:628:1: ruleTypeCommand returns [EObject current=null] : (otherlv_0= 'Type' ( (lv_val_1_0= ruleValue ) ) ) ;
    public final EObject ruleTypeCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:634:2: ( (otherlv_0= 'Type' ( (lv_val_1_0= ruleValue ) ) ) )
            // InternalSpec.g:635:2: (otherlv_0= 'Type' ( (lv_val_1_0= ruleValue ) ) )
            {
            // InternalSpec.g:635:2: (otherlv_0= 'Type' ( (lv_val_1_0= ruleValue ) ) )
            // InternalSpec.g:636:3: otherlv_0= 'Type' ( (lv_val_1_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeCommandAccess().getTypeKeyword_0());
            		
            // InternalSpec.g:640:3: ( (lv_val_1_0= ruleValue ) )
            // InternalSpec.g:641:4: (lv_val_1_0= ruleValue )
            {
            // InternalSpec.g:641:4: (lv_val_1_0= ruleValue )
            // InternalSpec.g:642:5: lv_val_1_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getTypeCommandAccess().getValValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeCommandRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.mde.spec.Spec.Value");
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
    // InternalSpec.g:663:1: entryRuleSleepCommand returns [EObject current=null] : iv_ruleSleepCommand= ruleSleepCommand EOF ;
    public final EObject entryRuleSleepCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSleepCommand = null;


        try {
            // InternalSpec.g:663:53: (iv_ruleSleepCommand= ruleSleepCommand EOF )
            // InternalSpec.g:664:2: iv_ruleSleepCommand= ruleSleepCommand EOF
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
    // InternalSpec.g:670:1: ruleSleepCommand returns [EObject current=null] : (otherlv_0= 'Sleep' otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) ) ;
    public final EObject ruleSleepCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_time_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSpec.g:676:2: ( (otherlv_0= 'Sleep' otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) ) )
            // InternalSpec.g:677:2: (otherlv_0= 'Sleep' otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) )
            {
            // InternalSpec.g:677:2: (otherlv_0= 'Sleep' otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' ) )
            // InternalSpec.g:678:3: otherlv_0= 'Sleep' otherlv_1= 'for' ( (lv_time_2_0= RULE_INT ) ) (otherlv_3= 'second' | otherlv_4= 'seconds' )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSleepCommandAccess().getSleepKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSleepCommandAccess().getForKeyword_1());
            		
            // InternalSpec.g:686:3: ( (lv_time_2_0= RULE_INT ) )
            // InternalSpec.g:687:4: (lv_time_2_0= RULE_INT )
            {
            // InternalSpec.g:687:4: (lv_time_2_0= RULE_INT )
            // InternalSpec.g:688:5: lv_time_2_0= RULE_INT
            {
            lv_time_2_0=(Token)match(input,RULE_INT,FOLLOW_17); 

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

            // InternalSpec.g:704:3: (otherlv_3= 'second' | otherlv_4= 'seconds' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            else if ( (LA5_0==26) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpec.g:705:4: otherlv_3= 'second'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSpec.g:710:4: otherlv_4= 'seconds'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCustomCommand"
    // InternalSpec.g:719:1: entryRuleCustomCommand returns [EObject current=null] : iv_ruleCustomCommand= ruleCustomCommand EOF ;
    public final EObject entryRuleCustomCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomCommand = null;


        try {
            // InternalSpec.g:719:54: (iv_ruleCustomCommand= ruleCustomCommand EOF )
            // InternalSpec.g:720:2: iv_ruleCustomCommand= ruleCustomCommand EOF
            {
             newCompositeNode(grammarAccess.getCustomCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomCommand=ruleCustomCommand();

            state._fsp--;

             current =iv_ruleCustomCommand; 
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
    // $ANTLR end "entryRuleCustomCommand"


    // $ANTLR start "ruleCustomCommand"
    // InternalSpec.g:726:1: ruleCustomCommand returns [EObject current=null] : (otherlv_0= '!' ( (lv_command_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_command_1_0=null;


        	enterRule();

        try {
            // InternalSpec.g:732:2: ( (otherlv_0= '!' ( (lv_command_1_0= RULE_STRING ) ) ) )
            // InternalSpec.g:733:2: (otherlv_0= '!' ( (lv_command_1_0= RULE_STRING ) ) )
            {
            // InternalSpec.g:733:2: (otherlv_0= '!' ( (lv_command_1_0= RULE_STRING ) ) )
            // InternalSpec.g:734:3: otherlv_0= '!' ( (lv_command_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomCommandAccess().getExclamationMarkKeyword_0());
            		
            // InternalSpec.g:738:3: ( (lv_command_1_0= RULE_STRING ) )
            // InternalSpec.g:739:4: (lv_command_1_0= RULE_STRING )
            {
            // InternalSpec.g:739:4: (lv_command_1_0= RULE_STRING )
            // InternalSpec.g:740:5: lv_command_1_0= RULE_STRING
            {
            lv_command_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_command_1_0, grammarAccess.getCustomCommandAccess().getCommandSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"command",
            						lv_command_1_0,
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
    // $ANTLR end "ruleCustomCommand"


    // $ANTLR start "entryRuleSelector"
    // InternalSpec.g:760:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalSpec.g:760:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalSpec.g:761:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalSpec.g:767:1: ruleSelector returns [EObject current=null] : ( ( (lv_val_0_0= RULE_STRING ) ) | ( ( (lv_type_1_0= ruleElementType ) ) ( (lv_val_2_0= RULE_STRING ) ) ) | ( (lv_var_3_0= ruleVariable ) ) | ( ( (lv_type_4_0= ruleElementType ) ) ( (lv_var_5_0= ruleVariable ) ) ) ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        Token lv_val_2_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_var_3_0 = null;

        Enumerator lv_type_4_0 = null;

        EObject lv_var_5_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:773:2: ( ( ( (lv_val_0_0= RULE_STRING ) ) | ( ( (lv_type_1_0= ruleElementType ) ) ( (lv_val_2_0= RULE_STRING ) ) ) | ( (lv_var_3_0= ruleVariable ) ) | ( ( (lv_type_4_0= ruleElementType ) ) ( (lv_var_5_0= ruleVariable ) ) ) ) )
            // InternalSpec.g:774:2: ( ( (lv_val_0_0= RULE_STRING ) ) | ( ( (lv_type_1_0= ruleElementType ) ) ( (lv_val_2_0= RULE_STRING ) ) ) | ( (lv_var_3_0= ruleVariable ) ) | ( ( (lv_type_4_0= ruleElementType ) ) ( (lv_var_5_0= ruleVariable ) ) ) )
            {
            // InternalSpec.g:774:2: ( ( (lv_val_0_0= RULE_STRING ) ) | ( ( (lv_type_1_0= ruleElementType ) ) ( (lv_val_2_0= RULE_STRING ) ) ) | ( (lv_var_3_0= ruleVariable ) ) | ( ( (lv_type_4_0= ruleElementType ) ) ( (lv_var_5_0= ruleVariable ) ) ) )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalSpec.g:775:3: ( (lv_val_0_0= RULE_STRING ) )
                    {
                    // InternalSpec.g:775:3: ( (lv_val_0_0= RULE_STRING ) )
                    // InternalSpec.g:776:4: (lv_val_0_0= RULE_STRING )
                    {
                    // InternalSpec.g:776:4: (lv_val_0_0= RULE_STRING )
                    // InternalSpec.g:777:5: lv_val_0_0= RULE_STRING
                    {
                    lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_val_0_0, grammarAccess.getSelectorAccess().getValSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSelectorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"val",
                    						lv_val_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:794:3: ( ( (lv_type_1_0= ruleElementType ) ) ( (lv_val_2_0= RULE_STRING ) ) )
                    {
                    // InternalSpec.g:794:3: ( ( (lv_type_1_0= ruleElementType ) ) ( (lv_val_2_0= RULE_STRING ) ) )
                    // InternalSpec.g:795:4: ( (lv_type_1_0= ruleElementType ) ) ( (lv_val_2_0= RULE_STRING ) )
                    {
                    // InternalSpec.g:795:4: ( (lv_type_1_0= ruleElementType ) )
                    // InternalSpec.g:796:5: (lv_type_1_0= ruleElementType )
                    {
                    // InternalSpec.g:796:5: (lv_type_1_0= ruleElementType )
                    // InternalSpec.g:797:6: lv_type_1_0= ruleElementType
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getTypeElementTypeEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalSpec.g:814:4: ( (lv_val_2_0= RULE_STRING ) )
                    // InternalSpec.g:815:5: (lv_val_2_0= RULE_STRING )
                    {
                    // InternalSpec.g:815:5: (lv_val_2_0= RULE_STRING )
                    // InternalSpec.g:816:6: lv_val_2_0= RULE_STRING
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


                    }
                    break;
                case 3 :
                    // InternalSpec.g:834:3: ( (lv_var_3_0= ruleVariable ) )
                    {
                    // InternalSpec.g:834:3: ( (lv_var_3_0= ruleVariable ) )
                    // InternalSpec.g:835:4: (lv_var_3_0= ruleVariable )
                    {
                    // InternalSpec.g:835:4: (lv_var_3_0= ruleVariable )
                    // InternalSpec.g:836:5: lv_var_3_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getSelectorAccess().getVarVariableParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_var_3_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectorRule());
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
                case 4 :
                    // InternalSpec.g:854:3: ( ( (lv_type_4_0= ruleElementType ) ) ( (lv_var_5_0= ruleVariable ) ) )
                    {
                    // InternalSpec.g:854:3: ( ( (lv_type_4_0= ruleElementType ) ) ( (lv_var_5_0= ruleVariable ) ) )
                    // InternalSpec.g:855:4: ( (lv_type_4_0= ruleElementType ) ) ( (lv_var_5_0= ruleVariable ) )
                    {
                    // InternalSpec.g:855:4: ( (lv_type_4_0= ruleElementType ) )
                    // InternalSpec.g:856:5: (lv_type_4_0= ruleElementType )
                    {
                    // InternalSpec.g:856:5: (lv_type_4_0= ruleElementType )
                    // InternalSpec.g:857:6: lv_type_4_0= ruleElementType
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getTypeElementTypeEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalSpec.g:874:4: ( (lv_var_5_0= ruleVariable ) )
                    // InternalSpec.g:875:5: (lv_var_5_0= ruleVariable )
                    {
                    // InternalSpec.g:875:5: (lv_var_5_0= ruleVariable )
                    // InternalSpec.g:876:6: lv_var_5_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getVarVariableParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_var_5_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorRule());
                    						}
                    						set(
                    							current,
                    							"var",
                    							lv_var_5_0,
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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleProperty"
    // InternalSpec.g:898:1: entryRuleProperty returns [String current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final String entryRuleProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProperty = null;


        try {
            // InternalSpec.g:898:48: (iv_ruleProperty= ruleProperty EOF )
            // InternalSpec.g:899:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalSpec.g:905:1: ruleProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_PropertyType_0= rulePropertyType ;
    public final AntlrDatatypeRuleToken ruleProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PropertyType_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:911:2: (this_PropertyType_0= rulePropertyType )
            // InternalSpec.g:912:2: this_PropertyType_0= rulePropertyType
            {

            		newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PropertyType_0=rulePropertyType();

            state._fsp--;


            		current.merge(this_PropertyType_0);
            	

            		afterParserOrEnumRuleCall();
            	

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


    // $ANTLR start "entryRulePropertyType"
    // InternalSpec.g:925:1: entryRulePropertyType returns [String current=null] : iv_rulePropertyType= rulePropertyType EOF ;
    public final String entryRulePropertyType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyType = null;


        try {
            // InternalSpec.g:925:52: (iv_rulePropertyType= rulePropertyType EOF )
            // InternalSpec.g:926:2: iv_rulePropertyType= rulePropertyType EOF
            {
             newCompositeNode(grammarAccess.getPropertyTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyType=rulePropertyType();

            state._fsp--;

             current =iv_rulePropertyType.getText(); 
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
    // $ANTLR end "entryRulePropertyType"


    // $ANTLR start "rulePropertyType"
    // InternalSpec.g:932:1: rulePropertyType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'text' | kw= 'class' | kw= 'value' ) ;
    public final AntlrDatatypeRuleToken rulePropertyType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpec.g:938:2: ( (kw= 'text' | kw= 'class' | kw= 'value' ) )
            // InternalSpec.g:939:2: (kw= 'text' | kw= 'class' | kw= 'value' )
            {
            // InternalSpec.g:939:2: (kw= 'text' | kw= 'class' | kw= 'value' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt7=1;
                }
                break;
            case 29:
                {
                alt7=2;
                }
                break;
            case 30:
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
                    // InternalSpec.g:940:3: kw= 'text'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getTextKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSpec.g:946:3: kw= 'class'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getClassKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSpec.g:952:3: kw= 'value'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getValueKeyword_2());
                    		

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
    // $ANTLR end "rulePropertyType"


    // $ANTLR start "entryRuleValue"
    // InternalSpec.g:961:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalSpec.g:961:46: (iv_ruleValue= ruleValue EOF )
            // InternalSpec.g:962:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalSpec.g:968:1: ruleValue returns [EObject current=null] : ( ( (lv_val_0_0= ruleVariable ) ) | ( (lv_str_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_str_1_0=null;
        EObject lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:974:2: ( ( ( (lv_val_0_0= ruleVariable ) ) | ( (lv_str_1_0= RULE_STRING ) ) ) )
            // InternalSpec.g:975:2: ( ( (lv_val_0_0= ruleVariable ) ) | ( (lv_str_1_0= RULE_STRING ) ) )
            {
            // InternalSpec.g:975:2: ( ( (lv_val_0_0= ruleVariable ) ) | ( (lv_str_1_0= RULE_STRING ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==37) ) {
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
                    // InternalSpec.g:976:3: ( (lv_val_0_0= ruleVariable ) )
                    {
                    // InternalSpec.g:976:3: ( (lv_val_0_0= ruleVariable ) )
                    // InternalSpec.g:977:4: (lv_val_0_0= ruleVariable )
                    {
                    // InternalSpec.g:977:4: (lv_val_0_0= ruleVariable )
                    // InternalSpec.g:978:5: lv_val_0_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getValVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_val_0_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"val",
                    						lv_val_0_0,
                    						"org.mde.spec.Spec.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:996:3: ( (lv_str_1_0= RULE_STRING ) )
                    {
                    // InternalSpec.g:996:3: ( (lv_str_1_0= RULE_STRING ) )
                    // InternalSpec.g:997:4: (lv_str_1_0= RULE_STRING )
                    {
                    // InternalSpec.g:997:4: (lv_str_1_0= RULE_STRING )
                    // InternalSpec.g:998:5: lv_str_1_0= RULE_STRING
                    {
                    lv_str_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_str_1_0, grammarAccess.getValueAccess().getStrSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleCondition"
    // InternalSpec.g:1018:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalSpec.g:1018:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalSpec.g:1019:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalSpec.g:1025:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) ) ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpec.g:1031:2: ( ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) ) )
            // InternalSpec.g:1032:2: ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) )
            {
            // InternalSpec.g:1032:2: ( (kw= 'should' kw= 'be' ) | (kw= 'should' kw= 'not' kw= 'be' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==32) ) {
                    alt9=1;
                }
                else if ( (LA9_1==33) ) {
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
                    // InternalSpec.g:1033:3: (kw= 'should' kw= 'be' )
                    {
                    // InternalSpec.g:1033:3: (kw= 'should' kw= 'be' )
                    // InternalSpec.g:1034:4: kw= 'should' kw= 'be'
                    {
                    kw=(Token)match(input,31,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getShouldKeyword_0_0());
                    			
                    kw=(Token)match(input,32,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getBeKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:1046:3: (kw= 'should' kw= 'not' kw= 'be' )
                    {
                    // InternalSpec.g:1046:3: (kw= 'should' kw= 'not' kw= 'be' )
                    // InternalSpec.g:1047:4: kw= 'should' kw= 'not' kw= 'be'
                    {
                    kw=(Token)match(input,31,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getShouldKeyword_1_0());
                    			
                    kw=(Token)match(input,33,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getNotKeyword_1_1());
                    			
                    kw=(Token)match(input,32,FOLLOW_2); 

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


    // $ANTLR start "entryRulePoint"
    // InternalSpec.g:1067:1: entryRulePoint returns [String current=null] : iv_rulePoint= rulePoint EOF ;
    public final String entryRulePoint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePoint = null;


        try {
            // InternalSpec.g:1067:45: (iv_rulePoint= rulePoint EOF )
            // InternalSpec.g:1068:2: iv_rulePoint= rulePoint EOF
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
    // InternalSpec.g:1074:1: rulePoint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulePoint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalSpec.g:1080:2: ( (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' ) )
            // InternalSpec.g:1081:2: (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' )
            {
            // InternalSpec.g:1081:2: (kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}' )
            // InternalSpec.g:1082:3: kw= '{' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= '}'
            {
            kw=(Token)match(input,34,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPointAccess().getLeftCurlyBracketKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_20); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getPointAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,35,FOLLOW_16); 

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
    // InternalSpec.g:1115:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSpec.g:1115:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSpec.g:1116:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalSpec.g:1122:1: ruleVariable returns [EObject current=null] : (otherlv_0= '$' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSpec.g:1128:2: ( (otherlv_0= '$' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalSpec.g:1129:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalSpec.g:1129:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalSpec.g:1130:3: otherlv_0= '$' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getDollarSignKeyword_0());
            		
            // InternalSpec.g:1134:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalSpec.g:1135:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalSpec.g:1135:4: (lv_name_1_0= RULE_STRING )
            // InternalSpec.g:1136:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "ruleElementType"
    // InternalSpec.g:1156:1: ruleElementType returns [Enumerator current=null] : ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) ) ;
    public final Enumerator ruleElementType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSpec.g:1162:2: ( ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) ) )
            // InternalSpec.g:1163:2: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) )
            {
            // InternalSpec.g:1163:2: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'element' ) | (enumLiteral_2= 'link' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'textarea' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt10=1;
                }
                break;
            case 39:
                {
                alt10=2;
                }
                break;
            case 40:
                {
                alt10=3;
                }
                break;
            case 41:
                {
                alt10=4;
                }
                break;
            case 42:
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
                    // InternalSpec.g:1164:3: (enumLiteral_0= 'button' )
                    {
                    // InternalSpec.g:1164:3: (enumLiteral_0= 'button' )
                    // InternalSpec.g:1165:4: enumLiteral_0= 'button'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:1172:3: (enumLiteral_1= 'element' )
                    {
                    // InternalSpec.g:1172:3: (enumLiteral_1= 'element' )
                    // InternalSpec.g:1173:4: enumLiteral_1= 'element'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:1180:3: (enumLiteral_2= 'link' )
                    {
                    // InternalSpec.g:1180:3: (enumLiteral_2= 'link' )
                    // InternalSpec.g:1181:4: enumLiteral_2= 'link'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:1188:3: (enumLiteral_3= 'input' )
                    {
                    // InternalSpec.g:1188:3: (enumLiteral_3= 'input' )
                    // InternalSpec.g:1189:4: enumLiteral_3= 'input'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:1196:3: (enumLiteral_4= 'textarea' )
                    {
                    // InternalSpec.g:1196:3: (enumLiteral_4= 'textarea' )
                    // InternalSpec.g:1197:4: enumLiteral_4= 'textarea'
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
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\uffff\5\4\3\uffff";
    static final String dfa_3s = "\1\52\1\uffff\5\45\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\5\uffff\1\3\1\4\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\40\uffff\1\7\1\2\1\3\1\4\1\5\1\6",
            "",
            "\1\11\40\uffff\1\10",
            "\1\11\40\uffff\1\10",
            "\1\11\40\uffff\1\10",
            "\1\11\40\uffff\1\10",
            "\1\11\40\uffff\1\10",
            "",
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
            return "774:2: ( ( (lv_val_0_0= RULE_STRING ) ) | ( ( (lv_type_1_0= ruleElementType ) ) ( (lv_val_2_0= RULE_STRING ) ) ) | ( (lv_var_3_0= ruleVariable ) ) | ( ( (lv_type_4_0= ruleElementType ) ) ( (lv_var_5_0= ruleVariable ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008EB9802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000007E000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});

}
package org.mde.spec.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.mde.spec.services.SpecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'second'", "'seconds'", "'text'", "'class'", "'value'", "'button'", "'element'", "'link'", "'input'", "'textarea'", "'Open'", "'Click'", "'on'", "'at'", "'#'", "'Within'", "'Select'", "'visible'", "'Remember'", "'as'", "'Property'", "'Type'", "'Sleep'", "'for'", "'!'", "'should'", "'be'", "'not'", "'{'", "','", "'}'", "'$'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(SpecGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalSpec.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSpec.g:54:1: ( ruleModel EOF )
            // InternalSpec.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSpec.g:62:1: ruleModel : ( ( rule__Model__CommandsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:66:2: ( ( ( rule__Model__CommandsAssignment )* ) )
            // InternalSpec.g:67:2: ( ( rule__Model__CommandsAssignment )* )
            {
            // InternalSpec.g:67:2: ( ( rule__Model__CommandsAssignment )* )
            // InternalSpec.g:68:3: ( rule__Model__CommandsAssignment )*
            {
             before(grammarAccess.getModelAccess().getCommandsAssignment()); 
            // InternalSpec.g:69:3: ( rule__Model__CommandsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=21 && LA1_0<=22)||(LA1_0>=25 && LA1_0<=27)||LA1_0==29||(LA1_0>=31 && LA1_0<=33)||LA1_0==35) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSpec.g:69:4: rule__Model__CommandsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__CommandsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCommandsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // InternalSpec.g:78:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalSpec.g:79:1: ( ruleCommand EOF )
            // InternalSpec.g:80:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalSpec.g:87:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:91:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalSpec.g:92:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalSpec.g:92:2: ( ( rule__Command__Alternatives ) )
            // InternalSpec.g:93:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalSpec.g:94:3: ( rule__Command__Alternatives )
            // InternalSpec.g:94:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleOpenCommand"
    // InternalSpec.g:103:1: entryRuleOpenCommand : ruleOpenCommand EOF ;
    public final void entryRuleOpenCommand() throws RecognitionException {
        try {
            // InternalSpec.g:104:1: ( ruleOpenCommand EOF )
            // InternalSpec.g:105:1: ruleOpenCommand EOF
            {
             before(grammarAccess.getOpenCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleOpenCommand();

            state._fsp--;

             after(grammarAccess.getOpenCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpenCommand"


    // $ANTLR start "ruleOpenCommand"
    // InternalSpec.g:112:1: ruleOpenCommand : ( ( rule__OpenCommand__Group__0 ) ) ;
    public final void ruleOpenCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:116:2: ( ( ( rule__OpenCommand__Group__0 ) ) )
            // InternalSpec.g:117:2: ( ( rule__OpenCommand__Group__0 ) )
            {
            // InternalSpec.g:117:2: ( ( rule__OpenCommand__Group__0 ) )
            // InternalSpec.g:118:3: ( rule__OpenCommand__Group__0 )
            {
             before(grammarAccess.getOpenCommandAccess().getGroup()); 
            // InternalSpec.g:119:3: ( rule__OpenCommand__Group__0 )
            // InternalSpec.g:119:4: rule__OpenCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpenCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpenCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpenCommand"


    // $ANTLR start "entryRuleClickCommand"
    // InternalSpec.g:128:1: entryRuleClickCommand : ruleClickCommand EOF ;
    public final void entryRuleClickCommand() throws RecognitionException {
        try {
            // InternalSpec.g:129:1: ( ruleClickCommand EOF )
            // InternalSpec.g:130:1: ruleClickCommand EOF
            {
             before(grammarAccess.getClickCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleClickCommand();

            state._fsp--;

             after(grammarAccess.getClickCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClickCommand"


    // $ANTLR start "ruleClickCommand"
    // InternalSpec.g:137:1: ruleClickCommand : ( ( rule__ClickCommand__Alternatives ) ) ;
    public final void ruleClickCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:141:2: ( ( ( rule__ClickCommand__Alternatives ) ) )
            // InternalSpec.g:142:2: ( ( rule__ClickCommand__Alternatives ) )
            {
            // InternalSpec.g:142:2: ( ( rule__ClickCommand__Alternatives ) )
            // InternalSpec.g:143:3: ( rule__ClickCommand__Alternatives )
            {
             before(grammarAccess.getClickCommandAccess().getAlternatives()); 
            // InternalSpec.g:144:3: ( rule__ClickCommand__Alternatives )
            // InternalSpec.g:144:4: rule__ClickCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClickCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClickCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClickCommand"


    // $ANTLR start "entryRuleCommentCommand"
    // InternalSpec.g:153:1: entryRuleCommentCommand : ruleCommentCommand EOF ;
    public final void entryRuleCommentCommand() throws RecognitionException {
        try {
            // InternalSpec.g:154:1: ( ruleCommentCommand EOF )
            // InternalSpec.g:155:1: ruleCommentCommand EOF
            {
             before(grammarAccess.getCommentCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommentCommand();

            state._fsp--;

             after(grammarAccess.getCommentCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommentCommand"


    // $ANTLR start "ruleCommentCommand"
    // InternalSpec.g:162:1: ruleCommentCommand : ( ( rule__CommentCommand__Group__0 ) ) ;
    public final void ruleCommentCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:166:2: ( ( ( rule__CommentCommand__Group__0 ) ) )
            // InternalSpec.g:167:2: ( ( rule__CommentCommand__Group__0 ) )
            {
            // InternalSpec.g:167:2: ( ( rule__CommentCommand__Group__0 ) )
            // InternalSpec.g:168:3: ( rule__CommentCommand__Group__0 )
            {
             before(grammarAccess.getCommentCommandAccess().getGroup()); 
            // InternalSpec.g:169:3: ( rule__CommentCommand__Group__0 )
            // InternalSpec.g:169:4: rule__CommentCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommentCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommentCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommentCommand"


    // $ANTLR start "entryRuleSelectCommand"
    // InternalSpec.g:178:1: entryRuleSelectCommand : ruleSelectCommand EOF ;
    public final void entryRuleSelectCommand() throws RecognitionException {
        try {
            // InternalSpec.g:179:1: ( ruleSelectCommand EOF )
            // InternalSpec.g:180:1: ruleSelectCommand EOF
            {
             before(grammarAccess.getSelectCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectCommand();

            state._fsp--;

             after(grammarAccess.getSelectCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectCommand"


    // $ANTLR start "ruleSelectCommand"
    // InternalSpec.g:187:1: ruleSelectCommand : ( ( rule__SelectCommand__Alternatives ) ) ;
    public final void ruleSelectCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:191:2: ( ( ( rule__SelectCommand__Alternatives ) ) )
            // InternalSpec.g:192:2: ( ( rule__SelectCommand__Alternatives ) )
            {
            // InternalSpec.g:192:2: ( ( rule__SelectCommand__Alternatives ) )
            // InternalSpec.g:193:3: ( rule__SelectCommand__Alternatives )
            {
             before(grammarAccess.getSelectCommandAccess().getAlternatives()); 
            // InternalSpec.g:194:3: ( rule__SelectCommand__Alternatives )
            // InternalSpec.g:194:4: rule__SelectCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SelectCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectCommand"


    // $ANTLR start "entryRuleRememberCommand"
    // InternalSpec.g:203:1: entryRuleRememberCommand : ruleRememberCommand EOF ;
    public final void entryRuleRememberCommand() throws RecognitionException {
        try {
            // InternalSpec.g:204:1: ( ruleRememberCommand EOF )
            // InternalSpec.g:205:1: ruleRememberCommand EOF
            {
             before(grammarAccess.getRememberCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleRememberCommand();

            state._fsp--;

             after(grammarAccess.getRememberCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRememberCommand"


    // $ANTLR start "ruleRememberCommand"
    // InternalSpec.g:212:1: ruleRememberCommand : ( ( rule__RememberCommand__Group__0 ) ) ;
    public final void ruleRememberCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:216:2: ( ( ( rule__RememberCommand__Group__0 ) ) )
            // InternalSpec.g:217:2: ( ( rule__RememberCommand__Group__0 ) )
            {
            // InternalSpec.g:217:2: ( ( rule__RememberCommand__Group__0 ) )
            // InternalSpec.g:218:3: ( rule__RememberCommand__Group__0 )
            {
             before(grammarAccess.getRememberCommandAccess().getGroup()); 
            // InternalSpec.g:219:3: ( rule__RememberCommand__Group__0 )
            // InternalSpec.g:219:4: rule__RememberCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RememberCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRememberCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRememberCommand"


    // $ANTLR start "entryRulePropertyCommand"
    // InternalSpec.g:228:1: entryRulePropertyCommand : rulePropertyCommand EOF ;
    public final void entryRulePropertyCommand() throws RecognitionException {
        try {
            // InternalSpec.g:229:1: ( rulePropertyCommand EOF )
            // InternalSpec.g:230:1: rulePropertyCommand EOF
            {
             before(grammarAccess.getPropertyCommandRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyCommand();

            state._fsp--;

             after(grammarAccess.getPropertyCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyCommand"


    // $ANTLR start "rulePropertyCommand"
    // InternalSpec.g:237:1: rulePropertyCommand : ( ( rule__PropertyCommand__Group__0 ) ) ;
    public final void rulePropertyCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:241:2: ( ( ( rule__PropertyCommand__Group__0 ) ) )
            // InternalSpec.g:242:2: ( ( rule__PropertyCommand__Group__0 ) )
            {
            // InternalSpec.g:242:2: ( ( rule__PropertyCommand__Group__0 ) )
            // InternalSpec.g:243:3: ( rule__PropertyCommand__Group__0 )
            {
             before(grammarAccess.getPropertyCommandAccess().getGroup()); 
            // InternalSpec.g:244:3: ( rule__PropertyCommand__Group__0 )
            // InternalSpec.g:244:4: rule__PropertyCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyCommand"


    // $ANTLR start "entryRuleTypeCommand"
    // InternalSpec.g:253:1: entryRuleTypeCommand : ruleTypeCommand EOF ;
    public final void entryRuleTypeCommand() throws RecognitionException {
        try {
            // InternalSpec.g:254:1: ( ruleTypeCommand EOF )
            // InternalSpec.g:255:1: ruleTypeCommand EOF
            {
             before(grammarAccess.getTypeCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeCommand();

            state._fsp--;

             after(grammarAccess.getTypeCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeCommand"


    // $ANTLR start "ruleTypeCommand"
    // InternalSpec.g:262:1: ruleTypeCommand : ( ( rule__TypeCommand__Group__0 ) ) ;
    public final void ruleTypeCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:266:2: ( ( ( rule__TypeCommand__Group__0 ) ) )
            // InternalSpec.g:267:2: ( ( rule__TypeCommand__Group__0 ) )
            {
            // InternalSpec.g:267:2: ( ( rule__TypeCommand__Group__0 ) )
            // InternalSpec.g:268:3: ( rule__TypeCommand__Group__0 )
            {
             before(grammarAccess.getTypeCommandAccess().getGroup()); 
            // InternalSpec.g:269:3: ( rule__TypeCommand__Group__0 )
            // InternalSpec.g:269:4: rule__TypeCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeCommand"


    // $ANTLR start "entryRuleSleepCommand"
    // InternalSpec.g:278:1: entryRuleSleepCommand : ruleSleepCommand EOF ;
    public final void entryRuleSleepCommand() throws RecognitionException {
        try {
            // InternalSpec.g:279:1: ( ruleSleepCommand EOF )
            // InternalSpec.g:280:1: ruleSleepCommand EOF
            {
             before(grammarAccess.getSleepCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleSleepCommand();

            state._fsp--;

             after(grammarAccess.getSleepCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSleepCommand"


    // $ANTLR start "ruleSleepCommand"
    // InternalSpec.g:287:1: ruleSleepCommand : ( ( rule__SleepCommand__Group__0 ) ) ;
    public final void ruleSleepCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:291:2: ( ( ( rule__SleepCommand__Group__0 ) ) )
            // InternalSpec.g:292:2: ( ( rule__SleepCommand__Group__0 ) )
            {
            // InternalSpec.g:292:2: ( ( rule__SleepCommand__Group__0 ) )
            // InternalSpec.g:293:3: ( rule__SleepCommand__Group__0 )
            {
             before(grammarAccess.getSleepCommandAccess().getGroup()); 
            // InternalSpec.g:294:3: ( rule__SleepCommand__Group__0 )
            // InternalSpec.g:294:4: rule__SleepCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SleepCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSleepCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSleepCommand"


    // $ANTLR start "entryRuleCustomCommand"
    // InternalSpec.g:303:1: entryRuleCustomCommand : ruleCustomCommand EOF ;
    public final void entryRuleCustomCommand() throws RecognitionException {
        try {
            // InternalSpec.g:304:1: ( ruleCustomCommand EOF )
            // InternalSpec.g:305:1: ruleCustomCommand EOF
            {
             before(grammarAccess.getCustomCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomCommand();

            state._fsp--;

             after(grammarAccess.getCustomCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomCommand"


    // $ANTLR start "ruleCustomCommand"
    // InternalSpec.g:312:1: ruleCustomCommand : ( ( rule__CustomCommand__Group__0 ) ) ;
    public final void ruleCustomCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:316:2: ( ( ( rule__CustomCommand__Group__0 ) ) )
            // InternalSpec.g:317:2: ( ( rule__CustomCommand__Group__0 ) )
            {
            // InternalSpec.g:317:2: ( ( rule__CustomCommand__Group__0 ) )
            // InternalSpec.g:318:3: ( rule__CustomCommand__Group__0 )
            {
             before(grammarAccess.getCustomCommandAccess().getGroup()); 
            // InternalSpec.g:319:3: ( rule__CustomCommand__Group__0 )
            // InternalSpec.g:319:4: rule__CustomCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomCommand"


    // $ANTLR start "entryRuleSelector"
    // InternalSpec.g:328:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalSpec.g:329:1: ( ruleSelector EOF )
            // InternalSpec.g:330:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalSpec.g:337:1: ruleSelector : ( ( rule__Selector__Alternatives ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:341:2: ( ( ( rule__Selector__Alternatives ) ) )
            // InternalSpec.g:342:2: ( ( rule__Selector__Alternatives ) )
            {
            // InternalSpec.g:342:2: ( ( rule__Selector__Alternatives ) )
            // InternalSpec.g:343:3: ( rule__Selector__Alternatives )
            {
             before(grammarAccess.getSelectorAccess().getAlternatives()); 
            // InternalSpec.g:344:3: ( rule__Selector__Alternatives )
            // InternalSpec.g:344:4: rule__Selector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleProperty"
    // InternalSpec.g:353:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalSpec.g:354:1: ( ruleProperty EOF )
            // InternalSpec.g:355:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalSpec.g:362:1: ruleProperty : ( rulePropertyType ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:366:2: ( ( rulePropertyType ) )
            // InternalSpec.g:367:2: ( rulePropertyType )
            {
            // InternalSpec.g:367:2: ( rulePropertyType )
            // InternalSpec.g:368:3: rulePropertyType
            {
             before(grammarAccess.getPropertyAccess().getPropertyTypeParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getPropertyTypeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertyType"
    // InternalSpec.g:378:1: entryRulePropertyType : rulePropertyType EOF ;
    public final void entryRulePropertyType() throws RecognitionException {
        try {
            // InternalSpec.g:379:1: ( rulePropertyType EOF )
            // InternalSpec.g:380:1: rulePropertyType EOF
            {
             before(grammarAccess.getPropertyTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getPropertyTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyType"


    // $ANTLR start "rulePropertyType"
    // InternalSpec.g:387:1: rulePropertyType : ( ( rule__PropertyType__Alternatives ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:391:2: ( ( ( rule__PropertyType__Alternatives ) ) )
            // InternalSpec.g:392:2: ( ( rule__PropertyType__Alternatives ) )
            {
            // InternalSpec.g:392:2: ( ( rule__PropertyType__Alternatives ) )
            // InternalSpec.g:393:3: ( rule__PropertyType__Alternatives )
            {
             before(grammarAccess.getPropertyTypeAccess().getAlternatives()); 
            // InternalSpec.g:394:3: ( rule__PropertyType__Alternatives )
            // InternalSpec.g:394:4: rule__PropertyType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PropertyType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyType"


    // $ANTLR start "entryRuleValue"
    // InternalSpec.g:403:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalSpec.g:404:1: ( ruleValue EOF )
            // InternalSpec.g:405:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalSpec.g:412:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:416:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalSpec.g:417:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalSpec.g:417:2: ( ( rule__Value__Alternatives ) )
            // InternalSpec.g:418:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalSpec.g:419:3: ( rule__Value__Alternatives )
            // InternalSpec.g:419:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleCondition"
    // InternalSpec.g:428:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalSpec.g:429:1: ( ruleCondition EOF )
            // InternalSpec.g:430:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalSpec.g:437:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:441:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalSpec.g:442:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalSpec.g:442:2: ( ( rule__Condition__Alternatives ) )
            // InternalSpec.g:443:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalSpec.g:444:3: ( rule__Condition__Alternatives )
            // InternalSpec.g:444:4: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRulePoint"
    // InternalSpec.g:453:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalSpec.g:454:1: ( rulePoint EOF )
            // InternalSpec.g:455:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalSpec.g:462:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:466:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalSpec.g:467:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalSpec.g:467:2: ( ( rule__Point__Group__0 ) )
            // InternalSpec.g:468:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalSpec.g:469:3: ( rule__Point__Group__0 )
            // InternalSpec.g:469:4: rule__Point__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleVariable"
    // InternalSpec.g:478:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalSpec.g:479:1: ( ruleVariable EOF )
            // InternalSpec.g:480:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalSpec.g:487:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:491:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalSpec.g:492:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalSpec.g:492:2: ( ( rule__Variable__Group__0 ) )
            // InternalSpec.g:493:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalSpec.g:494:3: ( rule__Variable__Group__0 )
            // InternalSpec.g:494:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "ruleElementType"
    // InternalSpec.g:503:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:507:1: ( ( ( rule__ElementType__Alternatives ) ) )
            // InternalSpec.g:508:2: ( ( rule__ElementType__Alternatives ) )
            {
            // InternalSpec.g:508:2: ( ( rule__ElementType__Alternatives ) )
            // InternalSpec.g:509:3: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // InternalSpec.g:510:3: ( rule__ElementType__Alternatives )
            // InternalSpec.g:510:4: rule__ElementType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ElementType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalSpec.g:518:1: rule__Command__Alternatives : ( ( ruleOpenCommand ) | ( ruleClickCommand ) | ( ruleCommentCommand ) | ( ruleSelectCommand ) | ( ruleRememberCommand ) | ( rulePropertyCommand ) | ( ruleTypeCommand ) | ( ruleSleepCommand ) | ( ruleCustomCommand ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:522:1: ( ( ruleOpenCommand ) | ( ruleClickCommand ) | ( ruleCommentCommand ) | ( ruleSelectCommand ) | ( ruleRememberCommand ) | ( rulePropertyCommand ) | ( ruleTypeCommand ) | ( ruleSleepCommand ) | ( ruleCustomCommand ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 26:
            case 27:
                {
                alt2=4;
                }
                break;
            case 29:
                {
                alt2=5;
                }
                break;
            case 31:
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
            case 35:
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
                    // InternalSpec.g:523:2: ( ruleOpenCommand )
                    {
                    // InternalSpec.g:523:2: ( ruleOpenCommand )
                    // InternalSpec.g:524:3: ruleOpenCommand
                    {
                     before(grammarAccess.getCommandAccess().getOpenCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOpenCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getOpenCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:529:2: ( ruleClickCommand )
                    {
                    // InternalSpec.g:529:2: ( ruleClickCommand )
                    // InternalSpec.g:530:3: ruleClickCommand
                    {
                     before(grammarAccess.getCommandAccess().getClickCommandParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClickCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getClickCommandParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:535:2: ( ruleCommentCommand )
                    {
                    // InternalSpec.g:535:2: ( ruleCommentCommand )
                    // InternalSpec.g:536:3: ruleCommentCommand
                    {
                     before(grammarAccess.getCommandAccess().getCommentCommandParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCommentCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getCommentCommandParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:541:2: ( ruleSelectCommand )
                    {
                    // InternalSpec.g:541:2: ( ruleSelectCommand )
                    // InternalSpec.g:542:3: ruleSelectCommand
                    {
                     before(grammarAccess.getCommandAccess().getSelectCommandParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getSelectCommandParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:547:2: ( ruleRememberCommand )
                    {
                    // InternalSpec.g:547:2: ( ruleRememberCommand )
                    // InternalSpec.g:548:3: ruleRememberCommand
                    {
                     before(grammarAccess.getCommandAccess().getRememberCommandParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRememberCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRememberCommandParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSpec.g:553:2: ( rulePropertyCommand )
                    {
                    // InternalSpec.g:553:2: ( rulePropertyCommand )
                    // InternalSpec.g:554:3: rulePropertyCommand
                    {
                     before(grammarAccess.getCommandAccess().getPropertyCommandParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getPropertyCommandParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSpec.g:559:2: ( ruleTypeCommand )
                    {
                    // InternalSpec.g:559:2: ( ruleTypeCommand )
                    // InternalSpec.g:560:3: ruleTypeCommand
                    {
                     before(grammarAccess.getCommandAccess().getTypeCommandParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getTypeCommandParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSpec.g:565:2: ( ruleSleepCommand )
                    {
                    // InternalSpec.g:565:2: ( ruleSleepCommand )
                    // InternalSpec.g:566:3: ruleSleepCommand
                    {
                     before(grammarAccess.getCommandAccess().getSleepCommandParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleSleepCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getSleepCommandParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSpec.g:571:2: ( ruleCustomCommand )
                    {
                    // InternalSpec.g:571:2: ( ruleCustomCommand )
                    // InternalSpec.g:572:3: ruleCustomCommand
                    {
                     before(grammarAccess.getCommandAccess().getCustomCommandParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getCustomCommandParserRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__ClickCommand__Alternatives"
    // InternalSpec.g:581:1: rule__ClickCommand__Alternatives : ( ( ( rule__ClickCommand__CmdAssignment_0 ) ) | ( ( rule__ClickCommand__Group_1__0 ) ) | ( ( rule__ClickCommand__Group_2__0 ) ) );
    public final void rule__ClickCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:585:1: ( ( ( rule__ClickCommand__CmdAssignment_0 ) ) | ( ( rule__ClickCommand__Group_1__0 ) ) | ( ( rule__ClickCommand__Group_2__0 ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt3=3;
                    }
                    break;
                case 23:
                    {
                    alt3=2;
                    }
                    break;
                case EOF:
                case 21:
                case 22:
                case 25:
                case 26:
                case 27:
                case 29:
                case 31:
                case 32:
                case 33:
                case 35:
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
                    // InternalSpec.g:586:2: ( ( rule__ClickCommand__CmdAssignment_0 ) )
                    {
                    // InternalSpec.g:586:2: ( ( rule__ClickCommand__CmdAssignment_0 ) )
                    // InternalSpec.g:587:3: ( rule__ClickCommand__CmdAssignment_0 )
                    {
                     before(grammarAccess.getClickCommandAccess().getCmdAssignment_0()); 
                    // InternalSpec.g:588:3: ( rule__ClickCommand__CmdAssignment_0 )
                    // InternalSpec.g:588:4: rule__ClickCommand__CmdAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClickCommand__CmdAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickCommandAccess().getCmdAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:592:2: ( ( rule__ClickCommand__Group_1__0 ) )
                    {
                    // InternalSpec.g:592:2: ( ( rule__ClickCommand__Group_1__0 ) )
                    // InternalSpec.g:593:3: ( rule__ClickCommand__Group_1__0 )
                    {
                     before(grammarAccess.getClickCommandAccess().getGroup_1()); 
                    // InternalSpec.g:594:3: ( rule__ClickCommand__Group_1__0 )
                    // InternalSpec.g:594:4: rule__ClickCommand__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClickCommand__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickCommandAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:598:2: ( ( rule__ClickCommand__Group_2__0 ) )
                    {
                    // InternalSpec.g:598:2: ( ( rule__ClickCommand__Group_2__0 ) )
                    // InternalSpec.g:599:3: ( rule__ClickCommand__Group_2__0 )
                    {
                     before(grammarAccess.getClickCommandAccess().getGroup_2()); 
                    // InternalSpec.g:600:3: ( rule__ClickCommand__Group_2__0 )
                    // InternalSpec.g:600:4: rule__ClickCommand__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClickCommand__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickCommandAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Alternatives"


    // $ANTLR start "rule__SelectCommand__Alternatives"
    // InternalSpec.g:608:1: rule__SelectCommand__Alternatives : ( ( ( rule__SelectCommand__Group_0__0 ) ) | ( ( rule__SelectCommand__Group_1__0 ) ) | ( ( rule__SelectCommand__Group_2__0 ) ) );
    public final void rule__SelectCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:612:1: ( ( ( rule__SelectCommand__Group_0__0 ) ) | ( ( rule__SelectCommand__Group_1__0 ) ) | ( ( rule__SelectCommand__Group_2__0 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==28) ) {
                    alt4=3;
                }
                else if ( (LA4_2==RULE_STRING||(LA4_2>=16 && LA4_2<=20)||LA4_2==42) ) {
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
                    // InternalSpec.g:613:2: ( ( rule__SelectCommand__Group_0__0 ) )
                    {
                    // InternalSpec.g:613:2: ( ( rule__SelectCommand__Group_0__0 ) )
                    // InternalSpec.g:614:3: ( rule__SelectCommand__Group_0__0 )
                    {
                     before(grammarAccess.getSelectCommandAccess().getGroup_0()); 
                    // InternalSpec.g:615:3: ( rule__SelectCommand__Group_0__0 )
                    // InternalSpec.g:615:4: rule__SelectCommand__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectCommand__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectCommandAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:619:2: ( ( rule__SelectCommand__Group_1__0 ) )
                    {
                    // InternalSpec.g:619:2: ( ( rule__SelectCommand__Group_1__0 ) )
                    // InternalSpec.g:620:3: ( rule__SelectCommand__Group_1__0 )
                    {
                     before(grammarAccess.getSelectCommandAccess().getGroup_1()); 
                    // InternalSpec.g:621:3: ( rule__SelectCommand__Group_1__0 )
                    // InternalSpec.g:621:4: rule__SelectCommand__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectCommand__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectCommandAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:625:2: ( ( rule__SelectCommand__Group_2__0 ) )
                    {
                    // InternalSpec.g:625:2: ( ( rule__SelectCommand__Group_2__0 ) )
                    // InternalSpec.g:626:3: ( rule__SelectCommand__Group_2__0 )
                    {
                     before(grammarAccess.getSelectCommandAccess().getGroup_2()); 
                    // InternalSpec.g:627:3: ( rule__SelectCommand__Group_2__0 )
                    // InternalSpec.g:627:4: rule__SelectCommand__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectCommand__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectCommandAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Alternatives"


    // $ANTLR start "rule__SleepCommand__Alternatives_3"
    // InternalSpec.g:635:1: rule__SleepCommand__Alternatives_3 : ( ( 'second' ) | ( 'seconds' ) );
    public final void rule__SleepCommand__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:639:1: ( ( 'second' ) | ( 'seconds' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpec.g:640:2: ( 'second' )
                    {
                    // InternalSpec.g:640:2: ( 'second' )
                    // InternalSpec.g:641:3: 'second'
                    {
                     before(grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:646:2: ( 'seconds' )
                    {
                    // InternalSpec.g:646:2: ( 'seconds' )
                    // InternalSpec.g:647:3: 'seconds'
                    {
                     before(grammarAccess.getSleepCommandAccess().getSecondsKeyword_3_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSleepCommandAccess().getSecondsKeyword_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SleepCommand__Alternatives_3"


    // $ANTLR start "rule__Selector__Alternatives"
    // InternalSpec.g:656:1: rule__Selector__Alternatives : ( ( ( rule__Selector__ValAssignment_0 ) ) | ( ( rule__Selector__Group_1__0 ) ) | ( ( rule__Selector__VarAssignment_2 ) ) | ( ( rule__Selector__Group_3__0 ) ) );
    public final void rule__Selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:660:1: ( ( ( rule__Selector__ValAssignment_0 ) ) | ( ( rule__Selector__Group_1__0 ) ) | ( ( rule__Selector__VarAssignment_2 ) ) | ( ( rule__Selector__Group_3__0 ) ) )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalSpec.g:661:2: ( ( rule__Selector__ValAssignment_0 ) )
                    {
                    // InternalSpec.g:661:2: ( ( rule__Selector__ValAssignment_0 ) )
                    // InternalSpec.g:662:3: ( rule__Selector__ValAssignment_0 )
                    {
                     before(grammarAccess.getSelectorAccess().getValAssignment_0()); 
                    // InternalSpec.g:663:3: ( rule__Selector__ValAssignment_0 )
                    // InternalSpec.g:663:4: rule__Selector__ValAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__ValAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getValAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:667:2: ( ( rule__Selector__Group_1__0 ) )
                    {
                    // InternalSpec.g:667:2: ( ( rule__Selector__Group_1__0 ) )
                    // InternalSpec.g:668:3: ( rule__Selector__Group_1__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_1()); 
                    // InternalSpec.g:669:3: ( rule__Selector__Group_1__0 )
                    // InternalSpec.g:669:4: rule__Selector__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:673:2: ( ( rule__Selector__VarAssignment_2 ) )
                    {
                    // InternalSpec.g:673:2: ( ( rule__Selector__VarAssignment_2 ) )
                    // InternalSpec.g:674:3: ( rule__Selector__VarAssignment_2 )
                    {
                     before(grammarAccess.getSelectorAccess().getVarAssignment_2()); 
                    // InternalSpec.g:675:3: ( rule__Selector__VarAssignment_2 )
                    // InternalSpec.g:675:4: rule__Selector__VarAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__VarAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getVarAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:679:2: ( ( rule__Selector__Group_3__0 ) )
                    {
                    // InternalSpec.g:679:2: ( ( rule__Selector__Group_3__0 ) )
                    // InternalSpec.g:680:3: ( rule__Selector__Group_3__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_3()); 
                    // InternalSpec.g:681:3: ( rule__Selector__Group_3__0 )
                    // InternalSpec.g:681:4: rule__Selector__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Alternatives"


    // $ANTLR start "rule__PropertyType__Alternatives"
    // InternalSpec.g:689:1: rule__PropertyType__Alternatives : ( ( 'text' ) | ( 'class' ) | ( 'value' ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:693:1: ( ( 'text' ) | ( 'class' ) | ( 'value' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
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
                    // InternalSpec.g:694:2: ( 'text' )
                    {
                    // InternalSpec.g:694:2: ( 'text' )
                    // InternalSpec.g:695:3: 'text'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTextKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPropertyTypeAccess().getTextKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:700:2: ( 'class' )
                    {
                    // InternalSpec.g:700:2: ( 'class' )
                    // InternalSpec.g:701:3: 'class'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getClassKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPropertyTypeAccess().getClassKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:706:2: ( 'value' )
                    {
                    // InternalSpec.g:706:2: ( 'value' )
                    // InternalSpec.g:707:3: 'value'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getValueKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPropertyTypeAccess().getValueKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalSpec.g:716:1: rule__Value__Alternatives : ( ( ( rule__Value__ValAssignment_0 ) ) | ( ( rule__Value__StrAssignment_1 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:720:1: ( ( ( rule__Value__ValAssignment_0 ) ) | ( ( rule__Value__StrAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==42) ) {
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
                    // InternalSpec.g:721:2: ( ( rule__Value__ValAssignment_0 ) )
                    {
                    // InternalSpec.g:721:2: ( ( rule__Value__ValAssignment_0 ) )
                    // InternalSpec.g:722:3: ( rule__Value__ValAssignment_0 )
                    {
                     before(grammarAccess.getValueAccess().getValAssignment_0()); 
                    // InternalSpec.g:723:3: ( rule__Value__ValAssignment_0 )
                    // InternalSpec.g:723:4: rule__Value__ValAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__ValAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getValAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:727:2: ( ( rule__Value__StrAssignment_1 ) )
                    {
                    // InternalSpec.g:727:2: ( ( rule__Value__StrAssignment_1 ) )
                    // InternalSpec.g:728:3: ( rule__Value__StrAssignment_1 )
                    {
                     before(grammarAccess.getValueAccess().getStrAssignment_1()); 
                    // InternalSpec.g:729:3: ( rule__Value__StrAssignment_1 )
                    // InternalSpec.g:729:4: rule__Value__StrAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__StrAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getStrAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalSpec.g:737:1: rule__Condition__Alternatives : ( ( ( rule__Condition__Group_0__0 ) ) | ( ( rule__Condition__Group_1__0 ) ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:741:1: ( ( ( rule__Condition__Group_0__0 ) ) | ( ( rule__Condition__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==38) ) {
                    alt9=2;
                }
                else if ( (LA9_1==37) ) {
                    alt9=1;
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
                    // InternalSpec.g:742:2: ( ( rule__Condition__Group_0__0 ) )
                    {
                    // InternalSpec.g:742:2: ( ( rule__Condition__Group_0__0 ) )
                    // InternalSpec.g:743:3: ( rule__Condition__Group_0__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0()); 
                    // InternalSpec.g:744:3: ( rule__Condition__Group_0__0 )
                    // InternalSpec.g:744:4: rule__Condition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:748:2: ( ( rule__Condition__Group_1__0 ) )
                    {
                    // InternalSpec.g:748:2: ( ( rule__Condition__Group_1__0 ) )
                    // InternalSpec.g:749:3: ( rule__Condition__Group_1__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_1()); 
                    // InternalSpec.g:750:3: ( rule__Condition__Group_1__0 )
                    // InternalSpec.g:750:4: rule__Condition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__ElementType__Alternatives"
    // InternalSpec.g:758:1: rule__ElementType__Alternatives : ( ( ( 'button' ) ) | ( ( 'element' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) | ( ( 'textarea' ) ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:762:1: ( ( ( 'button' ) ) | ( ( 'element' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) | ( ( 'textarea' ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 18:
                {
                alt10=3;
                }
                break;
            case 19:
                {
                alt10=4;
                }
                break;
            case 20:
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
                    // InternalSpec.g:763:2: ( ( 'button' ) )
                    {
                    // InternalSpec.g:763:2: ( ( 'button' ) )
                    // InternalSpec.g:764:3: ( 'button' )
                    {
                     before(grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0()); 
                    // InternalSpec.g:765:3: ( 'button' )
                    // InternalSpec.g:765:4: 'button'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:769:2: ( ( 'element' ) )
                    {
                    // InternalSpec.g:769:2: ( ( 'element' ) )
                    // InternalSpec.g:770:3: ( 'element' )
                    {
                     before(grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:771:3: ( 'element' )
                    // InternalSpec.g:771:4: 'element'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:775:2: ( ( 'link' ) )
                    {
                    // InternalSpec.g:775:2: ( ( 'link' ) )
                    // InternalSpec.g:776:3: ( 'link' )
                    {
                     before(grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2()); 
                    // InternalSpec.g:777:3: ( 'link' )
                    // InternalSpec.g:777:4: 'link'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:781:2: ( ( 'input' ) )
                    {
                    // InternalSpec.g:781:2: ( ( 'input' ) )
                    // InternalSpec.g:782:3: ( 'input' )
                    {
                     before(grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3()); 
                    // InternalSpec.g:783:3: ( 'input' )
                    // InternalSpec.g:783:4: 'input'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:787:2: ( ( 'textarea' ) )
                    {
                    // InternalSpec.g:787:2: ( ( 'textarea' ) )
                    // InternalSpec.g:788:3: ( 'textarea' )
                    {
                     before(grammarAccess.getElementTypeAccess().getTextareaEnumLiteralDeclaration_4()); 
                    // InternalSpec.g:789:3: ( 'textarea' )
                    // InternalSpec.g:789:4: 'textarea'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getTextareaEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Alternatives"


    // $ANTLR start "rule__OpenCommand__Group__0"
    // InternalSpec.g:797:1: rule__OpenCommand__Group__0 : rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1 ;
    public final void rule__OpenCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:801:1: ( rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1 )
            // InternalSpec.g:802:2: rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OpenCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpenCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenCommand__Group__0"


    // $ANTLR start "rule__OpenCommand__Group__0__Impl"
    // InternalSpec.g:809:1: rule__OpenCommand__Group__0__Impl : ( 'Open' ) ;
    public final void rule__OpenCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:813:1: ( ( 'Open' ) )
            // InternalSpec.g:814:1: ( 'Open' )
            {
            // InternalSpec.g:814:1: ( 'Open' )
            // InternalSpec.g:815:2: 'Open'
            {
             before(grammarAccess.getOpenCommandAccess().getOpenKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOpenCommandAccess().getOpenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenCommand__Group__0__Impl"


    // $ANTLR start "rule__OpenCommand__Group__1"
    // InternalSpec.g:824:1: rule__OpenCommand__Group__1 : rule__OpenCommand__Group__1__Impl ;
    public final void rule__OpenCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:828:1: ( rule__OpenCommand__Group__1__Impl )
            // InternalSpec.g:829:2: rule__OpenCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpenCommand__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenCommand__Group__1"


    // $ANTLR start "rule__OpenCommand__Group__1__Impl"
    // InternalSpec.g:835:1: rule__OpenCommand__Group__1__Impl : ( ( rule__OpenCommand__ValueAssignment_1 ) ) ;
    public final void rule__OpenCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:839:1: ( ( ( rule__OpenCommand__ValueAssignment_1 ) ) )
            // InternalSpec.g:840:1: ( ( rule__OpenCommand__ValueAssignment_1 ) )
            {
            // InternalSpec.g:840:1: ( ( rule__OpenCommand__ValueAssignment_1 ) )
            // InternalSpec.g:841:2: ( rule__OpenCommand__ValueAssignment_1 )
            {
             before(grammarAccess.getOpenCommandAccess().getValueAssignment_1()); 
            // InternalSpec.g:842:2: ( rule__OpenCommand__ValueAssignment_1 )
            // InternalSpec.g:842:3: rule__OpenCommand__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OpenCommand__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOpenCommandAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenCommand__Group__1__Impl"


    // $ANTLR start "rule__ClickCommand__Group_1__0"
    // InternalSpec.g:851:1: rule__ClickCommand__Group_1__0 : rule__ClickCommand__Group_1__0__Impl rule__ClickCommand__Group_1__1 ;
    public final void rule__ClickCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:855:1: ( rule__ClickCommand__Group_1__0__Impl rule__ClickCommand__Group_1__1 )
            // InternalSpec.g:856:2: rule__ClickCommand__Group_1__0__Impl rule__ClickCommand__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ClickCommand__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickCommand__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_1__0"


    // $ANTLR start "rule__ClickCommand__Group_1__0__Impl"
    // InternalSpec.g:863:1: rule__ClickCommand__Group_1__0__Impl : ( 'Click' ) ;
    public final void rule__ClickCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:867:1: ( ( 'Click' ) )
            // InternalSpec.g:868:1: ( 'Click' )
            {
            // InternalSpec.g:868:1: ( 'Click' )
            // InternalSpec.g:869:2: 'Click'
            {
             before(grammarAccess.getClickCommandAccess().getClickKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getClickCommandAccess().getClickKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_1__0__Impl"


    // $ANTLR start "rule__ClickCommand__Group_1__1"
    // InternalSpec.g:878:1: rule__ClickCommand__Group_1__1 : rule__ClickCommand__Group_1__1__Impl rule__ClickCommand__Group_1__2 ;
    public final void rule__ClickCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:882:1: ( rule__ClickCommand__Group_1__1__Impl rule__ClickCommand__Group_1__2 )
            // InternalSpec.g:883:2: rule__ClickCommand__Group_1__1__Impl rule__ClickCommand__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__ClickCommand__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickCommand__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_1__1"


    // $ANTLR start "rule__ClickCommand__Group_1__1__Impl"
    // InternalSpec.g:890:1: rule__ClickCommand__Group_1__1__Impl : ( 'on' ) ;
    public final void rule__ClickCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:894:1: ( ( 'on' ) )
            // InternalSpec.g:895:1: ( 'on' )
            {
            // InternalSpec.g:895:1: ( 'on' )
            // InternalSpec.g:896:2: 'on'
            {
             before(grammarAccess.getClickCommandAccess().getOnKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClickCommandAccess().getOnKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_1__1__Impl"


    // $ANTLR start "rule__ClickCommand__Group_1__2"
    // InternalSpec.g:905:1: rule__ClickCommand__Group_1__2 : rule__ClickCommand__Group_1__2__Impl ;
    public final void rule__ClickCommand__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:909:1: ( rule__ClickCommand__Group_1__2__Impl )
            // InternalSpec.g:910:2: rule__ClickCommand__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickCommand__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_1__2"


    // $ANTLR start "rule__ClickCommand__Group_1__2__Impl"
    // InternalSpec.g:916:1: rule__ClickCommand__Group_1__2__Impl : ( ( rule__ClickCommand__SelectorAssignment_1_2 ) ) ;
    public final void rule__ClickCommand__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:920:1: ( ( ( rule__ClickCommand__SelectorAssignment_1_2 ) ) )
            // InternalSpec.g:921:1: ( ( rule__ClickCommand__SelectorAssignment_1_2 ) )
            {
            // InternalSpec.g:921:1: ( ( rule__ClickCommand__SelectorAssignment_1_2 ) )
            // InternalSpec.g:922:2: ( rule__ClickCommand__SelectorAssignment_1_2 )
            {
             before(grammarAccess.getClickCommandAccess().getSelectorAssignment_1_2()); 
            // InternalSpec.g:923:2: ( rule__ClickCommand__SelectorAssignment_1_2 )
            // InternalSpec.g:923:3: rule__ClickCommand__SelectorAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ClickCommand__SelectorAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getClickCommandAccess().getSelectorAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_1__2__Impl"


    // $ANTLR start "rule__ClickCommand__Group_2__0"
    // InternalSpec.g:932:1: rule__ClickCommand__Group_2__0 : rule__ClickCommand__Group_2__0__Impl rule__ClickCommand__Group_2__1 ;
    public final void rule__ClickCommand__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:936:1: ( rule__ClickCommand__Group_2__0__Impl rule__ClickCommand__Group_2__1 )
            // InternalSpec.g:937:2: rule__ClickCommand__Group_2__0__Impl rule__ClickCommand__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__ClickCommand__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickCommand__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_2__0"


    // $ANTLR start "rule__ClickCommand__Group_2__0__Impl"
    // InternalSpec.g:944:1: rule__ClickCommand__Group_2__0__Impl : ( 'Click' ) ;
    public final void rule__ClickCommand__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:948:1: ( ( 'Click' ) )
            // InternalSpec.g:949:1: ( 'Click' )
            {
            // InternalSpec.g:949:1: ( 'Click' )
            // InternalSpec.g:950:2: 'Click'
            {
             before(grammarAccess.getClickCommandAccess().getClickKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getClickCommandAccess().getClickKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_2__0__Impl"


    // $ANTLR start "rule__ClickCommand__Group_2__1"
    // InternalSpec.g:959:1: rule__ClickCommand__Group_2__1 : rule__ClickCommand__Group_2__1__Impl rule__ClickCommand__Group_2__2 ;
    public final void rule__ClickCommand__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:963:1: ( rule__ClickCommand__Group_2__1__Impl rule__ClickCommand__Group_2__2 )
            // InternalSpec.g:964:2: rule__ClickCommand__Group_2__1__Impl rule__ClickCommand__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__ClickCommand__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickCommand__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_2__1"


    // $ANTLR start "rule__ClickCommand__Group_2__1__Impl"
    // InternalSpec.g:971:1: rule__ClickCommand__Group_2__1__Impl : ( 'at' ) ;
    public final void rule__ClickCommand__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:975:1: ( ( 'at' ) )
            // InternalSpec.g:976:1: ( 'at' )
            {
            // InternalSpec.g:976:1: ( 'at' )
            // InternalSpec.g:977:2: 'at'
            {
             before(grammarAccess.getClickCommandAccess().getAtKeyword_2_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClickCommandAccess().getAtKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_2__1__Impl"


    // $ANTLR start "rule__ClickCommand__Group_2__2"
    // InternalSpec.g:986:1: rule__ClickCommand__Group_2__2 : rule__ClickCommand__Group_2__2__Impl ;
    public final void rule__ClickCommand__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:990:1: ( rule__ClickCommand__Group_2__2__Impl )
            // InternalSpec.g:991:2: rule__ClickCommand__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickCommand__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_2__2"


    // $ANTLR start "rule__ClickCommand__Group_2__2__Impl"
    // InternalSpec.g:997:1: rule__ClickCommand__Group_2__2__Impl : ( ( rule__ClickCommand__PointAssignment_2_2 ) ) ;
    public final void rule__ClickCommand__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1001:1: ( ( ( rule__ClickCommand__PointAssignment_2_2 ) ) )
            // InternalSpec.g:1002:1: ( ( rule__ClickCommand__PointAssignment_2_2 ) )
            {
            // InternalSpec.g:1002:1: ( ( rule__ClickCommand__PointAssignment_2_2 ) )
            // InternalSpec.g:1003:2: ( rule__ClickCommand__PointAssignment_2_2 )
            {
             before(grammarAccess.getClickCommandAccess().getPointAssignment_2_2()); 
            // InternalSpec.g:1004:2: ( rule__ClickCommand__PointAssignment_2_2 )
            // InternalSpec.g:1004:3: rule__ClickCommand__PointAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ClickCommand__PointAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getClickCommandAccess().getPointAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_2__2__Impl"


    // $ANTLR start "rule__CommentCommand__Group__0"
    // InternalSpec.g:1013:1: rule__CommentCommand__Group__0 : rule__CommentCommand__Group__0__Impl rule__CommentCommand__Group__1 ;
    public final void rule__CommentCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1017:1: ( rule__CommentCommand__Group__0__Impl rule__CommentCommand__Group__1 )
            // InternalSpec.g:1018:2: rule__CommentCommand__Group__0__Impl rule__CommentCommand__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CommentCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommentCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentCommand__Group__0"


    // $ANTLR start "rule__CommentCommand__Group__0__Impl"
    // InternalSpec.g:1025:1: rule__CommentCommand__Group__0__Impl : ( '#' ) ;
    public final void rule__CommentCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1029:1: ( ( '#' ) )
            // InternalSpec.g:1030:1: ( '#' )
            {
            // InternalSpec.g:1030:1: ( '#' )
            // InternalSpec.g:1031:2: '#'
            {
             before(grammarAccess.getCommentCommandAccess().getNumberSignKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCommentCommandAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentCommand__Group__0__Impl"


    // $ANTLR start "rule__CommentCommand__Group__1"
    // InternalSpec.g:1040:1: rule__CommentCommand__Group__1 : rule__CommentCommand__Group__1__Impl ;
    public final void rule__CommentCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1044:1: ( rule__CommentCommand__Group__1__Impl )
            // InternalSpec.g:1045:2: rule__CommentCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommentCommand__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentCommand__Group__1"


    // $ANTLR start "rule__CommentCommand__Group__1__Impl"
    // InternalSpec.g:1051:1: rule__CommentCommand__Group__1__Impl : ( ( rule__CommentCommand__StrAssignment_1 ) ) ;
    public final void rule__CommentCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1055:1: ( ( ( rule__CommentCommand__StrAssignment_1 ) ) )
            // InternalSpec.g:1056:1: ( ( rule__CommentCommand__StrAssignment_1 ) )
            {
            // InternalSpec.g:1056:1: ( ( rule__CommentCommand__StrAssignment_1 ) )
            // InternalSpec.g:1057:2: ( rule__CommentCommand__StrAssignment_1 )
            {
             before(grammarAccess.getCommentCommandAccess().getStrAssignment_1()); 
            // InternalSpec.g:1058:2: ( rule__CommentCommand__StrAssignment_1 )
            // InternalSpec.g:1058:3: rule__CommentCommand__StrAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CommentCommand__StrAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommentCommandAccess().getStrAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentCommand__Group__1__Impl"


    // $ANTLR start "rule__SelectCommand__Group_0__0"
    // InternalSpec.g:1067:1: rule__SelectCommand__Group_0__0 : rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1 ;
    public final void rule__SelectCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1071:1: ( rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1 )
            // InternalSpec.g:1072:2: rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__SelectCommand__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectCommand__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Group_0__0"


    // $ANTLR start "rule__SelectCommand__Group_0__0__Impl"
    // InternalSpec.g:1079:1: rule__SelectCommand__Group_0__0__Impl : ( 'Within' ) ;
    public final void rule__SelectCommand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1083:1: ( ( 'Within' ) )
            // InternalSpec.g:1084:1: ( 'Within' )
            {
            // InternalSpec.g:1084:1: ( 'Within' )
            // InternalSpec.g:1085:2: 'Within'
            {
             before(grammarAccess.getSelectCommandAccess().getWithinKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSelectCommandAccess().getWithinKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Group_0__0__Impl"


    // $ANTLR start "rule__SelectCommand__Group_0__1"
    // InternalSpec.g:1094:1: rule__SelectCommand__Group_0__1 : rule__SelectCommand__Group_0__1__Impl ;
    public final void rule__SelectCommand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1098:1: ( rule__SelectCommand__Group_0__1__Impl )
            // InternalSpec.g:1099:2: rule__SelectCommand__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectCommand__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Group_0__1"


    // $ANTLR start "rule__SelectCommand__Group_0__1__Impl"
    // InternalSpec.g:1105:1: rule__SelectCommand__Group_0__1__Impl : ( ( rule__SelectCommand__ValueAssignment_0_1 ) ) ;
    public final void rule__SelectCommand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1109:1: ( ( ( rule__SelectCommand__ValueAssignment_0_1 ) ) )
            // InternalSpec.g:1110:1: ( ( rule__SelectCommand__ValueAssignment_0_1 ) )
            {
            // InternalSpec.g:1110:1: ( ( rule__SelectCommand__ValueAssignment_0_1 ) )
            // InternalSpec.g:1111:2: ( rule__SelectCommand__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSelectCommandAccess().getValueAssignment_0_1()); 
            // InternalSpec.g:1112:2: ( rule__SelectCommand__ValueAssignment_0_1 )
            // InternalSpec.g:1112:3: rule__SelectCommand__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectCommand__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectCommandAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Group_0__1__Impl"


    // $ANTLR start "rule__SelectCommand__Group_1__0"
    // InternalSpec.g:1121:1: rule__SelectCommand__Group_1__0 : rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1 ;
    public final void rule__SelectCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1125:1: ( rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1 )
            // InternalSpec.g:1126:2: rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__SelectCommand__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectCommand__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Group_1__0"


    // $ANTLR start "rule__SelectCommand__Group_1__0__Impl"
    // InternalSpec.g:1133:1: rule__SelectCommand__Group_1__0__Impl : ( 'Select' ) ;
    public final void rule__SelectCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1137:1: ( ( 'Select' ) )
            // InternalSpec.g:1138:1: ( 'Select' )
            {
            // InternalSpec.g:1138:1: ( 'Select' )
            // InternalSpec.g:1139:2: 'Select'
            {
             before(grammarAccess.getSelectCommandAccess().getSelectKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSelectCommandAccess().getSelectKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Group_1__0__Impl"


    // $ANTLR start "rule__SelectCommand__Group_1__1"
    // InternalSpec.g:1148:1: rule__SelectCommand__Group_1__1 : rule__SelectCommand__Group_1__1__Impl ;
    public final void rule__SelectCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1152:1: ( rule__SelectCommand__Group_1__1__Impl )
            // InternalSpec.g:1153:2: rule__SelectCommand__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectCommand__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Group_1__1"


    // $ANTLR start "rule__SelectCommand__Group_1__1__Impl"
    // InternalSpec.g:1159:1: rule__SelectCommand__Group_1__1__Impl : ( ( rule__SelectCommand__ValueAssignment_1_1 ) ) ;
    public final void rule__SelectCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1163:1: ( ( ( rule__SelectCommand__ValueAssignment_1_1 ) ) )
            // InternalSpec.g:1164:1: ( ( rule__SelectCommand__ValueAssignment_1_1 ) )
            {
            // InternalSpec.g:1164:1: ( ( rule__SelectCommand__ValueAssignment_1_1 ) )
            // InternalSpec.g:1165:2: ( rule__SelectCommand__ValueAssignment_1_1 )
            {
             before(grammarAccess.getSelectCommandAccess().getValueAssignment_1_1()); 
            // InternalSpec.g:1166:2: ( rule__SelectCommand__ValueAssignment_1_1 )
            // InternalSpec.g:1166:3: rule__SelectCommand__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectCommand__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectCommandAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Group_1__1__Impl"


    // $ANTLR start "rule__SelectCommand__Group_2__0"
    // InternalSpec.g:1175:1: rule__SelectCommand__Group_2__0 : rule__SelectCommand__Group_2__0__Impl rule__SelectCommand__Group_2__1 ;
    public final void rule__SelectCommand__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1179:1: ( rule__SelectCommand__Group_2__0__Impl rule__SelectCommand__Group_2__1 )
            // InternalSpec.g:1180:2: rule__SelectCommand__Group_2__0__Impl rule__SelectCommand__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__SelectCommand__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectCommand__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Group_2__0"


    // $ANTLR start "rule__SelectCommand__Group_2__0__Impl"
    // InternalSpec.g:1187:1: rule__SelectCommand__Group_2__0__Impl : ( 'Select' ) ;
    public final void rule__SelectCommand__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1191:1: ( ( 'Select' ) )
            // InternalSpec.g:1192:1: ( 'Select' )
            {
            // InternalSpec.g:1192:1: ( 'Select' )
            // InternalSpec.g:1193:2: 'Select'
            {
             before(grammarAccess.getSelectCommandAccess().getSelectKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSelectCommandAccess().getSelectKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Group_2__0__Impl"


    // $ANTLR start "rule__SelectCommand__Group_2__1"
    // InternalSpec.g:1202:1: rule__SelectCommand__Group_2__1 : rule__SelectCommand__Group_2__1__Impl rule__SelectCommand__Group_2__2 ;
    public final void rule__SelectCommand__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1206:1: ( rule__SelectCommand__Group_2__1__Impl rule__SelectCommand__Group_2__2 )
            // InternalSpec.g:1207:2: rule__SelectCommand__Group_2__1__Impl rule__SelectCommand__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__SelectCommand__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectCommand__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Group_2__1"


    // $ANTLR start "rule__SelectCommand__Group_2__1__Impl"
    // InternalSpec.g:1214:1: rule__SelectCommand__Group_2__1__Impl : ( 'visible' ) ;
    public final void rule__SelectCommand__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1218:1: ( ( 'visible' ) )
            // InternalSpec.g:1219:1: ( 'visible' )
            {
            // InternalSpec.g:1219:1: ( 'visible' )
            // InternalSpec.g:1220:2: 'visible'
            {
             before(grammarAccess.getSelectCommandAccess().getVisibleKeyword_2_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSelectCommandAccess().getVisibleKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Group_2__1__Impl"


    // $ANTLR start "rule__SelectCommand__Group_2__2"
    // InternalSpec.g:1229:1: rule__SelectCommand__Group_2__2 : rule__SelectCommand__Group_2__2__Impl ;
    public final void rule__SelectCommand__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1233:1: ( rule__SelectCommand__Group_2__2__Impl )
            // InternalSpec.g:1234:2: rule__SelectCommand__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectCommand__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Group_2__2"


    // $ANTLR start "rule__SelectCommand__Group_2__2__Impl"
    // InternalSpec.g:1240:1: rule__SelectCommand__Group_2__2__Impl : ( ( rule__SelectCommand__ValueAssignment_2_2 ) ) ;
    public final void rule__SelectCommand__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1244:1: ( ( ( rule__SelectCommand__ValueAssignment_2_2 ) ) )
            // InternalSpec.g:1245:1: ( ( rule__SelectCommand__ValueAssignment_2_2 ) )
            {
            // InternalSpec.g:1245:1: ( ( rule__SelectCommand__ValueAssignment_2_2 ) )
            // InternalSpec.g:1246:2: ( rule__SelectCommand__ValueAssignment_2_2 )
            {
             before(grammarAccess.getSelectCommandAccess().getValueAssignment_2_2()); 
            // InternalSpec.g:1247:2: ( rule__SelectCommand__ValueAssignment_2_2 )
            // InternalSpec.g:1247:3: rule__SelectCommand__ValueAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectCommand__ValueAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectCommandAccess().getValueAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Group_2__2__Impl"


    // $ANTLR start "rule__RememberCommand__Group__0"
    // InternalSpec.g:1256:1: rule__RememberCommand__Group__0 : rule__RememberCommand__Group__0__Impl rule__RememberCommand__Group__1 ;
    public final void rule__RememberCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1260:1: ( rule__RememberCommand__Group__0__Impl rule__RememberCommand__Group__1 )
            // InternalSpec.g:1261:2: rule__RememberCommand__Group__0__Impl rule__RememberCommand__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RememberCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RememberCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RememberCommand__Group__0"


    // $ANTLR start "rule__RememberCommand__Group__0__Impl"
    // InternalSpec.g:1268:1: rule__RememberCommand__Group__0__Impl : ( 'Remember' ) ;
    public final void rule__RememberCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1272:1: ( ( 'Remember' ) )
            // InternalSpec.g:1273:1: ( 'Remember' )
            {
            // InternalSpec.g:1273:1: ( 'Remember' )
            // InternalSpec.g:1274:2: 'Remember'
            {
             before(grammarAccess.getRememberCommandAccess().getRememberKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRememberCommandAccess().getRememberKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RememberCommand__Group__0__Impl"


    // $ANTLR start "rule__RememberCommand__Group__1"
    // InternalSpec.g:1283:1: rule__RememberCommand__Group__1 : rule__RememberCommand__Group__1__Impl rule__RememberCommand__Group__2 ;
    public final void rule__RememberCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1287:1: ( rule__RememberCommand__Group__1__Impl rule__RememberCommand__Group__2 )
            // InternalSpec.g:1288:2: rule__RememberCommand__Group__1__Impl rule__RememberCommand__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RememberCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RememberCommand__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RememberCommand__Group__1"


    // $ANTLR start "rule__RememberCommand__Group__1__Impl"
    // InternalSpec.g:1295:1: rule__RememberCommand__Group__1__Impl : ( ( rule__RememberCommand__PropAssignment_1 ) ) ;
    public final void rule__RememberCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1299:1: ( ( ( rule__RememberCommand__PropAssignment_1 ) ) )
            // InternalSpec.g:1300:1: ( ( rule__RememberCommand__PropAssignment_1 ) )
            {
            // InternalSpec.g:1300:1: ( ( rule__RememberCommand__PropAssignment_1 ) )
            // InternalSpec.g:1301:2: ( rule__RememberCommand__PropAssignment_1 )
            {
             before(grammarAccess.getRememberCommandAccess().getPropAssignment_1()); 
            // InternalSpec.g:1302:2: ( rule__RememberCommand__PropAssignment_1 )
            // InternalSpec.g:1302:3: rule__RememberCommand__PropAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RememberCommand__PropAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRememberCommandAccess().getPropAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RememberCommand__Group__1__Impl"


    // $ANTLR start "rule__RememberCommand__Group__2"
    // InternalSpec.g:1310:1: rule__RememberCommand__Group__2 : rule__RememberCommand__Group__2__Impl rule__RememberCommand__Group__3 ;
    public final void rule__RememberCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1314:1: ( rule__RememberCommand__Group__2__Impl rule__RememberCommand__Group__3 )
            // InternalSpec.g:1315:2: rule__RememberCommand__Group__2__Impl rule__RememberCommand__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__RememberCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RememberCommand__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RememberCommand__Group__2"


    // $ANTLR start "rule__RememberCommand__Group__2__Impl"
    // InternalSpec.g:1322:1: rule__RememberCommand__Group__2__Impl : ( 'as' ) ;
    public final void rule__RememberCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1326:1: ( ( 'as' ) )
            // InternalSpec.g:1327:1: ( 'as' )
            {
            // InternalSpec.g:1327:1: ( 'as' )
            // InternalSpec.g:1328:2: 'as'
            {
             before(grammarAccess.getRememberCommandAccess().getAsKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRememberCommandAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RememberCommand__Group__2__Impl"


    // $ANTLR start "rule__RememberCommand__Group__3"
    // InternalSpec.g:1337:1: rule__RememberCommand__Group__3 : rule__RememberCommand__Group__3__Impl ;
    public final void rule__RememberCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1341:1: ( rule__RememberCommand__Group__3__Impl )
            // InternalSpec.g:1342:2: rule__RememberCommand__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RememberCommand__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RememberCommand__Group__3"


    // $ANTLR start "rule__RememberCommand__Group__3__Impl"
    // InternalSpec.g:1348:1: rule__RememberCommand__Group__3__Impl : ( ( rule__RememberCommand__VarAssignment_3 ) ) ;
    public final void rule__RememberCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1352:1: ( ( ( rule__RememberCommand__VarAssignment_3 ) ) )
            // InternalSpec.g:1353:1: ( ( rule__RememberCommand__VarAssignment_3 ) )
            {
            // InternalSpec.g:1353:1: ( ( rule__RememberCommand__VarAssignment_3 ) )
            // InternalSpec.g:1354:2: ( rule__RememberCommand__VarAssignment_3 )
            {
             before(grammarAccess.getRememberCommandAccess().getVarAssignment_3()); 
            // InternalSpec.g:1355:2: ( rule__RememberCommand__VarAssignment_3 )
            // InternalSpec.g:1355:3: rule__RememberCommand__VarAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RememberCommand__VarAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRememberCommandAccess().getVarAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RememberCommand__Group__3__Impl"


    // $ANTLR start "rule__PropertyCommand__Group__0"
    // InternalSpec.g:1364:1: rule__PropertyCommand__Group__0 : rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1 ;
    public final void rule__PropertyCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1368:1: ( rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1 )
            // InternalSpec.g:1369:2: rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__PropertyCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCommand__Group__0"


    // $ANTLR start "rule__PropertyCommand__Group__0__Impl"
    // InternalSpec.g:1376:1: rule__PropertyCommand__Group__0__Impl : ( 'Property' ) ;
    public final void rule__PropertyCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1380:1: ( ( 'Property' ) )
            // InternalSpec.g:1381:1: ( 'Property' )
            {
            // InternalSpec.g:1381:1: ( 'Property' )
            // InternalSpec.g:1382:2: 'Property'
            {
             before(grammarAccess.getPropertyCommandAccess().getPropertyKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPropertyCommandAccess().getPropertyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCommand__Group__0__Impl"


    // $ANTLR start "rule__PropertyCommand__Group__1"
    // InternalSpec.g:1391:1: rule__PropertyCommand__Group__1 : rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2 ;
    public final void rule__PropertyCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1395:1: ( rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2 )
            // InternalSpec.g:1396:2: rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__PropertyCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCommand__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCommand__Group__1"


    // $ANTLR start "rule__PropertyCommand__Group__1__Impl"
    // InternalSpec.g:1403:1: rule__PropertyCommand__Group__1__Impl : ( ( rule__PropertyCommand__PropAssignment_1 ) ) ;
    public final void rule__PropertyCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1407:1: ( ( ( rule__PropertyCommand__PropAssignment_1 ) ) )
            // InternalSpec.g:1408:1: ( ( rule__PropertyCommand__PropAssignment_1 ) )
            {
            // InternalSpec.g:1408:1: ( ( rule__PropertyCommand__PropAssignment_1 ) )
            // InternalSpec.g:1409:2: ( rule__PropertyCommand__PropAssignment_1 )
            {
             before(grammarAccess.getPropertyCommandAccess().getPropAssignment_1()); 
            // InternalSpec.g:1410:2: ( rule__PropertyCommand__PropAssignment_1 )
            // InternalSpec.g:1410:3: rule__PropertyCommand__PropAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__PropAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCommandAccess().getPropAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCommand__Group__1__Impl"


    // $ANTLR start "rule__PropertyCommand__Group__2"
    // InternalSpec.g:1418:1: rule__PropertyCommand__Group__2 : rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3 ;
    public final void rule__PropertyCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1422:1: ( rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3 )
            // InternalSpec.g:1423:2: rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__PropertyCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCommand__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCommand__Group__2"


    // $ANTLR start "rule__PropertyCommand__Group__2__Impl"
    // InternalSpec.g:1430:1: rule__PropertyCommand__Group__2__Impl : ( ( rule__PropertyCommand__CondAssignment_2 ) ) ;
    public final void rule__PropertyCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1434:1: ( ( ( rule__PropertyCommand__CondAssignment_2 ) ) )
            // InternalSpec.g:1435:1: ( ( rule__PropertyCommand__CondAssignment_2 ) )
            {
            // InternalSpec.g:1435:1: ( ( rule__PropertyCommand__CondAssignment_2 ) )
            // InternalSpec.g:1436:2: ( rule__PropertyCommand__CondAssignment_2 )
            {
             before(grammarAccess.getPropertyCommandAccess().getCondAssignment_2()); 
            // InternalSpec.g:1437:2: ( rule__PropertyCommand__CondAssignment_2 )
            // InternalSpec.g:1437:3: rule__PropertyCommand__CondAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__CondAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCommandAccess().getCondAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCommand__Group__2__Impl"


    // $ANTLR start "rule__PropertyCommand__Group__3"
    // InternalSpec.g:1445:1: rule__PropertyCommand__Group__3 : rule__PropertyCommand__Group__3__Impl ;
    public final void rule__PropertyCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1449:1: ( rule__PropertyCommand__Group__3__Impl )
            // InternalSpec.g:1450:2: rule__PropertyCommand__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCommand__Group__3"


    // $ANTLR start "rule__PropertyCommand__Group__3__Impl"
    // InternalSpec.g:1456:1: rule__PropertyCommand__Group__3__Impl : ( ( rule__PropertyCommand__ValAssignment_3 ) ) ;
    public final void rule__PropertyCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1460:1: ( ( ( rule__PropertyCommand__ValAssignment_3 ) ) )
            // InternalSpec.g:1461:1: ( ( rule__PropertyCommand__ValAssignment_3 ) )
            {
            // InternalSpec.g:1461:1: ( ( rule__PropertyCommand__ValAssignment_3 ) )
            // InternalSpec.g:1462:2: ( rule__PropertyCommand__ValAssignment_3 )
            {
             before(grammarAccess.getPropertyCommandAccess().getValAssignment_3()); 
            // InternalSpec.g:1463:2: ( rule__PropertyCommand__ValAssignment_3 )
            // InternalSpec.g:1463:3: rule__PropertyCommand__ValAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__ValAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCommandAccess().getValAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCommand__Group__3__Impl"


    // $ANTLR start "rule__TypeCommand__Group__0"
    // InternalSpec.g:1472:1: rule__TypeCommand__Group__0 : rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1 ;
    public final void rule__TypeCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1476:1: ( rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1 )
            // InternalSpec.g:1477:2: rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TypeCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCommand__Group__0"


    // $ANTLR start "rule__TypeCommand__Group__0__Impl"
    // InternalSpec.g:1484:1: rule__TypeCommand__Group__0__Impl : ( 'Type' ) ;
    public final void rule__TypeCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1488:1: ( ( 'Type' ) )
            // InternalSpec.g:1489:1: ( 'Type' )
            {
            // InternalSpec.g:1489:1: ( 'Type' )
            // InternalSpec.g:1490:2: 'Type'
            {
             before(grammarAccess.getTypeCommandAccess().getTypeKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTypeCommandAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCommand__Group__0__Impl"


    // $ANTLR start "rule__TypeCommand__Group__1"
    // InternalSpec.g:1499:1: rule__TypeCommand__Group__1 : rule__TypeCommand__Group__1__Impl ;
    public final void rule__TypeCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1503:1: ( rule__TypeCommand__Group__1__Impl )
            // InternalSpec.g:1504:2: rule__TypeCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeCommand__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCommand__Group__1"


    // $ANTLR start "rule__TypeCommand__Group__1__Impl"
    // InternalSpec.g:1510:1: rule__TypeCommand__Group__1__Impl : ( ( rule__TypeCommand__ValAssignment_1 ) ) ;
    public final void rule__TypeCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1514:1: ( ( ( rule__TypeCommand__ValAssignment_1 ) ) )
            // InternalSpec.g:1515:1: ( ( rule__TypeCommand__ValAssignment_1 ) )
            {
            // InternalSpec.g:1515:1: ( ( rule__TypeCommand__ValAssignment_1 ) )
            // InternalSpec.g:1516:2: ( rule__TypeCommand__ValAssignment_1 )
            {
             before(grammarAccess.getTypeCommandAccess().getValAssignment_1()); 
            // InternalSpec.g:1517:2: ( rule__TypeCommand__ValAssignment_1 )
            // InternalSpec.g:1517:3: rule__TypeCommand__ValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeCommand__ValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeCommandAccess().getValAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCommand__Group__1__Impl"


    // $ANTLR start "rule__SleepCommand__Group__0"
    // InternalSpec.g:1526:1: rule__SleepCommand__Group__0 : rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1 ;
    public final void rule__SleepCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1530:1: ( rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1 )
            // InternalSpec.g:1531:2: rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__SleepCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SleepCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SleepCommand__Group__0"


    // $ANTLR start "rule__SleepCommand__Group__0__Impl"
    // InternalSpec.g:1538:1: rule__SleepCommand__Group__0__Impl : ( 'Sleep' ) ;
    public final void rule__SleepCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1542:1: ( ( 'Sleep' ) )
            // InternalSpec.g:1543:1: ( 'Sleep' )
            {
            // InternalSpec.g:1543:1: ( 'Sleep' )
            // InternalSpec.g:1544:2: 'Sleep'
            {
             before(grammarAccess.getSleepCommandAccess().getSleepKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSleepCommandAccess().getSleepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SleepCommand__Group__0__Impl"


    // $ANTLR start "rule__SleepCommand__Group__1"
    // InternalSpec.g:1553:1: rule__SleepCommand__Group__1 : rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2 ;
    public final void rule__SleepCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1557:1: ( rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2 )
            // InternalSpec.g:1558:2: rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__SleepCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SleepCommand__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SleepCommand__Group__1"


    // $ANTLR start "rule__SleepCommand__Group__1__Impl"
    // InternalSpec.g:1565:1: rule__SleepCommand__Group__1__Impl : ( 'for' ) ;
    public final void rule__SleepCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1569:1: ( ( 'for' ) )
            // InternalSpec.g:1570:1: ( 'for' )
            {
            // InternalSpec.g:1570:1: ( 'for' )
            // InternalSpec.g:1571:2: 'for'
            {
             before(grammarAccess.getSleepCommandAccess().getForKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSleepCommandAccess().getForKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SleepCommand__Group__1__Impl"


    // $ANTLR start "rule__SleepCommand__Group__2"
    // InternalSpec.g:1580:1: rule__SleepCommand__Group__2 : rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3 ;
    public final void rule__SleepCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1584:1: ( rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3 )
            // InternalSpec.g:1585:2: rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__SleepCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SleepCommand__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SleepCommand__Group__2"


    // $ANTLR start "rule__SleepCommand__Group__2__Impl"
    // InternalSpec.g:1592:1: rule__SleepCommand__Group__2__Impl : ( ( rule__SleepCommand__TimeAssignment_2 ) ) ;
    public final void rule__SleepCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1596:1: ( ( ( rule__SleepCommand__TimeAssignment_2 ) ) )
            // InternalSpec.g:1597:1: ( ( rule__SleepCommand__TimeAssignment_2 ) )
            {
            // InternalSpec.g:1597:1: ( ( rule__SleepCommand__TimeAssignment_2 ) )
            // InternalSpec.g:1598:2: ( rule__SleepCommand__TimeAssignment_2 )
            {
             before(grammarAccess.getSleepCommandAccess().getTimeAssignment_2()); 
            // InternalSpec.g:1599:2: ( rule__SleepCommand__TimeAssignment_2 )
            // InternalSpec.g:1599:3: rule__SleepCommand__TimeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SleepCommand__TimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSleepCommandAccess().getTimeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SleepCommand__Group__2__Impl"


    // $ANTLR start "rule__SleepCommand__Group__3"
    // InternalSpec.g:1607:1: rule__SleepCommand__Group__3 : rule__SleepCommand__Group__3__Impl ;
    public final void rule__SleepCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1611:1: ( rule__SleepCommand__Group__3__Impl )
            // InternalSpec.g:1612:2: rule__SleepCommand__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SleepCommand__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SleepCommand__Group__3"


    // $ANTLR start "rule__SleepCommand__Group__3__Impl"
    // InternalSpec.g:1618:1: rule__SleepCommand__Group__3__Impl : ( ( rule__SleepCommand__Alternatives_3 ) ) ;
    public final void rule__SleepCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1622:1: ( ( ( rule__SleepCommand__Alternatives_3 ) ) )
            // InternalSpec.g:1623:1: ( ( rule__SleepCommand__Alternatives_3 ) )
            {
            // InternalSpec.g:1623:1: ( ( rule__SleepCommand__Alternatives_3 ) )
            // InternalSpec.g:1624:2: ( rule__SleepCommand__Alternatives_3 )
            {
             before(grammarAccess.getSleepCommandAccess().getAlternatives_3()); 
            // InternalSpec.g:1625:2: ( rule__SleepCommand__Alternatives_3 )
            // InternalSpec.g:1625:3: rule__SleepCommand__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__SleepCommand__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getSleepCommandAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SleepCommand__Group__3__Impl"


    // $ANTLR start "rule__CustomCommand__Group__0"
    // InternalSpec.g:1634:1: rule__CustomCommand__Group__0 : rule__CustomCommand__Group__0__Impl rule__CustomCommand__Group__1 ;
    public final void rule__CustomCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1638:1: ( rule__CustomCommand__Group__0__Impl rule__CustomCommand__Group__1 )
            // InternalSpec.g:1639:2: rule__CustomCommand__Group__0__Impl rule__CustomCommand__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CustomCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCommand__Group__0"


    // $ANTLR start "rule__CustomCommand__Group__0__Impl"
    // InternalSpec.g:1646:1: rule__CustomCommand__Group__0__Impl : ( '!' ) ;
    public final void rule__CustomCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1650:1: ( ( '!' ) )
            // InternalSpec.g:1651:1: ( '!' )
            {
            // InternalSpec.g:1651:1: ( '!' )
            // InternalSpec.g:1652:2: '!'
            {
             before(grammarAccess.getCustomCommandAccess().getExclamationMarkKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCustomCommandAccess().getExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCommand__Group__0__Impl"


    // $ANTLR start "rule__CustomCommand__Group__1"
    // InternalSpec.g:1661:1: rule__CustomCommand__Group__1 : rule__CustomCommand__Group__1__Impl ;
    public final void rule__CustomCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1665:1: ( rule__CustomCommand__Group__1__Impl )
            // InternalSpec.g:1666:2: rule__CustomCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomCommand__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCommand__Group__1"


    // $ANTLR start "rule__CustomCommand__Group__1__Impl"
    // InternalSpec.g:1672:1: rule__CustomCommand__Group__1__Impl : ( ( rule__CustomCommand__CommandAssignment_1 ) ) ;
    public final void rule__CustomCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1676:1: ( ( ( rule__CustomCommand__CommandAssignment_1 ) ) )
            // InternalSpec.g:1677:1: ( ( rule__CustomCommand__CommandAssignment_1 ) )
            {
            // InternalSpec.g:1677:1: ( ( rule__CustomCommand__CommandAssignment_1 ) )
            // InternalSpec.g:1678:2: ( rule__CustomCommand__CommandAssignment_1 )
            {
             before(grammarAccess.getCustomCommandAccess().getCommandAssignment_1()); 
            // InternalSpec.g:1679:2: ( rule__CustomCommand__CommandAssignment_1 )
            // InternalSpec.g:1679:3: rule__CustomCommand__CommandAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomCommand__CommandAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomCommandAccess().getCommandAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCommand__Group__1__Impl"


    // $ANTLR start "rule__Selector__Group_1__0"
    // InternalSpec.g:1688:1: rule__Selector__Group_1__0 : rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 ;
    public final void rule__Selector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1692:1: ( rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 )
            // InternalSpec.g:1693:2: rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Selector__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__0"


    // $ANTLR start "rule__Selector__Group_1__0__Impl"
    // InternalSpec.g:1700:1: rule__Selector__Group_1__0__Impl : ( ( rule__Selector__TypeAssignment_1_0 ) ) ;
    public final void rule__Selector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1704:1: ( ( ( rule__Selector__TypeAssignment_1_0 ) ) )
            // InternalSpec.g:1705:1: ( ( rule__Selector__TypeAssignment_1_0 ) )
            {
            // InternalSpec.g:1705:1: ( ( rule__Selector__TypeAssignment_1_0 ) )
            // InternalSpec.g:1706:2: ( rule__Selector__TypeAssignment_1_0 )
            {
             before(grammarAccess.getSelectorAccess().getTypeAssignment_1_0()); 
            // InternalSpec.g:1707:2: ( rule__Selector__TypeAssignment_1_0 )
            // InternalSpec.g:1707:3: rule__Selector__TypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__TypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1__1"
    // InternalSpec.g:1715:1: rule__Selector__Group_1__1 : rule__Selector__Group_1__1__Impl ;
    public final void rule__Selector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1719:1: ( rule__Selector__Group_1__1__Impl )
            // InternalSpec.g:1720:2: rule__Selector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__1"


    // $ANTLR start "rule__Selector__Group_1__1__Impl"
    // InternalSpec.g:1726:1: rule__Selector__Group_1__1__Impl : ( ( rule__Selector__ValAssignment_1_1 ) ) ;
    public final void rule__Selector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1730:1: ( ( ( rule__Selector__ValAssignment_1_1 ) ) )
            // InternalSpec.g:1731:1: ( ( rule__Selector__ValAssignment_1_1 ) )
            {
            // InternalSpec.g:1731:1: ( ( rule__Selector__ValAssignment_1_1 ) )
            // InternalSpec.g:1732:2: ( rule__Selector__ValAssignment_1_1 )
            {
             before(grammarAccess.getSelectorAccess().getValAssignment_1_1()); 
            // InternalSpec.g:1733:2: ( rule__Selector__ValAssignment_1_1 )
            // InternalSpec.g:1733:3: rule__Selector__ValAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__ValAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getValAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__1__Impl"


    // $ANTLR start "rule__Selector__Group_3__0"
    // InternalSpec.g:1742:1: rule__Selector__Group_3__0 : rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1 ;
    public final void rule__Selector__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1746:1: ( rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1 )
            // InternalSpec.g:1747:2: rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Selector__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_3__0"


    // $ANTLR start "rule__Selector__Group_3__0__Impl"
    // InternalSpec.g:1754:1: rule__Selector__Group_3__0__Impl : ( ( rule__Selector__TypeAssignment_3_0 ) ) ;
    public final void rule__Selector__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1758:1: ( ( ( rule__Selector__TypeAssignment_3_0 ) ) )
            // InternalSpec.g:1759:1: ( ( rule__Selector__TypeAssignment_3_0 ) )
            {
            // InternalSpec.g:1759:1: ( ( rule__Selector__TypeAssignment_3_0 ) )
            // InternalSpec.g:1760:2: ( rule__Selector__TypeAssignment_3_0 )
            {
             before(grammarAccess.getSelectorAccess().getTypeAssignment_3_0()); 
            // InternalSpec.g:1761:2: ( rule__Selector__TypeAssignment_3_0 )
            // InternalSpec.g:1761:3: rule__Selector__TypeAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__TypeAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getTypeAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_3__0__Impl"


    // $ANTLR start "rule__Selector__Group_3__1"
    // InternalSpec.g:1769:1: rule__Selector__Group_3__1 : rule__Selector__Group_3__1__Impl ;
    public final void rule__Selector__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1773:1: ( rule__Selector__Group_3__1__Impl )
            // InternalSpec.g:1774:2: rule__Selector__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_3__1"


    // $ANTLR start "rule__Selector__Group_3__1__Impl"
    // InternalSpec.g:1780:1: rule__Selector__Group_3__1__Impl : ( ( rule__Selector__VarAssignment_3_1 ) ) ;
    public final void rule__Selector__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1784:1: ( ( ( rule__Selector__VarAssignment_3_1 ) ) )
            // InternalSpec.g:1785:1: ( ( rule__Selector__VarAssignment_3_1 ) )
            {
            // InternalSpec.g:1785:1: ( ( rule__Selector__VarAssignment_3_1 ) )
            // InternalSpec.g:1786:2: ( rule__Selector__VarAssignment_3_1 )
            {
             before(grammarAccess.getSelectorAccess().getVarAssignment_3_1()); 
            // InternalSpec.g:1787:2: ( rule__Selector__VarAssignment_3_1 )
            // InternalSpec.g:1787:3: rule__Selector__VarAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__VarAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getVarAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_3__1__Impl"


    // $ANTLR start "rule__Condition__Group_0__0"
    // InternalSpec.g:1796:1: rule__Condition__Group_0__0 : rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 ;
    public final void rule__Condition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1800:1: ( rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 )
            // InternalSpec.g:1801:2: rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1
            {
            pushFollow(FOLLOW_18);
            rule__Condition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__0"


    // $ANTLR start "rule__Condition__Group_0__0__Impl"
    // InternalSpec.g:1808:1: rule__Condition__Group_0__0__Impl : ( 'should' ) ;
    public final void rule__Condition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1812:1: ( ( 'should' ) )
            // InternalSpec.g:1813:1: ( 'should' )
            {
            // InternalSpec.g:1813:1: ( 'should' )
            // InternalSpec.g:1814:2: 'should'
            {
             before(grammarAccess.getConditionAccess().getShouldKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getShouldKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__0__Impl"


    // $ANTLR start "rule__Condition__Group_0__1"
    // InternalSpec.g:1823:1: rule__Condition__Group_0__1 : rule__Condition__Group_0__1__Impl ;
    public final void rule__Condition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1827:1: ( rule__Condition__Group_0__1__Impl )
            // InternalSpec.g:1828:2: rule__Condition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__1"


    // $ANTLR start "rule__Condition__Group_0__1__Impl"
    // InternalSpec.g:1834:1: rule__Condition__Group_0__1__Impl : ( 'be' ) ;
    public final void rule__Condition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1838:1: ( ( 'be' ) )
            // InternalSpec.g:1839:1: ( 'be' )
            {
            // InternalSpec.g:1839:1: ( 'be' )
            // InternalSpec.g:1840:2: 'be'
            {
             before(grammarAccess.getConditionAccess().getBeKeyword_0_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getBeKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__1__Impl"


    // $ANTLR start "rule__Condition__Group_1__0"
    // InternalSpec.g:1850:1: rule__Condition__Group_1__0 : rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 ;
    public final void rule__Condition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1854:1: ( rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 )
            // InternalSpec.g:1855:2: rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Condition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0"


    // $ANTLR start "rule__Condition__Group_1__0__Impl"
    // InternalSpec.g:1862:1: rule__Condition__Group_1__0__Impl : ( 'should' ) ;
    public final void rule__Condition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1866:1: ( ( 'should' ) )
            // InternalSpec.g:1867:1: ( 'should' )
            {
            // InternalSpec.g:1867:1: ( 'should' )
            // InternalSpec.g:1868:2: 'should'
            {
             before(grammarAccess.getConditionAccess().getShouldKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getShouldKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0__Impl"


    // $ANTLR start "rule__Condition__Group_1__1"
    // InternalSpec.g:1877:1: rule__Condition__Group_1__1 : rule__Condition__Group_1__1__Impl rule__Condition__Group_1__2 ;
    public final void rule__Condition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1881:1: ( rule__Condition__Group_1__1__Impl rule__Condition__Group_1__2 )
            // InternalSpec.g:1882:2: rule__Condition__Group_1__1__Impl rule__Condition__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__Condition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1"


    // $ANTLR start "rule__Condition__Group_1__1__Impl"
    // InternalSpec.g:1889:1: rule__Condition__Group_1__1__Impl : ( 'not' ) ;
    public final void rule__Condition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1893:1: ( ( 'not' ) )
            // InternalSpec.g:1894:1: ( 'not' )
            {
            // InternalSpec.g:1894:1: ( 'not' )
            // InternalSpec.g:1895:2: 'not'
            {
             before(grammarAccess.getConditionAccess().getNotKeyword_1_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNotKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1__Impl"


    // $ANTLR start "rule__Condition__Group_1__2"
    // InternalSpec.g:1904:1: rule__Condition__Group_1__2 : rule__Condition__Group_1__2__Impl ;
    public final void rule__Condition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1908:1: ( rule__Condition__Group_1__2__Impl )
            // InternalSpec.g:1909:2: rule__Condition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__2"


    // $ANTLR start "rule__Condition__Group_1__2__Impl"
    // InternalSpec.g:1915:1: rule__Condition__Group_1__2__Impl : ( 'be' ) ;
    public final void rule__Condition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1919:1: ( ( 'be' ) )
            // InternalSpec.g:1920:1: ( 'be' )
            {
            // InternalSpec.g:1920:1: ( 'be' )
            // InternalSpec.g:1921:2: 'be'
            {
             before(grammarAccess.getConditionAccess().getBeKeyword_1_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getBeKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__2__Impl"


    // $ANTLR start "rule__Point__Group__0"
    // InternalSpec.g:1931:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1935:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalSpec.g:1936:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Point__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0"


    // $ANTLR start "rule__Point__Group__0__Impl"
    // InternalSpec.g:1943:1: rule__Point__Group__0__Impl : ( '{' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1947:1: ( ( '{' ) )
            // InternalSpec.g:1948:1: ( '{' )
            {
            // InternalSpec.g:1948:1: ( '{' )
            // InternalSpec.g:1949:2: '{'
            {
             before(grammarAccess.getPointAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0__Impl"


    // $ANTLR start "rule__Point__Group__1"
    // InternalSpec.g:1958:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1962:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalSpec.g:1963:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Point__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__1"


    // $ANTLR start "rule__Point__Group__1__Impl"
    // InternalSpec.g:1970:1: rule__Point__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1974:1: ( ( RULE_INT ) )
            // InternalSpec.g:1975:1: ( RULE_INT )
            {
            // InternalSpec.g:1975:1: ( RULE_INT )
            // InternalSpec.g:1976:2: RULE_INT
            {
             before(grammarAccess.getPointAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__1__Impl"


    // $ANTLR start "rule__Point__Group__2"
    // InternalSpec.g:1985:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1989:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalSpec.g:1990:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Point__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__2"


    // $ANTLR start "rule__Point__Group__2__Impl"
    // InternalSpec.g:1997:1: rule__Point__Group__2__Impl : ( ',' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2001:1: ( ( ',' ) )
            // InternalSpec.g:2002:1: ( ',' )
            {
            // InternalSpec.g:2002:1: ( ',' )
            // InternalSpec.g:2003:2: ','
            {
             before(grammarAccess.getPointAccess().getCommaKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__2__Impl"


    // $ANTLR start "rule__Point__Group__3"
    // InternalSpec.g:2012:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2016:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // InternalSpec.g:2017:2: rule__Point__Group__3__Impl rule__Point__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Point__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__3"


    // $ANTLR start "rule__Point__Group__3__Impl"
    // InternalSpec.g:2024:1: rule__Point__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2028:1: ( ( RULE_INT ) )
            // InternalSpec.g:2029:1: ( RULE_INT )
            {
            // InternalSpec.g:2029:1: ( RULE_INT )
            // InternalSpec.g:2030:2: RULE_INT
            {
             before(grammarAccess.getPointAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__3__Impl"


    // $ANTLR start "rule__Point__Group__4"
    // InternalSpec.g:2039:1: rule__Point__Group__4 : rule__Point__Group__4__Impl ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2043:1: ( rule__Point__Group__4__Impl )
            // InternalSpec.g:2044:2: rule__Point__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__4"


    // $ANTLR start "rule__Point__Group__4__Impl"
    // InternalSpec.g:2050:1: rule__Point__Group__4__Impl : ( '}' ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2054:1: ( ( '}' ) )
            // InternalSpec.g:2055:1: ( '}' )
            {
            // InternalSpec.g:2055:1: ( '}' )
            // InternalSpec.g:2056:2: '}'
            {
             before(grammarAccess.getPointAccess().getRightCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalSpec.g:2066:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2070:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalSpec.g:2071:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalSpec.g:2078:1: rule__Variable__Group__0__Impl : ( '$' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2082:1: ( ( '$' ) )
            // InternalSpec.g:2083:1: ( '$' )
            {
            // InternalSpec.g:2083:1: ( '$' )
            // InternalSpec.g:2084:2: '$'
            {
             before(grammarAccess.getVariableAccess().getDollarSignKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getDollarSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalSpec.g:2093:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2097:1: ( rule__Variable__Group__1__Impl )
            // InternalSpec.g:2098:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalSpec.g:2104:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2108:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalSpec.g:2109:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalSpec.g:2109:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalSpec.g:2110:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalSpec.g:2111:2: ( rule__Variable__NameAssignment_1 )
            // InternalSpec.g:2111:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Model__CommandsAssignment"
    // InternalSpec.g:2120:1: rule__Model__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2124:1: ( ( ruleCommand ) )
            // InternalSpec.g:2125:2: ( ruleCommand )
            {
            // InternalSpec.g:2125:2: ( ruleCommand )
            // InternalSpec.g:2126:3: ruleCommand
            {
             before(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CommandsAssignment"


    // $ANTLR start "rule__OpenCommand__ValueAssignment_1"
    // InternalSpec.g:2135:1: rule__OpenCommand__ValueAssignment_1 : ( ruleValue ) ;
    public final void rule__OpenCommand__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2139:1: ( ( ruleValue ) )
            // InternalSpec.g:2140:2: ( ruleValue )
            {
            // InternalSpec.g:2140:2: ( ruleValue )
            // InternalSpec.g:2141:3: ruleValue
            {
             before(grammarAccess.getOpenCommandAccess().getValueValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getOpenCommandAccess().getValueValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenCommand__ValueAssignment_1"


    // $ANTLR start "rule__ClickCommand__CmdAssignment_0"
    // InternalSpec.g:2150:1: rule__ClickCommand__CmdAssignment_0 : ( ( 'Click' ) ) ;
    public final void rule__ClickCommand__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2154:1: ( ( ( 'Click' ) ) )
            // InternalSpec.g:2155:2: ( ( 'Click' ) )
            {
            // InternalSpec.g:2155:2: ( ( 'Click' ) )
            // InternalSpec.g:2156:3: ( 'Click' )
            {
             before(grammarAccess.getClickCommandAccess().getCmdClickKeyword_0_0()); 
            // InternalSpec.g:2157:3: ( 'Click' )
            // InternalSpec.g:2158:4: 'Click'
            {
             before(grammarAccess.getClickCommandAccess().getCmdClickKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getClickCommandAccess().getCmdClickKeyword_0_0()); 

            }

             after(grammarAccess.getClickCommandAccess().getCmdClickKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__CmdAssignment_0"


    // $ANTLR start "rule__ClickCommand__SelectorAssignment_1_2"
    // InternalSpec.g:2169:1: rule__ClickCommand__SelectorAssignment_1_2 : ( ruleSelector ) ;
    public final void rule__ClickCommand__SelectorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2173:1: ( ( ruleSelector ) )
            // InternalSpec.g:2174:2: ( ruleSelector )
            {
            // InternalSpec.g:2174:2: ( ruleSelector )
            // InternalSpec.g:2175:3: ruleSelector
            {
             before(grammarAccess.getClickCommandAccess().getSelectorSelectorParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getClickCommandAccess().getSelectorSelectorParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__SelectorAssignment_1_2"


    // $ANTLR start "rule__ClickCommand__PointAssignment_2_2"
    // InternalSpec.g:2184:1: rule__ClickCommand__PointAssignment_2_2 : ( rulePoint ) ;
    public final void rule__ClickCommand__PointAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2188:1: ( ( rulePoint ) )
            // InternalSpec.g:2189:2: ( rulePoint )
            {
            // InternalSpec.g:2189:2: ( rulePoint )
            // InternalSpec.g:2190:3: rulePoint
            {
             before(grammarAccess.getClickCommandAccess().getPointPointParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getClickCommandAccess().getPointPointParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__PointAssignment_2_2"


    // $ANTLR start "rule__CommentCommand__StrAssignment_1"
    // InternalSpec.g:2199:1: rule__CommentCommand__StrAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CommentCommand__StrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2203:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2204:2: ( RULE_STRING )
            {
            // InternalSpec.g:2204:2: ( RULE_STRING )
            // InternalSpec.g:2205:3: RULE_STRING
            {
             before(grammarAccess.getCommentCommandAccess().getStrSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCommentCommandAccess().getStrSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentCommand__StrAssignment_1"


    // $ANTLR start "rule__SelectCommand__ValueAssignment_0_1"
    // InternalSpec.g:2214:1: rule__SelectCommand__ValueAssignment_0_1 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2218:1: ( ( ruleSelector ) )
            // InternalSpec.g:2219:2: ( ruleSelector )
            {
            // InternalSpec.g:2219:2: ( ruleSelector )
            // InternalSpec.g:2220:3: ruleSelector
            {
             before(grammarAccess.getSelectCommandAccess().getValueSelectorParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectCommandAccess().getValueSelectorParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__ValueAssignment_0_1"


    // $ANTLR start "rule__SelectCommand__ValueAssignment_1_1"
    // InternalSpec.g:2229:1: rule__SelectCommand__ValueAssignment_1_1 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2233:1: ( ( ruleSelector ) )
            // InternalSpec.g:2234:2: ( ruleSelector )
            {
            // InternalSpec.g:2234:2: ( ruleSelector )
            // InternalSpec.g:2235:3: ruleSelector
            {
             before(grammarAccess.getSelectCommandAccess().getValueSelectorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectCommandAccess().getValueSelectorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__ValueAssignment_1_1"


    // $ANTLR start "rule__SelectCommand__ValueAssignment_2_2"
    // InternalSpec.g:2244:1: rule__SelectCommand__ValueAssignment_2_2 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2248:1: ( ( ruleSelector ) )
            // InternalSpec.g:2249:2: ( ruleSelector )
            {
            // InternalSpec.g:2249:2: ( ruleSelector )
            // InternalSpec.g:2250:3: ruleSelector
            {
             before(grammarAccess.getSelectCommandAccess().getValueSelectorParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectCommandAccess().getValueSelectorParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__ValueAssignment_2_2"


    // $ANTLR start "rule__RememberCommand__PropAssignment_1"
    // InternalSpec.g:2259:1: rule__RememberCommand__PropAssignment_1 : ( ruleProperty ) ;
    public final void rule__RememberCommand__PropAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2263:1: ( ( ruleProperty ) )
            // InternalSpec.g:2264:2: ( ruleProperty )
            {
            // InternalSpec.g:2264:2: ( ruleProperty )
            // InternalSpec.g:2265:3: ruleProperty
            {
             before(grammarAccess.getRememberCommandAccess().getPropPropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getRememberCommandAccess().getPropPropertyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RememberCommand__PropAssignment_1"


    // $ANTLR start "rule__RememberCommand__VarAssignment_3"
    // InternalSpec.g:2274:1: rule__RememberCommand__VarAssignment_3 : ( ruleVariable ) ;
    public final void rule__RememberCommand__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2278:1: ( ( ruleVariable ) )
            // InternalSpec.g:2279:2: ( ruleVariable )
            {
            // InternalSpec.g:2279:2: ( ruleVariable )
            // InternalSpec.g:2280:3: ruleVariable
            {
             before(grammarAccess.getRememberCommandAccess().getVarVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getRememberCommandAccess().getVarVariableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RememberCommand__VarAssignment_3"


    // $ANTLR start "rule__PropertyCommand__PropAssignment_1"
    // InternalSpec.g:2289:1: rule__PropertyCommand__PropAssignment_1 : ( ruleProperty ) ;
    public final void rule__PropertyCommand__PropAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2293:1: ( ( ruleProperty ) )
            // InternalSpec.g:2294:2: ( ruleProperty )
            {
            // InternalSpec.g:2294:2: ( ruleProperty )
            // InternalSpec.g:2295:3: ruleProperty
            {
             before(grammarAccess.getPropertyCommandAccess().getPropPropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyCommandAccess().getPropPropertyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCommand__PropAssignment_1"


    // $ANTLR start "rule__PropertyCommand__CondAssignment_2"
    // InternalSpec.g:2304:1: rule__PropertyCommand__CondAssignment_2 : ( ruleCondition ) ;
    public final void rule__PropertyCommand__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2308:1: ( ( ruleCondition ) )
            // InternalSpec.g:2309:2: ( ruleCondition )
            {
            // InternalSpec.g:2309:2: ( ruleCondition )
            // InternalSpec.g:2310:3: ruleCondition
            {
             before(grammarAccess.getPropertyCommandAccess().getCondConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPropertyCommandAccess().getCondConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCommand__CondAssignment_2"


    // $ANTLR start "rule__PropertyCommand__ValAssignment_3"
    // InternalSpec.g:2319:1: rule__PropertyCommand__ValAssignment_3 : ( ruleValue ) ;
    public final void rule__PropertyCommand__ValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2323:1: ( ( ruleValue ) )
            // InternalSpec.g:2324:2: ( ruleValue )
            {
            // InternalSpec.g:2324:2: ( ruleValue )
            // InternalSpec.g:2325:3: ruleValue
            {
             before(grammarAccess.getPropertyCommandAccess().getValValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPropertyCommandAccess().getValValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCommand__ValAssignment_3"


    // $ANTLR start "rule__TypeCommand__ValAssignment_1"
    // InternalSpec.g:2334:1: rule__TypeCommand__ValAssignment_1 : ( ruleValue ) ;
    public final void rule__TypeCommand__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2338:1: ( ( ruleValue ) )
            // InternalSpec.g:2339:2: ( ruleValue )
            {
            // InternalSpec.g:2339:2: ( ruleValue )
            // InternalSpec.g:2340:3: ruleValue
            {
             before(grammarAccess.getTypeCommandAccess().getValValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getTypeCommandAccess().getValValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCommand__ValAssignment_1"


    // $ANTLR start "rule__SleepCommand__TimeAssignment_2"
    // InternalSpec.g:2349:1: rule__SleepCommand__TimeAssignment_2 : ( RULE_INT ) ;
    public final void rule__SleepCommand__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2353:1: ( ( RULE_INT ) )
            // InternalSpec.g:2354:2: ( RULE_INT )
            {
            // InternalSpec.g:2354:2: ( RULE_INT )
            // InternalSpec.g:2355:3: RULE_INT
            {
             before(grammarAccess.getSleepCommandAccess().getTimeINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSleepCommandAccess().getTimeINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SleepCommand__TimeAssignment_2"


    // $ANTLR start "rule__CustomCommand__CommandAssignment_1"
    // InternalSpec.g:2364:1: rule__CustomCommand__CommandAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomCommand__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2368:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2369:2: ( RULE_STRING )
            {
            // InternalSpec.g:2369:2: ( RULE_STRING )
            // InternalSpec.g:2370:3: RULE_STRING
            {
             before(grammarAccess.getCustomCommandAccess().getCommandSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomCommandAccess().getCommandSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCommand__CommandAssignment_1"


    // $ANTLR start "rule__Selector__ValAssignment_0"
    // InternalSpec.g:2379:1: rule__Selector__ValAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Selector__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2383:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2384:2: ( RULE_STRING )
            {
            // InternalSpec.g:2384:2: ( RULE_STRING )
            // InternalSpec.g:2385:3: RULE_STRING
            {
             before(grammarAccess.getSelectorAccess().getValSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getValSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__ValAssignment_0"


    // $ANTLR start "rule__Selector__TypeAssignment_1_0"
    // InternalSpec.g:2394:1: rule__Selector__TypeAssignment_1_0 : ( ruleElementType ) ;
    public final void rule__Selector__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2398:1: ( ( ruleElementType ) )
            // InternalSpec.g:2399:2: ( ruleElementType )
            {
            // InternalSpec.g:2399:2: ( ruleElementType )
            // InternalSpec.g:2400:3: ruleElementType
            {
             before(grammarAccess.getSelectorAccess().getTypeElementTypeEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getTypeElementTypeEnumRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__TypeAssignment_1_0"


    // $ANTLR start "rule__Selector__ValAssignment_1_1"
    // InternalSpec.g:2409:1: rule__Selector__ValAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Selector__ValAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2413:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2414:2: ( RULE_STRING )
            {
            // InternalSpec.g:2414:2: ( RULE_STRING )
            // InternalSpec.g:2415:3: RULE_STRING
            {
             before(grammarAccess.getSelectorAccess().getValSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getValSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__ValAssignment_1_1"


    // $ANTLR start "rule__Selector__VarAssignment_2"
    // InternalSpec.g:2424:1: rule__Selector__VarAssignment_2 : ( ruleVariable ) ;
    public final void rule__Selector__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2428:1: ( ( ruleVariable ) )
            // InternalSpec.g:2429:2: ( ruleVariable )
            {
            // InternalSpec.g:2429:2: ( ruleVariable )
            // InternalSpec.g:2430:3: ruleVariable
            {
             before(grammarAccess.getSelectorAccess().getVarVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getVarVariableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__VarAssignment_2"


    // $ANTLR start "rule__Selector__TypeAssignment_3_0"
    // InternalSpec.g:2439:1: rule__Selector__TypeAssignment_3_0 : ( ruleElementType ) ;
    public final void rule__Selector__TypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2443:1: ( ( ruleElementType ) )
            // InternalSpec.g:2444:2: ( ruleElementType )
            {
            // InternalSpec.g:2444:2: ( ruleElementType )
            // InternalSpec.g:2445:3: ruleElementType
            {
             before(grammarAccess.getSelectorAccess().getTypeElementTypeEnumRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getTypeElementTypeEnumRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__TypeAssignment_3_0"


    // $ANTLR start "rule__Selector__VarAssignment_3_1"
    // InternalSpec.g:2454:1: rule__Selector__VarAssignment_3_1 : ( ruleVariable ) ;
    public final void rule__Selector__VarAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2458:1: ( ( ruleVariable ) )
            // InternalSpec.g:2459:2: ( ruleVariable )
            {
            // InternalSpec.g:2459:2: ( ruleVariable )
            // InternalSpec.g:2460:3: ruleVariable
            {
             before(grammarAccess.getSelectorAccess().getVarVariableParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getVarVariableParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__VarAssignment_3_1"


    // $ANTLR start "rule__Value__ValAssignment_0"
    // InternalSpec.g:2469:1: rule__Value__ValAssignment_0 : ( ruleVariable ) ;
    public final void rule__Value__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2473:1: ( ( ruleVariable ) )
            // InternalSpec.g:2474:2: ( ruleVariable )
            {
            // InternalSpec.g:2474:2: ( ruleVariable )
            // InternalSpec.g:2475:3: ruleVariable
            {
             before(grammarAccess.getValueAccess().getValVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValAssignment_0"


    // $ANTLR start "rule__Value__StrAssignment_1"
    // InternalSpec.g:2484:1: rule__Value__StrAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Value__StrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2488:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2489:2: ( RULE_STRING )
            {
            // InternalSpec.g:2489:2: ( RULE_STRING )
            // InternalSpec.g:2490:3: RULE_STRING
            {
             before(grammarAccess.getValueAccess().getStrSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getStrSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__StrAssignment_1"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalSpec.g:2499:1: rule__Variable__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2503:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2504:2: ( RULE_STRING )
            {
            // InternalSpec.g:2504:2: ( RULE_STRING )
            // InternalSpec.g:2505:3: RULE_STRING
            {
             before(grammarAccess.getVariableAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\5\1\uffff\5\5\3\uffff";
    static final String dfa_3s = "\1\52\1\uffff\5\52\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\5\uffff\1\3\1\2\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\12\uffff\1\2\1\3\1\4\1\5\1\6\25\uffff\1\7",
            "",
            "\1\10\44\uffff\1\11",
            "\1\10\44\uffff\1\11",
            "\1\10\44\uffff\1\11",
            "\1\10\44\uffff\1\11",
            "\1\10\44\uffff\1\11",
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
            return "656:1: rule__Selector__Alternatives : ( ( ( rule__Selector__ValAssignment_0 ) ) | ( ( rule__Selector__Group_1__0 ) ) | ( ( rule__Selector__VarAssignment_2 ) ) | ( ( rule__Selector__Group_3__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000BAE600002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000400001F0020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});

}
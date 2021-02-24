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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_CUSTOM_COMMAND", "RULE_ID", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'text'", "'class'", "'value'", "'second'", "'seconds'", "'button'", "'element'", "'link'", "'input'", "'textarea'", "'Open'", "'Click'", "'on'", "'at'", "'Within'", "'Select'", "'visible'", "'Store'", "'as'", "'Remember'", "'Property'", "'should'", "'be'", "'not'", "'Type'", "'Sleep'", "'for'", "'{'", "','", "'}'", "'$'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=6;
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
    public static final int RULE_CUSTOM_COMMAND=7;
    public static final int RULE_ID=8;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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

                if ( ((LA1_0>=RULE_SL_COMMENT && LA1_0<=RULE_CUSTOM_COMMAND)||(LA1_0>=22 && LA1_0<=23)||(LA1_0>=26 && LA1_0<=27)||LA1_0==29||(LA1_0>=31 && LA1_0<=32)||(LA1_0>=36 && LA1_0<=37)) ) {
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
    // InternalSpec.g:112:1: ruleOpenCommand : ( ( rule__OpenCommand__Alternatives ) ) ;
    public final void ruleOpenCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:116:2: ( ( ( rule__OpenCommand__Alternatives ) ) )
            // InternalSpec.g:117:2: ( ( rule__OpenCommand__Alternatives ) )
            {
            // InternalSpec.g:117:2: ( ( rule__OpenCommand__Alternatives ) )
            // InternalSpec.g:118:3: ( rule__OpenCommand__Alternatives )
            {
             before(grammarAccess.getOpenCommandAccess().getAlternatives()); 
            // InternalSpec.g:119:3: ( rule__OpenCommand__Alternatives )
            // InternalSpec.g:119:4: rule__OpenCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpenCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpenCommandAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleSelectCommand"
    // InternalSpec.g:153:1: entryRuleSelectCommand : ruleSelectCommand EOF ;
    public final void entryRuleSelectCommand() throws RecognitionException {
        try {
            // InternalSpec.g:154:1: ( ruleSelectCommand EOF )
            // InternalSpec.g:155:1: ruleSelectCommand EOF
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
    // InternalSpec.g:162:1: ruleSelectCommand : ( ( rule__SelectCommand__Alternatives ) ) ;
    public final void ruleSelectCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:166:2: ( ( ( rule__SelectCommand__Alternatives ) ) )
            // InternalSpec.g:167:2: ( ( rule__SelectCommand__Alternatives ) )
            {
            // InternalSpec.g:167:2: ( ( rule__SelectCommand__Alternatives ) )
            // InternalSpec.g:168:3: ( rule__SelectCommand__Alternatives )
            {
             before(grammarAccess.getSelectCommandAccess().getAlternatives()); 
            // InternalSpec.g:169:3: ( rule__SelectCommand__Alternatives )
            // InternalSpec.g:169:4: rule__SelectCommand__Alternatives
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


    // $ANTLR start "entryRuleSelector"
    // InternalSpec.g:178:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalSpec.g:179:1: ( ruleSelector EOF )
            // InternalSpec.g:180:1: ruleSelector EOF
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
    // InternalSpec.g:187:1: ruleSelector : ( ( rule__Selector__Alternatives ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:191:2: ( ( ( rule__Selector__Alternatives ) ) )
            // InternalSpec.g:192:2: ( ( rule__Selector__Alternatives ) )
            {
            // InternalSpec.g:192:2: ( ( rule__Selector__Alternatives ) )
            // InternalSpec.g:193:3: ( rule__Selector__Alternatives )
            {
             before(grammarAccess.getSelectorAccess().getAlternatives()); 
            // InternalSpec.g:194:3: ( rule__Selector__Alternatives )
            // InternalSpec.g:194:4: rule__Selector__Alternatives
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


    // $ANTLR start "entryRuleStoreCommand"
    // InternalSpec.g:203:1: entryRuleStoreCommand : ruleStoreCommand EOF ;
    public final void entryRuleStoreCommand() throws RecognitionException {
        try {
            // InternalSpec.g:204:1: ( ruleStoreCommand EOF )
            // InternalSpec.g:205:1: ruleStoreCommand EOF
            {
             before(grammarAccess.getStoreCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleStoreCommand();

            state._fsp--;

             after(grammarAccess.getStoreCommandRule()); 
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
    // $ANTLR end "entryRuleStoreCommand"


    // $ANTLR start "ruleStoreCommand"
    // InternalSpec.g:212:1: ruleStoreCommand : ( ( rule__StoreCommand__Group__0 ) ) ;
    public final void ruleStoreCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:216:2: ( ( ( rule__StoreCommand__Group__0 ) ) )
            // InternalSpec.g:217:2: ( ( rule__StoreCommand__Group__0 ) )
            {
            // InternalSpec.g:217:2: ( ( rule__StoreCommand__Group__0 ) )
            // InternalSpec.g:218:3: ( rule__StoreCommand__Group__0 )
            {
             before(grammarAccess.getStoreCommandAccess().getGroup()); 
            // InternalSpec.g:219:3: ( rule__StoreCommand__Group__0 )
            // InternalSpec.g:219:4: rule__StoreCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StoreCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoreCommandAccess().getGroup()); 

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
    // $ANTLR end "ruleStoreCommand"


    // $ANTLR start "entryRuleRememberCommand"
    // InternalSpec.g:228:1: entryRuleRememberCommand : ruleRememberCommand EOF ;
    public final void entryRuleRememberCommand() throws RecognitionException {
        try {
            // InternalSpec.g:229:1: ( ruleRememberCommand EOF )
            // InternalSpec.g:230:1: ruleRememberCommand EOF
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
    // InternalSpec.g:237:1: ruleRememberCommand : ( ( rule__RememberCommand__Group__0 ) ) ;
    public final void ruleRememberCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:241:2: ( ( ( rule__RememberCommand__Group__0 ) ) )
            // InternalSpec.g:242:2: ( ( rule__RememberCommand__Group__0 ) )
            {
            // InternalSpec.g:242:2: ( ( rule__RememberCommand__Group__0 ) )
            // InternalSpec.g:243:3: ( rule__RememberCommand__Group__0 )
            {
             before(grammarAccess.getRememberCommandAccess().getGroup()); 
            // InternalSpec.g:244:3: ( rule__RememberCommand__Group__0 )
            // InternalSpec.g:244:4: rule__RememberCommand__Group__0
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
    // InternalSpec.g:253:1: entryRulePropertyCommand : rulePropertyCommand EOF ;
    public final void entryRulePropertyCommand() throws RecognitionException {
        try {
            // InternalSpec.g:254:1: ( rulePropertyCommand EOF )
            // InternalSpec.g:255:1: rulePropertyCommand EOF
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
    // InternalSpec.g:262:1: rulePropertyCommand : ( ( rule__PropertyCommand__Alternatives ) ) ;
    public final void rulePropertyCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:266:2: ( ( ( rule__PropertyCommand__Alternatives ) ) )
            // InternalSpec.g:267:2: ( ( rule__PropertyCommand__Alternatives ) )
            {
            // InternalSpec.g:267:2: ( ( rule__PropertyCommand__Alternatives ) )
            // InternalSpec.g:268:3: ( rule__PropertyCommand__Alternatives )
            {
             before(grammarAccess.getPropertyCommandAccess().getAlternatives()); 
            // InternalSpec.g:269:3: ( rule__PropertyCommand__Alternatives )
            // InternalSpec.g:269:4: rule__PropertyCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCommandAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleProperty"
    // InternalSpec.g:278:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalSpec.g:279:1: ( ruleProperty EOF )
            // InternalSpec.g:280:1: ruleProperty EOF
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
    // InternalSpec.g:287:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:291:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalSpec.g:292:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalSpec.g:292:2: ( ( rule__Property__Alternatives ) )
            // InternalSpec.g:293:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalSpec.g:294:3: ( rule__Property__Alternatives )
            // InternalSpec.g:294:4: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleCondition"
    // InternalSpec.g:303:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalSpec.g:304:1: ( ruleCondition EOF )
            // InternalSpec.g:305:1: ruleCondition EOF
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
    // InternalSpec.g:312:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:316:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalSpec.g:317:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalSpec.g:317:2: ( ( rule__Condition__Alternatives ) )
            // InternalSpec.g:318:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalSpec.g:319:3: ( rule__Condition__Alternatives )
            // InternalSpec.g:319:4: rule__Condition__Alternatives
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


    // $ANTLR start "entryRuleTypeCommand"
    // InternalSpec.g:328:1: entryRuleTypeCommand : ruleTypeCommand EOF ;
    public final void entryRuleTypeCommand() throws RecognitionException {
        try {
            // InternalSpec.g:329:1: ( ruleTypeCommand EOF )
            // InternalSpec.g:330:1: ruleTypeCommand EOF
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
    // InternalSpec.g:337:1: ruleTypeCommand : ( ( rule__TypeCommand__Alternatives ) ) ;
    public final void ruleTypeCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:341:2: ( ( ( rule__TypeCommand__Alternatives ) ) )
            // InternalSpec.g:342:2: ( ( rule__TypeCommand__Alternatives ) )
            {
            // InternalSpec.g:342:2: ( ( rule__TypeCommand__Alternatives ) )
            // InternalSpec.g:343:3: ( rule__TypeCommand__Alternatives )
            {
             before(grammarAccess.getTypeCommandAccess().getAlternatives()); 
            // InternalSpec.g:344:3: ( rule__TypeCommand__Alternatives )
            // InternalSpec.g:344:4: rule__TypeCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeCommandAccess().getAlternatives()); 

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
    // InternalSpec.g:353:1: entryRuleSleepCommand : ruleSleepCommand EOF ;
    public final void entryRuleSleepCommand() throws RecognitionException {
        try {
            // InternalSpec.g:354:1: ( ruleSleepCommand EOF )
            // InternalSpec.g:355:1: ruleSleepCommand EOF
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
    // InternalSpec.g:362:1: ruleSleepCommand : ( ( rule__SleepCommand__Group__0 ) ) ;
    public final void ruleSleepCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:366:2: ( ( ( rule__SleepCommand__Group__0 ) ) )
            // InternalSpec.g:367:2: ( ( rule__SleepCommand__Group__0 ) )
            {
            // InternalSpec.g:367:2: ( ( rule__SleepCommand__Group__0 ) )
            // InternalSpec.g:368:3: ( rule__SleepCommand__Group__0 )
            {
             before(grammarAccess.getSleepCommandAccess().getGroup()); 
            // InternalSpec.g:369:3: ( rule__SleepCommand__Group__0 )
            // InternalSpec.g:369:4: rule__SleepCommand__Group__0
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


    // $ANTLR start "entryRulePoint"
    // InternalSpec.g:378:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalSpec.g:379:1: ( rulePoint EOF )
            // InternalSpec.g:380:1: rulePoint EOF
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
    // InternalSpec.g:387:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:391:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalSpec.g:392:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalSpec.g:392:2: ( ( rule__Point__Group__0 ) )
            // InternalSpec.g:393:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalSpec.g:394:3: ( rule__Point__Group__0 )
            // InternalSpec.g:394:4: rule__Point__Group__0
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
    // InternalSpec.g:403:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalSpec.g:404:1: ( ruleVariable EOF )
            // InternalSpec.g:405:1: ruleVariable EOF
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
    // InternalSpec.g:412:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:416:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalSpec.g:417:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalSpec.g:417:2: ( ( rule__Variable__Group__0 ) )
            // InternalSpec.g:418:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalSpec.g:419:3: ( rule__Variable__Group__0 )
            // InternalSpec.g:419:4: rule__Variable__Group__0
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
    // InternalSpec.g:428:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:432:1: ( ( ( rule__ElementType__Alternatives ) ) )
            // InternalSpec.g:433:2: ( ( rule__ElementType__Alternatives ) )
            {
            // InternalSpec.g:433:2: ( ( rule__ElementType__Alternatives ) )
            // InternalSpec.g:434:3: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // InternalSpec.g:435:3: ( rule__ElementType__Alternatives )
            // InternalSpec.g:435:4: rule__ElementType__Alternatives
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
    // InternalSpec.g:443:1: rule__Command__Alternatives : ( ( ruleOpenCommand ) | ( ruleClickCommand ) | ( ruleStoreCommand ) | ( ruleSelectCommand ) | ( ruleRememberCommand ) | ( rulePropertyCommand ) | ( ruleTypeCommand ) | ( ruleSleepCommand ) | ( ( rule__Command__CommentAssignment_8 ) ) | ( ( rule__Command__CustomAssignment_9 ) ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:447:1: ( ( ruleOpenCommand ) | ( ruleClickCommand ) | ( ruleStoreCommand ) | ( ruleSelectCommand ) | ( ruleRememberCommand ) | ( rulePropertyCommand ) | ( ruleTypeCommand ) | ( ruleSleepCommand ) | ( ( rule__Command__CommentAssignment_8 ) ) | ( ( rule__Command__CustomAssignment_9 ) ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 29:
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
            case 31:
                {
                alt2=5;
                }
                break;
            case 32:
                {
                alt2=6;
                }
                break;
            case 36:
                {
                alt2=7;
                }
                break;
            case 37:
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
                    // InternalSpec.g:448:2: ( ruleOpenCommand )
                    {
                    // InternalSpec.g:448:2: ( ruleOpenCommand )
                    // InternalSpec.g:449:3: ruleOpenCommand
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
                    // InternalSpec.g:454:2: ( ruleClickCommand )
                    {
                    // InternalSpec.g:454:2: ( ruleClickCommand )
                    // InternalSpec.g:455:3: ruleClickCommand
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
                    // InternalSpec.g:460:2: ( ruleStoreCommand )
                    {
                    // InternalSpec.g:460:2: ( ruleStoreCommand )
                    // InternalSpec.g:461:3: ruleStoreCommand
                    {
                     before(grammarAccess.getCommandAccess().getStoreCommandParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStoreCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getStoreCommandParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:466:2: ( ruleSelectCommand )
                    {
                    // InternalSpec.g:466:2: ( ruleSelectCommand )
                    // InternalSpec.g:467:3: ruleSelectCommand
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
                    // InternalSpec.g:472:2: ( ruleRememberCommand )
                    {
                    // InternalSpec.g:472:2: ( ruleRememberCommand )
                    // InternalSpec.g:473:3: ruleRememberCommand
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
                    // InternalSpec.g:478:2: ( rulePropertyCommand )
                    {
                    // InternalSpec.g:478:2: ( rulePropertyCommand )
                    // InternalSpec.g:479:3: rulePropertyCommand
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
                    // InternalSpec.g:484:2: ( ruleTypeCommand )
                    {
                    // InternalSpec.g:484:2: ( ruleTypeCommand )
                    // InternalSpec.g:485:3: ruleTypeCommand
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
                    // InternalSpec.g:490:2: ( ruleSleepCommand )
                    {
                    // InternalSpec.g:490:2: ( ruleSleepCommand )
                    // InternalSpec.g:491:3: ruleSleepCommand
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
                    // InternalSpec.g:496:2: ( ( rule__Command__CommentAssignment_8 ) )
                    {
                    // InternalSpec.g:496:2: ( ( rule__Command__CommentAssignment_8 ) )
                    // InternalSpec.g:497:3: ( rule__Command__CommentAssignment_8 )
                    {
                     before(grammarAccess.getCommandAccess().getCommentAssignment_8()); 
                    // InternalSpec.g:498:3: ( rule__Command__CommentAssignment_8 )
                    // InternalSpec.g:498:4: rule__Command__CommentAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__CommentAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommandAccess().getCommentAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSpec.g:502:2: ( ( rule__Command__CustomAssignment_9 ) )
                    {
                    // InternalSpec.g:502:2: ( ( rule__Command__CustomAssignment_9 ) )
                    // InternalSpec.g:503:3: ( rule__Command__CustomAssignment_9 )
                    {
                     before(grammarAccess.getCommandAccess().getCustomAssignment_9()); 
                    // InternalSpec.g:504:3: ( rule__Command__CustomAssignment_9 )
                    // InternalSpec.g:504:4: rule__Command__CustomAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__CustomAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommandAccess().getCustomAssignment_9()); 

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


    // $ANTLR start "rule__OpenCommand__Alternatives"
    // InternalSpec.g:512:1: rule__OpenCommand__Alternatives : ( ( ( rule__OpenCommand__Group_0__0 ) ) | ( ( rule__OpenCommand__Group_1__0 ) ) );
    public final void rule__OpenCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:516:1: ( ( ( rule__OpenCommand__Group_0__0 ) ) | ( ( rule__OpenCommand__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==42) ) {
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
                    // InternalSpec.g:517:2: ( ( rule__OpenCommand__Group_0__0 ) )
                    {
                    // InternalSpec.g:517:2: ( ( rule__OpenCommand__Group_0__0 ) )
                    // InternalSpec.g:518:3: ( rule__OpenCommand__Group_0__0 )
                    {
                     before(grammarAccess.getOpenCommandAccess().getGroup_0()); 
                    // InternalSpec.g:519:3: ( rule__OpenCommand__Group_0__0 )
                    // InternalSpec.g:519:4: rule__OpenCommand__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpenCommand__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpenCommandAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:523:2: ( ( rule__OpenCommand__Group_1__0 ) )
                    {
                    // InternalSpec.g:523:2: ( ( rule__OpenCommand__Group_1__0 ) )
                    // InternalSpec.g:524:3: ( rule__OpenCommand__Group_1__0 )
                    {
                     before(grammarAccess.getOpenCommandAccess().getGroup_1()); 
                    // InternalSpec.g:525:3: ( rule__OpenCommand__Group_1__0 )
                    // InternalSpec.g:525:4: rule__OpenCommand__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpenCommand__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpenCommandAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OpenCommand__Alternatives"


    // $ANTLR start "rule__ClickCommand__Alternatives"
    // InternalSpec.g:533:1: rule__ClickCommand__Alternatives : ( ( ( rule__ClickCommand__CmdAssignment_0 ) ) | ( ( rule__ClickCommand__Group_1__0 ) ) | ( ( rule__ClickCommand__Group_2__0 ) ) );
    public final void rule__ClickCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:537:1: ( ( ( rule__ClickCommand__CmdAssignment_0 ) ) | ( ( rule__ClickCommand__Group_1__0 ) ) | ( ( rule__ClickCommand__Group_2__0 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt4=3;
                    }
                    break;
                case EOF:
                case RULE_SL_COMMENT:
                case RULE_CUSTOM_COMMAND:
                case 22:
                case 23:
                case 26:
                case 27:
                case 29:
                case 31:
                case 32:
                case 36:
                case 37:
                    {
                    alt4=1;
                    }
                    break;
                case 24:
                    {
                    alt4=2;
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
                    // InternalSpec.g:538:2: ( ( rule__ClickCommand__CmdAssignment_0 ) )
                    {
                    // InternalSpec.g:538:2: ( ( rule__ClickCommand__CmdAssignment_0 ) )
                    // InternalSpec.g:539:3: ( rule__ClickCommand__CmdAssignment_0 )
                    {
                     before(grammarAccess.getClickCommandAccess().getCmdAssignment_0()); 
                    // InternalSpec.g:540:3: ( rule__ClickCommand__CmdAssignment_0 )
                    // InternalSpec.g:540:4: rule__ClickCommand__CmdAssignment_0
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
                    // InternalSpec.g:544:2: ( ( rule__ClickCommand__Group_1__0 ) )
                    {
                    // InternalSpec.g:544:2: ( ( rule__ClickCommand__Group_1__0 ) )
                    // InternalSpec.g:545:3: ( rule__ClickCommand__Group_1__0 )
                    {
                     before(grammarAccess.getClickCommandAccess().getGroup_1()); 
                    // InternalSpec.g:546:3: ( rule__ClickCommand__Group_1__0 )
                    // InternalSpec.g:546:4: rule__ClickCommand__Group_1__0
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
                    // InternalSpec.g:550:2: ( ( rule__ClickCommand__Group_2__0 ) )
                    {
                    // InternalSpec.g:550:2: ( ( rule__ClickCommand__Group_2__0 ) )
                    // InternalSpec.g:551:3: ( rule__ClickCommand__Group_2__0 )
                    {
                     before(grammarAccess.getClickCommandAccess().getGroup_2()); 
                    // InternalSpec.g:552:3: ( rule__ClickCommand__Group_2__0 )
                    // InternalSpec.g:552:4: rule__ClickCommand__Group_2__0
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
    // InternalSpec.g:560:1: rule__SelectCommand__Alternatives : ( ( ( rule__SelectCommand__Group_0__0 ) ) | ( ( rule__SelectCommand__Group_1__0 ) ) | ( ( rule__SelectCommand__Group_2__0 ) ) );
    public final void rule__SelectCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:564:1: ( ( ( rule__SelectCommand__Group_0__0 ) ) | ( ( rule__SelectCommand__Group_1__0 ) ) | ( ( rule__SelectCommand__Group_2__0 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_STRING||LA5_2==RULE_ID||(LA5_2>=17 && LA5_2<=21)) ) {
                    alt5=2;
                }
                else if ( (LA5_2==28) ) {
                    alt5=3;
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
                    // InternalSpec.g:565:2: ( ( rule__SelectCommand__Group_0__0 ) )
                    {
                    // InternalSpec.g:565:2: ( ( rule__SelectCommand__Group_0__0 ) )
                    // InternalSpec.g:566:3: ( rule__SelectCommand__Group_0__0 )
                    {
                     before(grammarAccess.getSelectCommandAccess().getGroup_0()); 
                    // InternalSpec.g:567:3: ( rule__SelectCommand__Group_0__0 )
                    // InternalSpec.g:567:4: rule__SelectCommand__Group_0__0
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
                    // InternalSpec.g:571:2: ( ( rule__SelectCommand__Group_1__0 ) )
                    {
                    // InternalSpec.g:571:2: ( ( rule__SelectCommand__Group_1__0 ) )
                    // InternalSpec.g:572:3: ( rule__SelectCommand__Group_1__0 )
                    {
                     before(grammarAccess.getSelectCommandAccess().getGroup_1()); 
                    // InternalSpec.g:573:3: ( rule__SelectCommand__Group_1__0 )
                    // InternalSpec.g:573:4: rule__SelectCommand__Group_1__0
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
                    // InternalSpec.g:577:2: ( ( rule__SelectCommand__Group_2__0 ) )
                    {
                    // InternalSpec.g:577:2: ( ( rule__SelectCommand__Group_2__0 ) )
                    // InternalSpec.g:578:3: ( rule__SelectCommand__Group_2__0 )
                    {
                     before(grammarAccess.getSelectCommandAccess().getGroup_2()); 
                    // InternalSpec.g:579:3: ( rule__SelectCommand__Group_2__0 )
                    // InternalSpec.g:579:4: rule__SelectCommand__Group_2__0
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


    // $ANTLR start "rule__Selector__Alternatives"
    // InternalSpec.g:587:1: rule__Selector__Alternatives : ( ( ( rule__Selector__VarAssignment_0 ) ) | ( ( rule__Selector__StrAssignment_1 ) ) | ( ( rule__Selector__Group_2__0 ) ) | ( ( rule__Selector__Group_3__0 ) ) );
    public final void rule__Selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:591:1: ( ( ( rule__Selector__VarAssignment_0 ) ) | ( ( rule__Selector__StrAssignment_1 ) ) | ( ( rule__Selector__Group_2__0 ) ) | ( ( rule__Selector__Group_3__0 ) ) )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalSpec.g:592:2: ( ( rule__Selector__VarAssignment_0 ) )
                    {
                    // InternalSpec.g:592:2: ( ( rule__Selector__VarAssignment_0 ) )
                    // InternalSpec.g:593:3: ( rule__Selector__VarAssignment_0 )
                    {
                     before(grammarAccess.getSelectorAccess().getVarAssignment_0()); 
                    // InternalSpec.g:594:3: ( rule__Selector__VarAssignment_0 )
                    // InternalSpec.g:594:4: rule__Selector__VarAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__VarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getVarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:598:2: ( ( rule__Selector__StrAssignment_1 ) )
                    {
                    // InternalSpec.g:598:2: ( ( rule__Selector__StrAssignment_1 ) )
                    // InternalSpec.g:599:3: ( rule__Selector__StrAssignment_1 )
                    {
                     before(grammarAccess.getSelectorAccess().getStrAssignment_1()); 
                    // InternalSpec.g:600:3: ( rule__Selector__StrAssignment_1 )
                    // InternalSpec.g:600:4: rule__Selector__StrAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__StrAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getStrAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:604:2: ( ( rule__Selector__Group_2__0 ) )
                    {
                    // InternalSpec.g:604:2: ( ( rule__Selector__Group_2__0 ) )
                    // InternalSpec.g:605:3: ( rule__Selector__Group_2__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_2()); 
                    // InternalSpec.g:606:3: ( rule__Selector__Group_2__0 )
                    // InternalSpec.g:606:4: rule__Selector__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:610:2: ( ( rule__Selector__Group_3__0 ) )
                    {
                    // InternalSpec.g:610:2: ( ( rule__Selector__Group_3__0 ) )
                    // InternalSpec.g:611:3: ( rule__Selector__Group_3__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_3()); 
                    // InternalSpec.g:612:3: ( rule__Selector__Group_3__0 )
                    // InternalSpec.g:612:4: rule__Selector__Group_3__0
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


    // $ANTLR start "rule__PropertyCommand__Alternatives"
    // InternalSpec.g:620:1: rule__PropertyCommand__Alternatives : ( ( ( rule__PropertyCommand__Group_0__0 ) ) | ( ( rule__PropertyCommand__Group_1__0 ) ) );
    public final void rule__PropertyCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:624:1: ( ( ( rule__PropertyCommand__Group_0__0 ) ) | ( ( rule__PropertyCommand__Group_1__0 ) ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalSpec.g:625:2: ( ( rule__PropertyCommand__Group_0__0 ) )
                    {
                    // InternalSpec.g:625:2: ( ( rule__PropertyCommand__Group_0__0 ) )
                    // InternalSpec.g:626:3: ( rule__PropertyCommand__Group_0__0 )
                    {
                     before(grammarAccess.getPropertyCommandAccess().getGroup_0()); 
                    // InternalSpec.g:627:3: ( rule__PropertyCommand__Group_0__0 )
                    // InternalSpec.g:627:4: rule__PropertyCommand__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyCommand__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyCommandAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:631:2: ( ( rule__PropertyCommand__Group_1__0 ) )
                    {
                    // InternalSpec.g:631:2: ( ( rule__PropertyCommand__Group_1__0 ) )
                    // InternalSpec.g:632:3: ( rule__PropertyCommand__Group_1__0 )
                    {
                     before(grammarAccess.getPropertyCommandAccess().getGroup_1()); 
                    // InternalSpec.g:633:3: ( rule__PropertyCommand__Group_1__0 )
                    // InternalSpec.g:633:4: rule__PropertyCommand__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyCommand__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyCommandAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PropertyCommand__Alternatives"


    // $ANTLR start "rule__Property__Alternatives"
    // InternalSpec.g:641:1: rule__Property__Alternatives : ( ( 'text' ) | ( 'class' ) | ( 'value' ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:645:1: ( ( 'text' ) | ( 'class' ) | ( 'value' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 13:
                {
                alt8=2;
                }
                break;
            case 14:
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
                    // InternalSpec.g:646:2: ( 'text' )
                    {
                    // InternalSpec.g:646:2: ( 'text' )
                    // InternalSpec.g:647:3: 'text'
                    {
                     before(grammarAccess.getPropertyAccess().getTextKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPropertyAccess().getTextKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:652:2: ( 'class' )
                    {
                    // InternalSpec.g:652:2: ( 'class' )
                    // InternalSpec.g:653:3: 'class'
                    {
                     before(grammarAccess.getPropertyAccess().getClassKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPropertyAccess().getClassKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:658:2: ( 'value' )
                    {
                    // InternalSpec.g:658:2: ( 'value' )
                    // InternalSpec.g:659:3: 'value'
                    {
                     before(grammarAccess.getPropertyAccess().getValueKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPropertyAccess().getValueKeyword_2()); 

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
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalSpec.g:668:1: rule__Condition__Alternatives : ( ( ( rule__Condition__Group_0__0 ) ) | ( ( rule__Condition__Group_1__0 ) ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:672:1: ( ( ( rule__Condition__Group_0__0 ) ) | ( ( rule__Condition__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==34) ) {
                    alt9=1;
                }
                else if ( (LA9_1==35) ) {
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
                    // InternalSpec.g:673:2: ( ( rule__Condition__Group_0__0 ) )
                    {
                    // InternalSpec.g:673:2: ( ( rule__Condition__Group_0__0 ) )
                    // InternalSpec.g:674:3: ( rule__Condition__Group_0__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0()); 
                    // InternalSpec.g:675:3: ( rule__Condition__Group_0__0 )
                    // InternalSpec.g:675:4: rule__Condition__Group_0__0
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
                    // InternalSpec.g:679:2: ( ( rule__Condition__Group_1__0 ) )
                    {
                    // InternalSpec.g:679:2: ( ( rule__Condition__Group_1__0 ) )
                    // InternalSpec.g:680:3: ( rule__Condition__Group_1__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_1()); 
                    // InternalSpec.g:681:3: ( rule__Condition__Group_1__0 )
                    // InternalSpec.g:681:4: rule__Condition__Group_1__0
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


    // $ANTLR start "rule__TypeCommand__Alternatives"
    // InternalSpec.g:689:1: rule__TypeCommand__Alternatives : ( ( ( rule__TypeCommand__Group_0__0 ) ) | ( ( rule__TypeCommand__Group_1__0 ) ) );
    public final void rule__TypeCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:693:1: ( ( ( rule__TypeCommand__Group_0__0 ) ) | ( ( rule__TypeCommand__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
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
                    // InternalSpec.g:694:2: ( ( rule__TypeCommand__Group_0__0 ) )
                    {
                    // InternalSpec.g:694:2: ( ( rule__TypeCommand__Group_0__0 ) )
                    // InternalSpec.g:695:3: ( rule__TypeCommand__Group_0__0 )
                    {
                     before(grammarAccess.getTypeCommandAccess().getGroup_0()); 
                    // InternalSpec.g:696:3: ( rule__TypeCommand__Group_0__0 )
                    // InternalSpec.g:696:4: rule__TypeCommand__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeCommand__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeCommandAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:700:2: ( ( rule__TypeCommand__Group_1__0 ) )
                    {
                    // InternalSpec.g:700:2: ( ( rule__TypeCommand__Group_1__0 ) )
                    // InternalSpec.g:701:3: ( rule__TypeCommand__Group_1__0 )
                    {
                     before(grammarAccess.getTypeCommandAccess().getGroup_1()); 
                    // InternalSpec.g:702:3: ( rule__TypeCommand__Group_1__0 )
                    // InternalSpec.g:702:4: rule__TypeCommand__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeCommand__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeCommandAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TypeCommand__Alternatives"


    // $ANTLR start "rule__SleepCommand__Alternatives_3"
    // InternalSpec.g:710:1: rule__SleepCommand__Alternatives_3 : ( ( 'second' ) | ( 'seconds' ) );
    public final void rule__SleepCommand__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:714:1: ( ( 'second' ) | ( 'seconds' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==16) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpec.g:715:2: ( 'second' )
                    {
                    // InternalSpec.g:715:2: ( 'second' )
                    // InternalSpec.g:716:3: 'second'
                    {
                     before(grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:721:2: ( 'seconds' )
                    {
                    // InternalSpec.g:721:2: ( 'seconds' )
                    // InternalSpec.g:722:3: 'seconds'
                    {
                     before(grammarAccess.getSleepCommandAccess().getSecondsKeyword_3_1()); 
                    match(input,16,FOLLOW_2); 
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


    // $ANTLR start "rule__ElementType__Alternatives"
    // InternalSpec.g:731:1: rule__ElementType__Alternatives : ( ( ( 'button' ) ) | ( ( 'element' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) | ( ( 'textarea' ) ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:735:1: ( ( ( 'button' ) ) | ( ( 'element' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) | ( ( 'textarea' ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt12=1;
                }
                break;
            case 18:
                {
                alt12=2;
                }
                break;
            case 19:
                {
                alt12=3;
                }
                break;
            case 20:
                {
                alt12=4;
                }
                break;
            case 21:
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
                    // InternalSpec.g:736:2: ( ( 'button' ) )
                    {
                    // InternalSpec.g:736:2: ( ( 'button' ) )
                    // InternalSpec.g:737:3: ( 'button' )
                    {
                     before(grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0()); 
                    // InternalSpec.g:738:3: ( 'button' )
                    // InternalSpec.g:738:4: 'button'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:742:2: ( ( 'element' ) )
                    {
                    // InternalSpec.g:742:2: ( ( 'element' ) )
                    // InternalSpec.g:743:3: ( 'element' )
                    {
                     before(grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:744:3: ( 'element' )
                    // InternalSpec.g:744:4: 'element'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:748:2: ( ( 'link' ) )
                    {
                    // InternalSpec.g:748:2: ( ( 'link' ) )
                    // InternalSpec.g:749:3: ( 'link' )
                    {
                     before(grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2()); 
                    // InternalSpec.g:750:3: ( 'link' )
                    // InternalSpec.g:750:4: 'link'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:754:2: ( ( 'input' ) )
                    {
                    // InternalSpec.g:754:2: ( ( 'input' ) )
                    // InternalSpec.g:755:3: ( 'input' )
                    {
                     before(grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3()); 
                    // InternalSpec.g:756:3: ( 'input' )
                    // InternalSpec.g:756:4: 'input'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:760:2: ( ( 'textarea' ) )
                    {
                    // InternalSpec.g:760:2: ( ( 'textarea' ) )
                    // InternalSpec.g:761:3: ( 'textarea' )
                    {
                     before(grammarAccess.getElementTypeAccess().getTextareaEnumLiteralDeclaration_4()); 
                    // InternalSpec.g:762:3: ( 'textarea' )
                    // InternalSpec.g:762:4: 'textarea'
                    {
                    match(input,21,FOLLOW_2); 

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


    // $ANTLR start "rule__OpenCommand__Group_0__0"
    // InternalSpec.g:770:1: rule__OpenCommand__Group_0__0 : rule__OpenCommand__Group_0__0__Impl rule__OpenCommand__Group_0__1 ;
    public final void rule__OpenCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:774:1: ( rule__OpenCommand__Group_0__0__Impl rule__OpenCommand__Group_0__1 )
            // InternalSpec.g:775:2: rule__OpenCommand__Group_0__0__Impl rule__OpenCommand__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__OpenCommand__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpenCommand__Group_0__1();

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
    // $ANTLR end "rule__OpenCommand__Group_0__0"


    // $ANTLR start "rule__OpenCommand__Group_0__0__Impl"
    // InternalSpec.g:782:1: rule__OpenCommand__Group_0__0__Impl : ( () ) ;
    public final void rule__OpenCommand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:786:1: ( ( () ) )
            // InternalSpec.g:787:1: ( () )
            {
            // InternalSpec.g:787:1: ( () )
            // InternalSpec.g:788:2: ()
            {
             before(grammarAccess.getOpenCommandAccess().getOpenCommandAction_0_0()); 
            // InternalSpec.g:789:2: ()
            // InternalSpec.g:789:3: 
            {
            }

             after(grammarAccess.getOpenCommandAccess().getOpenCommandAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenCommand__Group_0__0__Impl"


    // $ANTLR start "rule__OpenCommand__Group_0__1"
    // InternalSpec.g:797:1: rule__OpenCommand__Group_0__1 : rule__OpenCommand__Group_0__1__Impl rule__OpenCommand__Group_0__2 ;
    public final void rule__OpenCommand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:801:1: ( rule__OpenCommand__Group_0__1__Impl rule__OpenCommand__Group_0__2 )
            // InternalSpec.g:802:2: rule__OpenCommand__Group_0__1__Impl rule__OpenCommand__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__OpenCommand__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpenCommand__Group_0__2();

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
    // $ANTLR end "rule__OpenCommand__Group_0__1"


    // $ANTLR start "rule__OpenCommand__Group_0__1__Impl"
    // InternalSpec.g:809:1: rule__OpenCommand__Group_0__1__Impl : ( 'Open' ) ;
    public final void rule__OpenCommand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:813:1: ( ( 'Open' ) )
            // InternalSpec.g:814:1: ( 'Open' )
            {
            // InternalSpec.g:814:1: ( 'Open' )
            // InternalSpec.g:815:2: 'Open'
            {
             before(grammarAccess.getOpenCommandAccess().getOpenKeyword_0_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOpenCommandAccess().getOpenKeyword_0_1()); 

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
    // $ANTLR end "rule__OpenCommand__Group_0__1__Impl"


    // $ANTLR start "rule__OpenCommand__Group_0__2"
    // InternalSpec.g:824:1: rule__OpenCommand__Group_0__2 : rule__OpenCommand__Group_0__2__Impl ;
    public final void rule__OpenCommand__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:828:1: ( rule__OpenCommand__Group_0__2__Impl )
            // InternalSpec.g:829:2: rule__OpenCommand__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpenCommand__Group_0__2__Impl();

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
    // $ANTLR end "rule__OpenCommand__Group_0__2"


    // $ANTLR start "rule__OpenCommand__Group_0__2__Impl"
    // InternalSpec.g:835:1: rule__OpenCommand__Group_0__2__Impl : ( RULE_STRING ) ;
    public final void rule__OpenCommand__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:839:1: ( ( RULE_STRING ) )
            // InternalSpec.g:840:1: ( RULE_STRING )
            {
            // InternalSpec.g:840:1: ( RULE_STRING )
            // InternalSpec.g:841:2: RULE_STRING
            {
             before(grammarAccess.getOpenCommandAccess().getSTRINGTerminalRuleCall_0_2()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOpenCommandAccess().getSTRINGTerminalRuleCall_0_2()); 

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
    // $ANTLR end "rule__OpenCommand__Group_0__2__Impl"


    // $ANTLR start "rule__OpenCommand__Group_1__0"
    // InternalSpec.g:851:1: rule__OpenCommand__Group_1__0 : rule__OpenCommand__Group_1__0__Impl rule__OpenCommand__Group_1__1 ;
    public final void rule__OpenCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:855:1: ( rule__OpenCommand__Group_1__0__Impl rule__OpenCommand__Group_1__1 )
            // InternalSpec.g:856:2: rule__OpenCommand__Group_1__0__Impl rule__OpenCommand__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__OpenCommand__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpenCommand__Group_1__1();

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
    // $ANTLR end "rule__OpenCommand__Group_1__0"


    // $ANTLR start "rule__OpenCommand__Group_1__0__Impl"
    // InternalSpec.g:863:1: rule__OpenCommand__Group_1__0__Impl : ( 'Open' ) ;
    public final void rule__OpenCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:867:1: ( ( 'Open' ) )
            // InternalSpec.g:868:1: ( 'Open' )
            {
            // InternalSpec.g:868:1: ( 'Open' )
            // InternalSpec.g:869:2: 'Open'
            {
             before(grammarAccess.getOpenCommandAccess().getOpenKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOpenCommandAccess().getOpenKeyword_1_0()); 

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
    // $ANTLR end "rule__OpenCommand__Group_1__0__Impl"


    // $ANTLR start "rule__OpenCommand__Group_1__1"
    // InternalSpec.g:878:1: rule__OpenCommand__Group_1__1 : rule__OpenCommand__Group_1__1__Impl ;
    public final void rule__OpenCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:882:1: ( rule__OpenCommand__Group_1__1__Impl )
            // InternalSpec.g:883:2: rule__OpenCommand__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpenCommand__Group_1__1__Impl();

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
    // $ANTLR end "rule__OpenCommand__Group_1__1"


    // $ANTLR start "rule__OpenCommand__Group_1__1__Impl"
    // InternalSpec.g:889:1: rule__OpenCommand__Group_1__1__Impl : ( ( rule__OpenCommand__VarAssignment_1_1 ) ) ;
    public final void rule__OpenCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:893:1: ( ( ( rule__OpenCommand__VarAssignment_1_1 ) ) )
            // InternalSpec.g:894:1: ( ( rule__OpenCommand__VarAssignment_1_1 ) )
            {
            // InternalSpec.g:894:1: ( ( rule__OpenCommand__VarAssignment_1_1 ) )
            // InternalSpec.g:895:2: ( rule__OpenCommand__VarAssignment_1_1 )
            {
             before(grammarAccess.getOpenCommandAccess().getVarAssignment_1_1()); 
            // InternalSpec.g:896:2: ( rule__OpenCommand__VarAssignment_1_1 )
            // InternalSpec.g:896:3: rule__OpenCommand__VarAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OpenCommand__VarAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOpenCommandAccess().getVarAssignment_1_1()); 

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
    // $ANTLR end "rule__OpenCommand__Group_1__1__Impl"


    // $ANTLR start "rule__ClickCommand__Group_1__0"
    // InternalSpec.g:905:1: rule__ClickCommand__Group_1__0 : rule__ClickCommand__Group_1__0__Impl rule__ClickCommand__Group_1__1 ;
    public final void rule__ClickCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:909:1: ( rule__ClickCommand__Group_1__0__Impl rule__ClickCommand__Group_1__1 )
            // InternalSpec.g:910:2: rule__ClickCommand__Group_1__0__Impl rule__ClickCommand__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSpec.g:917:1: rule__ClickCommand__Group_1__0__Impl : ( 'Click' ) ;
    public final void rule__ClickCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:921:1: ( ( 'Click' ) )
            // InternalSpec.g:922:1: ( 'Click' )
            {
            // InternalSpec.g:922:1: ( 'Click' )
            // InternalSpec.g:923:2: 'Click'
            {
             before(grammarAccess.getClickCommandAccess().getClickKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSpec.g:932:1: rule__ClickCommand__Group_1__1 : rule__ClickCommand__Group_1__1__Impl rule__ClickCommand__Group_1__2 ;
    public final void rule__ClickCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:936:1: ( rule__ClickCommand__Group_1__1__Impl rule__ClickCommand__Group_1__2 )
            // InternalSpec.g:937:2: rule__ClickCommand__Group_1__1__Impl rule__ClickCommand__Group_1__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSpec.g:944:1: rule__ClickCommand__Group_1__1__Impl : ( 'on' ) ;
    public final void rule__ClickCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:948:1: ( ( 'on' ) )
            // InternalSpec.g:949:1: ( 'on' )
            {
            // InternalSpec.g:949:1: ( 'on' )
            // InternalSpec.g:950:2: 'on'
            {
             before(grammarAccess.getClickCommandAccess().getOnKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSpec.g:959:1: rule__ClickCommand__Group_1__2 : rule__ClickCommand__Group_1__2__Impl ;
    public final void rule__ClickCommand__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:963:1: ( rule__ClickCommand__Group_1__2__Impl )
            // InternalSpec.g:964:2: rule__ClickCommand__Group_1__2__Impl
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
    // InternalSpec.g:970:1: rule__ClickCommand__Group_1__2__Impl : ( ( rule__ClickCommand__SelectorAssignment_1_2 ) ) ;
    public final void rule__ClickCommand__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:974:1: ( ( ( rule__ClickCommand__SelectorAssignment_1_2 ) ) )
            // InternalSpec.g:975:1: ( ( rule__ClickCommand__SelectorAssignment_1_2 ) )
            {
            // InternalSpec.g:975:1: ( ( rule__ClickCommand__SelectorAssignment_1_2 ) )
            // InternalSpec.g:976:2: ( rule__ClickCommand__SelectorAssignment_1_2 )
            {
             before(grammarAccess.getClickCommandAccess().getSelectorAssignment_1_2()); 
            // InternalSpec.g:977:2: ( rule__ClickCommand__SelectorAssignment_1_2 )
            // InternalSpec.g:977:3: rule__ClickCommand__SelectorAssignment_1_2
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
    // InternalSpec.g:986:1: rule__ClickCommand__Group_2__0 : rule__ClickCommand__Group_2__0__Impl rule__ClickCommand__Group_2__1 ;
    public final void rule__ClickCommand__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:990:1: ( rule__ClickCommand__Group_2__0__Impl rule__ClickCommand__Group_2__1 )
            // InternalSpec.g:991:2: rule__ClickCommand__Group_2__0__Impl rule__ClickCommand__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSpec.g:998:1: rule__ClickCommand__Group_2__0__Impl : ( 'Click' ) ;
    public final void rule__ClickCommand__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1002:1: ( ( 'Click' ) )
            // InternalSpec.g:1003:1: ( 'Click' )
            {
            // InternalSpec.g:1003:1: ( 'Click' )
            // InternalSpec.g:1004:2: 'Click'
            {
             before(grammarAccess.getClickCommandAccess().getClickKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSpec.g:1013:1: rule__ClickCommand__Group_2__1 : rule__ClickCommand__Group_2__1__Impl rule__ClickCommand__Group_2__2 ;
    public final void rule__ClickCommand__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1017:1: ( rule__ClickCommand__Group_2__1__Impl rule__ClickCommand__Group_2__2 )
            // InternalSpec.g:1018:2: rule__ClickCommand__Group_2__1__Impl rule__ClickCommand__Group_2__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSpec.g:1025:1: rule__ClickCommand__Group_2__1__Impl : ( 'at' ) ;
    public final void rule__ClickCommand__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1029:1: ( ( 'at' ) )
            // InternalSpec.g:1030:1: ( 'at' )
            {
            // InternalSpec.g:1030:1: ( 'at' )
            // InternalSpec.g:1031:2: 'at'
            {
             before(grammarAccess.getClickCommandAccess().getAtKeyword_2_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSpec.g:1040:1: rule__ClickCommand__Group_2__2 : rule__ClickCommand__Group_2__2__Impl ;
    public final void rule__ClickCommand__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1044:1: ( rule__ClickCommand__Group_2__2__Impl )
            // InternalSpec.g:1045:2: rule__ClickCommand__Group_2__2__Impl
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
    // InternalSpec.g:1051:1: rule__ClickCommand__Group_2__2__Impl : ( ( rule__ClickCommand__PointAssignment_2_2 ) ) ;
    public final void rule__ClickCommand__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1055:1: ( ( ( rule__ClickCommand__PointAssignment_2_2 ) ) )
            // InternalSpec.g:1056:1: ( ( rule__ClickCommand__PointAssignment_2_2 ) )
            {
            // InternalSpec.g:1056:1: ( ( rule__ClickCommand__PointAssignment_2_2 ) )
            // InternalSpec.g:1057:2: ( rule__ClickCommand__PointAssignment_2_2 )
            {
             before(grammarAccess.getClickCommandAccess().getPointAssignment_2_2()); 
            // InternalSpec.g:1058:2: ( rule__ClickCommand__PointAssignment_2_2 )
            // InternalSpec.g:1058:3: rule__ClickCommand__PointAssignment_2_2
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


    // $ANTLR start "rule__SelectCommand__Group_0__0"
    // InternalSpec.g:1067:1: rule__SelectCommand__Group_0__0 : rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1 ;
    public final void rule__SelectCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1071:1: ( rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1 )
            // InternalSpec.g:1072:2: rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1
            {
            pushFollow(FOLLOW_8);
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
            pushFollow(FOLLOW_8);
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
            pushFollow(FOLLOW_11);
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
            pushFollow(FOLLOW_8);
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


    // $ANTLR start "rule__Selector__Group_2__0"
    // InternalSpec.g:1256:1: rule__Selector__Group_2__0 : rule__Selector__Group_2__0__Impl rule__Selector__Group_2__1 ;
    public final void rule__Selector__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1260:1: ( rule__Selector__Group_2__0__Impl rule__Selector__Group_2__1 )
            // InternalSpec.g:1261:2: rule__Selector__Group_2__0__Impl rule__Selector__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Selector__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_2__1();

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
    // $ANTLR end "rule__Selector__Group_2__0"


    // $ANTLR start "rule__Selector__Group_2__0__Impl"
    // InternalSpec.g:1268:1: rule__Selector__Group_2__0__Impl : ( ( rule__Selector__TypeAssignment_2_0 ) ) ;
    public final void rule__Selector__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1272:1: ( ( ( rule__Selector__TypeAssignment_2_0 ) ) )
            // InternalSpec.g:1273:1: ( ( rule__Selector__TypeAssignment_2_0 ) )
            {
            // InternalSpec.g:1273:1: ( ( rule__Selector__TypeAssignment_2_0 ) )
            // InternalSpec.g:1274:2: ( rule__Selector__TypeAssignment_2_0 )
            {
             before(grammarAccess.getSelectorAccess().getTypeAssignment_2_0()); 
            // InternalSpec.g:1275:2: ( rule__Selector__TypeAssignment_2_0 )
            // InternalSpec.g:1275:3: rule__Selector__TypeAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__TypeAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getTypeAssignment_2_0()); 

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
    // $ANTLR end "rule__Selector__Group_2__0__Impl"


    // $ANTLR start "rule__Selector__Group_2__1"
    // InternalSpec.g:1283:1: rule__Selector__Group_2__1 : rule__Selector__Group_2__1__Impl ;
    public final void rule__Selector__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1287:1: ( rule__Selector__Group_2__1__Impl )
            // InternalSpec.g:1288:2: rule__Selector__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_2__1__Impl();

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
    // $ANTLR end "rule__Selector__Group_2__1"


    // $ANTLR start "rule__Selector__Group_2__1__Impl"
    // InternalSpec.g:1294:1: rule__Selector__Group_2__1__Impl : ( ( rule__Selector__VarAssignment_2_1 ) ) ;
    public final void rule__Selector__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1298:1: ( ( ( rule__Selector__VarAssignment_2_1 ) ) )
            // InternalSpec.g:1299:1: ( ( rule__Selector__VarAssignment_2_1 ) )
            {
            // InternalSpec.g:1299:1: ( ( rule__Selector__VarAssignment_2_1 ) )
            // InternalSpec.g:1300:2: ( rule__Selector__VarAssignment_2_1 )
            {
             before(grammarAccess.getSelectorAccess().getVarAssignment_2_1()); 
            // InternalSpec.g:1301:2: ( rule__Selector__VarAssignment_2_1 )
            // InternalSpec.g:1301:3: rule__Selector__VarAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__VarAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getVarAssignment_2_1()); 

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
    // $ANTLR end "rule__Selector__Group_2__1__Impl"


    // $ANTLR start "rule__Selector__Group_3__0"
    // InternalSpec.g:1310:1: rule__Selector__Group_3__0 : rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1 ;
    public final void rule__Selector__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1314:1: ( rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1 )
            // InternalSpec.g:1315:2: rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSpec.g:1322:1: rule__Selector__Group_3__0__Impl : ( ( rule__Selector__TypeAssignment_3_0 ) ) ;
    public final void rule__Selector__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1326:1: ( ( ( rule__Selector__TypeAssignment_3_0 ) ) )
            // InternalSpec.g:1327:1: ( ( rule__Selector__TypeAssignment_3_0 ) )
            {
            // InternalSpec.g:1327:1: ( ( rule__Selector__TypeAssignment_3_0 ) )
            // InternalSpec.g:1328:2: ( rule__Selector__TypeAssignment_3_0 )
            {
             before(grammarAccess.getSelectorAccess().getTypeAssignment_3_0()); 
            // InternalSpec.g:1329:2: ( rule__Selector__TypeAssignment_3_0 )
            // InternalSpec.g:1329:3: rule__Selector__TypeAssignment_3_0
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
    // InternalSpec.g:1337:1: rule__Selector__Group_3__1 : rule__Selector__Group_3__1__Impl ;
    public final void rule__Selector__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1341:1: ( rule__Selector__Group_3__1__Impl )
            // InternalSpec.g:1342:2: rule__Selector__Group_3__1__Impl
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
    // InternalSpec.g:1348:1: rule__Selector__Group_3__1__Impl : ( ( rule__Selector__StrAssignment_3_1 ) ) ;
    public final void rule__Selector__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1352:1: ( ( ( rule__Selector__StrAssignment_3_1 ) ) )
            // InternalSpec.g:1353:1: ( ( rule__Selector__StrAssignment_3_1 ) )
            {
            // InternalSpec.g:1353:1: ( ( rule__Selector__StrAssignment_3_1 ) )
            // InternalSpec.g:1354:2: ( rule__Selector__StrAssignment_3_1 )
            {
             before(grammarAccess.getSelectorAccess().getStrAssignment_3_1()); 
            // InternalSpec.g:1355:2: ( rule__Selector__StrAssignment_3_1 )
            // InternalSpec.g:1355:3: rule__Selector__StrAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__StrAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getStrAssignment_3_1()); 

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


    // $ANTLR start "rule__StoreCommand__Group__0"
    // InternalSpec.g:1364:1: rule__StoreCommand__Group__0 : rule__StoreCommand__Group__0__Impl rule__StoreCommand__Group__1 ;
    public final void rule__StoreCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1368:1: ( rule__StoreCommand__Group__0__Impl rule__StoreCommand__Group__1 )
            // InternalSpec.g:1369:2: rule__StoreCommand__Group__0__Impl rule__StoreCommand__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__StoreCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreCommand__Group__1();

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
    // $ANTLR end "rule__StoreCommand__Group__0"


    // $ANTLR start "rule__StoreCommand__Group__0__Impl"
    // InternalSpec.g:1376:1: rule__StoreCommand__Group__0__Impl : ( 'Store' ) ;
    public final void rule__StoreCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1380:1: ( ( 'Store' ) )
            // InternalSpec.g:1381:1: ( 'Store' )
            {
            // InternalSpec.g:1381:1: ( 'Store' )
            // InternalSpec.g:1382:2: 'Store'
            {
             before(grammarAccess.getStoreCommandAccess().getStoreKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStoreCommandAccess().getStoreKeyword_0()); 

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
    // $ANTLR end "rule__StoreCommand__Group__0__Impl"


    // $ANTLR start "rule__StoreCommand__Group__1"
    // InternalSpec.g:1391:1: rule__StoreCommand__Group__1 : rule__StoreCommand__Group__1__Impl rule__StoreCommand__Group__2 ;
    public final void rule__StoreCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1395:1: ( rule__StoreCommand__Group__1__Impl rule__StoreCommand__Group__2 )
            // InternalSpec.g:1396:2: rule__StoreCommand__Group__1__Impl rule__StoreCommand__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__StoreCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreCommand__Group__2();

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
    // $ANTLR end "rule__StoreCommand__Group__1"


    // $ANTLR start "rule__StoreCommand__Group__1__Impl"
    // InternalSpec.g:1403:1: rule__StoreCommand__Group__1__Impl : ( ( rule__StoreCommand__NameAssignment_1 ) ) ;
    public final void rule__StoreCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1407:1: ( ( ( rule__StoreCommand__NameAssignment_1 ) ) )
            // InternalSpec.g:1408:1: ( ( rule__StoreCommand__NameAssignment_1 ) )
            {
            // InternalSpec.g:1408:1: ( ( rule__StoreCommand__NameAssignment_1 ) )
            // InternalSpec.g:1409:2: ( rule__StoreCommand__NameAssignment_1 )
            {
             before(grammarAccess.getStoreCommandAccess().getNameAssignment_1()); 
            // InternalSpec.g:1410:2: ( rule__StoreCommand__NameAssignment_1 )
            // InternalSpec.g:1410:3: rule__StoreCommand__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StoreCommand__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStoreCommandAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StoreCommand__Group__1__Impl"


    // $ANTLR start "rule__StoreCommand__Group__2"
    // InternalSpec.g:1418:1: rule__StoreCommand__Group__2 : rule__StoreCommand__Group__2__Impl rule__StoreCommand__Group__3 ;
    public final void rule__StoreCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1422:1: ( rule__StoreCommand__Group__2__Impl rule__StoreCommand__Group__3 )
            // InternalSpec.g:1423:2: rule__StoreCommand__Group__2__Impl rule__StoreCommand__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__StoreCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreCommand__Group__3();

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
    // $ANTLR end "rule__StoreCommand__Group__2"


    // $ANTLR start "rule__StoreCommand__Group__2__Impl"
    // InternalSpec.g:1430:1: rule__StoreCommand__Group__2__Impl : ( 'as' ) ;
    public final void rule__StoreCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1434:1: ( ( 'as' ) )
            // InternalSpec.g:1435:1: ( 'as' )
            {
            // InternalSpec.g:1435:1: ( 'as' )
            // InternalSpec.g:1436:2: 'as'
            {
             before(grammarAccess.getStoreCommandAccess().getAsKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStoreCommandAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__StoreCommand__Group__2__Impl"


    // $ANTLR start "rule__StoreCommand__Group__3"
    // InternalSpec.g:1445:1: rule__StoreCommand__Group__3 : rule__StoreCommand__Group__3__Impl ;
    public final void rule__StoreCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1449:1: ( rule__StoreCommand__Group__3__Impl )
            // InternalSpec.g:1450:2: rule__StoreCommand__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoreCommand__Group__3__Impl();

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
    // $ANTLR end "rule__StoreCommand__Group__3"


    // $ANTLR start "rule__StoreCommand__Group__3__Impl"
    // InternalSpec.g:1456:1: rule__StoreCommand__Group__3__Impl : ( ( rule__StoreCommand__ValueAssignment_3 ) ) ;
    public final void rule__StoreCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1460:1: ( ( ( rule__StoreCommand__ValueAssignment_3 ) ) )
            // InternalSpec.g:1461:1: ( ( rule__StoreCommand__ValueAssignment_3 ) )
            {
            // InternalSpec.g:1461:1: ( ( rule__StoreCommand__ValueAssignment_3 ) )
            // InternalSpec.g:1462:2: ( rule__StoreCommand__ValueAssignment_3 )
            {
             before(grammarAccess.getStoreCommandAccess().getValueAssignment_3()); 
            // InternalSpec.g:1463:2: ( rule__StoreCommand__ValueAssignment_3 )
            // InternalSpec.g:1463:3: rule__StoreCommand__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StoreCommand__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStoreCommandAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__StoreCommand__Group__3__Impl"


    // $ANTLR start "rule__RememberCommand__Group__0"
    // InternalSpec.g:1472:1: rule__RememberCommand__Group__0 : rule__RememberCommand__Group__0__Impl rule__RememberCommand__Group__1 ;
    public final void rule__RememberCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1476:1: ( rule__RememberCommand__Group__0__Impl rule__RememberCommand__Group__1 )
            // InternalSpec.g:1477:2: rule__RememberCommand__Group__0__Impl rule__RememberCommand__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSpec.g:1484:1: rule__RememberCommand__Group__0__Impl : ( 'Remember' ) ;
    public final void rule__RememberCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1488:1: ( ( 'Remember' ) )
            // InternalSpec.g:1489:1: ( 'Remember' )
            {
            // InternalSpec.g:1489:1: ( 'Remember' )
            // InternalSpec.g:1490:2: 'Remember'
            {
             before(grammarAccess.getRememberCommandAccess().getRememberKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSpec.g:1499:1: rule__RememberCommand__Group__1 : rule__RememberCommand__Group__1__Impl rule__RememberCommand__Group__2 ;
    public final void rule__RememberCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1503:1: ( rule__RememberCommand__Group__1__Impl rule__RememberCommand__Group__2 )
            // InternalSpec.g:1504:2: rule__RememberCommand__Group__1__Impl rule__RememberCommand__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalSpec.g:1511:1: rule__RememberCommand__Group__1__Impl : ( ( rule__RememberCommand__PropAssignment_1 ) ) ;
    public final void rule__RememberCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1515:1: ( ( ( rule__RememberCommand__PropAssignment_1 ) ) )
            // InternalSpec.g:1516:1: ( ( rule__RememberCommand__PropAssignment_1 ) )
            {
            // InternalSpec.g:1516:1: ( ( rule__RememberCommand__PropAssignment_1 ) )
            // InternalSpec.g:1517:2: ( rule__RememberCommand__PropAssignment_1 )
            {
             before(grammarAccess.getRememberCommandAccess().getPropAssignment_1()); 
            // InternalSpec.g:1518:2: ( rule__RememberCommand__PropAssignment_1 )
            // InternalSpec.g:1518:3: rule__RememberCommand__PropAssignment_1
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
    // InternalSpec.g:1526:1: rule__RememberCommand__Group__2 : rule__RememberCommand__Group__2__Impl rule__RememberCommand__Group__3 ;
    public final void rule__RememberCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1530:1: ( rule__RememberCommand__Group__2__Impl rule__RememberCommand__Group__3 )
            // InternalSpec.g:1531:2: rule__RememberCommand__Group__2__Impl rule__RememberCommand__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalSpec.g:1538:1: rule__RememberCommand__Group__2__Impl : ( 'as' ) ;
    public final void rule__RememberCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1542:1: ( ( 'as' ) )
            // InternalSpec.g:1543:1: ( 'as' )
            {
            // InternalSpec.g:1543:1: ( 'as' )
            // InternalSpec.g:1544:2: 'as'
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
    // InternalSpec.g:1553:1: rule__RememberCommand__Group__3 : rule__RememberCommand__Group__3__Impl ;
    public final void rule__RememberCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1557:1: ( rule__RememberCommand__Group__3__Impl )
            // InternalSpec.g:1558:2: rule__RememberCommand__Group__3__Impl
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
    // InternalSpec.g:1564:1: rule__RememberCommand__Group__3__Impl : ( ( rule__RememberCommand__VarAssignment_3 ) ) ;
    public final void rule__RememberCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1568:1: ( ( ( rule__RememberCommand__VarAssignment_3 ) ) )
            // InternalSpec.g:1569:1: ( ( rule__RememberCommand__VarAssignment_3 ) )
            {
            // InternalSpec.g:1569:1: ( ( rule__RememberCommand__VarAssignment_3 ) )
            // InternalSpec.g:1570:2: ( rule__RememberCommand__VarAssignment_3 )
            {
             before(grammarAccess.getRememberCommandAccess().getVarAssignment_3()); 
            // InternalSpec.g:1571:2: ( rule__RememberCommand__VarAssignment_3 )
            // InternalSpec.g:1571:3: rule__RememberCommand__VarAssignment_3
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


    // $ANTLR start "rule__PropertyCommand__Group_0__0"
    // InternalSpec.g:1580:1: rule__PropertyCommand__Group_0__0 : rule__PropertyCommand__Group_0__0__Impl rule__PropertyCommand__Group_0__1 ;
    public final void rule__PropertyCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1584:1: ( rule__PropertyCommand__Group_0__0__Impl rule__PropertyCommand__Group_0__1 )
            // InternalSpec.g:1585:2: rule__PropertyCommand__Group_0__0__Impl rule__PropertyCommand__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__PropertyCommand__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCommand__Group_0__1();

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
    // $ANTLR end "rule__PropertyCommand__Group_0__0"


    // $ANTLR start "rule__PropertyCommand__Group_0__0__Impl"
    // InternalSpec.g:1592:1: rule__PropertyCommand__Group_0__0__Impl : ( 'Property' ) ;
    public final void rule__PropertyCommand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1596:1: ( ( 'Property' ) )
            // InternalSpec.g:1597:1: ( 'Property' )
            {
            // InternalSpec.g:1597:1: ( 'Property' )
            // InternalSpec.g:1598:2: 'Property'
            {
             before(grammarAccess.getPropertyCommandAccess().getPropertyKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPropertyCommandAccess().getPropertyKeyword_0_0()); 

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
    // $ANTLR end "rule__PropertyCommand__Group_0__0__Impl"


    // $ANTLR start "rule__PropertyCommand__Group_0__1"
    // InternalSpec.g:1607:1: rule__PropertyCommand__Group_0__1 : rule__PropertyCommand__Group_0__1__Impl rule__PropertyCommand__Group_0__2 ;
    public final void rule__PropertyCommand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1611:1: ( rule__PropertyCommand__Group_0__1__Impl rule__PropertyCommand__Group_0__2 )
            // InternalSpec.g:1612:2: rule__PropertyCommand__Group_0__1__Impl rule__PropertyCommand__Group_0__2
            {
            pushFollow(FOLLOW_15);
            rule__PropertyCommand__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCommand__Group_0__2();

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
    // $ANTLR end "rule__PropertyCommand__Group_0__1"


    // $ANTLR start "rule__PropertyCommand__Group_0__1__Impl"
    // InternalSpec.g:1619:1: rule__PropertyCommand__Group_0__1__Impl : ( ( rule__PropertyCommand__PropAssignment_0_1 ) ) ;
    public final void rule__PropertyCommand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1623:1: ( ( ( rule__PropertyCommand__PropAssignment_0_1 ) ) )
            // InternalSpec.g:1624:1: ( ( rule__PropertyCommand__PropAssignment_0_1 ) )
            {
            // InternalSpec.g:1624:1: ( ( rule__PropertyCommand__PropAssignment_0_1 ) )
            // InternalSpec.g:1625:2: ( rule__PropertyCommand__PropAssignment_0_1 )
            {
             before(grammarAccess.getPropertyCommandAccess().getPropAssignment_0_1()); 
            // InternalSpec.g:1626:2: ( rule__PropertyCommand__PropAssignment_0_1 )
            // InternalSpec.g:1626:3: rule__PropertyCommand__PropAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__PropAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCommandAccess().getPropAssignment_0_1()); 

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
    // $ANTLR end "rule__PropertyCommand__Group_0__1__Impl"


    // $ANTLR start "rule__PropertyCommand__Group_0__2"
    // InternalSpec.g:1634:1: rule__PropertyCommand__Group_0__2 : rule__PropertyCommand__Group_0__2__Impl rule__PropertyCommand__Group_0__3 ;
    public final void rule__PropertyCommand__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1638:1: ( rule__PropertyCommand__Group_0__2__Impl rule__PropertyCommand__Group_0__3 )
            // InternalSpec.g:1639:2: rule__PropertyCommand__Group_0__2__Impl rule__PropertyCommand__Group_0__3
            {
            pushFollow(FOLLOW_5);
            rule__PropertyCommand__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCommand__Group_0__3();

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
    // $ANTLR end "rule__PropertyCommand__Group_0__2"


    // $ANTLR start "rule__PropertyCommand__Group_0__2__Impl"
    // InternalSpec.g:1646:1: rule__PropertyCommand__Group_0__2__Impl : ( ( rule__PropertyCommand__CondAssignment_0_2 ) ) ;
    public final void rule__PropertyCommand__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1650:1: ( ( ( rule__PropertyCommand__CondAssignment_0_2 ) ) )
            // InternalSpec.g:1651:1: ( ( rule__PropertyCommand__CondAssignment_0_2 ) )
            {
            // InternalSpec.g:1651:1: ( ( rule__PropertyCommand__CondAssignment_0_2 ) )
            // InternalSpec.g:1652:2: ( rule__PropertyCommand__CondAssignment_0_2 )
            {
             before(grammarAccess.getPropertyCommandAccess().getCondAssignment_0_2()); 
            // InternalSpec.g:1653:2: ( rule__PropertyCommand__CondAssignment_0_2 )
            // InternalSpec.g:1653:3: rule__PropertyCommand__CondAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__CondAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCommandAccess().getCondAssignment_0_2()); 

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
    // $ANTLR end "rule__PropertyCommand__Group_0__2__Impl"


    // $ANTLR start "rule__PropertyCommand__Group_0__3"
    // InternalSpec.g:1661:1: rule__PropertyCommand__Group_0__3 : rule__PropertyCommand__Group_0__3__Impl ;
    public final void rule__PropertyCommand__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1665:1: ( rule__PropertyCommand__Group_0__3__Impl )
            // InternalSpec.g:1666:2: rule__PropertyCommand__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__Group_0__3__Impl();

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
    // $ANTLR end "rule__PropertyCommand__Group_0__3"


    // $ANTLR start "rule__PropertyCommand__Group_0__3__Impl"
    // InternalSpec.g:1672:1: rule__PropertyCommand__Group_0__3__Impl : ( ( rule__PropertyCommand__ValAssignment_0_3 ) ) ;
    public final void rule__PropertyCommand__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1676:1: ( ( ( rule__PropertyCommand__ValAssignment_0_3 ) ) )
            // InternalSpec.g:1677:1: ( ( rule__PropertyCommand__ValAssignment_0_3 ) )
            {
            // InternalSpec.g:1677:1: ( ( rule__PropertyCommand__ValAssignment_0_3 ) )
            // InternalSpec.g:1678:2: ( rule__PropertyCommand__ValAssignment_0_3 )
            {
             before(grammarAccess.getPropertyCommandAccess().getValAssignment_0_3()); 
            // InternalSpec.g:1679:2: ( rule__PropertyCommand__ValAssignment_0_3 )
            // InternalSpec.g:1679:3: rule__PropertyCommand__ValAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__ValAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCommandAccess().getValAssignment_0_3()); 

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
    // $ANTLR end "rule__PropertyCommand__Group_0__3__Impl"


    // $ANTLR start "rule__PropertyCommand__Group_1__0"
    // InternalSpec.g:1688:1: rule__PropertyCommand__Group_1__0 : rule__PropertyCommand__Group_1__0__Impl rule__PropertyCommand__Group_1__1 ;
    public final void rule__PropertyCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1692:1: ( rule__PropertyCommand__Group_1__0__Impl rule__PropertyCommand__Group_1__1 )
            // InternalSpec.g:1693:2: rule__PropertyCommand__Group_1__0__Impl rule__PropertyCommand__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__PropertyCommand__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCommand__Group_1__1();

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
    // $ANTLR end "rule__PropertyCommand__Group_1__0"


    // $ANTLR start "rule__PropertyCommand__Group_1__0__Impl"
    // InternalSpec.g:1700:1: rule__PropertyCommand__Group_1__0__Impl : ( 'Property' ) ;
    public final void rule__PropertyCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1704:1: ( ( 'Property' ) )
            // InternalSpec.g:1705:1: ( 'Property' )
            {
            // InternalSpec.g:1705:1: ( 'Property' )
            // InternalSpec.g:1706:2: 'Property'
            {
             before(grammarAccess.getPropertyCommandAccess().getPropertyKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPropertyCommandAccess().getPropertyKeyword_1_0()); 

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
    // $ANTLR end "rule__PropertyCommand__Group_1__0__Impl"


    // $ANTLR start "rule__PropertyCommand__Group_1__1"
    // InternalSpec.g:1715:1: rule__PropertyCommand__Group_1__1 : rule__PropertyCommand__Group_1__1__Impl rule__PropertyCommand__Group_1__2 ;
    public final void rule__PropertyCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1719:1: ( rule__PropertyCommand__Group_1__1__Impl rule__PropertyCommand__Group_1__2 )
            // InternalSpec.g:1720:2: rule__PropertyCommand__Group_1__1__Impl rule__PropertyCommand__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__PropertyCommand__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCommand__Group_1__2();

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
    // $ANTLR end "rule__PropertyCommand__Group_1__1"


    // $ANTLR start "rule__PropertyCommand__Group_1__1__Impl"
    // InternalSpec.g:1727:1: rule__PropertyCommand__Group_1__1__Impl : ( ( rule__PropertyCommand__PropAssignment_1_1 ) ) ;
    public final void rule__PropertyCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1731:1: ( ( ( rule__PropertyCommand__PropAssignment_1_1 ) ) )
            // InternalSpec.g:1732:1: ( ( rule__PropertyCommand__PropAssignment_1_1 ) )
            {
            // InternalSpec.g:1732:1: ( ( rule__PropertyCommand__PropAssignment_1_1 ) )
            // InternalSpec.g:1733:2: ( rule__PropertyCommand__PropAssignment_1_1 )
            {
             before(grammarAccess.getPropertyCommandAccess().getPropAssignment_1_1()); 
            // InternalSpec.g:1734:2: ( rule__PropertyCommand__PropAssignment_1_1 )
            // InternalSpec.g:1734:3: rule__PropertyCommand__PropAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__PropAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCommandAccess().getPropAssignment_1_1()); 

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
    // $ANTLR end "rule__PropertyCommand__Group_1__1__Impl"


    // $ANTLR start "rule__PropertyCommand__Group_1__2"
    // InternalSpec.g:1742:1: rule__PropertyCommand__Group_1__2 : rule__PropertyCommand__Group_1__2__Impl rule__PropertyCommand__Group_1__3 ;
    public final void rule__PropertyCommand__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1746:1: ( rule__PropertyCommand__Group_1__2__Impl rule__PropertyCommand__Group_1__3 )
            // InternalSpec.g:1747:2: rule__PropertyCommand__Group_1__2__Impl rule__PropertyCommand__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__PropertyCommand__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCommand__Group_1__3();

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
    // $ANTLR end "rule__PropertyCommand__Group_1__2"


    // $ANTLR start "rule__PropertyCommand__Group_1__2__Impl"
    // InternalSpec.g:1754:1: rule__PropertyCommand__Group_1__2__Impl : ( ( rule__PropertyCommand__CondAssignment_1_2 ) ) ;
    public final void rule__PropertyCommand__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1758:1: ( ( ( rule__PropertyCommand__CondAssignment_1_2 ) ) )
            // InternalSpec.g:1759:1: ( ( rule__PropertyCommand__CondAssignment_1_2 ) )
            {
            // InternalSpec.g:1759:1: ( ( rule__PropertyCommand__CondAssignment_1_2 ) )
            // InternalSpec.g:1760:2: ( rule__PropertyCommand__CondAssignment_1_2 )
            {
             before(grammarAccess.getPropertyCommandAccess().getCondAssignment_1_2()); 
            // InternalSpec.g:1761:2: ( rule__PropertyCommand__CondAssignment_1_2 )
            // InternalSpec.g:1761:3: rule__PropertyCommand__CondAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__CondAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCommandAccess().getCondAssignment_1_2()); 

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
    // $ANTLR end "rule__PropertyCommand__Group_1__2__Impl"


    // $ANTLR start "rule__PropertyCommand__Group_1__3"
    // InternalSpec.g:1769:1: rule__PropertyCommand__Group_1__3 : rule__PropertyCommand__Group_1__3__Impl ;
    public final void rule__PropertyCommand__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1773:1: ( rule__PropertyCommand__Group_1__3__Impl )
            // InternalSpec.g:1774:2: rule__PropertyCommand__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__Group_1__3__Impl();

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
    // $ANTLR end "rule__PropertyCommand__Group_1__3"


    // $ANTLR start "rule__PropertyCommand__Group_1__3__Impl"
    // InternalSpec.g:1780:1: rule__PropertyCommand__Group_1__3__Impl : ( ( rule__PropertyCommand__VarAssignment_1_3 ) ) ;
    public final void rule__PropertyCommand__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1784:1: ( ( ( rule__PropertyCommand__VarAssignment_1_3 ) ) )
            // InternalSpec.g:1785:1: ( ( rule__PropertyCommand__VarAssignment_1_3 ) )
            {
            // InternalSpec.g:1785:1: ( ( rule__PropertyCommand__VarAssignment_1_3 ) )
            // InternalSpec.g:1786:2: ( rule__PropertyCommand__VarAssignment_1_3 )
            {
             before(grammarAccess.getPropertyCommandAccess().getVarAssignment_1_3()); 
            // InternalSpec.g:1787:2: ( rule__PropertyCommand__VarAssignment_1_3 )
            // InternalSpec.g:1787:3: rule__PropertyCommand__VarAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__VarAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCommandAccess().getVarAssignment_1_3()); 

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
    // $ANTLR end "rule__PropertyCommand__Group_1__3__Impl"


    // $ANTLR start "rule__Condition__Group_0__0"
    // InternalSpec.g:1796:1: rule__Condition__Group_0__0 : rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 ;
    public final void rule__Condition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1800:1: ( rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 )
            // InternalSpec.g:1801:2: rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1
            {
            pushFollow(FOLLOW_16);
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
            match(input,33,FOLLOW_2); 
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
            match(input,34,FOLLOW_2); 
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
            pushFollow(FOLLOW_17);
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
            match(input,33,FOLLOW_2); 
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
            pushFollow(FOLLOW_16);
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
            match(input,35,FOLLOW_2); 
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
            match(input,34,FOLLOW_2); 
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


    // $ANTLR start "rule__TypeCommand__Group_0__0"
    // InternalSpec.g:1931:1: rule__TypeCommand__Group_0__0 : rule__TypeCommand__Group_0__0__Impl rule__TypeCommand__Group_0__1 ;
    public final void rule__TypeCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1935:1: ( rule__TypeCommand__Group_0__0__Impl rule__TypeCommand__Group_0__1 )
            // InternalSpec.g:1936:2: rule__TypeCommand__Group_0__0__Impl rule__TypeCommand__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__TypeCommand__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeCommand__Group_0__1();

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
    // $ANTLR end "rule__TypeCommand__Group_0__0"


    // $ANTLR start "rule__TypeCommand__Group_0__0__Impl"
    // InternalSpec.g:1943:1: rule__TypeCommand__Group_0__0__Impl : ( 'Type' ) ;
    public final void rule__TypeCommand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1947:1: ( ( 'Type' ) )
            // InternalSpec.g:1948:1: ( 'Type' )
            {
            // InternalSpec.g:1948:1: ( 'Type' )
            // InternalSpec.g:1949:2: 'Type'
            {
             before(grammarAccess.getTypeCommandAccess().getTypeKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTypeCommandAccess().getTypeKeyword_0_0()); 

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
    // $ANTLR end "rule__TypeCommand__Group_0__0__Impl"


    // $ANTLR start "rule__TypeCommand__Group_0__1"
    // InternalSpec.g:1958:1: rule__TypeCommand__Group_0__1 : rule__TypeCommand__Group_0__1__Impl ;
    public final void rule__TypeCommand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1962:1: ( rule__TypeCommand__Group_0__1__Impl )
            // InternalSpec.g:1963:2: rule__TypeCommand__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeCommand__Group_0__1__Impl();

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
    // $ANTLR end "rule__TypeCommand__Group_0__1"


    // $ANTLR start "rule__TypeCommand__Group_0__1__Impl"
    // InternalSpec.g:1969:1: rule__TypeCommand__Group_0__1__Impl : ( ( rule__TypeCommand__StrAssignment_0_1 ) ) ;
    public final void rule__TypeCommand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1973:1: ( ( ( rule__TypeCommand__StrAssignment_0_1 ) ) )
            // InternalSpec.g:1974:1: ( ( rule__TypeCommand__StrAssignment_0_1 ) )
            {
            // InternalSpec.g:1974:1: ( ( rule__TypeCommand__StrAssignment_0_1 ) )
            // InternalSpec.g:1975:2: ( rule__TypeCommand__StrAssignment_0_1 )
            {
             before(grammarAccess.getTypeCommandAccess().getStrAssignment_0_1()); 
            // InternalSpec.g:1976:2: ( rule__TypeCommand__StrAssignment_0_1 )
            // InternalSpec.g:1976:3: rule__TypeCommand__StrAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeCommand__StrAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeCommandAccess().getStrAssignment_0_1()); 

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
    // $ANTLR end "rule__TypeCommand__Group_0__1__Impl"


    // $ANTLR start "rule__TypeCommand__Group_1__0"
    // InternalSpec.g:1985:1: rule__TypeCommand__Group_1__0 : rule__TypeCommand__Group_1__0__Impl rule__TypeCommand__Group_1__1 ;
    public final void rule__TypeCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1989:1: ( rule__TypeCommand__Group_1__0__Impl rule__TypeCommand__Group_1__1 )
            // InternalSpec.g:1990:2: rule__TypeCommand__Group_1__0__Impl rule__TypeCommand__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__TypeCommand__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeCommand__Group_1__1();

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
    // $ANTLR end "rule__TypeCommand__Group_1__0"


    // $ANTLR start "rule__TypeCommand__Group_1__0__Impl"
    // InternalSpec.g:1997:1: rule__TypeCommand__Group_1__0__Impl : ( 'Type' ) ;
    public final void rule__TypeCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2001:1: ( ( 'Type' ) )
            // InternalSpec.g:2002:1: ( 'Type' )
            {
            // InternalSpec.g:2002:1: ( 'Type' )
            // InternalSpec.g:2003:2: 'Type'
            {
             before(grammarAccess.getTypeCommandAccess().getTypeKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTypeCommandAccess().getTypeKeyword_1_0()); 

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
    // $ANTLR end "rule__TypeCommand__Group_1__0__Impl"


    // $ANTLR start "rule__TypeCommand__Group_1__1"
    // InternalSpec.g:2012:1: rule__TypeCommand__Group_1__1 : rule__TypeCommand__Group_1__1__Impl ;
    public final void rule__TypeCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2016:1: ( rule__TypeCommand__Group_1__1__Impl )
            // InternalSpec.g:2017:2: rule__TypeCommand__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeCommand__Group_1__1__Impl();

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
    // $ANTLR end "rule__TypeCommand__Group_1__1"


    // $ANTLR start "rule__TypeCommand__Group_1__1__Impl"
    // InternalSpec.g:2023:1: rule__TypeCommand__Group_1__1__Impl : ( ( rule__TypeCommand__VarAssignment_1_1 ) ) ;
    public final void rule__TypeCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2027:1: ( ( ( rule__TypeCommand__VarAssignment_1_1 ) ) )
            // InternalSpec.g:2028:1: ( ( rule__TypeCommand__VarAssignment_1_1 ) )
            {
            // InternalSpec.g:2028:1: ( ( rule__TypeCommand__VarAssignment_1_1 ) )
            // InternalSpec.g:2029:2: ( rule__TypeCommand__VarAssignment_1_1 )
            {
             before(grammarAccess.getTypeCommandAccess().getVarAssignment_1_1()); 
            // InternalSpec.g:2030:2: ( rule__TypeCommand__VarAssignment_1_1 )
            // InternalSpec.g:2030:3: rule__TypeCommand__VarAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeCommand__VarAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeCommandAccess().getVarAssignment_1_1()); 

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
    // $ANTLR end "rule__TypeCommand__Group_1__1__Impl"


    // $ANTLR start "rule__SleepCommand__Group__0"
    // InternalSpec.g:2039:1: rule__SleepCommand__Group__0 : rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1 ;
    public final void rule__SleepCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2043:1: ( rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1 )
            // InternalSpec.g:2044:2: rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSpec.g:2051:1: rule__SleepCommand__Group__0__Impl : ( 'Sleep' ) ;
    public final void rule__SleepCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2055:1: ( ( 'Sleep' ) )
            // InternalSpec.g:2056:1: ( 'Sleep' )
            {
            // InternalSpec.g:2056:1: ( 'Sleep' )
            // InternalSpec.g:2057:2: 'Sleep'
            {
             before(grammarAccess.getSleepCommandAccess().getSleepKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSpec.g:2066:1: rule__SleepCommand__Group__1 : rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2 ;
    public final void rule__SleepCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2070:1: ( rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2 )
            // InternalSpec.g:2071:2: rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalSpec.g:2078:1: rule__SleepCommand__Group__1__Impl : ( 'for' ) ;
    public final void rule__SleepCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2082:1: ( ( 'for' ) )
            // InternalSpec.g:2083:1: ( 'for' )
            {
            // InternalSpec.g:2083:1: ( 'for' )
            // InternalSpec.g:2084:2: 'for'
            {
             before(grammarAccess.getSleepCommandAccess().getForKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSpec.g:2093:1: rule__SleepCommand__Group__2 : rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3 ;
    public final void rule__SleepCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2097:1: ( rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3 )
            // InternalSpec.g:2098:2: rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalSpec.g:2105:1: rule__SleepCommand__Group__2__Impl : ( ( rule__SleepCommand__TimeAssignment_2 ) ) ;
    public final void rule__SleepCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2109:1: ( ( ( rule__SleepCommand__TimeAssignment_2 ) ) )
            // InternalSpec.g:2110:1: ( ( rule__SleepCommand__TimeAssignment_2 ) )
            {
            // InternalSpec.g:2110:1: ( ( rule__SleepCommand__TimeAssignment_2 ) )
            // InternalSpec.g:2111:2: ( rule__SleepCommand__TimeAssignment_2 )
            {
             before(grammarAccess.getSleepCommandAccess().getTimeAssignment_2()); 
            // InternalSpec.g:2112:2: ( rule__SleepCommand__TimeAssignment_2 )
            // InternalSpec.g:2112:3: rule__SleepCommand__TimeAssignment_2
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
    // InternalSpec.g:2120:1: rule__SleepCommand__Group__3 : rule__SleepCommand__Group__3__Impl ;
    public final void rule__SleepCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2124:1: ( rule__SleepCommand__Group__3__Impl )
            // InternalSpec.g:2125:2: rule__SleepCommand__Group__3__Impl
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
    // InternalSpec.g:2131:1: rule__SleepCommand__Group__3__Impl : ( ( rule__SleepCommand__Alternatives_3 ) ) ;
    public final void rule__SleepCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2135:1: ( ( ( rule__SleepCommand__Alternatives_3 ) ) )
            // InternalSpec.g:2136:1: ( ( rule__SleepCommand__Alternatives_3 ) )
            {
            // InternalSpec.g:2136:1: ( ( rule__SleepCommand__Alternatives_3 ) )
            // InternalSpec.g:2137:2: ( rule__SleepCommand__Alternatives_3 )
            {
             before(grammarAccess.getSleepCommandAccess().getAlternatives_3()); 
            // InternalSpec.g:2138:2: ( rule__SleepCommand__Alternatives_3 )
            // InternalSpec.g:2138:3: rule__SleepCommand__Alternatives_3
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


    // $ANTLR start "rule__Point__Group__0"
    // InternalSpec.g:2147:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2151:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalSpec.g:2152:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSpec.g:2159:1: rule__Point__Group__0__Impl : ( '{' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2163:1: ( ( '{' ) )
            // InternalSpec.g:2164:1: ( '{' )
            {
            // InternalSpec.g:2164:1: ( '{' )
            // InternalSpec.g:2165:2: '{'
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
    // InternalSpec.g:2174:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2178:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalSpec.g:2179:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalSpec.g:2186:1: rule__Point__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2190:1: ( ( RULE_INT ) )
            // InternalSpec.g:2191:1: ( RULE_INT )
            {
            // InternalSpec.g:2191:1: ( RULE_INT )
            // InternalSpec.g:2192:2: RULE_INT
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
    // InternalSpec.g:2201:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2205:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalSpec.g:2206:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalSpec.g:2213:1: rule__Point__Group__2__Impl : ( ',' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2217:1: ( ( ',' ) )
            // InternalSpec.g:2218:1: ( ',' )
            {
            // InternalSpec.g:2218:1: ( ',' )
            // InternalSpec.g:2219:2: ','
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
    // InternalSpec.g:2228:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2232:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // InternalSpec.g:2233:2: rule__Point__Group__3__Impl rule__Point__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalSpec.g:2240:1: rule__Point__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2244:1: ( ( RULE_INT ) )
            // InternalSpec.g:2245:1: ( RULE_INT )
            {
            // InternalSpec.g:2245:1: ( RULE_INT )
            // InternalSpec.g:2246:2: RULE_INT
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
    // InternalSpec.g:2255:1: rule__Point__Group__4 : rule__Point__Group__4__Impl ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2259:1: ( rule__Point__Group__4__Impl )
            // InternalSpec.g:2260:2: rule__Point__Group__4__Impl
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
    // InternalSpec.g:2266:1: rule__Point__Group__4__Impl : ( '}' ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2270:1: ( ( '}' ) )
            // InternalSpec.g:2271:1: ( '}' )
            {
            // InternalSpec.g:2271:1: ( '}' )
            // InternalSpec.g:2272:2: '}'
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
    // InternalSpec.g:2282:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2286:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalSpec.g:2287:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSpec.g:2294:1: rule__Variable__Group__0__Impl : ( '$' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2298:1: ( ( '$' ) )
            // InternalSpec.g:2299:1: ( '$' )
            {
            // InternalSpec.g:2299:1: ( '$' )
            // InternalSpec.g:2300:2: '$'
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
    // InternalSpec.g:2309:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2313:1: ( rule__Variable__Group__1__Impl )
            // InternalSpec.g:2314:2: rule__Variable__Group__1__Impl
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
    // InternalSpec.g:2320:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2324:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalSpec.g:2325:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalSpec.g:2325:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalSpec.g:2326:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalSpec.g:2327:2: ( rule__Variable__NameAssignment_1 )
            // InternalSpec.g:2327:3: rule__Variable__NameAssignment_1
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
    // InternalSpec.g:2336:1: rule__Model__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2340:1: ( ( ruleCommand ) )
            // InternalSpec.g:2341:2: ( ruleCommand )
            {
            // InternalSpec.g:2341:2: ( ruleCommand )
            // InternalSpec.g:2342:3: ruleCommand
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


    // $ANTLR start "rule__Command__CommentAssignment_8"
    // InternalSpec.g:2351:1: rule__Command__CommentAssignment_8 : ( RULE_SL_COMMENT ) ;
    public final void rule__Command__CommentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2355:1: ( ( RULE_SL_COMMENT ) )
            // InternalSpec.g:2356:2: ( RULE_SL_COMMENT )
            {
            // InternalSpec.g:2356:2: ( RULE_SL_COMMENT )
            // InternalSpec.g:2357:3: RULE_SL_COMMENT
            {
             before(grammarAccess.getCommandAccess().getCommentSL_COMMENTTerminalRuleCall_8_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getCommentSL_COMMENTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Command__CommentAssignment_8"


    // $ANTLR start "rule__Command__CustomAssignment_9"
    // InternalSpec.g:2366:1: rule__Command__CustomAssignment_9 : ( RULE_CUSTOM_COMMAND ) ;
    public final void rule__Command__CustomAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2370:1: ( ( RULE_CUSTOM_COMMAND ) )
            // InternalSpec.g:2371:2: ( RULE_CUSTOM_COMMAND )
            {
            // InternalSpec.g:2371:2: ( RULE_CUSTOM_COMMAND )
            // InternalSpec.g:2372:3: RULE_CUSTOM_COMMAND
            {
             before(grammarAccess.getCommandAccess().getCustomCUSTOM_COMMANDTerminalRuleCall_9_0()); 
            match(input,RULE_CUSTOM_COMMAND,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getCustomCUSTOM_COMMANDTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Command__CustomAssignment_9"


    // $ANTLR start "rule__OpenCommand__VarAssignment_1_1"
    // InternalSpec.g:2381:1: rule__OpenCommand__VarAssignment_1_1 : ( ruleVariable ) ;
    public final void rule__OpenCommand__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2385:1: ( ( ruleVariable ) )
            // InternalSpec.g:2386:2: ( ruleVariable )
            {
            // InternalSpec.g:2386:2: ( ruleVariable )
            // InternalSpec.g:2387:3: ruleVariable
            {
             before(grammarAccess.getOpenCommandAccess().getVarVariableParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getOpenCommandAccess().getVarVariableParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__OpenCommand__VarAssignment_1_1"


    // $ANTLR start "rule__ClickCommand__CmdAssignment_0"
    // InternalSpec.g:2396:1: rule__ClickCommand__CmdAssignment_0 : ( ( 'Click' ) ) ;
    public final void rule__ClickCommand__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2400:1: ( ( ( 'Click' ) ) )
            // InternalSpec.g:2401:2: ( ( 'Click' ) )
            {
            // InternalSpec.g:2401:2: ( ( 'Click' ) )
            // InternalSpec.g:2402:3: ( 'Click' )
            {
             before(grammarAccess.getClickCommandAccess().getCmdClickKeyword_0_0()); 
            // InternalSpec.g:2403:3: ( 'Click' )
            // InternalSpec.g:2404:4: 'Click'
            {
             before(grammarAccess.getClickCommandAccess().getCmdClickKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSpec.g:2415:1: rule__ClickCommand__SelectorAssignment_1_2 : ( ruleSelector ) ;
    public final void rule__ClickCommand__SelectorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2419:1: ( ( ruleSelector ) )
            // InternalSpec.g:2420:2: ( ruleSelector )
            {
            // InternalSpec.g:2420:2: ( ruleSelector )
            // InternalSpec.g:2421:3: ruleSelector
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
    // InternalSpec.g:2430:1: rule__ClickCommand__PointAssignment_2_2 : ( rulePoint ) ;
    public final void rule__ClickCommand__PointAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2434:1: ( ( rulePoint ) )
            // InternalSpec.g:2435:2: ( rulePoint )
            {
            // InternalSpec.g:2435:2: ( rulePoint )
            // InternalSpec.g:2436:3: rulePoint
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


    // $ANTLR start "rule__SelectCommand__ValueAssignment_0_1"
    // InternalSpec.g:2445:1: rule__SelectCommand__ValueAssignment_0_1 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2449:1: ( ( ruleSelector ) )
            // InternalSpec.g:2450:2: ( ruleSelector )
            {
            // InternalSpec.g:2450:2: ( ruleSelector )
            // InternalSpec.g:2451:3: ruleSelector
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
    // InternalSpec.g:2460:1: rule__SelectCommand__ValueAssignment_1_1 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2464:1: ( ( ruleSelector ) )
            // InternalSpec.g:2465:2: ( ruleSelector )
            {
            // InternalSpec.g:2465:2: ( ruleSelector )
            // InternalSpec.g:2466:3: ruleSelector
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
    // InternalSpec.g:2475:1: rule__SelectCommand__ValueAssignment_2_2 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2479:1: ( ( ruleSelector ) )
            // InternalSpec.g:2480:2: ( ruleSelector )
            {
            // InternalSpec.g:2480:2: ( ruleSelector )
            // InternalSpec.g:2481:3: ruleSelector
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


    // $ANTLR start "rule__Selector__VarAssignment_0"
    // InternalSpec.g:2490:1: rule__Selector__VarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Selector__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2494:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2495:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2495:2: ( ( RULE_ID ) )
            // InternalSpec.g:2496:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectorAccess().getVarVariableCrossReference_0_0()); 
            // InternalSpec.g:2497:3: ( RULE_ID )
            // InternalSpec.g:2498:4: RULE_ID
            {
             before(grammarAccess.getSelectorAccess().getVarVariableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getVarVariableIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSelectorAccess().getVarVariableCrossReference_0_0()); 

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
    // $ANTLR end "rule__Selector__VarAssignment_0"


    // $ANTLR start "rule__Selector__StrAssignment_1"
    // InternalSpec.g:2509:1: rule__Selector__StrAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Selector__StrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2513:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2514:2: ( RULE_STRING )
            {
            // InternalSpec.g:2514:2: ( RULE_STRING )
            // InternalSpec.g:2515:3: RULE_STRING
            {
             before(grammarAccess.getSelectorAccess().getStrSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getStrSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Selector__StrAssignment_1"


    // $ANTLR start "rule__Selector__TypeAssignment_2_0"
    // InternalSpec.g:2524:1: rule__Selector__TypeAssignment_2_0 : ( ruleElementType ) ;
    public final void rule__Selector__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2528:1: ( ( ruleElementType ) )
            // InternalSpec.g:2529:2: ( ruleElementType )
            {
            // InternalSpec.g:2529:2: ( ruleElementType )
            // InternalSpec.g:2530:3: ruleElementType
            {
             before(grammarAccess.getSelectorAccess().getTypeElementTypeEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getTypeElementTypeEnumRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Selector__TypeAssignment_2_0"


    // $ANTLR start "rule__Selector__VarAssignment_2_1"
    // InternalSpec.g:2539:1: rule__Selector__VarAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Selector__VarAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2543:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2544:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2544:2: ( ( RULE_ID ) )
            // InternalSpec.g:2545:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectorAccess().getVarVariableCrossReference_2_1_0()); 
            // InternalSpec.g:2546:3: ( RULE_ID )
            // InternalSpec.g:2547:4: RULE_ID
            {
             before(grammarAccess.getSelectorAccess().getVarVariableIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getVarVariableIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getSelectorAccess().getVarVariableCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Selector__VarAssignment_2_1"


    // $ANTLR start "rule__Selector__TypeAssignment_3_0"
    // InternalSpec.g:2558:1: rule__Selector__TypeAssignment_3_0 : ( ruleElementType ) ;
    public final void rule__Selector__TypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2562:1: ( ( ruleElementType ) )
            // InternalSpec.g:2563:2: ( ruleElementType )
            {
            // InternalSpec.g:2563:2: ( ruleElementType )
            // InternalSpec.g:2564:3: ruleElementType
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


    // $ANTLR start "rule__Selector__StrAssignment_3_1"
    // InternalSpec.g:2573:1: rule__Selector__StrAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Selector__StrAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2577:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2578:2: ( RULE_STRING )
            {
            // InternalSpec.g:2578:2: ( RULE_STRING )
            // InternalSpec.g:2579:3: RULE_STRING
            {
             before(grammarAccess.getSelectorAccess().getStrSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getStrSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Selector__StrAssignment_3_1"


    // $ANTLR start "rule__StoreCommand__NameAssignment_1"
    // InternalSpec.g:2588:1: rule__StoreCommand__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StoreCommand__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2592:1: ( ( RULE_ID ) )
            // InternalSpec.g:2593:2: ( RULE_ID )
            {
            // InternalSpec.g:2593:2: ( RULE_ID )
            // InternalSpec.g:2594:3: RULE_ID
            {
             before(grammarAccess.getStoreCommandAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStoreCommandAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__StoreCommand__NameAssignment_1"


    // $ANTLR start "rule__StoreCommand__ValueAssignment_3"
    // InternalSpec.g:2603:1: rule__StoreCommand__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__StoreCommand__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2607:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2608:2: ( RULE_STRING )
            {
            // InternalSpec.g:2608:2: ( RULE_STRING )
            // InternalSpec.g:2609:3: RULE_STRING
            {
             before(grammarAccess.getStoreCommandAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStoreCommandAccess().getValueSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__StoreCommand__ValueAssignment_3"


    // $ANTLR start "rule__RememberCommand__PropAssignment_1"
    // InternalSpec.g:2618:1: rule__RememberCommand__PropAssignment_1 : ( ruleProperty ) ;
    public final void rule__RememberCommand__PropAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2622:1: ( ( ruleProperty ) )
            // InternalSpec.g:2623:2: ( ruleProperty )
            {
            // InternalSpec.g:2623:2: ( ruleProperty )
            // InternalSpec.g:2624:3: ruleProperty
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
    // InternalSpec.g:2633:1: rule__RememberCommand__VarAssignment_3 : ( RULE_ID ) ;
    public final void rule__RememberCommand__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2637:1: ( ( RULE_ID ) )
            // InternalSpec.g:2638:2: ( RULE_ID )
            {
            // InternalSpec.g:2638:2: ( RULE_ID )
            // InternalSpec.g:2639:3: RULE_ID
            {
             before(grammarAccess.getRememberCommandAccess().getVarIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRememberCommandAccess().getVarIDTerminalRuleCall_3_0()); 

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


    // $ANTLR start "rule__PropertyCommand__PropAssignment_0_1"
    // InternalSpec.g:2648:1: rule__PropertyCommand__PropAssignment_0_1 : ( ruleProperty ) ;
    public final void rule__PropertyCommand__PropAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2652:1: ( ( ruleProperty ) )
            // InternalSpec.g:2653:2: ( ruleProperty )
            {
            // InternalSpec.g:2653:2: ( ruleProperty )
            // InternalSpec.g:2654:3: ruleProperty
            {
             before(grammarAccess.getPropertyCommandAccess().getPropPropertyParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyCommandAccess().getPropPropertyParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__PropertyCommand__PropAssignment_0_1"


    // $ANTLR start "rule__PropertyCommand__CondAssignment_0_2"
    // InternalSpec.g:2663:1: rule__PropertyCommand__CondAssignment_0_2 : ( ruleCondition ) ;
    public final void rule__PropertyCommand__CondAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2667:1: ( ( ruleCondition ) )
            // InternalSpec.g:2668:2: ( ruleCondition )
            {
            // InternalSpec.g:2668:2: ( ruleCondition )
            // InternalSpec.g:2669:3: ruleCondition
            {
             before(grammarAccess.getPropertyCommandAccess().getCondConditionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPropertyCommandAccess().getCondConditionParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__PropertyCommand__CondAssignment_0_2"


    // $ANTLR start "rule__PropertyCommand__ValAssignment_0_3"
    // InternalSpec.g:2678:1: rule__PropertyCommand__ValAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__PropertyCommand__ValAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2682:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2683:2: ( RULE_STRING )
            {
            // InternalSpec.g:2683:2: ( RULE_STRING )
            // InternalSpec.g:2684:3: RULE_STRING
            {
             before(grammarAccess.getPropertyCommandAccess().getValSTRINGTerminalRuleCall_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyCommandAccess().getValSTRINGTerminalRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__PropertyCommand__ValAssignment_0_3"


    // $ANTLR start "rule__PropertyCommand__PropAssignment_1_1"
    // InternalSpec.g:2693:1: rule__PropertyCommand__PropAssignment_1_1 : ( ruleProperty ) ;
    public final void rule__PropertyCommand__PropAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2697:1: ( ( ruleProperty ) )
            // InternalSpec.g:2698:2: ( ruleProperty )
            {
            // InternalSpec.g:2698:2: ( ruleProperty )
            // InternalSpec.g:2699:3: ruleProperty
            {
             before(grammarAccess.getPropertyCommandAccess().getPropPropertyParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyCommandAccess().getPropPropertyParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PropertyCommand__PropAssignment_1_1"


    // $ANTLR start "rule__PropertyCommand__CondAssignment_1_2"
    // InternalSpec.g:2708:1: rule__PropertyCommand__CondAssignment_1_2 : ( ruleCondition ) ;
    public final void rule__PropertyCommand__CondAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2712:1: ( ( ruleCondition ) )
            // InternalSpec.g:2713:2: ( ruleCondition )
            {
            // InternalSpec.g:2713:2: ( ruleCondition )
            // InternalSpec.g:2714:3: ruleCondition
            {
             before(grammarAccess.getPropertyCommandAccess().getCondConditionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPropertyCommandAccess().getCondConditionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__PropertyCommand__CondAssignment_1_2"


    // $ANTLR start "rule__PropertyCommand__VarAssignment_1_3"
    // InternalSpec.g:2723:1: rule__PropertyCommand__VarAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyCommand__VarAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2727:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2728:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2728:2: ( ( RULE_ID ) )
            // InternalSpec.g:2729:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyCommandAccess().getVarVariableCrossReference_1_3_0()); 
            // InternalSpec.g:2730:3: ( RULE_ID )
            // InternalSpec.g:2731:4: RULE_ID
            {
             before(grammarAccess.getPropertyCommandAccess().getVarVariableIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyCommandAccess().getVarVariableIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getPropertyCommandAccess().getVarVariableCrossReference_1_3_0()); 

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
    // $ANTLR end "rule__PropertyCommand__VarAssignment_1_3"


    // $ANTLR start "rule__TypeCommand__StrAssignment_0_1"
    // InternalSpec.g:2742:1: rule__TypeCommand__StrAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__TypeCommand__StrAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2746:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2747:2: ( RULE_STRING )
            {
            // InternalSpec.g:2747:2: ( RULE_STRING )
            // InternalSpec.g:2748:3: RULE_STRING
            {
             before(grammarAccess.getTypeCommandAccess().getStrSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypeCommandAccess().getStrSTRINGTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__TypeCommand__StrAssignment_0_1"


    // $ANTLR start "rule__TypeCommand__VarAssignment_1_1"
    // InternalSpec.g:2757:1: rule__TypeCommand__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeCommand__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2761:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2762:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2762:2: ( ( RULE_ID ) )
            // InternalSpec.g:2763:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeCommandAccess().getVarVariableCrossReference_1_1_0()); 
            // InternalSpec.g:2764:3: ( RULE_ID )
            // InternalSpec.g:2765:4: RULE_ID
            {
             before(grammarAccess.getTypeCommandAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeCommandAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getTypeCommandAccess().getVarVariableCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__TypeCommand__VarAssignment_1_1"


    // $ANTLR start "rule__SleepCommand__TimeAssignment_2"
    // InternalSpec.g:2776:1: rule__SleepCommand__TimeAssignment_2 : ( RULE_INT ) ;
    public final void rule__SleepCommand__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2780:1: ( ( RULE_INT ) )
            // InternalSpec.g:2781:2: ( RULE_INT )
            {
            // InternalSpec.g:2781:2: ( RULE_INT )
            // InternalSpec.g:2782:3: RULE_INT
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


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalSpec.g:2791:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2795:1: ( ( RULE_ID ) )
            // InternalSpec.g:2796:2: ( RULE_ID )
            {
            // InternalSpec.g:2796:2: ( RULE_ID )
            // InternalSpec.g:2797:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\2\uffff\5\4\2\uffff";
    static final String dfa_3s = "\1\25\2\uffff\5\10\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\5\uffff\1\3\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\3\uffff\1\1\10\uffff\1\3\1\4\1\5\1\6\1\7",
            "",
            "",
            "\1\11\3\uffff\1\10",
            "\1\11\3\uffff\1\10",
            "\1\11\3\uffff\1\10",
            "\1\11\3\uffff\1\10",
            "\1\11\3\uffff\1\10",
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
            return "587:1: rule__Selector__Alternatives : ( ( ( rule__Selector__VarAssignment_0 ) ) | ( ( rule__Selector__StrAssignment_1 ) ) | ( ( rule__Selector__Group_2__0 ) ) | ( ( rule__Selector__Group_3__0 ) ) );";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\40\1\14\3\41\1\42\1\4\1\42\2\uffff\1\4";
    static final String dfa_9s = "\1\40\1\16\3\41\1\43\1\10\1\42\2\uffff\1\10";
    static final String dfa_10s = "\10\uffff\1\2\1\1\1\uffff";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2\1\3\1\4",
            "\1\5",
            "\1\5",
            "\1\5",
            "\1\6\1\7",
            "\1\11\3\uffff\1\10",
            "\1\12",
            "",
            "",
            "\1\11\3\uffff\1\10"
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
            return "620:1: rule__PropertyCommand__Alternatives : ( ( ( rule__PropertyCommand__Group_0__0 ) ) | ( ( rule__PropertyCommand__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000031ACC000C2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003E0110L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_SL_COMMENT", "RULE_CUSTOM_COMMAND", "RULE_ID", "RULE_STRING", "RULE_UNQUOTED", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'text'", "'class'", "'value'", "'second'", "'seconds'", "'button'", "'element'", "'link'", "'input'", "'textarea'", "'Open'", "'$'", "'Click'", "'on'", "'at'", "'Within'", "'Select'", "'visible'", "'Store'", "'to'", "'be'", "'Remember'", "'as'", "'Property'", "'should'", "'not'", "'Type'", "'Sleep'", "'for'", "'{'", "','", "'}'"
    };
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

                if ( ((LA1_0>=RULE_SL_COMMENT && LA1_0<=RULE_CUSTOM_COMMAND)||LA1_0==23||LA1_0==25||(LA1_0>=28 && LA1_0<=29)||LA1_0==31||LA1_0==34||LA1_0==36||(LA1_0>=39 && LA1_0<=40)) ) {
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


    // $ANTLR start "entryRuleVariableOrValue"
    // InternalSpec.g:128:1: entryRuleVariableOrValue : ruleVariableOrValue EOF ;
    public final void entryRuleVariableOrValue() throws RecognitionException {
        try {
            // InternalSpec.g:129:1: ( ruleVariableOrValue EOF )
            // InternalSpec.g:130:1: ruleVariableOrValue EOF
            {
             before(grammarAccess.getVariableOrValueRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableOrValue();

            state._fsp--;

             after(grammarAccess.getVariableOrValueRule()); 
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
    // $ANTLR end "entryRuleVariableOrValue"


    // $ANTLR start "ruleVariableOrValue"
    // InternalSpec.g:137:1: ruleVariableOrValue : ( ( rule__VariableOrValue__Alternatives ) ) ;
    public final void ruleVariableOrValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:141:2: ( ( ( rule__VariableOrValue__Alternatives ) ) )
            // InternalSpec.g:142:2: ( ( rule__VariableOrValue__Alternatives ) )
            {
            // InternalSpec.g:142:2: ( ( rule__VariableOrValue__Alternatives ) )
            // InternalSpec.g:143:3: ( rule__VariableOrValue__Alternatives )
            {
             before(grammarAccess.getVariableOrValueAccess().getAlternatives()); 
            // InternalSpec.g:144:3: ( rule__VariableOrValue__Alternatives )
            // InternalSpec.g:144:4: rule__VariableOrValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableOrValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableOrValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVariableOrValue"


    // $ANTLR start "entryRuleClickCommand"
    // InternalSpec.g:153:1: entryRuleClickCommand : ruleClickCommand EOF ;
    public final void entryRuleClickCommand() throws RecognitionException {
        try {
            // InternalSpec.g:154:1: ( ruleClickCommand EOF )
            // InternalSpec.g:155:1: ruleClickCommand EOF
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
    // InternalSpec.g:162:1: ruleClickCommand : ( ( rule__ClickCommand__Alternatives ) ) ;
    public final void ruleClickCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:166:2: ( ( ( rule__ClickCommand__Alternatives ) ) )
            // InternalSpec.g:167:2: ( ( rule__ClickCommand__Alternatives ) )
            {
            // InternalSpec.g:167:2: ( ( rule__ClickCommand__Alternatives ) )
            // InternalSpec.g:168:3: ( rule__ClickCommand__Alternatives )
            {
             before(grammarAccess.getClickCommandAccess().getAlternatives()); 
            // InternalSpec.g:169:3: ( rule__ClickCommand__Alternatives )
            // InternalSpec.g:169:4: rule__ClickCommand__Alternatives
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


    // $ANTLR start "entryRuleSelector"
    // InternalSpec.g:203:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalSpec.g:204:1: ( ruleSelector EOF )
            // InternalSpec.g:205:1: ruleSelector EOF
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
    // InternalSpec.g:212:1: ruleSelector : ( ( rule__Selector__Alternatives ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:216:2: ( ( ( rule__Selector__Alternatives ) ) )
            // InternalSpec.g:217:2: ( ( rule__Selector__Alternatives ) )
            {
            // InternalSpec.g:217:2: ( ( rule__Selector__Alternatives ) )
            // InternalSpec.g:218:3: ( rule__Selector__Alternatives )
            {
             before(grammarAccess.getSelectorAccess().getAlternatives()); 
            // InternalSpec.g:219:3: ( rule__Selector__Alternatives )
            // InternalSpec.g:219:4: rule__Selector__Alternatives
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
    // InternalSpec.g:228:1: entryRuleStoreCommand : ruleStoreCommand EOF ;
    public final void entryRuleStoreCommand() throws RecognitionException {
        try {
            // InternalSpec.g:229:1: ( ruleStoreCommand EOF )
            // InternalSpec.g:230:1: ruleStoreCommand EOF
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
    // InternalSpec.g:237:1: ruleStoreCommand : ( ( rule__StoreCommand__Group__0 ) ) ;
    public final void ruleStoreCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:241:2: ( ( ( rule__StoreCommand__Group__0 ) ) )
            // InternalSpec.g:242:2: ( ( rule__StoreCommand__Group__0 ) )
            {
            // InternalSpec.g:242:2: ( ( rule__StoreCommand__Group__0 ) )
            // InternalSpec.g:243:3: ( rule__StoreCommand__Group__0 )
            {
             before(grammarAccess.getStoreCommandAccess().getGroup()); 
            // InternalSpec.g:244:3: ( rule__StoreCommand__Group__0 )
            // InternalSpec.g:244:4: rule__StoreCommand__Group__0
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
    // InternalSpec.g:253:1: entryRuleRememberCommand : ruleRememberCommand EOF ;
    public final void entryRuleRememberCommand() throws RecognitionException {
        try {
            // InternalSpec.g:254:1: ( ruleRememberCommand EOF )
            // InternalSpec.g:255:1: ruleRememberCommand EOF
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
    // InternalSpec.g:262:1: ruleRememberCommand : ( ( rule__RememberCommand__Group__0 ) ) ;
    public final void ruleRememberCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:266:2: ( ( ( rule__RememberCommand__Group__0 ) ) )
            // InternalSpec.g:267:2: ( ( rule__RememberCommand__Group__0 ) )
            {
            // InternalSpec.g:267:2: ( ( rule__RememberCommand__Group__0 ) )
            // InternalSpec.g:268:3: ( rule__RememberCommand__Group__0 )
            {
             before(grammarAccess.getRememberCommandAccess().getGroup()); 
            // InternalSpec.g:269:3: ( rule__RememberCommand__Group__0 )
            // InternalSpec.g:269:4: rule__RememberCommand__Group__0
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
    // InternalSpec.g:278:1: entryRulePropertyCommand : rulePropertyCommand EOF ;
    public final void entryRulePropertyCommand() throws RecognitionException {
        try {
            // InternalSpec.g:279:1: ( rulePropertyCommand EOF )
            // InternalSpec.g:280:1: rulePropertyCommand EOF
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
    // InternalSpec.g:287:1: rulePropertyCommand : ( ( rule__PropertyCommand__Group__0 ) ) ;
    public final void rulePropertyCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:291:2: ( ( ( rule__PropertyCommand__Group__0 ) ) )
            // InternalSpec.g:292:2: ( ( rule__PropertyCommand__Group__0 ) )
            {
            // InternalSpec.g:292:2: ( ( rule__PropertyCommand__Group__0 ) )
            // InternalSpec.g:293:3: ( rule__PropertyCommand__Group__0 )
            {
             before(grammarAccess.getPropertyCommandAccess().getGroup()); 
            // InternalSpec.g:294:3: ( rule__PropertyCommand__Group__0 )
            // InternalSpec.g:294:4: rule__PropertyCommand__Group__0
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


    // $ANTLR start "entryRuleProperty"
    // InternalSpec.g:303:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalSpec.g:304:1: ( ruleProperty EOF )
            // InternalSpec.g:305:1: ruleProperty EOF
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
    // InternalSpec.g:312:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:316:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalSpec.g:317:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalSpec.g:317:2: ( ( rule__Property__Alternatives ) )
            // InternalSpec.g:318:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalSpec.g:319:3: ( rule__Property__Alternatives )
            // InternalSpec.g:319:4: rule__Property__Alternatives
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
    // InternalSpec.g:328:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalSpec.g:329:1: ( ruleCondition EOF )
            // InternalSpec.g:330:1: ruleCondition EOF
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
    // InternalSpec.g:337:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:341:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalSpec.g:342:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalSpec.g:342:2: ( ( rule__Condition__Alternatives ) )
            // InternalSpec.g:343:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalSpec.g:344:3: ( rule__Condition__Alternatives )
            // InternalSpec.g:344:4: rule__Condition__Alternatives
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
    // InternalSpec.g:353:1: entryRuleTypeCommand : ruleTypeCommand EOF ;
    public final void entryRuleTypeCommand() throws RecognitionException {
        try {
            // InternalSpec.g:354:1: ( ruleTypeCommand EOF )
            // InternalSpec.g:355:1: ruleTypeCommand EOF
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
    // InternalSpec.g:362:1: ruleTypeCommand : ( ( rule__TypeCommand__Group__0 ) ) ;
    public final void ruleTypeCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:366:2: ( ( ( rule__TypeCommand__Group__0 ) ) )
            // InternalSpec.g:367:2: ( ( rule__TypeCommand__Group__0 ) )
            {
            // InternalSpec.g:367:2: ( ( rule__TypeCommand__Group__0 ) )
            // InternalSpec.g:368:3: ( rule__TypeCommand__Group__0 )
            {
             before(grammarAccess.getTypeCommandAccess().getGroup()); 
            // InternalSpec.g:369:3: ( rule__TypeCommand__Group__0 )
            // InternalSpec.g:369:4: rule__TypeCommand__Group__0
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
    // InternalSpec.g:378:1: entryRuleSleepCommand : ruleSleepCommand EOF ;
    public final void entryRuleSleepCommand() throws RecognitionException {
        try {
            // InternalSpec.g:379:1: ( ruleSleepCommand EOF )
            // InternalSpec.g:380:1: ruleSleepCommand EOF
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
    // InternalSpec.g:387:1: ruleSleepCommand : ( ( rule__SleepCommand__Group__0 ) ) ;
    public final void ruleSleepCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:391:2: ( ( ( rule__SleepCommand__Group__0 ) ) )
            // InternalSpec.g:392:2: ( ( rule__SleepCommand__Group__0 ) )
            {
            // InternalSpec.g:392:2: ( ( rule__SleepCommand__Group__0 ) )
            // InternalSpec.g:393:3: ( rule__SleepCommand__Group__0 )
            {
             before(grammarAccess.getSleepCommandAccess().getGroup()); 
            // InternalSpec.g:394:3: ( rule__SleepCommand__Group__0 )
            // InternalSpec.g:394:4: rule__SleepCommand__Group__0
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
    // InternalSpec.g:403:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalSpec.g:404:1: ( rulePoint EOF )
            // InternalSpec.g:405:1: rulePoint EOF
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
    // InternalSpec.g:412:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:416:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalSpec.g:417:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalSpec.g:417:2: ( ( rule__Point__Group__0 ) )
            // InternalSpec.g:418:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalSpec.g:419:3: ( rule__Point__Group__0 )
            // InternalSpec.g:419:4: rule__Point__Group__0
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


    // $ANTLR start "entryRuleElementInScreen"
    // InternalSpec.g:428:1: entryRuleElementInScreen : ruleElementInScreen EOF ;
    public final void entryRuleElementInScreen() throws RecognitionException {
        try {
            // InternalSpec.g:429:1: ( ruleElementInScreen EOF )
            // InternalSpec.g:430:1: ruleElementInScreen EOF
            {
             before(grammarAccess.getElementInScreenRule()); 
            pushFollow(FOLLOW_1);
            ruleElementInScreen();

            state._fsp--;

             after(grammarAccess.getElementInScreenRule()); 
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
    // $ANTLR end "entryRuleElementInScreen"


    // $ANTLR start "ruleElementInScreen"
    // InternalSpec.g:437:1: ruleElementInScreen : ( ( rule__ElementInScreen__ElementAssignment ) ) ;
    public final void ruleElementInScreen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:441:2: ( ( ( rule__ElementInScreen__ElementAssignment ) ) )
            // InternalSpec.g:442:2: ( ( rule__ElementInScreen__ElementAssignment ) )
            {
            // InternalSpec.g:442:2: ( ( rule__ElementInScreen__ElementAssignment ) )
            // InternalSpec.g:443:3: ( rule__ElementInScreen__ElementAssignment )
            {
             before(grammarAccess.getElementInScreenAccess().getElementAssignment()); 
            // InternalSpec.g:444:3: ( rule__ElementInScreen__ElementAssignment )
            // InternalSpec.g:444:4: rule__ElementInScreen__ElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ElementInScreen__ElementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getElementInScreenAccess().getElementAssignment()); 

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
    // $ANTLR end "ruleElementInScreen"


    // $ANTLR start "entryRuleVariable"
    // InternalSpec.g:453:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalSpec.g:454:1: ( ruleVariable EOF )
            // InternalSpec.g:455:1: ruleVariable EOF
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
    // InternalSpec.g:462:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:466:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalSpec.g:467:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalSpec.g:467:2: ( ( rule__Variable__Group__0 ) )
            // InternalSpec.g:468:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalSpec.g:469:3: ( rule__Variable__Group__0 )
            // InternalSpec.g:469:4: rule__Variable__Group__0
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
    // InternalSpec.g:478:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:482:1: ( ( ( rule__ElementType__Alternatives ) ) )
            // InternalSpec.g:483:2: ( ( rule__ElementType__Alternatives ) )
            {
            // InternalSpec.g:483:2: ( ( rule__ElementType__Alternatives ) )
            // InternalSpec.g:484:3: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // InternalSpec.g:485:3: ( rule__ElementType__Alternatives )
            // InternalSpec.g:485:4: rule__ElementType__Alternatives
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
    // InternalSpec.g:493:1: rule__Command__Alternatives : ( ( ruleOpenCommand ) | ( ruleClickCommand ) | ( ruleStoreCommand ) | ( ruleSelectCommand ) | ( ruleRememberCommand ) | ( rulePropertyCommand ) | ( ruleTypeCommand ) | ( ruleSleepCommand ) | ( ( rule__Command__CommentAssignment_8 ) ) | ( ( rule__Command__CustomAssignment_9 ) ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:497:1: ( ( ruleOpenCommand ) | ( ruleClickCommand ) | ( ruleStoreCommand ) | ( ruleSelectCommand ) | ( ruleRememberCommand ) | ( rulePropertyCommand ) | ( ruleTypeCommand ) | ( ruleSleepCommand ) | ( ( rule__Command__CommentAssignment_8 ) ) | ( ( rule__Command__CustomAssignment_9 ) ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            case 28:
            case 29:
                {
                alt2=4;
                }
                break;
            case 34:
                {
                alt2=5;
                }
                break;
            case 36:
                {
                alt2=6;
                }
                break;
            case 39:
                {
                alt2=7;
                }
                break;
            case 40:
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
                    // InternalSpec.g:498:2: ( ruleOpenCommand )
                    {
                    // InternalSpec.g:498:2: ( ruleOpenCommand )
                    // InternalSpec.g:499:3: ruleOpenCommand
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
                    // InternalSpec.g:504:2: ( ruleClickCommand )
                    {
                    // InternalSpec.g:504:2: ( ruleClickCommand )
                    // InternalSpec.g:505:3: ruleClickCommand
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
                    // InternalSpec.g:510:2: ( ruleStoreCommand )
                    {
                    // InternalSpec.g:510:2: ( ruleStoreCommand )
                    // InternalSpec.g:511:3: ruleStoreCommand
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
                    // InternalSpec.g:516:2: ( ruleSelectCommand )
                    {
                    // InternalSpec.g:516:2: ( ruleSelectCommand )
                    // InternalSpec.g:517:3: ruleSelectCommand
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
                    // InternalSpec.g:522:2: ( ruleRememberCommand )
                    {
                    // InternalSpec.g:522:2: ( ruleRememberCommand )
                    // InternalSpec.g:523:3: ruleRememberCommand
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
                    // InternalSpec.g:528:2: ( rulePropertyCommand )
                    {
                    // InternalSpec.g:528:2: ( rulePropertyCommand )
                    // InternalSpec.g:529:3: rulePropertyCommand
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
                    // InternalSpec.g:534:2: ( ruleTypeCommand )
                    {
                    // InternalSpec.g:534:2: ( ruleTypeCommand )
                    // InternalSpec.g:535:3: ruleTypeCommand
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
                    // InternalSpec.g:540:2: ( ruleSleepCommand )
                    {
                    // InternalSpec.g:540:2: ( ruleSleepCommand )
                    // InternalSpec.g:541:3: ruleSleepCommand
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
                    // InternalSpec.g:546:2: ( ( rule__Command__CommentAssignment_8 ) )
                    {
                    // InternalSpec.g:546:2: ( ( rule__Command__CommentAssignment_8 ) )
                    // InternalSpec.g:547:3: ( rule__Command__CommentAssignment_8 )
                    {
                     before(grammarAccess.getCommandAccess().getCommentAssignment_8()); 
                    // InternalSpec.g:548:3: ( rule__Command__CommentAssignment_8 )
                    // InternalSpec.g:548:4: rule__Command__CommentAssignment_8
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
                    // InternalSpec.g:552:2: ( ( rule__Command__CustomAssignment_9 ) )
                    {
                    // InternalSpec.g:552:2: ( ( rule__Command__CustomAssignment_9 ) )
                    // InternalSpec.g:553:3: ( rule__Command__CustomAssignment_9 )
                    {
                     before(grammarAccess.getCommandAccess().getCustomAssignment_9()); 
                    // InternalSpec.g:554:3: ( rule__Command__CustomAssignment_9 )
                    // InternalSpec.g:554:4: rule__Command__CustomAssignment_9
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


    // $ANTLR start "rule__VariableOrValue__Alternatives"
    // InternalSpec.g:562:1: rule__VariableOrValue__Alternatives : ( ( ( rule__VariableOrValue__Group_0__0 ) ) | ( ( rule__VariableOrValue__ValAssignment_1 ) ) | ( ( rule__VariableOrValue__ElementAssignment_2 ) ) );
    public final void rule__VariableOrValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:566:1: ( ( ( rule__VariableOrValue__Group_0__0 ) ) | ( ( rule__VariableOrValue__ValAssignment_1 ) ) | ( ( rule__VariableOrValue__ElementAssignment_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 24:
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
                    // InternalSpec.g:567:2: ( ( rule__VariableOrValue__Group_0__0 ) )
                    {
                    // InternalSpec.g:567:2: ( ( rule__VariableOrValue__Group_0__0 ) )
                    // InternalSpec.g:568:3: ( rule__VariableOrValue__Group_0__0 )
                    {
                     before(grammarAccess.getVariableOrValueAccess().getGroup_0()); 
                    // InternalSpec.g:569:3: ( rule__VariableOrValue__Group_0__0 )
                    // InternalSpec.g:569:4: rule__VariableOrValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableOrValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableOrValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:573:2: ( ( rule__VariableOrValue__ValAssignment_1 ) )
                    {
                    // InternalSpec.g:573:2: ( ( rule__VariableOrValue__ValAssignment_1 ) )
                    // InternalSpec.g:574:3: ( rule__VariableOrValue__ValAssignment_1 )
                    {
                     before(grammarAccess.getVariableOrValueAccess().getValAssignment_1()); 
                    // InternalSpec.g:575:3: ( rule__VariableOrValue__ValAssignment_1 )
                    // InternalSpec.g:575:4: rule__VariableOrValue__ValAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableOrValue__ValAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableOrValueAccess().getValAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:579:2: ( ( rule__VariableOrValue__ElementAssignment_2 ) )
                    {
                    // InternalSpec.g:579:2: ( ( rule__VariableOrValue__ElementAssignment_2 ) )
                    // InternalSpec.g:580:3: ( rule__VariableOrValue__ElementAssignment_2 )
                    {
                     before(grammarAccess.getVariableOrValueAccess().getElementAssignment_2()); 
                    // InternalSpec.g:581:3: ( rule__VariableOrValue__ElementAssignment_2 )
                    // InternalSpec.g:581:4: rule__VariableOrValue__ElementAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableOrValue__ElementAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableOrValueAccess().getElementAssignment_2()); 

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
    // $ANTLR end "rule__VariableOrValue__Alternatives"


    // $ANTLR start "rule__ClickCommand__Alternatives"
    // InternalSpec.g:589:1: rule__ClickCommand__Alternatives : ( ( ( rule__ClickCommand__CmdAssignment_0 ) ) | ( ( rule__ClickCommand__Group_1__0 ) ) | ( ( rule__ClickCommand__Group_2__0 ) ) );
    public final void rule__ClickCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:593:1: ( ( ( rule__ClickCommand__CmdAssignment_0 ) ) | ( ( rule__ClickCommand__Group_1__0 ) ) | ( ( rule__ClickCommand__Group_2__0 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt4=2;
                    }
                    break;
                case 27:
                    {
                    alt4=3;
                    }
                    break;
                case EOF:
                case RULE_SL_COMMENT:
                case RULE_CUSTOM_COMMAND:
                case 23:
                case 25:
                case 28:
                case 29:
                case 31:
                case 34:
                case 36:
                case 39:
                case 40:
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
                    // InternalSpec.g:594:2: ( ( rule__ClickCommand__CmdAssignment_0 ) )
                    {
                    // InternalSpec.g:594:2: ( ( rule__ClickCommand__CmdAssignment_0 ) )
                    // InternalSpec.g:595:3: ( rule__ClickCommand__CmdAssignment_0 )
                    {
                     before(grammarAccess.getClickCommandAccess().getCmdAssignment_0()); 
                    // InternalSpec.g:596:3: ( rule__ClickCommand__CmdAssignment_0 )
                    // InternalSpec.g:596:4: rule__ClickCommand__CmdAssignment_0
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
                    // InternalSpec.g:600:2: ( ( rule__ClickCommand__Group_1__0 ) )
                    {
                    // InternalSpec.g:600:2: ( ( rule__ClickCommand__Group_1__0 ) )
                    // InternalSpec.g:601:3: ( rule__ClickCommand__Group_1__0 )
                    {
                     before(grammarAccess.getClickCommandAccess().getGroup_1()); 
                    // InternalSpec.g:602:3: ( rule__ClickCommand__Group_1__0 )
                    // InternalSpec.g:602:4: rule__ClickCommand__Group_1__0
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
                    // InternalSpec.g:606:2: ( ( rule__ClickCommand__Group_2__0 ) )
                    {
                    // InternalSpec.g:606:2: ( ( rule__ClickCommand__Group_2__0 ) )
                    // InternalSpec.g:607:3: ( rule__ClickCommand__Group_2__0 )
                    {
                     before(grammarAccess.getClickCommandAccess().getGroup_2()); 
                    // InternalSpec.g:608:3: ( rule__ClickCommand__Group_2__0 )
                    // InternalSpec.g:608:4: rule__ClickCommand__Group_2__0
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
    // InternalSpec.g:616:1: rule__SelectCommand__Alternatives : ( ( ( rule__SelectCommand__Group_0__0 ) ) | ( ( rule__SelectCommand__Group_1__0 ) ) | ( ( rule__SelectCommand__Group_2__0 ) ) );
    public final void rule__SelectCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:620:1: ( ( ( rule__SelectCommand__Group_0__0 ) ) | ( ( rule__SelectCommand__Group_1__0 ) ) | ( ( rule__SelectCommand__Group_2__0 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==30) ) {
                    alt5=3;
                }
                else if ( ((LA5_2>=RULE_ID && LA5_2<=RULE_STRING)||(LA5_2>=18 && LA5_2<=22)||LA5_2==24) ) {
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
                    // InternalSpec.g:621:2: ( ( rule__SelectCommand__Group_0__0 ) )
                    {
                    // InternalSpec.g:621:2: ( ( rule__SelectCommand__Group_0__0 ) )
                    // InternalSpec.g:622:3: ( rule__SelectCommand__Group_0__0 )
                    {
                     before(grammarAccess.getSelectCommandAccess().getGroup_0()); 
                    // InternalSpec.g:623:3: ( rule__SelectCommand__Group_0__0 )
                    // InternalSpec.g:623:4: rule__SelectCommand__Group_0__0
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
                    // InternalSpec.g:627:2: ( ( rule__SelectCommand__Group_1__0 ) )
                    {
                    // InternalSpec.g:627:2: ( ( rule__SelectCommand__Group_1__0 ) )
                    // InternalSpec.g:628:3: ( rule__SelectCommand__Group_1__0 )
                    {
                     before(grammarAccess.getSelectCommandAccess().getGroup_1()); 
                    // InternalSpec.g:629:3: ( rule__SelectCommand__Group_1__0 )
                    // InternalSpec.g:629:4: rule__SelectCommand__Group_1__0
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
                    // InternalSpec.g:633:2: ( ( rule__SelectCommand__Group_2__0 ) )
                    {
                    // InternalSpec.g:633:2: ( ( rule__SelectCommand__Group_2__0 ) )
                    // InternalSpec.g:634:3: ( rule__SelectCommand__Group_2__0 )
                    {
                     before(grammarAccess.getSelectCommandAccess().getGroup_2()); 
                    // InternalSpec.g:635:3: ( rule__SelectCommand__Group_2__0 )
                    // InternalSpec.g:635:4: rule__SelectCommand__Group_2__0
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
    // InternalSpec.g:643:1: rule__Selector__Alternatives : ( ( ( rule__Selector__VarAssignment_0 ) ) | ( ( rule__Selector__Group_1__0 ) ) );
    public final void rule__Selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:647:1: ( ( ( rule__Selector__VarAssignment_0 ) ) | ( ( rule__Selector__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||LA6_0==24) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=18 && LA6_0<=22)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpec.g:648:2: ( ( rule__Selector__VarAssignment_0 ) )
                    {
                    // InternalSpec.g:648:2: ( ( rule__Selector__VarAssignment_0 ) )
                    // InternalSpec.g:649:3: ( rule__Selector__VarAssignment_0 )
                    {
                     before(grammarAccess.getSelectorAccess().getVarAssignment_0()); 
                    // InternalSpec.g:650:3: ( rule__Selector__VarAssignment_0 )
                    // InternalSpec.g:650:4: rule__Selector__VarAssignment_0
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
                    // InternalSpec.g:654:2: ( ( rule__Selector__Group_1__0 ) )
                    {
                    // InternalSpec.g:654:2: ( ( rule__Selector__Group_1__0 ) )
                    // InternalSpec.g:655:3: ( rule__Selector__Group_1__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_1()); 
                    // InternalSpec.g:656:3: ( rule__Selector__Group_1__0 )
                    // InternalSpec.g:656:4: rule__Selector__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Property__Alternatives"
    // InternalSpec.g:664:1: rule__Property__Alternatives : ( ( 'text' ) | ( 'class' ) | ( 'value' ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:668:1: ( ( 'text' ) | ( 'class' ) | ( 'value' ) )
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
                    // InternalSpec.g:669:2: ( 'text' )
                    {
                    // InternalSpec.g:669:2: ( 'text' )
                    // InternalSpec.g:670:3: 'text'
                    {
                     before(grammarAccess.getPropertyAccess().getTextKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPropertyAccess().getTextKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:675:2: ( 'class' )
                    {
                    // InternalSpec.g:675:2: ( 'class' )
                    // InternalSpec.g:676:3: 'class'
                    {
                     before(grammarAccess.getPropertyAccess().getClassKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPropertyAccess().getClassKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:681:2: ( 'value' )
                    {
                    // InternalSpec.g:681:2: ( 'value' )
                    // InternalSpec.g:682:3: 'value'
                    {
                     before(grammarAccess.getPropertyAccess().getValueKeyword_2()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalSpec.g:691:1: rule__Condition__Alternatives : ( ( ( rule__Condition__Group_0__0 ) ) | ( ( rule__Condition__Group_1__0 ) ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:695:1: ( ( ( rule__Condition__Group_0__0 ) ) | ( ( rule__Condition__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==37) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==38) ) {
                    alt8=2;
                }
                else if ( (LA8_1==33) ) {
                    alt8=1;
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
                    // InternalSpec.g:696:2: ( ( rule__Condition__Group_0__0 ) )
                    {
                    // InternalSpec.g:696:2: ( ( rule__Condition__Group_0__0 ) )
                    // InternalSpec.g:697:3: ( rule__Condition__Group_0__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0()); 
                    // InternalSpec.g:698:3: ( rule__Condition__Group_0__0 )
                    // InternalSpec.g:698:4: rule__Condition__Group_0__0
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
                    // InternalSpec.g:702:2: ( ( rule__Condition__Group_1__0 ) )
                    {
                    // InternalSpec.g:702:2: ( ( rule__Condition__Group_1__0 ) )
                    // InternalSpec.g:703:3: ( rule__Condition__Group_1__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_1()); 
                    // InternalSpec.g:704:3: ( rule__Condition__Group_1__0 )
                    // InternalSpec.g:704:4: rule__Condition__Group_1__0
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


    // $ANTLR start "rule__SleepCommand__Alternatives_3"
    // InternalSpec.g:712:1: rule__SleepCommand__Alternatives_3 : ( ( 'second' ) | ( 'seconds' ) );
    public final void rule__SleepCommand__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:716:1: ( ( 'second' ) | ( 'seconds' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpec.g:717:2: ( 'second' )
                    {
                    // InternalSpec.g:717:2: ( 'second' )
                    // InternalSpec.g:718:3: 'second'
                    {
                     before(grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:723:2: ( 'seconds' )
                    {
                    // InternalSpec.g:723:2: ( 'seconds' )
                    // InternalSpec.g:724:3: 'seconds'
                    {
                     before(grammarAccess.getSleepCommandAccess().getSecondsKeyword_3_1()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalSpec.g:733:1: rule__ElementType__Alternatives : ( ( ( 'button' ) ) | ( ( 'element' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) | ( ( 'textarea' ) ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:737:1: ( ( ( 'button' ) ) | ( ( 'element' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) | ( ( 'textarea' ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            case 21:
                {
                alt10=4;
                }
                break;
            case 22:
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
                    // InternalSpec.g:738:2: ( ( 'button' ) )
                    {
                    // InternalSpec.g:738:2: ( ( 'button' ) )
                    // InternalSpec.g:739:3: ( 'button' )
                    {
                     before(grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0()); 
                    // InternalSpec.g:740:3: ( 'button' )
                    // InternalSpec.g:740:4: 'button'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:744:2: ( ( 'element' ) )
                    {
                    // InternalSpec.g:744:2: ( ( 'element' ) )
                    // InternalSpec.g:745:3: ( 'element' )
                    {
                     before(grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:746:3: ( 'element' )
                    // InternalSpec.g:746:4: 'element'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:750:2: ( ( 'link' ) )
                    {
                    // InternalSpec.g:750:2: ( ( 'link' ) )
                    // InternalSpec.g:751:3: ( 'link' )
                    {
                     before(grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2()); 
                    // InternalSpec.g:752:3: ( 'link' )
                    // InternalSpec.g:752:4: 'link'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:756:2: ( ( 'input' ) )
                    {
                    // InternalSpec.g:756:2: ( ( 'input' ) )
                    // InternalSpec.g:757:3: ( 'input' )
                    {
                     before(grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3()); 
                    // InternalSpec.g:758:3: ( 'input' )
                    // InternalSpec.g:758:4: 'input'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:762:2: ( ( 'textarea' ) )
                    {
                    // InternalSpec.g:762:2: ( ( 'textarea' ) )
                    // InternalSpec.g:763:3: ( 'textarea' )
                    {
                     before(grammarAccess.getElementTypeAccess().getTextareaEnumLiteralDeclaration_4()); 
                    // InternalSpec.g:764:3: ( 'textarea' )
                    // InternalSpec.g:764:4: 'textarea'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalSpec.g:772:1: rule__OpenCommand__Group__0 : rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1 ;
    public final void rule__OpenCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:776:1: ( rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1 )
            // InternalSpec.g:777:2: rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1
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
    // InternalSpec.g:784:1: rule__OpenCommand__Group__0__Impl : ( 'Open' ) ;
    public final void rule__OpenCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:788:1: ( ( 'Open' ) )
            // InternalSpec.g:789:1: ( 'Open' )
            {
            // InternalSpec.g:789:1: ( 'Open' )
            // InternalSpec.g:790:2: 'Open'
            {
             before(grammarAccess.getOpenCommandAccess().getOpenKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSpec.g:799:1: rule__OpenCommand__Group__1 : rule__OpenCommand__Group__1__Impl ;
    public final void rule__OpenCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:803:1: ( rule__OpenCommand__Group__1__Impl )
            // InternalSpec.g:804:2: rule__OpenCommand__Group__1__Impl
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
    // InternalSpec.g:810:1: rule__OpenCommand__Group__1__Impl : ( ( rule__OpenCommand__ValueAssignment_1 ) ) ;
    public final void rule__OpenCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:814:1: ( ( ( rule__OpenCommand__ValueAssignment_1 ) ) )
            // InternalSpec.g:815:1: ( ( rule__OpenCommand__ValueAssignment_1 ) )
            {
            // InternalSpec.g:815:1: ( ( rule__OpenCommand__ValueAssignment_1 ) )
            // InternalSpec.g:816:2: ( rule__OpenCommand__ValueAssignment_1 )
            {
             before(grammarAccess.getOpenCommandAccess().getValueAssignment_1()); 
            // InternalSpec.g:817:2: ( rule__OpenCommand__ValueAssignment_1 )
            // InternalSpec.g:817:3: rule__OpenCommand__ValueAssignment_1
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


    // $ANTLR start "rule__VariableOrValue__Group_0__0"
    // InternalSpec.g:826:1: rule__VariableOrValue__Group_0__0 : rule__VariableOrValue__Group_0__0__Impl rule__VariableOrValue__Group_0__1 ;
    public final void rule__VariableOrValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:830:1: ( rule__VariableOrValue__Group_0__0__Impl rule__VariableOrValue__Group_0__1 )
            // InternalSpec.g:831:2: rule__VariableOrValue__Group_0__0__Impl rule__VariableOrValue__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__VariableOrValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableOrValue__Group_0__1();

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
    // $ANTLR end "rule__VariableOrValue__Group_0__0"


    // $ANTLR start "rule__VariableOrValue__Group_0__0__Impl"
    // InternalSpec.g:838:1: rule__VariableOrValue__Group_0__0__Impl : ( '$' ) ;
    public final void rule__VariableOrValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:842:1: ( ( '$' ) )
            // InternalSpec.g:843:1: ( '$' )
            {
            // InternalSpec.g:843:1: ( '$' )
            // InternalSpec.g:844:2: '$'
            {
             before(grammarAccess.getVariableOrValueAccess().getDollarSignKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVariableOrValueAccess().getDollarSignKeyword_0_0()); 

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
    // $ANTLR end "rule__VariableOrValue__Group_0__0__Impl"


    // $ANTLR start "rule__VariableOrValue__Group_0__1"
    // InternalSpec.g:853:1: rule__VariableOrValue__Group_0__1 : rule__VariableOrValue__Group_0__1__Impl ;
    public final void rule__VariableOrValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:857:1: ( rule__VariableOrValue__Group_0__1__Impl )
            // InternalSpec.g:858:2: rule__VariableOrValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableOrValue__Group_0__1__Impl();

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
    // $ANTLR end "rule__VariableOrValue__Group_0__1"


    // $ANTLR start "rule__VariableOrValue__Group_0__1__Impl"
    // InternalSpec.g:864:1: rule__VariableOrValue__Group_0__1__Impl : ( ( rule__VariableOrValue__VarAssignment_0_1 ) ) ;
    public final void rule__VariableOrValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:868:1: ( ( ( rule__VariableOrValue__VarAssignment_0_1 ) ) )
            // InternalSpec.g:869:1: ( ( rule__VariableOrValue__VarAssignment_0_1 ) )
            {
            // InternalSpec.g:869:1: ( ( rule__VariableOrValue__VarAssignment_0_1 ) )
            // InternalSpec.g:870:2: ( rule__VariableOrValue__VarAssignment_0_1 )
            {
             before(grammarAccess.getVariableOrValueAccess().getVarAssignment_0_1()); 
            // InternalSpec.g:871:2: ( rule__VariableOrValue__VarAssignment_0_1 )
            // InternalSpec.g:871:3: rule__VariableOrValue__VarAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableOrValue__VarAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableOrValueAccess().getVarAssignment_0_1()); 

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
    // $ANTLR end "rule__VariableOrValue__Group_0__1__Impl"


    // $ANTLR start "rule__ClickCommand__Group_1__0"
    // InternalSpec.g:880:1: rule__ClickCommand__Group_1__0 : rule__ClickCommand__Group_1__0__Impl rule__ClickCommand__Group_1__1 ;
    public final void rule__ClickCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:884:1: ( rule__ClickCommand__Group_1__0__Impl rule__ClickCommand__Group_1__1 )
            // InternalSpec.g:885:2: rule__ClickCommand__Group_1__0__Impl rule__ClickCommand__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSpec.g:892:1: rule__ClickCommand__Group_1__0__Impl : ( 'Click' ) ;
    public final void rule__ClickCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:896:1: ( ( 'Click' ) )
            // InternalSpec.g:897:1: ( 'Click' )
            {
            // InternalSpec.g:897:1: ( 'Click' )
            // InternalSpec.g:898:2: 'Click'
            {
             before(grammarAccess.getClickCommandAccess().getClickKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSpec.g:907:1: rule__ClickCommand__Group_1__1 : rule__ClickCommand__Group_1__1__Impl rule__ClickCommand__Group_1__2 ;
    public final void rule__ClickCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:911:1: ( rule__ClickCommand__Group_1__1__Impl rule__ClickCommand__Group_1__2 )
            // InternalSpec.g:912:2: rule__ClickCommand__Group_1__1__Impl rule__ClickCommand__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSpec.g:919:1: rule__ClickCommand__Group_1__1__Impl : ( 'on' ) ;
    public final void rule__ClickCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:923:1: ( ( 'on' ) )
            // InternalSpec.g:924:1: ( 'on' )
            {
            // InternalSpec.g:924:1: ( 'on' )
            // InternalSpec.g:925:2: 'on'
            {
             before(grammarAccess.getClickCommandAccess().getOnKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSpec.g:934:1: rule__ClickCommand__Group_1__2 : rule__ClickCommand__Group_1__2__Impl ;
    public final void rule__ClickCommand__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:938:1: ( rule__ClickCommand__Group_1__2__Impl )
            // InternalSpec.g:939:2: rule__ClickCommand__Group_1__2__Impl
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
    // InternalSpec.g:945:1: rule__ClickCommand__Group_1__2__Impl : ( ( rule__ClickCommand__SelectorAssignment_1_2 ) ) ;
    public final void rule__ClickCommand__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:949:1: ( ( ( rule__ClickCommand__SelectorAssignment_1_2 ) ) )
            // InternalSpec.g:950:1: ( ( rule__ClickCommand__SelectorAssignment_1_2 ) )
            {
            // InternalSpec.g:950:1: ( ( rule__ClickCommand__SelectorAssignment_1_2 ) )
            // InternalSpec.g:951:2: ( rule__ClickCommand__SelectorAssignment_1_2 )
            {
             before(grammarAccess.getClickCommandAccess().getSelectorAssignment_1_2()); 
            // InternalSpec.g:952:2: ( rule__ClickCommand__SelectorAssignment_1_2 )
            // InternalSpec.g:952:3: rule__ClickCommand__SelectorAssignment_1_2
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
    // InternalSpec.g:961:1: rule__ClickCommand__Group_2__0 : rule__ClickCommand__Group_2__0__Impl rule__ClickCommand__Group_2__1 ;
    public final void rule__ClickCommand__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:965:1: ( rule__ClickCommand__Group_2__0__Impl rule__ClickCommand__Group_2__1 )
            // InternalSpec.g:966:2: rule__ClickCommand__Group_2__0__Impl rule__ClickCommand__Group_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSpec.g:973:1: rule__ClickCommand__Group_2__0__Impl : ( 'Click' ) ;
    public final void rule__ClickCommand__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:977:1: ( ( 'Click' ) )
            // InternalSpec.g:978:1: ( 'Click' )
            {
            // InternalSpec.g:978:1: ( 'Click' )
            // InternalSpec.g:979:2: 'Click'
            {
             before(grammarAccess.getClickCommandAccess().getClickKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSpec.g:988:1: rule__ClickCommand__Group_2__1 : rule__ClickCommand__Group_2__1__Impl rule__ClickCommand__Group_2__2 ;
    public final void rule__ClickCommand__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:992:1: ( rule__ClickCommand__Group_2__1__Impl rule__ClickCommand__Group_2__2 )
            // InternalSpec.g:993:2: rule__ClickCommand__Group_2__1__Impl rule__ClickCommand__Group_2__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSpec.g:1000:1: rule__ClickCommand__Group_2__1__Impl : ( 'at' ) ;
    public final void rule__ClickCommand__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1004:1: ( ( 'at' ) )
            // InternalSpec.g:1005:1: ( 'at' )
            {
            // InternalSpec.g:1005:1: ( 'at' )
            // InternalSpec.g:1006:2: 'at'
            {
             before(grammarAccess.getClickCommandAccess().getAtKeyword_2_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSpec.g:1015:1: rule__ClickCommand__Group_2__2 : rule__ClickCommand__Group_2__2__Impl ;
    public final void rule__ClickCommand__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1019:1: ( rule__ClickCommand__Group_2__2__Impl )
            // InternalSpec.g:1020:2: rule__ClickCommand__Group_2__2__Impl
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
    // InternalSpec.g:1026:1: rule__ClickCommand__Group_2__2__Impl : ( ( rule__ClickCommand__PointAssignment_2_2 ) ) ;
    public final void rule__ClickCommand__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1030:1: ( ( ( rule__ClickCommand__PointAssignment_2_2 ) ) )
            // InternalSpec.g:1031:1: ( ( rule__ClickCommand__PointAssignment_2_2 ) )
            {
            // InternalSpec.g:1031:1: ( ( rule__ClickCommand__PointAssignment_2_2 ) )
            // InternalSpec.g:1032:2: ( rule__ClickCommand__PointAssignment_2_2 )
            {
             before(grammarAccess.getClickCommandAccess().getPointAssignment_2_2()); 
            // InternalSpec.g:1033:2: ( rule__ClickCommand__PointAssignment_2_2 )
            // InternalSpec.g:1033:3: rule__ClickCommand__PointAssignment_2_2
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
    // InternalSpec.g:1042:1: rule__SelectCommand__Group_0__0 : rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1 ;
    public final void rule__SelectCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1046:1: ( rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1 )
            // InternalSpec.g:1047:2: rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSpec.g:1054:1: rule__SelectCommand__Group_0__0__Impl : ( 'Within' ) ;
    public final void rule__SelectCommand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1058:1: ( ( 'Within' ) )
            // InternalSpec.g:1059:1: ( 'Within' )
            {
            // InternalSpec.g:1059:1: ( 'Within' )
            // InternalSpec.g:1060:2: 'Within'
            {
             before(grammarAccess.getSelectCommandAccess().getWithinKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSpec.g:1069:1: rule__SelectCommand__Group_0__1 : rule__SelectCommand__Group_0__1__Impl ;
    public final void rule__SelectCommand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1073:1: ( rule__SelectCommand__Group_0__1__Impl )
            // InternalSpec.g:1074:2: rule__SelectCommand__Group_0__1__Impl
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
    // InternalSpec.g:1080:1: rule__SelectCommand__Group_0__1__Impl : ( ( rule__SelectCommand__ValueAssignment_0_1 ) ) ;
    public final void rule__SelectCommand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1084:1: ( ( ( rule__SelectCommand__ValueAssignment_0_1 ) ) )
            // InternalSpec.g:1085:1: ( ( rule__SelectCommand__ValueAssignment_0_1 ) )
            {
            // InternalSpec.g:1085:1: ( ( rule__SelectCommand__ValueAssignment_0_1 ) )
            // InternalSpec.g:1086:2: ( rule__SelectCommand__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSelectCommandAccess().getValueAssignment_0_1()); 
            // InternalSpec.g:1087:2: ( rule__SelectCommand__ValueAssignment_0_1 )
            // InternalSpec.g:1087:3: rule__SelectCommand__ValueAssignment_0_1
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
    // InternalSpec.g:1096:1: rule__SelectCommand__Group_1__0 : rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1 ;
    public final void rule__SelectCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1100:1: ( rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1 )
            // InternalSpec.g:1101:2: rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSpec.g:1108:1: rule__SelectCommand__Group_1__0__Impl : ( 'Select' ) ;
    public final void rule__SelectCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1112:1: ( ( 'Select' ) )
            // InternalSpec.g:1113:1: ( 'Select' )
            {
            // InternalSpec.g:1113:1: ( 'Select' )
            // InternalSpec.g:1114:2: 'Select'
            {
             before(grammarAccess.getSelectCommandAccess().getSelectKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSpec.g:1123:1: rule__SelectCommand__Group_1__1 : rule__SelectCommand__Group_1__1__Impl ;
    public final void rule__SelectCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1127:1: ( rule__SelectCommand__Group_1__1__Impl )
            // InternalSpec.g:1128:2: rule__SelectCommand__Group_1__1__Impl
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
    // InternalSpec.g:1134:1: rule__SelectCommand__Group_1__1__Impl : ( ( rule__SelectCommand__ValueAssignment_1_1 ) ) ;
    public final void rule__SelectCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1138:1: ( ( ( rule__SelectCommand__ValueAssignment_1_1 ) ) )
            // InternalSpec.g:1139:1: ( ( rule__SelectCommand__ValueAssignment_1_1 ) )
            {
            // InternalSpec.g:1139:1: ( ( rule__SelectCommand__ValueAssignment_1_1 ) )
            // InternalSpec.g:1140:2: ( rule__SelectCommand__ValueAssignment_1_1 )
            {
             before(grammarAccess.getSelectCommandAccess().getValueAssignment_1_1()); 
            // InternalSpec.g:1141:2: ( rule__SelectCommand__ValueAssignment_1_1 )
            // InternalSpec.g:1141:3: rule__SelectCommand__ValueAssignment_1_1
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
    // InternalSpec.g:1150:1: rule__SelectCommand__Group_2__0 : rule__SelectCommand__Group_2__0__Impl rule__SelectCommand__Group_2__1 ;
    public final void rule__SelectCommand__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1154:1: ( rule__SelectCommand__Group_2__0__Impl rule__SelectCommand__Group_2__1 )
            // InternalSpec.g:1155:2: rule__SelectCommand__Group_2__0__Impl rule__SelectCommand__Group_2__1
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
    // InternalSpec.g:1162:1: rule__SelectCommand__Group_2__0__Impl : ( 'Select' ) ;
    public final void rule__SelectCommand__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1166:1: ( ( 'Select' ) )
            // InternalSpec.g:1167:1: ( 'Select' )
            {
            // InternalSpec.g:1167:1: ( 'Select' )
            // InternalSpec.g:1168:2: 'Select'
            {
             before(grammarAccess.getSelectCommandAccess().getSelectKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSpec.g:1177:1: rule__SelectCommand__Group_2__1 : rule__SelectCommand__Group_2__1__Impl rule__SelectCommand__Group_2__2 ;
    public final void rule__SelectCommand__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1181:1: ( rule__SelectCommand__Group_2__1__Impl rule__SelectCommand__Group_2__2 )
            // InternalSpec.g:1182:2: rule__SelectCommand__Group_2__1__Impl rule__SelectCommand__Group_2__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSpec.g:1189:1: rule__SelectCommand__Group_2__1__Impl : ( 'visible' ) ;
    public final void rule__SelectCommand__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1193:1: ( ( 'visible' ) )
            // InternalSpec.g:1194:1: ( 'visible' )
            {
            // InternalSpec.g:1194:1: ( 'visible' )
            // InternalSpec.g:1195:2: 'visible'
            {
             before(grammarAccess.getSelectCommandAccess().getVisibleKeyword_2_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSpec.g:1204:1: rule__SelectCommand__Group_2__2 : rule__SelectCommand__Group_2__2__Impl ;
    public final void rule__SelectCommand__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1208:1: ( rule__SelectCommand__Group_2__2__Impl )
            // InternalSpec.g:1209:2: rule__SelectCommand__Group_2__2__Impl
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
    // InternalSpec.g:1215:1: rule__SelectCommand__Group_2__2__Impl : ( ( rule__SelectCommand__ValueAssignment_2_2 ) ) ;
    public final void rule__SelectCommand__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1219:1: ( ( ( rule__SelectCommand__ValueAssignment_2_2 ) ) )
            // InternalSpec.g:1220:1: ( ( rule__SelectCommand__ValueAssignment_2_2 ) )
            {
            // InternalSpec.g:1220:1: ( ( rule__SelectCommand__ValueAssignment_2_2 ) )
            // InternalSpec.g:1221:2: ( rule__SelectCommand__ValueAssignment_2_2 )
            {
             before(grammarAccess.getSelectCommandAccess().getValueAssignment_2_2()); 
            // InternalSpec.g:1222:2: ( rule__SelectCommand__ValueAssignment_2_2 )
            // InternalSpec.g:1222:3: rule__SelectCommand__ValueAssignment_2_2
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


    // $ANTLR start "rule__Selector__Group_1__0"
    // InternalSpec.g:1231:1: rule__Selector__Group_1__0 : rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 ;
    public final void rule__Selector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1235:1: ( rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 )
            // InternalSpec.g:1236:2: rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSpec.g:1243:1: rule__Selector__Group_1__0__Impl : ( ( rule__Selector__TypeAssignment_1_0 ) ) ;
    public final void rule__Selector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1247:1: ( ( ( rule__Selector__TypeAssignment_1_0 ) ) )
            // InternalSpec.g:1248:1: ( ( rule__Selector__TypeAssignment_1_0 ) )
            {
            // InternalSpec.g:1248:1: ( ( rule__Selector__TypeAssignment_1_0 ) )
            // InternalSpec.g:1249:2: ( rule__Selector__TypeAssignment_1_0 )
            {
             before(grammarAccess.getSelectorAccess().getTypeAssignment_1_0()); 
            // InternalSpec.g:1250:2: ( rule__Selector__TypeAssignment_1_0 )
            // InternalSpec.g:1250:3: rule__Selector__TypeAssignment_1_0
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
    // InternalSpec.g:1258:1: rule__Selector__Group_1__1 : rule__Selector__Group_1__1__Impl ;
    public final void rule__Selector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1262:1: ( rule__Selector__Group_1__1__Impl )
            // InternalSpec.g:1263:2: rule__Selector__Group_1__1__Impl
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
    // InternalSpec.g:1269:1: rule__Selector__Group_1__1__Impl : ( ( rule__Selector__ValAssignment_1_1 ) ) ;
    public final void rule__Selector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1273:1: ( ( ( rule__Selector__ValAssignment_1_1 ) ) )
            // InternalSpec.g:1274:1: ( ( rule__Selector__ValAssignment_1_1 ) )
            {
            // InternalSpec.g:1274:1: ( ( rule__Selector__ValAssignment_1_1 ) )
            // InternalSpec.g:1275:2: ( rule__Selector__ValAssignment_1_1 )
            {
             before(grammarAccess.getSelectorAccess().getValAssignment_1_1()); 
            // InternalSpec.g:1276:2: ( rule__Selector__ValAssignment_1_1 )
            // InternalSpec.g:1276:3: rule__Selector__ValAssignment_1_1
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


    // $ANTLR start "rule__StoreCommand__Group__0"
    // InternalSpec.g:1285:1: rule__StoreCommand__Group__0 : rule__StoreCommand__Group__0__Impl rule__StoreCommand__Group__1 ;
    public final void rule__StoreCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1289:1: ( rule__StoreCommand__Group__0__Impl rule__StoreCommand__Group__1 )
            // InternalSpec.g:1290:2: rule__StoreCommand__Group__0__Impl rule__StoreCommand__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSpec.g:1297:1: rule__StoreCommand__Group__0__Impl : ( 'Store' ) ;
    public final void rule__StoreCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1301:1: ( ( 'Store' ) )
            // InternalSpec.g:1302:1: ( 'Store' )
            {
            // InternalSpec.g:1302:1: ( 'Store' )
            // InternalSpec.g:1303:2: 'Store'
            {
             before(grammarAccess.getStoreCommandAccess().getStoreKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSpec.g:1312:1: rule__StoreCommand__Group__1 : rule__StoreCommand__Group__1__Impl rule__StoreCommand__Group__2 ;
    public final void rule__StoreCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1316:1: ( rule__StoreCommand__Group__1__Impl rule__StoreCommand__Group__2 )
            // InternalSpec.g:1317:2: rule__StoreCommand__Group__1__Impl rule__StoreCommand__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSpec.g:1324:1: rule__StoreCommand__Group__1__Impl : ( ( rule__StoreCommand__NameAssignment_1 ) ) ;
    public final void rule__StoreCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1328:1: ( ( ( rule__StoreCommand__NameAssignment_1 ) ) )
            // InternalSpec.g:1329:1: ( ( rule__StoreCommand__NameAssignment_1 ) )
            {
            // InternalSpec.g:1329:1: ( ( rule__StoreCommand__NameAssignment_1 ) )
            // InternalSpec.g:1330:2: ( rule__StoreCommand__NameAssignment_1 )
            {
             before(grammarAccess.getStoreCommandAccess().getNameAssignment_1()); 
            // InternalSpec.g:1331:2: ( rule__StoreCommand__NameAssignment_1 )
            // InternalSpec.g:1331:3: rule__StoreCommand__NameAssignment_1
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
    // InternalSpec.g:1339:1: rule__StoreCommand__Group__2 : rule__StoreCommand__Group__2__Impl rule__StoreCommand__Group__3 ;
    public final void rule__StoreCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1343:1: ( rule__StoreCommand__Group__2__Impl rule__StoreCommand__Group__3 )
            // InternalSpec.g:1344:2: rule__StoreCommand__Group__2__Impl rule__StoreCommand__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSpec.g:1351:1: rule__StoreCommand__Group__2__Impl : ( 'to' ) ;
    public final void rule__StoreCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1355:1: ( ( 'to' ) )
            // InternalSpec.g:1356:1: ( 'to' )
            {
            // InternalSpec.g:1356:1: ( 'to' )
            // InternalSpec.g:1357:2: 'to'
            {
             before(grammarAccess.getStoreCommandAccess().getToKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStoreCommandAccess().getToKeyword_2()); 

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
    // InternalSpec.g:1366:1: rule__StoreCommand__Group__3 : rule__StoreCommand__Group__3__Impl rule__StoreCommand__Group__4 ;
    public final void rule__StoreCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1370:1: ( rule__StoreCommand__Group__3__Impl rule__StoreCommand__Group__4 )
            // InternalSpec.g:1371:2: rule__StoreCommand__Group__3__Impl rule__StoreCommand__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__StoreCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreCommand__Group__4();

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
    // InternalSpec.g:1378:1: rule__StoreCommand__Group__3__Impl : ( 'be' ) ;
    public final void rule__StoreCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1382:1: ( ( 'be' ) )
            // InternalSpec.g:1383:1: ( 'be' )
            {
            // InternalSpec.g:1383:1: ( 'be' )
            // InternalSpec.g:1384:2: 'be'
            {
             before(grammarAccess.getStoreCommandAccess().getBeKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStoreCommandAccess().getBeKeyword_3()); 

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


    // $ANTLR start "rule__StoreCommand__Group__4"
    // InternalSpec.g:1393:1: rule__StoreCommand__Group__4 : rule__StoreCommand__Group__4__Impl ;
    public final void rule__StoreCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1397:1: ( rule__StoreCommand__Group__4__Impl )
            // InternalSpec.g:1398:2: rule__StoreCommand__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoreCommand__Group__4__Impl();

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
    // $ANTLR end "rule__StoreCommand__Group__4"


    // $ANTLR start "rule__StoreCommand__Group__4__Impl"
    // InternalSpec.g:1404:1: rule__StoreCommand__Group__4__Impl : ( ( rule__StoreCommand__ValueAssignment_4 ) ) ;
    public final void rule__StoreCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1408:1: ( ( ( rule__StoreCommand__ValueAssignment_4 ) ) )
            // InternalSpec.g:1409:1: ( ( rule__StoreCommand__ValueAssignment_4 ) )
            {
            // InternalSpec.g:1409:1: ( ( rule__StoreCommand__ValueAssignment_4 ) )
            // InternalSpec.g:1410:2: ( rule__StoreCommand__ValueAssignment_4 )
            {
             before(grammarAccess.getStoreCommandAccess().getValueAssignment_4()); 
            // InternalSpec.g:1411:2: ( rule__StoreCommand__ValueAssignment_4 )
            // InternalSpec.g:1411:3: rule__StoreCommand__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__StoreCommand__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStoreCommandAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__StoreCommand__Group__4__Impl"


    // $ANTLR start "rule__RememberCommand__Group__0"
    // InternalSpec.g:1420:1: rule__RememberCommand__Group__0 : rule__RememberCommand__Group__0__Impl rule__RememberCommand__Group__1 ;
    public final void rule__RememberCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1424:1: ( rule__RememberCommand__Group__0__Impl rule__RememberCommand__Group__1 )
            // InternalSpec.g:1425:2: rule__RememberCommand__Group__0__Impl rule__RememberCommand__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSpec.g:1432:1: rule__RememberCommand__Group__0__Impl : ( 'Remember' ) ;
    public final void rule__RememberCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1436:1: ( ( 'Remember' ) )
            // InternalSpec.g:1437:1: ( 'Remember' )
            {
            // InternalSpec.g:1437:1: ( 'Remember' )
            // InternalSpec.g:1438:2: 'Remember'
            {
             before(grammarAccess.getRememberCommandAccess().getRememberKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSpec.g:1447:1: rule__RememberCommand__Group__1 : rule__RememberCommand__Group__1__Impl rule__RememberCommand__Group__2 ;
    public final void rule__RememberCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1451:1: ( rule__RememberCommand__Group__1__Impl rule__RememberCommand__Group__2 )
            // InternalSpec.g:1452:2: rule__RememberCommand__Group__1__Impl rule__RememberCommand__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSpec.g:1459:1: rule__RememberCommand__Group__1__Impl : ( ( rule__RememberCommand__PropAssignment_1 ) ) ;
    public final void rule__RememberCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1463:1: ( ( ( rule__RememberCommand__PropAssignment_1 ) ) )
            // InternalSpec.g:1464:1: ( ( rule__RememberCommand__PropAssignment_1 ) )
            {
            // InternalSpec.g:1464:1: ( ( rule__RememberCommand__PropAssignment_1 ) )
            // InternalSpec.g:1465:2: ( rule__RememberCommand__PropAssignment_1 )
            {
             before(grammarAccess.getRememberCommandAccess().getPropAssignment_1()); 
            // InternalSpec.g:1466:2: ( rule__RememberCommand__PropAssignment_1 )
            // InternalSpec.g:1466:3: rule__RememberCommand__PropAssignment_1
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
    // InternalSpec.g:1474:1: rule__RememberCommand__Group__2 : rule__RememberCommand__Group__2__Impl rule__RememberCommand__Group__3 ;
    public final void rule__RememberCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1478:1: ( rule__RememberCommand__Group__2__Impl rule__RememberCommand__Group__3 )
            // InternalSpec.g:1479:2: rule__RememberCommand__Group__2__Impl rule__RememberCommand__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalSpec.g:1486:1: rule__RememberCommand__Group__2__Impl : ( 'as' ) ;
    public final void rule__RememberCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1490:1: ( ( 'as' ) )
            // InternalSpec.g:1491:1: ( 'as' )
            {
            // InternalSpec.g:1491:1: ( 'as' )
            // InternalSpec.g:1492:2: 'as'
            {
             before(grammarAccess.getRememberCommandAccess().getAsKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSpec.g:1501:1: rule__RememberCommand__Group__3 : rule__RememberCommand__Group__3__Impl ;
    public final void rule__RememberCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1505:1: ( rule__RememberCommand__Group__3__Impl )
            // InternalSpec.g:1506:2: rule__RememberCommand__Group__3__Impl
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
    // InternalSpec.g:1512:1: rule__RememberCommand__Group__3__Impl : ( ( rule__RememberCommand__VarAssignment_3 ) ) ;
    public final void rule__RememberCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1516:1: ( ( ( rule__RememberCommand__VarAssignment_3 ) ) )
            // InternalSpec.g:1517:1: ( ( rule__RememberCommand__VarAssignment_3 ) )
            {
            // InternalSpec.g:1517:1: ( ( rule__RememberCommand__VarAssignment_3 ) )
            // InternalSpec.g:1518:2: ( rule__RememberCommand__VarAssignment_3 )
            {
             before(grammarAccess.getRememberCommandAccess().getVarAssignment_3()); 
            // InternalSpec.g:1519:2: ( rule__RememberCommand__VarAssignment_3 )
            // InternalSpec.g:1519:3: rule__RememberCommand__VarAssignment_3
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
    // InternalSpec.g:1528:1: rule__PropertyCommand__Group__0 : rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1 ;
    public final void rule__PropertyCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1532:1: ( rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1 )
            // InternalSpec.g:1533:2: rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSpec.g:1540:1: rule__PropertyCommand__Group__0__Impl : ( 'Property' ) ;
    public final void rule__PropertyCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1544:1: ( ( 'Property' ) )
            // InternalSpec.g:1545:1: ( 'Property' )
            {
            // InternalSpec.g:1545:1: ( 'Property' )
            // InternalSpec.g:1546:2: 'Property'
            {
             before(grammarAccess.getPropertyCommandAccess().getPropertyKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSpec.g:1555:1: rule__PropertyCommand__Group__1 : rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2 ;
    public final void rule__PropertyCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1559:1: ( rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2 )
            // InternalSpec.g:1560:2: rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSpec.g:1567:1: rule__PropertyCommand__Group__1__Impl : ( ( rule__PropertyCommand__PropAssignment_1 ) ) ;
    public final void rule__PropertyCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1571:1: ( ( ( rule__PropertyCommand__PropAssignment_1 ) ) )
            // InternalSpec.g:1572:1: ( ( rule__PropertyCommand__PropAssignment_1 ) )
            {
            // InternalSpec.g:1572:1: ( ( rule__PropertyCommand__PropAssignment_1 ) )
            // InternalSpec.g:1573:2: ( rule__PropertyCommand__PropAssignment_1 )
            {
             before(grammarAccess.getPropertyCommandAccess().getPropAssignment_1()); 
            // InternalSpec.g:1574:2: ( rule__PropertyCommand__PropAssignment_1 )
            // InternalSpec.g:1574:3: rule__PropertyCommand__PropAssignment_1
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
    // InternalSpec.g:1582:1: rule__PropertyCommand__Group__2 : rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3 ;
    public final void rule__PropertyCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1586:1: ( rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3 )
            // InternalSpec.g:1587:2: rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3
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
    // InternalSpec.g:1594:1: rule__PropertyCommand__Group__2__Impl : ( ( rule__PropertyCommand__CondAssignment_2 ) ) ;
    public final void rule__PropertyCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1598:1: ( ( ( rule__PropertyCommand__CondAssignment_2 ) ) )
            // InternalSpec.g:1599:1: ( ( rule__PropertyCommand__CondAssignment_2 ) )
            {
            // InternalSpec.g:1599:1: ( ( rule__PropertyCommand__CondAssignment_2 ) )
            // InternalSpec.g:1600:2: ( rule__PropertyCommand__CondAssignment_2 )
            {
             before(grammarAccess.getPropertyCommandAccess().getCondAssignment_2()); 
            // InternalSpec.g:1601:2: ( rule__PropertyCommand__CondAssignment_2 )
            // InternalSpec.g:1601:3: rule__PropertyCommand__CondAssignment_2
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
    // InternalSpec.g:1609:1: rule__PropertyCommand__Group__3 : rule__PropertyCommand__Group__3__Impl ;
    public final void rule__PropertyCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1613:1: ( rule__PropertyCommand__Group__3__Impl )
            // InternalSpec.g:1614:2: rule__PropertyCommand__Group__3__Impl
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
    // InternalSpec.g:1620:1: rule__PropertyCommand__Group__3__Impl : ( ( rule__PropertyCommand__ValAssignment_3 ) ) ;
    public final void rule__PropertyCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1624:1: ( ( ( rule__PropertyCommand__ValAssignment_3 ) ) )
            // InternalSpec.g:1625:1: ( ( rule__PropertyCommand__ValAssignment_3 ) )
            {
            // InternalSpec.g:1625:1: ( ( rule__PropertyCommand__ValAssignment_3 ) )
            // InternalSpec.g:1626:2: ( rule__PropertyCommand__ValAssignment_3 )
            {
             before(grammarAccess.getPropertyCommandAccess().getValAssignment_3()); 
            // InternalSpec.g:1627:2: ( rule__PropertyCommand__ValAssignment_3 )
            // InternalSpec.g:1627:3: rule__PropertyCommand__ValAssignment_3
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


    // $ANTLR start "rule__Condition__Group_0__0"
    // InternalSpec.g:1636:1: rule__Condition__Group_0__0 : rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 ;
    public final void rule__Condition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1640:1: ( rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 )
            // InternalSpec.g:1641:2: rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSpec.g:1648:1: rule__Condition__Group_0__0__Impl : ( 'should' ) ;
    public final void rule__Condition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1652:1: ( ( 'should' ) )
            // InternalSpec.g:1653:1: ( 'should' )
            {
            // InternalSpec.g:1653:1: ( 'should' )
            // InternalSpec.g:1654:2: 'should'
            {
             before(grammarAccess.getConditionAccess().getShouldKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSpec.g:1663:1: rule__Condition__Group_0__1 : rule__Condition__Group_0__1__Impl ;
    public final void rule__Condition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1667:1: ( rule__Condition__Group_0__1__Impl )
            // InternalSpec.g:1668:2: rule__Condition__Group_0__1__Impl
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
    // InternalSpec.g:1674:1: rule__Condition__Group_0__1__Impl : ( 'be' ) ;
    public final void rule__Condition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1678:1: ( ( 'be' ) )
            // InternalSpec.g:1679:1: ( 'be' )
            {
            // InternalSpec.g:1679:1: ( 'be' )
            // InternalSpec.g:1680:2: 'be'
            {
             before(grammarAccess.getConditionAccess().getBeKeyword_0_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSpec.g:1690:1: rule__Condition__Group_1__0 : rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 ;
    public final void rule__Condition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1694:1: ( rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 )
            // InternalSpec.g:1695:2: rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSpec.g:1702:1: rule__Condition__Group_1__0__Impl : ( 'should' ) ;
    public final void rule__Condition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1706:1: ( ( 'should' ) )
            // InternalSpec.g:1707:1: ( 'should' )
            {
            // InternalSpec.g:1707:1: ( 'should' )
            // InternalSpec.g:1708:2: 'should'
            {
             before(grammarAccess.getConditionAccess().getShouldKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSpec.g:1717:1: rule__Condition__Group_1__1 : rule__Condition__Group_1__1__Impl rule__Condition__Group_1__2 ;
    public final void rule__Condition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1721:1: ( rule__Condition__Group_1__1__Impl rule__Condition__Group_1__2 )
            // InternalSpec.g:1722:2: rule__Condition__Group_1__1__Impl rule__Condition__Group_1__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalSpec.g:1729:1: rule__Condition__Group_1__1__Impl : ( 'not' ) ;
    public final void rule__Condition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1733:1: ( ( 'not' ) )
            // InternalSpec.g:1734:1: ( 'not' )
            {
            // InternalSpec.g:1734:1: ( 'not' )
            // InternalSpec.g:1735:2: 'not'
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
    // InternalSpec.g:1744:1: rule__Condition__Group_1__2 : rule__Condition__Group_1__2__Impl ;
    public final void rule__Condition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1748:1: ( rule__Condition__Group_1__2__Impl )
            // InternalSpec.g:1749:2: rule__Condition__Group_1__2__Impl
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
    // InternalSpec.g:1755:1: rule__Condition__Group_1__2__Impl : ( 'be' ) ;
    public final void rule__Condition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1759:1: ( ( 'be' ) )
            // InternalSpec.g:1760:1: ( 'be' )
            {
            // InternalSpec.g:1760:1: ( 'be' )
            // InternalSpec.g:1761:2: 'be'
            {
             before(grammarAccess.getConditionAccess().getBeKeyword_1_2()); 
            match(input,33,FOLLOW_2); 
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


    // $ANTLR start "rule__TypeCommand__Group__0"
    // InternalSpec.g:1771:1: rule__TypeCommand__Group__0 : rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1 ;
    public final void rule__TypeCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1775:1: ( rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1 )
            // InternalSpec.g:1776:2: rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1
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
    // InternalSpec.g:1783:1: rule__TypeCommand__Group__0__Impl : ( 'Type' ) ;
    public final void rule__TypeCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1787:1: ( ( 'Type' ) )
            // InternalSpec.g:1788:1: ( 'Type' )
            {
            // InternalSpec.g:1788:1: ( 'Type' )
            // InternalSpec.g:1789:2: 'Type'
            {
             before(grammarAccess.getTypeCommandAccess().getTypeKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSpec.g:1798:1: rule__TypeCommand__Group__1 : rule__TypeCommand__Group__1__Impl ;
    public final void rule__TypeCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1802:1: ( rule__TypeCommand__Group__1__Impl )
            // InternalSpec.g:1803:2: rule__TypeCommand__Group__1__Impl
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
    // InternalSpec.g:1809:1: rule__TypeCommand__Group__1__Impl : ( ( rule__TypeCommand__ValAssignment_1 ) ) ;
    public final void rule__TypeCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1813:1: ( ( ( rule__TypeCommand__ValAssignment_1 ) ) )
            // InternalSpec.g:1814:1: ( ( rule__TypeCommand__ValAssignment_1 ) )
            {
            // InternalSpec.g:1814:1: ( ( rule__TypeCommand__ValAssignment_1 ) )
            // InternalSpec.g:1815:2: ( rule__TypeCommand__ValAssignment_1 )
            {
             before(grammarAccess.getTypeCommandAccess().getValAssignment_1()); 
            // InternalSpec.g:1816:2: ( rule__TypeCommand__ValAssignment_1 )
            // InternalSpec.g:1816:3: rule__TypeCommand__ValAssignment_1
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
    // InternalSpec.g:1825:1: rule__SleepCommand__Group__0 : rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1 ;
    public final void rule__SleepCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1829:1: ( rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1 )
            // InternalSpec.g:1830:2: rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSpec.g:1837:1: rule__SleepCommand__Group__0__Impl : ( 'Sleep' ) ;
    public final void rule__SleepCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1841:1: ( ( 'Sleep' ) )
            // InternalSpec.g:1842:1: ( 'Sleep' )
            {
            // InternalSpec.g:1842:1: ( 'Sleep' )
            // InternalSpec.g:1843:2: 'Sleep'
            {
             before(grammarAccess.getSleepCommandAccess().getSleepKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSpec.g:1852:1: rule__SleepCommand__Group__1 : rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2 ;
    public final void rule__SleepCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1856:1: ( rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2 )
            // InternalSpec.g:1857:2: rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalSpec.g:1864:1: rule__SleepCommand__Group__1__Impl : ( 'for' ) ;
    public final void rule__SleepCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1868:1: ( ( 'for' ) )
            // InternalSpec.g:1869:1: ( 'for' )
            {
            // InternalSpec.g:1869:1: ( 'for' )
            // InternalSpec.g:1870:2: 'for'
            {
             before(grammarAccess.getSleepCommandAccess().getForKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSpec.g:1879:1: rule__SleepCommand__Group__2 : rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3 ;
    public final void rule__SleepCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1883:1: ( rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3 )
            // InternalSpec.g:1884:2: rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalSpec.g:1891:1: rule__SleepCommand__Group__2__Impl : ( ( rule__SleepCommand__TimeAssignment_2 ) ) ;
    public final void rule__SleepCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1895:1: ( ( ( rule__SleepCommand__TimeAssignment_2 ) ) )
            // InternalSpec.g:1896:1: ( ( rule__SleepCommand__TimeAssignment_2 ) )
            {
            // InternalSpec.g:1896:1: ( ( rule__SleepCommand__TimeAssignment_2 ) )
            // InternalSpec.g:1897:2: ( rule__SleepCommand__TimeAssignment_2 )
            {
             before(grammarAccess.getSleepCommandAccess().getTimeAssignment_2()); 
            // InternalSpec.g:1898:2: ( rule__SleepCommand__TimeAssignment_2 )
            // InternalSpec.g:1898:3: rule__SleepCommand__TimeAssignment_2
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
    // InternalSpec.g:1906:1: rule__SleepCommand__Group__3 : rule__SleepCommand__Group__3__Impl ;
    public final void rule__SleepCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1910:1: ( rule__SleepCommand__Group__3__Impl )
            // InternalSpec.g:1911:2: rule__SleepCommand__Group__3__Impl
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
    // InternalSpec.g:1917:1: rule__SleepCommand__Group__3__Impl : ( ( rule__SleepCommand__Alternatives_3 ) ) ;
    public final void rule__SleepCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1921:1: ( ( ( rule__SleepCommand__Alternatives_3 ) ) )
            // InternalSpec.g:1922:1: ( ( rule__SleepCommand__Alternatives_3 ) )
            {
            // InternalSpec.g:1922:1: ( ( rule__SleepCommand__Alternatives_3 ) )
            // InternalSpec.g:1923:2: ( rule__SleepCommand__Alternatives_3 )
            {
             before(grammarAccess.getSleepCommandAccess().getAlternatives_3()); 
            // InternalSpec.g:1924:2: ( rule__SleepCommand__Alternatives_3 )
            // InternalSpec.g:1924:3: rule__SleepCommand__Alternatives_3
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
    // InternalSpec.g:1933:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1937:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalSpec.g:1938:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSpec.g:1945:1: rule__Point__Group__0__Impl : ( '{' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1949:1: ( ( '{' ) )
            // InternalSpec.g:1950:1: ( '{' )
            {
            // InternalSpec.g:1950:1: ( '{' )
            // InternalSpec.g:1951:2: '{'
            {
             before(grammarAccess.getPointAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSpec.g:1960:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1964:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalSpec.g:1965:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSpec.g:1972:1: rule__Point__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1976:1: ( ( RULE_INT ) )
            // InternalSpec.g:1977:1: ( RULE_INT )
            {
            // InternalSpec.g:1977:1: ( RULE_INT )
            // InternalSpec.g:1978:2: RULE_INT
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
    // InternalSpec.g:1987:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1991:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalSpec.g:1992:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalSpec.g:1999:1: rule__Point__Group__2__Impl : ( ',' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2003:1: ( ( ',' ) )
            // InternalSpec.g:2004:1: ( ',' )
            {
            // InternalSpec.g:2004:1: ( ',' )
            // InternalSpec.g:2005:2: ','
            {
             before(grammarAccess.getPointAccess().getCommaKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSpec.g:2014:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2018:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // InternalSpec.g:2019:2: rule__Point__Group__3__Impl rule__Point__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalSpec.g:2026:1: rule__Point__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2030:1: ( ( RULE_INT ) )
            // InternalSpec.g:2031:1: ( RULE_INT )
            {
            // InternalSpec.g:2031:1: ( RULE_INT )
            // InternalSpec.g:2032:2: RULE_INT
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
    // InternalSpec.g:2041:1: rule__Point__Group__4 : rule__Point__Group__4__Impl ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2045:1: ( rule__Point__Group__4__Impl )
            // InternalSpec.g:2046:2: rule__Point__Group__4__Impl
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
    // InternalSpec.g:2052:1: rule__Point__Group__4__Impl : ( '}' ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2056:1: ( ( '}' ) )
            // InternalSpec.g:2057:1: ( '}' )
            {
            // InternalSpec.g:2057:1: ( '}' )
            // InternalSpec.g:2058:2: '}'
            {
             before(grammarAccess.getPointAccess().getRightCurlyBracketKeyword_4()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSpec.g:2068:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2072:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalSpec.g:2073:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSpec.g:2080:1: rule__Variable__Group__0__Impl : ( '$' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2084:1: ( ( '$' ) )
            // InternalSpec.g:2085:1: ( '$' )
            {
            // InternalSpec.g:2085:1: ( '$' )
            // InternalSpec.g:2086:2: '$'
            {
             before(grammarAccess.getVariableAccess().getDollarSignKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSpec.g:2095:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2099:1: ( rule__Variable__Group__1__Impl )
            // InternalSpec.g:2100:2: rule__Variable__Group__1__Impl
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
    // InternalSpec.g:2106:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2110:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalSpec.g:2111:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalSpec.g:2111:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalSpec.g:2112:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalSpec.g:2113:2: ( rule__Variable__NameAssignment_1 )
            // InternalSpec.g:2113:3: rule__Variable__NameAssignment_1
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
    // InternalSpec.g:2122:1: rule__Model__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2126:1: ( ( ruleCommand ) )
            // InternalSpec.g:2127:2: ( ruleCommand )
            {
            // InternalSpec.g:2127:2: ( ruleCommand )
            // InternalSpec.g:2128:3: ruleCommand
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
    // InternalSpec.g:2137:1: rule__Command__CommentAssignment_8 : ( RULE_SL_COMMENT ) ;
    public final void rule__Command__CommentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2141:1: ( ( RULE_SL_COMMENT ) )
            // InternalSpec.g:2142:2: ( RULE_SL_COMMENT )
            {
            // InternalSpec.g:2142:2: ( RULE_SL_COMMENT )
            // InternalSpec.g:2143:3: RULE_SL_COMMENT
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
    // InternalSpec.g:2152:1: rule__Command__CustomAssignment_9 : ( RULE_CUSTOM_COMMAND ) ;
    public final void rule__Command__CustomAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2156:1: ( ( RULE_CUSTOM_COMMAND ) )
            // InternalSpec.g:2157:2: ( RULE_CUSTOM_COMMAND )
            {
            // InternalSpec.g:2157:2: ( RULE_CUSTOM_COMMAND )
            // InternalSpec.g:2158:3: RULE_CUSTOM_COMMAND
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


    // $ANTLR start "rule__OpenCommand__ValueAssignment_1"
    // InternalSpec.g:2167:1: rule__OpenCommand__ValueAssignment_1 : ( ruleVariableOrValue ) ;
    public final void rule__OpenCommand__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2171:1: ( ( ruleVariableOrValue ) )
            // InternalSpec.g:2172:2: ( ruleVariableOrValue )
            {
            // InternalSpec.g:2172:2: ( ruleVariableOrValue )
            // InternalSpec.g:2173:3: ruleVariableOrValue
            {
             before(grammarAccess.getOpenCommandAccess().getValueVariableOrValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableOrValue();

            state._fsp--;

             after(grammarAccess.getOpenCommandAccess().getValueVariableOrValueParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__VariableOrValue__VarAssignment_0_1"
    // InternalSpec.g:2182:1: rule__VariableOrValue__VarAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__VariableOrValue__VarAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2186:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2187:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2187:2: ( ( RULE_ID ) )
            // InternalSpec.g:2188:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableOrValueAccess().getVarVariableCrossReference_0_1_0()); 
            // InternalSpec.g:2189:3: ( RULE_ID )
            // InternalSpec.g:2190:4: RULE_ID
            {
             before(grammarAccess.getVariableOrValueAccess().getVarVariableIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableOrValueAccess().getVarVariableIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getVariableOrValueAccess().getVarVariableCrossReference_0_1_0()); 

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
    // $ANTLR end "rule__VariableOrValue__VarAssignment_0_1"


    // $ANTLR start "rule__VariableOrValue__ValAssignment_1"
    // InternalSpec.g:2201:1: rule__VariableOrValue__ValAssignment_1 : ( RULE_STRING ) ;
    public final void rule__VariableOrValue__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2205:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2206:2: ( RULE_STRING )
            {
            // InternalSpec.g:2206:2: ( RULE_STRING )
            // InternalSpec.g:2207:3: RULE_STRING
            {
             before(grammarAccess.getVariableOrValueAccess().getValSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVariableOrValueAccess().getValSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VariableOrValue__ValAssignment_1"


    // $ANTLR start "rule__VariableOrValue__ElementAssignment_2"
    // InternalSpec.g:2216:1: rule__VariableOrValue__ElementAssignment_2 : ( ruleElementInScreen ) ;
    public final void rule__VariableOrValue__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2220:1: ( ( ruleElementInScreen ) )
            // InternalSpec.g:2221:2: ( ruleElementInScreen )
            {
            // InternalSpec.g:2221:2: ( ruleElementInScreen )
            // InternalSpec.g:2222:3: ruleElementInScreen
            {
             before(grammarAccess.getVariableOrValueAccess().getElementElementInScreenParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElementInScreen();

            state._fsp--;

             after(grammarAccess.getVariableOrValueAccess().getElementElementInScreenParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__VariableOrValue__ElementAssignment_2"


    // $ANTLR start "rule__ClickCommand__CmdAssignment_0"
    // InternalSpec.g:2231:1: rule__ClickCommand__CmdAssignment_0 : ( ( 'Click' ) ) ;
    public final void rule__ClickCommand__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2235:1: ( ( ( 'Click' ) ) )
            // InternalSpec.g:2236:2: ( ( 'Click' ) )
            {
            // InternalSpec.g:2236:2: ( ( 'Click' ) )
            // InternalSpec.g:2237:3: ( 'Click' )
            {
             before(grammarAccess.getClickCommandAccess().getCmdClickKeyword_0_0()); 
            // InternalSpec.g:2238:3: ( 'Click' )
            // InternalSpec.g:2239:4: 'Click'
            {
             before(grammarAccess.getClickCommandAccess().getCmdClickKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSpec.g:2250:1: rule__ClickCommand__SelectorAssignment_1_2 : ( ruleSelector ) ;
    public final void rule__ClickCommand__SelectorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2254:1: ( ( ruleSelector ) )
            // InternalSpec.g:2255:2: ( ruleSelector )
            {
            // InternalSpec.g:2255:2: ( ruleSelector )
            // InternalSpec.g:2256:3: ruleSelector
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
    // InternalSpec.g:2265:1: rule__ClickCommand__PointAssignment_2_2 : ( rulePoint ) ;
    public final void rule__ClickCommand__PointAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2269:1: ( ( rulePoint ) )
            // InternalSpec.g:2270:2: ( rulePoint )
            {
            // InternalSpec.g:2270:2: ( rulePoint )
            // InternalSpec.g:2271:3: rulePoint
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
    // InternalSpec.g:2280:1: rule__SelectCommand__ValueAssignment_0_1 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2284:1: ( ( ruleSelector ) )
            // InternalSpec.g:2285:2: ( ruleSelector )
            {
            // InternalSpec.g:2285:2: ( ruleSelector )
            // InternalSpec.g:2286:3: ruleSelector
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
    // InternalSpec.g:2295:1: rule__SelectCommand__ValueAssignment_1_1 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2299:1: ( ( ruleSelector ) )
            // InternalSpec.g:2300:2: ( ruleSelector )
            {
            // InternalSpec.g:2300:2: ( ruleSelector )
            // InternalSpec.g:2301:3: ruleSelector
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
    // InternalSpec.g:2310:1: rule__SelectCommand__ValueAssignment_2_2 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2314:1: ( ( ruleSelector ) )
            // InternalSpec.g:2315:2: ( ruleSelector )
            {
            // InternalSpec.g:2315:2: ( ruleSelector )
            // InternalSpec.g:2316:3: ruleSelector
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
    // InternalSpec.g:2325:1: rule__Selector__VarAssignment_0 : ( ruleVariableOrValue ) ;
    public final void rule__Selector__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2329:1: ( ( ruleVariableOrValue ) )
            // InternalSpec.g:2330:2: ( ruleVariableOrValue )
            {
            // InternalSpec.g:2330:2: ( ruleVariableOrValue )
            // InternalSpec.g:2331:3: ruleVariableOrValue
            {
             before(grammarAccess.getSelectorAccess().getVarVariableOrValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableOrValue();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getVarVariableOrValueParserRuleCall_0_0()); 

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


    // $ANTLR start "rule__Selector__TypeAssignment_1_0"
    // InternalSpec.g:2340:1: rule__Selector__TypeAssignment_1_0 : ( ruleElementType ) ;
    public final void rule__Selector__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2344:1: ( ( ruleElementType ) )
            // InternalSpec.g:2345:2: ( ruleElementType )
            {
            // InternalSpec.g:2345:2: ( ruleElementType )
            // InternalSpec.g:2346:3: ruleElementType
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
    // InternalSpec.g:2355:1: rule__Selector__ValAssignment_1_1 : ( ruleVariableOrValue ) ;
    public final void rule__Selector__ValAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2359:1: ( ( ruleVariableOrValue ) )
            // InternalSpec.g:2360:2: ( ruleVariableOrValue )
            {
            // InternalSpec.g:2360:2: ( ruleVariableOrValue )
            // InternalSpec.g:2361:3: ruleVariableOrValue
            {
             before(grammarAccess.getSelectorAccess().getValVariableOrValueParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableOrValue();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getValVariableOrValueParserRuleCall_1_1_0()); 

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


    // $ANTLR start "rule__StoreCommand__NameAssignment_1"
    // InternalSpec.g:2370:1: rule__StoreCommand__NameAssignment_1 : ( ruleVariable ) ;
    public final void rule__StoreCommand__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2374:1: ( ( ruleVariable ) )
            // InternalSpec.g:2375:2: ( ruleVariable )
            {
            // InternalSpec.g:2375:2: ( ruleVariable )
            // InternalSpec.g:2376:3: ruleVariable
            {
             before(grammarAccess.getStoreCommandAccess().getNameVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getStoreCommandAccess().getNameVariableParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__StoreCommand__ValueAssignment_4"
    // InternalSpec.g:2385:1: rule__StoreCommand__ValueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__StoreCommand__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2389:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2390:2: ( RULE_STRING )
            {
            // InternalSpec.g:2390:2: ( RULE_STRING )
            // InternalSpec.g:2391:3: RULE_STRING
            {
             before(grammarAccess.getStoreCommandAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStoreCommandAccess().getValueSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__StoreCommand__ValueAssignment_4"


    // $ANTLR start "rule__RememberCommand__PropAssignment_1"
    // InternalSpec.g:2400:1: rule__RememberCommand__PropAssignment_1 : ( ruleProperty ) ;
    public final void rule__RememberCommand__PropAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2404:1: ( ( ruleProperty ) )
            // InternalSpec.g:2405:2: ( ruleProperty )
            {
            // InternalSpec.g:2405:2: ( ruleProperty )
            // InternalSpec.g:2406:3: ruleProperty
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
    // InternalSpec.g:2415:1: rule__RememberCommand__VarAssignment_3 : ( ruleVariable ) ;
    public final void rule__RememberCommand__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2419:1: ( ( ruleVariable ) )
            // InternalSpec.g:2420:2: ( ruleVariable )
            {
            // InternalSpec.g:2420:2: ( ruleVariable )
            // InternalSpec.g:2421:3: ruleVariable
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
    // InternalSpec.g:2430:1: rule__PropertyCommand__PropAssignment_1 : ( ruleProperty ) ;
    public final void rule__PropertyCommand__PropAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2434:1: ( ( ruleProperty ) )
            // InternalSpec.g:2435:2: ( ruleProperty )
            {
            // InternalSpec.g:2435:2: ( ruleProperty )
            // InternalSpec.g:2436:3: ruleProperty
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
    // InternalSpec.g:2445:1: rule__PropertyCommand__CondAssignment_2 : ( ruleCondition ) ;
    public final void rule__PropertyCommand__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2449:1: ( ( ruleCondition ) )
            // InternalSpec.g:2450:2: ( ruleCondition )
            {
            // InternalSpec.g:2450:2: ( ruleCondition )
            // InternalSpec.g:2451:3: ruleCondition
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
    // InternalSpec.g:2460:1: rule__PropertyCommand__ValAssignment_3 : ( ruleVariableOrValue ) ;
    public final void rule__PropertyCommand__ValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2464:1: ( ( ruleVariableOrValue ) )
            // InternalSpec.g:2465:2: ( ruleVariableOrValue )
            {
            // InternalSpec.g:2465:2: ( ruleVariableOrValue )
            // InternalSpec.g:2466:3: ruleVariableOrValue
            {
             before(grammarAccess.getPropertyCommandAccess().getValVariableOrValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableOrValue();

            state._fsp--;

             after(grammarAccess.getPropertyCommandAccess().getValVariableOrValueParserRuleCall_3_0()); 

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
    // InternalSpec.g:2475:1: rule__TypeCommand__ValAssignment_1 : ( ruleVariableOrValue ) ;
    public final void rule__TypeCommand__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2479:1: ( ( ruleVariableOrValue ) )
            // InternalSpec.g:2480:2: ( ruleVariableOrValue )
            {
            // InternalSpec.g:2480:2: ( ruleVariableOrValue )
            // InternalSpec.g:2481:3: ruleVariableOrValue
            {
             before(grammarAccess.getTypeCommandAccess().getValVariableOrValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableOrValue();

            state._fsp--;

             after(grammarAccess.getTypeCommandAccess().getValVariableOrValueParserRuleCall_1_0()); 

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
    // InternalSpec.g:2490:1: rule__SleepCommand__TimeAssignment_2 : ( RULE_INT ) ;
    public final void rule__SleepCommand__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2494:1: ( ( RULE_INT ) )
            // InternalSpec.g:2495:2: ( RULE_INT )
            {
            // InternalSpec.g:2495:2: ( RULE_INT )
            // InternalSpec.g:2496:3: RULE_INT
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


    // $ANTLR start "rule__ElementInScreen__ElementAssignment"
    // InternalSpec.g:2505:1: rule__ElementInScreen__ElementAssignment : ( RULE_ID ) ;
    public final void rule__ElementInScreen__ElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2509:1: ( ( RULE_ID ) )
            // InternalSpec.g:2510:2: ( RULE_ID )
            {
            // InternalSpec.g:2510:2: ( RULE_ID )
            // InternalSpec.g:2511:3: RULE_ID
            {
             before(grammarAccess.getElementInScreenAccess().getElementIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementInScreenAccess().getElementIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ElementInScreen__ElementAssignment"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalSpec.g:2520:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2524:1: ( ( RULE_ID ) )
            // InternalSpec.g:2525:2: ( RULE_ID )
            {
            // InternalSpec.g:2525:2: ( RULE_ID )
            // InternalSpec.g:2526:3: RULE_ID
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000194B2800062L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000180L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000017C0180L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});

}
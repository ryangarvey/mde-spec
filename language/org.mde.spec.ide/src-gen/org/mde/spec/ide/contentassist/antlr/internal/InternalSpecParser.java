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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_CUSTOM_COMMAND", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'second'", "'seconds'", "'Chrome'", "'Firefox'", "'Explorer'", "'Edge'", "'Opera'", "'Safari'", "'button'", "'element'", "'link'", "'input'", "'textarea'", "'text'", "'value'", "'should be'", "'should not be'", "'on'", "'at'", "'visible'", "'for'", "'{'", "','", "'}'", "'Store'", "'as'", "'Using'", "'Open'", "'Click'", "'Within'", "'Select'", "'Property'", "'Type'", "'Sleep'"
    };
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
    public static final int T__44=44;
    public static final int T__45=45;
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

                if ( ((LA1_0>=RULE_SL_COMMENT && LA1_0<=RULE_CUSTOM_COMMAND)||LA1_0==36||(LA1_0>=38 && LA1_0<=45)) ) {
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


    // $ANTLR start "entryRuleUsingCommand"
    // InternalSpec.g:103:1: entryRuleUsingCommand : ruleUsingCommand EOF ;
    public final void entryRuleUsingCommand() throws RecognitionException {
        try {
            // InternalSpec.g:104:1: ( ruleUsingCommand EOF )
            // InternalSpec.g:105:1: ruleUsingCommand EOF
            {
             before(grammarAccess.getUsingCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleUsingCommand();

            state._fsp--;

             after(grammarAccess.getUsingCommandRule()); 
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
    // $ANTLR end "entryRuleUsingCommand"


    // $ANTLR start "ruleUsingCommand"
    // InternalSpec.g:112:1: ruleUsingCommand : ( ( rule__UsingCommand__Group__0 ) ) ;
    public final void ruleUsingCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:116:2: ( ( ( rule__UsingCommand__Group__0 ) ) )
            // InternalSpec.g:117:2: ( ( rule__UsingCommand__Group__0 ) )
            {
            // InternalSpec.g:117:2: ( ( rule__UsingCommand__Group__0 ) )
            // InternalSpec.g:118:3: ( rule__UsingCommand__Group__0 )
            {
             before(grammarAccess.getUsingCommandAccess().getGroup()); 
            // InternalSpec.g:119:3: ( rule__UsingCommand__Group__0 )
            // InternalSpec.g:119:4: rule__UsingCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UsingCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsingCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUsingCommand"


    // $ANTLR start "entryRuleOpenCommand"
    // InternalSpec.g:128:1: entryRuleOpenCommand : ruleOpenCommand EOF ;
    public final void entryRuleOpenCommand() throws RecognitionException {
        try {
            // InternalSpec.g:129:1: ( ruleOpenCommand EOF )
            // InternalSpec.g:130:1: ruleOpenCommand EOF
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
    // InternalSpec.g:137:1: ruleOpenCommand : ( ( rule__OpenCommand__Group__0 ) ) ;
    public final void ruleOpenCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:141:2: ( ( ( rule__OpenCommand__Group__0 ) ) )
            // InternalSpec.g:142:2: ( ( rule__OpenCommand__Group__0 ) )
            {
            // InternalSpec.g:142:2: ( ( rule__OpenCommand__Group__0 ) )
            // InternalSpec.g:143:3: ( rule__OpenCommand__Group__0 )
            {
             before(grammarAccess.getOpenCommandAccess().getGroup()); 
            // InternalSpec.g:144:3: ( rule__OpenCommand__Group__0 )
            // InternalSpec.g:144:4: rule__OpenCommand__Group__0
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
    // InternalSpec.g:162:1: ruleClickCommand : ( ( rule__ClickCommand__Group__0 ) ) ;
    public final void ruleClickCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:166:2: ( ( ( rule__ClickCommand__Group__0 ) ) )
            // InternalSpec.g:167:2: ( ( rule__ClickCommand__Group__0 ) )
            {
            // InternalSpec.g:167:2: ( ( rule__ClickCommand__Group__0 ) )
            // InternalSpec.g:168:3: ( rule__ClickCommand__Group__0 )
            {
             before(grammarAccess.getClickCommandAccess().getGroup()); 
            // InternalSpec.g:169:3: ( rule__ClickCommand__Group__0 )
            // InternalSpec.g:169:4: rule__ClickCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClickCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickCommandAccess().getGroup()); 

            }


            }

        }
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
    // InternalSpec.g:212:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:216:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalSpec.g:217:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalSpec.g:217:2: ( ( rule__Selector__Group__0 ) )
            // InternalSpec.g:218:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalSpec.g:219:3: ( rule__Selector__Group__0 )
            // InternalSpec.g:219:4: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePoint"
    // InternalSpec.g:303:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalSpec.g:304:1: ( rulePoint EOF )
            // InternalSpec.g:305:1: rulePoint EOF
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
    // InternalSpec.g:312:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:316:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalSpec.g:317:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalSpec.g:317:2: ( ( rule__Point__Group__0 ) )
            // InternalSpec.g:318:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalSpec.g:319:3: ( rule__Point__Group__0 )
            // InternalSpec.g:319:4: rule__Point__Group__0
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


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalSpec.g:328:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalSpec.g:329:1: ( ruleVarDeclaration EOF )
            // InternalSpec.g:330:1: ruleVarDeclaration EOF
            {
             before(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationRule()); 
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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalSpec.g:337:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:341:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalSpec.g:342:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalSpec.g:342:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalSpec.g:343:3: ( rule__VarDeclaration__Group__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            // InternalSpec.g:344:3: ( rule__VarDeclaration__Group__0 )
            // InternalSpec.g:344:4: rule__VarDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "ruleBrowser"
    // InternalSpec.g:353:1: ruleBrowser : ( ( rule__Browser__Alternatives ) ) ;
    public final void ruleBrowser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:357:1: ( ( ( rule__Browser__Alternatives ) ) )
            // InternalSpec.g:358:2: ( ( rule__Browser__Alternatives ) )
            {
            // InternalSpec.g:358:2: ( ( rule__Browser__Alternatives ) )
            // InternalSpec.g:359:3: ( rule__Browser__Alternatives )
            {
             before(grammarAccess.getBrowserAccess().getAlternatives()); 
            // InternalSpec.g:360:3: ( rule__Browser__Alternatives )
            // InternalSpec.g:360:4: rule__Browser__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Browser__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBrowserAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBrowser"


    // $ANTLR start "ruleElementType"
    // InternalSpec.g:369:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:373:1: ( ( ( rule__ElementType__Alternatives ) ) )
            // InternalSpec.g:374:2: ( ( rule__ElementType__Alternatives ) )
            {
            // InternalSpec.g:374:2: ( ( rule__ElementType__Alternatives ) )
            // InternalSpec.g:375:3: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // InternalSpec.g:376:3: ( rule__ElementType__Alternatives )
            // InternalSpec.g:376:4: rule__ElementType__Alternatives
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


    // $ANTLR start "ruleProperty"
    // InternalSpec.g:385:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:389:1: ( ( ( rule__Property__Alternatives ) ) )
            // InternalSpec.g:390:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalSpec.g:390:2: ( ( rule__Property__Alternatives ) )
            // InternalSpec.g:391:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalSpec.g:392:3: ( rule__Property__Alternatives )
            // InternalSpec.g:392:4: rule__Property__Alternatives
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


    // $ANTLR start "ruleCondition"
    // InternalSpec.g:401:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:405:1: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalSpec.g:406:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalSpec.g:406:2: ( ( rule__Condition__Alternatives ) )
            // InternalSpec.g:407:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalSpec.g:408:3: ( rule__Condition__Alternatives )
            // InternalSpec.g:408:4: rule__Condition__Alternatives
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


    // $ANTLR start "rule__Command__Alternatives"
    // InternalSpec.g:416:1: rule__Command__Alternatives : ( ( ruleUsingCommand ) | ( ruleOpenCommand ) | ( ruleClickCommand ) | ( ruleSelectCommand ) | ( rulePropertyCommand ) | ( ruleTypeCommand ) | ( ruleSleepCommand ) | ( ( rule__Command__Group_7__0 ) ) | ( ( rule__Command__CustomAssignment_8 ) ) | ( ruleVarDeclaration ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:420:1: ( ( ruleUsingCommand ) | ( ruleOpenCommand ) | ( ruleClickCommand ) | ( ruleSelectCommand ) | ( rulePropertyCommand ) | ( ruleTypeCommand ) | ( ruleSleepCommand ) | ( ( rule__Command__Group_7__0 ) ) | ( ( rule__Command__CustomAssignment_8 ) ) | ( ruleVarDeclaration ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt2=1;
                }
                break;
            case 39:
                {
                alt2=2;
                }
                break;
            case 40:
                {
                alt2=3;
                }
                break;
            case 41:
            case 42:
                {
                alt2=4;
                }
                break;
            case 43:
                {
                alt2=5;
                }
                break;
            case 44:
                {
                alt2=6;
                }
                break;
            case 45:
                {
                alt2=7;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt2=8;
                }
                break;
            case RULE_CUSTOM_COMMAND:
                {
                alt2=9;
                }
                break;
            case 36:
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
                    // InternalSpec.g:421:2: ( ruleUsingCommand )
                    {
                    // InternalSpec.g:421:2: ( ruleUsingCommand )
                    // InternalSpec.g:422:3: ruleUsingCommand
                    {
                     before(grammarAccess.getCommandAccess().getUsingCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUsingCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getUsingCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:427:2: ( ruleOpenCommand )
                    {
                    // InternalSpec.g:427:2: ( ruleOpenCommand )
                    // InternalSpec.g:428:3: ruleOpenCommand
                    {
                     before(grammarAccess.getCommandAccess().getOpenCommandParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOpenCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getOpenCommandParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:433:2: ( ruleClickCommand )
                    {
                    // InternalSpec.g:433:2: ( ruleClickCommand )
                    // InternalSpec.g:434:3: ruleClickCommand
                    {
                     before(grammarAccess.getCommandAccess().getClickCommandParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleClickCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getClickCommandParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:439:2: ( ruleSelectCommand )
                    {
                    // InternalSpec.g:439:2: ( ruleSelectCommand )
                    // InternalSpec.g:440:3: ruleSelectCommand
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
                    // InternalSpec.g:445:2: ( rulePropertyCommand )
                    {
                    // InternalSpec.g:445:2: ( rulePropertyCommand )
                    // InternalSpec.g:446:3: rulePropertyCommand
                    {
                     before(grammarAccess.getCommandAccess().getPropertyCommandParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getPropertyCommandParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSpec.g:451:2: ( ruleTypeCommand )
                    {
                    // InternalSpec.g:451:2: ( ruleTypeCommand )
                    // InternalSpec.g:452:3: ruleTypeCommand
                    {
                     before(grammarAccess.getCommandAccess().getTypeCommandParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getTypeCommandParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSpec.g:457:2: ( ruleSleepCommand )
                    {
                    // InternalSpec.g:457:2: ( ruleSleepCommand )
                    // InternalSpec.g:458:3: ruleSleepCommand
                    {
                     before(grammarAccess.getCommandAccess().getSleepCommandParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleSleepCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getSleepCommandParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSpec.g:463:2: ( ( rule__Command__Group_7__0 ) )
                    {
                    // InternalSpec.g:463:2: ( ( rule__Command__Group_7__0 ) )
                    // InternalSpec.g:464:3: ( rule__Command__Group_7__0 )
                    {
                     before(grammarAccess.getCommandAccess().getGroup_7()); 
                    // InternalSpec.g:465:3: ( rule__Command__Group_7__0 )
                    // InternalSpec.g:465:4: rule__Command__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommandAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSpec.g:469:2: ( ( rule__Command__CustomAssignment_8 ) )
                    {
                    // InternalSpec.g:469:2: ( ( rule__Command__CustomAssignment_8 ) )
                    // InternalSpec.g:470:3: ( rule__Command__CustomAssignment_8 )
                    {
                     before(grammarAccess.getCommandAccess().getCustomAssignment_8()); 
                    // InternalSpec.g:471:3: ( rule__Command__CustomAssignment_8 )
                    // InternalSpec.g:471:4: rule__Command__CustomAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__CustomAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommandAccess().getCustomAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSpec.g:475:2: ( ruleVarDeclaration )
                    {
                    // InternalSpec.g:475:2: ( ruleVarDeclaration )
                    // InternalSpec.g:476:3: ruleVarDeclaration
                    {
                     before(grammarAccess.getCommandAccess().getVarDeclarationParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleVarDeclaration();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getVarDeclarationParserRuleCall_9()); 

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


    // $ANTLR start "rule__OpenCommand__Alternatives_2"
    // InternalSpec.g:485:1: rule__OpenCommand__Alternatives_2 : ( ( ( rule__OpenCommand__ValAssignment_2_0 ) ) | ( ( rule__OpenCommand__VarAssignment_2_1 ) ) );
    public final void rule__OpenCommand__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:489:1: ( ( ( rule__OpenCommand__ValAssignment_2_0 ) ) | ( ( rule__OpenCommand__VarAssignment_2_1 ) ) )
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
                    // InternalSpec.g:490:2: ( ( rule__OpenCommand__ValAssignment_2_0 ) )
                    {
                    // InternalSpec.g:490:2: ( ( rule__OpenCommand__ValAssignment_2_0 ) )
                    // InternalSpec.g:491:3: ( rule__OpenCommand__ValAssignment_2_0 )
                    {
                     before(grammarAccess.getOpenCommandAccess().getValAssignment_2_0()); 
                    // InternalSpec.g:492:3: ( rule__OpenCommand__ValAssignment_2_0 )
                    // InternalSpec.g:492:4: rule__OpenCommand__ValAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpenCommand__ValAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpenCommandAccess().getValAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:496:2: ( ( rule__OpenCommand__VarAssignment_2_1 ) )
                    {
                    // InternalSpec.g:496:2: ( ( rule__OpenCommand__VarAssignment_2_1 ) )
                    // InternalSpec.g:497:3: ( rule__OpenCommand__VarAssignment_2_1 )
                    {
                     before(grammarAccess.getOpenCommandAccess().getVarAssignment_2_1()); 
                    // InternalSpec.g:498:3: ( rule__OpenCommand__VarAssignment_2_1 )
                    // InternalSpec.g:498:4: rule__OpenCommand__VarAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpenCommand__VarAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpenCommandAccess().getVarAssignment_2_1()); 

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
    // $ANTLR end "rule__OpenCommand__Alternatives_2"


    // $ANTLR start "rule__ClickCommand__Alternatives_1"
    // InternalSpec.g:506:1: rule__ClickCommand__Alternatives_1 : ( ( ( rule__ClickCommand__Group_1_0__0 ) ) | ( ( rule__ClickCommand__Group_1_1__0 ) ) );
    public final void rule__ClickCommand__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:510:1: ( ( ( rule__ClickCommand__Group_1_0__0 ) ) | ( ( rule__ClickCommand__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSpec.g:511:2: ( ( rule__ClickCommand__Group_1_0__0 ) )
                    {
                    // InternalSpec.g:511:2: ( ( rule__ClickCommand__Group_1_0__0 ) )
                    // InternalSpec.g:512:3: ( rule__ClickCommand__Group_1_0__0 )
                    {
                     before(grammarAccess.getClickCommandAccess().getGroup_1_0()); 
                    // InternalSpec.g:513:3: ( rule__ClickCommand__Group_1_0__0 )
                    // InternalSpec.g:513:4: rule__ClickCommand__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClickCommand__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickCommandAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:517:2: ( ( rule__ClickCommand__Group_1_1__0 ) )
                    {
                    // InternalSpec.g:517:2: ( ( rule__ClickCommand__Group_1_1__0 ) )
                    // InternalSpec.g:518:3: ( rule__ClickCommand__Group_1_1__0 )
                    {
                     before(grammarAccess.getClickCommandAccess().getGroup_1_1()); 
                    // InternalSpec.g:519:3: ( rule__ClickCommand__Group_1_1__0 )
                    // InternalSpec.g:519:4: rule__ClickCommand__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClickCommand__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickCommandAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__ClickCommand__Alternatives_1"


    // $ANTLR start "rule__SelectCommand__Alternatives"
    // InternalSpec.g:527:1: rule__SelectCommand__Alternatives : ( ( ( rule__SelectCommand__Group_0__0 ) ) | ( ( rule__SelectCommand__Group_1__0 ) ) );
    public final void rule__SelectCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:531:1: ( ( ( rule__SelectCommand__Group_0__0 ) ) | ( ( rule__SelectCommand__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==41) ) {
                alt5=1;
            }
            else if ( (LA5_0==42) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpec.g:532:2: ( ( rule__SelectCommand__Group_0__0 ) )
                    {
                    // InternalSpec.g:532:2: ( ( rule__SelectCommand__Group_0__0 ) )
                    // InternalSpec.g:533:3: ( rule__SelectCommand__Group_0__0 )
                    {
                     before(grammarAccess.getSelectCommandAccess().getGroup_0()); 
                    // InternalSpec.g:534:3: ( rule__SelectCommand__Group_0__0 )
                    // InternalSpec.g:534:4: rule__SelectCommand__Group_0__0
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
                    // InternalSpec.g:538:2: ( ( rule__SelectCommand__Group_1__0 ) )
                    {
                    // InternalSpec.g:538:2: ( ( rule__SelectCommand__Group_1__0 ) )
                    // InternalSpec.g:539:3: ( rule__SelectCommand__Group_1__0 )
                    {
                     before(grammarAccess.getSelectCommandAccess().getGroup_1()); 
                    // InternalSpec.g:540:3: ( rule__SelectCommand__Group_1__0 )
                    // InternalSpec.g:540:4: rule__SelectCommand__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectCommand__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectCommandAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Selector__Alternatives_1"
    // InternalSpec.g:548:1: rule__Selector__Alternatives_1 : ( ( ( rule__Selector__VarAssignment_1_0 ) ) | ( ( rule__Selector__ValAssignment_1_1 ) ) );
    public final void rule__Selector__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:552:1: ( ( ( rule__Selector__VarAssignment_1_0 ) ) | ( ( rule__Selector__ValAssignment_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpec.g:553:2: ( ( rule__Selector__VarAssignment_1_0 ) )
                    {
                    // InternalSpec.g:553:2: ( ( rule__Selector__VarAssignment_1_0 ) )
                    // InternalSpec.g:554:3: ( rule__Selector__VarAssignment_1_0 )
                    {
                     before(grammarAccess.getSelectorAccess().getVarAssignment_1_0()); 
                    // InternalSpec.g:555:3: ( rule__Selector__VarAssignment_1_0 )
                    // InternalSpec.g:555:4: rule__Selector__VarAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__VarAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getVarAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:559:2: ( ( rule__Selector__ValAssignment_1_1 ) )
                    {
                    // InternalSpec.g:559:2: ( ( rule__Selector__ValAssignment_1_1 ) )
                    // InternalSpec.g:560:3: ( rule__Selector__ValAssignment_1_1 )
                    {
                     before(grammarAccess.getSelectorAccess().getValAssignment_1_1()); 
                    // InternalSpec.g:561:3: ( rule__Selector__ValAssignment_1_1 )
                    // InternalSpec.g:561:4: rule__Selector__ValAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__ValAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getValAssignment_1_1()); 

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
    // $ANTLR end "rule__Selector__Alternatives_1"


    // $ANTLR start "rule__PropertyCommand__Alternatives_3"
    // InternalSpec.g:569:1: rule__PropertyCommand__Alternatives_3 : ( ( ( rule__PropertyCommand__ValAssignment_3_0 ) ) | ( ( rule__PropertyCommand__VarAssignment_3_1 ) ) );
    public final void rule__PropertyCommand__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:573:1: ( ( ( rule__PropertyCommand__ValAssignment_3_0 ) ) | ( ( rule__PropertyCommand__VarAssignment_3_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSpec.g:574:2: ( ( rule__PropertyCommand__ValAssignment_3_0 ) )
                    {
                    // InternalSpec.g:574:2: ( ( rule__PropertyCommand__ValAssignment_3_0 ) )
                    // InternalSpec.g:575:3: ( rule__PropertyCommand__ValAssignment_3_0 )
                    {
                     before(grammarAccess.getPropertyCommandAccess().getValAssignment_3_0()); 
                    // InternalSpec.g:576:3: ( rule__PropertyCommand__ValAssignment_3_0 )
                    // InternalSpec.g:576:4: rule__PropertyCommand__ValAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyCommand__ValAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyCommandAccess().getValAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:580:2: ( ( rule__PropertyCommand__VarAssignment_3_1 ) )
                    {
                    // InternalSpec.g:580:2: ( ( rule__PropertyCommand__VarAssignment_3_1 ) )
                    // InternalSpec.g:581:3: ( rule__PropertyCommand__VarAssignment_3_1 )
                    {
                     before(grammarAccess.getPropertyCommandAccess().getVarAssignment_3_1()); 
                    // InternalSpec.g:582:3: ( rule__PropertyCommand__VarAssignment_3_1 )
                    // InternalSpec.g:582:4: rule__PropertyCommand__VarAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyCommand__VarAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyCommandAccess().getVarAssignment_3_1()); 

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
    // $ANTLR end "rule__PropertyCommand__Alternatives_3"


    // $ANTLR start "rule__TypeCommand__Alternatives_1"
    // InternalSpec.g:590:1: rule__TypeCommand__Alternatives_1 : ( ( ( rule__TypeCommand__StrAssignment_1_0 ) ) | ( ( rule__TypeCommand__VarAssignment_1_1 ) ) );
    public final void rule__TypeCommand__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:594:1: ( ( ( rule__TypeCommand__StrAssignment_1_0 ) ) | ( ( rule__TypeCommand__VarAssignment_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpec.g:595:2: ( ( rule__TypeCommand__StrAssignment_1_0 ) )
                    {
                    // InternalSpec.g:595:2: ( ( rule__TypeCommand__StrAssignment_1_0 ) )
                    // InternalSpec.g:596:3: ( rule__TypeCommand__StrAssignment_1_0 )
                    {
                     before(grammarAccess.getTypeCommandAccess().getStrAssignment_1_0()); 
                    // InternalSpec.g:597:3: ( rule__TypeCommand__StrAssignment_1_0 )
                    // InternalSpec.g:597:4: rule__TypeCommand__StrAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeCommand__StrAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeCommandAccess().getStrAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:601:2: ( ( rule__TypeCommand__VarAssignment_1_1 ) )
                    {
                    // InternalSpec.g:601:2: ( ( rule__TypeCommand__VarAssignment_1_1 ) )
                    // InternalSpec.g:602:3: ( rule__TypeCommand__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getTypeCommandAccess().getVarAssignment_1_1()); 
                    // InternalSpec.g:603:3: ( rule__TypeCommand__VarAssignment_1_1 )
                    // InternalSpec.g:603:4: rule__TypeCommand__VarAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeCommand__VarAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeCommandAccess().getVarAssignment_1_1()); 

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
    // $ANTLR end "rule__TypeCommand__Alternatives_1"


    // $ANTLR start "rule__SleepCommand__Alternatives_3"
    // InternalSpec.g:611:1: rule__SleepCommand__Alternatives_3 : ( ( 'second' ) | ( 'seconds' ) );
    public final void rule__SleepCommand__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:615:1: ( ( 'second' ) | ( 'seconds' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            else if ( (LA9_0==13) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpec.g:616:2: ( 'second' )
                    {
                    // InternalSpec.g:616:2: ( 'second' )
                    // InternalSpec.g:617:3: 'second'
                    {
                     before(grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:622:2: ( 'seconds' )
                    {
                    // InternalSpec.g:622:2: ( 'seconds' )
                    // InternalSpec.g:623:3: 'seconds'
                    {
                     before(grammarAccess.getSleepCommandAccess().getSecondsKeyword_3_1()); 
                    match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__Browser__Alternatives"
    // InternalSpec.g:632:1: rule__Browser__Alternatives : ( ( ( 'Chrome' ) ) | ( ( 'Firefox' ) ) | ( ( 'Explorer' ) ) | ( ( 'Edge' ) ) | ( ( 'Opera' ) ) | ( ( 'Safari' ) ) );
    public final void rule__Browser__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:636:1: ( ( ( 'Chrome' ) ) | ( ( 'Firefox' ) ) | ( ( 'Explorer' ) ) | ( ( 'Edge' ) ) | ( ( 'Opera' ) ) | ( ( 'Safari' ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt10=1;
                }
                break;
            case 15:
                {
                alt10=2;
                }
                break;
            case 16:
                {
                alt10=3;
                }
                break;
            case 17:
                {
                alt10=4;
                }
                break;
            case 18:
                {
                alt10=5;
                }
                break;
            case 19:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSpec.g:637:2: ( ( 'Chrome' ) )
                    {
                    // InternalSpec.g:637:2: ( ( 'Chrome' ) )
                    // InternalSpec.g:638:3: ( 'Chrome' )
                    {
                     before(grammarAccess.getBrowserAccess().getChromeEnumLiteralDeclaration_0()); 
                    // InternalSpec.g:639:3: ( 'Chrome' )
                    // InternalSpec.g:639:4: 'Chrome'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getChromeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:643:2: ( ( 'Firefox' ) )
                    {
                    // InternalSpec.g:643:2: ( ( 'Firefox' ) )
                    // InternalSpec.g:644:3: ( 'Firefox' )
                    {
                     before(grammarAccess.getBrowserAccess().getFirefoxEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:645:3: ( 'Firefox' )
                    // InternalSpec.g:645:4: 'Firefox'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getFirefoxEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:649:2: ( ( 'Explorer' ) )
                    {
                    // InternalSpec.g:649:2: ( ( 'Explorer' ) )
                    // InternalSpec.g:650:3: ( 'Explorer' )
                    {
                     before(grammarAccess.getBrowserAccess().getExplorerEnumLiteralDeclaration_2()); 
                    // InternalSpec.g:651:3: ( 'Explorer' )
                    // InternalSpec.g:651:4: 'Explorer'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getExplorerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:655:2: ( ( 'Edge' ) )
                    {
                    // InternalSpec.g:655:2: ( ( 'Edge' ) )
                    // InternalSpec.g:656:3: ( 'Edge' )
                    {
                     before(grammarAccess.getBrowserAccess().getEdgeEnumLiteralDeclaration_3()); 
                    // InternalSpec.g:657:3: ( 'Edge' )
                    // InternalSpec.g:657:4: 'Edge'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getEdgeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:661:2: ( ( 'Opera' ) )
                    {
                    // InternalSpec.g:661:2: ( ( 'Opera' ) )
                    // InternalSpec.g:662:3: ( 'Opera' )
                    {
                     before(grammarAccess.getBrowserAccess().getOperaEnumLiteralDeclaration_4()); 
                    // InternalSpec.g:663:3: ( 'Opera' )
                    // InternalSpec.g:663:4: 'Opera'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getOperaEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSpec.g:667:2: ( ( 'Safari' ) )
                    {
                    // InternalSpec.g:667:2: ( ( 'Safari' ) )
                    // InternalSpec.g:668:3: ( 'Safari' )
                    {
                     before(grammarAccess.getBrowserAccess().getSafariEnumLiteralDeclaration_5()); 
                    // InternalSpec.g:669:3: ( 'Safari' )
                    // InternalSpec.g:669:4: 'Safari'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getSafariEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__Browser__Alternatives"


    // $ANTLR start "rule__ElementType__Alternatives"
    // InternalSpec.g:677:1: rule__ElementType__Alternatives : ( ( ( 'button' ) ) | ( ( 'element' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) | ( ( 'textarea' ) ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:681:1: ( ( ( 'button' ) ) | ( ( 'element' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) | ( ( 'textarea' ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt11=1;
                }
                break;
            case 21:
                {
                alt11=2;
                }
                break;
            case 22:
                {
                alt11=3;
                }
                break;
            case 23:
                {
                alt11=4;
                }
                break;
            case 24:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSpec.g:682:2: ( ( 'button' ) )
                    {
                    // InternalSpec.g:682:2: ( ( 'button' ) )
                    // InternalSpec.g:683:3: ( 'button' )
                    {
                     before(grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0()); 
                    // InternalSpec.g:684:3: ( 'button' )
                    // InternalSpec.g:684:4: 'button'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:688:2: ( ( 'element' ) )
                    {
                    // InternalSpec.g:688:2: ( ( 'element' ) )
                    // InternalSpec.g:689:3: ( 'element' )
                    {
                     before(grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:690:3: ( 'element' )
                    // InternalSpec.g:690:4: 'element'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:694:2: ( ( 'link' ) )
                    {
                    // InternalSpec.g:694:2: ( ( 'link' ) )
                    // InternalSpec.g:695:3: ( 'link' )
                    {
                     before(grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2()); 
                    // InternalSpec.g:696:3: ( 'link' )
                    // InternalSpec.g:696:4: 'link'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:700:2: ( ( 'input' ) )
                    {
                    // InternalSpec.g:700:2: ( ( 'input' ) )
                    // InternalSpec.g:701:3: ( 'input' )
                    {
                     before(grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3()); 
                    // InternalSpec.g:702:3: ( 'input' )
                    // InternalSpec.g:702:4: 'input'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:706:2: ( ( 'textarea' ) )
                    {
                    // InternalSpec.g:706:2: ( ( 'textarea' ) )
                    // InternalSpec.g:707:3: ( 'textarea' )
                    {
                     before(grammarAccess.getElementTypeAccess().getTextareaEnumLiteralDeclaration_4()); 
                    // InternalSpec.g:708:3: ( 'textarea' )
                    // InternalSpec.g:708:4: 'textarea'
                    {
                    match(input,24,FOLLOW_2); 

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


    // $ANTLR start "rule__Property__Alternatives"
    // InternalSpec.g:716:1: rule__Property__Alternatives : ( ( ( 'text' ) ) | ( ( 'value' ) ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:720:1: ( ( ( 'text' ) ) | ( ( 'value' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpec.g:721:2: ( ( 'text' ) )
                    {
                    // InternalSpec.g:721:2: ( ( 'text' ) )
                    // InternalSpec.g:722:3: ( 'text' )
                    {
                     before(grammarAccess.getPropertyAccess().getTextEnumLiteralDeclaration_0()); 
                    // InternalSpec.g:723:3: ( 'text' )
                    // InternalSpec.g:723:4: 'text'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyAccess().getTextEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:727:2: ( ( 'value' ) )
                    {
                    // InternalSpec.g:727:2: ( ( 'value' ) )
                    // InternalSpec.g:728:3: ( 'value' )
                    {
                     before(grammarAccess.getPropertyAccess().getValueEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:729:3: ( 'value' )
                    // InternalSpec.g:729:4: 'value'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyAccess().getValueEnumLiteralDeclaration_1()); 

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
    // InternalSpec.g:737:1: rule__Condition__Alternatives : ( ( ( 'should be' ) ) | ( ( 'should not be' ) ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:741:1: ( ( ( 'should be' ) ) | ( ( 'should not be' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSpec.g:742:2: ( ( 'should be' ) )
                    {
                    // InternalSpec.g:742:2: ( ( 'should be' ) )
                    // InternalSpec.g:743:3: ( 'should be' )
                    {
                     before(grammarAccess.getConditionAccess().getShouldBeEnumLiteralDeclaration_0()); 
                    // InternalSpec.g:744:3: ( 'should be' )
                    // InternalSpec.g:744:4: 'should be'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionAccess().getShouldBeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:748:2: ( ( 'should not be' ) )
                    {
                    // InternalSpec.g:748:2: ( ( 'should not be' ) )
                    // InternalSpec.g:749:3: ( 'should not be' )
                    {
                     before(grammarAccess.getConditionAccess().getShouldNotBeEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:750:3: ( 'should not be' )
                    // InternalSpec.g:750:4: 'should not be'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionAccess().getShouldNotBeEnumLiteralDeclaration_1()); 

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


    // $ANTLR start "rule__Command__Group_7__0"
    // InternalSpec.g:758:1: rule__Command__Group_7__0 : rule__Command__Group_7__0__Impl rule__Command__Group_7__1 ;
    public final void rule__Command__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:762:1: ( rule__Command__Group_7__0__Impl rule__Command__Group_7__1 )
            // InternalSpec.g:763:2: rule__Command__Group_7__0__Impl rule__Command__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Command__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group_7__1();

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
    // $ANTLR end "rule__Command__Group_7__0"


    // $ANTLR start "rule__Command__Group_7__0__Impl"
    // InternalSpec.g:770:1: rule__Command__Group_7__0__Impl : ( () ) ;
    public final void rule__Command__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:774:1: ( ( () ) )
            // InternalSpec.g:775:1: ( () )
            {
            // InternalSpec.g:775:1: ( () )
            // InternalSpec.g:776:2: ()
            {
             before(grammarAccess.getCommandAccess().getCommandAction_7_0()); 
            // InternalSpec.g:777:2: ()
            // InternalSpec.g:777:3: 
            {
            }

             after(grammarAccess.getCommandAccess().getCommandAction_7_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_7__0__Impl"


    // $ANTLR start "rule__Command__Group_7__1"
    // InternalSpec.g:785:1: rule__Command__Group_7__1 : rule__Command__Group_7__1__Impl ;
    public final void rule__Command__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:789:1: ( rule__Command__Group_7__1__Impl )
            // InternalSpec.g:790:2: rule__Command__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group_7__1__Impl();

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
    // $ANTLR end "rule__Command__Group_7__1"


    // $ANTLR start "rule__Command__Group_7__1__Impl"
    // InternalSpec.g:796:1: rule__Command__Group_7__1__Impl : ( RULE_SL_COMMENT ) ;
    public final void rule__Command__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:800:1: ( ( RULE_SL_COMMENT ) )
            // InternalSpec.g:801:1: ( RULE_SL_COMMENT )
            {
            // InternalSpec.g:801:1: ( RULE_SL_COMMENT )
            // InternalSpec.g:802:2: RULE_SL_COMMENT
            {
             before(grammarAccess.getCommandAccess().getSL_COMMENTTerminalRuleCall_7_1()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getSL_COMMENTTerminalRuleCall_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_7__1__Impl"


    // $ANTLR start "rule__UsingCommand__Group__0"
    // InternalSpec.g:812:1: rule__UsingCommand__Group__0 : rule__UsingCommand__Group__0__Impl rule__UsingCommand__Group__1 ;
    public final void rule__UsingCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:816:1: ( rule__UsingCommand__Group__0__Impl rule__UsingCommand__Group__1 )
            // InternalSpec.g:817:2: rule__UsingCommand__Group__0__Impl rule__UsingCommand__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__UsingCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsingCommand__Group__1();

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
    // $ANTLR end "rule__UsingCommand__Group__0"


    // $ANTLR start "rule__UsingCommand__Group__0__Impl"
    // InternalSpec.g:824:1: rule__UsingCommand__Group__0__Impl : ( ( rule__UsingCommand__NameAssignment_0 ) ) ;
    public final void rule__UsingCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:828:1: ( ( ( rule__UsingCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:829:1: ( ( rule__UsingCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:829:1: ( ( rule__UsingCommand__NameAssignment_0 ) )
            // InternalSpec.g:830:2: ( rule__UsingCommand__NameAssignment_0 )
            {
             before(grammarAccess.getUsingCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:831:2: ( rule__UsingCommand__NameAssignment_0 )
            // InternalSpec.g:831:3: rule__UsingCommand__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UsingCommand__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUsingCommandAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsingCommand__Group__0__Impl"


    // $ANTLR start "rule__UsingCommand__Group__1"
    // InternalSpec.g:839:1: rule__UsingCommand__Group__1 : rule__UsingCommand__Group__1__Impl ;
    public final void rule__UsingCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:843:1: ( rule__UsingCommand__Group__1__Impl )
            // InternalSpec.g:844:2: rule__UsingCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsingCommand__Group__1__Impl();

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
    // $ANTLR end "rule__UsingCommand__Group__1"


    // $ANTLR start "rule__UsingCommand__Group__1__Impl"
    // InternalSpec.g:850:1: rule__UsingCommand__Group__1__Impl : ( ( rule__UsingCommand__BrowserAssignment_1 ) ) ;
    public final void rule__UsingCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:854:1: ( ( ( rule__UsingCommand__BrowserAssignment_1 ) ) )
            // InternalSpec.g:855:1: ( ( rule__UsingCommand__BrowserAssignment_1 ) )
            {
            // InternalSpec.g:855:1: ( ( rule__UsingCommand__BrowserAssignment_1 ) )
            // InternalSpec.g:856:2: ( rule__UsingCommand__BrowserAssignment_1 )
            {
             before(grammarAccess.getUsingCommandAccess().getBrowserAssignment_1()); 
            // InternalSpec.g:857:2: ( rule__UsingCommand__BrowserAssignment_1 )
            // InternalSpec.g:857:3: rule__UsingCommand__BrowserAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UsingCommand__BrowserAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUsingCommandAccess().getBrowserAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsingCommand__Group__1__Impl"


    // $ANTLR start "rule__OpenCommand__Group__0"
    // InternalSpec.g:866:1: rule__OpenCommand__Group__0 : rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1 ;
    public final void rule__OpenCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:870:1: ( rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1 )
            // InternalSpec.g:871:2: rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSpec.g:878:1: rule__OpenCommand__Group__0__Impl : ( () ) ;
    public final void rule__OpenCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:882:1: ( ( () ) )
            // InternalSpec.g:883:1: ( () )
            {
            // InternalSpec.g:883:1: ( () )
            // InternalSpec.g:884:2: ()
            {
             before(grammarAccess.getOpenCommandAccess().getOpenCommandAction_0()); 
            // InternalSpec.g:885:2: ()
            // InternalSpec.g:885:3: 
            {
            }

             after(grammarAccess.getOpenCommandAccess().getOpenCommandAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenCommand__Group__0__Impl"


    // $ANTLR start "rule__OpenCommand__Group__1"
    // InternalSpec.g:893:1: rule__OpenCommand__Group__1 : rule__OpenCommand__Group__1__Impl rule__OpenCommand__Group__2 ;
    public final void rule__OpenCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:897:1: ( rule__OpenCommand__Group__1__Impl rule__OpenCommand__Group__2 )
            // InternalSpec.g:898:2: rule__OpenCommand__Group__1__Impl rule__OpenCommand__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__OpenCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpenCommand__Group__2();

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
    // InternalSpec.g:905:1: rule__OpenCommand__Group__1__Impl : ( ( rule__OpenCommand__NameAssignment_1 ) ) ;
    public final void rule__OpenCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:909:1: ( ( ( rule__OpenCommand__NameAssignment_1 ) ) )
            // InternalSpec.g:910:1: ( ( rule__OpenCommand__NameAssignment_1 ) )
            {
            // InternalSpec.g:910:1: ( ( rule__OpenCommand__NameAssignment_1 ) )
            // InternalSpec.g:911:2: ( rule__OpenCommand__NameAssignment_1 )
            {
             before(grammarAccess.getOpenCommandAccess().getNameAssignment_1()); 
            // InternalSpec.g:912:2: ( rule__OpenCommand__NameAssignment_1 )
            // InternalSpec.g:912:3: rule__OpenCommand__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OpenCommand__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOpenCommandAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__OpenCommand__Group__2"
    // InternalSpec.g:920:1: rule__OpenCommand__Group__2 : rule__OpenCommand__Group__2__Impl ;
    public final void rule__OpenCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:924:1: ( rule__OpenCommand__Group__2__Impl )
            // InternalSpec.g:925:2: rule__OpenCommand__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpenCommand__Group__2__Impl();

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
    // $ANTLR end "rule__OpenCommand__Group__2"


    // $ANTLR start "rule__OpenCommand__Group__2__Impl"
    // InternalSpec.g:931:1: rule__OpenCommand__Group__2__Impl : ( ( rule__OpenCommand__Alternatives_2 ) ) ;
    public final void rule__OpenCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:935:1: ( ( ( rule__OpenCommand__Alternatives_2 ) ) )
            // InternalSpec.g:936:1: ( ( rule__OpenCommand__Alternatives_2 ) )
            {
            // InternalSpec.g:936:1: ( ( rule__OpenCommand__Alternatives_2 ) )
            // InternalSpec.g:937:2: ( rule__OpenCommand__Alternatives_2 )
            {
             before(grammarAccess.getOpenCommandAccess().getAlternatives_2()); 
            // InternalSpec.g:938:2: ( rule__OpenCommand__Alternatives_2 )
            // InternalSpec.g:938:3: rule__OpenCommand__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__OpenCommand__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getOpenCommandAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenCommand__Group__2__Impl"


    // $ANTLR start "rule__ClickCommand__Group__0"
    // InternalSpec.g:947:1: rule__ClickCommand__Group__0 : rule__ClickCommand__Group__0__Impl rule__ClickCommand__Group__1 ;
    public final void rule__ClickCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:951:1: ( rule__ClickCommand__Group__0__Impl rule__ClickCommand__Group__1 )
            // InternalSpec.g:952:2: rule__ClickCommand__Group__0__Impl rule__ClickCommand__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ClickCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickCommand__Group__1();

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
    // $ANTLR end "rule__ClickCommand__Group__0"


    // $ANTLR start "rule__ClickCommand__Group__0__Impl"
    // InternalSpec.g:959:1: rule__ClickCommand__Group__0__Impl : ( ( rule__ClickCommand__NameAssignment_0 ) ) ;
    public final void rule__ClickCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:963:1: ( ( ( rule__ClickCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:964:1: ( ( rule__ClickCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:964:1: ( ( rule__ClickCommand__NameAssignment_0 ) )
            // InternalSpec.g:965:2: ( rule__ClickCommand__NameAssignment_0 )
            {
             before(grammarAccess.getClickCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:966:2: ( rule__ClickCommand__NameAssignment_0 )
            // InternalSpec.g:966:3: rule__ClickCommand__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ClickCommand__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClickCommandAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group__0__Impl"


    // $ANTLR start "rule__ClickCommand__Group__1"
    // InternalSpec.g:974:1: rule__ClickCommand__Group__1 : rule__ClickCommand__Group__1__Impl ;
    public final void rule__ClickCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:978:1: ( rule__ClickCommand__Group__1__Impl )
            // InternalSpec.g:979:2: rule__ClickCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickCommand__Group__1__Impl();

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
    // $ANTLR end "rule__ClickCommand__Group__1"


    // $ANTLR start "rule__ClickCommand__Group__1__Impl"
    // InternalSpec.g:985:1: rule__ClickCommand__Group__1__Impl : ( ( rule__ClickCommand__Alternatives_1 ) ) ;
    public final void rule__ClickCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:989:1: ( ( ( rule__ClickCommand__Alternatives_1 ) ) )
            // InternalSpec.g:990:1: ( ( rule__ClickCommand__Alternatives_1 ) )
            {
            // InternalSpec.g:990:1: ( ( rule__ClickCommand__Alternatives_1 ) )
            // InternalSpec.g:991:2: ( rule__ClickCommand__Alternatives_1 )
            {
             before(grammarAccess.getClickCommandAccess().getAlternatives_1()); 
            // InternalSpec.g:992:2: ( rule__ClickCommand__Alternatives_1 )
            // InternalSpec.g:992:3: rule__ClickCommand__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ClickCommand__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getClickCommandAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group__1__Impl"


    // $ANTLR start "rule__ClickCommand__Group_1_0__0"
    // InternalSpec.g:1001:1: rule__ClickCommand__Group_1_0__0 : rule__ClickCommand__Group_1_0__0__Impl rule__ClickCommand__Group_1_0__1 ;
    public final void rule__ClickCommand__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1005:1: ( rule__ClickCommand__Group_1_0__0__Impl rule__ClickCommand__Group_1_0__1 )
            // InternalSpec.g:1006:2: rule__ClickCommand__Group_1_0__0__Impl rule__ClickCommand__Group_1_0__1
            {
            pushFollow(FOLLOW_9);
            rule__ClickCommand__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickCommand__Group_1_0__1();

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
    // $ANTLR end "rule__ClickCommand__Group_1_0__0"


    // $ANTLR start "rule__ClickCommand__Group_1_0__0__Impl"
    // InternalSpec.g:1013:1: rule__ClickCommand__Group_1_0__0__Impl : ( 'on' ) ;
    public final void rule__ClickCommand__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1017:1: ( ( 'on' ) )
            // InternalSpec.g:1018:1: ( 'on' )
            {
            // InternalSpec.g:1018:1: ( 'on' )
            // InternalSpec.g:1019:2: 'on'
            {
             before(grammarAccess.getClickCommandAccess().getOnKeyword_1_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClickCommandAccess().getOnKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_1_0__0__Impl"


    // $ANTLR start "rule__ClickCommand__Group_1_0__1"
    // InternalSpec.g:1028:1: rule__ClickCommand__Group_1_0__1 : rule__ClickCommand__Group_1_0__1__Impl ;
    public final void rule__ClickCommand__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1032:1: ( rule__ClickCommand__Group_1_0__1__Impl )
            // InternalSpec.g:1033:2: rule__ClickCommand__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickCommand__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__ClickCommand__Group_1_0__1"


    // $ANTLR start "rule__ClickCommand__Group_1_0__1__Impl"
    // InternalSpec.g:1039:1: rule__ClickCommand__Group_1_0__1__Impl : ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) ) ;
    public final void rule__ClickCommand__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1043:1: ( ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) ) )
            // InternalSpec.g:1044:1: ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) )
            {
            // InternalSpec.g:1044:1: ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) )
            // InternalSpec.g:1045:2: ( rule__ClickCommand__SelectorAssignment_1_0_1 )
            {
             before(grammarAccess.getClickCommandAccess().getSelectorAssignment_1_0_1()); 
            // InternalSpec.g:1046:2: ( rule__ClickCommand__SelectorAssignment_1_0_1 )
            // InternalSpec.g:1046:3: rule__ClickCommand__SelectorAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ClickCommand__SelectorAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getClickCommandAccess().getSelectorAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_1_0__1__Impl"


    // $ANTLR start "rule__ClickCommand__Group_1_1__0"
    // InternalSpec.g:1055:1: rule__ClickCommand__Group_1_1__0 : rule__ClickCommand__Group_1_1__0__Impl rule__ClickCommand__Group_1_1__1 ;
    public final void rule__ClickCommand__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1059:1: ( rule__ClickCommand__Group_1_1__0__Impl rule__ClickCommand__Group_1_1__1 )
            // InternalSpec.g:1060:2: rule__ClickCommand__Group_1_1__0__Impl rule__ClickCommand__Group_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ClickCommand__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickCommand__Group_1_1__1();

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
    // $ANTLR end "rule__ClickCommand__Group_1_1__0"


    // $ANTLR start "rule__ClickCommand__Group_1_1__0__Impl"
    // InternalSpec.g:1067:1: rule__ClickCommand__Group_1_1__0__Impl : ( 'at' ) ;
    public final void rule__ClickCommand__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1071:1: ( ( 'at' ) )
            // InternalSpec.g:1072:1: ( 'at' )
            {
            // InternalSpec.g:1072:1: ( 'at' )
            // InternalSpec.g:1073:2: 'at'
            {
             before(grammarAccess.getClickCommandAccess().getAtKeyword_1_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getClickCommandAccess().getAtKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_1_1__0__Impl"


    // $ANTLR start "rule__ClickCommand__Group_1_1__1"
    // InternalSpec.g:1082:1: rule__ClickCommand__Group_1_1__1 : rule__ClickCommand__Group_1_1__1__Impl ;
    public final void rule__ClickCommand__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1086:1: ( rule__ClickCommand__Group_1_1__1__Impl )
            // InternalSpec.g:1087:2: rule__ClickCommand__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickCommand__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__ClickCommand__Group_1_1__1"


    // $ANTLR start "rule__ClickCommand__Group_1_1__1__Impl"
    // InternalSpec.g:1093:1: rule__ClickCommand__Group_1_1__1__Impl : ( ( rule__ClickCommand__PointAssignment_1_1_1 ) ) ;
    public final void rule__ClickCommand__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1097:1: ( ( ( rule__ClickCommand__PointAssignment_1_1_1 ) ) )
            // InternalSpec.g:1098:1: ( ( rule__ClickCommand__PointAssignment_1_1_1 ) )
            {
            // InternalSpec.g:1098:1: ( ( rule__ClickCommand__PointAssignment_1_1_1 ) )
            // InternalSpec.g:1099:2: ( rule__ClickCommand__PointAssignment_1_1_1 )
            {
             before(grammarAccess.getClickCommandAccess().getPointAssignment_1_1_1()); 
            // InternalSpec.g:1100:2: ( rule__ClickCommand__PointAssignment_1_1_1 )
            // InternalSpec.g:1100:3: rule__ClickCommand__PointAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ClickCommand__PointAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClickCommandAccess().getPointAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__Group_1_1__1__Impl"


    // $ANTLR start "rule__SelectCommand__Group_0__0"
    // InternalSpec.g:1109:1: rule__SelectCommand__Group_0__0 : rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1 ;
    public final void rule__SelectCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1113:1: ( rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1 )
            // InternalSpec.g:1114:2: rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSpec.g:1121:1: rule__SelectCommand__Group_0__0__Impl : ( ( rule__SelectCommand__NameAssignment_0_0 ) ) ;
    public final void rule__SelectCommand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1125:1: ( ( ( rule__SelectCommand__NameAssignment_0_0 ) ) )
            // InternalSpec.g:1126:1: ( ( rule__SelectCommand__NameAssignment_0_0 ) )
            {
            // InternalSpec.g:1126:1: ( ( rule__SelectCommand__NameAssignment_0_0 ) )
            // InternalSpec.g:1127:2: ( rule__SelectCommand__NameAssignment_0_0 )
            {
             before(grammarAccess.getSelectCommandAccess().getNameAssignment_0_0()); 
            // InternalSpec.g:1128:2: ( rule__SelectCommand__NameAssignment_0_0 )
            // InternalSpec.g:1128:3: rule__SelectCommand__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectCommand__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectCommandAccess().getNameAssignment_0_0()); 

            }


            }

        }
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
    // InternalSpec.g:1136:1: rule__SelectCommand__Group_0__1 : rule__SelectCommand__Group_0__1__Impl ;
    public final void rule__SelectCommand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1140:1: ( rule__SelectCommand__Group_0__1__Impl )
            // InternalSpec.g:1141:2: rule__SelectCommand__Group_0__1__Impl
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
    // InternalSpec.g:1147:1: rule__SelectCommand__Group_0__1__Impl : ( ( rule__SelectCommand__ValueAssignment_0_1 ) ) ;
    public final void rule__SelectCommand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1151:1: ( ( ( rule__SelectCommand__ValueAssignment_0_1 ) ) )
            // InternalSpec.g:1152:1: ( ( rule__SelectCommand__ValueAssignment_0_1 ) )
            {
            // InternalSpec.g:1152:1: ( ( rule__SelectCommand__ValueAssignment_0_1 ) )
            // InternalSpec.g:1153:2: ( rule__SelectCommand__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSelectCommandAccess().getValueAssignment_0_1()); 
            // InternalSpec.g:1154:2: ( rule__SelectCommand__ValueAssignment_0_1 )
            // InternalSpec.g:1154:3: rule__SelectCommand__ValueAssignment_0_1
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
    // InternalSpec.g:1163:1: rule__SelectCommand__Group_1__0 : rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1 ;
    public final void rule__SelectCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1167:1: ( rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1 )
            // InternalSpec.g:1168:2: rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSpec.g:1175:1: rule__SelectCommand__Group_1__0__Impl : ( ( rule__SelectCommand__NameAssignment_1_0 ) ) ;
    public final void rule__SelectCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1179:1: ( ( ( rule__SelectCommand__NameAssignment_1_0 ) ) )
            // InternalSpec.g:1180:1: ( ( rule__SelectCommand__NameAssignment_1_0 ) )
            {
            // InternalSpec.g:1180:1: ( ( rule__SelectCommand__NameAssignment_1_0 ) )
            // InternalSpec.g:1181:2: ( rule__SelectCommand__NameAssignment_1_0 )
            {
             before(grammarAccess.getSelectCommandAccess().getNameAssignment_1_0()); 
            // InternalSpec.g:1182:2: ( rule__SelectCommand__NameAssignment_1_0 )
            // InternalSpec.g:1182:3: rule__SelectCommand__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectCommand__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectCommandAccess().getNameAssignment_1_0()); 

            }


            }

        }
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
    // InternalSpec.g:1190:1: rule__SelectCommand__Group_1__1 : rule__SelectCommand__Group_1__1__Impl rule__SelectCommand__Group_1__2 ;
    public final void rule__SelectCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1194:1: ( rule__SelectCommand__Group_1__1__Impl rule__SelectCommand__Group_1__2 )
            // InternalSpec.g:1195:2: rule__SelectCommand__Group_1__1__Impl rule__SelectCommand__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__SelectCommand__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectCommand__Group_1__2();

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
    // InternalSpec.g:1202:1: rule__SelectCommand__Group_1__1__Impl : ( ( 'visible' )? ) ;
    public final void rule__SelectCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1206:1: ( ( ( 'visible' )? ) )
            // InternalSpec.g:1207:1: ( ( 'visible' )? )
            {
            // InternalSpec.g:1207:1: ( ( 'visible' )? )
            // InternalSpec.g:1208:2: ( 'visible' )?
            {
             before(grammarAccess.getSelectCommandAccess().getVisibleKeyword_1_1()); 
            // InternalSpec.g:1209:2: ( 'visible' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpec.g:1209:3: 'visible'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSelectCommandAccess().getVisibleKeyword_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SelectCommand__Group_1__2"
    // InternalSpec.g:1217:1: rule__SelectCommand__Group_1__2 : rule__SelectCommand__Group_1__2__Impl ;
    public final void rule__SelectCommand__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1221:1: ( rule__SelectCommand__Group_1__2__Impl )
            // InternalSpec.g:1222:2: rule__SelectCommand__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectCommand__Group_1__2__Impl();

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
    // $ANTLR end "rule__SelectCommand__Group_1__2"


    // $ANTLR start "rule__SelectCommand__Group_1__2__Impl"
    // InternalSpec.g:1228:1: rule__SelectCommand__Group_1__2__Impl : ( ( rule__SelectCommand__ValueAssignment_1_2 ) ) ;
    public final void rule__SelectCommand__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1232:1: ( ( ( rule__SelectCommand__ValueAssignment_1_2 ) ) )
            // InternalSpec.g:1233:1: ( ( rule__SelectCommand__ValueAssignment_1_2 ) )
            {
            // InternalSpec.g:1233:1: ( ( rule__SelectCommand__ValueAssignment_1_2 ) )
            // InternalSpec.g:1234:2: ( rule__SelectCommand__ValueAssignment_1_2 )
            {
             before(grammarAccess.getSelectCommandAccess().getValueAssignment_1_2()); 
            // InternalSpec.g:1235:2: ( rule__SelectCommand__ValueAssignment_1_2 )
            // InternalSpec.g:1235:3: rule__SelectCommand__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectCommand__ValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectCommandAccess().getValueAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__Group_1__2__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // InternalSpec.g:1244:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1248:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalSpec.g:1249:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__1();

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
    // $ANTLR end "rule__Selector__Group__0"


    // $ANTLR start "rule__Selector__Group__0__Impl"
    // InternalSpec.g:1256:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__TypeAssignment_0 )? ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1260:1: ( ( ( rule__Selector__TypeAssignment_0 )? ) )
            // InternalSpec.g:1261:1: ( ( rule__Selector__TypeAssignment_0 )? )
            {
            // InternalSpec.g:1261:1: ( ( rule__Selector__TypeAssignment_0 )? )
            // InternalSpec.g:1262:2: ( rule__Selector__TypeAssignment_0 )?
            {
             before(grammarAccess.getSelectorAccess().getTypeAssignment_0()); 
            // InternalSpec.g:1263:2: ( rule__Selector__TypeAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=20 && LA15_0<=24)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSpec.g:1263:3: rule__Selector__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__TypeAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0__Impl"


    // $ANTLR start "rule__Selector__Group__1"
    // InternalSpec.g:1271:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1275:1: ( rule__Selector__Group__1__Impl )
            // InternalSpec.g:1276:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__1__Impl();

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
    // $ANTLR end "rule__Selector__Group__1"


    // $ANTLR start "rule__Selector__Group__1__Impl"
    // InternalSpec.g:1282:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Alternatives_1 ) ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1286:1: ( ( ( rule__Selector__Alternatives_1 ) ) )
            // InternalSpec.g:1287:1: ( ( rule__Selector__Alternatives_1 ) )
            {
            // InternalSpec.g:1287:1: ( ( rule__Selector__Alternatives_1 ) )
            // InternalSpec.g:1288:2: ( rule__Selector__Alternatives_1 )
            {
             before(grammarAccess.getSelectorAccess().getAlternatives_1()); 
            // InternalSpec.g:1289:2: ( rule__Selector__Alternatives_1 )
            // InternalSpec.g:1289:3: rule__Selector__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1__Impl"


    // $ANTLR start "rule__PropertyCommand__Group__0"
    // InternalSpec.g:1298:1: rule__PropertyCommand__Group__0 : rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1 ;
    public final void rule__PropertyCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1302:1: ( rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1 )
            // InternalSpec.g:1303:2: rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSpec.g:1310:1: rule__PropertyCommand__Group__0__Impl : ( ( rule__PropertyCommand__NameAssignment_0 ) ) ;
    public final void rule__PropertyCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1314:1: ( ( ( rule__PropertyCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:1315:1: ( ( rule__PropertyCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:1315:1: ( ( rule__PropertyCommand__NameAssignment_0 ) )
            // InternalSpec.g:1316:2: ( rule__PropertyCommand__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:1317:2: ( rule__PropertyCommand__NameAssignment_0 )
            // InternalSpec.g:1317:3: rule__PropertyCommand__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCommandAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalSpec.g:1325:1: rule__PropertyCommand__Group__1 : rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2 ;
    public final void rule__PropertyCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1329:1: ( rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2 )
            // InternalSpec.g:1330:2: rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalSpec.g:1337:1: rule__PropertyCommand__Group__1__Impl : ( ( rule__PropertyCommand__PropAssignment_1 ) ) ;
    public final void rule__PropertyCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1341:1: ( ( ( rule__PropertyCommand__PropAssignment_1 ) ) )
            // InternalSpec.g:1342:1: ( ( rule__PropertyCommand__PropAssignment_1 ) )
            {
            // InternalSpec.g:1342:1: ( ( rule__PropertyCommand__PropAssignment_1 ) )
            // InternalSpec.g:1343:2: ( rule__PropertyCommand__PropAssignment_1 )
            {
             before(grammarAccess.getPropertyCommandAccess().getPropAssignment_1()); 
            // InternalSpec.g:1344:2: ( rule__PropertyCommand__PropAssignment_1 )
            // InternalSpec.g:1344:3: rule__PropertyCommand__PropAssignment_1
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
    // InternalSpec.g:1352:1: rule__PropertyCommand__Group__2 : rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3 ;
    public final void rule__PropertyCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1356:1: ( rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3 )
            // InternalSpec.g:1357:2: rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalSpec.g:1364:1: rule__PropertyCommand__Group__2__Impl : ( ( rule__PropertyCommand__CondAssignment_2 ) ) ;
    public final void rule__PropertyCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1368:1: ( ( ( rule__PropertyCommand__CondAssignment_2 ) ) )
            // InternalSpec.g:1369:1: ( ( rule__PropertyCommand__CondAssignment_2 ) )
            {
            // InternalSpec.g:1369:1: ( ( rule__PropertyCommand__CondAssignment_2 ) )
            // InternalSpec.g:1370:2: ( rule__PropertyCommand__CondAssignment_2 )
            {
             before(grammarAccess.getPropertyCommandAccess().getCondAssignment_2()); 
            // InternalSpec.g:1371:2: ( rule__PropertyCommand__CondAssignment_2 )
            // InternalSpec.g:1371:3: rule__PropertyCommand__CondAssignment_2
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
    // InternalSpec.g:1379:1: rule__PropertyCommand__Group__3 : rule__PropertyCommand__Group__3__Impl ;
    public final void rule__PropertyCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1383:1: ( rule__PropertyCommand__Group__3__Impl )
            // InternalSpec.g:1384:2: rule__PropertyCommand__Group__3__Impl
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
    // InternalSpec.g:1390:1: rule__PropertyCommand__Group__3__Impl : ( ( rule__PropertyCommand__Alternatives_3 ) ) ;
    public final void rule__PropertyCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1394:1: ( ( ( rule__PropertyCommand__Alternatives_3 ) ) )
            // InternalSpec.g:1395:1: ( ( rule__PropertyCommand__Alternatives_3 ) )
            {
            // InternalSpec.g:1395:1: ( ( rule__PropertyCommand__Alternatives_3 ) )
            // InternalSpec.g:1396:2: ( rule__PropertyCommand__Alternatives_3 )
            {
             before(grammarAccess.getPropertyCommandAccess().getAlternatives_3()); 
            // InternalSpec.g:1397:2: ( rule__PropertyCommand__Alternatives_3 )
            // InternalSpec.g:1397:3: rule__PropertyCommand__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCommand__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCommandAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalSpec.g:1406:1: rule__TypeCommand__Group__0 : rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1 ;
    public final void rule__TypeCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1410:1: ( rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1 )
            // InternalSpec.g:1411:2: rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSpec.g:1418:1: rule__TypeCommand__Group__0__Impl : ( ( rule__TypeCommand__NameAssignment_0 ) ) ;
    public final void rule__TypeCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1422:1: ( ( ( rule__TypeCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:1423:1: ( ( rule__TypeCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:1423:1: ( ( rule__TypeCommand__NameAssignment_0 ) )
            // InternalSpec.g:1424:2: ( rule__TypeCommand__NameAssignment_0 )
            {
             before(grammarAccess.getTypeCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:1425:2: ( rule__TypeCommand__NameAssignment_0 )
            // InternalSpec.g:1425:3: rule__TypeCommand__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeCommand__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeCommandAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalSpec.g:1433:1: rule__TypeCommand__Group__1 : rule__TypeCommand__Group__1__Impl ;
    public final void rule__TypeCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1437:1: ( rule__TypeCommand__Group__1__Impl )
            // InternalSpec.g:1438:2: rule__TypeCommand__Group__1__Impl
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
    // InternalSpec.g:1444:1: rule__TypeCommand__Group__1__Impl : ( ( rule__TypeCommand__Alternatives_1 ) ) ;
    public final void rule__TypeCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1448:1: ( ( ( rule__TypeCommand__Alternatives_1 ) ) )
            // InternalSpec.g:1449:1: ( ( rule__TypeCommand__Alternatives_1 ) )
            {
            // InternalSpec.g:1449:1: ( ( rule__TypeCommand__Alternatives_1 ) )
            // InternalSpec.g:1450:2: ( rule__TypeCommand__Alternatives_1 )
            {
             before(grammarAccess.getTypeCommandAccess().getAlternatives_1()); 
            // InternalSpec.g:1451:2: ( rule__TypeCommand__Alternatives_1 )
            // InternalSpec.g:1451:3: rule__TypeCommand__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeCommand__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeCommandAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalSpec.g:1460:1: rule__SleepCommand__Group__0 : rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1 ;
    public final void rule__SleepCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1464:1: ( rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1 )
            // InternalSpec.g:1465:2: rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSpec.g:1472:1: rule__SleepCommand__Group__0__Impl : ( ( rule__SleepCommand__NameAssignment_0 ) ) ;
    public final void rule__SleepCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1476:1: ( ( ( rule__SleepCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:1477:1: ( ( rule__SleepCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:1477:1: ( ( rule__SleepCommand__NameAssignment_0 ) )
            // InternalSpec.g:1478:2: ( rule__SleepCommand__NameAssignment_0 )
            {
             before(grammarAccess.getSleepCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:1479:2: ( rule__SleepCommand__NameAssignment_0 )
            // InternalSpec.g:1479:3: rule__SleepCommand__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SleepCommand__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSleepCommandAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalSpec.g:1487:1: rule__SleepCommand__Group__1 : rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2 ;
    public final void rule__SleepCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1491:1: ( rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2 )
            // InternalSpec.g:1492:2: rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSpec.g:1499:1: rule__SleepCommand__Group__1__Impl : ( 'for' ) ;
    public final void rule__SleepCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1503:1: ( ( 'for' ) )
            // InternalSpec.g:1504:1: ( 'for' )
            {
            // InternalSpec.g:1504:1: ( 'for' )
            // InternalSpec.g:1505:2: 'for'
            {
             before(grammarAccess.getSleepCommandAccess().getForKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSpec.g:1514:1: rule__SleepCommand__Group__2 : rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3 ;
    public final void rule__SleepCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1518:1: ( rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3 )
            // InternalSpec.g:1519:2: rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalSpec.g:1526:1: rule__SleepCommand__Group__2__Impl : ( ( rule__SleepCommand__TimeAssignment_2 ) ) ;
    public final void rule__SleepCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1530:1: ( ( ( rule__SleepCommand__TimeAssignment_2 ) ) )
            // InternalSpec.g:1531:1: ( ( rule__SleepCommand__TimeAssignment_2 ) )
            {
            // InternalSpec.g:1531:1: ( ( rule__SleepCommand__TimeAssignment_2 ) )
            // InternalSpec.g:1532:2: ( rule__SleepCommand__TimeAssignment_2 )
            {
             before(grammarAccess.getSleepCommandAccess().getTimeAssignment_2()); 
            // InternalSpec.g:1533:2: ( rule__SleepCommand__TimeAssignment_2 )
            // InternalSpec.g:1533:3: rule__SleepCommand__TimeAssignment_2
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
    // InternalSpec.g:1541:1: rule__SleepCommand__Group__3 : rule__SleepCommand__Group__3__Impl ;
    public final void rule__SleepCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1545:1: ( rule__SleepCommand__Group__3__Impl )
            // InternalSpec.g:1546:2: rule__SleepCommand__Group__3__Impl
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
    // InternalSpec.g:1552:1: rule__SleepCommand__Group__3__Impl : ( ( rule__SleepCommand__Alternatives_3 ) ) ;
    public final void rule__SleepCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1556:1: ( ( ( rule__SleepCommand__Alternatives_3 ) ) )
            // InternalSpec.g:1557:1: ( ( rule__SleepCommand__Alternatives_3 ) )
            {
            // InternalSpec.g:1557:1: ( ( rule__SleepCommand__Alternatives_3 ) )
            // InternalSpec.g:1558:2: ( rule__SleepCommand__Alternatives_3 )
            {
             before(grammarAccess.getSleepCommandAccess().getAlternatives_3()); 
            // InternalSpec.g:1559:2: ( rule__SleepCommand__Alternatives_3 )
            // InternalSpec.g:1559:3: rule__SleepCommand__Alternatives_3
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
    // InternalSpec.g:1568:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1572:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalSpec.g:1573:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSpec.g:1580:1: rule__Point__Group__0__Impl : ( '{' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1584:1: ( ( '{' ) )
            // InternalSpec.g:1585:1: ( '{' )
            {
            // InternalSpec.g:1585:1: ( '{' )
            // InternalSpec.g:1586:2: '{'
            {
             before(grammarAccess.getPointAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSpec.g:1595:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1599:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalSpec.g:1600:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSpec.g:1607:1: rule__Point__Group__1__Impl : ( ( rule__Point__XAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1611:1: ( ( ( rule__Point__XAssignment_1 ) ) )
            // InternalSpec.g:1612:1: ( ( rule__Point__XAssignment_1 ) )
            {
            // InternalSpec.g:1612:1: ( ( rule__Point__XAssignment_1 ) )
            // InternalSpec.g:1613:2: ( rule__Point__XAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_1()); 
            // InternalSpec.g:1614:2: ( rule__Point__XAssignment_1 )
            // InternalSpec.g:1614:3: rule__Point__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Point__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getXAssignment_1()); 

            }


            }

        }
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
    // InternalSpec.g:1622:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1626:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalSpec.g:1627:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSpec.g:1634:1: rule__Point__Group__2__Impl : ( ',' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1638:1: ( ( ',' ) )
            // InternalSpec.g:1639:1: ( ',' )
            {
            // InternalSpec.g:1639:1: ( ',' )
            // InternalSpec.g:1640:2: ','
            {
             before(grammarAccess.getPointAccess().getCommaKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSpec.g:1649:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1653:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // InternalSpec.g:1654:2: rule__Point__Group__3__Impl rule__Point__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalSpec.g:1661:1: rule__Point__Group__3__Impl : ( ( rule__Point__YAssignment_3 ) ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1665:1: ( ( ( rule__Point__YAssignment_3 ) ) )
            // InternalSpec.g:1666:1: ( ( rule__Point__YAssignment_3 ) )
            {
            // InternalSpec.g:1666:1: ( ( rule__Point__YAssignment_3 ) )
            // InternalSpec.g:1667:2: ( rule__Point__YAssignment_3 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_3()); 
            // InternalSpec.g:1668:2: ( rule__Point__YAssignment_3 )
            // InternalSpec.g:1668:3: rule__Point__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Point__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getYAssignment_3()); 

            }


            }

        }
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
    // InternalSpec.g:1676:1: rule__Point__Group__4 : rule__Point__Group__4__Impl ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1680:1: ( rule__Point__Group__4__Impl )
            // InternalSpec.g:1681:2: rule__Point__Group__4__Impl
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
    // InternalSpec.g:1687:1: rule__Point__Group__4__Impl : ( '}' ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1691:1: ( ( '}' ) )
            // InternalSpec.g:1692:1: ( '}' )
            {
            // InternalSpec.g:1692:1: ( '}' )
            // InternalSpec.g:1693:2: '}'
            {
             before(grammarAccess.getPointAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
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


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // InternalSpec.g:1703:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1707:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalSpec.g:1708:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__1();

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
    // $ANTLR end "rule__VarDeclaration__Group__0"


    // $ANTLR start "rule__VarDeclaration__Group__0__Impl"
    // InternalSpec.g:1715:1: rule__VarDeclaration__Group__0__Impl : ( 'Store' ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1719:1: ( ( 'Store' ) )
            // InternalSpec.g:1720:1: ( 'Store' )
            {
            // InternalSpec.g:1720:1: ( 'Store' )
            // InternalSpec.g:1721:2: 'Store'
            {
             before(grammarAccess.getVarDeclarationAccess().getStoreKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getStoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__1"
    // InternalSpec.g:1730:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1734:1: ( rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 )
            // InternalSpec.g:1735:2: rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__VarDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__2();

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
    // $ANTLR end "rule__VarDeclaration__Group__1"


    // $ANTLR start "rule__VarDeclaration__Group__1__Impl"
    // InternalSpec.g:1742:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1746:1: ( ( ( rule__VarDeclaration__NameAssignment_1 ) ) )
            // InternalSpec.g:1747:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            {
            // InternalSpec.g:1747:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            // InternalSpec.g:1748:2: ( rule__VarDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 
            // InternalSpec.g:1749:2: ( rule__VarDeclaration__NameAssignment_1 )
            // InternalSpec.g:1749:3: rule__VarDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__2"
    // InternalSpec.g:1757:1: rule__VarDeclaration__Group__2 : rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 ;
    public final void rule__VarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1761:1: ( rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 )
            // InternalSpec.g:1762:2: rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__VarDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__3();

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
    // $ANTLR end "rule__VarDeclaration__Group__2"


    // $ANTLR start "rule__VarDeclaration__Group__2__Impl"
    // InternalSpec.g:1769:1: rule__VarDeclaration__Group__2__Impl : ( 'as' ) ;
    public final void rule__VarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1773:1: ( ( 'as' ) )
            // InternalSpec.g:1774:1: ( 'as' )
            {
            // InternalSpec.g:1774:1: ( 'as' )
            // InternalSpec.g:1775:2: 'as'
            {
             before(grammarAccess.getVarDeclarationAccess().getAsKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__3"
    // InternalSpec.g:1784:1: rule__VarDeclaration__Group__3 : rule__VarDeclaration__Group__3__Impl ;
    public final void rule__VarDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1788:1: ( rule__VarDeclaration__Group__3__Impl )
            // InternalSpec.g:1789:2: rule__VarDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__VarDeclaration__Group__3"


    // $ANTLR start "rule__VarDeclaration__Group__3__Impl"
    // InternalSpec.g:1795:1: rule__VarDeclaration__Group__3__Impl : ( ( rule__VarDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VarDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1799:1: ( ( ( rule__VarDeclaration__ValueAssignment_3 ) ) )
            // InternalSpec.g:1800:1: ( ( rule__VarDeclaration__ValueAssignment_3 ) )
            {
            // InternalSpec.g:1800:1: ( ( rule__VarDeclaration__ValueAssignment_3 ) )
            // InternalSpec.g:1801:2: ( rule__VarDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVarDeclarationAccess().getValueAssignment_3()); 
            // InternalSpec.g:1802:2: ( rule__VarDeclaration__ValueAssignment_3 )
            // InternalSpec.g:1802:3: rule__VarDeclaration__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Model__CommandsAssignment"
    // InternalSpec.g:1811:1: rule__Model__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1815:1: ( ( ruleCommand ) )
            // InternalSpec.g:1816:2: ( ruleCommand )
            {
            // InternalSpec.g:1816:2: ( ruleCommand )
            // InternalSpec.g:1817:3: ruleCommand
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


    // $ANTLR start "rule__Command__CustomAssignment_8"
    // InternalSpec.g:1826:1: rule__Command__CustomAssignment_8 : ( RULE_CUSTOM_COMMAND ) ;
    public final void rule__Command__CustomAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1830:1: ( ( RULE_CUSTOM_COMMAND ) )
            // InternalSpec.g:1831:2: ( RULE_CUSTOM_COMMAND )
            {
            // InternalSpec.g:1831:2: ( RULE_CUSTOM_COMMAND )
            // InternalSpec.g:1832:3: RULE_CUSTOM_COMMAND
            {
             before(grammarAccess.getCommandAccess().getCustomCUSTOM_COMMANDTerminalRuleCall_8_0()); 
            match(input,RULE_CUSTOM_COMMAND,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getCustomCUSTOM_COMMANDTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__CustomAssignment_8"


    // $ANTLR start "rule__UsingCommand__NameAssignment_0"
    // InternalSpec.g:1841:1: rule__UsingCommand__NameAssignment_0 : ( ( 'Using' ) ) ;
    public final void rule__UsingCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1845:1: ( ( ( 'Using' ) ) )
            // InternalSpec.g:1846:2: ( ( 'Using' ) )
            {
            // InternalSpec.g:1846:2: ( ( 'Using' ) )
            // InternalSpec.g:1847:3: ( 'Using' )
            {
             before(grammarAccess.getUsingCommandAccess().getNameUsingKeyword_0_0()); 
            // InternalSpec.g:1848:3: ( 'Using' )
            // InternalSpec.g:1849:4: 'Using'
            {
             before(grammarAccess.getUsingCommandAccess().getNameUsingKeyword_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getUsingCommandAccess().getNameUsingKeyword_0_0()); 

            }

             after(grammarAccess.getUsingCommandAccess().getNameUsingKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsingCommand__NameAssignment_0"


    // $ANTLR start "rule__UsingCommand__BrowserAssignment_1"
    // InternalSpec.g:1860:1: rule__UsingCommand__BrowserAssignment_1 : ( ruleBrowser ) ;
    public final void rule__UsingCommand__BrowserAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1864:1: ( ( ruleBrowser ) )
            // InternalSpec.g:1865:2: ( ruleBrowser )
            {
            // InternalSpec.g:1865:2: ( ruleBrowser )
            // InternalSpec.g:1866:3: ruleBrowser
            {
             before(grammarAccess.getUsingCommandAccess().getBrowserBrowserEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBrowser();

            state._fsp--;

             after(grammarAccess.getUsingCommandAccess().getBrowserBrowserEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsingCommand__BrowserAssignment_1"


    // $ANTLR start "rule__OpenCommand__NameAssignment_1"
    // InternalSpec.g:1875:1: rule__OpenCommand__NameAssignment_1 : ( ( 'Open' ) ) ;
    public final void rule__OpenCommand__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1879:1: ( ( ( 'Open' ) ) )
            // InternalSpec.g:1880:2: ( ( 'Open' ) )
            {
            // InternalSpec.g:1880:2: ( ( 'Open' ) )
            // InternalSpec.g:1881:3: ( 'Open' )
            {
             before(grammarAccess.getOpenCommandAccess().getNameOpenKeyword_1_0()); 
            // InternalSpec.g:1882:3: ( 'Open' )
            // InternalSpec.g:1883:4: 'Open'
            {
             before(grammarAccess.getOpenCommandAccess().getNameOpenKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOpenCommandAccess().getNameOpenKeyword_1_0()); 

            }

             after(grammarAccess.getOpenCommandAccess().getNameOpenKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenCommand__NameAssignment_1"


    // $ANTLR start "rule__OpenCommand__ValAssignment_2_0"
    // InternalSpec.g:1894:1: rule__OpenCommand__ValAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__OpenCommand__ValAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1898:1: ( ( RULE_STRING ) )
            // InternalSpec.g:1899:2: ( RULE_STRING )
            {
            // InternalSpec.g:1899:2: ( RULE_STRING )
            // InternalSpec.g:1900:3: RULE_STRING
            {
             before(grammarAccess.getOpenCommandAccess().getValSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOpenCommandAccess().getValSTRINGTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenCommand__ValAssignment_2_0"


    // $ANTLR start "rule__OpenCommand__VarAssignment_2_1"
    // InternalSpec.g:1909:1: rule__OpenCommand__VarAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__OpenCommand__VarAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1913:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:1914:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:1914:2: ( ( RULE_ID ) )
            // InternalSpec.g:1915:3: ( RULE_ID )
            {
             before(grammarAccess.getOpenCommandAccess().getVarVarDeclarationCrossReference_2_1_0()); 
            // InternalSpec.g:1916:3: ( RULE_ID )
            // InternalSpec.g:1917:4: RULE_ID
            {
             before(grammarAccess.getOpenCommandAccess().getVarVarDeclarationIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOpenCommandAccess().getVarVarDeclarationIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getOpenCommandAccess().getVarVarDeclarationCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenCommand__VarAssignment_2_1"


    // $ANTLR start "rule__ClickCommand__NameAssignment_0"
    // InternalSpec.g:1928:1: rule__ClickCommand__NameAssignment_0 : ( ( 'Click' ) ) ;
    public final void rule__ClickCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1932:1: ( ( ( 'Click' ) ) )
            // InternalSpec.g:1933:2: ( ( 'Click' ) )
            {
            // InternalSpec.g:1933:2: ( ( 'Click' ) )
            // InternalSpec.g:1934:3: ( 'Click' )
            {
             before(grammarAccess.getClickCommandAccess().getNameClickKeyword_0_0()); 
            // InternalSpec.g:1935:3: ( 'Click' )
            // InternalSpec.g:1936:4: 'Click'
            {
             before(grammarAccess.getClickCommandAccess().getNameClickKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getClickCommandAccess().getNameClickKeyword_0_0()); 

            }

             after(grammarAccess.getClickCommandAccess().getNameClickKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__NameAssignment_0"


    // $ANTLR start "rule__ClickCommand__SelectorAssignment_1_0_1"
    // InternalSpec.g:1947:1: rule__ClickCommand__SelectorAssignment_1_0_1 : ( ruleSelector ) ;
    public final void rule__ClickCommand__SelectorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1951:1: ( ( ruleSelector ) )
            // InternalSpec.g:1952:2: ( ruleSelector )
            {
            // InternalSpec.g:1952:2: ( ruleSelector )
            // InternalSpec.g:1953:3: ruleSelector
            {
             before(grammarAccess.getClickCommandAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getClickCommandAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__SelectorAssignment_1_0_1"


    // $ANTLR start "rule__ClickCommand__PointAssignment_1_1_1"
    // InternalSpec.g:1962:1: rule__ClickCommand__PointAssignment_1_1_1 : ( rulePoint ) ;
    public final void rule__ClickCommand__PointAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1966:1: ( ( rulePoint ) )
            // InternalSpec.g:1967:2: ( rulePoint )
            {
            // InternalSpec.g:1967:2: ( rulePoint )
            // InternalSpec.g:1968:3: rulePoint
            {
             before(grammarAccess.getClickCommandAccess().getPointPointParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getClickCommandAccess().getPointPointParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickCommand__PointAssignment_1_1_1"


    // $ANTLR start "rule__SelectCommand__NameAssignment_0_0"
    // InternalSpec.g:1977:1: rule__SelectCommand__NameAssignment_0_0 : ( ( 'Within' ) ) ;
    public final void rule__SelectCommand__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1981:1: ( ( ( 'Within' ) ) )
            // InternalSpec.g:1982:2: ( ( 'Within' ) )
            {
            // InternalSpec.g:1982:2: ( ( 'Within' ) )
            // InternalSpec.g:1983:3: ( 'Within' )
            {
             before(grammarAccess.getSelectCommandAccess().getNameWithinKeyword_0_0_0()); 
            // InternalSpec.g:1984:3: ( 'Within' )
            // InternalSpec.g:1985:4: 'Within'
            {
             before(grammarAccess.getSelectCommandAccess().getNameWithinKeyword_0_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSelectCommandAccess().getNameWithinKeyword_0_0_0()); 

            }

             after(grammarAccess.getSelectCommandAccess().getNameWithinKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__NameAssignment_0_0"


    // $ANTLR start "rule__SelectCommand__ValueAssignment_0_1"
    // InternalSpec.g:1996:1: rule__SelectCommand__ValueAssignment_0_1 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2000:1: ( ( ruleSelector ) )
            // InternalSpec.g:2001:2: ( ruleSelector )
            {
            // InternalSpec.g:2001:2: ( ruleSelector )
            // InternalSpec.g:2002:3: ruleSelector
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


    // $ANTLR start "rule__SelectCommand__NameAssignment_1_0"
    // InternalSpec.g:2011:1: rule__SelectCommand__NameAssignment_1_0 : ( ( 'Select' ) ) ;
    public final void rule__SelectCommand__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2015:1: ( ( ( 'Select' ) ) )
            // InternalSpec.g:2016:2: ( ( 'Select' ) )
            {
            // InternalSpec.g:2016:2: ( ( 'Select' ) )
            // InternalSpec.g:2017:3: ( 'Select' )
            {
             before(grammarAccess.getSelectCommandAccess().getNameSelectKeyword_1_0_0()); 
            // InternalSpec.g:2018:3: ( 'Select' )
            // InternalSpec.g:2019:4: 'Select'
            {
             before(grammarAccess.getSelectCommandAccess().getNameSelectKeyword_1_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSelectCommandAccess().getNameSelectKeyword_1_0_0()); 

            }

             after(grammarAccess.getSelectCommandAccess().getNameSelectKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__NameAssignment_1_0"


    // $ANTLR start "rule__SelectCommand__ValueAssignment_1_2"
    // InternalSpec.g:2030:1: rule__SelectCommand__ValueAssignment_1_2 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2034:1: ( ( ruleSelector ) )
            // InternalSpec.g:2035:2: ( ruleSelector )
            {
            // InternalSpec.g:2035:2: ( ruleSelector )
            // InternalSpec.g:2036:3: ruleSelector
            {
             before(grammarAccess.getSelectCommandAccess().getValueSelectorParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectCommandAccess().getValueSelectorParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCommand__ValueAssignment_1_2"


    // $ANTLR start "rule__Selector__TypeAssignment_0"
    // InternalSpec.g:2045:1: rule__Selector__TypeAssignment_0 : ( ruleElementType ) ;
    public final void rule__Selector__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2049:1: ( ( ruleElementType ) )
            // InternalSpec.g:2050:2: ( ruleElementType )
            {
            // InternalSpec.g:2050:2: ( ruleElementType )
            // InternalSpec.g:2051:3: ruleElementType
            {
             before(grammarAccess.getSelectorAccess().getTypeElementTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getTypeElementTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__TypeAssignment_0"


    // $ANTLR start "rule__Selector__VarAssignment_1_0"
    // InternalSpec.g:2060:1: rule__Selector__VarAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Selector__VarAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2064:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2065:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2065:2: ( ( RULE_ID ) )
            // InternalSpec.g:2066:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectorAccess().getVarVarDeclarationCrossReference_1_0_0()); 
            // InternalSpec.g:2067:3: ( RULE_ID )
            // InternalSpec.g:2068:4: RULE_ID
            {
             before(grammarAccess.getSelectorAccess().getVarVarDeclarationIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getVarVarDeclarationIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getSelectorAccess().getVarVarDeclarationCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__VarAssignment_1_0"


    // $ANTLR start "rule__Selector__ValAssignment_1_1"
    // InternalSpec.g:2079:1: rule__Selector__ValAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Selector__ValAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2083:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2084:2: ( RULE_STRING )
            {
            // InternalSpec.g:2084:2: ( RULE_STRING )
            // InternalSpec.g:2085:3: RULE_STRING
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


    // $ANTLR start "rule__PropertyCommand__NameAssignment_0"
    // InternalSpec.g:2094:1: rule__PropertyCommand__NameAssignment_0 : ( ( 'Property' ) ) ;
    public final void rule__PropertyCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2098:1: ( ( ( 'Property' ) ) )
            // InternalSpec.g:2099:2: ( ( 'Property' ) )
            {
            // InternalSpec.g:2099:2: ( ( 'Property' ) )
            // InternalSpec.g:2100:3: ( 'Property' )
            {
             before(grammarAccess.getPropertyCommandAccess().getNamePropertyKeyword_0_0()); 
            // InternalSpec.g:2101:3: ( 'Property' )
            // InternalSpec.g:2102:4: 'Property'
            {
             before(grammarAccess.getPropertyCommandAccess().getNamePropertyKeyword_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPropertyCommandAccess().getNamePropertyKeyword_0_0()); 

            }

             after(grammarAccess.getPropertyCommandAccess().getNamePropertyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCommand__NameAssignment_0"


    // $ANTLR start "rule__PropertyCommand__PropAssignment_1"
    // InternalSpec.g:2113:1: rule__PropertyCommand__PropAssignment_1 : ( ruleProperty ) ;
    public final void rule__PropertyCommand__PropAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2117:1: ( ( ruleProperty ) )
            // InternalSpec.g:2118:2: ( ruleProperty )
            {
            // InternalSpec.g:2118:2: ( ruleProperty )
            // InternalSpec.g:2119:3: ruleProperty
            {
             before(grammarAccess.getPropertyCommandAccess().getPropPropertyEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyCommandAccess().getPropPropertyEnumRuleCall_1_0()); 

            }


            }

        }
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
    // InternalSpec.g:2128:1: rule__PropertyCommand__CondAssignment_2 : ( ruleCondition ) ;
    public final void rule__PropertyCommand__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2132:1: ( ( ruleCondition ) )
            // InternalSpec.g:2133:2: ( ruleCondition )
            {
            // InternalSpec.g:2133:2: ( ruleCondition )
            // InternalSpec.g:2134:3: ruleCondition
            {
             before(grammarAccess.getPropertyCommandAccess().getCondConditionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPropertyCommandAccess().getCondConditionEnumRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__PropertyCommand__ValAssignment_3_0"
    // InternalSpec.g:2143:1: rule__PropertyCommand__ValAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__PropertyCommand__ValAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2147:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2148:2: ( RULE_STRING )
            {
            // InternalSpec.g:2148:2: ( RULE_STRING )
            // InternalSpec.g:2149:3: RULE_STRING
            {
             before(grammarAccess.getPropertyCommandAccess().getValSTRINGTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyCommandAccess().getValSTRINGTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCommand__ValAssignment_3_0"


    // $ANTLR start "rule__PropertyCommand__VarAssignment_3_1"
    // InternalSpec.g:2158:1: rule__PropertyCommand__VarAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyCommand__VarAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2162:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2163:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2163:2: ( ( RULE_ID ) )
            // InternalSpec.g:2164:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyCommandAccess().getVarVarDeclarationCrossReference_3_1_0()); 
            // InternalSpec.g:2165:3: ( RULE_ID )
            // InternalSpec.g:2166:4: RULE_ID
            {
             before(grammarAccess.getPropertyCommandAccess().getVarVarDeclarationIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyCommandAccess().getVarVarDeclarationIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPropertyCommandAccess().getVarVarDeclarationCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCommand__VarAssignment_3_1"


    // $ANTLR start "rule__TypeCommand__NameAssignment_0"
    // InternalSpec.g:2177:1: rule__TypeCommand__NameAssignment_0 : ( ( 'Type' ) ) ;
    public final void rule__TypeCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2181:1: ( ( ( 'Type' ) ) )
            // InternalSpec.g:2182:2: ( ( 'Type' ) )
            {
            // InternalSpec.g:2182:2: ( ( 'Type' ) )
            // InternalSpec.g:2183:3: ( 'Type' )
            {
             before(grammarAccess.getTypeCommandAccess().getNameTypeKeyword_0_0()); 
            // InternalSpec.g:2184:3: ( 'Type' )
            // InternalSpec.g:2185:4: 'Type'
            {
             before(grammarAccess.getTypeCommandAccess().getNameTypeKeyword_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTypeCommandAccess().getNameTypeKeyword_0_0()); 

            }

             after(grammarAccess.getTypeCommandAccess().getNameTypeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCommand__NameAssignment_0"


    // $ANTLR start "rule__TypeCommand__StrAssignment_1_0"
    // InternalSpec.g:2196:1: rule__TypeCommand__StrAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__TypeCommand__StrAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2200:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2201:2: ( RULE_STRING )
            {
            // InternalSpec.g:2201:2: ( RULE_STRING )
            // InternalSpec.g:2202:3: RULE_STRING
            {
             before(grammarAccess.getTypeCommandAccess().getStrSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypeCommandAccess().getStrSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCommand__StrAssignment_1_0"


    // $ANTLR start "rule__TypeCommand__VarAssignment_1_1"
    // InternalSpec.g:2211:1: rule__TypeCommand__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeCommand__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2215:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2216:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2216:2: ( ( RULE_ID ) )
            // InternalSpec.g:2217:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeCommandAccess().getVarVarDeclarationCrossReference_1_1_0()); 
            // InternalSpec.g:2218:3: ( RULE_ID )
            // InternalSpec.g:2219:4: RULE_ID
            {
             before(grammarAccess.getTypeCommandAccess().getVarVarDeclarationIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeCommandAccess().getVarVarDeclarationIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getTypeCommandAccess().getVarVarDeclarationCrossReference_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SleepCommand__NameAssignment_0"
    // InternalSpec.g:2230:1: rule__SleepCommand__NameAssignment_0 : ( ( 'Sleep' ) ) ;
    public final void rule__SleepCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2234:1: ( ( ( 'Sleep' ) ) )
            // InternalSpec.g:2235:2: ( ( 'Sleep' ) )
            {
            // InternalSpec.g:2235:2: ( ( 'Sleep' ) )
            // InternalSpec.g:2236:3: ( 'Sleep' )
            {
             before(grammarAccess.getSleepCommandAccess().getNameSleepKeyword_0_0()); 
            // InternalSpec.g:2237:3: ( 'Sleep' )
            // InternalSpec.g:2238:4: 'Sleep'
            {
             before(grammarAccess.getSleepCommandAccess().getNameSleepKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSleepCommandAccess().getNameSleepKeyword_0_0()); 

            }

             after(grammarAccess.getSleepCommandAccess().getNameSleepKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SleepCommand__NameAssignment_0"


    // $ANTLR start "rule__SleepCommand__TimeAssignment_2"
    // InternalSpec.g:2249:1: rule__SleepCommand__TimeAssignment_2 : ( RULE_INT ) ;
    public final void rule__SleepCommand__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2253:1: ( ( RULE_INT ) )
            // InternalSpec.g:2254:2: ( RULE_INT )
            {
            // InternalSpec.g:2254:2: ( RULE_INT )
            // InternalSpec.g:2255:3: RULE_INT
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


    // $ANTLR start "rule__Point__XAssignment_1"
    // InternalSpec.g:2264:1: rule__Point__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Point__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2268:1: ( ( RULE_INT ) )
            // InternalSpec.g:2269:2: ( RULE_INT )
            {
            // InternalSpec.g:2269:2: ( RULE_INT )
            // InternalSpec.g:2270:3: RULE_INT
            {
             before(grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__XAssignment_1"


    // $ANTLR start "rule__Point__YAssignment_3"
    // InternalSpec.g:2279:1: rule__Point__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Point__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2283:1: ( ( RULE_INT ) )
            // InternalSpec.g:2284:2: ( RULE_INT )
            {
            // InternalSpec.g:2284:2: ( RULE_INT )
            // InternalSpec.g:2285:3: RULE_INT
            {
             before(grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__YAssignment_3"


    // $ANTLR start "rule__VarDeclaration__NameAssignment_1"
    // InternalSpec.g:2294:1: rule__VarDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2298:1: ( ( RULE_ID ) )
            // InternalSpec.g:2299:2: ( RULE_ID )
            {
            // InternalSpec.g:2299:2: ( RULE_ID )
            // InternalSpec.g:2300:3: RULE_ID
            {
             before(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VarDeclaration__ValueAssignment_3"
    // InternalSpec.g:2309:1: rule__VarDeclaration__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__VarDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2313:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2314:2: ( RULE_STRING )
            {
            // InternalSpec.g:2314:2: ( RULE_STRING )
            // InternalSpec.g:2315:3: RULE_STRING
            {
             before(grammarAccess.getVarDeclarationAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getValueSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00003FD000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001F000C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000081F000C0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});

}
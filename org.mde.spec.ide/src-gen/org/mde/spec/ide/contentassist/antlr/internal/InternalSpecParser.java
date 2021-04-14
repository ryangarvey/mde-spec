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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_CUSTOM_COMMAND", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'second'", "'seconds'", "'Chrome'", "'Firefox'", "'Explorer'", "'Edge'", "'Opera'", "'Safari'", "'button'", "'element'", "'link'", "'input'", "'textarea'", "'text'", "'class'", "'value'", "'should be'", "'should not be'", "'on'", "'at'", "'visible'", "'for'", "'{'", "','", "'}'", "'Store'", "'as'", "'Using'", "'Open'", "'Click'", "'Within'", "'Select'", "'Property'", "'Type'", "'Sleep'"
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
    public static final int T__46=46;
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

                if ( ((LA1_0>=RULE_SL_COMMENT && LA1_0<=RULE_CUSTOM_COMMAND)||LA1_0==37||(LA1_0>=39 && LA1_0<=46)) ) {
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
            case 39:
                {
                alt2=1;
                }
                break;
            case 40:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            case 42:
            case 43:
                {
                alt2=4;
                }
                break;
            case 44:
                {
                alt2=5;
                }
                break;
            case 45:
                {
                alt2=6;
                }
                break;
            case 46:
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
            case 37:
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

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            else if ( (LA4_0==31) ) {
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

            if ( (LA5_0==42) ) {
                alt5=1;
            }
            else if ( (LA5_0==43) ) {
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
    // InternalSpec.g:716:1: rule__Property__Alternatives : ( ( ( 'text' ) ) | ( ( 'class' ) ) | ( ( 'value' ) ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:720:1: ( ( ( 'text' ) ) | ( ( 'class' ) ) | ( ( 'value' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            default:
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
                    // InternalSpec.g:727:2: ( ( 'class' ) )
                    {
                    // InternalSpec.g:727:2: ( ( 'class' ) )
                    // InternalSpec.g:728:3: ( 'class' )
                    {
                     before(grammarAccess.getPropertyAccess().getClassEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:729:3: ( 'class' )
                    // InternalSpec.g:729:4: 'class'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyAccess().getClassEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:733:2: ( ( 'value' ) )
                    {
                    // InternalSpec.g:733:2: ( ( 'value' ) )
                    // InternalSpec.g:734:3: ( 'value' )
                    {
                     before(grammarAccess.getPropertyAccess().getValueEnumLiteralDeclaration_2()); 
                    // InternalSpec.g:735:3: ( 'value' )
                    // InternalSpec.g:735:4: 'value'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyAccess().getValueEnumLiteralDeclaration_2()); 

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
    // InternalSpec.g:743:1: rule__Condition__Alternatives : ( ( ( 'should be' ) ) | ( ( 'should not be' ) ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:747:1: ( ( ( 'should be' ) ) | ( ( 'should not be' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSpec.g:748:2: ( ( 'should be' ) )
                    {
                    // InternalSpec.g:748:2: ( ( 'should be' ) )
                    // InternalSpec.g:749:3: ( 'should be' )
                    {
                     before(grammarAccess.getConditionAccess().getShouldBeEnumLiteralDeclaration_0()); 
                    // InternalSpec.g:750:3: ( 'should be' )
                    // InternalSpec.g:750:4: 'should be'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionAccess().getShouldBeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:754:2: ( ( 'should not be' ) )
                    {
                    // InternalSpec.g:754:2: ( ( 'should not be' ) )
                    // InternalSpec.g:755:3: ( 'should not be' )
                    {
                     before(grammarAccess.getConditionAccess().getShouldNotBeEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:756:3: ( 'should not be' )
                    // InternalSpec.g:756:4: 'should not be'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalSpec.g:764:1: rule__Command__Group_7__0 : rule__Command__Group_7__0__Impl rule__Command__Group_7__1 ;
    public final void rule__Command__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:768:1: ( rule__Command__Group_7__0__Impl rule__Command__Group_7__1 )
            // InternalSpec.g:769:2: rule__Command__Group_7__0__Impl rule__Command__Group_7__1
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
    // InternalSpec.g:776:1: rule__Command__Group_7__0__Impl : ( () ) ;
    public final void rule__Command__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:780:1: ( ( () ) )
            // InternalSpec.g:781:1: ( () )
            {
            // InternalSpec.g:781:1: ( () )
            // InternalSpec.g:782:2: ()
            {
             before(grammarAccess.getCommandAccess().getCommandAction_7_0()); 
            // InternalSpec.g:783:2: ()
            // InternalSpec.g:783:3: 
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
    // InternalSpec.g:791:1: rule__Command__Group_7__1 : rule__Command__Group_7__1__Impl ;
    public final void rule__Command__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:795:1: ( rule__Command__Group_7__1__Impl )
            // InternalSpec.g:796:2: rule__Command__Group_7__1__Impl
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
    // InternalSpec.g:802:1: rule__Command__Group_7__1__Impl : ( RULE_SL_COMMENT ) ;
    public final void rule__Command__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:806:1: ( ( RULE_SL_COMMENT ) )
            // InternalSpec.g:807:1: ( RULE_SL_COMMENT )
            {
            // InternalSpec.g:807:1: ( RULE_SL_COMMENT )
            // InternalSpec.g:808:2: RULE_SL_COMMENT
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
    // InternalSpec.g:818:1: rule__UsingCommand__Group__0 : rule__UsingCommand__Group__0__Impl rule__UsingCommand__Group__1 ;
    public final void rule__UsingCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:822:1: ( rule__UsingCommand__Group__0__Impl rule__UsingCommand__Group__1 )
            // InternalSpec.g:823:2: rule__UsingCommand__Group__0__Impl rule__UsingCommand__Group__1
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
    // InternalSpec.g:830:1: rule__UsingCommand__Group__0__Impl : ( ( rule__UsingCommand__NameAssignment_0 ) ) ;
    public final void rule__UsingCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:834:1: ( ( ( rule__UsingCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:835:1: ( ( rule__UsingCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:835:1: ( ( rule__UsingCommand__NameAssignment_0 ) )
            // InternalSpec.g:836:2: ( rule__UsingCommand__NameAssignment_0 )
            {
             before(grammarAccess.getUsingCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:837:2: ( rule__UsingCommand__NameAssignment_0 )
            // InternalSpec.g:837:3: rule__UsingCommand__NameAssignment_0
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
    // InternalSpec.g:845:1: rule__UsingCommand__Group__1 : rule__UsingCommand__Group__1__Impl ;
    public final void rule__UsingCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:849:1: ( rule__UsingCommand__Group__1__Impl )
            // InternalSpec.g:850:2: rule__UsingCommand__Group__1__Impl
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
    // InternalSpec.g:856:1: rule__UsingCommand__Group__1__Impl : ( ( rule__UsingCommand__BrowserAssignment_1 ) ) ;
    public final void rule__UsingCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:860:1: ( ( ( rule__UsingCommand__BrowserAssignment_1 ) ) )
            // InternalSpec.g:861:1: ( ( rule__UsingCommand__BrowserAssignment_1 ) )
            {
            // InternalSpec.g:861:1: ( ( rule__UsingCommand__BrowserAssignment_1 ) )
            // InternalSpec.g:862:2: ( rule__UsingCommand__BrowserAssignment_1 )
            {
             before(grammarAccess.getUsingCommandAccess().getBrowserAssignment_1()); 
            // InternalSpec.g:863:2: ( rule__UsingCommand__BrowserAssignment_1 )
            // InternalSpec.g:863:3: rule__UsingCommand__BrowserAssignment_1
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
    // InternalSpec.g:872:1: rule__OpenCommand__Group__0 : rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1 ;
    public final void rule__OpenCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:876:1: ( rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1 )
            // InternalSpec.g:877:2: rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1
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
    // InternalSpec.g:884:1: rule__OpenCommand__Group__0__Impl : ( () ) ;
    public final void rule__OpenCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:888:1: ( ( () ) )
            // InternalSpec.g:889:1: ( () )
            {
            // InternalSpec.g:889:1: ( () )
            // InternalSpec.g:890:2: ()
            {
             before(grammarAccess.getOpenCommandAccess().getOpenCommandAction_0()); 
            // InternalSpec.g:891:2: ()
            // InternalSpec.g:891:3: 
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
    // InternalSpec.g:899:1: rule__OpenCommand__Group__1 : rule__OpenCommand__Group__1__Impl rule__OpenCommand__Group__2 ;
    public final void rule__OpenCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:903:1: ( rule__OpenCommand__Group__1__Impl rule__OpenCommand__Group__2 )
            // InternalSpec.g:904:2: rule__OpenCommand__Group__1__Impl rule__OpenCommand__Group__2
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
    // InternalSpec.g:911:1: rule__OpenCommand__Group__1__Impl : ( ( rule__OpenCommand__NameAssignment_1 ) ) ;
    public final void rule__OpenCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:915:1: ( ( ( rule__OpenCommand__NameAssignment_1 ) ) )
            // InternalSpec.g:916:1: ( ( rule__OpenCommand__NameAssignment_1 ) )
            {
            // InternalSpec.g:916:1: ( ( rule__OpenCommand__NameAssignment_1 ) )
            // InternalSpec.g:917:2: ( rule__OpenCommand__NameAssignment_1 )
            {
             before(grammarAccess.getOpenCommandAccess().getNameAssignment_1()); 
            // InternalSpec.g:918:2: ( rule__OpenCommand__NameAssignment_1 )
            // InternalSpec.g:918:3: rule__OpenCommand__NameAssignment_1
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
    // InternalSpec.g:926:1: rule__OpenCommand__Group__2 : rule__OpenCommand__Group__2__Impl ;
    public final void rule__OpenCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:930:1: ( rule__OpenCommand__Group__2__Impl )
            // InternalSpec.g:931:2: rule__OpenCommand__Group__2__Impl
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
    // InternalSpec.g:937:1: rule__OpenCommand__Group__2__Impl : ( ( rule__OpenCommand__Alternatives_2 ) ) ;
    public final void rule__OpenCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:941:1: ( ( ( rule__OpenCommand__Alternatives_2 ) ) )
            // InternalSpec.g:942:1: ( ( rule__OpenCommand__Alternatives_2 ) )
            {
            // InternalSpec.g:942:1: ( ( rule__OpenCommand__Alternatives_2 ) )
            // InternalSpec.g:943:2: ( rule__OpenCommand__Alternatives_2 )
            {
             before(grammarAccess.getOpenCommandAccess().getAlternatives_2()); 
            // InternalSpec.g:944:2: ( rule__OpenCommand__Alternatives_2 )
            // InternalSpec.g:944:3: rule__OpenCommand__Alternatives_2
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
    // InternalSpec.g:953:1: rule__ClickCommand__Group__0 : rule__ClickCommand__Group__0__Impl rule__ClickCommand__Group__1 ;
    public final void rule__ClickCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:957:1: ( rule__ClickCommand__Group__0__Impl rule__ClickCommand__Group__1 )
            // InternalSpec.g:958:2: rule__ClickCommand__Group__0__Impl rule__ClickCommand__Group__1
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
    // InternalSpec.g:965:1: rule__ClickCommand__Group__0__Impl : ( ( rule__ClickCommand__NameAssignment_0 ) ) ;
    public final void rule__ClickCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:969:1: ( ( ( rule__ClickCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:970:1: ( ( rule__ClickCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:970:1: ( ( rule__ClickCommand__NameAssignment_0 ) )
            // InternalSpec.g:971:2: ( rule__ClickCommand__NameAssignment_0 )
            {
             before(grammarAccess.getClickCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:972:2: ( rule__ClickCommand__NameAssignment_0 )
            // InternalSpec.g:972:3: rule__ClickCommand__NameAssignment_0
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
    // InternalSpec.g:980:1: rule__ClickCommand__Group__1 : rule__ClickCommand__Group__1__Impl ;
    public final void rule__ClickCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:984:1: ( rule__ClickCommand__Group__1__Impl )
            // InternalSpec.g:985:2: rule__ClickCommand__Group__1__Impl
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
    // InternalSpec.g:991:1: rule__ClickCommand__Group__1__Impl : ( ( rule__ClickCommand__Alternatives_1 ) ) ;
    public final void rule__ClickCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:995:1: ( ( ( rule__ClickCommand__Alternatives_1 ) ) )
            // InternalSpec.g:996:1: ( ( rule__ClickCommand__Alternatives_1 ) )
            {
            // InternalSpec.g:996:1: ( ( rule__ClickCommand__Alternatives_1 ) )
            // InternalSpec.g:997:2: ( rule__ClickCommand__Alternatives_1 )
            {
             before(grammarAccess.getClickCommandAccess().getAlternatives_1()); 
            // InternalSpec.g:998:2: ( rule__ClickCommand__Alternatives_1 )
            // InternalSpec.g:998:3: rule__ClickCommand__Alternatives_1
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
    // InternalSpec.g:1007:1: rule__ClickCommand__Group_1_0__0 : rule__ClickCommand__Group_1_0__0__Impl rule__ClickCommand__Group_1_0__1 ;
    public final void rule__ClickCommand__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1011:1: ( rule__ClickCommand__Group_1_0__0__Impl rule__ClickCommand__Group_1_0__1 )
            // InternalSpec.g:1012:2: rule__ClickCommand__Group_1_0__0__Impl rule__ClickCommand__Group_1_0__1
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
    // InternalSpec.g:1019:1: rule__ClickCommand__Group_1_0__0__Impl : ( 'on' ) ;
    public final void rule__ClickCommand__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1023:1: ( ( 'on' ) )
            // InternalSpec.g:1024:1: ( 'on' )
            {
            // InternalSpec.g:1024:1: ( 'on' )
            // InternalSpec.g:1025:2: 'on'
            {
             before(grammarAccess.getClickCommandAccess().getOnKeyword_1_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSpec.g:1034:1: rule__ClickCommand__Group_1_0__1 : rule__ClickCommand__Group_1_0__1__Impl ;
    public final void rule__ClickCommand__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1038:1: ( rule__ClickCommand__Group_1_0__1__Impl )
            // InternalSpec.g:1039:2: rule__ClickCommand__Group_1_0__1__Impl
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
    // InternalSpec.g:1045:1: rule__ClickCommand__Group_1_0__1__Impl : ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) ) ;
    public final void rule__ClickCommand__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1049:1: ( ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) ) )
            // InternalSpec.g:1050:1: ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) )
            {
            // InternalSpec.g:1050:1: ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) )
            // InternalSpec.g:1051:2: ( rule__ClickCommand__SelectorAssignment_1_0_1 )
            {
             before(grammarAccess.getClickCommandAccess().getSelectorAssignment_1_0_1()); 
            // InternalSpec.g:1052:2: ( rule__ClickCommand__SelectorAssignment_1_0_1 )
            // InternalSpec.g:1052:3: rule__ClickCommand__SelectorAssignment_1_0_1
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
    // InternalSpec.g:1061:1: rule__ClickCommand__Group_1_1__0 : rule__ClickCommand__Group_1_1__0__Impl rule__ClickCommand__Group_1_1__1 ;
    public final void rule__ClickCommand__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1065:1: ( rule__ClickCommand__Group_1_1__0__Impl rule__ClickCommand__Group_1_1__1 )
            // InternalSpec.g:1066:2: rule__ClickCommand__Group_1_1__0__Impl rule__ClickCommand__Group_1_1__1
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
    // InternalSpec.g:1073:1: rule__ClickCommand__Group_1_1__0__Impl : ( 'at' ) ;
    public final void rule__ClickCommand__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1077:1: ( ( 'at' ) )
            // InternalSpec.g:1078:1: ( 'at' )
            {
            // InternalSpec.g:1078:1: ( 'at' )
            // InternalSpec.g:1079:2: 'at'
            {
             before(grammarAccess.getClickCommandAccess().getAtKeyword_1_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSpec.g:1088:1: rule__ClickCommand__Group_1_1__1 : rule__ClickCommand__Group_1_1__1__Impl ;
    public final void rule__ClickCommand__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1092:1: ( rule__ClickCommand__Group_1_1__1__Impl )
            // InternalSpec.g:1093:2: rule__ClickCommand__Group_1_1__1__Impl
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
    // InternalSpec.g:1099:1: rule__ClickCommand__Group_1_1__1__Impl : ( ( rule__ClickCommand__PointAssignment_1_1_1 ) ) ;
    public final void rule__ClickCommand__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1103:1: ( ( ( rule__ClickCommand__PointAssignment_1_1_1 ) ) )
            // InternalSpec.g:1104:1: ( ( rule__ClickCommand__PointAssignment_1_1_1 ) )
            {
            // InternalSpec.g:1104:1: ( ( rule__ClickCommand__PointAssignment_1_1_1 ) )
            // InternalSpec.g:1105:2: ( rule__ClickCommand__PointAssignment_1_1_1 )
            {
             before(grammarAccess.getClickCommandAccess().getPointAssignment_1_1_1()); 
            // InternalSpec.g:1106:2: ( rule__ClickCommand__PointAssignment_1_1_1 )
            // InternalSpec.g:1106:3: rule__ClickCommand__PointAssignment_1_1_1
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
    // InternalSpec.g:1115:1: rule__SelectCommand__Group_0__0 : rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1 ;
    public final void rule__SelectCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1119:1: ( rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1 )
            // InternalSpec.g:1120:2: rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1
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
    // InternalSpec.g:1127:1: rule__SelectCommand__Group_0__0__Impl : ( ( rule__SelectCommand__NameAssignment_0_0 ) ) ;
    public final void rule__SelectCommand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1131:1: ( ( ( rule__SelectCommand__NameAssignment_0_0 ) ) )
            // InternalSpec.g:1132:1: ( ( rule__SelectCommand__NameAssignment_0_0 ) )
            {
            // InternalSpec.g:1132:1: ( ( rule__SelectCommand__NameAssignment_0_0 ) )
            // InternalSpec.g:1133:2: ( rule__SelectCommand__NameAssignment_0_0 )
            {
             before(grammarAccess.getSelectCommandAccess().getNameAssignment_0_0()); 
            // InternalSpec.g:1134:2: ( rule__SelectCommand__NameAssignment_0_0 )
            // InternalSpec.g:1134:3: rule__SelectCommand__NameAssignment_0_0
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
    // InternalSpec.g:1142:1: rule__SelectCommand__Group_0__1 : rule__SelectCommand__Group_0__1__Impl ;
    public final void rule__SelectCommand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1146:1: ( rule__SelectCommand__Group_0__1__Impl )
            // InternalSpec.g:1147:2: rule__SelectCommand__Group_0__1__Impl
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
    // InternalSpec.g:1153:1: rule__SelectCommand__Group_0__1__Impl : ( ( rule__SelectCommand__ValueAssignment_0_1 ) ) ;
    public final void rule__SelectCommand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1157:1: ( ( ( rule__SelectCommand__ValueAssignment_0_1 ) ) )
            // InternalSpec.g:1158:1: ( ( rule__SelectCommand__ValueAssignment_0_1 ) )
            {
            // InternalSpec.g:1158:1: ( ( rule__SelectCommand__ValueAssignment_0_1 ) )
            // InternalSpec.g:1159:2: ( rule__SelectCommand__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSelectCommandAccess().getValueAssignment_0_1()); 
            // InternalSpec.g:1160:2: ( rule__SelectCommand__ValueAssignment_0_1 )
            // InternalSpec.g:1160:3: rule__SelectCommand__ValueAssignment_0_1
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
    // InternalSpec.g:1169:1: rule__SelectCommand__Group_1__0 : rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1 ;
    public final void rule__SelectCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1173:1: ( rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1 )
            // InternalSpec.g:1174:2: rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1
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
    // InternalSpec.g:1181:1: rule__SelectCommand__Group_1__0__Impl : ( ( rule__SelectCommand__NameAssignment_1_0 ) ) ;
    public final void rule__SelectCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1185:1: ( ( ( rule__SelectCommand__NameAssignment_1_0 ) ) )
            // InternalSpec.g:1186:1: ( ( rule__SelectCommand__NameAssignment_1_0 ) )
            {
            // InternalSpec.g:1186:1: ( ( rule__SelectCommand__NameAssignment_1_0 ) )
            // InternalSpec.g:1187:2: ( rule__SelectCommand__NameAssignment_1_0 )
            {
             before(grammarAccess.getSelectCommandAccess().getNameAssignment_1_0()); 
            // InternalSpec.g:1188:2: ( rule__SelectCommand__NameAssignment_1_0 )
            // InternalSpec.g:1188:3: rule__SelectCommand__NameAssignment_1_0
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
    // InternalSpec.g:1196:1: rule__SelectCommand__Group_1__1 : rule__SelectCommand__Group_1__1__Impl rule__SelectCommand__Group_1__2 ;
    public final void rule__SelectCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1200:1: ( rule__SelectCommand__Group_1__1__Impl rule__SelectCommand__Group_1__2 )
            // InternalSpec.g:1201:2: rule__SelectCommand__Group_1__1__Impl rule__SelectCommand__Group_1__2
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
    // InternalSpec.g:1208:1: rule__SelectCommand__Group_1__1__Impl : ( ( 'visible' )? ) ;
    public final void rule__SelectCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1212:1: ( ( ( 'visible' )? ) )
            // InternalSpec.g:1213:1: ( ( 'visible' )? )
            {
            // InternalSpec.g:1213:1: ( ( 'visible' )? )
            // InternalSpec.g:1214:2: ( 'visible' )?
            {
             before(grammarAccess.getSelectCommandAccess().getVisibleKeyword_1_1()); 
            // InternalSpec.g:1215:2: ( 'visible' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpec.g:1215:3: 'visible'
                    {
                    match(input,32,FOLLOW_2); 

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
    // InternalSpec.g:1223:1: rule__SelectCommand__Group_1__2 : rule__SelectCommand__Group_1__2__Impl ;
    public final void rule__SelectCommand__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1227:1: ( rule__SelectCommand__Group_1__2__Impl )
            // InternalSpec.g:1228:2: rule__SelectCommand__Group_1__2__Impl
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
    // InternalSpec.g:1234:1: rule__SelectCommand__Group_1__2__Impl : ( ( rule__SelectCommand__ValueAssignment_1_2 ) ) ;
    public final void rule__SelectCommand__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1238:1: ( ( ( rule__SelectCommand__ValueAssignment_1_2 ) ) )
            // InternalSpec.g:1239:1: ( ( rule__SelectCommand__ValueAssignment_1_2 ) )
            {
            // InternalSpec.g:1239:1: ( ( rule__SelectCommand__ValueAssignment_1_2 ) )
            // InternalSpec.g:1240:2: ( rule__SelectCommand__ValueAssignment_1_2 )
            {
             before(grammarAccess.getSelectCommandAccess().getValueAssignment_1_2()); 
            // InternalSpec.g:1241:2: ( rule__SelectCommand__ValueAssignment_1_2 )
            // InternalSpec.g:1241:3: rule__SelectCommand__ValueAssignment_1_2
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
    // InternalSpec.g:1250:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1254:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalSpec.g:1255:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
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
    // InternalSpec.g:1262:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__TypeAssignment_0 )? ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1266:1: ( ( ( rule__Selector__TypeAssignment_0 )? ) )
            // InternalSpec.g:1267:1: ( ( rule__Selector__TypeAssignment_0 )? )
            {
            // InternalSpec.g:1267:1: ( ( rule__Selector__TypeAssignment_0 )? )
            // InternalSpec.g:1268:2: ( rule__Selector__TypeAssignment_0 )?
            {
             before(grammarAccess.getSelectorAccess().getTypeAssignment_0()); 
            // InternalSpec.g:1269:2: ( rule__Selector__TypeAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=20 && LA15_0<=24)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSpec.g:1269:3: rule__Selector__TypeAssignment_0
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
    // InternalSpec.g:1277:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1281:1: ( rule__Selector__Group__1__Impl )
            // InternalSpec.g:1282:2: rule__Selector__Group__1__Impl
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
    // InternalSpec.g:1288:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Alternatives_1 ) ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1292:1: ( ( ( rule__Selector__Alternatives_1 ) ) )
            // InternalSpec.g:1293:1: ( ( rule__Selector__Alternatives_1 ) )
            {
            // InternalSpec.g:1293:1: ( ( rule__Selector__Alternatives_1 ) )
            // InternalSpec.g:1294:2: ( rule__Selector__Alternatives_1 )
            {
             before(grammarAccess.getSelectorAccess().getAlternatives_1()); 
            // InternalSpec.g:1295:2: ( rule__Selector__Alternatives_1 )
            // InternalSpec.g:1295:3: rule__Selector__Alternatives_1
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
    // InternalSpec.g:1304:1: rule__PropertyCommand__Group__0 : rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1 ;
    public final void rule__PropertyCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1308:1: ( rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1 )
            // InternalSpec.g:1309:2: rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1
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
    // InternalSpec.g:1316:1: rule__PropertyCommand__Group__0__Impl : ( ( rule__PropertyCommand__NameAssignment_0 ) ) ;
    public final void rule__PropertyCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1320:1: ( ( ( rule__PropertyCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:1321:1: ( ( rule__PropertyCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:1321:1: ( ( rule__PropertyCommand__NameAssignment_0 ) )
            // InternalSpec.g:1322:2: ( rule__PropertyCommand__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:1323:2: ( rule__PropertyCommand__NameAssignment_0 )
            // InternalSpec.g:1323:3: rule__PropertyCommand__NameAssignment_0
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
    // InternalSpec.g:1331:1: rule__PropertyCommand__Group__1 : rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2 ;
    public final void rule__PropertyCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1335:1: ( rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2 )
            // InternalSpec.g:1336:2: rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2
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
    // InternalSpec.g:1343:1: rule__PropertyCommand__Group__1__Impl : ( ( rule__PropertyCommand__PropAssignment_1 ) ) ;
    public final void rule__PropertyCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1347:1: ( ( ( rule__PropertyCommand__PropAssignment_1 ) ) )
            // InternalSpec.g:1348:1: ( ( rule__PropertyCommand__PropAssignment_1 ) )
            {
            // InternalSpec.g:1348:1: ( ( rule__PropertyCommand__PropAssignment_1 ) )
            // InternalSpec.g:1349:2: ( rule__PropertyCommand__PropAssignment_1 )
            {
             before(grammarAccess.getPropertyCommandAccess().getPropAssignment_1()); 
            // InternalSpec.g:1350:2: ( rule__PropertyCommand__PropAssignment_1 )
            // InternalSpec.g:1350:3: rule__PropertyCommand__PropAssignment_1
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
    // InternalSpec.g:1358:1: rule__PropertyCommand__Group__2 : rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3 ;
    public final void rule__PropertyCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1362:1: ( rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3 )
            // InternalSpec.g:1363:2: rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3
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
    // InternalSpec.g:1370:1: rule__PropertyCommand__Group__2__Impl : ( ( rule__PropertyCommand__CondAssignment_2 ) ) ;
    public final void rule__PropertyCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1374:1: ( ( ( rule__PropertyCommand__CondAssignment_2 ) ) )
            // InternalSpec.g:1375:1: ( ( rule__PropertyCommand__CondAssignment_2 ) )
            {
            // InternalSpec.g:1375:1: ( ( rule__PropertyCommand__CondAssignment_2 ) )
            // InternalSpec.g:1376:2: ( rule__PropertyCommand__CondAssignment_2 )
            {
             before(grammarAccess.getPropertyCommandAccess().getCondAssignment_2()); 
            // InternalSpec.g:1377:2: ( rule__PropertyCommand__CondAssignment_2 )
            // InternalSpec.g:1377:3: rule__PropertyCommand__CondAssignment_2
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
    // InternalSpec.g:1385:1: rule__PropertyCommand__Group__3 : rule__PropertyCommand__Group__3__Impl ;
    public final void rule__PropertyCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1389:1: ( rule__PropertyCommand__Group__3__Impl )
            // InternalSpec.g:1390:2: rule__PropertyCommand__Group__3__Impl
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
    // InternalSpec.g:1396:1: rule__PropertyCommand__Group__3__Impl : ( ( rule__PropertyCommand__Alternatives_3 ) ) ;
    public final void rule__PropertyCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1400:1: ( ( ( rule__PropertyCommand__Alternatives_3 ) ) )
            // InternalSpec.g:1401:1: ( ( rule__PropertyCommand__Alternatives_3 ) )
            {
            // InternalSpec.g:1401:1: ( ( rule__PropertyCommand__Alternatives_3 ) )
            // InternalSpec.g:1402:2: ( rule__PropertyCommand__Alternatives_3 )
            {
             before(grammarAccess.getPropertyCommandAccess().getAlternatives_3()); 
            // InternalSpec.g:1403:2: ( rule__PropertyCommand__Alternatives_3 )
            // InternalSpec.g:1403:3: rule__PropertyCommand__Alternatives_3
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
    // InternalSpec.g:1412:1: rule__TypeCommand__Group__0 : rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1 ;
    public final void rule__TypeCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1416:1: ( rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1 )
            // InternalSpec.g:1417:2: rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1
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
    // InternalSpec.g:1424:1: rule__TypeCommand__Group__0__Impl : ( ( rule__TypeCommand__NameAssignment_0 ) ) ;
    public final void rule__TypeCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1428:1: ( ( ( rule__TypeCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:1429:1: ( ( rule__TypeCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:1429:1: ( ( rule__TypeCommand__NameAssignment_0 ) )
            // InternalSpec.g:1430:2: ( rule__TypeCommand__NameAssignment_0 )
            {
             before(grammarAccess.getTypeCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:1431:2: ( rule__TypeCommand__NameAssignment_0 )
            // InternalSpec.g:1431:3: rule__TypeCommand__NameAssignment_0
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
    // InternalSpec.g:1439:1: rule__TypeCommand__Group__1 : rule__TypeCommand__Group__1__Impl ;
    public final void rule__TypeCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1443:1: ( rule__TypeCommand__Group__1__Impl )
            // InternalSpec.g:1444:2: rule__TypeCommand__Group__1__Impl
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
    // InternalSpec.g:1450:1: rule__TypeCommand__Group__1__Impl : ( ( rule__TypeCommand__Alternatives_1 ) ) ;
    public final void rule__TypeCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1454:1: ( ( ( rule__TypeCommand__Alternatives_1 ) ) )
            // InternalSpec.g:1455:1: ( ( rule__TypeCommand__Alternatives_1 ) )
            {
            // InternalSpec.g:1455:1: ( ( rule__TypeCommand__Alternatives_1 ) )
            // InternalSpec.g:1456:2: ( rule__TypeCommand__Alternatives_1 )
            {
             before(grammarAccess.getTypeCommandAccess().getAlternatives_1()); 
            // InternalSpec.g:1457:2: ( rule__TypeCommand__Alternatives_1 )
            // InternalSpec.g:1457:3: rule__TypeCommand__Alternatives_1
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
    // InternalSpec.g:1466:1: rule__SleepCommand__Group__0 : rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1 ;
    public final void rule__SleepCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1470:1: ( rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1 )
            // InternalSpec.g:1471:2: rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1
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
    // InternalSpec.g:1478:1: rule__SleepCommand__Group__0__Impl : ( ( rule__SleepCommand__NameAssignment_0 ) ) ;
    public final void rule__SleepCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1482:1: ( ( ( rule__SleepCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:1483:1: ( ( rule__SleepCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:1483:1: ( ( rule__SleepCommand__NameAssignment_0 ) )
            // InternalSpec.g:1484:2: ( rule__SleepCommand__NameAssignment_0 )
            {
             before(grammarAccess.getSleepCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:1485:2: ( rule__SleepCommand__NameAssignment_0 )
            // InternalSpec.g:1485:3: rule__SleepCommand__NameAssignment_0
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
    // InternalSpec.g:1493:1: rule__SleepCommand__Group__1 : rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2 ;
    public final void rule__SleepCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1497:1: ( rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2 )
            // InternalSpec.g:1498:2: rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2
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
    // InternalSpec.g:1505:1: rule__SleepCommand__Group__1__Impl : ( 'for' ) ;
    public final void rule__SleepCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1509:1: ( ( 'for' ) )
            // InternalSpec.g:1510:1: ( 'for' )
            {
            // InternalSpec.g:1510:1: ( 'for' )
            // InternalSpec.g:1511:2: 'for'
            {
             before(grammarAccess.getSleepCommandAccess().getForKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSpec.g:1520:1: rule__SleepCommand__Group__2 : rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3 ;
    public final void rule__SleepCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1524:1: ( rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3 )
            // InternalSpec.g:1525:2: rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3
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
    // InternalSpec.g:1532:1: rule__SleepCommand__Group__2__Impl : ( ( rule__SleepCommand__TimeAssignment_2 ) ) ;
    public final void rule__SleepCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1536:1: ( ( ( rule__SleepCommand__TimeAssignment_2 ) ) )
            // InternalSpec.g:1537:1: ( ( rule__SleepCommand__TimeAssignment_2 ) )
            {
            // InternalSpec.g:1537:1: ( ( rule__SleepCommand__TimeAssignment_2 ) )
            // InternalSpec.g:1538:2: ( rule__SleepCommand__TimeAssignment_2 )
            {
             before(grammarAccess.getSleepCommandAccess().getTimeAssignment_2()); 
            // InternalSpec.g:1539:2: ( rule__SleepCommand__TimeAssignment_2 )
            // InternalSpec.g:1539:3: rule__SleepCommand__TimeAssignment_2
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
    // InternalSpec.g:1547:1: rule__SleepCommand__Group__3 : rule__SleepCommand__Group__3__Impl ;
    public final void rule__SleepCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1551:1: ( rule__SleepCommand__Group__3__Impl )
            // InternalSpec.g:1552:2: rule__SleepCommand__Group__3__Impl
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
    // InternalSpec.g:1558:1: rule__SleepCommand__Group__3__Impl : ( ( rule__SleepCommand__Alternatives_3 ) ) ;
    public final void rule__SleepCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1562:1: ( ( ( rule__SleepCommand__Alternatives_3 ) ) )
            // InternalSpec.g:1563:1: ( ( rule__SleepCommand__Alternatives_3 ) )
            {
            // InternalSpec.g:1563:1: ( ( rule__SleepCommand__Alternatives_3 ) )
            // InternalSpec.g:1564:2: ( rule__SleepCommand__Alternatives_3 )
            {
             before(grammarAccess.getSleepCommandAccess().getAlternatives_3()); 
            // InternalSpec.g:1565:2: ( rule__SleepCommand__Alternatives_3 )
            // InternalSpec.g:1565:3: rule__SleepCommand__Alternatives_3
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
    // InternalSpec.g:1574:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1578:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalSpec.g:1579:2: rule__Point__Group__0__Impl rule__Point__Group__1
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
    // InternalSpec.g:1586:1: rule__Point__Group__0__Impl : ( '{' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1590:1: ( ( '{' ) )
            // InternalSpec.g:1591:1: ( '{' )
            {
            // InternalSpec.g:1591:1: ( '{' )
            // InternalSpec.g:1592:2: '{'
            {
             before(grammarAccess.getPointAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSpec.g:1601:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1605:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalSpec.g:1606:2: rule__Point__Group__1__Impl rule__Point__Group__2
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
    // InternalSpec.g:1613:1: rule__Point__Group__1__Impl : ( ( rule__Point__XAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1617:1: ( ( ( rule__Point__XAssignment_1 ) ) )
            // InternalSpec.g:1618:1: ( ( rule__Point__XAssignment_1 ) )
            {
            // InternalSpec.g:1618:1: ( ( rule__Point__XAssignment_1 ) )
            // InternalSpec.g:1619:2: ( rule__Point__XAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_1()); 
            // InternalSpec.g:1620:2: ( rule__Point__XAssignment_1 )
            // InternalSpec.g:1620:3: rule__Point__XAssignment_1
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
    // InternalSpec.g:1628:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1632:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalSpec.g:1633:2: rule__Point__Group__2__Impl rule__Point__Group__3
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
    // InternalSpec.g:1640:1: rule__Point__Group__2__Impl : ( ',' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1644:1: ( ( ',' ) )
            // InternalSpec.g:1645:1: ( ',' )
            {
            // InternalSpec.g:1645:1: ( ',' )
            // InternalSpec.g:1646:2: ','
            {
             before(grammarAccess.getPointAccess().getCommaKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSpec.g:1655:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1659:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // InternalSpec.g:1660:2: rule__Point__Group__3__Impl rule__Point__Group__4
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
    // InternalSpec.g:1667:1: rule__Point__Group__3__Impl : ( ( rule__Point__YAssignment_3 ) ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1671:1: ( ( ( rule__Point__YAssignment_3 ) ) )
            // InternalSpec.g:1672:1: ( ( rule__Point__YAssignment_3 ) )
            {
            // InternalSpec.g:1672:1: ( ( rule__Point__YAssignment_3 ) )
            // InternalSpec.g:1673:2: ( rule__Point__YAssignment_3 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_3()); 
            // InternalSpec.g:1674:2: ( rule__Point__YAssignment_3 )
            // InternalSpec.g:1674:3: rule__Point__YAssignment_3
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
    // InternalSpec.g:1682:1: rule__Point__Group__4 : rule__Point__Group__4__Impl ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1686:1: ( rule__Point__Group__4__Impl )
            // InternalSpec.g:1687:2: rule__Point__Group__4__Impl
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
    // InternalSpec.g:1693:1: rule__Point__Group__4__Impl : ( '}' ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1697:1: ( ( '}' ) )
            // InternalSpec.g:1698:1: ( '}' )
            {
            // InternalSpec.g:1698:1: ( '}' )
            // InternalSpec.g:1699:2: '}'
            {
             before(grammarAccess.getPointAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSpec.g:1709:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1713:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalSpec.g:1714:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
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
    // InternalSpec.g:1721:1: rule__VarDeclaration__Group__0__Impl : ( 'Store' ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1725:1: ( ( 'Store' ) )
            // InternalSpec.g:1726:1: ( 'Store' )
            {
            // InternalSpec.g:1726:1: ( 'Store' )
            // InternalSpec.g:1727:2: 'Store'
            {
             before(grammarAccess.getVarDeclarationAccess().getStoreKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSpec.g:1736:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1740:1: ( rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 )
            // InternalSpec.g:1741:2: rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2
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
    // InternalSpec.g:1748:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1752:1: ( ( ( rule__VarDeclaration__NameAssignment_1 ) ) )
            // InternalSpec.g:1753:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            {
            // InternalSpec.g:1753:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            // InternalSpec.g:1754:2: ( rule__VarDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 
            // InternalSpec.g:1755:2: ( rule__VarDeclaration__NameAssignment_1 )
            // InternalSpec.g:1755:3: rule__VarDeclaration__NameAssignment_1
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
    // InternalSpec.g:1763:1: rule__VarDeclaration__Group__2 : rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 ;
    public final void rule__VarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1767:1: ( rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 )
            // InternalSpec.g:1768:2: rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3
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
    // InternalSpec.g:1775:1: rule__VarDeclaration__Group__2__Impl : ( 'as' ) ;
    public final void rule__VarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1779:1: ( ( 'as' ) )
            // InternalSpec.g:1780:1: ( 'as' )
            {
            // InternalSpec.g:1780:1: ( 'as' )
            // InternalSpec.g:1781:2: 'as'
            {
             before(grammarAccess.getVarDeclarationAccess().getAsKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSpec.g:1790:1: rule__VarDeclaration__Group__3 : rule__VarDeclaration__Group__3__Impl ;
    public final void rule__VarDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1794:1: ( rule__VarDeclaration__Group__3__Impl )
            // InternalSpec.g:1795:2: rule__VarDeclaration__Group__3__Impl
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
    // InternalSpec.g:1801:1: rule__VarDeclaration__Group__3__Impl : ( ( rule__VarDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VarDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1805:1: ( ( ( rule__VarDeclaration__ValueAssignment_3 ) ) )
            // InternalSpec.g:1806:1: ( ( rule__VarDeclaration__ValueAssignment_3 ) )
            {
            // InternalSpec.g:1806:1: ( ( rule__VarDeclaration__ValueAssignment_3 ) )
            // InternalSpec.g:1807:2: ( rule__VarDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVarDeclarationAccess().getValueAssignment_3()); 
            // InternalSpec.g:1808:2: ( rule__VarDeclaration__ValueAssignment_3 )
            // InternalSpec.g:1808:3: rule__VarDeclaration__ValueAssignment_3
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
    // InternalSpec.g:1817:1: rule__Model__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1821:1: ( ( ruleCommand ) )
            // InternalSpec.g:1822:2: ( ruleCommand )
            {
            // InternalSpec.g:1822:2: ( ruleCommand )
            // InternalSpec.g:1823:3: ruleCommand
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
    // InternalSpec.g:1832:1: rule__Command__CustomAssignment_8 : ( RULE_CUSTOM_COMMAND ) ;
    public final void rule__Command__CustomAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1836:1: ( ( RULE_CUSTOM_COMMAND ) )
            // InternalSpec.g:1837:2: ( RULE_CUSTOM_COMMAND )
            {
            // InternalSpec.g:1837:2: ( RULE_CUSTOM_COMMAND )
            // InternalSpec.g:1838:3: RULE_CUSTOM_COMMAND
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
    // InternalSpec.g:1847:1: rule__UsingCommand__NameAssignment_0 : ( ( 'Using' ) ) ;
    public final void rule__UsingCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1851:1: ( ( ( 'Using' ) ) )
            // InternalSpec.g:1852:2: ( ( 'Using' ) )
            {
            // InternalSpec.g:1852:2: ( ( 'Using' ) )
            // InternalSpec.g:1853:3: ( 'Using' )
            {
             before(grammarAccess.getUsingCommandAccess().getNameUsingKeyword_0_0()); 
            // InternalSpec.g:1854:3: ( 'Using' )
            // InternalSpec.g:1855:4: 'Using'
            {
             before(grammarAccess.getUsingCommandAccess().getNameUsingKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSpec.g:1866:1: rule__UsingCommand__BrowserAssignment_1 : ( ruleBrowser ) ;
    public final void rule__UsingCommand__BrowserAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1870:1: ( ( ruleBrowser ) )
            // InternalSpec.g:1871:2: ( ruleBrowser )
            {
            // InternalSpec.g:1871:2: ( ruleBrowser )
            // InternalSpec.g:1872:3: ruleBrowser
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
    // InternalSpec.g:1881:1: rule__OpenCommand__NameAssignment_1 : ( ( 'Open' ) ) ;
    public final void rule__OpenCommand__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1885:1: ( ( ( 'Open' ) ) )
            // InternalSpec.g:1886:2: ( ( 'Open' ) )
            {
            // InternalSpec.g:1886:2: ( ( 'Open' ) )
            // InternalSpec.g:1887:3: ( 'Open' )
            {
             before(grammarAccess.getOpenCommandAccess().getNameOpenKeyword_1_0()); 
            // InternalSpec.g:1888:3: ( 'Open' )
            // InternalSpec.g:1889:4: 'Open'
            {
             before(grammarAccess.getOpenCommandAccess().getNameOpenKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSpec.g:1900:1: rule__OpenCommand__ValAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__OpenCommand__ValAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1904:1: ( ( RULE_STRING ) )
            // InternalSpec.g:1905:2: ( RULE_STRING )
            {
            // InternalSpec.g:1905:2: ( RULE_STRING )
            // InternalSpec.g:1906:3: RULE_STRING
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
    // InternalSpec.g:1915:1: rule__OpenCommand__VarAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__OpenCommand__VarAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1919:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:1920:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:1920:2: ( ( RULE_ID ) )
            // InternalSpec.g:1921:3: ( RULE_ID )
            {
             before(grammarAccess.getOpenCommandAccess().getVarVarDeclarationCrossReference_2_1_0()); 
            // InternalSpec.g:1922:3: ( RULE_ID )
            // InternalSpec.g:1923:4: RULE_ID
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
    // InternalSpec.g:1934:1: rule__ClickCommand__NameAssignment_0 : ( ( 'Click' ) ) ;
    public final void rule__ClickCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1938:1: ( ( ( 'Click' ) ) )
            // InternalSpec.g:1939:2: ( ( 'Click' ) )
            {
            // InternalSpec.g:1939:2: ( ( 'Click' ) )
            // InternalSpec.g:1940:3: ( 'Click' )
            {
             before(grammarAccess.getClickCommandAccess().getNameClickKeyword_0_0()); 
            // InternalSpec.g:1941:3: ( 'Click' )
            // InternalSpec.g:1942:4: 'Click'
            {
             before(grammarAccess.getClickCommandAccess().getNameClickKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSpec.g:1953:1: rule__ClickCommand__SelectorAssignment_1_0_1 : ( ruleSelector ) ;
    public final void rule__ClickCommand__SelectorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1957:1: ( ( ruleSelector ) )
            // InternalSpec.g:1958:2: ( ruleSelector )
            {
            // InternalSpec.g:1958:2: ( ruleSelector )
            // InternalSpec.g:1959:3: ruleSelector
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
    // InternalSpec.g:1968:1: rule__ClickCommand__PointAssignment_1_1_1 : ( rulePoint ) ;
    public final void rule__ClickCommand__PointAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1972:1: ( ( rulePoint ) )
            // InternalSpec.g:1973:2: ( rulePoint )
            {
            // InternalSpec.g:1973:2: ( rulePoint )
            // InternalSpec.g:1974:3: rulePoint
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
    // InternalSpec.g:1983:1: rule__SelectCommand__NameAssignment_0_0 : ( ( 'Within' ) ) ;
    public final void rule__SelectCommand__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1987:1: ( ( ( 'Within' ) ) )
            // InternalSpec.g:1988:2: ( ( 'Within' ) )
            {
            // InternalSpec.g:1988:2: ( ( 'Within' ) )
            // InternalSpec.g:1989:3: ( 'Within' )
            {
             before(grammarAccess.getSelectCommandAccess().getNameWithinKeyword_0_0_0()); 
            // InternalSpec.g:1990:3: ( 'Within' )
            // InternalSpec.g:1991:4: 'Within'
            {
             before(grammarAccess.getSelectCommandAccess().getNameWithinKeyword_0_0_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSpec.g:2002:1: rule__SelectCommand__ValueAssignment_0_1 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2006:1: ( ( ruleSelector ) )
            // InternalSpec.g:2007:2: ( ruleSelector )
            {
            // InternalSpec.g:2007:2: ( ruleSelector )
            // InternalSpec.g:2008:3: ruleSelector
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
    // InternalSpec.g:2017:1: rule__SelectCommand__NameAssignment_1_0 : ( ( 'Select' ) ) ;
    public final void rule__SelectCommand__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2021:1: ( ( ( 'Select' ) ) )
            // InternalSpec.g:2022:2: ( ( 'Select' ) )
            {
            // InternalSpec.g:2022:2: ( ( 'Select' ) )
            // InternalSpec.g:2023:3: ( 'Select' )
            {
             before(grammarAccess.getSelectCommandAccess().getNameSelectKeyword_1_0_0()); 
            // InternalSpec.g:2024:3: ( 'Select' )
            // InternalSpec.g:2025:4: 'Select'
            {
             before(grammarAccess.getSelectCommandAccess().getNameSelectKeyword_1_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSpec.g:2036:1: rule__SelectCommand__ValueAssignment_1_2 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2040:1: ( ( ruleSelector ) )
            // InternalSpec.g:2041:2: ( ruleSelector )
            {
            // InternalSpec.g:2041:2: ( ruleSelector )
            // InternalSpec.g:2042:3: ruleSelector
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
    // InternalSpec.g:2051:1: rule__Selector__TypeAssignment_0 : ( ruleElementType ) ;
    public final void rule__Selector__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2055:1: ( ( ruleElementType ) )
            // InternalSpec.g:2056:2: ( ruleElementType )
            {
            // InternalSpec.g:2056:2: ( ruleElementType )
            // InternalSpec.g:2057:3: ruleElementType
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
    // InternalSpec.g:2066:1: rule__Selector__VarAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Selector__VarAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2070:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2071:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2071:2: ( ( RULE_ID ) )
            // InternalSpec.g:2072:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectorAccess().getVarVarDeclarationCrossReference_1_0_0()); 
            // InternalSpec.g:2073:3: ( RULE_ID )
            // InternalSpec.g:2074:4: RULE_ID
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
    // InternalSpec.g:2085:1: rule__Selector__ValAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Selector__ValAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2089:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2090:2: ( RULE_STRING )
            {
            // InternalSpec.g:2090:2: ( RULE_STRING )
            // InternalSpec.g:2091:3: RULE_STRING
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
    // InternalSpec.g:2100:1: rule__PropertyCommand__NameAssignment_0 : ( ( 'Property' ) ) ;
    public final void rule__PropertyCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2104:1: ( ( ( 'Property' ) ) )
            // InternalSpec.g:2105:2: ( ( 'Property' ) )
            {
            // InternalSpec.g:2105:2: ( ( 'Property' ) )
            // InternalSpec.g:2106:3: ( 'Property' )
            {
             before(grammarAccess.getPropertyCommandAccess().getNamePropertyKeyword_0_0()); 
            // InternalSpec.g:2107:3: ( 'Property' )
            // InternalSpec.g:2108:4: 'Property'
            {
             before(grammarAccess.getPropertyCommandAccess().getNamePropertyKeyword_0_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSpec.g:2119:1: rule__PropertyCommand__PropAssignment_1 : ( ruleProperty ) ;
    public final void rule__PropertyCommand__PropAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2123:1: ( ( ruleProperty ) )
            // InternalSpec.g:2124:2: ( ruleProperty )
            {
            // InternalSpec.g:2124:2: ( ruleProperty )
            // InternalSpec.g:2125:3: ruleProperty
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
    // InternalSpec.g:2134:1: rule__PropertyCommand__CondAssignment_2 : ( ruleCondition ) ;
    public final void rule__PropertyCommand__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2138:1: ( ( ruleCondition ) )
            // InternalSpec.g:2139:2: ( ruleCondition )
            {
            // InternalSpec.g:2139:2: ( ruleCondition )
            // InternalSpec.g:2140:3: ruleCondition
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
    // InternalSpec.g:2149:1: rule__PropertyCommand__ValAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__PropertyCommand__ValAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2153:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2154:2: ( RULE_STRING )
            {
            // InternalSpec.g:2154:2: ( RULE_STRING )
            // InternalSpec.g:2155:3: RULE_STRING
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
    // InternalSpec.g:2164:1: rule__PropertyCommand__VarAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyCommand__VarAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2168:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2169:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2169:2: ( ( RULE_ID ) )
            // InternalSpec.g:2170:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyCommandAccess().getVarVarDeclarationCrossReference_3_1_0()); 
            // InternalSpec.g:2171:3: ( RULE_ID )
            // InternalSpec.g:2172:4: RULE_ID
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
    // InternalSpec.g:2183:1: rule__TypeCommand__NameAssignment_0 : ( ( 'Type' ) ) ;
    public final void rule__TypeCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2187:1: ( ( ( 'Type' ) ) )
            // InternalSpec.g:2188:2: ( ( 'Type' ) )
            {
            // InternalSpec.g:2188:2: ( ( 'Type' ) )
            // InternalSpec.g:2189:3: ( 'Type' )
            {
             before(grammarAccess.getTypeCommandAccess().getNameTypeKeyword_0_0()); 
            // InternalSpec.g:2190:3: ( 'Type' )
            // InternalSpec.g:2191:4: 'Type'
            {
             before(grammarAccess.getTypeCommandAccess().getNameTypeKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSpec.g:2202:1: rule__TypeCommand__StrAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__TypeCommand__StrAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2206:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2207:2: ( RULE_STRING )
            {
            // InternalSpec.g:2207:2: ( RULE_STRING )
            // InternalSpec.g:2208:3: RULE_STRING
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
    // InternalSpec.g:2217:1: rule__TypeCommand__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeCommand__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2221:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2222:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2222:2: ( ( RULE_ID ) )
            // InternalSpec.g:2223:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeCommandAccess().getVarVarDeclarationCrossReference_1_1_0()); 
            // InternalSpec.g:2224:3: ( RULE_ID )
            // InternalSpec.g:2225:4: RULE_ID
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
    // InternalSpec.g:2236:1: rule__SleepCommand__NameAssignment_0 : ( ( 'Sleep' ) ) ;
    public final void rule__SleepCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2240:1: ( ( ( 'Sleep' ) ) )
            // InternalSpec.g:2241:2: ( ( 'Sleep' ) )
            {
            // InternalSpec.g:2241:2: ( ( 'Sleep' ) )
            // InternalSpec.g:2242:3: ( 'Sleep' )
            {
             before(grammarAccess.getSleepCommandAccess().getNameSleepKeyword_0_0()); 
            // InternalSpec.g:2243:3: ( 'Sleep' )
            // InternalSpec.g:2244:4: 'Sleep'
            {
             before(grammarAccess.getSleepCommandAccess().getNameSleepKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSpec.g:2255:1: rule__SleepCommand__TimeAssignment_2 : ( RULE_INT ) ;
    public final void rule__SleepCommand__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2259:1: ( ( RULE_INT ) )
            // InternalSpec.g:2260:2: ( RULE_INT )
            {
            // InternalSpec.g:2260:2: ( RULE_INT )
            // InternalSpec.g:2261:3: RULE_INT
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
    // InternalSpec.g:2270:1: rule__Point__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Point__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2274:1: ( ( RULE_INT ) )
            // InternalSpec.g:2275:2: ( RULE_INT )
            {
            // InternalSpec.g:2275:2: ( RULE_INT )
            // InternalSpec.g:2276:3: RULE_INT
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
    // InternalSpec.g:2285:1: rule__Point__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Point__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2289:1: ( ( RULE_INT ) )
            // InternalSpec.g:2290:2: ( RULE_INT )
            {
            // InternalSpec.g:2290:2: ( RULE_INT )
            // InternalSpec.g:2291:3: RULE_INT
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
    // InternalSpec.g:2300:1: rule__VarDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2304:1: ( ( RULE_ID ) )
            // InternalSpec.g:2305:2: ( RULE_ID )
            {
            // InternalSpec.g:2305:2: ( RULE_ID )
            // InternalSpec.g:2306:3: RULE_ID
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
    // InternalSpec.g:2315:1: rule__VarDeclaration__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__VarDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2319:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2320:2: ( RULE_STRING )
            {
            // InternalSpec.g:2320:2: ( RULE_STRING )
            // InternalSpec.g:2321:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00007FA000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001F000C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000101F000C0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_CUSTOM_COMMAND", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'second'", "'seconds'", "'Chrome'", "'Firefox'", "'Explorer'", "'Edge'", "'Opera'", "'Safari'", "'button'", "'element'", "'link'", "'input'", "'textarea'", "'text'", "'class'", "'value'", "'should be'", "'should not be'", "'on'", "'at'", "'visible'", "'for'", "'{'", "','", "'}'", "'Perform'", "'times'", "':'", "'\\n\\n'", "'Store'", "'as'", "'Using'", "'Open'", "'Click'", "'Within'", "'Select'", "'Property'", "'Type'", "'Sleep'"
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

                if ( ((LA1_0>=RULE_SL_COMMENT && LA1_0<=RULE_CUSTOM_COMMAND)||LA1_0==37||LA1_0==41||(LA1_0>=43 && LA1_0<=50)) ) {
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


    // $ANTLR start "entryRuleLoopCommand"
    // InternalSpec.g:328:1: entryRuleLoopCommand : ruleLoopCommand EOF ;
    public final void entryRuleLoopCommand() throws RecognitionException {
        try {
            // InternalSpec.g:329:1: ( ruleLoopCommand EOF )
            // InternalSpec.g:330:1: ruleLoopCommand EOF
            {
             before(grammarAccess.getLoopCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleLoopCommand();

            state._fsp--;

             after(grammarAccess.getLoopCommandRule()); 
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
    // $ANTLR end "entryRuleLoopCommand"


    // $ANTLR start "ruleLoopCommand"
    // InternalSpec.g:337:1: ruleLoopCommand : ( ( rule__LoopCommand__Group__0 ) ) ;
    public final void ruleLoopCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:341:2: ( ( ( rule__LoopCommand__Group__0 ) ) )
            // InternalSpec.g:342:2: ( ( rule__LoopCommand__Group__0 ) )
            {
            // InternalSpec.g:342:2: ( ( rule__LoopCommand__Group__0 ) )
            // InternalSpec.g:343:3: ( rule__LoopCommand__Group__0 )
            {
             before(grammarAccess.getLoopCommandAccess().getGroup()); 
            // InternalSpec.g:344:3: ( rule__LoopCommand__Group__0 )
            // InternalSpec.g:344:4: rule__LoopCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoopCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoopCommand"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalSpec.g:353:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalSpec.g:354:1: ( ruleVarDeclaration EOF )
            // InternalSpec.g:355:1: ruleVarDeclaration EOF
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
    // InternalSpec.g:362:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:366:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalSpec.g:367:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalSpec.g:367:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalSpec.g:368:3: ( rule__VarDeclaration__Group__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            // InternalSpec.g:369:3: ( rule__VarDeclaration__Group__0 )
            // InternalSpec.g:369:4: rule__VarDeclaration__Group__0
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
    // InternalSpec.g:378:1: ruleBrowser : ( ( rule__Browser__Alternatives ) ) ;
    public final void ruleBrowser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:382:1: ( ( ( rule__Browser__Alternatives ) ) )
            // InternalSpec.g:383:2: ( ( rule__Browser__Alternatives ) )
            {
            // InternalSpec.g:383:2: ( ( rule__Browser__Alternatives ) )
            // InternalSpec.g:384:3: ( rule__Browser__Alternatives )
            {
             before(grammarAccess.getBrowserAccess().getAlternatives()); 
            // InternalSpec.g:385:3: ( rule__Browser__Alternatives )
            // InternalSpec.g:385:4: rule__Browser__Alternatives
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
    // InternalSpec.g:394:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:398:1: ( ( ( rule__ElementType__Alternatives ) ) )
            // InternalSpec.g:399:2: ( ( rule__ElementType__Alternatives ) )
            {
            // InternalSpec.g:399:2: ( ( rule__ElementType__Alternatives ) )
            // InternalSpec.g:400:3: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // InternalSpec.g:401:3: ( rule__ElementType__Alternatives )
            // InternalSpec.g:401:4: rule__ElementType__Alternatives
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
    // InternalSpec.g:410:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:414:1: ( ( ( rule__Property__Alternatives ) ) )
            // InternalSpec.g:415:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalSpec.g:415:2: ( ( rule__Property__Alternatives ) )
            // InternalSpec.g:416:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalSpec.g:417:3: ( rule__Property__Alternatives )
            // InternalSpec.g:417:4: rule__Property__Alternatives
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
    // InternalSpec.g:426:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:430:1: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalSpec.g:431:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalSpec.g:431:2: ( ( rule__Condition__Alternatives ) )
            // InternalSpec.g:432:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalSpec.g:433:3: ( rule__Condition__Alternatives )
            // InternalSpec.g:433:4: rule__Condition__Alternatives
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
    // InternalSpec.g:441:1: rule__Command__Alternatives : ( ( ruleUsingCommand ) | ( ruleOpenCommand ) | ( ruleClickCommand ) | ( ruleSelectCommand ) | ( rulePropertyCommand ) | ( ruleTypeCommand ) | ( ruleSleepCommand ) | ( ruleLoopCommand ) | ( ( rule__Command__Group_8__0 ) ) | ( ( rule__Command__CustomAssignment_9 ) ) | ( ruleVarDeclaration ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:445:1: ( ( ruleUsingCommand ) | ( ruleOpenCommand ) | ( ruleClickCommand ) | ( ruleSelectCommand ) | ( rulePropertyCommand ) | ( ruleTypeCommand ) | ( ruleSleepCommand ) | ( ruleLoopCommand ) | ( ( rule__Command__Group_8__0 ) ) | ( ( rule__Command__CustomAssignment_9 ) ) | ( ruleVarDeclaration ) )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt2=1;
                }
                break;
            case 44:
                {
                alt2=2;
                }
                break;
            case 45:
                {
                alt2=3;
                }
                break;
            case 46:
            case 47:
                {
                alt2=4;
                }
                break;
            case 48:
                {
                alt2=5;
                }
                break;
            case 49:
                {
                alt2=6;
                }
                break;
            case 50:
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
            case 41:
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
                    // InternalSpec.g:446:2: ( ruleUsingCommand )
                    {
                    // InternalSpec.g:446:2: ( ruleUsingCommand )
                    // InternalSpec.g:447:3: ruleUsingCommand
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
                    // InternalSpec.g:452:2: ( ruleOpenCommand )
                    {
                    // InternalSpec.g:452:2: ( ruleOpenCommand )
                    // InternalSpec.g:453:3: ruleOpenCommand
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
                    // InternalSpec.g:458:2: ( ruleClickCommand )
                    {
                    // InternalSpec.g:458:2: ( ruleClickCommand )
                    // InternalSpec.g:459:3: ruleClickCommand
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
                    // InternalSpec.g:464:2: ( ruleSelectCommand )
                    {
                    // InternalSpec.g:464:2: ( ruleSelectCommand )
                    // InternalSpec.g:465:3: ruleSelectCommand
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
                    // InternalSpec.g:470:2: ( rulePropertyCommand )
                    {
                    // InternalSpec.g:470:2: ( rulePropertyCommand )
                    // InternalSpec.g:471:3: rulePropertyCommand
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
                    // InternalSpec.g:476:2: ( ruleTypeCommand )
                    {
                    // InternalSpec.g:476:2: ( ruleTypeCommand )
                    // InternalSpec.g:477:3: ruleTypeCommand
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
                    // InternalSpec.g:482:2: ( ruleSleepCommand )
                    {
                    // InternalSpec.g:482:2: ( ruleSleepCommand )
                    // InternalSpec.g:483:3: ruleSleepCommand
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
                    // InternalSpec.g:488:2: ( ruleLoopCommand )
                    {
                    // InternalSpec.g:488:2: ( ruleLoopCommand )
                    // InternalSpec.g:489:3: ruleLoopCommand
                    {
                     before(grammarAccess.getCommandAccess().getLoopCommandParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleLoopCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getLoopCommandParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSpec.g:494:2: ( ( rule__Command__Group_8__0 ) )
                    {
                    // InternalSpec.g:494:2: ( ( rule__Command__Group_8__0 ) )
                    // InternalSpec.g:495:3: ( rule__Command__Group_8__0 )
                    {
                     before(grammarAccess.getCommandAccess().getGroup_8()); 
                    // InternalSpec.g:496:3: ( rule__Command__Group_8__0 )
                    // InternalSpec.g:496:4: rule__Command__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommandAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSpec.g:500:2: ( ( rule__Command__CustomAssignment_9 ) )
                    {
                    // InternalSpec.g:500:2: ( ( rule__Command__CustomAssignment_9 ) )
                    // InternalSpec.g:501:3: ( rule__Command__CustomAssignment_9 )
                    {
                     before(grammarAccess.getCommandAccess().getCustomAssignment_9()); 
                    // InternalSpec.g:502:3: ( rule__Command__CustomAssignment_9 )
                    // InternalSpec.g:502:4: rule__Command__CustomAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__CustomAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommandAccess().getCustomAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSpec.g:506:2: ( ruleVarDeclaration )
                    {
                    // InternalSpec.g:506:2: ( ruleVarDeclaration )
                    // InternalSpec.g:507:3: ruleVarDeclaration
                    {
                     before(grammarAccess.getCommandAccess().getVarDeclarationParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleVarDeclaration();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getVarDeclarationParserRuleCall_10()); 

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
    // InternalSpec.g:516:1: rule__OpenCommand__Alternatives_2 : ( ( ( rule__OpenCommand__ValAssignment_2_0 ) ) | ( ( rule__OpenCommand__VarAssignment_2_1 ) ) );
    public final void rule__OpenCommand__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:520:1: ( ( ( rule__OpenCommand__ValAssignment_2_0 ) ) | ( ( rule__OpenCommand__VarAssignment_2_1 ) ) )
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
                    // InternalSpec.g:521:2: ( ( rule__OpenCommand__ValAssignment_2_0 ) )
                    {
                    // InternalSpec.g:521:2: ( ( rule__OpenCommand__ValAssignment_2_0 ) )
                    // InternalSpec.g:522:3: ( rule__OpenCommand__ValAssignment_2_0 )
                    {
                     before(grammarAccess.getOpenCommandAccess().getValAssignment_2_0()); 
                    // InternalSpec.g:523:3: ( rule__OpenCommand__ValAssignment_2_0 )
                    // InternalSpec.g:523:4: rule__OpenCommand__ValAssignment_2_0
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
                    // InternalSpec.g:527:2: ( ( rule__OpenCommand__VarAssignment_2_1 ) )
                    {
                    // InternalSpec.g:527:2: ( ( rule__OpenCommand__VarAssignment_2_1 ) )
                    // InternalSpec.g:528:3: ( rule__OpenCommand__VarAssignment_2_1 )
                    {
                     before(grammarAccess.getOpenCommandAccess().getVarAssignment_2_1()); 
                    // InternalSpec.g:529:3: ( rule__OpenCommand__VarAssignment_2_1 )
                    // InternalSpec.g:529:4: rule__OpenCommand__VarAssignment_2_1
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
    // InternalSpec.g:537:1: rule__ClickCommand__Alternatives_1 : ( ( ( rule__ClickCommand__Group_1_0__0 ) ) | ( ( rule__ClickCommand__Group_1_1__0 ) ) );
    public final void rule__ClickCommand__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:541:1: ( ( ( rule__ClickCommand__Group_1_0__0 ) ) | ( ( rule__ClickCommand__Group_1_1__0 ) ) )
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
                    // InternalSpec.g:542:2: ( ( rule__ClickCommand__Group_1_0__0 ) )
                    {
                    // InternalSpec.g:542:2: ( ( rule__ClickCommand__Group_1_0__0 ) )
                    // InternalSpec.g:543:3: ( rule__ClickCommand__Group_1_0__0 )
                    {
                     before(grammarAccess.getClickCommandAccess().getGroup_1_0()); 
                    // InternalSpec.g:544:3: ( rule__ClickCommand__Group_1_0__0 )
                    // InternalSpec.g:544:4: rule__ClickCommand__Group_1_0__0
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
                    // InternalSpec.g:548:2: ( ( rule__ClickCommand__Group_1_1__0 ) )
                    {
                    // InternalSpec.g:548:2: ( ( rule__ClickCommand__Group_1_1__0 ) )
                    // InternalSpec.g:549:3: ( rule__ClickCommand__Group_1_1__0 )
                    {
                     before(grammarAccess.getClickCommandAccess().getGroup_1_1()); 
                    // InternalSpec.g:550:3: ( rule__ClickCommand__Group_1_1__0 )
                    // InternalSpec.g:550:4: rule__ClickCommand__Group_1_1__0
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
    // InternalSpec.g:558:1: rule__SelectCommand__Alternatives : ( ( ( rule__SelectCommand__Group_0__0 ) ) | ( ( rule__SelectCommand__Group_1__0 ) ) );
    public final void rule__SelectCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:562:1: ( ( ( rule__SelectCommand__Group_0__0 ) ) | ( ( rule__SelectCommand__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==46) ) {
                alt5=1;
            }
            else if ( (LA5_0==47) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpec.g:563:2: ( ( rule__SelectCommand__Group_0__0 ) )
                    {
                    // InternalSpec.g:563:2: ( ( rule__SelectCommand__Group_0__0 ) )
                    // InternalSpec.g:564:3: ( rule__SelectCommand__Group_0__0 )
                    {
                     before(grammarAccess.getSelectCommandAccess().getGroup_0()); 
                    // InternalSpec.g:565:3: ( rule__SelectCommand__Group_0__0 )
                    // InternalSpec.g:565:4: rule__SelectCommand__Group_0__0
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
                    // InternalSpec.g:569:2: ( ( rule__SelectCommand__Group_1__0 ) )
                    {
                    // InternalSpec.g:569:2: ( ( rule__SelectCommand__Group_1__0 ) )
                    // InternalSpec.g:570:3: ( rule__SelectCommand__Group_1__0 )
                    {
                     before(grammarAccess.getSelectCommandAccess().getGroup_1()); 
                    // InternalSpec.g:571:3: ( rule__SelectCommand__Group_1__0 )
                    // InternalSpec.g:571:4: rule__SelectCommand__Group_1__0
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
    // InternalSpec.g:579:1: rule__Selector__Alternatives_1 : ( ( ( rule__Selector__VarAssignment_1_0 ) ) | ( ( rule__Selector__ValAssignment_1_1 ) ) );
    public final void rule__Selector__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:583:1: ( ( ( rule__Selector__VarAssignment_1_0 ) ) | ( ( rule__Selector__ValAssignment_1_1 ) ) )
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
                    // InternalSpec.g:584:2: ( ( rule__Selector__VarAssignment_1_0 ) )
                    {
                    // InternalSpec.g:584:2: ( ( rule__Selector__VarAssignment_1_0 ) )
                    // InternalSpec.g:585:3: ( rule__Selector__VarAssignment_1_0 )
                    {
                     before(grammarAccess.getSelectorAccess().getVarAssignment_1_0()); 
                    // InternalSpec.g:586:3: ( rule__Selector__VarAssignment_1_0 )
                    // InternalSpec.g:586:4: rule__Selector__VarAssignment_1_0
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
                    // InternalSpec.g:590:2: ( ( rule__Selector__ValAssignment_1_1 ) )
                    {
                    // InternalSpec.g:590:2: ( ( rule__Selector__ValAssignment_1_1 ) )
                    // InternalSpec.g:591:3: ( rule__Selector__ValAssignment_1_1 )
                    {
                     before(grammarAccess.getSelectorAccess().getValAssignment_1_1()); 
                    // InternalSpec.g:592:3: ( rule__Selector__ValAssignment_1_1 )
                    // InternalSpec.g:592:4: rule__Selector__ValAssignment_1_1
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
    // InternalSpec.g:600:1: rule__PropertyCommand__Alternatives_3 : ( ( ( rule__PropertyCommand__ValAssignment_3_0 ) ) | ( ( rule__PropertyCommand__VarAssignment_3_1 ) ) );
    public final void rule__PropertyCommand__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:604:1: ( ( ( rule__PropertyCommand__ValAssignment_3_0 ) ) | ( ( rule__PropertyCommand__VarAssignment_3_1 ) ) )
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
                    // InternalSpec.g:605:2: ( ( rule__PropertyCommand__ValAssignment_3_0 ) )
                    {
                    // InternalSpec.g:605:2: ( ( rule__PropertyCommand__ValAssignment_3_0 ) )
                    // InternalSpec.g:606:3: ( rule__PropertyCommand__ValAssignment_3_0 )
                    {
                     before(grammarAccess.getPropertyCommandAccess().getValAssignment_3_0()); 
                    // InternalSpec.g:607:3: ( rule__PropertyCommand__ValAssignment_3_0 )
                    // InternalSpec.g:607:4: rule__PropertyCommand__ValAssignment_3_0
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
                    // InternalSpec.g:611:2: ( ( rule__PropertyCommand__VarAssignment_3_1 ) )
                    {
                    // InternalSpec.g:611:2: ( ( rule__PropertyCommand__VarAssignment_3_1 ) )
                    // InternalSpec.g:612:3: ( rule__PropertyCommand__VarAssignment_3_1 )
                    {
                     before(grammarAccess.getPropertyCommandAccess().getVarAssignment_3_1()); 
                    // InternalSpec.g:613:3: ( rule__PropertyCommand__VarAssignment_3_1 )
                    // InternalSpec.g:613:4: rule__PropertyCommand__VarAssignment_3_1
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
    // InternalSpec.g:621:1: rule__TypeCommand__Alternatives_1 : ( ( ( rule__TypeCommand__StrAssignment_1_0 ) ) | ( ( rule__TypeCommand__VarAssignment_1_1 ) ) );
    public final void rule__TypeCommand__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:625:1: ( ( ( rule__TypeCommand__StrAssignment_1_0 ) ) | ( ( rule__TypeCommand__VarAssignment_1_1 ) ) )
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
                    // InternalSpec.g:626:2: ( ( rule__TypeCommand__StrAssignment_1_0 ) )
                    {
                    // InternalSpec.g:626:2: ( ( rule__TypeCommand__StrAssignment_1_0 ) )
                    // InternalSpec.g:627:3: ( rule__TypeCommand__StrAssignment_1_0 )
                    {
                     before(grammarAccess.getTypeCommandAccess().getStrAssignment_1_0()); 
                    // InternalSpec.g:628:3: ( rule__TypeCommand__StrAssignment_1_0 )
                    // InternalSpec.g:628:4: rule__TypeCommand__StrAssignment_1_0
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
                    // InternalSpec.g:632:2: ( ( rule__TypeCommand__VarAssignment_1_1 ) )
                    {
                    // InternalSpec.g:632:2: ( ( rule__TypeCommand__VarAssignment_1_1 ) )
                    // InternalSpec.g:633:3: ( rule__TypeCommand__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getTypeCommandAccess().getVarAssignment_1_1()); 
                    // InternalSpec.g:634:3: ( rule__TypeCommand__VarAssignment_1_1 )
                    // InternalSpec.g:634:4: rule__TypeCommand__VarAssignment_1_1
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
    // InternalSpec.g:642:1: rule__SleepCommand__Alternatives_3 : ( ( 'second' ) | ( 'seconds' ) );
    public final void rule__SleepCommand__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:646:1: ( ( 'second' ) | ( 'seconds' ) )
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
                    // InternalSpec.g:647:2: ( 'second' )
                    {
                    // InternalSpec.g:647:2: ( 'second' )
                    // InternalSpec.g:648:3: 'second'
                    {
                     before(grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:653:2: ( 'seconds' )
                    {
                    // InternalSpec.g:653:2: ( 'seconds' )
                    // InternalSpec.g:654:3: 'seconds'
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
    // InternalSpec.g:663:1: rule__Browser__Alternatives : ( ( ( 'Chrome' ) ) | ( ( 'Firefox' ) ) | ( ( 'Explorer' ) ) | ( ( 'Edge' ) ) | ( ( 'Opera' ) ) | ( ( 'Safari' ) ) );
    public final void rule__Browser__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:667:1: ( ( ( 'Chrome' ) ) | ( ( 'Firefox' ) ) | ( ( 'Explorer' ) ) | ( ( 'Edge' ) ) | ( ( 'Opera' ) ) | ( ( 'Safari' ) ) )
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
                    // InternalSpec.g:668:2: ( ( 'Chrome' ) )
                    {
                    // InternalSpec.g:668:2: ( ( 'Chrome' ) )
                    // InternalSpec.g:669:3: ( 'Chrome' )
                    {
                     before(grammarAccess.getBrowserAccess().getChromeEnumLiteralDeclaration_0()); 
                    // InternalSpec.g:670:3: ( 'Chrome' )
                    // InternalSpec.g:670:4: 'Chrome'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getChromeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:674:2: ( ( 'Firefox' ) )
                    {
                    // InternalSpec.g:674:2: ( ( 'Firefox' ) )
                    // InternalSpec.g:675:3: ( 'Firefox' )
                    {
                     before(grammarAccess.getBrowserAccess().getFirefoxEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:676:3: ( 'Firefox' )
                    // InternalSpec.g:676:4: 'Firefox'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getFirefoxEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:680:2: ( ( 'Explorer' ) )
                    {
                    // InternalSpec.g:680:2: ( ( 'Explorer' ) )
                    // InternalSpec.g:681:3: ( 'Explorer' )
                    {
                     before(grammarAccess.getBrowserAccess().getExplorerEnumLiteralDeclaration_2()); 
                    // InternalSpec.g:682:3: ( 'Explorer' )
                    // InternalSpec.g:682:4: 'Explorer'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getExplorerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:686:2: ( ( 'Edge' ) )
                    {
                    // InternalSpec.g:686:2: ( ( 'Edge' ) )
                    // InternalSpec.g:687:3: ( 'Edge' )
                    {
                     before(grammarAccess.getBrowserAccess().getEdgeEnumLiteralDeclaration_3()); 
                    // InternalSpec.g:688:3: ( 'Edge' )
                    // InternalSpec.g:688:4: 'Edge'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getEdgeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:692:2: ( ( 'Opera' ) )
                    {
                    // InternalSpec.g:692:2: ( ( 'Opera' ) )
                    // InternalSpec.g:693:3: ( 'Opera' )
                    {
                     before(grammarAccess.getBrowserAccess().getOperaEnumLiteralDeclaration_4()); 
                    // InternalSpec.g:694:3: ( 'Opera' )
                    // InternalSpec.g:694:4: 'Opera'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getOperaEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSpec.g:698:2: ( ( 'Safari' ) )
                    {
                    // InternalSpec.g:698:2: ( ( 'Safari' ) )
                    // InternalSpec.g:699:3: ( 'Safari' )
                    {
                     before(grammarAccess.getBrowserAccess().getSafariEnumLiteralDeclaration_5()); 
                    // InternalSpec.g:700:3: ( 'Safari' )
                    // InternalSpec.g:700:4: 'Safari'
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
    // InternalSpec.g:708:1: rule__ElementType__Alternatives : ( ( ( 'button' ) ) | ( ( 'element' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) | ( ( 'textarea' ) ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:712:1: ( ( ( 'button' ) ) | ( ( 'element' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) | ( ( 'textarea' ) ) )
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
                    // InternalSpec.g:713:2: ( ( 'button' ) )
                    {
                    // InternalSpec.g:713:2: ( ( 'button' ) )
                    // InternalSpec.g:714:3: ( 'button' )
                    {
                     before(grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0()); 
                    // InternalSpec.g:715:3: ( 'button' )
                    // InternalSpec.g:715:4: 'button'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:719:2: ( ( 'element' ) )
                    {
                    // InternalSpec.g:719:2: ( ( 'element' ) )
                    // InternalSpec.g:720:3: ( 'element' )
                    {
                     before(grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:721:3: ( 'element' )
                    // InternalSpec.g:721:4: 'element'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:725:2: ( ( 'link' ) )
                    {
                    // InternalSpec.g:725:2: ( ( 'link' ) )
                    // InternalSpec.g:726:3: ( 'link' )
                    {
                     before(grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2()); 
                    // InternalSpec.g:727:3: ( 'link' )
                    // InternalSpec.g:727:4: 'link'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:731:2: ( ( 'input' ) )
                    {
                    // InternalSpec.g:731:2: ( ( 'input' ) )
                    // InternalSpec.g:732:3: ( 'input' )
                    {
                     before(grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3()); 
                    // InternalSpec.g:733:3: ( 'input' )
                    // InternalSpec.g:733:4: 'input'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:737:2: ( ( 'textarea' ) )
                    {
                    // InternalSpec.g:737:2: ( ( 'textarea' ) )
                    // InternalSpec.g:738:3: ( 'textarea' )
                    {
                     before(grammarAccess.getElementTypeAccess().getTextareaEnumLiteralDeclaration_4()); 
                    // InternalSpec.g:739:3: ( 'textarea' )
                    // InternalSpec.g:739:4: 'textarea'
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
    // InternalSpec.g:747:1: rule__Property__Alternatives : ( ( ( 'text' ) ) | ( ( 'class' ) ) | ( ( 'value' ) ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:751:1: ( ( ( 'text' ) ) | ( ( 'class' ) ) | ( ( 'value' ) ) )
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
                    // InternalSpec.g:752:2: ( ( 'text' ) )
                    {
                    // InternalSpec.g:752:2: ( ( 'text' ) )
                    // InternalSpec.g:753:3: ( 'text' )
                    {
                     before(grammarAccess.getPropertyAccess().getTextEnumLiteralDeclaration_0()); 
                    // InternalSpec.g:754:3: ( 'text' )
                    // InternalSpec.g:754:4: 'text'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyAccess().getTextEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:758:2: ( ( 'class' ) )
                    {
                    // InternalSpec.g:758:2: ( ( 'class' ) )
                    // InternalSpec.g:759:3: ( 'class' )
                    {
                     before(grammarAccess.getPropertyAccess().getClassEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:760:3: ( 'class' )
                    // InternalSpec.g:760:4: 'class'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyAccess().getClassEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:764:2: ( ( 'value' ) )
                    {
                    // InternalSpec.g:764:2: ( ( 'value' ) )
                    // InternalSpec.g:765:3: ( 'value' )
                    {
                     before(grammarAccess.getPropertyAccess().getValueEnumLiteralDeclaration_2()); 
                    // InternalSpec.g:766:3: ( 'value' )
                    // InternalSpec.g:766:4: 'value'
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
    // InternalSpec.g:774:1: rule__Condition__Alternatives : ( ( ( 'should be' ) ) | ( ( 'should not be' ) ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:778:1: ( ( ( 'should be' ) ) | ( ( 'should not be' ) ) )
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
                    // InternalSpec.g:779:2: ( ( 'should be' ) )
                    {
                    // InternalSpec.g:779:2: ( ( 'should be' ) )
                    // InternalSpec.g:780:3: ( 'should be' )
                    {
                     before(grammarAccess.getConditionAccess().getShouldBeEnumLiteralDeclaration_0()); 
                    // InternalSpec.g:781:3: ( 'should be' )
                    // InternalSpec.g:781:4: 'should be'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionAccess().getShouldBeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:785:2: ( ( 'should not be' ) )
                    {
                    // InternalSpec.g:785:2: ( ( 'should not be' ) )
                    // InternalSpec.g:786:3: ( 'should not be' )
                    {
                     before(grammarAccess.getConditionAccess().getShouldNotBeEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:787:3: ( 'should not be' )
                    // InternalSpec.g:787:4: 'should not be'
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


    // $ANTLR start "rule__Command__Group_8__0"
    // InternalSpec.g:795:1: rule__Command__Group_8__0 : rule__Command__Group_8__0__Impl rule__Command__Group_8__1 ;
    public final void rule__Command__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:799:1: ( rule__Command__Group_8__0__Impl rule__Command__Group_8__1 )
            // InternalSpec.g:800:2: rule__Command__Group_8__0__Impl rule__Command__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Command__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group_8__1();

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
    // $ANTLR end "rule__Command__Group_8__0"


    // $ANTLR start "rule__Command__Group_8__0__Impl"
    // InternalSpec.g:807:1: rule__Command__Group_8__0__Impl : ( () ) ;
    public final void rule__Command__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:811:1: ( ( () ) )
            // InternalSpec.g:812:1: ( () )
            {
            // InternalSpec.g:812:1: ( () )
            // InternalSpec.g:813:2: ()
            {
             before(grammarAccess.getCommandAccess().getCommandAction_8_0()); 
            // InternalSpec.g:814:2: ()
            // InternalSpec.g:814:3: 
            {
            }

             after(grammarAccess.getCommandAccess().getCommandAction_8_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_8__0__Impl"


    // $ANTLR start "rule__Command__Group_8__1"
    // InternalSpec.g:822:1: rule__Command__Group_8__1 : rule__Command__Group_8__1__Impl ;
    public final void rule__Command__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:826:1: ( rule__Command__Group_8__1__Impl )
            // InternalSpec.g:827:2: rule__Command__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group_8__1__Impl();

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
    // $ANTLR end "rule__Command__Group_8__1"


    // $ANTLR start "rule__Command__Group_8__1__Impl"
    // InternalSpec.g:833:1: rule__Command__Group_8__1__Impl : ( RULE_SL_COMMENT ) ;
    public final void rule__Command__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:837:1: ( ( RULE_SL_COMMENT ) )
            // InternalSpec.g:838:1: ( RULE_SL_COMMENT )
            {
            // InternalSpec.g:838:1: ( RULE_SL_COMMENT )
            // InternalSpec.g:839:2: RULE_SL_COMMENT
            {
             before(grammarAccess.getCommandAccess().getSL_COMMENTTerminalRuleCall_8_1()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getSL_COMMENTTerminalRuleCall_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_8__1__Impl"


    // $ANTLR start "rule__UsingCommand__Group__0"
    // InternalSpec.g:849:1: rule__UsingCommand__Group__0 : rule__UsingCommand__Group__0__Impl rule__UsingCommand__Group__1 ;
    public final void rule__UsingCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:853:1: ( rule__UsingCommand__Group__0__Impl rule__UsingCommand__Group__1 )
            // InternalSpec.g:854:2: rule__UsingCommand__Group__0__Impl rule__UsingCommand__Group__1
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
    // InternalSpec.g:861:1: rule__UsingCommand__Group__0__Impl : ( ( rule__UsingCommand__NameAssignment_0 ) ) ;
    public final void rule__UsingCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:865:1: ( ( ( rule__UsingCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:866:1: ( ( rule__UsingCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:866:1: ( ( rule__UsingCommand__NameAssignment_0 ) )
            // InternalSpec.g:867:2: ( rule__UsingCommand__NameAssignment_0 )
            {
             before(grammarAccess.getUsingCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:868:2: ( rule__UsingCommand__NameAssignment_0 )
            // InternalSpec.g:868:3: rule__UsingCommand__NameAssignment_0
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
    // InternalSpec.g:876:1: rule__UsingCommand__Group__1 : rule__UsingCommand__Group__1__Impl ;
    public final void rule__UsingCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:880:1: ( rule__UsingCommand__Group__1__Impl )
            // InternalSpec.g:881:2: rule__UsingCommand__Group__1__Impl
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
    // InternalSpec.g:887:1: rule__UsingCommand__Group__1__Impl : ( ( rule__UsingCommand__BrowserAssignment_1 ) ) ;
    public final void rule__UsingCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:891:1: ( ( ( rule__UsingCommand__BrowserAssignment_1 ) ) )
            // InternalSpec.g:892:1: ( ( rule__UsingCommand__BrowserAssignment_1 ) )
            {
            // InternalSpec.g:892:1: ( ( rule__UsingCommand__BrowserAssignment_1 ) )
            // InternalSpec.g:893:2: ( rule__UsingCommand__BrowserAssignment_1 )
            {
             before(grammarAccess.getUsingCommandAccess().getBrowserAssignment_1()); 
            // InternalSpec.g:894:2: ( rule__UsingCommand__BrowserAssignment_1 )
            // InternalSpec.g:894:3: rule__UsingCommand__BrowserAssignment_1
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
    // InternalSpec.g:903:1: rule__OpenCommand__Group__0 : rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1 ;
    public final void rule__OpenCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:907:1: ( rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1 )
            // InternalSpec.g:908:2: rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1
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
    // InternalSpec.g:915:1: rule__OpenCommand__Group__0__Impl : ( () ) ;
    public final void rule__OpenCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:919:1: ( ( () ) )
            // InternalSpec.g:920:1: ( () )
            {
            // InternalSpec.g:920:1: ( () )
            // InternalSpec.g:921:2: ()
            {
             before(grammarAccess.getOpenCommandAccess().getOpenCommandAction_0()); 
            // InternalSpec.g:922:2: ()
            // InternalSpec.g:922:3: 
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
    // InternalSpec.g:930:1: rule__OpenCommand__Group__1 : rule__OpenCommand__Group__1__Impl rule__OpenCommand__Group__2 ;
    public final void rule__OpenCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:934:1: ( rule__OpenCommand__Group__1__Impl rule__OpenCommand__Group__2 )
            // InternalSpec.g:935:2: rule__OpenCommand__Group__1__Impl rule__OpenCommand__Group__2
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
    // InternalSpec.g:942:1: rule__OpenCommand__Group__1__Impl : ( ( rule__OpenCommand__NameAssignment_1 ) ) ;
    public final void rule__OpenCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:946:1: ( ( ( rule__OpenCommand__NameAssignment_1 ) ) )
            // InternalSpec.g:947:1: ( ( rule__OpenCommand__NameAssignment_1 ) )
            {
            // InternalSpec.g:947:1: ( ( rule__OpenCommand__NameAssignment_1 ) )
            // InternalSpec.g:948:2: ( rule__OpenCommand__NameAssignment_1 )
            {
             before(grammarAccess.getOpenCommandAccess().getNameAssignment_1()); 
            // InternalSpec.g:949:2: ( rule__OpenCommand__NameAssignment_1 )
            // InternalSpec.g:949:3: rule__OpenCommand__NameAssignment_1
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
    // InternalSpec.g:957:1: rule__OpenCommand__Group__2 : rule__OpenCommand__Group__2__Impl ;
    public final void rule__OpenCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:961:1: ( rule__OpenCommand__Group__2__Impl )
            // InternalSpec.g:962:2: rule__OpenCommand__Group__2__Impl
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
    // InternalSpec.g:968:1: rule__OpenCommand__Group__2__Impl : ( ( rule__OpenCommand__Alternatives_2 ) ) ;
    public final void rule__OpenCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:972:1: ( ( ( rule__OpenCommand__Alternatives_2 ) ) )
            // InternalSpec.g:973:1: ( ( rule__OpenCommand__Alternatives_2 ) )
            {
            // InternalSpec.g:973:1: ( ( rule__OpenCommand__Alternatives_2 ) )
            // InternalSpec.g:974:2: ( rule__OpenCommand__Alternatives_2 )
            {
             before(grammarAccess.getOpenCommandAccess().getAlternatives_2()); 
            // InternalSpec.g:975:2: ( rule__OpenCommand__Alternatives_2 )
            // InternalSpec.g:975:3: rule__OpenCommand__Alternatives_2
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
    // InternalSpec.g:984:1: rule__ClickCommand__Group__0 : rule__ClickCommand__Group__0__Impl rule__ClickCommand__Group__1 ;
    public final void rule__ClickCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:988:1: ( rule__ClickCommand__Group__0__Impl rule__ClickCommand__Group__1 )
            // InternalSpec.g:989:2: rule__ClickCommand__Group__0__Impl rule__ClickCommand__Group__1
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
    // InternalSpec.g:996:1: rule__ClickCommand__Group__0__Impl : ( ( rule__ClickCommand__NameAssignment_0 ) ) ;
    public final void rule__ClickCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1000:1: ( ( ( rule__ClickCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:1001:1: ( ( rule__ClickCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:1001:1: ( ( rule__ClickCommand__NameAssignment_0 ) )
            // InternalSpec.g:1002:2: ( rule__ClickCommand__NameAssignment_0 )
            {
             before(grammarAccess.getClickCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:1003:2: ( rule__ClickCommand__NameAssignment_0 )
            // InternalSpec.g:1003:3: rule__ClickCommand__NameAssignment_0
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
    // InternalSpec.g:1011:1: rule__ClickCommand__Group__1 : rule__ClickCommand__Group__1__Impl ;
    public final void rule__ClickCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1015:1: ( rule__ClickCommand__Group__1__Impl )
            // InternalSpec.g:1016:2: rule__ClickCommand__Group__1__Impl
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
    // InternalSpec.g:1022:1: rule__ClickCommand__Group__1__Impl : ( ( rule__ClickCommand__Alternatives_1 ) ) ;
    public final void rule__ClickCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1026:1: ( ( ( rule__ClickCommand__Alternatives_1 ) ) )
            // InternalSpec.g:1027:1: ( ( rule__ClickCommand__Alternatives_1 ) )
            {
            // InternalSpec.g:1027:1: ( ( rule__ClickCommand__Alternatives_1 ) )
            // InternalSpec.g:1028:2: ( rule__ClickCommand__Alternatives_1 )
            {
             before(grammarAccess.getClickCommandAccess().getAlternatives_1()); 
            // InternalSpec.g:1029:2: ( rule__ClickCommand__Alternatives_1 )
            // InternalSpec.g:1029:3: rule__ClickCommand__Alternatives_1
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
    // InternalSpec.g:1038:1: rule__ClickCommand__Group_1_0__0 : rule__ClickCommand__Group_1_0__0__Impl rule__ClickCommand__Group_1_0__1 ;
    public final void rule__ClickCommand__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1042:1: ( rule__ClickCommand__Group_1_0__0__Impl rule__ClickCommand__Group_1_0__1 )
            // InternalSpec.g:1043:2: rule__ClickCommand__Group_1_0__0__Impl rule__ClickCommand__Group_1_0__1
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
    // InternalSpec.g:1050:1: rule__ClickCommand__Group_1_0__0__Impl : ( 'on' ) ;
    public final void rule__ClickCommand__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1054:1: ( ( 'on' ) )
            // InternalSpec.g:1055:1: ( 'on' )
            {
            // InternalSpec.g:1055:1: ( 'on' )
            // InternalSpec.g:1056:2: 'on'
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
    // InternalSpec.g:1065:1: rule__ClickCommand__Group_1_0__1 : rule__ClickCommand__Group_1_0__1__Impl ;
    public final void rule__ClickCommand__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1069:1: ( rule__ClickCommand__Group_1_0__1__Impl )
            // InternalSpec.g:1070:2: rule__ClickCommand__Group_1_0__1__Impl
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
    // InternalSpec.g:1076:1: rule__ClickCommand__Group_1_0__1__Impl : ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) ) ;
    public final void rule__ClickCommand__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1080:1: ( ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) ) )
            // InternalSpec.g:1081:1: ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) )
            {
            // InternalSpec.g:1081:1: ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) )
            // InternalSpec.g:1082:2: ( rule__ClickCommand__SelectorAssignment_1_0_1 )
            {
             before(grammarAccess.getClickCommandAccess().getSelectorAssignment_1_0_1()); 
            // InternalSpec.g:1083:2: ( rule__ClickCommand__SelectorAssignment_1_0_1 )
            // InternalSpec.g:1083:3: rule__ClickCommand__SelectorAssignment_1_0_1
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
    // InternalSpec.g:1092:1: rule__ClickCommand__Group_1_1__0 : rule__ClickCommand__Group_1_1__0__Impl rule__ClickCommand__Group_1_1__1 ;
    public final void rule__ClickCommand__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1096:1: ( rule__ClickCommand__Group_1_1__0__Impl rule__ClickCommand__Group_1_1__1 )
            // InternalSpec.g:1097:2: rule__ClickCommand__Group_1_1__0__Impl rule__ClickCommand__Group_1_1__1
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
    // InternalSpec.g:1104:1: rule__ClickCommand__Group_1_1__0__Impl : ( 'at' ) ;
    public final void rule__ClickCommand__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1108:1: ( ( 'at' ) )
            // InternalSpec.g:1109:1: ( 'at' )
            {
            // InternalSpec.g:1109:1: ( 'at' )
            // InternalSpec.g:1110:2: 'at'
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
    // InternalSpec.g:1119:1: rule__ClickCommand__Group_1_1__1 : rule__ClickCommand__Group_1_1__1__Impl ;
    public final void rule__ClickCommand__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1123:1: ( rule__ClickCommand__Group_1_1__1__Impl )
            // InternalSpec.g:1124:2: rule__ClickCommand__Group_1_1__1__Impl
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
    // InternalSpec.g:1130:1: rule__ClickCommand__Group_1_1__1__Impl : ( ( rule__ClickCommand__PointAssignment_1_1_1 ) ) ;
    public final void rule__ClickCommand__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1134:1: ( ( ( rule__ClickCommand__PointAssignment_1_1_1 ) ) )
            // InternalSpec.g:1135:1: ( ( rule__ClickCommand__PointAssignment_1_1_1 ) )
            {
            // InternalSpec.g:1135:1: ( ( rule__ClickCommand__PointAssignment_1_1_1 ) )
            // InternalSpec.g:1136:2: ( rule__ClickCommand__PointAssignment_1_1_1 )
            {
             before(grammarAccess.getClickCommandAccess().getPointAssignment_1_1_1()); 
            // InternalSpec.g:1137:2: ( rule__ClickCommand__PointAssignment_1_1_1 )
            // InternalSpec.g:1137:3: rule__ClickCommand__PointAssignment_1_1_1
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
    // InternalSpec.g:1146:1: rule__SelectCommand__Group_0__0 : rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1 ;
    public final void rule__SelectCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1150:1: ( rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1 )
            // InternalSpec.g:1151:2: rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1
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
    // InternalSpec.g:1158:1: rule__SelectCommand__Group_0__0__Impl : ( ( rule__SelectCommand__NameAssignment_0_0 ) ) ;
    public final void rule__SelectCommand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1162:1: ( ( ( rule__SelectCommand__NameAssignment_0_0 ) ) )
            // InternalSpec.g:1163:1: ( ( rule__SelectCommand__NameAssignment_0_0 ) )
            {
            // InternalSpec.g:1163:1: ( ( rule__SelectCommand__NameAssignment_0_0 ) )
            // InternalSpec.g:1164:2: ( rule__SelectCommand__NameAssignment_0_0 )
            {
             before(grammarAccess.getSelectCommandAccess().getNameAssignment_0_0()); 
            // InternalSpec.g:1165:2: ( rule__SelectCommand__NameAssignment_0_0 )
            // InternalSpec.g:1165:3: rule__SelectCommand__NameAssignment_0_0
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
    // InternalSpec.g:1173:1: rule__SelectCommand__Group_0__1 : rule__SelectCommand__Group_0__1__Impl ;
    public final void rule__SelectCommand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1177:1: ( rule__SelectCommand__Group_0__1__Impl )
            // InternalSpec.g:1178:2: rule__SelectCommand__Group_0__1__Impl
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
    // InternalSpec.g:1184:1: rule__SelectCommand__Group_0__1__Impl : ( ( rule__SelectCommand__ValueAssignment_0_1 ) ) ;
    public final void rule__SelectCommand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1188:1: ( ( ( rule__SelectCommand__ValueAssignment_0_1 ) ) )
            // InternalSpec.g:1189:1: ( ( rule__SelectCommand__ValueAssignment_0_1 ) )
            {
            // InternalSpec.g:1189:1: ( ( rule__SelectCommand__ValueAssignment_0_1 ) )
            // InternalSpec.g:1190:2: ( rule__SelectCommand__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSelectCommandAccess().getValueAssignment_0_1()); 
            // InternalSpec.g:1191:2: ( rule__SelectCommand__ValueAssignment_0_1 )
            // InternalSpec.g:1191:3: rule__SelectCommand__ValueAssignment_0_1
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
    // InternalSpec.g:1200:1: rule__SelectCommand__Group_1__0 : rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1 ;
    public final void rule__SelectCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1204:1: ( rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1 )
            // InternalSpec.g:1205:2: rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1
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
    // InternalSpec.g:1212:1: rule__SelectCommand__Group_1__0__Impl : ( ( rule__SelectCommand__NameAssignment_1_0 ) ) ;
    public final void rule__SelectCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1216:1: ( ( ( rule__SelectCommand__NameAssignment_1_0 ) ) )
            // InternalSpec.g:1217:1: ( ( rule__SelectCommand__NameAssignment_1_0 ) )
            {
            // InternalSpec.g:1217:1: ( ( rule__SelectCommand__NameAssignment_1_0 ) )
            // InternalSpec.g:1218:2: ( rule__SelectCommand__NameAssignment_1_0 )
            {
             before(grammarAccess.getSelectCommandAccess().getNameAssignment_1_0()); 
            // InternalSpec.g:1219:2: ( rule__SelectCommand__NameAssignment_1_0 )
            // InternalSpec.g:1219:3: rule__SelectCommand__NameAssignment_1_0
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
    // InternalSpec.g:1227:1: rule__SelectCommand__Group_1__1 : rule__SelectCommand__Group_1__1__Impl rule__SelectCommand__Group_1__2 ;
    public final void rule__SelectCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1231:1: ( rule__SelectCommand__Group_1__1__Impl rule__SelectCommand__Group_1__2 )
            // InternalSpec.g:1232:2: rule__SelectCommand__Group_1__1__Impl rule__SelectCommand__Group_1__2
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
    // InternalSpec.g:1239:1: rule__SelectCommand__Group_1__1__Impl : ( ( 'visible' )? ) ;
    public final void rule__SelectCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1243:1: ( ( ( 'visible' )? ) )
            // InternalSpec.g:1244:1: ( ( 'visible' )? )
            {
            // InternalSpec.g:1244:1: ( ( 'visible' )? )
            // InternalSpec.g:1245:2: ( 'visible' )?
            {
             before(grammarAccess.getSelectCommandAccess().getVisibleKeyword_1_1()); 
            // InternalSpec.g:1246:2: ( 'visible' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpec.g:1246:3: 'visible'
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
    // InternalSpec.g:1254:1: rule__SelectCommand__Group_1__2 : rule__SelectCommand__Group_1__2__Impl ;
    public final void rule__SelectCommand__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1258:1: ( rule__SelectCommand__Group_1__2__Impl )
            // InternalSpec.g:1259:2: rule__SelectCommand__Group_1__2__Impl
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
    // InternalSpec.g:1265:1: rule__SelectCommand__Group_1__2__Impl : ( ( rule__SelectCommand__ValueAssignment_1_2 ) ) ;
    public final void rule__SelectCommand__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1269:1: ( ( ( rule__SelectCommand__ValueAssignment_1_2 ) ) )
            // InternalSpec.g:1270:1: ( ( rule__SelectCommand__ValueAssignment_1_2 ) )
            {
            // InternalSpec.g:1270:1: ( ( rule__SelectCommand__ValueAssignment_1_2 ) )
            // InternalSpec.g:1271:2: ( rule__SelectCommand__ValueAssignment_1_2 )
            {
             before(grammarAccess.getSelectCommandAccess().getValueAssignment_1_2()); 
            // InternalSpec.g:1272:2: ( rule__SelectCommand__ValueAssignment_1_2 )
            // InternalSpec.g:1272:3: rule__SelectCommand__ValueAssignment_1_2
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
    // InternalSpec.g:1281:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1285:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalSpec.g:1286:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
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
    // InternalSpec.g:1293:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__TypeAssignment_0 )? ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1297:1: ( ( ( rule__Selector__TypeAssignment_0 )? ) )
            // InternalSpec.g:1298:1: ( ( rule__Selector__TypeAssignment_0 )? )
            {
            // InternalSpec.g:1298:1: ( ( rule__Selector__TypeAssignment_0 )? )
            // InternalSpec.g:1299:2: ( rule__Selector__TypeAssignment_0 )?
            {
             before(grammarAccess.getSelectorAccess().getTypeAssignment_0()); 
            // InternalSpec.g:1300:2: ( rule__Selector__TypeAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=20 && LA15_0<=24)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSpec.g:1300:3: rule__Selector__TypeAssignment_0
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
    // InternalSpec.g:1308:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1312:1: ( rule__Selector__Group__1__Impl )
            // InternalSpec.g:1313:2: rule__Selector__Group__1__Impl
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
    // InternalSpec.g:1319:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Alternatives_1 ) ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1323:1: ( ( ( rule__Selector__Alternatives_1 ) ) )
            // InternalSpec.g:1324:1: ( ( rule__Selector__Alternatives_1 ) )
            {
            // InternalSpec.g:1324:1: ( ( rule__Selector__Alternatives_1 ) )
            // InternalSpec.g:1325:2: ( rule__Selector__Alternatives_1 )
            {
             before(grammarAccess.getSelectorAccess().getAlternatives_1()); 
            // InternalSpec.g:1326:2: ( rule__Selector__Alternatives_1 )
            // InternalSpec.g:1326:3: rule__Selector__Alternatives_1
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
    // InternalSpec.g:1335:1: rule__PropertyCommand__Group__0 : rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1 ;
    public final void rule__PropertyCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1339:1: ( rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1 )
            // InternalSpec.g:1340:2: rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1
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
    // InternalSpec.g:1347:1: rule__PropertyCommand__Group__0__Impl : ( ( rule__PropertyCommand__NameAssignment_0 ) ) ;
    public final void rule__PropertyCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1351:1: ( ( ( rule__PropertyCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:1352:1: ( ( rule__PropertyCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:1352:1: ( ( rule__PropertyCommand__NameAssignment_0 ) )
            // InternalSpec.g:1353:2: ( rule__PropertyCommand__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:1354:2: ( rule__PropertyCommand__NameAssignment_0 )
            // InternalSpec.g:1354:3: rule__PropertyCommand__NameAssignment_0
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
    // InternalSpec.g:1362:1: rule__PropertyCommand__Group__1 : rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2 ;
    public final void rule__PropertyCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1366:1: ( rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2 )
            // InternalSpec.g:1367:2: rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2
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
    // InternalSpec.g:1374:1: rule__PropertyCommand__Group__1__Impl : ( ( rule__PropertyCommand__PropAssignment_1 ) ) ;
    public final void rule__PropertyCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1378:1: ( ( ( rule__PropertyCommand__PropAssignment_1 ) ) )
            // InternalSpec.g:1379:1: ( ( rule__PropertyCommand__PropAssignment_1 ) )
            {
            // InternalSpec.g:1379:1: ( ( rule__PropertyCommand__PropAssignment_1 ) )
            // InternalSpec.g:1380:2: ( rule__PropertyCommand__PropAssignment_1 )
            {
             before(grammarAccess.getPropertyCommandAccess().getPropAssignment_1()); 
            // InternalSpec.g:1381:2: ( rule__PropertyCommand__PropAssignment_1 )
            // InternalSpec.g:1381:3: rule__PropertyCommand__PropAssignment_1
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
    // InternalSpec.g:1389:1: rule__PropertyCommand__Group__2 : rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3 ;
    public final void rule__PropertyCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1393:1: ( rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3 )
            // InternalSpec.g:1394:2: rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3
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
    // InternalSpec.g:1401:1: rule__PropertyCommand__Group__2__Impl : ( ( rule__PropertyCommand__CondAssignment_2 ) ) ;
    public final void rule__PropertyCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1405:1: ( ( ( rule__PropertyCommand__CondAssignment_2 ) ) )
            // InternalSpec.g:1406:1: ( ( rule__PropertyCommand__CondAssignment_2 ) )
            {
            // InternalSpec.g:1406:1: ( ( rule__PropertyCommand__CondAssignment_2 ) )
            // InternalSpec.g:1407:2: ( rule__PropertyCommand__CondAssignment_2 )
            {
             before(grammarAccess.getPropertyCommandAccess().getCondAssignment_2()); 
            // InternalSpec.g:1408:2: ( rule__PropertyCommand__CondAssignment_2 )
            // InternalSpec.g:1408:3: rule__PropertyCommand__CondAssignment_2
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
    // InternalSpec.g:1416:1: rule__PropertyCommand__Group__3 : rule__PropertyCommand__Group__3__Impl ;
    public final void rule__PropertyCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1420:1: ( rule__PropertyCommand__Group__3__Impl )
            // InternalSpec.g:1421:2: rule__PropertyCommand__Group__3__Impl
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
    // InternalSpec.g:1427:1: rule__PropertyCommand__Group__3__Impl : ( ( rule__PropertyCommand__Alternatives_3 ) ) ;
    public final void rule__PropertyCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1431:1: ( ( ( rule__PropertyCommand__Alternatives_3 ) ) )
            // InternalSpec.g:1432:1: ( ( rule__PropertyCommand__Alternatives_3 ) )
            {
            // InternalSpec.g:1432:1: ( ( rule__PropertyCommand__Alternatives_3 ) )
            // InternalSpec.g:1433:2: ( rule__PropertyCommand__Alternatives_3 )
            {
             before(grammarAccess.getPropertyCommandAccess().getAlternatives_3()); 
            // InternalSpec.g:1434:2: ( rule__PropertyCommand__Alternatives_3 )
            // InternalSpec.g:1434:3: rule__PropertyCommand__Alternatives_3
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
    // InternalSpec.g:1443:1: rule__TypeCommand__Group__0 : rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1 ;
    public final void rule__TypeCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1447:1: ( rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1 )
            // InternalSpec.g:1448:2: rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1
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
    // InternalSpec.g:1455:1: rule__TypeCommand__Group__0__Impl : ( ( rule__TypeCommand__NameAssignment_0 ) ) ;
    public final void rule__TypeCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1459:1: ( ( ( rule__TypeCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:1460:1: ( ( rule__TypeCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:1460:1: ( ( rule__TypeCommand__NameAssignment_0 ) )
            // InternalSpec.g:1461:2: ( rule__TypeCommand__NameAssignment_0 )
            {
             before(grammarAccess.getTypeCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:1462:2: ( rule__TypeCommand__NameAssignment_0 )
            // InternalSpec.g:1462:3: rule__TypeCommand__NameAssignment_0
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
    // InternalSpec.g:1470:1: rule__TypeCommand__Group__1 : rule__TypeCommand__Group__1__Impl ;
    public final void rule__TypeCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1474:1: ( rule__TypeCommand__Group__1__Impl )
            // InternalSpec.g:1475:2: rule__TypeCommand__Group__1__Impl
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
    // InternalSpec.g:1481:1: rule__TypeCommand__Group__1__Impl : ( ( rule__TypeCommand__Alternatives_1 ) ) ;
    public final void rule__TypeCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1485:1: ( ( ( rule__TypeCommand__Alternatives_1 ) ) )
            // InternalSpec.g:1486:1: ( ( rule__TypeCommand__Alternatives_1 ) )
            {
            // InternalSpec.g:1486:1: ( ( rule__TypeCommand__Alternatives_1 ) )
            // InternalSpec.g:1487:2: ( rule__TypeCommand__Alternatives_1 )
            {
             before(grammarAccess.getTypeCommandAccess().getAlternatives_1()); 
            // InternalSpec.g:1488:2: ( rule__TypeCommand__Alternatives_1 )
            // InternalSpec.g:1488:3: rule__TypeCommand__Alternatives_1
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
    // InternalSpec.g:1497:1: rule__SleepCommand__Group__0 : rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1 ;
    public final void rule__SleepCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1501:1: ( rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1 )
            // InternalSpec.g:1502:2: rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1
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
    // InternalSpec.g:1509:1: rule__SleepCommand__Group__0__Impl : ( ( rule__SleepCommand__NameAssignment_0 ) ) ;
    public final void rule__SleepCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1513:1: ( ( ( rule__SleepCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:1514:1: ( ( rule__SleepCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:1514:1: ( ( rule__SleepCommand__NameAssignment_0 ) )
            // InternalSpec.g:1515:2: ( rule__SleepCommand__NameAssignment_0 )
            {
             before(grammarAccess.getSleepCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:1516:2: ( rule__SleepCommand__NameAssignment_0 )
            // InternalSpec.g:1516:3: rule__SleepCommand__NameAssignment_0
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
    // InternalSpec.g:1524:1: rule__SleepCommand__Group__1 : rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2 ;
    public final void rule__SleepCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1528:1: ( rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2 )
            // InternalSpec.g:1529:2: rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2
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
    // InternalSpec.g:1536:1: rule__SleepCommand__Group__1__Impl : ( 'for' ) ;
    public final void rule__SleepCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1540:1: ( ( 'for' ) )
            // InternalSpec.g:1541:1: ( 'for' )
            {
            // InternalSpec.g:1541:1: ( 'for' )
            // InternalSpec.g:1542:2: 'for'
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
    // InternalSpec.g:1551:1: rule__SleepCommand__Group__2 : rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3 ;
    public final void rule__SleepCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1555:1: ( rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3 )
            // InternalSpec.g:1556:2: rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3
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
    // InternalSpec.g:1563:1: rule__SleepCommand__Group__2__Impl : ( ( rule__SleepCommand__TimeAssignment_2 ) ) ;
    public final void rule__SleepCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1567:1: ( ( ( rule__SleepCommand__TimeAssignment_2 ) ) )
            // InternalSpec.g:1568:1: ( ( rule__SleepCommand__TimeAssignment_2 ) )
            {
            // InternalSpec.g:1568:1: ( ( rule__SleepCommand__TimeAssignment_2 ) )
            // InternalSpec.g:1569:2: ( rule__SleepCommand__TimeAssignment_2 )
            {
             before(grammarAccess.getSleepCommandAccess().getTimeAssignment_2()); 
            // InternalSpec.g:1570:2: ( rule__SleepCommand__TimeAssignment_2 )
            // InternalSpec.g:1570:3: rule__SleepCommand__TimeAssignment_2
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
    // InternalSpec.g:1578:1: rule__SleepCommand__Group__3 : rule__SleepCommand__Group__3__Impl ;
    public final void rule__SleepCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1582:1: ( rule__SleepCommand__Group__3__Impl )
            // InternalSpec.g:1583:2: rule__SleepCommand__Group__3__Impl
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
    // InternalSpec.g:1589:1: rule__SleepCommand__Group__3__Impl : ( ( rule__SleepCommand__Alternatives_3 ) ) ;
    public final void rule__SleepCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1593:1: ( ( ( rule__SleepCommand__Alternatives_3 ) ) )
            // InternalSpec.g:1594:1: ( ( rule__SleepCommand__Alternatives_3 ) )
            {
            // InternalSpec.g:1594:1: ( ( rule__SleepCommand__Alternatives_3 ) )
            // InternalSpec.g:1595:2: ( rule__SleepCommand__Alternatives_3 )
            {
             before(grammarAccess.getSleepCommandAccess().getAlternatives_3()); 
            // InternalSpec.g:1596:2: ( rule__SleepCommand__Alternatives_3 )
            // InternalSpec.g:1596:3: rule__SleepCommand__Alternatives_3
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
    // InternalSpec.g:1605:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1609:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalSpec.g:1610:2: rule__Point__Group__0__Impl rule__Point__Group__1
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
    // InternalSpec.g:1617:1: rule__Point__Group__0__Impl : ( '{' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1621:1: ( ( '{' ) )
            // InternalSpec.g:1622:1: ( '{' )
            {
            // InternalSpec.g:1622:1: ( '{' )
            // InternalSpec.g:1623:2: '{'
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
    // InternalSpec.g:1632:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1636:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalSpec.g:1637:2: rule__Point__Group__1__Impl rule__Point__Group__2
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
    // InternalSpec.g:1644:1: rule__Point__Group__1__Impl : ( ( rule__Point__XAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1648:1: ( ( ( rule__Point__XAssignment_1 ) ) )
            // InternalSpec.g:1649:1: ( ( rule__Point__XAssignment_1 ) )
            {
            // InternalSpec.g:1649:1: ( ( rule__Point__XAssignment_1 ) )
            // InternalSpec.g:1650:2: ( rule__Point__XAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_1()); 
            // InternalSpec.g:1651:2: ( rule__Point__XAssignment_1 )
            // InternalSpec.g:1651:3: rule__Point__XAssignment_1
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
    // InternalSpec.g:1659:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1663:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalSpec.g:1664:2: rule__Point__Group__2__Impl rule__Point__Group__3
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
    // InternalSpec.g:1671:1: rule__Point__Group__2__Impl : ( ',' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1675:1: ( ( ',' ) )
            // InternalSpec.g:1676:1: ( ',' )
            {
            // InternalSpec.g:1676:1: ( ',' )
            // InternalSpec.g:1677:2: ','
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
    // InternalSpec.g:1686:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1690:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // InternalSpec.g:1691:2: rule__Point__Group__3__Impl rule__Point__Group__4
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
    // InternalSpec.g:1698:1: rule__Point__Group__3__Impl : ( ( rule__Point__YAssignment_3 ) ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1702:1: ( ( ( rule__Point__YAssignment_3 ) ) )
            // InternalSpec.g:1703:1: ( ( rule__Point__YAssignment_3 ) )
            {
            // InternalSpec.g:1703:1: ( ( rule__Point__YAssignment_3 ) )
            // InternalSpec.g:1704:2: ( rule__Point__YAssignment_3 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_3()); 
            // InternalSpec.g:1705:2: ( rule__Point__YAssignment_3 )
            // InternalSpec.g:1705:3: rule__Point__YAssignment_3
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
    // InternalSpec.g:1713:1: rule__Point__Group__4 : rule__Point__Group__4__Impl ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1717:1: ( rule__Point__Group__4__Impl )
            // InternalSpec.g:1718:2: rule__Point__Group__4__Impl
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
    // InternalSpec.g:1724:1: rule__Point__Group__4__Impl : ( '}' ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1728:1: ( ( '}' ) )
            // InternalSpec.g:1729:1: ( '}' )
            {
            // InternalSpec.g:1729:1: ( '}' )
            // InternalSpec.g:1730:2: '}'
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


    // $ANTLR start "rule__LoopCommand__Group__0"
    // InternalSpec.g:1740:1: rule__LoopCommand__Group__0 : rule__LoopCommand__Group__0__Impl rule__LoopCommand__Group__1 ;
    public final void rule__LoopCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1744:1: ( rule__LoopCommand__Group__0__Impl rule__LoopCommand__Group__1 )
            // InternalSpec.g:1745:2: rule__LoopCommand__Group__0__Impl rule__LoopCommand__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__LoopCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopCommand__Group__1();

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
    // $ANTLR end "rule__LoopCommand__Group__0"


    // $ANTLR start "rule__LoopCommand__Group__0__Impl"
    // InternalSpec.g:1752:1: rule__LoopCommand__Group__0__Impl : ( 'Perform' ) ;
    public final void rule__LoopCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1756:1: ( ( 'Perform' ) )
            // InternalSpec.g:1757:1: ( 'Perform' )
            {
            // InternalSpec.g:1757:1: ( 'Perform' )
            // InternalSpec.g:1758:2: 'Perform'
            {
             before(grammarAccess.getLoopCommandAccess().getPerformKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLoopCommandAccess().getPerformKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__Group__0__Impl"


    // $ANTLR start "rule__LoopCommand__Group__1"
    // InternalSpec.g:1767:1: rule__LoopCommand__Group__1 : rule__LoopCommand__Group__1__Impl rule__LoopCommand__Group__2 ;
    public final void rule__LoopCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1771:1: ( rule__LoopCommand__Group__1__Impl rule__LoopCommand__Group__2 )
            // InternalSpec.g:1772:2: rule__LoopCommand__Group__1__Impl rule__LoopCommand__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__LoopCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopCommand__Group__2();

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
    // $ANTLR end "rule__LoopCommand__Group__1"


    // $ANTLR start "rule__LoopCommand__Group__1__Impl"
    // InternalSpec.g:1779:1: rule__LoopCommand__Group__1__Impl : ( ( rule__LoopCommand__TimesAssignment_1 ) ) ;
    public final void rule__LoopCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1783:1: ( ( ( rule__LoopCommand__TimesAssignment_1 ) ) )
            // InternalSpec.g:1784:1: ( ( rule__LoopCommand__TimesAssignment_1 ) )
            {
            // InternalSpec.g:1784:1: ( ( rule__LoopCommand__TimesAssignment_1 ) )
            // InternalSpec.g:1785:2: ( rule__LoopCommand__TimesAssignment_1 )
            {
             before(grammarAccess.getLoopCommandAccess().getTimesAssignment_1()); 
            // InternalSpec.g:1786:2: ( rule__LoopCommand__TimesAssignment_1 )
            // InternalSpec.g:1786:3: rule__LoopCommand__TimesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LoopCommand__TimesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopCommandAccess().getTimesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__Group__1__Impl"


    // $ANTLR start "rule__LoopCommand__Group__2"
    // InternalSpec.g:1794:1: rule__LoopCommand__Group__2 : rule__LoopCommand__Group__2__Impl rule__LoopCommand__Group__3 ;
    public final void rule__LoopCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1798:1: ( rule__LoopCommand__Group__2__Impl rule__LoopCommand__Group__3 )
            // InternalSpec.g:1799:2: rule__LoopCommand__Group__2__Impl rule__LoopCommand__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__LoopCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopCommand__Group__3();

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
    // $ANTLR end "rule__LoopCommand__Group__2"


    // $ANTLR start "rule__LoopCommand__Group__2__Impl"
    // InternalSpec.g:1806:1: rule__LoopCommand__Group__2__Impl : ( 'times' ) ;
    public final void rule__LoopCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1810:1: ( ( 'times' ) )
            // InternalSpec.g:1811:1: ( 'times' )
            {
            // InternalSpec.g:1811:1: ( 'times' )
            // InternalSpec.g:1812:2: 'times'
            {
             before(grammarAccess.getLoopCommandAccess().getTimesKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLoopCommandAccess().getTimesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__Group__2__Impl"


    // $ANTLR start "rule__LoopCommand__Group__3"
    // InternalSpec.g:1821:1: rule__LoopCommand__Group__3 : rule__LoopCommand__Group__3__Impl rule__LoopCommand__Group__4 ;
    public final void rule__LoopCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1825:1: ( rule__LoopCommand__Group__3__Impl rule__LoopCommand__Group__4 )
            // InternalSpec.g:1826:2: rule__LoopCommand__Group__3__Impl rule__LoopCommand__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__LoopCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopCommand__Group__4();

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
    // $ANTLR end "rule__LoopCommand__Group__3"


    // $ANTLR start "rule__LoopCommand__Group__3__Impl"
    // InternalSpec.g:1833:1: rule__LoopCommand__Group__3__Impl : ( ':' ) ;
    public final void rule__LoopCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1837:1: ( ( ':' ) )
            // InternalSpec.g:1838:1: ( ':' )
            {
            // InternalSpec.g:1838:1: ( ':' )
            // InternalSpec.g:1839:2: ':'
            {
             before(grammarAccess.getLoopCommandAccess().getColonKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLoopCommandAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__Group__3__Impl"


    // $ANTLR start "rule__LoopCommand__Group__4"
    // InternalSpec.g:1848:1: rule__LoopCommand__Group__4 : rule__LoopCommand__Group__4__Impl rule__LoopCommand__Group__5 ;
    public final void rule__LoopCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1852:1: ( rule__LoopCommand__Group__4__Impl rule__LoopCommand__Group__5 )
            // InternalSpec.g:1853:2: rule__LoopCommand__Group__4__Impl rule__LoopCommand__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__LoopCommand__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopCommand__Group__5();

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
    // $ANTLR end "rule__LoopCommand__Group__4"


    // $ANTLR start "rule__LoopCommand__Group__4__Impl"
    // InternalSpec.g:1860:1: rule__LoopCommand__Group__4__Impl : ( ( rule__LoopCommand__CommandAssignment_4 )* ) ;
    public final void rule__LoopCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1864:1: ( ( ( rule__LoopCommand__CommandAssignment_4 )* ) )
            // InternalSpec.g:1865:1: ( ( rule__LoopCommand__CommandAssignment_4 )* )
            {
            // InternalSpec.g:1865:1: ( ( rule__LoopCommand__CommandAssignment_4 )* )
            // InternalSpec.g:1866:2: ( rule__LoopCommand__CommandAssignment_4 )*
            {
             before(grammarAccess.getLoopCommandAccess().getCommandAssignment_4()); 
            // InternalSpec.g:1867:2: ( rule__LoopCommand__CommandAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_SL_COMMENT && LA16_0<=RULE_CUSTOM_COMMAND)||LA16_0==37||LA16_0==41||(LA16_0>=43 && LA16_0<=50)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSpec.g:1867:3: rule__LoopCommand__CommandAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__LoopCommand__CommandAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getLoopCommandAccess().getCommandAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__Group__4__Impl"


    // $ANTLR start "rule__LoopCommand__Group__5"
    // InternalSpec.g:1875:1: rule__LoopCommand__Group__5 : rule__LoopCommand__Group__5__Impl ;
    public final void rule__LoopCommand__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1879:1: ( rule__LoopCommand__Group__5__Impl )
            // InternalSpec.g:1880:2: rule__LoopCommand__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopCommand__Group__5__Impl();

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
    // $ANTLR end "rule__LoopCommand__Group__5"


    // $ANTLR start "rule__LoopCommand__Group__5__Impl"
    // InternalSpec.g:1886:1: rule__LoopCommand__Group__5__Impl : ( '\\n\\n' ) ;
    public final void rule__LoopCommand__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1890:1: ( ( '\\n\\n' ) )
            // InternalSpec.g:1891:1: ( '\\n\\n' )
            {
            // InternalSpec.g:1891:1: ( '\\n\\n' )
            // InternalSpec.g:1892:2: '\\n\\n'
            {
             before(grammarAccess.getLoopCommandAccess().getControl000aControl000aKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLoopCommandAccess().getControl000aControl000aKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__Group__5__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // InternalSpec.g:1902:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1906:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalSpec.g:1907:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSpec.g:1914:1: rule__VarDeclaration__Group__0__Impl : ( 'Store' ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1918:1: ( ( 'Store' ) )
            // InternalSpec.g:1919:1: ( 'Store' )
            {
            // InternalSpec.g:1919:1: ( 'Store' )
            // InternalSpec.g:1920:2: 'Store'
            {
             before(grammarAccess.getVarDeclarationAccess().getStoreKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSpec.g:1929:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1933:1: ( rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 )
            // InternalSpec.g:1934:2: rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSpec.g:1941:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1945:1: ( ( ( rule__VarDeclaration__NameAssignment_1 ) ) )
            // InternalSpec.g:1946:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            {
            // InternalSpec.g:1946:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            // InternalSpec.g:1947:2: ( rule__VarDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 
            // InternalSpec.g:1948:2: ( rule__VarDeclaration__NameAssignment_1 )
            // InternalSpec.g:1948:3: rule__VarDeclaration__NameAssignment_1
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
    // InternalSpec.g:1956:1: rule__VarDeclaration__Group__2 : rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 ;
    public final void rule__VarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1960:1: ( rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 )
            // InternalSpec.g:1961:2: rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalSpec.g:1968:1: rule__VarDeclaration__Group__2__Impl : ( 'as' ) ;
    public final void rule__VarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1972:1: ( ( 'as' ) )
            // InternalSpec.g:1973:1: ( 'as' )
            {
            // InternalSpec.g:1973:1: ( 'as' )
            // InternalSpec.g:1974:2: 'as'
            {
             before(grammarAccess.getVarDeclarationAccess().getAsKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSpec.g:1983:1: rule__VarDeclaration__Group__3 : rule__VarDeclaration__Group__3__Impl ;
    public final void rule__VarDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1987:1: ( rule__VarDeclaration__Group__3__Impl )
            // InternalSpec.g:1988:2: rule__VarDeclaration__Group__3__Impl
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
    // InternalSpec.g:1994:1: rule__VarDeclaration__Group__3__Impl : ( ( rule__VarDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VarDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1998:1: ( ( ( rule__VarDeclaration__ValueAssignment_3 ) ) )
            // InternalSpec.g:1999:1: ( ( rule__VarDeclaration__ValueAssignment_3 ) )
            {
            // InternalSpec.g:1999:1: ( ( rule__VarDeclaration__ValueAssignment_3 ) )
            // InternalSpec.g:2000:2: ( rule__VarDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVarDeclarationAccess().getValueAssignment_3()); 
            // InternalSpec.g:2001:2: ( rule__VarDeclaration__ValueAssignment_3 )
            // InternalSpec.g:2001:3: rule__VarDeclaration__ValueAssignment_3
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
    // InternalSpec.g:2010:1: rule__Model__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2014:1: ( ( ruleCommand ) )
            // InternalSpec.g:2015:2: ( ruleCommand )
            {
            // InternalSpec.g:2015:2: ( ruleCommand )
            // InternalSpec.g:2016:3: ruleCommand
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


    // $ANTLR start "rule__Command__CustomAssignment_9"
    // InternalSpec.g:2025:1: rule__Command__CustomAssignment_9 : ( RULE_CUSTOM_COMMAND ) ;
    public final void rule__Command__CustomAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2029:1: ( ( RULE_CUSTOM_COMMAND ) )
            // InternalSpec.g:2030:2: ( RULE_CUSTOM_COMMAND )
            {
            // InternalSpec.g:2030:2: ( RULE_CUSTOM_COMMAND )
            // InternalSpec.g:2031:3: RULE_CUSTOM_COMMAND
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


    // $ANTLR start "rule__UsingCommand__NameAssignment_0"
    // InternalSpec.g:2040:1: rule__UsingCommand__NameAssignment_0 : ( ( 'Using' ) ) ;
    public final void rule__UsingCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2044:1: ( ( ( 'Using' ) ) )
            // InternalSpec.g:2045:2: ( ( 'Using' ) )
            {
            // InternalSpec.g:2045:2: ( ( 'Using' ) )
            // InternalSpec.g:2046:3: ( 'Using' )
            {
             before(grammarAccess.getUsingCommandAccess().getNameUsingKeyword_0_0()); 
            // InternalSpec.g:2047:3: ( 'Using' )
            // InternalSpec.g:2048:4: 'Using'
            {
             before(grammarAccess.getUsingCommandAccess().getNameUsingKeyword_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSpec.g:2059:1: rule__UsingCommand__BrowserAssignment_1 : ( ruleBrowser ) ;
    public final void rule__UsingCommand__BrowserAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2063:1: ( ( ruleBrowser ) )
            // InternalSpec.g:2064:2: ( ruleBrowser )
            {
            // InternalSpec.g:2064:2: ( ruleBrowser )
            // InternalSpec.g:2065:3: ruleBrowser
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
    // InternalSpec.g:2074:1: rule__OpenCommand__NameAssignment_1 : ( ( 'Open' ) ) ;
    public final void rule__OpenCommand__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2078:1: ( ( ( 'Open' ) ) )
            // InternalSpec.g:2079:2: ( ( 'Open' ) )
            {
            // InternalSpec.g:2079:2: ( ( 'Open' ) )
            // InternalSpec.g:2080:3: ( 'Open' )
            {
             before(grammarAccess.getOpenCommandAccess().getNameOpenKeyword_1_0()); 
            // InternalSpec.g:2081:3: ( 'Open' )
            // InternalSpec.g:2082:4: 'Open'
            {
             before(grammarAccess.getOpenCommandAccess().getNameOpenKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSpec.g:2093:1: rule__OpenCommand__ValAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__OpenCommand__ValAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2097:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2098:2: ( RULE_STRING )
            {
            // InternalSpec.g:2098:2: ( RULE_STRING )
            // InternalSpec.g:2099:3: RULE_STRING
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
    // InternalSpec.g:2108:1: rule__OpenCommand__VarAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__OpenCommand__VarAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2112:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2113:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2113:2: ( ( RULE_ID ) )
            // InternalSpec.g:2114:3: ( RULE_ID )
            {
             before(grammarAccess.getOpenCommandAccess().getVarVarDeclarationCrossReference_2_1_0()); 
            // InternalSpec.g:2115:3: ( RULE_ID )
            // InternalSpec.g:2116:4: RULE_ID
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
    // InternalSpec.g:2127:1: rule__ClickCommand__NameAssignment_0 : ( ( 'Click' ) ) ;
    public final void rule__ClickCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2131:1: ( ( ( 'Click' ) ) )
            // InternalSpec.g:2132:2: ( ( 'Click' ) )
            {
            // InternalSpec.g:2132:2: ( ( 'Click' ) )
            // InternalSpec.g:2133:3: ( 'Click' )
            {
             before(grammarAccess.getClickCommandAccess().getNameClickKeyword_0_0()); 
            // InternalSpec.g:2134:3: ( 'Click' )
            // InternalSpec.g:2135:4: 'Click'
            {
             before(grammarAccess.getClickCommandAccess().getNameClickKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSpec.g:2146:1: rule__ClickCommand__SelectorAssignment_1_0_1 : ( ruleSelector ) ;
    public final void rule__ClickCommand__SelectorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2150:1: ( ( ruleSelector ) )
            // InternalSpec.g:2151:2: ( ruleSelector )
            {
            // InternalSpec.g:2151:2: ( ruleSelector )
            // InternalSpec.g:2152:3: ruleSelector
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
    // InternalSpec.g:2161:1: rule__ClickCommand__PointAssignment_1_1_1 : ( rulePoint ) ;
    public final void rule__ClickCommand__PointAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2165:1: ( ( rulePoint ) )
            // InternalSpec.g:2166:2: ( rulePoint )
            {
            // InternalSpec.g:2166:2: ( rulePoint )
            // InternalSpec.g:2167:3: rulePoint
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
    // InternalSpec.g:2176:1: rule__SelectCommand__NameAssignment_0_0 : ( ( 'Within' ) ) ;
    public final void rule__SelectCommand__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2180:1: ( ( ( 'Within' ) ) )
            // InternalSpec.g:2181:2: ( ( 'Within' ) )
            {
            // InternalSpec.g:2181:2: ( ( 'Within' ) )
            // InternalSpec.g:2182:3: ( 'Within' )
            {
             before(grammarAccess.getSelectCommandAccess().getNameWithinKeyword_0_0_0()); 
            // InternalSpec.g:2183:3: ( 'Within' )
            // InternalSpec.g:2184:4: 'Within'
            {
             before(grammarAccess.getSelectCommandAccess().getNameWithinKeyword_0_0_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSpec.g:2195:1: rule__SelectCommand__ValueAssignment_0_1 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2199:1: ( ( ruleSelector ) )
            // InternalSpec.g:2200:2: ( ruleSelector )
            {
            // InternalSpec.g:2200:2: ( ruleSelector )
            // InternalSpec.g:2201:3: ruleSelector
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
    // InternalSpec.g:2210:1: rule__SelectCommand__NameAssignment_1_0 : ( ( 'Select' ) ) ;
    public final void rule__SelectCommand__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2214:1: ( ( ( 'Select' ) ) )
            // InternalSpec.g:2215:2: ( ( 'Select' ) )
            {
            // InternalSpec.g:2215:2: ( ( 'Select' ) )
            // InternalSpec.g:2216:3: ( 'Select' )
            {
             before(grammarAccess.getSelectCommandAccess().getNameSelectKeyword_1_0_0()); 
            // InternalSpec.g:2217:3: ( 'Select' )
            // InternalSpec.g:2218:4: 'Select'
            {
             before(grammarAccess.getSelectCommandAccess().getNameSelectKeyword_1_0_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSpec.g:2229:1: rule__SelectCommand__ValueAssignment_1_2 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2233:1: ( ( ruleSelector ) )
            // InternalSpec.g:2234:2: ( ruleSelector )
            {
            // InternalSpec.g:2234:2: ( ruleSelector )
            // InternalSpec.g:2235:3: ruleSelector
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
    // InternalSpec.g:2244:1: rule__Selector__TypeAssignment_0 : ( ruleElementType ) ;
    public final void rule__Selector__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2248:1: ( ( ruleElementType ) )
            // InternalSpec.g:2249:2: ( ruleElementType )
            {
            // InternalSpec.g:2249:2: ( ruleElementType )
            // InternalSpec.g:2250:3: ruleElementType
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
    // InternalSpec.g:2259:1: rule__Selector__VarAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Selector__VarAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2263:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2264:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2264:2: ( ( RULE_ID ) )
            // InternalSpec.g:2265:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectorAccess().getVarVarDeclarationCrossReference_1_0_0()); 
            // InternalSpec.g:2266:3: ( RULE_ID )
            // InternalSpec.g:2267:4: RULE_ID
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
    // InternalSpec.g:2278:1: rule__Selector__ValAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Selector__ValAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2282:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2283:2: ( RULE_STRING )
            {
            // InternalSpec.g:2283:2: ( RULE_STRING )
            // InternalSpec.g:2284:3: RULE_STRING
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
    // InternalSpec.g:2293:1: rule__PropertyCommand__NameAssignment_0 : ( ( 'Property' ) ) ;
    public final void rule__PropertyCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2297:1: ( ( ( 'Property' ) ) )
            // InternalSpec.g:2298:2: ( ( 'Property' ) )
            {
            // InternalSpec.g:2298:2: ( ( 'Property' ) )
            // InternalSpec.g:2299:3: ( 'Property' )
            {
             before(grammarAccess.getPropertyCommandAccess().getNamePropertyKeyword_0_0()); 
            // InternalSpec.g:2300:3: ( 'Property' )
            // InternalSpec.g:2301:4: 'Property'
            {
             before(grammarAccess.getPropertyCommandAccess().getNamePropertyKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSpec.g:2312:1: rule__PropertyCommand__PropAssignment_1 : ( ruleProperty ) ;
    public final void rule__PropertyCommand__PropAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2316:1: ( ( ruleProperty ) )
            // InternalSpec.g:2317:2: ( ruleProperty )
            {
            // InternalSpec.g:2317:2: ( ruleProperty )
            // InternalSpec.g:2318:3: ruleProperty
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
    // InternalSpec.g:2327:1: rule__PropertyCommand__CondAssignment_2 : ( ruleCondition ) ;
    public final void rule__PropertyCommand__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2331:1: ( ( ruleCondition ) )
            // InternalSpec.g:2332:2: ( ruleCondition )
            {
            // InternalSpec.g:2332:2: ( ruleCondition )
            // InternalSpec.g:2333:3: ruleCondition
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
    // InternalSpec.g:2342:1: rule__PropertyCommand__ValAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__PropertyCommand__ValAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2346:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2347:2: ( RULE_STRING )
            {
            // InternalSpec.g:2347:2: ( RULE_STRING )
            // InternalSpec.g:2348:3: RULE_STRING
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
    // InternalSpec.g:2357:1: rule__PropertyCommand__VarAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyCommand__VarAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2361:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2362:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2362:2: ( ( RULE_ID ) )
            // InternalSpec.g:2363:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyCommandAccess().getVarVarDeclarationCrossReference_3_1_0()); 
            // InternalSpec.g:2364:3: ( RULE_ID )
            // InternalSpec.g:2365:4: RULE_ID
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
    // InternalSpec.g:2376:1: rule__TypeCommand__NameAssignment_0 : ( ( 'Type' ) ) ;
    public final void rule__TypeCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2380:1: ( ( ( 'Type' ) ) )
            // InternalSpec.g:2381:2: ( ( 'Type' ) )
            {
            // InternalSpec.g:2381:2: ( ( 'Type' ) )
            // InternalSpec.g:2382:3: ( 'Type' )
            {
             before(grammarAccess.getTypeCommandAccess().getNameTypeKeyword_0_0()); 
            // InternalSpec.g:2383:3: ( 'Type' )
            // InternalSpec.g:2384:4: 'Type'
            {
             before(grammarAccess.getTypeCommandAccess().getNameTypeKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSpec.g:2395:1: rule__TypeCommand__StrAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__TypeCommand__StrAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2399:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2400:2: ( RULE_STRING )
            {
            // InternalSpec.g:2400:2: ( RULE_STRING )
            // InternalSpec.g:2401:3: RULE_STRING
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
    // InternalSpec.g:2410:1: rule__TypeCommand__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeCommand__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2414:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2415:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2415:2: ( ( RULE_ID ) )
            // InternalSpec.g:2416:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeCommandAccess().getVarVarDeclarationCrossReference_1_1_0()); 
            // InternalSpec.g:2417:3: ( RULE_ID )
            // InternalSpec.g:2418:4: RULE_ID
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
    // InternalSpec.g:2429:1: rule__SleepCommand__NameAssignment_0 : ( ( 'Sleep' ) ) ;
    public final void rule__SleepCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2433:1: ( ( ( 'Sleep' ) ) )
            // InternalSpec.g:2434:2: ( ( 'Sleep' ) )
            {
            // InternalSpec.g:2434:2: ( ( 'Sleep' ) )
            // InternalSpec.g:2435:3: ( 'Sleep' )
            {
             before(grammarAccess.getSleepCommandAccess().getNameSleepKeyword_0_0()); 
            // InternalSpec.g:2436:3: ( 'Sleep' )
            // InternalSpec.g:2437:4: 'Sleep'
            {
             before(grammarAccess.getSleepCommandAccess().getNameSleepKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSpec.g:2448:1: rule__SleepCommand__TimeAssignment_2 : ( RULE_INT ) ;
    public final void rule__SleepCommand__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2452:1: ( ( RULE_INT ) )
            // InternalSpec.g:2453:2: ( RULE_INT )
            {
            // InternalSpec.g:2453:2: ( RULE_INT )
            // InternalSpec.g:2454:3: RULE_INT
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
    // InternalSpec.g:2463:1: rule__Point__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Point__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2467:1: ( ( RULE_INT ) )
            // InternalSpec.g:2468:2: ( RULE_INT )
            {
            // InternalSpec.g:2468:2: ( RULE_INT )
            // InternalSpec.g:2469:3: RULE_INT
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
    // InternalSpec.g:2478:1: rule__Point__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Point__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2482:1: ( ( RULE_INT ) )
            // InternalSpec.g:2483:2: ( RULE_INT )
            {
            // InternalSpec.g:2483:2: ( RULE_INT )
            // InternalSpec.g:2484:3: RULE_INT
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


    // $ANTLR start "rule__LoopCommand__TimesAssignment_1"
    // InternalSpec.g:2493:1: rule__LoopCommand__TimesAssignment_1 : ( RULE_INT ) ;
    public final void rule__LoopCommand__TimesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2497:1: ( ( RULE_INT ) )
            // InternalSpec.g:2498:2: ( RULE_INT )
            {
            // InternalSpec.g:2498:2: ( RULE_INT )
            // InternalSpec.g:2499:3: RULE_INT
            {
             before(grammarAccess.getLoopCommandAccess().getTimesINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLoopCommandAccess().getTimesINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__TimesAssignment_1"


    // $ANTLR start "rule__LoopCommand__CommandAssignment_4"
    // InternalSpec.g:2508:1: rule__LoopCommand__CommandAssignment_4 : ( ruleCommand ) ;
    public final void rule__LoopCommand__CommandAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2512:1: ( ( ruleCommand ) )
            // InternalSpec.g:2513:2: ( ruleCommand )
            {
            // InternalSpec.g:2513:2: ( ruleCommand )
            // InternalSpec.g:2514:3: ruleCommand
            {
             before(grammarAccess.getLoopCommandAccess().getCommandCommandParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getLoopCommandAccess().getCommandCommandParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__CommandAssignment_4"


    // $ANTLR start "rule__VarDeclaration__NameAssignment_1"
    // InternalSpec.g:2523:1: rule__VarDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2527:1: ( ( RULE_ID ) )
            // InternalSpec.g:2528:2: ( RULE_ID )
            {
            // InternalSpec.g:2528:2: ( RULE_ID )
            // InternalSpec.g:2529:3: RULE_ID
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
    // InternalSpec.g:2538:1: rule__VarDeclaration__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__VarDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2542:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2543:2: ( RULE_STRING )
            {
            // InternalSpec.g:2543:2: ( RULE_STRING )
            // InternalSpec.g:2544:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0007FA2000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000100000000000L});
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
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0007FB2000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});

}
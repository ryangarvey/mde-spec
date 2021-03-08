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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_CUSTOM_COMMAND", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'second'", "'seconds'", "'button'", "'element'", "'link'", "'input'", "'textarea'", "'text'", "'class'", "'value'", "'should be'", "'should not be'", "'on'", "'at'", "'visible'", "'for'", "'{'", "','", "'}'", "'Store'", "'as'", "'Open'", "'Click'", "'Within'", "'Select'", "'Property'", "'Type'", "'Sleep'"
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
    public static final int T__20=20;
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

                if ( ((LA1_0>=RULE_SL_COMMENT && LA1_0<=RULE_CUSTOM_COMMAND)||LA1_0==31||(LA1_0>=33 && LA1_0<=39)) ) {
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
    // InternalSpec.g:137:1: ruleClickCommand : ( ( rule__ClickCommand__Group__0 ) ) ;
    public final void ruleClickCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:141:2: ( ( ( rule__ClickCommand__Group__0 ) ) )
            // InternalSpec.g:142:2: ( ( rule__ClickCommand__Group__0 ) )
            {
            // InternalSpec.g:142:2: ( ( rule__ClickCommand__Group__0 ) )
            // InternalSpec.g:143:3: ( rule__ClickCommand__Group__0 )
            {
             before(grammarAccess.getClickCommandAccess().getGroup()); 
            // InternalSpec.g:144:3: ( rule__ClickCommand__Group__0 )
            // InternalSpec.g:144:4: rule__ClickCommand__Group__0
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
    // InternalSpec.g:187:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:191:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalSpec.g:192:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalSpec.g:192:2: ( ( rule__Selector__Group__0 ) )
            // InternalSpec.g:193:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalSpec.g:194:3: ( rule__Selector__Group__0 )
            // InternalSpec.g:194:4: rule__Selector__Group__0
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
    // InternalSpec.g:203:1: entryRulePropertyCommand : rulePropertyCommand EOF ;
    public final void entryRulePropertyCommand() throws RecognitionException {
        try {
            // InternalSpec.g:204:1: ( rulePropertyCommand EOF )
            // InternalSpec.g:205:1: rulePropertyCommand EOF
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
    // InternalSpec.g:212:1: rulePropertyCommand : ( ( rule__PropertyCommand__Group__0 ) ) ;
    public final void rulePropertyCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:216:2: ( ( ( rule__PropertyCommand__Group__0 ) ) )
            // InternalSpec.g:217:2: ( ( rule__PropertyCommand__Group__0 ) )
            {
            // InternalSpec.g:217:2: ( ( rule__PropertyCommand__Group__0 ) )
            // InternalSpec.g:218:3: ( rule__PropertyCommand__Group__0 )
            {
             before(grammarAccess.getPropertyCommandAccess().getGroup()); 
            // InternalSpec.g:219:3: ( rule__PropertyCommand__Group__0 )
            // InternalSpec.g:219:4: rule__PropertyCommand__Group__0
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
    // InternalSpec.g:228:1: entryRuleTypeCommand : ruleTypeCommand EOF ;
    public final void entryRuleTypeCommand() throws RecognitionException {
        try {
            // InternalSpec.g:229:1: ( ruleTypeCommand EOF )
            // InternalSpec.g:230:1: ruleTypeCommand EOF
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
    // InternalSpec.g:237:1: ruleTypeCommand : ( ( rule__TypeCommand__Group__0 ) ) ;
    public final void ruleTypeCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:241:2: ( ( ( rule__TypeCommand__Group__0 ) ) )
            // InternalSpec.g:242:2: ( ( rule__TypeCommand__Group__0 ) )
            {
            // InternalSpec.g:242:2: ( ( rule__TypeCommand__Group__0 ) )
            // InternalSpec.g:243:3: ( rule__TypeCommand__Group__0 )
            {
             before(grammarAccess.getTypeCommandAccess().getGroup()); 
            // InternalSpec.g:244:3: ( rule__TypeCommand__Group__0 )
            // InternalSpec.g:244:4: rule__TypeCommand__Group__0
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
    // InternalSpec.g:253:1: entryRuleSleepCommand : ruleSleepCommand EOF ;
    public final void entryRuleSleepCommand() throws RecognitionException {
        try {
            // InternalSpec.g:254:1: ( ruleSleepCommand EOF )
            // InternalSpec.g:255:1: ruleSleepCommand EOF
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
    // InternalSpec.g:262:1: ruleSleepCommand : ( ( rule__SleepCommand__Group__0 ) ) ;
    public final void ruleSleepCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:266:2: ( ( ( rule__SleepCommand__Group__0 ) ) )
            // InternalSpec.g:267:2: ( ( rule__SleepCommand__Group__0 ) )
            {
            // InternalSpec.g:267:2: ( ( rule__SleepCommand__Group__0 ) )
            // InternalSpec.g:268:3: ( rule__SleepCommand__Group__0 )
            {
             before(grammarAccess.getSleepCommandAccess().getGroup()); 
            // InternalSpec.g:269:3: ( rule__SleepCommand__Group__0 )
            // InternalSpec.g:269:4: rule__SleepCommand__Group__0
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
    // InternalSpec.g:278:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalSpec.g:279:1: ( rulePoint EOF )
            // InternalSpec.g:280:1: rulePoint EOF
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
    // InternalSpec.g:287:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:291:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalSpec.g:292:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalSpec.g:292:2: ( ( rule__Point__Group__0 ) )
            // InternalSpec.g:293:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalSpec.g:294:3: ( rule__Point__Group__0 )
            // InternalSpec.g:294:4: rule__Point__Group__0
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
    // InternalSpec.g:303:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalSpec.g:304:1: ( ruleVarDeclaration EOF )
            // InternalSpec.g:305:1: ruleVarDeclaration EOF
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
    // InternalSpec.g:312:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:316:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalSpec.g:317:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalSpec.g:317:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalSpec.g:318:3: ( rule__VarDeclaration__Group__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            // InternalSpec.g:319:3: ( rule__VarDeclaration__Group__0 )
            // InternalSpec.g:319:4: rule__VarDeclaration__Group__0
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


    // $ANTLR start "ruleElementType"
    // InternalSpec.g:328:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:332:1: ( ( ( rule__ElementType__Alternatives ) ) )
            // InternalSpec.g:333:2: ( ( rule__ElementType__Alternatives ) )
            {
            // InternalSpec.g:333:2: ( ( rule__ElementType__Alternatives ) )
            // InternalSpec.g:334:3: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // InternalSpec.g:335:3: ( rule__ElementType__Alternatives )
            // InternalSpec.g:335:4: rule__ElementType__Alternatives
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
    // InternalSpec.g:344:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:348:1: ( ( ( rule__Property__Alternatives ) ) )
            // InternalSpec.g:349:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalSpec.g:349:2: ( ( rule__Property__Alternatives ) )
            // InternalSpec.g:350:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalSpec.g:351:3: ( rule__Property__Alternatives )
            // InternalSpec.g:351:4: rule__Property__Alternatives
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
    // InternalSpec.g:360:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:364:1: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalSpec.g:365:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalSpec.g:365:2: ( ( rule__Condition__Alternatives ) )
            // InternalSpec.g:366:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalSpec.g:367:3: ( rule__Condition__Alternatives )
            // InternalSpec.g:367:4: rule__Condition__Alternatives
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
    // InternalSpec.g:375:1: rule__Command__Alternatives : ( ( ruleOpenCommand ) | ( ruleClickCommand ) | ( ruleSelectCommand ) | ( rulePropertyCommand ) | ( ruleTypeCommand ) | ( ruleSleepCommand ) | ( ( rule__Command__Group_6__0 ) ) | ( ( rule__Command__CustomAssignment_7 ) ) | ( ruleVarDeclaration ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:379:1: ( ( ruleOpenCommand ) | ( ruleClickCommand ) | ( ruleSelectCommand ) | ( rulePropertyCommand ) | ( ruleTypeCommand ) | ( ruleSleepCommand ) | ( ( rule__Command__Group_6__0 ) ) | ( ( rule__Command__CustomAssignment_7 ) ) | ( ruleVarDeclaration ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 35:
            case 36:
                {
                alt2=3;
                }
                break;
            case 37:
                {
                alt2=4;
                }
                break;
            case 38:
                {
                alt2=5;
                }
                break;
            case 39:
                {
                alt2=6;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt2=7;
                }
                break;
            case RULE_CUSTOM_COMMAND:
                {
                alt2=8;
                }
                break;
            case 31:
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
                    // InternalSpec.g:380:2: ( ruleOpenCommand )
                    {
                    // InternalSpec.g:380:2: ( ruleOpenCommand )
                    // InternalSpec.g:381:3: ruleOpenCommand
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
                    // InternalSpec.g:386:2: ( ruleClickCommand )
                    {
                    // InternalSpec.g:386:2: ( ruleClickCommand )
                    // InternalSpec.g:387:3: ruleClickCommand
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
                    // InternalSpec.g:392:2: ( ruleSelectCommand )
                    {
                    // InternalSpec.g:392:2: ( ruleSelectCommand )
                    // InternalSpec.g:393:3: ruleSelectCommand
                    {
                     before(grammarAccess.getCommandAccess().getSelectCommandParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getSelectCommandParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:398:2: ( rulePropertyCommand )
                    {
                    // InternalSpec.g:398:2: ( rulePropertyCommand )
                    // InternalSpec.g:399:3: rulePropertyCommand
                    {
                     before(grammarAccess.getCommandAccess().getPropertyCommandParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getPropertyCommandParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:404:2: ( ruleTypeCommand )
                    {
                    // InternalSpec.g:404:2: ( ruleTypeCommand )
                    // InternalSpec.g:405:3: ruleTypeCommand
                    {
                     before(grammarAccess.getCommandAccess().getTypeCommandParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getTypeCommandParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSpec.g:410:2: ( ruleSleepCommand )
                    {
                    // InternalSpec.g:410:2: ( ruleSleepCommand )
                    // InternalSpec.g:411:3: ruleSleepCommand
                    {
                     before(grammarAccess.getCommandAccess().getSleepCommandParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSleepCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getSleepCommandParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSpec.g:416:2: ( ( rule__Command__Group_6__0 ) )
                    {
                    // InternalSpec.g:416:2: ( ( rule__Command__Group_6__0 ) )
                    // InternalSpec.g:417:3: ( rule__Command__Group_6__0 )
                    {
                     before(grammarAccess.getCommandAccess().getGroup_6()); 
                    // InternalSpec.g:418:3: ( rule__Command__Group_6__0 )
                    // InternalSpec.g:418:4: rule__Command__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommandAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSpec.g:422:2: ( ( rule__Command__CustomAssignment_7 ) )
                    {
                    // InternalSpec.g:422:2: ( ( rule__Command__CustomAssignment_7 ) )
                    // InternalSpec.g:423:3: ( rule__Command__CustomAssignment_7 )
                    {
                     before(grammarAccess.getCommandAccess().getCustomAssignment_7()); 
                    // InternalSpec.g:424:3: ( rule__Command__CustomAssignment_7 )
                    // InternalSpec.g:424:4: rule__Command__CustomAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__CustomAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommandAccess().getCustomAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSpec.g:428:2: ( ruleVarDeclaration )
                    {
                    // InternalSpec.g:428:2: ( ruleVarDeclaration )
                    // InternalSpec.g:429:3: ruleVarDeclaration
                    {
                     before(grammarAccess.getCommandAccess().getVarDeclarationParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleVarDeclaration();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getVarDeclarationParserRuleCall_8()); 

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
    // InternalSpec.g:438:1: rule__OpenCommand__Alternatives_2 : ( ( ( rule__OpenCommand__ValAssignment_2_0 ) ) | ( ( rule__OpenCommand__VarAssignment_2_1 ) ) );
    public final void rule__OpenCommand__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:442:1: ( ( ( rule__OpenCommand__ValAssignment_2_0 ) ) | ( ( rule__OpenCommand__VarAssignment_2_1 ) ) )
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
                    // InternalSpec.g:443:2: ( ( rule__OpenCommand__ValAssignment_2_0 ) )
                    {
                    // InternalSpec.g:443:2: ( ( rule__OpenCommand__ValAssignment_2_0 ) )
                    // InternalSpec.g:444:3: ( rule__OpenCommand__ValAssignment_2_0 )
                    {
                     before(grammarAccess.getOpenCommandAccess().getValAssignment_2_0()); 
                    // InternalSpec.g:445:3: ( rule__OpenCommand__ValAssignment_2_0 )
                    // InternalSpec.g:445:4: rule__OpenCommand__ValAssignment_2_0
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
                    // InternalSpec.g:449:2: ( ( rule__OpenCommand__VarAssignment_2_1 ) )
                    {
                    // InternalSpec.g:449:2: ( ( rule__OpenCommand__VarAssignment_2_1 ) )
                    // InternalSpec.g:450:3: ( rule__OpenCommand__VarAssignment_2_1 )
                    {
                     before(grammarAccess.getOpenCommandAccess().getVarAssignment_2_1()); 
                    // InternalSpec.g:451:3: ( rule__OpenCommand__VarAssignment_2_1 )
                    // InternalSpec.g:451:4: rule__OpenCommand__VarAssignment_2_1
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
    // InternalSpec.g:459:1: rule__ClickCommand__Alternatives_1 : ( ( ( rule__ClickCommand__Group_1_0__0 ) ) | ( ( rule__ClickCommand__Group_1_1__0 ) ) );
    public final void rule__ClickCommand__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:463:1: ( ( ( rule__ClickCommand__Group_1_0__0 ) ) | ( ( rule__ClickCommand__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSpec.g:464:2: ( ( rule__ClickCommand__Group_1_0__0 ) )
                    {
                    // InternalSpec.g:464:2: ( ( rule__ClickCommand__Group_1_0__0 ) )
                    // InternalSpec.g:465:3: ( rule__ClickCommand__Group_1_0__0 )
                    {
                     before(grammarAccess.getClickCommandAccess().getGroup_1_0()); 
                    // InternalSpec.g:466:3: ( rule__ClickCommand__Group_1_0__0 )
                    // InternalSpec.g:466:4: rule__ClickCommand__Group_1_0__0
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
                    // InternalSpec.g:470:2: ( ( rule__ClickCommand__Group_1_1__0 ) )
                    {
                    // InternalSpec.g:470:2: ( ( rule__ClickCommand__Group_1_1__0 ) )
                    // InternalSpec.g:471:3: ( rule__ClickCommand__Group_1_1__0 )
                    {
                     before(grammarAccess.getClickCommandAccess().getGroup_1_1()); 
                    // InternalSpec.g:472:3: ( rule__ClickCommand__Group_1_1__0 )
                    // InternalSpec.g:472:4: rule__ClickCommand__Group_1_1__0
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
    // InternalSpec.g:480:1: rule__SelectCommand__Alternatives : ( ( ( rule__SelectCommand__Group_0__0 ) ) | ( ( rule__SelectCommand__Group_1__0 ) ) );
    public final void rule__SelectCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:484:1: ( ( ( rule__SelectCommand__Group_0__0 ) ) | ( ( rule__SelectCommand__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            else if ( (LA5_0==36) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpec.g:485:2: ( ( rule__SelectCommand__Group_0__0 ) )
                    {
                    // InternalSpec.g:485:2: ( ( rule__SelectCommand__Group_0__0 ) )
                    // InternalSpec.g:486:3: ( rule__SelectCommand__Group_0__0 )
                    {
                     before(grammarAccess.getSelectCommandAccess().getGroup_0()); 
                    // InternalSpec.g:487:3: ( rule__SelectCommand__Group_0__0 )
                    // InternalSpec.g:487:4: rule__SelectCommand__Group_0__0
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
                    // InternalSpec.g:491:2: ( ( rule__SelectCommand__Group_1__0 ) )
                    {
                    // InternalSpec.g:491:2: ( ( rule__SelectCommand__Group_1__0 ) )
                    // InternalSpec.g:492:3: ( rule__SelectCommand__Group_1__0 )
                    {
                     before(grammarAccess.getSelectCommandAccess().getGroup_1()); 
                    // InternalSpec.g:493:3: ( rule__SelectCommand__Group_1__0 )
                    // InternalSpec.g:493:4: rule__SelectCommand__Group_1__0
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
    // InternalSpec.g:501:1: rule__Selector__Alternatives_1 : ( ( ( rule__Selector__VarAssignment_1_0 ) ) | ( ( rule__Selector__ValAssignment_1_1 ) ) );
    public final void rule__Selector__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:505:1: ( ( ( rule__Selector__VarAssignment_1_0 ) ) | ( ( rule__Selector__ValAssignment_1_1 ) ) )
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
                    // InternalSpec.g:506:2: ( ( rule__Selector__VarAssignment_1_0 ) )
                    {
                    // InternalSpec.g:506:2: ( ( rule__Selector__VarAssignment_1_0 ) )
                    // InternalSpec.g:507:3: ( rule__Selector__VarAssignment_1_0 )
                    {
                     before(grammarAccess.getSelectorAccess().getVarAssignment_1_0()); 
                    // InternalSpec.g:508:3: ( rule__Selector__VarAssignment_1_0 )
                    // InternalSpec.g:508:4: rule__Selector__VarAssignment_1_0
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
                    // InternalSpec.g:512:2: ( ( rule__Selector__ValAssignment_1_1 ) )
                    {
                    // InternalSpec.g:512:2: ( ( rule__Selector__ValAssignment_1_1 ) )
                    // InternalSpec.g:513:3: ( rule__Selector__ValAssignment_1_1 )
                    {
                     before(grammarAccess.getSelectorAccess().getValAssignment_1_1()); 
                    // InternalSpec.g:514:3: ( rule__Selector__ValAssignment_1_1 )
                    // InternalSpec.g:514:4: rule__Selector__ValAssignment_1_1
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
    // InternalSpec.g:522:1: rule__PropertyCommand__Alternatives_3 : ( ( ( rule__PropertyCommand__ValAssignment_3_0 ) ) | ( ( rule__PropertyCommand__VarAssignment_3_1 ) ) );
    public final void rule__PropertyCommand__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:526:1: ( ( ( rule__PropertyCommand__ValAssignment_3_0 ) ) | ( ( rule__PropertyCommand__VarAssignment_3_1 ) ) )
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
                    // InternalSpec.g:527:2: ( ( rule__PropertyCommand__ValAssignment_3_0 ) )
                    {
                    // InternalSpec.g:527:2: ( ( rule__PropertyCommand__ValAssignment_3_0 ) )
                    // InternalSpec.g:528:3: ( rule__PropertyCommand__ValAssignment_3_0 )
                    {
                     before(grammarAccess.getPropertyCommandAccess().getValAssignment_3_0()); 
                    // InternalSpec.g:529:3: ( rule__PropertyCommand__ValAssignment_3_0 )
                    // InternalSpec.g:529:4: rule__PropertyCommand__ValAssignment_3_0
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
                    // InternalSpec.g:533:2: ( ( rule__PropertyCommand__VarAssignment_3_1 ) )
                    {
                    // InternalSpec.g:533:2: ( ( rule__PropertyCommand__VarAssignment_3_1 ) )
                    // InternalSpec.g:534:3: ( rule__PropertyCommand__VarAssignment_3_1 )
                    {
                     before(grammarAccess.getPropertyCommandAccess().getVarAssignment_3_1()); 
                    // InternalSpec.g:535:3: ( rule__PropertyCommand__VarAssignment_3_1 )
                    // InternalSpec.g:535:4: rule__PropertyCommand__VarAssignment_3_1
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
    // InternalSpec.g:543:1: rule__TypeCommand__Alternatives_1 : ( ( ( rule__TypeCommand__StrAssignment_1_0 ) ) | ( ( rule__TypeCommand__VarAssignment_1_1 ) ) );
    public final void rule__TypeCommand__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:547:1: ( ( ( rule__TypeCommand__StrAssignment_1_0 ) ) | ( ( rule__TypeCommand__VarAssignment_1_1 ) ) )
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
                    // InternalSpec.g:548:2: ( ( rule__TypeCommand__StrAssignment_1_0 ) )
                    {
                    // InternalSpec.g:548:2: ( ( rule__TypeCommand__StrAssignment_1_0 ) )
                    // InternalSpec.g:549:3: ( rule__TypeCommand__StrAssignment_1_0 )
                    {
                     before(grammarAccess.getTypeCommandAccess().getStrAssignment_1_0()); 
                    // InternalSpec.g:550:3: ( rule__TypeCommand__StrAssignment_1_0 )
                    // InternalSpec.g:550:4: rule__TypeCommand__StrAssignment_1_0
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
                    // InternalSpec.g:554:2: ( ( rule__TypeCommand__VarAssignment_1_1 ) )
                    {
                    // InternalSpec.g:554:2: ( ( rule__TypeCommand__VarAssignment_1_1 ) )
                    // InternalSpec.g:555:3: ( rule__TypeCommand__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getTypeCommandAccess().getVarAssignment_1_1()); 
                    // InternalSpec.g:556:3: ( rule__TypeCommand__VarAssignment_1_1 )
                    // InternalSpec.g:556:4: rule__TypeCommand__VarAssignment_1_1
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
    // InternalSpec.g:564:1: rule__SleepCommand__Alternatives_3 : ( ( 'second' ) | ( 'seconds' ) );
    public final void rule__SleepCommand__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:568:1: ( ( 'second' ) | ( 'seconds' ) )
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
                    // InternalSpec.g:569:2: ( 'second' )
                    {
                    // InternalSpec.g:569:2: ( 'second' )
                    // InternalSpec.g:570:3: 'second'
                    {
                     before(grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:575:2: ( 'seconds' )
                    {
                    // InternalSpec.g:575:2: ( 'seconds' )
                    // InternalSpec.g:576:3: 'seconds'
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


    // $ANTLR start "rule__ElementType__Alternatives"
    // InternalSpec.g:585:1: rule__ElementType__Alternatives : ( ( ( 'button' ) ) | ( ( 'element' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) | ( ( 'textarea' ) ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:589:1: ( ( ( 'button' ) ) | ( ( 'element' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) | ( ( 'textarea' ) ) )
            int alt10=5;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSpec.g:590:2: ( ( 'button' ) )
                    {
                    // InternalSpec.g:590:2: ( ( 'button' ) )
                    // InternalSpec.g:591:3: ( 'button' )
                    {
                     before(grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0()); 
                    // InternalSpec.g:592:3: ( 'button' )
                    // InternalSpec.g:592:4: 'button'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getButtonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:596:2: ( ( 'element' ) )
                    {
                    // InternalSpec.g:596:2: ( ( 'element' ) )
                    // InternalSpec.g:597:3: ( 'element' )
                    {
                     before(grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:598:3: ( 'element' )
                    // InternalSpec.g:598:4: 'element'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getElementEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:602:2: ( ( 'link' ) )
                    {
                    // InternalSpec.g:602:2: ( ( 'link' ) )
                    // InternalSpec.g:603:3: ( 'link' )
                    {
                     before(grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2()); 
                    // InternalSpec.g:604:3: ( 'link' )
                    // InternalSpec.g:604:4: 'link'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getLinkEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:608:2: ( ( 'input' ) )
                    {
                    // InternalSpec.g:608:2: ( ( 'input' ) )
                    // InternalSpec.g:609:3: ( 'input' )
                    {
                     before(grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3()); 
                    // InternalSpec.g:610:3: ( 'input' )
                    // InternalSpec.g:610:4: 'input'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getElementTypeAccess().getInputEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:614:2: ( ( 'textarea' ) )
                    {
                    // InternalSpec.g:614:2: ( ( 'textarea' ) )
                    // InternalSpec.g:615:3: ( 'textarea' )
                    {
                     before(grammarAccess.getElementTypeAccess().getTextareaEnumLiteralDeclaration_4()); 
                    // InternalSpec.g:616:3: ( 'textarea' )
                    // InternalSpec.g:616:4: 'textarea'
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalSpec.g:624:1: rule__Property__Alternatives : ( ( ( 'text' ) ) | ( ( 'class' ) ) | ( ( 'value' ) ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:628:1: ( ( ( 'text' ) ) | ( ( 'class' ) ) | ( ( 'value' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSpec.g:629:2: ( ( 'text' ) )
                    {
                    // InternalSpec.g:629:2: ( ( 'text' ) )
                    // InternalSpec.g:630:3: ( 'text' )
                    {
                     before(grammarAccess.getPropertyAccess().getTextEnumLiteralDeclaration_0()); 
                    // InternalSpec.g:631:3: ( 'text' )
                    // InternalSpec.g:631:4: 'text'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyAccess().getTextEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:635:2: ( ( 'class' ) )
                    {
                    // InternalSpec.g:635:2: ( ( 'class' ) )
                    // InternalSpec.g:636:3: ( 'class' )
                    {
                     before(grammarAccess.getPropertyAccess().getClassEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:637:3: ( 'class' )
                    // InternalSpec.g:637:4: 'class'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyAccess().getClassEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:641:2: ( ( 'value' ) )
                    {
                    // InternalSpec.g:641:2: ( ( 'value' ) )
                    // InternalSpec.g:642:3: ( 'value' )
                    {
                     before(grammarAccess.getPropertyAccess().getValueEnumLiteralDeclaration_2()); 
                    // InternalSpec.g:643:3: ( 'value' )
                    // InternalSpec.g:643:4: 'value'
                    {
                    match(input,21,FOLLOW_2); 

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
    // InternalSpec.g:651:1: rule__Condition__Alternatives : ( ( ( 'should be' ) ) | ( ( 'should not be' ) ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:655:1: ( ( ( 'should be' ) ) | ( ( 'should not be' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            else if ( (LA12_0==23) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpec.g:656:2: ( ( 'should be' ) )
                    {
                    // InternalSpec.g:656:2: ( ( 'should be' ) )
                    // InternalSpec.g:657:3: ( 'should be' )
                    {
                     before(grammarAccess.getConditionAccess().getShouldBeEnumLiteralDeclaration_0()); 
                    // InternalSpec.g:658:3: ( 'should be' )
                    // InternalSpec.g:658:4: 'should be'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionAccess().getShouldBeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:662:2: ( ( 'should not be' ) )
                    {
                    // InternalSpec.g:662:2: ( ( 'should not be' ) )
                    // InternalSpec.g:663:3: ( 'should not be' )
                    {
                     before(grammarAccess.getConditionAccess().getShouldNotBeEnumLiteralDeclaration_1()); 
                    // InternalSpec.g:664:3: ( 'should not be' )
                    // InternalSpec.g:664:4: 'should not be'
                    {
                    match(input,23,FOLLOW_2); 

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


    // $ANTLR start "rule__Command__Group_6__0"
    // InternalSpec.g:672:1: rule__Command__Group_6__0 : rule__Command__Group_6__0__Impl rule__Command__Group_6__1 ;
    public final void rule__Command__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:676:1: ( rule__Command__Group_6__0__Impl rule__Command__Group_6__1 )
            // InternalSpec.g:677:2: rule__Command__Group_6__0__Impl rule__Command__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Command__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_6__0"


    // $ANTLR start "rule__Command__Group_6__0__Impl"
    // InternalSpec.g:684:1: rule__Command__Group_6__0__Impl : ( () ) ;
    public final void rule__Command__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:688:1: ( ( () ) )
            // InternalSpec.g:689:1: ( () )
            {
            // InternalSpec.g:689:1: ( () )
            // InternalSpec.g:690:2: ()
            {
             before(grammarAccess.getCommandAccess().getCommandAction_6_0()); 
            // InternalSpec.g:691:2: ()
            // InternalSpec.g:691:3: 
            {
            }

             after(grammarAccess.getCommandAccess().getCommandAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_6__0__Impl"


    // $ANTLR start "rule__Command__Group_6__1"
    // InternalSpec.g:699:1: rule__Command__Group_6__1 : rule__Command__Group_6__1__Impl ;
    public final void rule__Command__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:703:1: ( rule__Command__Group_6__1__Impl )
            // InternalSpec.g:704:2: rule__Command__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_6__1"


    // $ANTLR start "rule__Command__Group_6__1__Impl"
    // InternalSpec.g:710:1: rule__Command__Group_6__1__Impl : ( RULE_SL_COMMENT ) ;
    public final void rule__Command__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:714:1: ( ( RULE_SL_COMMENT ) )
            // InternalSpec.g:715:1: ( RULE_SL_COMMENT )
            {
            // InternalSpec.g:715:1: ( RULE_SL_COMMENT )
            // InternalSpec.g:716:2: RULE_SL_COMMENT
            {
             before(grammarAccess.getCommandAccess().getSL_COMMENTTerminalRuleCall_6_1()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getSL_COMMENTTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_6__1__Impl"


    // $ANTLR start "rule__OpenCommand__Group__0"
    // InternalSpec.g:726:1: rule__OpenCommand__Group__0 : rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1 ;
    public final void rule__OpenCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:730:1: ( rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1 )
            // InternalSpec.g:731:2: rule__OpenCommand__Group__0__Impl rule__OpenCommand__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSpec.g:738:1: rule__OpenCommand__Group__0__Impl : ( () ) ;
    public final void rule__OpenCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:742:1: ( ( () ) )
            // InternalSpec.g:743:1: ( () )
            {
            // InternalSpec.g:743:1: ( () )
            // InternalSpec.g:744:2: ()
            {
             before(grammarAccess.getOpenCommandAccess().getOpenCommandAction_0()); 
            // InternalSpec.g:745:2: ()
            // InternalSpec.g:745:3: 
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
    // InternalSpec.g:753:1: rule__OpenCommand__Group__1 : rule__OpenCommand__Group__1__Impl rule__OpenCommand__Group__2 ;
    public final void rule__OpenCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:757:1: ( rule__OpenCommand__Group__1__Impl rule__OpenCommand__Group__2 )
            // InternalSpec.g:758:2: rule__OpenCommand__Group__1__Impl rule__OpenCommand__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSpec.g:765:1: rule__OpenCommand__Group__1__Impl : ( ( rule__OpenCommand__NameAssignment_1 ) ) ;
    public final void rule__OpenCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:769:1: ( ( ( rule__OpenCommand__NameAssignment_1 ) ) )
            // InternalSpec.g:770:1: ( ( rule__OpenCommand__NameAssignment_1 ) )
            {
            // InternalSpec.g:770:1: ( ( rule__OpenCommand__NameAssignment_1 ) )
            // InternalSpec.g:771:2: ( rule__OpenCommand__NameAssignment_1 )
            {
             before(grammarAccess.getOpenCommandAccess().getNameAssignment_1()); 
            // InternalSpec.g:772:2: ( rule__OpenCommand__NameAssignment_1 )
            // InternalSpec.g:772:3: rule__OpenCommand__NameAssignment_1
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
    // InternalSpec.g:780:1: rule__OpenCommand__Group__2 : rule__OpenCommand__Group__2__Impl ;
    public final void rule__OpenCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:784:1: ( rule__OpenCommand__Group__2__Impl )
            // InternalSpec.g:785:2: rule__OpenCommand__Group__2__Impl
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
    // InternalSpec.g:791:1: rule__OpenCommand__Group__2__Impl : ( ( rule__OpenCommand__Alternatives_2 ) ) ;
    public final void rule__OpenCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:795:1: ( ( ( rule__OpenCommand__Alternatives_2 ) ) )
            // InternalSpec.g:796:1: ( ( rule__OpenCommand__Alternatives_2 ) )
            {
            // InternalSpec.g:796:1: ( ( rule__OpenCommand__Alternatives_2 ) )
            // InternalSpec.g:797:2: ( rule__OpenCommand__Alternatives_2 )
            {
             before(grammarAccess.getOpenCommandAccess().getAlternatives_2()); 
            // InternalSpec.g:798:2: ( rule__OpenCommand__Alternatives_2 )
            // InternalSpec.g:798:3: rule__OpenCommand__Alternatives_2
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
    // InternalSpec.g:807:1: rule__ClickCommand__Group__0 : rule__ClickCommand__Group__0__Impl rule__ClickCommand__Group__1 ;
    public final void rule__ClickCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:811:1: ( rule__ClickCommand__Group__0__Impl rule__ClickCommand__Group__1 )
            // InternalSpec.g:812:2: rule__ClickCommand__Group__0__Impl rule__ClickCommand__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSpec.g:819:1: rule__ClickCommand__Group__0__Impl : ( ( rule__ClickCommand__NameAssignment_0 ) ) ;
    public final void rule__ClickCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:823:1: ( ( ( rule__ClickCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:824:1: ( ( rule__ClickCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:824:1: ( ( rule__ClickCommand__NameAssignment_0 ) )
            // InternalSpec.g:825:2: ( rule__ClickCommand__NameAssignment_0 )
            {
             before(grammarAccess.getClickCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:826:2: ( rule__ClickCommand__NameAssignment_0 )
            // InternalSpec.g:826:3: rule__ClickCommand__NameAssignment_0
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
    // InternalSpec.g:834:1: rule__ClickCommand__Group__1 : rule__ClickCommand__Group__1__Impl ;
    public final void rule__ClickCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:838:1: ( rule__ClickCommand__Group__1__Impl )
            // InternalSpec.g:839:2: rule__ClickCommand__Group__1__Impl
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
    // InternalSpec.g:845:1: rule__ClickCommand__Group__1__Impl : ( ( rule__ClickCommand__Alternatives_1 )? ) ;
    public final void rule__ClickCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:849:1: ( ( ( rule__ClickCommand__Alternatives_1 )? ) )
            // InternalSpec.g:850:1: ( ( rule__ClickCommand__Alternatives_1 )? )
            {
            // InternalSpec.g:850:1: ( ( rule__ClickCommand__Alternatives_1 )? )
            // InternalSpec.g:851:2: ( rule__ClickCommand__Alternatives_1 )?
            {
             before(grammarAccess.getClickCommandAccess().getAlternatives_1()); 
            // InternalSpec.g:852:2: ( rule__ClickCommand__Alternatives_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=24 && LA13_0<=25)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSpec.g:852:3: rule__ClickCommand__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClickCommand__Alternatives_1();

                    state._fsp--;


                    }
                    break;

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
    // InternalSpec.g:861:1: rule__ClickCommand__Group_1_0__0 : rule__ClickCommand__Group_1_0__0__Impl rule__ClickCommand__Group_1_0__1 ;
    public final void rule__ClickCommand__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:865:1: ( rule__ClickCommand__Group_1_0__0__Impl rule__ClickCommand__Group_1_0__1 )
            // InternalSpec.g:866:2: rule__ClickCommand__Group_1_0__0__Impl rule__ClickCommand__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSpec.g:873:1: rule__ClickCommand__Group_1_0__0__Impl : ( 'on' ) ;
    public final void rule__ClickCommand__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:877:1: ( ( 'on' ) )
            // InternalSpec.g:878:1: ( 'on' )
            {
            // InternalSpec.g:878:1: ( 'on' )
            // InternalSpec.g:879:2: 'on'
            {
             before(grammarAccess.getClickCommandAccess().getOnKeyword_1_0_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSpec.g:888:1: rule__ClickCommand__Group_1_0__1 : rule__ClickCommand__Group_1_0__1__Impl ;
    public final void rule__ClickCommand__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:892:1: ( rule__ClickCommand__Group_1_0__1__Impl )
            // InternalSpec.g:893:2: rule__ClickCommand__Group_1_0__1__Impl
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
    // InternalSpec.g:899:1: rule__ClickCommand__Group_1_0__1__Impl : ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) ) ;
    public final void rule__ClickCommand__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:903:1: ( ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) ) )
            // InternalSpec.g:904:1: ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) )
            {
            // InternalSpec.g:904:1: ( ( rule__ClickCommand__SelectorAssignment_1_0_1 ) )
            // InternalSpec.g:905:2: ( rule__ClickCommand__SelectorAssignment_1_0_1 )
            {
             before(grammarAccess.getClickCommandAccess().getSelectorAssignment_1_0_1()); 
            // InternalSpec.g:906:2: ( rule__ClickCommand__SelectorAssignment_1_0_1 )
            // InternalSpec.g:906:3: rule__ClickCommand__SelectorAssignment_1_0_1
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
    // InternalSpec.g:915:1: rule__ClickCommand__Group_1_1__0 : rule__ClickCommand__Group_1_1__0__Impl rule__ClickCommand__Group_1_1__1 ;
    public final void rule__ClickCommand__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:919:1: ( rule__ClickCommand__Group_1_1__0__Impl rule__ClickCommand__Group_1_1__1 )
            // InternalSpec.g:920:2: rule__ClickCommand__Group_1_1__0__Impl rule__ClickCommand__Group_1_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSpec.g:927:1: rule__ClickCommand__Group_1_1__0__Impl : ( 'at' ) ;
    public final void rule__ClickCommand__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:931:1: ( ( 'at' ) )
            // InternalSpec.g:932:1: ( 'at' )
            {
            // InternalSpec.g:932:1: ( 'at' )
            // InternalSpec.g:933:2: 'at'
            {
             before(grammarAccess.getClickCommandAccess().getAtKeyword_1_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSpec.g:942:1: rule__ClickCommand__Group_1_1__1 : rule__ClickCommand__Group_1_1__1__Impl ;
    public final void rule__ClickCommand__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:946:1: ( rule__ClickCommand__Group_1_1__1__Impl )
            // InternalSpec.g:947:2: rule__ClickCommand__Group_1_1__1__Impl
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
    // InternalSpec.g:953:1: rule__ClickCommand__Group_1_1__1__Impl : ( ( rule__ClickCommand__PointAssignment_1_1_1 ) ) ;
    public final void rule__ClickCommand__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:957:1: ( ( ( rule__ClickCommand__PointAssignment_1_1_1 ) ) )
            // InternalSpec.g:958:1: ( ( rule__ClickCommand__PointAssignment_1_1_1 ) )
            {
            // InternalSpec.g:958:1: ( ( rule__ClickCommand__PointAssignment_1_1_1 ) )
            // InternalSpec.g:959:2: ( rule__ClickCommand__PointAssignment_1_1_1 )
            {
             before(grammarAccess.getClickCommandAccess().getPointAssignment_1_1_1()); 
            // InternalSpec.g:960:2: ( rule__ClickCommand__PointAssignment_1_1_1 )
            // InternalSpec.g:960:3: rule__ClickCommand__PointAssignment_1_1_1
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
    // InternalSpec.g:969:1: rule__SelectCommand__Group_0__0 : rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1 ;
    public final void rule__SelectCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:973:1: ( rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1 )
            // InternalSpec.g:974:2: rule__SelectCommand__Group_0__0__Impl rule__SelectCommand__Group_0__1
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
    // InternalSpec.g:981:1: rule__SelectCommand__Group_0__0__Impl : ( ( rule__SelectCommand__NameAssignment_0_0 ) ) ;
    public final void rule__SelectCommand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:985:1: ( ( ( rule__SelectCommand__NameAssignment_0_0 ) ) )
            // InternalSpec.g:986:1: ( ( rule__SelectCommand__NameAssignment_0_0 ) )
            {
            // InternalSpec.g:986:1: ( ( rule__SelectCommand__NameAssignment_0_0 ) )
            // InternalSpec.g:987:2: ( rule__SelectCommand__NameAssignment_0_0 )
            {
             before(grammarAccess.getSelectCommandAccess().getNameAssignment_0_0()); 
            // InternalSpec.g:988:2: ( rule__SelectCommand__NameAssignment_0_0 )
            // InternalSpec.g:988:3: rule__SelectCommand__NameAssignment_0_0
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
    // InternalSpec.g:996:1: rule__SelectCommand__Group_0__1 : rule__SelectCommand__Group_0__1__Impl ;
    public final void rule__SelectCommand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1000:1: ( rule__SelectCommand__Group_0__1__Impl )
            // InternalSpec.g:1001:2: rule__SelectCommand__Group_0__1__Impl
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
    // InternalSpec.g:1007:1: rule__SelectCommand__Group_0__1__Impl : ( ( rule__SelectCommand__ValueAssignment_0_1 ) ) ;
    public final void rule__SelectCommand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1011:1: ( ( ( rule__SelectCommand__ValueAssignment_0_1 ) ) )
            // InternalSpec.g:1012:1: ( ( rule__SelectCommand__ValueAssignment_0_1 ) )
            {
            // InternalSpec.g:1012:1: ( ( rule__SelectCommand__ValueAssignment_0_1 ) )
            // InternalSpec.g:1013:2: ( rule__SelectCommand__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSelectCommandAccess().getValueAssignment_0_1()); 
            // InternalSpec.g:1014:2: ( rule__SelectCommand__ValueAssignment_0_1 )
            // InternalSpec.g:1014:3: rule__SelectCommand__ValueAssignment_0_1
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
    // InternalSpec.g:1023:1: rule__SelectCommand__Group_1__0 : rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1 ;
    public final void rule__SelectCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1027:1: ( rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1 )
            // InternalSpec.g:1028:2: rule__SelectCommand__Group_1__0__Impl rule__SelectCommand__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSpec.g:1035:1: rule__SelectCommand__Group_1__0__Impl : ( ( rule__SelectCommand__NameAssignment_1_0 ) ) ;
    public final void rule__SelectCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1039:1: ( ( ( rule__SelectCommand__NameAssignment_1_0 ) ) )
            // InternalSpec.g:1040:1: ( ( rule__SelectCommand__NameAssignment_1_0 ) )
            {
            // InternalSpec.g:1040:1: ( ( rule__SelectCommand__NameAssignment_1_0 ) )
            // InternalSpec.g:1041:2: ( rule__SelectCommand__NameAssignment_1_0 )
            {
             before(grammarAccess.getSelectCommandAccess().getNameAssignment_1_0()); 
            // InternalSpec.g:1042:2: ( rule__SelectCommand__NameAssignment_1_0 )
            // InternalSpec.g:1042:3: rule__SelectCommand__NameAssignment_1_0
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
    // InternalSpec.g:1050:1: rule__SelectCommand__Group_1__1 : rule__SelectCommand__Group_1__1__Impl rule__SelectCommand__Group_1__2 ;
    public final void rule__SelectCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1054:1: ( rule__SelectCommand__Group_1__1__Impl rule__SelectCommand__Group_1__2 )
            // InternalSpec.g:1055:2: rule__SelectCommand__Group_1__1__Impl rule__SelectCommand__Group_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSpec.g:1062:1: rule__SelectCommand__Group_1__1__Impl : ( ( 'visible' )? ) ;
    public final void rule__SelectCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1066:1: ( ( ( 'visible' )? ) )
            // InternalSpec.g:1067:1: ( ( 'visible' )? )
            {
            // InternalSpec.g:1067:1: ( ( 'visible' )? )
            // InternalSpec.g:1068:2: ( 'visible' )?
            {
             before(grammarAccess.getSelectCommandAccess().getVisibleKeyword_1_1()); 
            // InternalSpec.g:1069:2: ( 'visible' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpec.g:1069:3: 'visible'
                    {
                    match(input,26,FOLLOW_2); 

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
    // InternalSpec.g:1077:1: rule__SelectCommand__Group_1__2 : rule__SelectCommand__Group_1__2__Impl ;
    public final void rule__SelectCommand__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1081:1: ( rule__SelectCommand__Group_1__2__Impl )
            // InternalSpec.g:1082:2: rule__SelectCommand__Group_1__2__Impl
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
    // InternalSpec.g:1088:1: rule__SelectCommand__Group_1__2__Impl : ( ( rule__SelectCommand__ValueAssignment_1_2 ) ) ;
    public final void rule__SelectCommand__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1092:1: ( ( ( rule__SelectCommand__ValueAssignment_1_2 ) ) )
            // InternalSpec.g:1093:1: ( ( rule__SelectCommand__ValueAssignment_1_2 ) )
            {
            // InternalSpec.g:1093:1: ( ( rule__SelectCommand__ValueAssignment_1_2 ) )
            // InternalSpec.g:1094:2: ( rule__SelectCommand__ValueAssignment_1_2 )
            {
             before(grammarAccess.getSelectCommandAccess().getValueAssignment_1_2()); 
            // InternalSpec.g:1095:2: ( rule__SelectCommand__ValueAssignment_1_2 )
            // InternalSpec.g:1095:3: rule__SelectCommand__ValueAssignment_1_2
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
    // InternalSpec.g:1104:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1108:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalSpec.g:1109:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSpec.g:1116:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__TypeAssignment_0 )? ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1120:1: ( ( ( rule__Selector__TypeAssignment_0 )? ) )
            // InternalSpec.g:1121:1: ( ( rule__Selector__TypeAssignment_0 )? )
            {
            // InternalSpec.g:1121:1: ( ( rule__Selector__TypeAssignment_0 )? )
            // InternalSpec.g:1122:2: ( rule__Selector__TypeAssignment_0 )?
            {
             before(grammarAccess.getSelectorAccess().getTypeAssignment_0()); 
            // InternalSpec.g:1123:2: ( rule__Selector__TypeAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=14 && LA15_0<=18)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSpec.g:1123:3: rule__Selector__TypeAssignment_0
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
    // InternalSpec.g:1131:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1135:1: ( rule__Selector__Group__1__Impl )
            // InternalSpec.g:1136:2: rule__Selector__Group__1__Impl
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
    // InternalSpec.g:1142:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Alternatives_1 ) ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1146:1: ( ( ( rule__Selector__Alternatives_1 ) ) )
            // InternalSpec.g:1147:1: ( ( rule__Selector__Alternatives_1 ) )
            {
            // InternalSpec.g:1147:1: ( ( rule__Selector__Alternatives_1 ) )
            // InternalSpec.g:1148:2: ( rule__Selector__Alternatives_1 )
            {
             before(grammarAccess.getSelectorAccess().getAlternatives_1()); 
            // InternalSpec.g:1149:2: ( rule__Selector__Alternatives_1 )
            // InternalSpec.g:1149:3: rule__Selector__Alternatives_1
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
    // InternalSpec.g:1158:1: rule__PropertyCommand__Group__0 : rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1 ;
    public final void rule__PropertyCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1162:1: ( rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1 )
            // InternalSpec.g:1163:2: rule__PropertyCommand__Group__0__Impl rule__PropertyCommand__Group__1
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
    // InternalSpec.g:1170:1: rule__PropertyCommand__Group__0__Impl : ( ( rule__PropertyCommand__NameAssignment_0 ) ) ;
    public final void rule__PropertyCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1174:1: ( ( ( rule__PropertyCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:1175:1: ( ( rule__PropertyCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:1175:1: ( ( rule__PropertyCommand__NameAssignment_0 ) )
            // InternalSpec.g:1176:2: ( rule__PropertyCommand__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:1177:2: ( rule__PropertyCommand__NameAssignment_0 )
            // InternalSpec.g:1177:3: rule__PropertyCommand__NameAssignment_0
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
    // InternalSpec.g:1185:1: rule__PropertyCommand__Group__1 : rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2 ;
    public final void rule__PropertyCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1189:1: ( rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2 )
            // InternalSpec.g:1190:2: rule__PropertyCommand__Group__1__Impl rule__PropertyCommand__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSpec.g:1197:1: rule__PropertyCommand__Group__1__Impl : ( ( rule__PropertyCommand__PropAssignment_1 ) ) ;
    public final void rule__PropertyCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1201:1: ( ( ( rule__PropertyCommand__PropAssignment_1 ) ) )
            // InternalSpec.g:1202:1: ( ( rule__PropertyCommand__PropAssignment_1 ) )
            {
            // InternalSpec.g:1202:1: ( ( rule__PropertyCommand__PropAssignment_1 ) )
            // InternalSpec.g:1203:2: ( rule__PropertyCommand__PropAssignment_1 )
            {
             before(grammarAccess.getPropertyCommandAccess().getPropAssignment_1()); 
            // InternalSpec.g:1204:2: ( rule__PropertyCommand__PropAssignment_1 )
            // InternalSpec.g:1204:3: rule__PropertyCommand__PropAssignment_1
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
    // InternalSpec.g:1212:1: rule__PropertyCommand__Group__2 : rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3 ;
    public final void rule__PropertyCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1216:1: ( rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3 )
            // InternalSpec.g:1217:2: rule__PropertyCommand__Group__2__Impl rule__PropertyCommand__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSpec.g:1224:1: rule__PropertyCommand__Group__2__Impl : ( ( rule__PropertyCommand__CondAssignment_2 ) ) ;
    public final void rule__PropertyCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1228:1: ( ( ( rule__PropertyCommand__CondAssignment_2 ) ) )
            // InternalSpec.g:1229:1: ( ( rule__PropertyCommand__CondAssignment_2 ) )
            {
            // InternalSpec.g:1229:1: ( ( rule__PropertyCommand__CondAssignment_2 ) )
            // InternalSpec.g:1230:2: ( rule__PropertyCommand__CondAssignment_2 )
            {
             before(grammarAccess.getPropertyCommandAccess().getCondAssignment_2()); 
            // InternalSpec.g:1231:2: ( rule__PropertyCommand__CondAssignment_2 )
            // InternalSpec.g:1231:3: rule__PropertyCommand__CondAssignment_2
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
    // InternalSpec.g:1239:1: rule__PropertyCommand__Group__3 : rule__PropertyCommand__Group__3__Impl ;
    public final void rule__PropertyCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1243:1: ( rule__PropertyCommand__Group__3__Impl )
            // InternalSpec.g:1244:2: rule__PropertyCommand__Group__3__Impl
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
    // InternalSpec.g:1250:1: rule__PropertyCommand__Group__3__Impl : ( ( rule__PropertyCommand__Alternatives_3 ) ) ;
    public final void rule__PropertyCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1254:1: ( ( ( rule__PropertyCommand__Alternatives_3 ) ) )
            // InternalSpec.g:1255:1: ( ( rule__PropertyCommand__Alternatives_3 ) )
            {
            // InternalSpec.g:1255:1: ( ( rule__PropertyCommand__Alternatives_3 ) )
            // InternalSpec.g:1256:2: ( rule__PropertyCommand__Alternatives_3 )
            {
             before(grammarAccess.getPropertyCommandAccess().getAlternatives_3()); 
            // InternalSpec.g:1257:2: ( rule__PropertyCommand__Alternatives_3 )
            // InternalSpec.g:1257:3: rule__PropertyCommand__Alternatives_3
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
    // InternalSpec.g:1266:1: rule__TypeCommand__Group__0 : rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1 ;
    public final void rule__TypeCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1270:1: ( rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1 )
            // InternalSpec.g:1271:2: rule__TypeCommand__Group__0__Impl rule__TypeCommand__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSpec.g:1278:1: rule__TypeCommand__Group__0__Impl : ( ( rule__TypeCommand__NameAssignment_0 ) ) ;
    public final void rule__TypeCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1282:1: ( ( ( rule__TypeCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:1283:1: ( ( rule__TypeCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:1283:1: ( ( rule__TypeCommand__NameAssignment_0 ) )
            // InternalSpec.g:1284:2: ( rule__TypeCommand__NameAssignment_0 )
            {
             before(grammarAccess.getTypeCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:1285:2: ( rule__TypeCommand__NameAssignment_0 )
            // InternalSpec.g:1285:3: rule__TypeCommand__NameAssignment_0
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
    // InternalSpec.g:1293:1: rule__TypeCommand__Group__1 : rule__TypeCommand__Group__1__Impl ;
    public final void rule__TypeCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1297:1: ( rule__TypeCommand__Group__1__Impl )
            // InternalSpec.g:1298:2: rule__TypeCommand__Group__1__Impl
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
    // InternalSpec.g:1304:1: rule__TypeCommand__Group__1__Impl : ( ( rule__TypeCommand__Alternatives_1 ) ) ;
    public final void rule__TypeCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1308:1: ( ( ( rule__TypeCommand__Alternatives_1 ) ) )
            // InternalSpec.g:1309:1: ( ( rule__TypeCommand__Alternatives_1 ) )
            {
            // InternalSpec.g:1309:1: ( ( rule__TypeCommand__Alternatives_1 ) )
            // InternalSpec.g:1310:2: ( rule__TypeCommand__Alternatives_1 )
            {
             before(grammarAccess.getTypeCommandAccess().getAlternatives_1()); 
            // InternalSpec.g:1311:2: ( rule__TypeCommand__Alternatives_1 )
            // InternalSpec.g:1311:3: rule__TypeCommand__Alternatives_1
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
    // InternalSpec.g:1320:1: rule__SleepCommand__Group__0 : rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1 ;
    public final void rule__SleepCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1324:1: ( rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1 )
            // InternalSpec.g:1325:2: rule__SleepCommand__Group__0__Impl rule__SleepCommand__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSpec.g:1332:1: rule__SleepCommand__Group__0__Impl : ( ( rule__SleepCommand__NameAssignment_0 ) ) ;
    public final void rule__SleepCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1336:1: ( ( ( rule__SleepCommand__NameAssignment_0 ) ) )
            // InternalSpec.g:1337:1: ( ( rule__SleepCommand__NameAssignment_0 ) )
            {
            // InternalSpec.g:1337:1: ( ( rule__SleepCommand__NameAssignment_0 ) )
            // InternalSpec.g:1338:2: ( rule__SleepCommand__NameAssignment_0 )
            {
             before(grammarAccess.getSleepCommandAccess().getNameAssignment_0()); 
            // InternalSpec.g:1339:2: ( rule__SleepCommand__NameAssignment_0 )
            // InternalSpec.g:1339:3: rule__SleepCommand__NameAssignment_0
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
    // InternalSpec.g:1347:1: rule__SleepCommand__Group__1 : rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2 ;
    public final void rule__SleepCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1351:1: ( rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2 )
            // InternalSpec.g:1352:2: rule__SleepCommand__Group__1__Impl rule__SleepCommand__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalSpec.g:1359:1: rule__SleepCommand__Group__1__Impl : ( 'for' ) ;
    public final void rule__SleepCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1363:1: ( ( 'for' ) )
            // InternalSpec.g:1364:1: ( 'for' )
            {
            // InternalSpec.g:1364:1: ( 'for' )
            // InternalSpec.g:1365:2: 'for'
            {
             before(grammarAccess.getSleepCommandAccess().getForKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSpec.g:1374:1: rule__SleepCommand__Group__2 : rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3 ;
    public final void rule__SleepCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1378:1: ( rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3 )
            // InternalSpec.g:1379:2: rule__SleepCommand__Group__2__Impl rule__SleepCommand__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSpec.g:1386:1: rule__SleepCommand__Group__2__Impl : ( ( rule__SleepCommand__TimeAssignment_2 ) ) ;
    public final void rule__SleepCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1390:1: ( ( ( rule__SleepCommand__TimeAssignment_2 ) ) )
            // InternalSpec.g:1391:1: ( ( rule__SleepCommand__TimeAssignment_2 ) )
            {
            // InternalSpec.g:1391:1: ( ( rule__SleepCommand__TimeAssignment_2 ) )
            // InternalSpec.g:1392:2: ( rule__SleepCommand__TimeAssignment_2 )
            {
             before(grammarAccess.getSleepCommandAccess().getTimeAssignment_2()); 
            // InternalSpec.g:1393:2: ( rule__SleepCommand__TimeAssignment_2 )
            // InternalSpec.g:1393:3: rule__SleepCommand__TimeAssignment_2
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
    // InternalSpec.g:1401:1: rule__SleepCommand__Group__3 : rule__SleepCommand__Group__3__Impl ;
    public final void rule__SleepCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1405:1: ( rule__SleepCommand__Group__3__Impl )
            // InternalSpec.g:1406:2: rule__SleepCommand__Group__3__Impl
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
    // InternalSpec.g:1412:1: rule__SleepCommand__Group__3__Impl : ( ( rule__SleepCommand__Alternatives_3 ) ) ;
    public final void rule__SleepCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1416:1: ( ( ( rule__SleepCommand__Alternatives_3 ) ) )
            // InternalSpec.g:1417:1: ( ( rule__SleepCommand__Alternatives_3 ) )
            {
            // InternalSpec.g:1417:1: ( ( rule__SleepCommand__Alternatives_3 ) )
            // InternalSpec.g:1418:2: ( rule__SleepCommand__Alternatives_3 )
            {
             before(grammarAccess.getSleepCommandAccess().getAlternatives_3()); 
            // InternalSpec.g:1419:2: ( rule__SleepCommand__Alternatives_3 )
            // InternalSpec.g:1419:3: rule__SleepCommand__Alternatives_3
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
    // InternalSpec.g:1428:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1432:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalSpec.g:1433:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSpec.g:1440:1: rule__Point__Group__0__Impl : ( '{' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1444:1: ( ( '{' ) )
            // InternalSpec.g:1445:1: ( '{' )
            {
            // InternalSpec.g:1445:1: ( '{' )
            // InternalSpec.g:1446:2: '{'
            {
             before(grammarAccess.getPointAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSpec.g:1455:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1459:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalSpec.g:1460:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSpec.g:1467:1: rule__Point__Group__1__Impl : ( ( rule__Point__XAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1471:1: ( ( ( rule__Point__XAssignment_1 ) ) )
            // InternalSpec.g:1472:1: ( ( rule__Point__XAssignment_1 ) )
            {
            // InternalSpec.g:1472:1: ( ( rule__Point__XAssignment_1 ) )
            // InternalSpec.g:1473:2: ( rule__Point__XAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_1()); 
            // InternalSpec.g:1474:2: ( rule__Point__XAssignment_1 )
            // InternalSpec.g:1474:3: rule__Point__XAssignment_1
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
    // InternalSpec.g:1482:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1486:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalSpec.g:1487:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalSpec.g:1494:1: rule__Point__Group__2__Impl : ( ',' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1498:1: ( ( ',' ) )
            // InternalSpec.g:1499:1: ( ',' )
            {
            // InternalSpec.g:1499:1: ( ',' )
            // InternalSpec.g:1500:2: ','
            {
             before(grammarAccess.getPointAccess().getCommaKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSpec.g:1509:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1513:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // InternalSpec.g:1514:2: rule__Point__Group__3__Impl rule__Point__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalSpec.g:1521:1: rule__Point__Group__3__Impl : ( ( rule__Point__YAssignment_3 ) ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1525:1: ( ( ( rule__Point__YAssignment_3 ) ) )
            // InternalSpec.g:1526:1: ( ( rule__Point__YAssignment_3 ) )
            {
            // InternalSpec.g:1526:1: ( ( rule__Point__YAssignment_3 ) )
            // InternalSpec.g:1527:2: ( rule__Point__YAssignment_3 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_3()); 
            // InternalSpec.g:1528:2: ( rule__Point__YAssignment_3 )
            // InternalSpec.g:1528:3: rule__Point__YAssignment_3
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
    // InternalSpec.g:1536:1: rule__Point__Group__4 : rule__Point__Group__4__Impl ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1540:1: ( rule__Point__Group__4__Impl )
            // InternalSpec.g:1541:2: rule__Point__Group__4__Impl
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
    // InternalSpec.g:1547:1: rule__Point__Group__4__Impl : ( '}' ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1551:1: ( ( '}' ) )
            // InternalSpec.g:1552:1: ( '}' )
            {
            // InternalSpec.g:1552:1: ( '}' )
            // InternalSpec.g:1553:2: '}'
            {
             before(grammarAccess.getPointAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSpec.g:1563:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1567:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalSpec.g:1568:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSpec.g:1575:1: rule__VarDeclaration__Group__0__Impl : ( 'Store' ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1579:1: ( ( 'Store' ) )
            // InternalSpec.g:1580:1: ( 'Store' )
            {
            // InternalSpec.g:1580:1: ( 'Store' )
            // InternalSpec.g:1581:2: 'Store'
            {
             before(grammarAccess.getVarDeclarationAccess().getStoreKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSpec.g:1590:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1594:1: ( rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 )
            // InternalSpec.g:1595:2: rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalSpec.g:1602:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1606:1: ( ( ( rule__VarDeclaration__NameAssignment_1 ) ) )
            // InternalSpec.g:1607:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            {
            // InternalSpec.g:1607:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            // InternalSpec.g:1608:2: ( rule__VarDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 
            // InternalSpec.g:1609:2: ( rule__VarDeclaration__NameAssignment_1 )
            // InternalSpec.g:1609:3: rule__VarDeclaration__NameAssignment_1
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
    // InternalSpec.g:1617:1: rule__VarDeclaration__Group__2 : rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 ;
    public final void rule__VarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1621:1: ( rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 )
            // InternalSpec.g:1622:2: rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalSpec.g:1629:1: rule__VarDeclaration__Group__2__Impl : ( 'as' ) ;
    public final void rule__VarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1633:1: ( ( 'as' ) )
            // InternalSpec.g:1634:1: ( 'as' )
            {
            // InternalSpec.g:1634:1: ( 'as' )
            // InternalSpec.g:1635:2: 'as'
            {
             before(grammarAccess.getVarDeclarationAccess().getAsKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSpec.g:1644:1: rule__VarDeclaration__Group__3 : rule__VarDeclaration__Group__3__Impl ;
    public final void rule__VarDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1648:1: ( rule__VarDeclaration__Group__3__Impl )
            // InternalSpec.g:1649:2: rule__VarDeclaration__Group__3__Impl
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
    // InternalSpec.g:1655:1: rule__VarDeclaration__Group__3__Impl : ( ( rule__VarDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VarDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1659:1: ( ( ( rule__VarDeclaration__ValueAssignment_3 ) ) )
            // InternalSpec.g:1660:1: ( ( rule__VarDeclaration__ValueAssignment_3 ) )
            {
            // InternalSpec.g:1660:1: ( ( rule__VarDeclaration__ValueAssignment_3 ) )
            // InternalSpec.g:1661:2: ( rule__VarDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVarDeclarationAccess().getValueAssignment_3()); 
            // InternalSpec.g:1662:2: ( rule__VarDeclaration__ValueAssignment_3 )
            // InternalSpec.g:1662:3: rule__VarDeclaration__ValueAssignment_3
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
    // InternalSpec.g:1671:1: rule__Model__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1675:1: ( ( ruleCommand ) )
            // InternalSpec.g:1676:2: ( ruleCommand )
            {
            // InternalSpec.g:1676:2: ( ruleCommand )
            // InternalSpec.g:1677:3: ruleCommand
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


    // $ANTLR start "rule__Command__CustomAssignment_7"
    // InternalSpec.g:1686:1: rule__Command__CustomAssignment_7 : ( RULE_CUSTOM_COMMAND ) ;
    public final void rule__Command__CustomAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1690:1: ( ( RULE_CUSTOM_COMMAND ) )
            // InternalSpec.g:1691:2: ( RULE_CUSTOM_COMMAND )
            {
            // InternalSpec.g:1691:2: ( RULE_CUSTOM_COMMAND )
            // InternalSpec.g:1692:3: RULE_CUSTOM_COMMAND
            {
             before(grammarAccess.getCommandAccess().getCustomCUSTOM_COMMANDTerminalRuleCall_7_0()); 
            match(input,RULE_CUSTOM_COMMAND,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getCustomCUSTOM_COMMANDTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__CustomAssignment_7"


    // $ANTLR start "rule__OpenCommand__NameAssignment_1"
    // InternalSpec.g:1701:1: rule__OpenCommand__NameAssignment_1 : ( ( 'Open' ) ) ;
    public final void rule__OpenCommand__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1705:1: ( ( ( 'Open' ) ) )
            // InternalSpec.g:1706:2: ( ( 'Open' ) )
            {
            // InternalSpec.g:1706:2: ( ( 'Open' ) )
            // InternalSpec.g:1707:3: ( 'Open' )
            {
             before(grammarAccess.getOpenCommandAccess().getNameOpenKeyword_1_0()); 
            // InternalSpec.g:1708:3: ( 'Open' )
            // InternalSpec.g:1709:4: 'Open'
            {
             before(grammarAccess.getOpenCommandAccess().getNameOpenKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSpec.g:1720:1: rule__OpenCommand__ValAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__OpenCommand__ValAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1724:1: ( ( RULE_STRING ) )
            // InternalSpec.g:1725:2: ( RULE_STRING )
            {
            // InternalSpec.g:1725:2: ( RULE_STRING )
            // InternalSpec.g:1726:3: RULE_STRING
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
    // InternalSpec.g:1735:1: rule__OpenCommand__VarAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__OpenCommand__VarAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1739:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:1740:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:1740:2: ( ( RULE_ID ) )
            // InternalSpec.g:1741:3: ( RULE_ID )
            {
             before(grammarAccess.getOpenCommandAccess().getVarVarDeclarationCrossReference_2_1_0()); 
            // InternalSpec.g:1742:3: ( RULE_ID )
            // InternalSpec.g:1743:4: RULE_ID
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
    // InternalSpec.g:1754:1: rule__ClickCommand__NameAssignment_0 : ( ( 'Click' ) ) ;
    public final void rule__ClickCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1758:1: ( ( ( 'Click' ) ) )
            // InternalSpec.g:1759:2: ( ( 'Click' ) )
            {
            // InternalSpec.g:1759:2: ( ( 'Click' ) )
            // InternalSpec.g:1760:3: ( 'Click' )
            {
             before(grammarAccess.getClickCommandAccess().getNameClickKeyword_0_0()); 
            // InternalSpec.g:1761:3: ( 'Click' )
            // InternalSpec.g:1762:4: 'Click'
            {
             before(grammarAccess.getClickCommandAccess().getNameClickKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSpec.g:1773:1: rule__ClickCommand__SelectorAssignment_1_0_1 : ( ruleSelector ) ;
    public final void rule__ClickCommand__SelectorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1777:1: ( ( ruleSelector ) )
            // InternalSpec.g:1778:2: ( ruleSelector )
            {
            // InternalSpec.g:1778:2: ( ruleSelector )
            // InternalSpec.g:1779:3: ruleSelector
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
    // InternalSpec.g:1788:1: rule__ClickCommand__PointAssignment_1_1_1 : ( rulePoint ) ;
    public final void rule__ClickCommand__PointAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1792:1: ( ( rulePoint ) )
            // InternalSpec.g:1793:2: ( rulePoint )
            {
            // InternalSpec.g:1793:2: ( rulePoint )
            // InternalSpec.g:1794:3: rulePoint
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
    // InternalSpec.g:1803:1: rule__SelectCommand__NameAssignment_0_0 : ( ( 'Within' ) ) ;
    public final void rule__SelectCommand__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1807:1: ( ( ( 'Within' ) ) )
            // InternalSpec.g:1808:2: ( ( 'Within' ) )
            {
            // InternalSpec.g:1808:2: ( ( 'Within' ) )
            // InternalSpec.g:1809:3: ( 'Within' )
            {
             before(grammarAccess.getSelectCommandAccess().getNameWithinKeyword_0_0_0()); 
            // InternalSpec.g:1810:3: ( 'Within' )
            // InternalSpec.g:1811:4: 'Within'
            {
             before(grammarAccess.getSelectCommandAccess().getNameWithinKeyword_0_0_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSpec.g:1822:1: rule__SelectCommand__ValueAssignment_0_1 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1826:1: ( ( ruleSelector ) )
            // InternalSpec.g:1827:2: ( ruleSelector )
            {
            // InternalSpec.g:1827:2: ( ruleSelector )
            // InternalSpec.g:1828:3: ruleSelector
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
    // InternalSpec.g:1837:1: rule__SelectCommand__NameAssignment_1_0 : ( ( 'Select' ) ) ;
    public final void rule__SelectCommand__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1841:1: ( ( ( 'Select' ) ) )
            // InternalSpec.g:1842:2: ( ( 'Select' ) )
            {
            // InternalSpec.g:1842:2: ( ( 'Select' ) )
            // InternalSpec.g:1843:3: ( 'Select' )
            {
             before(grammarAccess.getSelectCommandAccess().getNameSelectKeyword_1_0_0()); 
            // InternalSpec.g:1844:3: ( 'Select' )
            // InternalSpec.g:1845:4: 'Select'
            {
             before(grammarAccess.getSelectCommandAccess().getNameSelectKeyword_1_0_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSpec.g:1856:1: rule__SelectCommand__ValueAssignment_1_2 : ( ruleSelector ) ;
    public final void rule__SelectCommand__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1860:1: ( ( ruleSelector ) )
            // InternalSpec.g:1861:2: ( ruleSelector )
            {
            // InternalSpec.g:1861:2: ( ruleSelector )
            // InternalSpec.g:1862:3: ruleSelector
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
    // InternalSpec.g:1871:1: rule__Selector__TypeAssignment_0 : ( ruleElementType ) ;
    public final void rule__Selector__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1875:1: ( ( ruleElementType ) )
            // InternalSpec.g:1876:2: ( ruleElementType )
            {
            // InternalSpec.g:1876:2: ( ruleElementType )
            // InternalSpec.g:1877:3: ruleElementType
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
    // InternalSpec.g:1886:1: rule__Selector__VarAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Selector__VarAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1890:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:1891:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:1891:2: ( ( RULE_ID ) )
            // InternalSpec.g:1892:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectorAccess().getVarVarDeclarationCrossReference_1_0_0()); 
            // InternalSpec.g:1893:3: ( RULE_ID )
            // InternalSpec.g:1894:4: RULE_ID
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
    // InternalSpec.g:1905:1: rule__Selector__ValAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Selector__ValAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1909:1: ( ( RULE_STRING ) )
            // InternalSpec.g:1910:2: ( RULE_STRING )
            {
            // InternalSpec.g:1910:2: ( RULE_STRING )
            // InternalSpec.g:1911:3: RULE_STRING
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
    // InternalSpec.g:1920:1: rule__PropertyCommand__NameAssignment_0 : ( ( 'Property' ) ) ;
    public final void rule__PropertyCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1924:1: ( ( ( 'Property' ) ) )
            // InternalSpec.g:1925:2: ( ( 'Property' ) )
            {
            // InternalSpec.g:1925:2: ( ( 'Property' ) )
            // InternalSpec.g:1926:3: ( 'Property' )
            {
             before(grammarAccess.getPropertyCommandAccess().getNamePropertyKeyword_0_0()); 
            // InternalSpec.g:1927:3: ( 'Property' )
            // InternalSpec.g:1928:4: 'Property'
            {
             before(grammarAccess.getPropertyCommandAccess().getNamePropertyKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSpec.g:1939:1: rule__PropertyCommand__PropAssignment_1 : ( ruleProperty ) ;
    public final void rule__PropertyCommand__PropAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1943:1: ( ( ruleProperty ) )
            // InternalSpec.g:1944:2: ( ruleProperty )
            {
            // InternalSpec.g:1944:2: ( ruleProperty )
            // InternalSpec.g:1945:3: ruleProperty
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
    // InternalSpec.g:1954:1: rule__PropertyCommand__CondAssignment_2 : ( ruleCondition ) ;
    public final void rule__PropertyCommand__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1958:1: ( ( ruleCondition ) )
            // InternalSpec.g:1959:2: ( ruleCondition )
            {
            // InternalSpec.g:1959:2: ( ruleCondition )
            // InternalSpec.g:1960:3: ruleCondition
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
    // InternalSpec.g:1969:1: rule__PropertyCommand__ValAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__PropertyCommand__ValAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1973:1: ( ( RULE_STRING ) )
            // InternalSpec.g:1974:2: ( RULE_STRING )
            {
            // InternalSpec.g:1974:2: ( RULE_STRING )
            // InternalSpec.g:1975:3: RULE_STRING
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
    // InternalSpec.g:1984:1: rule__PropertyCommand__VarAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyCommand__VarAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1988:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:1989:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:1989:2: ( ( RULE_ID ) )
            // InternalSpec.g:1990:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyCommandAccess().getVarVarDeclarationCrossReference_3_1_0()); 
            // InternalSpec.g:1991:3: ( RULE_ID )
            // InternalSpec.g:1992:4: RULE_ID
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
    // InternalSpec.g:2003:1: rule__TypeCommand__NameAssignment_0 : ( ( 'Type' ) ) ;
    public final void rule__TypeCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2007:1: ( ( ( 'Type' ) ) )
            // InternalSpec.g:2008:2: ( ( 'Type' ) )
            {
            // InternalSpec.g:2008:2: ( ( 'Type' ) )
            // InternalSpec.g:2009:3: ( 'Type' )
            {
             before(grammarAccess.getTypeCommandAccess().getNameTypeKeyword_0_0()); 
            // InternalSpec.g:2010:3: ( 'Type' )
            // InternalSpec.g:2011:4: 'Type'
            {
             before(grammarAccess.getTypeCommandAccess().getNameTypeKeyword_0_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSpec.g:2022:1: rule__TypeCommand__StrAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__TypeCommand__StrAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2026:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2027:2: ( RULE_STRING )
            {
            // InternalSpec.g:2027:2: ( RULE_STRING )
            // InternalSpec.g:2028:3: RULE_STRING
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
    // InternalSpec.g:2037:1: rule__TypeCommand__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeCommand__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2041:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:2042:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:2042:2: ( ( RULE_ID ) )
            // InternalSpec.g:2043:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeCommandAccess().getVarVarDeclarationCrossReference_1_1_0()); 
            // InternalSpec.g:2044:3: ( RULE_ID )
            // InternalSpec.g:2045:4: RULE_ID
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
    // InternalSpec.g:2056:1: rule__SleepCommand__NameAssignment_0 : ( ( 'Sleep' ) ) ;
    public final void rule__SleepCommand__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2060:1: ( ( ( 'Sleep' ) ) )
            // InternalSpec.g:2061:2: ( ( 'Sleep' ) )
            {
            // InternalSpec.g:2061:2: ( ( 'Sleep' ) )
            // InternalSpec.g:2062:3: ( 'Sleep' )
            {
             before(grammarAccess.getSleepCommandAccess().getNameSleepKeyword_0_0()); 
            // InternalSpec.g:2063:3: ( 'Sleep' )
            // InternalSpec.g:2064:4: 'Sleep'
            {
             before(grammarAccess.getSleepCommandAccess().getNameSleepKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSpec.g:2075:1: rule__SleepCommand__TimeAssignment_2 : ( RULE_INT ) ;
    public final void rule__SleepCommand__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2079:1: ( ( RULE_INT ) )
            // InternalSpec.g:2080:2: ( RULE_INT )
            {
            // InternalSpec.g:2080:2: ( RULE_INT )
            // InternalSpec.g:2081:3: RULE_INT
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
    // InternalSpec.g:2090:1: rule__Point__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Point__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2094:1: ( ( RULE_INT ) )
            // InternalSpec.g:2095:2: ( RULE_INT )
            {
            // InternalSpec.g:2095:2: ( RULE_INT )
            // InternalSpec.g:2096:3: RULE_INT
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
    // InternalSpec.g:2105:1: rule__Point__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Point__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2109:1: ( ( RULE_INT ) )
            // InternalSpec.g:2110:2: ( RULE_INT )
            {
            // InternalSpec.g:2110:2: ( RULE_INT )
            // InternalSpec.g:2111:3: RULE_INT
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
    // InternalSpec.g:2120:1: rule__VarDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2124:1: ( ( RULE_ID ) )
            // InternalSpec.g:2125:2: ( RULE_ID )
            {
            // InternalSpec.g:2125:2: ( RULE_ID )
            // InternalSpec.g:2126:3: RULE_ID
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
    // InternalSpec.g:2135:1: rule__VarDeclaration__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__VarDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2139:1: ( ( RULE_STRING ) )
            // InternalSpec.g:2140:2: ( RULE_STRING )
            {
            // InternalSpec.g:2140:2: ( RULE_STRING )
            // InternalSpec.g:2141:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000FE80000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000007C0C0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000407C0C0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});

}
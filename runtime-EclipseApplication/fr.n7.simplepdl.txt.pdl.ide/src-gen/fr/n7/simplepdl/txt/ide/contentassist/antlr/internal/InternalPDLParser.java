package fr.n7.simplepdl.txt.ide.contentassist.antlr.internal;

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
import fr.n7.simplepdl.txt.services.PDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s2s'", "'f2s'", "'s2f'", "'f2f'", "'process'", "'{'", "'}'", "'ProcessElement'", "'wd'", "'ws'", "'from'", "'to'", "'note'", "'ressource'", "'needs'", "'of'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL.g"; }


    	private PDLGrammarAccess grammarAccess;

    	public void setGrammarAccess(PDLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProcess"
    // InternalPDL.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalPDL.g:54:1: ( ruleProcess EOF )
            // InternalPDL.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalPDL.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalPDL.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalPDL.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalPDL.g:69:3: ( rule__Process__Group__0 )
            // InternalPDL.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL.g:78:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // InternalPDL.g:79:1: ( ruleProcessElement EOF )
            // InternalPDL.g:80:1: ruleProcessElement EOF
            {
             before(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessElementRule()); 
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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL.g:87:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:91:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // InternalPDL.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            {
            // InternalPDL.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            // InternalPDL.g:93:3: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // InternalPDL.g:94:3: ( rule__ProcessElement__Alternatives )
            // InternalPDL.g:94:4: rule__ProcessElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleEString"
    // InternalPDL.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPDL.g:104:1: ( ruleEString EOF )
            // InternalPDL.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPDL.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalPDL.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalPDL.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalPDL.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalPDL.g:119:3: ( rule__EString__Alternatives )
            // InternalPDL.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleProcessElement_Impl"
    // InternalPDL.g:128:1: entryRuleProcessElement_Impl : ruleProcessElement_Impl EOF ;
    public final void entryRuleProcessElement_Impl() throws RecognitionException {
        try {
            // InternalPDL.g:129:1: ( ruleProcessElement_Impl EOF )
            // InternalPDL.g:130:1: ruleProcessElement_Impl EOF
            {
             before(grammarAccess.getProcessElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessElement_Impl();

            state._fsp--;

             after(grammarAccess.getProcessElement_ImplRule()); 
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
    // $ANTLR end "entryRuleProcessElement_Impl"


    // $ANTLR start "ruleProcessElement_Impl"
    // InternalPDL.g:137:1: ruleProcessElement_Impl : ( ( rule__ProcessElement_Impl__Group__0 ) ) ;
    public final void ruleProcessElement_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:141:2: ( ( ( rule__ProcessElement_Impl__Group__0 ) ) )
            // InternalPDL.g:142:2: ( ( rule__ProcessElement_Impl__Group__0 ) )
            {
            // InternalPDL.g:142:2: ( ( rule__ProcessElement_Impl__Group__0 ) )
            // InternalPDL.g:143:3: ( rule__ProcessElement_Impl__Group__0 )
            {
             before(grammarAccess.getProcessElement_ImplAccess().getGroup()); 
            // InternalPDL.g:144:3: ( rule__ProcessElement_Impl__Group__0 )
            // InternalPDL.g:144:4: rule__ProcessElement_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessElement_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessElement_Impl"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL.g:153:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalPDL.g:154:1: ( ruleWorkDefinition EOF )
            // InternalPDL.g:155:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL.g:162:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:166:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // InternalPDL.g:167:2: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // InternalPDL.g:167:2: ( ( rule__WorkDefinition__Group__0 ) )
            // InternalPDL.g:168:3: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // InternalPDL.g:169:3: ( rule__WorkDefinition__Group__0 )
            // InternalPDL.g:169:4: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL.g:178:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalPDL.g:179:1: ( ruleWorkSequence EOF )
            // InternalPDL.g:180:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL.g:187:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:191:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalPDL.g:192:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalPDL.g:192:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalPDL.g:193:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalPDL.g:194:3: ( rule__WorkSequence__Group__0 )
            // InternalPDL.g:194:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL.g:203:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // InternalPDL.g:204:1: ( ruleGuidance EOF )
            // InternalPDL.g:205:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL.g:212:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:216:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // InternalPDL.g:217:2: ( ( rule__Guidance__Group__0 ) )
            {
            // InternalPDL.g:217:2: ( ( rule__Guidance__Group__0 ) )
            // InternalPDL.g:218:3: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // InternalPDL.g:219:3: ( rule__Guidance__Group__0 )
            // InternalPDL.g:219:4: rule__Guidance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleRessource"
    // InternalPDL.g:228:1: entryRuleRessource : ruleRessource EOF ;
    public final void entryRuleRessource() throws RecognitionException {
        try {
            // InternalPDL.g:229:1: ( ruleRessource EOF )
            // InternalPDL.g:230:1: ruleRessource EOF
            {
             before(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            ruleRessource();

            state._fsp--;

             after(grammarAccess.getRessourceRule()); 
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
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalPDL.g:237:1: ruleRessource : ( ( rule__Ressource__Group__0 ) ) ;
    public final void ruleRessource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:241:2: ( ( ( rule__Ressource__Group__0 ) ) )
            // InternalPDL.g:242:2: ( ( rule__Ressource__Group__0 ) )
            {
            // InternalPDL.g:242:2: ( ( rule__Ressource__Group__0 ) )
            // InternalPDL.g:243:3: ( rule__Ressource__Group__0 )
            {
             before(grammarAccess.getRessourceAccess().getGroup()); 
            // InternalPDL.g:244:3: ( rule__Ressource__Group__0 )
            // InternalPDL.g:244:4: rule__Ressource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleUsefulRessource"
    // InternalPDL.g:253:1: entryRuleUsefulRessource : ruleUsefulRessource EOF ;
    public final void entryRuleUsefulRessource() throws RecognitionException {
        try {
            // InternalPDL.g:254:1: ( ruleUsefulRessource EOF )
            // InternalPDL.g:255:1: ruleUsefulRessource EOF
            {
             before(grammarAccess.getUsefulRessourceRule()); 
            pushFollow(FOLLOW_1);
            ruleUsefulRessource();

            state._fsp--;

             after(grammarAccess.getUsefulRessourceRule()); 
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
    // $ANTLR end "entryRuleUsefulRessource"


    // $ANTLR start "ruleUsefulRessource"
    // InternalPDL.g:262:1: ruleUsefulRessource : ( ( rule__UsefulRessource__Group__0 ) ) ;
    public final void ruleUsefulRessource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:266:2: ( ( ( rule__UsefulRessource__Group__0 ) ) )
            // InternalPDL.g:267:2: ( ( rule__UsefulRessource__Group__0 ) )
            {
            // InternalPDL.g:267:2: ( ( rule__UsefulRessource__Group__0 ) )
            // InternalPDL.g:268:3: ( rule__UsefulRessource__Group__0 )
            {
             before(grammarAccess.getUsefulRessourceAccess().getGroup()); 
            // InternalPDL.g:269:3: ( rule__UsefulRessource__Group__0 )
            // InternalPDL.g:269:4: rule__UsefulRessource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UsefulRessource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsefulRessourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUsefulRessource"


    // $ANTLR start "entryRuleEInt"
    // InternalPDL.g:278:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalPDL.g:279:1: ( ruleEInt EOF )
            // InternalPDL.g:280:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalPDL.g:287:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:291:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalPDL.g:292:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalPDL.g:292:2: ( ( rule__EInt__Group__0 ) )
            // InternalPDL.g:293:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalPDL.g:294:3: ( rule__EInt__Group__0 )
            // InternalPDL.g:294:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL.g:303:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:307:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalPDL.g:308:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalPDL.g:308:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalPDL.g:309:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalPDL.g:310:3: ( rule__WorkSequenceType__Alternatives )
            // InternalPDL.g:310:4: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // InternalPDL.g:318:1: rule__ProcessElement__Alternatives : ( ( ruleProcessElement_Impl ) | ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessource ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:322:1: ( ( ruleProcessElement_Impl ) | ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessource ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            case 24:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPDL.g:323:2: ( ruleProcessElement_Impl )
                    {
                    // InternalPDL.g:323:2: ( ruleProcessElement_Impl )
                    // InternalPDL.g:324:3: ruleProcessElement_Impl
                    {
                     before(grammarAccess.getProcessElementAccess().getProcessElement_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleProcessElement_Impl();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getProcessElement_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:329:2: ( ruleWorkDefinition )
                    {
                    // InternalPDL.g:329:2: ( ruleWorkDefinition )
                    // InternalPDL.g:330:3: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:335:2: ( ruleWorkSequence )
                    {
                    // InternalPDL.g:335:2: ( ruleWorkSequence )
                    // InternalPDL.g:336:3: ruleWorkSequence
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkSequence();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:341:2: ( ruleGuidance )
                    {
                    // InternalPDL.g:341:2: ( ruleGuidance )
                    // InternalPDL.g:342:3: ruleGuidance
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPDL.g:347:2: ( ruleRessource )
                    {
                    // InternalPDL.g:347:2: ( ruleRessource )
                    // InternalPDL.g:348:3: ruleRessource
                    {
                     before(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRessource();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_4()); 

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
    // $ANTLR end "rule__ProcessElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPDL.g:357:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:361:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPDL.g:362:2: ( RULE_STRING )
                    {
                    // InternalPDL.g:362:2: ( RULE_STRING )
                    // InternalPDL.g:363:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:368:2: ( RULE_ID )
                    {
                    // InternalPDL.g:368:2: ( RULE_ID )
                    // InternalPDL.g:369:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalPDL.g:378:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:382:1: ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPDL.g:383:2: ( ( 's2s' ) )
                    {
                    // InternalPDL.g:383:2: ( ( 's2s' ) )
                    // InternalPDL.g:384:3: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 
                    // InternalPDL.g:385:3: ( 's2s' )
                    // InternalPDL.g:385:4: 's2s'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:389:2: ( ( 'f2s' ) )
                    {
                    // InternalPDL.g:389:2: ( ( 'f2s' ) )
                    // InternalPDL.g:390:3: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 
                    // InternalPDL.g:391:3: ( 'f2s' )
                    // InternalPDL.g:391:4: 'f2s'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:395:2: ( ( 's2f' ) )
                    {
                    // InternalPDL.g:395:2: ( ( 's2f' ) )
                    // InternalPDL.g:396:3: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 
                    // InternalPDL.g:397:3: ( 's2f' )
                    // InternalPDL.g:397:4: 's2f'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:401:2: ( ( 'f2f' ) )
                    {
                    // InternalPDL.g:401:2: ( ( 'f2f' ) )
                    // InternalPDL.g:402:3: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 
                    // InternalPDL.g:403:3: ( 'f2f' )
                    // InternalPDL.g:403:4: 'f2f'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalPDL.g:411:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:415:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDL.g:416:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalPDL.g:423:1: rule__Process__Group__0__Impl : ( () ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:427:1: ( ( () ) )
            // InternalPDL.g:428:1: ( () )
            {
            // InternalPDL.g:428:1: ( () )
            // InternalPDL.g:429:2: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0()); 
            // InternalPDL.g:430:2: ()
            // InternalPDL.g:430:3: 
            {
            }

             after(grammarAccess.getProcessAccess().getProcessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalPDL.g:438:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:442:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDL.g:443:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalPDL.g:450:1: rule__Process__Group__1__Impl : ( 'process' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:454:1: ( ( 'process' ) )
            // InternalPDL.g:455:1: ( 'process' )
            {
            // InternalPDL.g:455:1: ( 'process' )
            // InternalPDL.g:456:2: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalPDL.g:465:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:469:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDL.g:470:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalPDL.g:477:1: rule__Process__Group__2__Impl : ( ( rule__Process__NameAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:481:1: ( ( ( rule__Process__NameAssignment_2 ) ) )
            // InternalPDL.g:482:1: ( ( rule__Process__NameAssignment_2 ) )
            {
            // InternalPDL.g:482:1: ( ( rule__Process__NameAssignment_2 ) )
            // InternalPDL.g:483:2: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // InternalPDL.g:484:2: ( rule__Process__NameAssignment_2 )
            // InternalPDL.g:484:3: rule__Process__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalPDL.g:492:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:496:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDL.g:497:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalPDL.g:504:1: rule__Process__Group__3__Impl : ( '{' ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:508:1: ( ( '{' ) )
            // InternalPDL.g:509:1: ( '{' )
            {
            // InternalPDL.g:509:1: ( '{' )
            // InternalPDL.g:510:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalPDL.g:519:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:523:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalPDL.g:524:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalPDL.g:531:1: rule__Process__Group__4__Impl : ( ( rule__Process__ProcessElementsAssignment_4 )* ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:535:1: ( ( ( rule__Process__ProcessElementsAssignment_4 )* ) )
            // InternalPDL.g:536:1: ( ( rule__Process__ProcessElementsAssignment_4 )* )
            {
            // InternalPDL.g:536:1: ( ( rule__Process__ProcessElementsAssignment_4 )* )
            // InternalPDL.g:537:2: ( rule__Process__ProcessElementsAssignment_4 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_4()); 
            // InternalPDL.g:538:2: ( rule__Process__ProcessElementsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=18 && LA4_0<=20)||(LA4_0>=23 && LA4_0<=24)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPDL.g:538:3: rule__Process__ProcessElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__ProcessElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalPDL.g:546:1: rule__Process__Group__5 : rule__Process__Group__5__Impl ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:550:1: ( rule__Process__Group__5__Impl )
            // InternalPDL.g:551:2: rule__Process__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalPDL.g:557:1: rule__Process__Group__5__Impl : ( '}' ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:561:1: ( ( '}' ) )
            // InternalPDL.g:562:1: ( '}' )
            {
            // InternalPDL.g:562:1: ( '}' )
            // InternalPDL.g:563:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__ProcessElement_Impl__Group__0"
    // InternalPDL.g:573:1: rule__ProcessElement_Impl__Group__0 : rule__ProcessElement_Impl__Group__0__Impl rule__ProcessElement_Impl__Group__1 ;
    public final void rule__ProcessElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:577:1: ( rule__ProcessElement_Impl__Group__0__Impl rule__ProcessElement_Impl__Group__1 )
            // InternalPDL.g:578:2: rule__ProcessElement_Impl__Group__0__Impl rule__ProcessElement_Impl__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ProcessElement_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessElement_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessElement_Impl__Group__0"


    // $ANTLR start "rule__ProcessElement_Impl__Group__0__Impl"
    // InternalPDL.g:585:1: rule__ProcessElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ProcessElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:589:1: ( ( () ) )
            // InternalPDL.g:590:1: ( () )
            {
            // InternalPDL.g:590:1: ( () )
            // InternalPDL.g:591:2: ()
            {
             before(grammarAccess.getProcessElement_ImplAccess().getProcessElementAction_0()); 
            // InternalPDL.g:592:2: ()
            // InternalPDL.g:592:3: 
            {
            }

             after(grammarAccess.getProcessElement_ImplAccess().getProcessElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessElement_Impl__Group__0__Impl"


    // $ANTLR start "rule__ProcessElement_Impl__Group__1"
    // InternalPDL.g:600:1: rule__ProcessElement_Impl__Group__1 : rule__ProcessElement_Impl__Group__1__Impl ;
    public final void rule__ProcessElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:604:1: ( rule__ProcessElement_Impl__Group__1__Impl )
            // InternalPDL.g:605:2: rule__ProcessElement_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessElement_Impl__Group__1"


    // $ANTLR start "rule__ProcessElement_Impl__Group__1__Impl"
    // InternalPDL.g:611:1: rule__ProcessElement_Impl__Group__1__Impl : ( 'ProcessElement' ) ;
    public final void rule__ProcessElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:615:1: ( ( 'ProcessElement' ) )
            // InternalPDL.g:616:1: ( 'ProcessElement' )
            {
            // InternalPDL.g:616:1: ( 'ProcessElement' )
            // InternalPDL.g:617:2: 'ProcessElement'
            {
             before(grammarAccess.getProcessElement_ImplAccess().getProcessElementKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessElement_ImplAccess().getProcessElementKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessElement_Impl__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // InternalPDL.g:627:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:631:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalPDL.g:632:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // InternalPDL.g:639:1: rule__WorkDefinition__Group__0__Impl : ( () ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:643:1: ( ( () ) )
            // InternalPDL.g:644:1: ( () )
            {
            // InternalPDL.g:644:1: ( () )
            // InternalPDL.g:645:2: ()
            {
             before(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0()); 
            // InternalPDL.g:646:2: ()
            // InternalPDL.g:646:3: 
            {
            }

             after(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // InternalPDL.g:654:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:658:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalPDL.g:659:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // InternalPDL.g:666:1: rule__WorkDefinition__Group__1__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:670:1: ( ( 'wd' ) )
            // InternalPDL.g:671:1: ( 'wd' )
            {
            // InternalPDL.g:671:1: ( 'wd' )
            // InternalPDL.g:672:2: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // InternalPDL.g:681:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:685:1: ( rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 )
            // InternalPDL.g:686:2: rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // InternalPDL.g:693:1: rule__WorkDefinition__Group__2__Impl : ( ( rule__WorkDefinition__NameAssignment_2 ) ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:697:1: ( ( ( rule__WorkDefinition__NameAssignment_2 ) ) )
            // InternalPDL.g:698:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            {
            // InternalPDL.g:698:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            // InternalPDL.g:699:2: ( rule__WorkDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_2()); 
            // InternalPDL.g:700:2: ( rule__WorkDefinition__NameAssignment_2 )
            // InternalPDL.g:700:3: rule__WorkDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__3"
    // InternalPDL.g:708:1: rule__WorkDefinition__Group__3 : rule__WorkDefinition__Group__3__Impl ;
    public final void rule__WorkDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:712:1: ( rule__WorkDefinition__Group__3__Impl )
            // InternalPDL.g:713:2: rule__WorkDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__3"


    // $ANTLR start "rule__WorkDefinition__Group__3__Impl"
    // InternalPDL.g:719:1: rule__WorkDefinition__Group__3__Impl : ( ( rule__WorkDefinition__Group_3__0 )? ) ;
    public final void rule__WorkDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:723:1: ( ( ( rule__WorkDefinition__Group_3__0 )? ) )
            // InternalPDL.g:724:1: ( ( rule__WorkDefinition__Group_3__0 )? )
            {
            // InternalPDL.g:724:1: ( ( rule__WorkDefinition__Group_3__0 )? )
            // InternalPDL.g:725:2: ( rule__WorkDefinition__Group_3__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_3()); 
            // InternalPDL.g:726:2: ( rule__WorkDefinition__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPDL.g:726:3: rule__WorkDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_3__0"
    // InternalPDL.g:735:1: rule__WorkDefinition__Group_3__0 : rule__WorkDefinition__Group_3__0__Impl rule__WorkDefinition__Group_3__1 ;
    public final void rule__WorkDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:739:1: ( rule__WorkDefinition__Group_3__0__Impl rule__WorkDefinition__Group_3__1 )
            // InternalPDL.g:740:2: rule__WorkDefinition__Group_3__0__Impl rule__WorkDefinition__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__WorkDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_3__0__Impl"
    // InternalPDL.g:747:1: rule__WorkDefinition__Group_3__0__Impl : ( '{' ) ;
    public final void rule__WorkDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:751:1: ( ( '{' ) )
            // InternalPDL.g:752:1: ( '{' )
            {
            // InternalPDL.g:752:1: ( '{' )
            // InternalPDL.g:753:2: '{'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_3__1"
    // InternalPDL.g:762:1: rule__WorkDefinition__Group_3__1 : rule__WorkDefinition__Group_3__1__Impl rule__WorkDefinition__Group_3__2 ;
    public final void rule__WorkDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:766:1: ( rule__WorkDefinition__Group_3__1__Impl rule__WorkDefinition__Group_3__2 )
            // InternalPDL.g:767:2: rule__WorkDefinition__Group_3__1__Impl rule__WorkDefinition__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__WorkDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_3__1__Impl"
    // InternalPDL.g:774:1: rule__WorkDefinition__Group_3__1__Impl : ( ( rule__WorkDefinition__UsefulRessourcesAssignment_3_1 )* ) ;
    public final void rule__WorkDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:778:1: ( ( ( rule__WorkDefinition__UsefulRessourcesAssignment_3_1 )* ) )
            // InternalPDL.g:779:1: ( ( rule__WorkDefinition__UsefulRessourcesAssignment_3_1 )* )
            {
            // InternalPDL.g:779:1: ( ( rule__WorkDefinition__UsefulRessourcesAssignment_3_1 )* )
            // InternalPDL.g:780:2: ( rule__WorkDefinition__UsefulRessourcesAssignment_3_1 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getUsefulRessourcesAssignment_3_1()); 
            // InternalPDL.g:781:2: ( rule__WorkDefinition__UsefulRessourcesAssignment_3_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPDL.g:781:3: rule__WorkDefinition__UsefulRessourcesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__WorkDefinition__UsefulRessourcesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getUsefulRessourcesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_3__2"
    // InternalPDL.g:789:1: rule__WorkDefinition__Group_3__2 : rule__WorkDefinition__Group_3__2__Impl ;
    public final void rule__WorkDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:793:1: ( rule__WorkDefinition__Group_3__2__Impl )
            // InternalPDL.g:794:2: rule__WorkDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3__2"


    // $ANTLR start "rule__WorkDefinition__Group_3__2__Impl"
    // InternalPDL.g:800:1: rule__WorkDefinition__Group_3__2__Impl : ( '}' ) ;
    public final void rule__WorkDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:804:1: ( ( '}' ) )
            // InternalPDL.g:805:1: ( '}' )
            {
            // InternalPDL.g:805:1: ( '}' )
            // InternalPDL.g:806:2: '}'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDL.g:816:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:820:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDL.g:821:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalPDL.g:828:1: rule__WorkSequence__Group__0__Impl : ( 'ws' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:832:1: ( ( 'ws' ) )
            // InternalPDL.g:833:1: ( 'ws' )
            {
            // InternalPDL.g:833:1: ( 'ws' )
            // InternalPDL.g:834:2: 'ws'
            {
             before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalPDL.g:843:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:847:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDL.g:848:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalPDL.g:855:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:859:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // InternalPDL.g:860:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // InternalPDL.g:860:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // InternalPDL.g:861:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // InternalPDL.g:862:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // InternalPDL.g:862:3: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalPDL.g:870:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:874:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalPDL.g:875:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalPDL.g:882:1: rule__WorkSequence__Group__2__Impl : ( 'from' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:886:1: ( ( 'from' ) )
            // InternalPDL.g:887:1: ( 'from' )
            {
            // InternalPDL.g:887:1: ( 'from' )
            // InternalPDL.g:888:2: 'from'
            {
             before(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // InternalPDL.g:897:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:901:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalPDL.g:902:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // InternalPDL.g:909:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:913:1: ( ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) )
            // InternalPDL.g:914:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            {
            // InternalPDL.g:914:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            // InternalPDL.g:915:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 
            // InternalPDL.g:916:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            // InternalPDL.g:916:3: rule__WorkSequence__PredecessorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // InternalPDL.g:924:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:928:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // InternalPDL.g:929:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // InternalPDL.g:936:1: rule__WorkSequence__Group__4__Impl : ( 'to' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:940:1: ( ( 'to' ) )
            // InternalPDL.g:941:1: ( 'to' )
            {
            // InternalPDL.g:941:1: ( 'to' )
            // InternalPDL.g:942:2: 'to'
            {
             before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // InternalPDL.g:951:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:955:1: ( rule__WorkSequence__Group__5__Impl )
            // InternalPDL.g:956:2: rule__WorkSequence__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // InternalPDL.g:962:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:966:1: ( ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) )
            // InternalPDL.g:967:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            {
            // InternalPDL.g:967:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            // InternalPDL.g:968:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 
            // InternalPDL.g:969:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            // InternalPDL.g:969:3: rule__WorkSequence__SuccessorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalPDL.g:978:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:982:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalPDL.g:983:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // InternalPDL.g:990:1: rule__Guidance__Group__0__Impl : ( () ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:994:1: ( ( () ) )
            // InternalPDL.g:995:1: ( () )
            {
            // InternalPDL.g:995:1: ( () )
            // InternalPDL.g:996:2: ()
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceAction_0()); 
            // InternalPDL.g:997:2: ()
            // InternalPDL.g:997:3: 
            {
            }

             after(grammarAccess.getGuidanceAccess().getGuidanceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // InternalPDL.g:1005:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1009:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // InternalPDL.g:1010:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // InternalPDL.g:1017:1: rule__Guidance__Group__1__Impl : ( 'note' ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1021:1: ( ( 'note' ) )
            // InternalPDL.g:1022:1: ( 'note' )
            {
            // InternalPDL.g:1022:1: ( 'note' )
            // InternalPDL.g:1023:2: 'note'
            {
             before(grammarAccess.getGuidanceAccess().getNoteKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getNoteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__Guidance__Group__2"
    // InternalPDL.g:1032:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1036:1: ( rule__Guidance__Group__2__Impl )
            // InternalPDL.g:1037:2: rule__Guidance__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__2"


    // $ANTLR start "rule__Guidance__Group__2__Impl"
    // InternalPDL.g:1043:1: rule__Guidance__Group__2__Impl : ( ( rule__Guidance__TextAssignment_2 ) ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1047:1: ( ( ( rule__Guidance__TextAssignment_2 ) ) )
            // InternalPDL.g:1048:1: ( ( rule__Guidance__TextAssignment_2 ) )
            {
            // InternalPDL.g:1048:1: ( ( rule__Guidance__TextAssignment_2 ) )
            // InternalPDL.g:1049:2: ( rule__Guidance__TextAssignment_2 )
            {
             before(grammarAccess.getGuidanceAccess().getTextAssignment_2()); 
            // InternalPDL.g:1050:2: ( rule__Guidance__TextAssignment_2 )
            // InternalPDL.g:1050:3: rule__Guidance__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__2__Impl"


    // $ANTLR start "rule__Ressource__Group__0"
    // InternalPDL.g:1059:1: rule__Ressource__Group__0 : rule__Ressource__Group__0__Impl rule__Ressource__Group__1 ;
    public final void rule__Ressource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1063:1: ( rule__Ressource__Group__0__Impl rule__Ressource__Group__1 )
            // InternalPDL.g:1064:2: rule__Ressource__Group__0__Impl rule__Ressource__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Ressource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__0"


    // $ANTLR start "rule__Ressource__Group__0__Impl"
    // InternalPDL.g:1071:1: rule__Ressource__Group__0__Impl : ( 'ressource' ) ;
    public final void rule__Ressource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1075:1: ( ( 'ressource' ) )
            // InternalPDL.g:1076:1: ( 'ressource' )
            {
            // InternalPDL.g:1076:1: ( 'ressource' )
            // InternalPDL.g:1077:2: 'ressource'
            {
             before(grammarAccess.getRessourceAccess().getRessourceKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getRessourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__0__Impl"


    // $ANTLR start "rule__Ressource__Group__1"
    // InternalPDL.g:1086:1: rule__Ressource__Group__1 : rule__Ressource__Group__1__Impl rule__Ressource__Group__2 ;
    public final void rule__Ressource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1090:1: ( rule__Ressource__Group__1__Impl rule__Ressource__Group__2 )
            // InternalPDL.g:1091:2: rule__Ressource__Group__1__Impl rule__Ressource__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Ressource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__1"


    // $ANTLR start "rule__Ressource__Group__1__Impl"
    // InternalPDL.g:1098:1: rule__Ressource__Group__1__Impl : ( ( rule__Ressource__NameAssignment_1 ) ) ;
    public final void rule__Ressource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1102:1: ( ( ( rule__Ressource__NameAssignment_1 ) ) )
            // InternalPDL.g:1103:1: ( ( rule__Ressource__NameAssignment_1 ) )
            {
            // InternalPDL.g:1103:1: ( ( rule__Ressource__NameAssignment_1 ) )
            // InternalPDL.g:1104:2: ( rule__Ressource__NameAssignment_1 )
            {
             before(grammarAccess.getRessourceAccess().getNameAssignment_1()); 
            // InternalPDL.g:1105:2: ( rule__Ressource__NameAssignment_1 )
            // InternalPDL.g:1105:3: rule__Ressource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__1__Impl"


    // $ANTLR start "rule__Ressource__Group__2"
    // InternalPDL.g:1113:1: rule__Ressource__Group__2 : rule__Ressource__Group__2__Impl ;
    public final void rule__Ressource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1117:1: ( rule__Ressource__Group__2__Impl )
            // InternalPDL.g:1118:2: rule__Ressource__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__2"


    // $ANTLR start "rule__Ressource__Group__2__Impl"
    // InternalPDL.g:1124:1: rule__Ressource__Group__2__Impl : ( ( rule__Ressource__QuantityAssignment_2 ) ) ;
    public final void rule__Ressource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1128:1: ( ( ( rule__Ressource__QuantityAssignment_2 ) ) )
            // InternalPDL.g:1129:1: ( ( rule__Ressource__QuantityAssignment_2 ) )
            {
            // InternalPDL.g:1129:1: ( ( rule__Ressource__QuantityAssignment_2 ) )
            // InternalPDL.g:1130:2: ( rule__Ressource__QuantityAssignment_2 )
            {
             before(grammarAccess.getRessourceAccess().getQuantityAssignment_2()); 
            // InternalPDL.g:1131:2: ( rule__Ressource__QuantityAssignment_2 )
            // InternalPDL.g:1131:3: rule__Ressource__QuantityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__QuantityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getQuantityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__2__Impl"


    // $ANTLR start "rule__UsefulRessource__Group__0"
    // InternalPDL.g:1140:1: rule__UsefulRessource__Group__0 : rule__UsefulRessource__Group__0__Impl rule__UsefulRessource__Group__1 ;
    public final void rule__UsefulRessource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1144:1: ( rule__UsefulRessource__Group__0__Impl rule__UsefulRessource__Group__1 )
            // InternalPDL.g:1145:2: rule__UsefulRessource__Group__0__Impl rule__UsefulRessource__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__UsefulRessource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsefulRessource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__Group__0"


    // $ANTLR start "rule__UsefulRessource__Group__0__Impl"
    // InternalPDL.g:1152:1: rule__UsefulRessource__Group__0__Impl : ( 'needs' ) ;
    public final void rule__UsefulRessource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1156:1: ( ( 'needs' ) )
            // InternalPDL.g:1157:1: ( 'needs' )
            {
            // InternalPDL.g:1157:1: ( 'needs' )
            // InternalPDL.g:1158:2: 'needs'
            {
             before(grammarAccess.getUsefulRessourceAccess().getNeedsKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUsefulRessourceAccess().getNeedsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__Group__0__Impl"


    // $ANTLR start "rule__UsefulRessource__Group__1"
    // InternalPDL.g:1167:1: rule__UsefulRessource__Group__1 : rule__UsefulRessource__Group__1__Impl rule__UsefulRessource__Group__2 ;
    public final void rule__UsefulRessource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1171:1: ( rule__UsefulRessource__Group__1__Impl rule__UsefulRessource__Group__2 )
            // InternalPDL.g:1172:2: rule__UsefulRessource__Group__1__Impl rule__UsefulRessource__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__UsefulRessource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsefulRessource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__Group__1"


    // $ANTLR start "rule__UsefulRessource__Group__1__Impl"
    // InternalPDL.g:1179:1: rule__UsefulRessource__Group__1__Impl : ( ( rule__UsefulRessource__UsefulQuantityAssignment_1 ) ) ;
    public final void rule__UsefulRessource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1183:1: ( ( ( rule__UsefulRessource__UsefulQuantityAssignment_1 ) ) )
            // InternalPDL.g:1184:1: ( ( rule__UsefulRessource__UsefulQuantityAssignment_1 ) )
            {
            // InternalPDL.g:1184:1: ( ( rule__UsefulRessource__UsefulQuantityAssignment_1 ) )
            // InternalPDL.g:1185:2: ( rule__UsefulRessource__UsefulQuantityAssignment_1 )
            {
             before(grammarAccess.getUsefulRessourceAccess().getUsefulQuantityAssignment_1()); 
            // InternalPDL.g:1186:2: ( rule__UsefulRessource__UsefulQuantityAssignment_1 )
            // InternalPDL.g:1186:3: rule__UsefulRessource__UsefulQuantityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UsefulRessource__UsefulQuantityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUsefulRessourceAccess().getUsefulQuantityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__Group__1__Impl"


    // $ANTLR start "rule__UsefulRessource__Group__2"
    // InternalPDL.g:1194:1: rule__UsefulRessource__Group__2 : rule__UsefulRessource__Group__2__Impl rule__UsefulRessource__Group__3 ;
    public final void rule__UsefulRessource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1198:1: ( rule__UsefulRessource__Group__2__Impl rule__UsefulRessource__Group__3 )
            // InternalPDL.g:1199:2: rule__UsefulRessource__Group__2__Impl rule__UsefulRessource__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__UsefulRessource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsefulRessource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__Group__2"


    // $ANTLR start "rule__UsefulRessource__Group__2__Impl"
    // InternalPDL.g:1206:1: rule__UsefulRessource__Group__2__Impl : ( 'of' ) ;
    public final void rule__UsefulRessource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1210:1: ( ( 'of' ) )
            // InternalPDL.g:1211:1: ( 'of' )
            {
            // InternalPDL.g:1211:1: ( 'of' )
            // InternalPDL.g:1212:2: 'of'
            {
             before(grammarAccess.getUsefulRessourceAccess().getOfKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getUsefulRessourceAccess().getOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__Group__2__Impl"


    // $ANTLR start "rule__UsefulRessource__Group__3"
    // InternalPDL.g:1221:1: rule__UsefulRessource__Group__3 : rule__UsefulRessource__Group__3__Impl ;
    public final void rule__UsefulRessource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1225:1: ( rule__UsefulRessource__Group__3__Impl )
            // InternalPDL.g:1226:2: rule__UsefulRessource__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsefulRessource__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__Group__3"


    // $ANTLR start "rule__UsefulRessource__Group__3__Impl"
    // InternalPDL.g:1232:1: rule__UsefulRessource__Group__3__Impl : ( ( rule__UsefulRessource__RessourceAssignment_3 ) ) ;
    public final void rule__UsefulRessource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1236:1: ( ( ( rule__UsefulRessource__RessourceAssignment_3 ) ) )
            // InternalPDL.g:1237:1: ( ( rule__UsefulRessource__RessourceAssignment_3 ) )
            {
            // InternalPDL.g:1237:1: ( ( rule__UsefulRessource__RessourceAssignment_3 ) )
            // InternalPDL.g:1238:2: ( rule__UsefulRessource__RessourceAssignment_3 )
            {
             before(grammarAccess.getUsefulRessourceAccess().getRessourceAssignment_3()); 
            // InternalPDL.g:1239:2: ( rule__UsefulRessource__RessourceAssignment_3 )
            // InternalPDL.g:1239:3: rule__UsefulRessource__RessourceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UsefulRessource__RessourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUsefulRessourceAccess().getRessourceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__Group__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalPDL.g:1248:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1252:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalPDL.g:1253:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalPDL.g:1260:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1264:1: ( ( ( '-' )? ) )
            // InternalPDL.g:1265:1: ( ( '-' )? )
            {
            // InternalPDL.g:1265:1: ( ( '-' )? )
            // InternalPDL.g:1266:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalPDL.g:1267:2: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPDL.g:1267:3: '-'
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalPDL.g:1275:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1279:1: ( rule__EInt__Group__1__Impl )
            // InternalPDL.g:1280:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalPDL.g:1286:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1290:1: ( ( RULE_INT ) )
            // InternalPDL.g:1291:1: ( RULE_INT )
            {
            // InternalPDL.g:1291:1: ( RULE_INT )
            // InternalPDL.g:1292:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Process__NameAssignment_2"
    // InternalPDL.g:1302:1: rule__Process__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1306:1: ( ( ruleEString ) )
            // InternalPDL.g:1307:2: ( ruleEString )
            {
            // InternalPDL.g:1307:2: ( ruleEString )
            // InternalPDL.g:1308:3: ruleEString
            {
             before(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_2"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_4"
    // InternalPDL.g:1317:1: rule__Process__ProcessElementsAssignment_4 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1321:1: ( ( ruleProcessElement ) )
            // InternalPDL.g:1322:2: ( ruleProcessElement )
            {
            // InternalPDL.g:1322:2: ( ruleProcessElement )
            // InternalPDL.g:1323:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ProcessElementsAssignment_4"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_2"
    // InternalPDL.g:1332:1: rule__WorkDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__WorkDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1336:1: ( ( ruleEString ) )
            // InternalPDL.g:1337:2: ( ruleEString )
            {
            // InternalPDL.g:1337:2: ( ruleEString )
            // InternalPDL.g:1338:3: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__NameAssignment_2"


    // $ANTLR start "rule__WorkDefinition__UsefulRessourcesAssignment_3_1"
    // InternalPDL.g:1347:1: rule__WorkDefinition__UsefulRessourcesAssignment_3_1 : ( ruleUsefulRessource ) ;
    public final void rule__WorkDefinition__UsefulRessourcesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1351:1: ( ( ruleUsefulRessource ) )
            // InternalPDL.g:1352:2: ( ruleUsefulRessource )
            {
            // InternalPDL.g:1352:2: ( ruleUsefulRessource )
            // InternalPDL.g:1353:3: ruleUsefulRessource
            {
             before(grammarAccess.getWorkDefinitionAccess().getUsefulRessourcesUsefulRessourceParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUsefulRessource();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getUsefulRessourcesUsefulRessourceParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__UsefulRessourcesAssignment_3_1"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // InternalPDL.g:1362:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1366:1: ( ( ruleWorkSequenceType ) )
            // InternalPDL.g:1367:2: ( ruleWorkSequenceType )
            {
            // InternalPDL.g:1367:2: ( ruleWorkSequenceType )
            // InternalPDL.g:1368:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_3"
    // InternalPDL.g:1377:1: rule__WorkSequence__PredecessorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1381:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1382:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1382:2: ( ( RULE_ID ) )
            // InternalPDL.g:1383:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            // InternalPDL.g:1384:3: ( RULE_ID )
            // InternalPDL.g:1385:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_3"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_5"
    // InternalPDL.g:1396:1: rule__WorkSequence__SuccessorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1400:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1401:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1401:2: ( ( RULE_ID ) )
            // InternalPDL.g:1402:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            // InternalPDL.g:1403:3: ( RULE_ID )
            // InternalPDL.g:1404:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_5"


    // $ANTLR start "rule__Guidance__TextAssignment_2"
    // InternalPDL.g:1415:1: rule__Guidance__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Guidance__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1419:1: ( ( RULE_STRING ) )
            // InternalPDL.g:1420:2: ( RULE_STRING )
            {
            // InternalPDL.g:1420:2: ( RULE_STRING )
            // InternalPDL.g:1421:3: RULE_STRING
            {
             before(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__TextAssignment_2"


    // $ANTLR start "rule__Ressource__NameAssignment_1"
    // InternalPDL.g:1430:1: rule__Ressource__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Ressource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1434:1: ( ( ruleEString ) )
            // InternalPDL.g:1435:2: ( ruleEString )
            {
            // InternalPDL.g:1435:2: ( ruleEString )
            // InternalPDL.g:1436:3: ruleEString
            {
             before(grammarAccess.getRessourceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRessourceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__NameAssignment_1"


    // $ANTLR start "rule__Ressource__QuantityAssignment_2"
    // InternalPDL.g:1445:1: rule__Ressource__QuantityAssignment_2 : ( ruleEInt ) ;
    public final void rule__Ressource__QuantityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1449:1: ( ( ruleEInt ) )
            // InternalPDL.g:1450:2: ( ruleEInt )
            {
            // InternalPDL.g:1450:2: ( ruleEInt )
            // InternalPDL.g:1451:3: ruleEInt
            {
             before(grammarAccess.getRessourceAccess().getQuantityEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRessourceAccess().getQuantityEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__QuantityAssignment_2"


    // $ANTLR start "rule__UsefulRessource__UsefulQuantityAssignment_1"
    // InternalPDL.g:1460:1: rule__UsefulRessource__UsefulQuantityAssignment_1 : ( ruleEInt ) ;
    public final void rule__UsefulRessource__UsefulQuantityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1464:1: ( ( ruleEInt ) )
            // InternalPDL.g:1465:2: ( ruleEInt )
            {
            // InternalPDL.g:1465:2: ( ruleEInt )
            // InternalPDL.g:1466:3: ruleEInt
            {
             before(grammarAccess.getUsefulRessourceAccess().getUsefulQuantityEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getUsefulRessourceAccess().getUsefulQuantityEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__UsefulQuantityAssignment_1"


    // $ANTLR start "rule__UsefulRessource__RessourceAssignment_3"
    // InternalPDL.g:1475:1: rule__UsefulRessource__RessourceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__UsefulRessource__RessourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1479:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1480:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1480:2: ( ( RULE_ID ) )
            // InternalPDL.g:1481:3: ( RULE_ID )
            {
             before(grammarAccess.getUsefulRessourceAccess().getRessourceRessourceCrossReference_3_0()); 
            // InternalPDL.g:1482:3: ( RULE_ID )
            // InternalPDL.g:1483:4: RULE_ID
            {
             before(grammarAccess.getUsefulRessourceAccess().getRessourceRessourceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUsefulRessourceAccess().getRessourceRessourceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getUsefulRessourceAccess().getRessourceRessourceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__RessourceAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000019E0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000019C0002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});

}
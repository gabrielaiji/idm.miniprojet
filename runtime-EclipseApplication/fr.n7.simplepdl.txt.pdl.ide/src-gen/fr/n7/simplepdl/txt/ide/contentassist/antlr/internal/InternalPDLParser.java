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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'startToStart'", "'finishToStart'", "'startToFinish'", "'finishToFinish'", "'Process'", "'{'", "'}'", "'processElements'", "','", "'ProcessElement'", "'WorkDefinition'", "'linksToPredecessors'", "'('", "')'", "'linksToSuccessors'", "'usefulRessources'", "'WorkSequence'", "'linkType'", "'predecessor'", "'successor'", "'Guidance'", "'text'", "'elements'", "'Ressource'", "'quantity'", "'UsefulRessource'", "'usefulQuantity'", "'ressource'", "'-'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
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
            case 20:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 31:
                {
                alt1=4;
                }
                break;
            case 34:
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
    // InternalPDL.g:378:1: rule__WorkSequenceType__Alternatives : ( ( ( 'startToStart' ) ) | ( ( 'finishToStart' ) ) | ( ( 'startToFinish' ) ) | ( ( 'finishToFinish' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:382:1: ( ( ( 'startToStart' ) ) | ( ( 'finishToStart' ) ) | ( ( 'startToFinish' ) ) | ( ( 'finishToFinish' ) ) )
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
                    // InternalPDL.g:383:2: ( ( 'startToStart' ) )
                    {
                    // InternalPDL.g:383:2: ( ( 'startToStart' ) )
                    // InternalPDL.g:384:3: ( 'startToStart' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 
                    // InternalPDL.g:385:3: ( 'startToStart' )
                    // InternalPDL.g:385:4: 'startToStart'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:389:2: ( ( 'finishToStart' ) )
                    {
                    // InternalPDL.g:389:2: ( ( 'finishToStart' ) )
                    // InternalPDL.g:390:3: ( 'finishToStart' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 
                    // InternalPDL.g:391:3: ( 'finishToStart' )
                    // InternalPDL.g:391:4: 'finishToStart'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:395:2: ( ( 'startToFinish' ) )
                    {
                    // InternalPDL.g:395:2: ( ( 'startToFinish' ) )
                    // InternalPDL.g:396:3: ( 'startToFinish' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 
                    // InternalPDL.g:397:3: ( 'startToFinish' )
                    // InternalPDL.g:397:4: 'startToFinish'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:401:2: ( ( 'finishToFinish' ) )
                    {
                    // InternalPDL.g:401:2: ( ( 'finishToFinish' ) )
                    // InternalPDL.g:402:3: ( 'finishToFinish' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 
                    // InternalPDL.g:403:3: ( 'finishToFinish' )
                    // InternalPDL.g:403:4: 'finishToFinish'
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
    // InternalPDL.g:450:1: rule__Process__Group__1__Impl : ( 'Process' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:454:1: ( ( 'Process' ) )
            // InternalPDL.g:455:1: ( 'Process' )
            {
            // InternalPDL.g:455:1: ( 'Process' )
            // InternalPDL.g:456:2: 'Process'
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
    // InternalPDL.g:531:1: rule__Process__Group__4__Impl : ( ( rule__Process__Group_4__0 )? ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:535:1: ( ( ( rule__Process__Group_4__0 )? ) )
            // InternalPDL.g:536:1: ( ( rule__Process__Group_4__0 )? )
            {
            // InternalPDL.g:536:1: ( ( rule__Process__Group_4__0 )? )
            // InternalPDL.g:537:2: ( rule__Process__Group_4__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_4()); 
            // InternalPDL.g:538:2: ( rule__Process__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPDL.g:538:3: rule__Process__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Process__Group_4__0"
    // InternalPDL.g:573:1: rule__Process__Group_4__0 : rule__Process__Group_4__0__Impl rule__Process__Group_4__1 ;
    public final void rule__Process__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:577:1: ( rule__Process__Group_4__0__Impl rule__Process__Group_4__1 )
            // InternalPDL.g:578:2: rule__Process__Group_4__0__Impl rule__Process__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0"


    // $ANTLR start "rule__Process__Group_4__0__Impl"
    // InternalPDL.g:585:1: rule__Process__Group_4__0__Impl : ( 'processElements' ) ;
    public final void rule__Process__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:589:1: ( ( 'processElements' ) )
            // InternalPDL.g:590:1: ( 'processElements' )
            {
            // InternalPDL.g:590:1: ( 'processElements' )
            // InternalPDL.g:591:2: 'processElements'
            {
             before(grammarAccess.getProcessAccess().getProcessElementsKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessElementsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0__Impl"


    // $ANTLR start "rule__Process__Group_4__1"
    // InternalPDL.g:600:1: rule__Process__Group_4__1 : rule__Process__Group_4__1__Impl rule__Process__Group_4__2 ;
    public final void rule__Process__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:604:1: ( rule__Process__Group_4__1__Impl rule__Process__Group_4__2 )
            // InternalPDL.g:605:2: rule__Process__Group_4__1__Impl rule__Process__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1"


    // $ANTLR start "rule__Process__Group_4__1__Impl"
    // InternalPDL.g:612:1: rule__Process__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Process__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:616:1: ( ( '{' ) )
            // InternalPDL.g:617:1: ( '{' )
            {
            // InternalPDL.g:617:1: ( '{' )
            // InternalPDL.g:618:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1__Impl"


    // $ANTLR start "rule__Process__Group_4__2"
    // InternalPDL.g:627:1: rule__Process__Group_4__2 : rule__Process__Group_4__2__Impl rule__Process__Group_4__3 ;
    public final void rule__Process__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:631:1: ( rule__Process__Group_4__2__Impl rule__Process__Group_4__3 )
            // InternalPDL.g:632:2: rule__Process__Group_4__2__Impl rule__Process__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__2"


    // $ANTLR start "rule__Process__Group_4__2__Impl"
    // InternalPDL.g:639:1: rule__Process__Group_4__2__Impl : ( ( rule__Process__ProcessElementsAssignment_4_2 ) ) ;
    public final void rule__Process__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:643:1: ( ( ( rule__Process__ProcessElementsAssignment_4_2 ) ) )
            // InternalPDL.g:644:1: ( ( rule__Process__ProcessElementsAssignment_4_2 ) )
            {
            // InternalPDL.g:644:1: ( ( rule__Process__ProcessElementsAssignment_4_2 ) )
            // InternalPDL.g:645:2: ( rule__Process__ProcessElementsAssignment_4_2 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_2()); 
            // InternalPDL.g:646:2: ( rule__Process__ProcessElementsAssignment_4_2 )
            // InternalPDL.g:646:3: rule__Process__ProcessElementsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__ProcessElementsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__2__Impl"


    // $ANTLR start "rule__Process__Group_4__3"
    // InternalPDL.g:654:1: rule__Process__Group_4__3 : rule__Process__Group_4__3__Impl rule__Process__Group_4__4 ;
    public final void rule__Process__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:658:1: ( rule__Process__Group_4__3__Impl rule__Process__Group_4__4 )
            // InternalPDL.g:659:2: rule__Process__Group_4__3__Impl rule__Process__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__3"


    // $ANTLR start "rule__Process__Group_4__3__Impl"
    // InternalPDL.g:666:1: rule__Process__Group_4__3__Impl : ( ( rule__Process__Group_4_3__0 )* ) ;
    public final void rule__Process__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:670:1: ( ( ( rule__Process__Group_4_3__0 )* ) )
            // InternalPDL.g:671:1: ( ( rule__Process__Group_4_3__0 )* )
            {
            // InternalPDL.g:671:1: ( ( rule__Process__Group_4_3__0 )* )
            // InternalPDL.g:672:2: ( rule__Process__Group_4_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_4_3()); 
            // InternalPDL.g:673:2: ( rule__Process__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPDL.g:673:3: rule__Process__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Process__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__3__Impl"


    // $ANTLR start "rule__Process__Group_4__4"
    // InternalPDL.g:681:1: rule__Process__Group_4__4 : rule__Process__Group_4__4__Impl ;
    public final void rule__Process__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:685:1: ( rule__Process__Group_4__4__Impl )
            // InternalPDL.g:686:2: rule__Process__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__4"


    // $ANTLR start "rule__Process__Group_4__4__Impl"
    // InternalPDL.g:692:1: rule__Process__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Process__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:696:1: ( ( '}' ) )
            // InternalPDL.g:697:1: ( '}' )
            {
            // InternalPDL.g:697:1: ( '}' )
            // InternalPDL.g:698:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__4__Impl"


    // $ANTLR start "rule__Process__Group_4_3__0"
    // InternalPDL.g:708:1: rule__Process__Group_4_3__0 : rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1 ;
    public final void rule__Process__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:712:1: ( rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1 )
            // InternalPDL.g:713:2: rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__0"


    // $ANTLR start "rule__Process__Group_4_3__0__Impl"
    // InternalPDL.g:720:1: rule__Process__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:724:1: ( ( ',' ) )
            // InternalPDL.g:725:1: ( ',' )
            {
            // InternalPDL.g:725:1: ( ',' )
            // InternalPDL.g:726:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__0__Impl"


    // $ANTLR start "rule__Process__Group_4_3__1"
    // InternalPDL.g:735:1: rule__Process__Group_4_3__1 : rule__Process__Group_4_3__1__Impl ;
    public final void rule__Process__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:739:1: ( rule__Process__Group_4_3__1__Impl )
            // InternalPDL.g:740:2: rule__Process__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__1"


    // $ANTLR start "rule__Process__Group_4_3__1__Impl"
    // InternalPDL.g:746:1: rule__Process__Group_4_3__1__Impl : ( ( rule__Process__ProcessElementsAssignment_4_3_1 ) ) ;
    public final void rule__Process__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:750:1: ( ( ( rule__Process__ProcessElementsAssignment_4_3_1 ) ) )
            // InternalPDL.g:751:1: ( ( rule__Process__ProcessElementsAssignment_4_3_1 ) )
            {
            // InternalPDL.g:751:1: ( ( rule__Process__ProcessElementsAssignment_4_3_1 ) )
            // InternalPDL.g:752:2: ( rule__Process__ProcessElementsAssignment_4_3_1 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_3_1()); 
            // InternalPDL.g:753:2: ( rule__Process__ProcessElementsAssignment_4_3_1 )
            // InternalPDL.g:753:3: rule__Process__ProcessElementsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__ProcessElementsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__1__Impl"


    // $ANTLR start "rule__ProcessElement_Impl__Group__0"
    // InternalPDL.g:762:1: rule__ProcessElement_Impl__Group__0 : rule__ProcessElement_Impl__Group__0__Impl rule__ProcessElement_Impl__Group__1 ;
    public final void rule__ProcessElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:766:1: ( rule__ProcessElement_Impl__Group__0__Impl rule__ProcessElement_Impl__Group__1 )
            // InternalPDL.g:767:2: rule__ProcessElement_Impl__Group__0__Impl rule__ProcessElement_Impl__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalPDL.g:774:1: rule__ProcessElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ProcessElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:778:1: ( ( () ) )
            // InternalPDL.g:779:1: ( () )
            {
            // InternalPDL.g:779:1: ( () )
            // InternalPDL.g:780:2: ()
            {
             before(grammarAccess.getProcessElement_ImplAccess().getProcessElementAction_0()); 
            // InternalPDL.g:781:2: ()
            // InternalPDL.g:781:3: 
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
    // InternalPDL.g:789:1: rule__ProcessElement_Impl__Group__1 : rule__ProcessElement_Impl__Group__1__Impl ;
    public final void rule__ProcessElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:793:1: ( rule__ProcessElement_Impl__Group__1__Impl )
            // InternalPDL.g:794:2: rule__ProcessElement_Impl__Group__1__Impl
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
    // InternalPDL.g:800:1: rule__ProcessElement_Impl__Group__1__Impl : ( 'ProcessElement' ) ;
    public final void rule__ProcessElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:804:1: ( ( 'ProcessElement' ) )
            // InternalPDL.g:805:1: ( 'ProcessElement' )
            {
            // InternalPDL.g:805:1: ( 'ProcessElement' )
            // InternalPDL.g:806:2: 'ProcessElement'
            {
             before(grammarAccess.getProcessElement_ImplAccess().getProcessElementKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalPDL.g:816:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:820:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalPDL.g:821:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalPDL.g:828:1: rule__WorkDefinition__Group__0__Impl : ( () ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:832:1: ( ( () ) )
            // InternalPDL.g:833:1: ( () )
            {
            // InternalPDL.g:833:1: ( () )
            // InternalPDL.g:834:2: ()
            {
             before(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0()); 
            // InternalPDL.g:835:2: ()
            // InternalPDL.g:835:3: 
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
    // InternalPDL.g:843:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:847:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalPDL.g:848:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
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
    // InternalPDL.g:855:1: rule__WorkDefinition__Group__1__Impl : ( 'WorkDefinition' ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:859:1: ( ( 'WorkDefinition' ) )
            // InternalPDL.g:860:1: ( 'WorkDefinition' )
            {
            // InternalPDL.g:860:1: ( 'WorkDefinition' )
            // InternalPDL.g:861:2: 'WorkDefinition'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionKeyword_1()); 

            }


            }

        }
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
    // InternalPDL.g:870:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:874:1: ( rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 )
            // InternalPDL.g:875:2: rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3
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
    // InternalPDL.g:882:1: rule__WorkDefinition__Group__2__Impl : ( ( rule__WorkDefinition__NameAssignment_2 ) ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:886:1: ( ( ( rule__WorkDefinition__NameAssignment_2 ) ) )
            // InternalPDL.g:887:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            {
            // InternalPDL.g:887:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            // InternalPDL.g:888:2: ( rule__WorkDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_2()); 
            // InternalPDL.g:889:2: ( rule__WorkDefinition__NameAssignment_2 )
            // InternalPDL.g:889:3: rule__WorkDefinition__NameAssignment_2
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
    // InternalPDL.g:897:1: rule__WorkDefinition__Group__3 : rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 ;
    public final void rule__WorkDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:901:1: ( rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 )
            // InternalPDL.g:902:2: rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__WorkDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__4();

            state._fsp--;


            }

        }
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
    // InternalPDL.g:909:1: rule__WorkDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__WorkDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:913:1: ( ( '{' ) )
            // InternalPDL.g:914:1: ( '{' )
            {
            // InternalPDL.g:914:1: ( '{' )
            // InternalPDL.g:915:2: '{'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__WorkDefinition__Group__4"
    // InternalPDL.g:924:1: rule__WorkDefinition__Group__4 : rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5 ;
    public final void rule__WorkDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:928:1: ( rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5 )
            // InternalPDL.g:929:2: rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__WorkDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__4"


    // $ANTLR start "rule__WorkDefinition__Group__4__Impl"
    // InternalPDL.g:936:1: rule__WorkDefinition__Group__4__Impl : ( ( rule__WorkDefinition__Group_4__0 )? ) ;
    public final void rule__WorkDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:940:1: ( ( ( rule__WorkDefinition__Group_4__0 )? ) )
            // InternalPDL.g:941:1: ( ( rule__WorkDefinition__Group_4__0 )? )
            {
            // InternalPDL.g:941:1: ( ( rule__WorkDefinition__Group_4__0 )? )
            // InternalPDL.g:942:2: ( rule__WorkDefinition__Group_4__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_4()); 
            // InternalPDL.g:943:2: ( rule__WorkDefinition__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPDL.g:943:3: rule__WorkDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__5"
    // InternalPDL.g:951:1: rule__WorkDefinition__Group__5 : rule__WorkDefinition__Group__5__Impl rule__WorkDefinition__Group__6 ;
    public final void rule__WorkDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:955:1: ( rule__WorkDefinition__Group__5__Impl rule__WorkDefinition__Group__6 )
            // InternalPDL.g:956:2: rule__WorkDefinition__Group__5__Impl rule__WorkDefinition__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__WorkDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__5"


    // $ANTLR start "rule__WorkDefinition__Group__5__Impl"
    // InternalPDL.g:963:1: rule__WorkDefinition__Group__5__Impl : ( ( rule__WorkDefinition__Group_5__0 )? ) ;
    public final void rule__WorkDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:967:1: ( ( ( rule__WorkDefinition__Group_5__0 )? ) )
            // InternalPDL.g:968:1: ( ( rule__WorkDefinition__Group_5__0 )? )
            {
            // InternalPDL.g:968:1: ( ( rule__WorkDefinition__Group_5__0 )? )
            // InternalPDL.g:969:2: ( rule__WorkDefinition__Group_5__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_5()); 
            // InternalPDL.g:970:2: ( rule__WorkDefinition__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPDL.g:970:3: rule__WorkDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__5__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__6"
    // InternalPDL.g:978:1: rule__WorkDefinition__Group__6 : rule__WorkDefinition__Group__6__Impl rule__WorkDefinition__Group__7 ;
    public final void rule__WorkDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:982:1: ( rule__WorkDefinition__Group__6__Impl rule__WorkDefinition__Group__7 )
            // InternalPDL.g:983:2: rule__WorkDefinition__Group__6__Impl rule__WorkDefinition__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__WorkDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__6"


    // $ANTLR start "rule__WorkDefinition__Group__6__Impl"
    // InternalPDL.g:990:1: rule__WorkDefinition__Group__6__Impl : ( ( rule__WorkDefinition__Group_6__0 )? ) ;
    public final void rule__WorkDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:994:1: ( ( ( rule__WorkDefinition__Group_6__0 )? ) )
            // InternalPDL.g:995:1: ( ( rule__WorkDefinition__Group_6__0 )? )
            {
            // InternalPDL.g:995:1: ( ( rule__WorkDefinition__Group_6__0 )? )
            // InternalPDL.g:996:2: ( rule__WorkDefinition__Group_6__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_6()); 
            // InternalPDL.g:997:2: ( rule__WorkDefinition__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPDL.g:997:3: rule__WorkDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__6__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__7"
    // InternalPDL.g:1005:1: rule__WorkDefinition__Group__7 : rule__WorkDefinition__Group__7__Impl ;
    public final void rule__WorkDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1009:1: ( rule__WorkDefinition__Group__7__Impl )
            // InternalPDL.g:1010:2: rule__WorkDefinition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__7"


    // $ANTLR start "rule__WorkDefinition__Group__7__Impl"
    // InternalPDL.g:1016:1: rule__WorkDefinition__Group__7__Impl : ( '}' ) ;
    public final void rule__WorkDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1020:1: ( ( '}' ) )
            // InternalPDL.g:1021:1: ( '}' )
            {
            // InternalPDL.g:1021:1: ( '}' )
            // InternalPDL.g:1022:2: '}'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__7__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__0"
    // InternalPDL.g:1032:1: rule__WorkDefinition__Group_4__0 : rule__WorkDefinition__Group_4__0__Impl rule__WorkDefinition__Group_4__1 ;
    public final void rule__WorkDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1036:1: ( rule__WorkDefinition__Group_4__0__Impl rule__WorkDefinition__Group_4__1 )
            // InternalPDL.g:1037:2: rule__WorkDefinition__Group_4__0__Impl rule__WorkDefinition__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__WorkDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__0"


    // $ANTLR start "rule__WorkDefinition__Group_4__0__Impl"
    // InternalPDL.g:1044:1: rule__WorkDefinition__Group_4__0__Impl : ( 'linksToPredecessors' ) ;
    public final void rule__WorkDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1048:1: ( ( 'linksToPredecessors' ) )
            // InternalPDL.g:1049:1: ( 'linksToPredecessors' )
            {
            // InternalPDL.g:1049:1: ( 'linksToPredecessors' )
            // InternalPDL.g:1050:2: 'linksToPredecessors'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__1"
    // InternalPDL.g:1059:1: rule__WorkDefinition__Group_4__1 : rule__WorkDefinition__Group_4__1__Impl rule__WorkDefinition__Group_4__2 ;
    public final void rule__WorkDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1063:1: ( rule__WorkDefinition__Group_4__1__Impl rule__WorkDefinition__Group_4__2 )
            // InternalPDL.g:1064:2: rule__WorkDefinition__Group_4__1__Impl rule__WorkDefinition__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__1"


    // $ANTLR start "rule__WorkDefinition__Group_4__1__Impl"
    // InternalPDL.g:1071:1: rule__WorkDefinition__Group_4__1__Impl : ( '(' ) ;
    public final void rule__WorkDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1075:1: ( ( '(' ) )
            // InternalPDL.g:1076:1: ( '(' )
            {
            // InternalPDL.g:1076:1: ( '(' )
            // InternalPDL.g:1077:2: '('
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__2"
    // InternalPDL.g:1086:1: rule__WorkDefinition__Group_4__2 : rule__WorkDefinition__Group_4__2__Impl rule__WorkDefinition__Group_4__3 ;
    public final void rule__WorkDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1090:1: ( rule__WorkDefinition__Group_4__2__Impl rule__WorkDefinition__Group_4__3 )
            // InternalPDL.g:1091:2: rule__WorkDefinition__Group_4__2__Impl rule__WorkDefinition__Group_4__3
            {
            pushFollow(FOLLOW_14);
            rule__WorkDefinition__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__2"


    // $ANTLR start "rule__WorkDefinition__Group_4__2__Impl"
    // InternalPDL.g:1098:1: rule__WorkDefinition__Group_4__2__Impl : ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 ) ) ;
    public final void rule__WorkDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1102:1: ( ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 ) ) )
            // InternalPDL.g:1103:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 ) )
            {
            // InternalPDL.g:1103:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 ) )
            // InternalPDL.g:1104:2: ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_4_2()); 
            // InternalPDL.g:1105:2: ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 )
            // InternalPDL.g:1105:3: rule__WorkDefinition__LinksToPredecessorsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinksToPredecessorsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__3"
    // InternalPDL.g:1113:1: rule__WorkDefinition__Group_4__3 : rule__WorkDefinition__Group_4__3__Impl rule__WorkDefinition__Group_4__4 ;
    public final void rule__WorkDefinition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1117:1: ( rule__WorkDefinition__Group_4__3__Impl rule__WorkDefinition__Group_4__4 )
            // InternalPDL.g:1118:2: rule__WorkDefinition__Group_4__3__Impl rule__WorkDefinition__Group_4__4
            {
            pushFollow(FOLLOW_14);
            rule__WorkDefinition__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__3"


    // $ANTLR start "rule__WorkDefinition__Group_4__3__Impl"
    // InternalPDL.g:1125:1: rule__WorkDefinition__Group_4__3__Impl : ( ( rule__WorkDefinition__Group_4_3__0 )* ) ;
    public final void rule__WorkDefinition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1129:1: ( ( ( rule__WorkDefinition__Group_4_3__0 )* ) )
            // InternalPDL.g:1130:1: ( ( rule__WorkDefinition__Group_4_3__0 )* )
            {
            // InternalPDL.g:1130:1: ( ( rule__WorkDefinition__Group_4_3__0 )* )
            // InternalPDL.g:1131:2: ( rule__WorkDefinition__Group_4_3__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_4_3()); 
            // InternalPDL.g:1132:2: ( rule__WorkDefinition__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPDL.g:1132:3: rule__WorkDefinition__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__WorkDefinition__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__4"
    // InternalPDL.g:1140:1: rule__WorkDefinition__Group_4__4 : rule__WorkDefinition__Group_4__4__Impl ;
    public final void rule__WorkDefinition__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1144:1: ( rule__WorkDefinition__Group_4__4__Impl )
            // InternalPDL.g:1145:2: rule__WorkDefinition__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__4"


    // $ANTLR start "rule__WorkDefinition__Group_4__4__Impl"
    // InternalPDL.g:1151:1: rule__WorkDefinition__Group_4__4__Impl : ( ')' ) ;
    public final void rule__WorkDefinition__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1155:1: ( ( ')' ) )
            // InternalPDL.g:1156:1: ( ')' )
            {
            // InternalPDL.g:1156:1: ( ')' )
            // InternalPDL.g:1157:2: ')'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_4_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4_3__0"
    // InternalPDL.g:1167:1: rule__WorkDefinition__Group_4_3__0 : rule__WorkDefinition__Group_4_3__0__Impl rule__WorkDefinition__Group_4_3__1 ;
    public final void rule__WorkDefinition__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1171:1: ( rule__WorkDefinition__Group_4_3__0__Impl rule__WorkDefinition__Group_4_3__1 )
            // InternalPDL.g:1172:2: rule__WorkDefinition__Group_4_3__0__Impl rule__WorkDefinition__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_4_3__0__Impl"
    // InternalPDL.g:1179:1: rule__WorkDefinition__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1183:1: ( ( ',' ) )
            // InternalPDL.g:1184:1: ( ',' )
            {
            // InternalPDL.g:1184:1: ( ',' )
            // InternalPDL.g:1185:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4_3__1"
    // InternalPDL.g:1194:1: rule__WorkDefinition__Group_4_3__1 : rule__WorkDefinition__Group_4_3__1__Impl ;
    public final void rule__WorkDefinition__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1198:1: ( rule__WorkDefinition__Group_4_3__1__Impl )
            // InternalPDL.g:1199:2: rule__WorkDefinition__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_4_3__1__Impl"
    // InternalPDL.g:1205:1: rule__WorkDefinition__Group_4_3__1__Impl : ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 ) ) ;
    public final void rule__WorkDefinition__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1209:1: ( ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 ) ) )
            // InternalPDL.g:1210:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 ) )
            {
            // InternalPDL.g:1210:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 ) )
            // InternalPDL.g:1211:2: ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_4_3_1()); 
            // InternalPDL.g:1212:2: ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 )
            // InternalPDL.g:1212:3: rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4_3__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__0"
    // InternalPDL.g:1221:1: rule__WorkDefinition__Group_5__0 : rule__WorkDefinition__Group_5__0__Impl rule__WorkDefinition__Group_5__1 ;
    public final void rule__WorkDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1225:1: ( rule__WorkDefinition__Group_5__0__Impl rule__WorkDefinition__Group_5__1 )
            // InternalPDL.g:1226:2: rule__WorkDefinition__Group_5__0__Impl rule__WorkDefinition__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__WorkDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__0"


    // $ANTLR start "rule__WorkDefinition__Group_5__0__Impl"
    // InternalPDL.g:1233:1: rule__WorkDefinition__Group_5__0__Impl : ( 'linksToSuccessors' ) ;
    public final void rule__WorkDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1237:1: ( ( 'linksToSuccessors' ) )
            // InternalPDL.g:1238:1: ( 'linksToSuccessors' )
            {
            // InternalPDL.g:1238:1: ( 'linksToSuccessors' )
            // InternalPDL.g:1239:2: 'linksToSuccessors'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__1"
    // InternalPDL.g:1248:1: rule__WorkDefinition__Group_5__1 : rule__WorkDefinition__Group_5__1__Impl rule__WorkDefinition__Group_5__2 ;
    public final void rule__WorkDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1252:1: ( rule__WorkDefinition__Group_5__1__Impl rule__WorkDefinition__Group_5__2 )
            // InternalPDL.g:1253:2: rule__WorkDefinition__Group_5__1__Impl rule__WorkDefinition__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__1"


    // $ANTLR start "rule__WorkDefinition__Group_5__1__Impl"
    // InternalPDL.g:1260:1: rule__WorkDefinition__Group_5__1__Impl : ( '(' ) ;
    public final void rule__WorkDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1264:1: ( ( '(' ) )
            // InternalPDL.g:1265:1: ( '(' )
            {
            // InternalPDL.g:1265:1: ( '(' )
            // InternalPDL.g:1266:2: '('
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__2"
    // InternalPDL.g:1275:1: rule__WorkDefinition__Group_5__2 : rule__WorkDefinition__Group_5__2__Impl rule__WorkDefinition__Group_5__3 ;
    public final void rule__WorkDefinition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1279:1: ( rule__WorkDefinition__Group_5__2__Impl rule__WorkDefinition__Group_5__3 )
            // InternalPDL.g:1280:2: rule__WorkDefinition__Group_5__2__Impl rule__WorkDefinition__Group_5__3
            {
            pushFollow(FOLLOW_14);
            rule__WorkDefinition__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__2"


    // $ANTLR start "rule__WorkDefinition__Group_5__2__Impl"
    // InternalPDL.g:1287:1: rule__WorkDefinition__Group_5__2__Impl : ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 ) ) ;
    public final void rule__WorkDefinition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1291:1: ( ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 ) ) )
            // InternalPDL.g:1292:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 ) )
            {
            // InternalPDL.g:1292:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 ) )
            // InternalPDL.g:1293:2: ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_5_2()); 
            // InternalPDL.g:1294:2: ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 )
            // InternalPDL.g:1294:3: rule__WorkDefinition__LinksToSuccessorsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinksToSuccessorsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__3"
    // InternalPDL.g:1302:1: rule__WorkDefinition__Group_5__3 : rule__WorkDefinition__Group_5__3__Impl rule__WorkDefinition__Group_5__4 ;
    public final void rule__WorkDefinition__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1306:1: ( rule__WorkDefinition__Group_5__3__Impl rule__WorkDefinition__Group_5__4 )
            // InternalPDL.g:1307:2: rule__WorkDefinition__Group_5__3__Impl rule__WorkDefinition__Group_5__4
            {
            pushFollow(FOLLOW_14);
            rule__WorkDefinition__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__3"


    // $ANTLR start "rule__WorkDefinition__Group_5__3__Impl"
    // InternalPDL.g:1314:1: rule__WorkDefinition__Group_5__3__Impl : ( ( rule__WorkDefinition__Group_5_3__0 )* ) ;
    public final void rule__WorkDefinition__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1318:1: ( ( ( rule__WorkDefinition__Group_5_3__0 )* ) )
            // InternalPDL.g:1319:1: ( ( rule__WorkDefinition__Group_5_3__0 )* )
            {
            // InternalPDL.g:1319:1: ( ( rule__WorkDefinition__Group_5_3__0 )* )
            // InternalPDL.g:1320:2: ( rule__WorkDefinition__Group_5_3__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_5_3()); 
            // InternalPDL.g:1321:2: ( rule__WorkDefinition__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPDL.g:1321:3: rule__WorkDefinition__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__WorkDefinition__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__4"
    // InternalPDL.g:1329:1: rule__WorkDefinition__Group_5__4 : rule__WorkDefinition__Group_5__4__Impl ;
    public final void rule__WorkDefinition__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1333:1: ( rule__WorkDefinition__Group_5__4__Impl )
            // InternalPDL.g:1334:2: rule__WorkDefinition__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__4"


    // $ANTLR start "rule__WorkDefinition__Group_5__4__Impl"
    // InternalPDL.g:1340:1: rule__WorkDefinition__Group_5__4__Impl : ( ')' ) ;
    public final void rule__WorkDefinition__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1344:1: ( ( ')' ) )
            // InternalPDL.g:1345:1: ( ')' )
            {
            // InternalPDL.g:1345:1: ( ')' )
            // InternalPDL.g:1346:2: ')'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_5_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5_3__0"
    // InternalPDL.g:1356:1: rule__WorkDefinition__Group_5_3__0 : rule__WorkDefinition__Group_5_3__0__Impl rule__WorkDefinition__Group_5_3__1 ;
    public final void rule__WorkDefinition__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1360:1: ( rule__WorkDefinition__Group_5_3__0__Impl rule__WorkDefinition__Group_5_3__1 )
            // InternalPDL.g:1361:2: rule__WorkDefinition__Group_5_3__0__Impl rule__WorkDefinition__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_5_3__0__Impl"
    // InternalPDL.g:1368:1: rule__WorkDefinition__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1372:1: ( ( ',' ) )
            // InternalPDL.g:1373:1: ( ',' )
            {
            // InternalPDL.g:1373:1: ( ',' )
            // InternalPDL.g:1374:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5_3__1"
    // InternalPDL.g:1383:1: rule__WorkDefinition__Group_5_3__1 : rule__WorkDefinition__Group_5_3__1__Impl ;
    public final void rule__WorkDefinition__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1387:1: ( rule__WorkDefinition__Group_5_3__1__Impl )
            // InternalPDL.g:1388:2: rule__WorkDefinition__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_5_3__1__Impl"
    // InternalPDL.g:1394:1: rule__WorkDefinition__Group_5_3__1__Impl : ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 ) ) ;
    public final void rule__WorkDefinition__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1398:1: ( ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 ) ) )
            // InternalPDL.g:1399:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 ) )
            {
            // InternalPDL.g:1399:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 ) )
            // InternalPDL.g:1400:2: ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_5_3_1()); 
            // InternalPDL.g:1401:2: ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 )
            // InternalPDL.g:1401:3: rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5_3__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__0"
    // InternalPDL.g:1410:1: rule__WorkDefinition__Group_6__0 : rule__WorkDefinition__Group_6__0__Impl rule__WorkDefinition__Group_6__1 ;
    public final void rule__WorkDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1414:1: ( rule__WorkDefinition__Group_6__0__Impl rule__WorkDefinition__Group_6__1 )
            // InternalPDL.g:1415:2: rule__WorkDefinition__Group_6__0__Impl rule__WorkDefinition__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__WorkDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__0"


    // $ANTLR start "rule__WorkDefinition__Group_6__0__Impl"
    // InternalPDL.g:1422:1: rule__WorkDefinition__Group_6__0__Impl : ( 'usefulRessources' ) ;
    public final void rule__WorkDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1426:1: ( ( 'usefulRessources' ) )
            // InternalPDL.g:1427:1: ( 'usefulRessources' )
            {
            // InternalPDL.g:1427:1: ( 'usefulRessources' )
            // InternalPDL.g:1428:2: 'usefulRessources'
            {
             before(grammarAccess.getWorkDefinitionAccess().getUsefulRessourcesKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getUsefulRessourcesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__1"
    // InternalPDL.g:1437:1: rule__WorkDefinition__Group_6__1 : rule__WorkDefinition__Group_6__1__Impl rule__WorkDefinition__Group_6__2 ;
    public final void rule__WorkDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1441:1: ( rule__WorkDefinition__Group_6__1__Impl rule__WorkDefinition__Group_6__2 )
            // InternalPDL.g:1442:2: rule__WorkDefinition__Group_6__1__Impl rule__WorkDefinition__Group_6__2
            {
            pushFollow(FOLLOW_15);
            rule__WorkDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__1"


    // $ANTLR start "rule__WorkDefinition__Group_6__1__Impl"
    // InternalPDL.g:1449:1: rule__WorkDefinition__Group_6__1__Impl : ( '{' ) ;
    public final void rule__WorkDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1453:1: ( ( '{' ) )
            // InternalPDL.g:1454:1: ( '{' )
            {
            // InternalPDL.g:1454:1: ( '{' )
            // InternalPDL.g:1455:2: '{'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__2"
    // InternalPDL.g:1464:1: rule__WorkDefinition__Group_6__2 : rule__WorkDefinition__Group_6__2__Impl rule__WorkDefinition__Group_6__3 ;
    public final void rule__WorkDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1468:1: ( rule__WorkDefinition__Group_6__2__Impl rule__WorkDefinition__Group_6__3 )
            // InternalPDL.g:1469:2: rule__WorkDefinition__Group_6__2__Impl rule__WorkDefinition__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__WorkDefinition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__2"


    // $ANTLR start "rule__WorkDefinition__Group_6__2__Impl"
    // InternalPDL.g:1476:1: rule__WorkDefinition__Group_6__2__Impl : ( ( rule__WorkDefinition__UsefulRessourcesAssignment_6_2 ) ) ;
    public final void rule__WorkDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1480:1: ( ( ( rule__WorkDefinition__UsefulRessourcesAssignment_6_2 ) ) )
            // InternalPDL.g:1481:1: ( ( rule__WorkDefinition__UsefulRessourcesAssignment_6_2 ) )
            {
            // InternalPDL.g:1481:1: ( ( rule__WorkDefinition__UsefulRessourcesAssignment_6_2 ) )
            // InternalPDL.g:1482:2: ( rule__WorkDefinition__UsefulRessourcesAssignment_6_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getUsefulRessourcesAssignment_6_2()); 
            // InternalPDL.g:1483:2: ( rule__WorkDefinition__UsefulRessourcesAssignment_6_2 )
            // InternalPDL.g:1483:3: rule__WorkDefinition__UsefulRessourcesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__UsefulRessourcesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getUsefulRessourcesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__3"
    // InternalPDL.g:1491:1: rule__WorkDefinition__Group_6__3 : rule__WorkDefinition__Group_6__3__Impl rule__WorkDefinition__Group_6__4 ;
    public final void rule__WorkDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1495:1: ( rule__WorkDefinition__Group_6__3__Impl rule__WorkDefinition__Group_6__4 )
            // InternalPDL.g:1496:2: rule__WorkDefinition__Group_6__3__Impl rule__WorkDefinition__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__WorkDefinition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__3"


    // $ANTLR start "rule__WorkDefinition__Group_6__3__Impl"
    // InternalPDL.g:1503:1: rule__WorkDefinition__Group_6__3__Impl : ( ( rule__WorkDefinition__Group_6_3__0 )* ) ;
    public final void rule__WorkDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1507:1: ( ( ( rule__WorkDefinition__Group_6_3__0 )* ) )
            // InternalPDL.g:1508:1: ( ( rule__WorkDefinition__Group_6_3__0 )* )
            {
            // InternalPDL.g:1508:1: ( ( rule__WorkDefinition__Group_6_3__0 )* )
            // InternalPDL.g:1509:2: ( rule__WorkDefinition__Group_6_3__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_6_3()); 
            // InternalPDL.g:1510:2: ( rule__WorkDefinition__Group_6_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPDL.g:1510:3: rule__WorkDefinition__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__WorkDefinition__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__4"
    // InternalPDL.g:1518:1: rule__WorkDefinition__Group_6__4 : rule__WorkDefinition__Group_6__4__Impl ;
    public final void rule__WorkDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1522:1: ( rule__WorkDefinition__Group_6__4__Impl )
            // InternalPDL.g:1523:2: rule__WorkDefinition__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__4"


    // $ANTLR start "rule__WorkDefinition__Group_6__4__Impl"
    // InternalPDL.g:1529:1: rule__WorkDefinition__Group_6__4__Impl : ( '}' ) ;
    public final void rule__WorkDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1533:1: ( ( '}' ) )
            // InternalPDL.g:1534:1: ( '}' )
            {
            // InternalPDL.g:1534:1: ( '}' )
            // InternalPDL.g:1535:2: '}'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__0"
    // InternalPDL.g:1545:1: rule__WorkDefinition__Group_6_3__0 : rule__WorkDefinition__Group_6_3__0__Impl rule__WorkDefinition__Group_6_3__1 ;
    public final void rule__WorkDefinition__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1549:1: ( rule__WorkDefinition__Group_6_3__0__Impl rule__WorkDefinition__Group_6_3__1 )
            // InternalPDL.g:1550:2: rule__WorkDefinition__Group_6_3__0__Impl rule__WorkDefinition__Group_6_3__1
            {
            pushFollow(FOLLOW_15);
            rule__WorkDefinition__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__0__Impl"
    // InternalPDL.g:1557:1: rule__WorkDefinition__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1561:1: ( ( ',' ) )
            // InternalPDL.g:1562:1: ( ',' )
            {
            // InternalPDL.g:1562:1: ( ',' )
            // InternalPDL.g:1563:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_6_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__1"
    // InternalPDL.g:1572:1: rule__WorkDefinition__Group_6_3__1 : rule__WorkDefinition__Group_6_3__1__Impl ;
    public final void rule__WorkDefinition__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1576:1: ( rule__WorkDefinition__Group_6_3__1__Impl )
            // InternalPDL.g:1577:2: rule__WorkDefinition__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__1__Impl"
    // InternalPDL.g:1583:1: rule__WorkDefinition__Group_6_3__1__Impl : ( ( rule__WorkDefinition__UsefulRessourcesAssignment_6_3_1 ) ) ;
    public final void rule__WorkDefinition__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1587:1: ( ( ( rule__WorkDefinition__UsefulRessourcesAssignment_6_3_1 ) ) )
            // InternalPDL.g:1588:1: ( ( rule__WorkDefinition__UsefulRessourcesAssignment_6_3_1 ) )
            {
            // InternalPDL.g:1588:1: ( ( rule__WorkDefinition__UsefulRessourcesAssignment_6_3_1 ) )
            // InternalPDL.g:1589:2: ( rule__WorkDefinition__UsefulRessourcesAssignment_6_3_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getUsefulRessourcesAssignment_6_3_1()); 
            // InternalPDL.g:1590:2: ( rule__WorkDefinition__UsefulRessourcesAssignment_6_3_1 )
            // InternalPDL.g:1590:3: rule__WorkDefinition__UsefulRessourcesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__UsefulRessourcesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getUsefulRessourcesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6_3__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDL.g:1599:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1603:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDL.g:1604:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalPDL.g:1611:1: rule__WorkSequence__Group__0__Impl : ( 'WorkSequence' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1615:1: ( ( 'WorkSequence' ) )
            // InternalPDL.g:1616:1: ( 'WorkSequence' )
            {
            // InternalPDL.g:1616:1: ( 'WorkSequence' )
            // InternalPDL.g:1617:2: 'WorkSequence'
            {
             before(grammarAccess.getWorkSequenceAccess().getWorkSequenceKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getWorkSequenceKeyword_0()); 

            }


            }

        }
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
    // InternalPDL.g:1626:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1630:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDL.g:1631:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalPDL.g:1638:1: rule__WorkSequence__Group__1__Impl : ( '{' ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1642:1: ( ( '{' ) )
            // InternalPDL.g:1643:1: ( '{' )
            {
            // InternalPDL.g:1643:1: ( '{' )
            // InternalPDL.g:1644:2: '{'
            {
             before(grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalPDL.g:1653:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1657:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalPDL.g:1658:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalPDL.g:1665:1: rule__WorkSequence__Group__2__Impl : ( 'linkType' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1669:1: ( ( 'linkType' ) )
            // InternalPDL.g:1670:1: ( 'linkType' )
            {
            // InternalPDL.g:1670:1: ( 'linkType' )
            // InternalPDL.g:1671:2: 'linkType'
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getLinkTypeKeyword_2()); 

            }


            }

        }
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
    // InternalPDL.g:1680:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1684:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalPDL.g:1685:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalPDL.g:1692:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1696:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_3 ) ) )
            // InternalPDL.g:1697:1: ( ( rule__WorkSequence__LinkTypeAssignment_3 ) )
            {
            // InternalPDL.g:1697:1: ( ( rule__WorkSequence__LinkTypeAssignment_3 ) )
            // InternalPDL.g:1698:2: ( rule__WorkSequence__LinkTypeAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_3()); 
            // InternalPDL.g:1699:2: ( rule__WorkSequence__LinkTypeAssignment_3 )
            // InternalPDL.g:1699:3: rule__WorkSequence__LinkTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_3()); 

            }


            }

        }
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
    // InternalPDL.g:1707:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1711:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // InternalPDL.g:1712:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalPDL.g:1719:1: rule__WorkSequence__Group__4__Impl : ( 'predecessor' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1723:1: ( ( 'predecessor' ) )
            // InternalPDL.g:1724:1: ( 'predecessor' )
            {
            // InternalPDL.g:1724:1: ( 'predecessor' )
            // InternalPDL.g:1725:2: 'predecessor'
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorKeyword_4()); 

            }


            }

        }
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
    // InternalPDL.g:1734:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6 ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1738:1: ( rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6 )
            // InternalPDL.g:1739:2: rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__WorkSequence__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__6();

            state._fsp--;


            }

        }
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
    // InternalPDL.g:1746:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__PredecessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1750:1: ( ( ( rule__WorkSequence__PredecessorAssignment_5 ) ) )
            // InternalPDL.g:1751:1: ( ( rule__WorkSequence__PredecessorAssignment_5 ) )
            {
            // InternalPDL.g:1751:1: ( ( rule__WorkSequence__PredecessorAssignment_5 ) )
            // InternalPDL.g:1752:2: ( rule__WorkSequence__PredecessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_5()); 
            // InternalPDL.g:1753:2: ( rule__WorkSequence__PredecessorAssignment_5 )
            // InternalPDL.g:1753:3: rule__WorkSequence__PredecessorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__WorkSequence__Group__6"
    // InternalPDL.g:1761:1: rule__WorkSequence__Group__6 : rule__WorkSequence__Group__6__Impl rule__WorkSequence__Group__7 ;
    public final void rule__WorkSequence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1765:1: ( rule__WorkSequence__Group__6__Impl rule__WorkSequence__Group__7 )
            // InternalPDL.g:1766:2: rule__WorkSequence__Group__6__Impl rule__WorkSequence__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__WorkSequence__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__6"


    // $ANTLR start "rule__WorkSequence__Group__6__Impl"
    // InternalPDL.g:1773:1: rule__WorkSequence__Group__6__Impl : ( 'successor' ) ;
    public final void rule__WorkSequence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1777:1: ( ( 'successor' ) )
            // InternalPDL.g:1778:1: ( 'successor' )
            {
            // InternalPDL.g:1778:1: ( 'successor' )
            // InternalPDL.g:1779:2: 'successor'
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__6__Impl"


    // $ANTLR start "rule__WorkSequence__Group__7"
    // InternalPDL.g:1788:1: rule__WorkSequence__Group__7 : rule__WorkSequence__Group__7__Impl rule__WorkSequence__Group__8 ;
    public final void rule__WorkSequence__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1792:1: ( rule__WorkSequence__Group__7__Impl rule__WorkSequence__Group__8 )
            // InternalPDL.g:1793:2: rule__WorkSequence__Group__7__Impl rule__WorkSequence__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__WorkSequence__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__7"


    // $ANTLR start "rule__WorkSequence__Group__7__Impl"
    // InternalPDL.g:1800:1: rule__WorkSequence__Group__7__Impl : ( ( rule__WorkSequence__SuccessorAssignment_7 ) ) ;
    public final void rule__WorkSequence__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1804:1: ( ( ( rule__WorkSequence__SuccessorAssignment_7 ) ) )
            // InternalPDL.g:1805:1: ( ( rule__WorkSequence__SuccessorAssignment_7 ) )
            {
            // InternalPDL.g:1805:1: ( ( rule__WorkSequence__SuccessorAssignment_7 ) )
            // InternalPDL.g:1806:2: ( rule__WorkSequence__SuccessorAssignment_7 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_7()); 
            // InternalPDL.g:1807:2: ( rule__WorkSequence__SuccessorAssignment_7 )
            // InternalPDL.g:1807:3: rule__WorkSequence__SuccessorAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__7__Impl"


    // $ANTLR start "rule__WorkSequence__Group__8"
    // InternalPDL.g:1815:1: rule__WorkSequence__Group__8 : rule__WorkSequence__Group__8__Impl ;
    public final void rule__WorkSequence__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1819:1: ( rule__WorkSequence__Group__8__Impl )
            // InternalPDL.g:1820:2: rule__WorkSequence__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__8"


    // $ANTLR start "rule__WorkSequence__Group__8__Impl"
    // InternalPDL.g:1826:1: rule__WorkSequence__Group__8__Impl : ( '}' ) ;
    public final void rule__WorkSequence__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1830:1: ( ( '}' ) )
            // InternalPDL.g:1831:1: ( '}' )
            {
            // InternalPDL.g:1831:1: ( '}' )
            // InternalPDL.g:1832:2: '}'
            {
             before(grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__8__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalPDL.g:1842:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1846:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalPDL.g:1847:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalPDL.g:1854:1: rule__Guidance__Group__0__Impl : ( () ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1858:1: ( ( () ) )
            // InternalPDL.g:1859:1: ( () )
            {
            // InternalPDL.g:1859:1: ( () )
            // InternalPDL.g:1860:2: ()
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceAction_0()); 
            // InternalPDL.g:1861:2: ()
            // InternalPDL.g:1861:3: 
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
    // InternalPDL.g:1869:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1873:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // InternalPDL.g:1874:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalPDL.g:1881:1: rule__Guidance__Group__1__Impl : ( 'Guidance' ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1885:1: ( ( 'Guidance' ) )
            // InternalPDL.g:1886:1: ( 'Guidance' )
            {
            // InternalPDL.g:1886:1: ( 'Guidance' )
            // InternalPDL.g:1887:2: 'Guidance'
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getGuidanceKeyword_1()); 

            }


            }

        }
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
    // InternalPDL.g:1896:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl rule__Guidance__Group__3 ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1900:1: ( rule__Guidance__Group__2__Impl rule__Guidance__Group__3 )
            // InternalPDL.g:1901:2: rule__Guidance__Group__2__Impl rule__Guidance__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Guidance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__3();

            state._fsp--;


            }

        }
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
    // InternalPDL.g:1908:1: rule__Guidance__Group__2__Impl : ( '{' ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1912:1: ( ( '{' ) )
            // InternalPDL.g:1913:1: ( '{' )
            {
            // InternalPDL.g:1913:1: ( '{' )
            // InternalPDL.g:1914:2: '{'
            {
             before(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Guidance__Group__3"
    // InternalPDL.g:1923:1: rule__Guidance__Group__3 : rule__Guidance__Group__3__Impl rule__Guidance__Group__4 ;
    public final void rule__Guidance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1927:1: ( rule__Guidance__Group__3__Impl rule__Guidance__Group__4 )
            // InternalPDL.g:1928:2: rule__Guidance__Group__3__Impl rule__Guidance__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Guidance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__3"


    // $ANTLR start "rule__Guidance__Group__3__Impl"
    // InternalPDL.g:1935:1: rule__Guidance__Group__3__Impl : ( ( rule__Guidance__Group_3__0 )? ) ;
    public final void rule__Guidance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1939:1: ( ( ( rule__Guidance__Group_3__0 )? ) )
            // InternalPDL.g:1940:1: ( ( rule__Guidance__Group_3__0 )? )
            {
            // InternalPDL.g:1940:1: ( ( rule__Guidance__Group_3__0 )? )
            // InternalPDL.g:1941:2: ( rule__Guidance__Group_3__0 )?
            {
             before(grammarAccess.getGuidanceAccess().getGroup_3()); 
            // InternalPDL.g:1942:2: ( rule__Guidance__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPDL.g:1942:3: rule__Guidance__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Guidance__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuidanceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__3__Impl"


    // $ANTLR start "rule__Guidance__Group__4"
    // InternalPDL.g:1950:1: rule__Guidance__Group__4 : rule__Guidance__Group__4__Impl rule__Guidance__Group__5 ;
    public final void rule__Guidance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1954:1: ( rule__Guidance__Group__4__Impl rule__Guidance__Group__5 )
            // InternalPDL.g:1955:2: rule__Guidance__Group__4__Impl rule__Guidance__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Guidance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__4"


    // $ANTLR start "rule__Guidance__Group__4__Impl"
    // InternalPDL.g:1962:1: rule__Guidance__Group__4__Impl : ( ( rule__Guidance__Group_4__0 )? ) ;
    public final void rule__Guidance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1966:1: ( ( ( rule__Guidance__Group_4__0 )? ) )
            // InternalPDL.g:1967:1: ( ( rule__Guidance__Group_4__0 )? )
            {
            // InternalPDL.g:1967:1: ( ( rule__Guidance__Group_4__0 )? )
            // InternalPDL.g:1968:2: ( rule__Guidance__Group_4__0 )?
            {
             before(grammarAccess.getGuidanceAccess().getGroup_4()); 
            // InternalPDL.g:1969:2: ( rule__Guidance__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPDL.g:1969:3: rule__Guidance__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Guidance__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuidanceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__4__Impl"


    // $ANTLR start "rule__Guidance__Group__5"
    // InternalPDL.g:1977:1: rule__Guidance__Group__5 : rule__Guidance__Group__5__Impl ;
    public final void rule__Guidance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1981:1: ( rule__Guidance__Group__5__Impl )
            // InternalPDL.g:1982:2: rule__Guidance__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__5"


    // $ANTLR start "rule__Guidance__Group__5__Impl"
    // InternalPDL.g:1988:1: rule__Guidance__Group__5__Impl : ( '}' ) ;
    public final void rule__Guidance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1992:1: ( ( '}' ) )
            // InternalPDL.g:1993:1: ( '}' )
            {
            // InternalPDL.g:1993:1: ( '}' )
            // InternalPDL.g:1994:2: '}'
            {
             before(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__5__Impl"


    // $ANTLR start "rule__Guidance__Group_3__0"
    // InternalPDL.g:2004:1: rule__Guidance__Group_3__0 : rule__Guidance__Group_3__0__Impl rule__Guidance__Group_3__1 ;
    public final void rule__Guidance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2008:1: ( rule__Guidance__Group_3__0__Impl rule__Guidance__Group_3__1 )
            // InternalPDL.g:2009:2: rule__Guidance__Group_3__0__Impl rule__Guidance__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Guidance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_3__0"


    // $ANTLR start "rule__Guidance__Group_3__0__Impl"
    // InternalPDL.g:2016:1: rule__Guidance__Group_3__0__Impl : ( 'text' ) ;
    public final void rule__Guidance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2020:1: ( ( 'text' ) )
            // InternalPDL.g:2021:1: ( 'text' )
            {
            // InternalPDL.g:2021:1: ( 'text' )
            // InternalPDL.g:2022:2: 'text'
            {
             before(grammarAccess.getGuidanceAccess().getTextKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getTextKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_3__0__Impl"


    // $ANTLR start "rule__Guidance__Group_3__1"
    // InternalPDL.g:2031:1: rule__Guidance__Group_3__1 : rule__Guidance__Group_3__1__Impl ;
    public final void rule__Guidance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2035:1: ( rule__Guidance__Group_3__1__Impl )
            // InternalPDL.g:2036:2: rule__Guidance__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_3__1"


    // $ANTLR start "rule__Guidance__Group_3__1__Impl"
    // InternalPDL.g:2042:1: rule__Guidance__Group_3__1__Impl : ( ( rule__Guidance__TextAssignment_3_1 ) ) ;
    public final void rule__Guidance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2046:1: ( ( ( rule__Guidance__TextAssignment_3_1 ) ) )
            // InternalPDL.g:2047:1: ( ( rule__Guidance__TextAssignment_3_1 ) )
            {
            // InternalPDL.g:2047:1: ( ( rule__Guidance__TextAssignment_3_1 ) )
            // InternalPDL.g:2048:2: ( rule__Guidance__TextAssignment_3_1 )
            {
             before(grammarAccess.getGuidanceAccess().getTextAssignment_3_1()); 
            // InternalPDL.g:2049:2: ( rule__Guidance__TextAssignment_3_1 )
            // InternalPDL.g:2049:3: rule__Guidance__TextAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__TextAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTextAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_3__1__Impl"


    // $ANTLR start "rule__Guidance__Group_4__0"
    // InternalPDL.g:2058:1: rule__Guidance__Group_4__0 : rule__Guidance__Group_4__0__Impl rule__Guidance__Group_4__1 ;
    public final void rule__Guidance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2062:1: ( rule__Guidance__Group_4__0__Impl rule__Guidance__Group_4__1 )
            // InternalPDL.g:2063:2: rule__Guidance__Group_4__0__Impl rule__Guidance__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Guidance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__0"


    // $ANTLR start "rule__Guidance__Group_4__0__Impl"
    // InternalPDL.g:2070:1: rule__Guidance__Group_4__0__Impl : ( 'elements' ) ;
    public final void rule__Guidance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2074:1: ( ( 'elements' ) )
            // InternalPDL.g:2075:1: ( 'elements' )
            {
            // InternalPDL.g:2075:1: ( 'elements' )
            // InternalPDL.g:2076:2: 'elements'
            {
             before(grammarAccess.getGuidanceAccess().getElementsKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getElementsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__0__Impl"


    // $ANTLR start "rule__Guidance__Group_4__1"
    // InternalPDL.g:2085:1: rule__Guidance__Group_4__1 : rule__Guidance__Group_4__1__Impl rule__Guidance__Group_4__2 ;
    public final void rule__Guidance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2089:1: ( rule__Guidance__Group_4__1__Impl rule__Guidance__Group_4__2 )
            // InternalPDL.g:2090:2: rule__Guidance__Group_4__1__Impl rule__Guidance__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Guidance__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__1"


    // $ANTLR start "rule__Guidance__Group_4__1__Impl"
    // InternalPDL.g:2097:1: rule__Guidance__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Guidance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2101:1: ( ( '(' ) )
            // InternalPDL.g:2102:1: ( '(' )
            {
            // InternalPDL.g:2102:1: ( '(' )
            // InternalPDL.g:2103:2: '('
            {
             before(grammarAccess.getGuidanceAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__1__Impl"


    // $ANTLR start "rule__Guidance__Group_4__2"
    // InternalPDL.g:2112:1: rule__Guidance__Group_4__2 : rule__Guidance__Group_4__2__Impl rule__Guidance__Group_4__3 ;
    public final void rule__Guidance__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2116:1: ( rule__Guidance__Group_4__2__Impl rule__Guidance__Group_4__3 )
            // InternalPDL.g:2117:2: rule__Guidance__Group_4__2__Impl rule__Guidance__Group_4__3
            {
            pushFollow(FOLLOW_14);
            rule__Guidance__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__2"


    // $ANTLR start "rule__Guidance__Group_4__2__Impl"
    // InternalPDL.g:2124:1: rule__Guidance__Group_4__2__Impl : ( ( rule__Guidance__ElementsAssignment_4_2 ) ) ;
    public final void rule__Guidance__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2128:1: ( ( ( rule__Guidance__ElementsAssignment_4_2 ) ) )
            // InternalPDL.g:2129:1: ( ( rule__Guidance__ElementsAssignment_4_2 ) )
            {
            // InternalPDL.g:2129:1: ( ( rule__Guidance__ElementsAssignment_4_2 ) )
            // InternalPDL.g:2130:2: ( rule__Guidance__ElementsAssignment_4_2 )
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_4_2()); 
            // InternalPDL.g:2131:2: ( rule__Guidance__ElementsAssignment_4_2 )
            // InternalPDL.g:2131:3: rule__Guidance__ElementsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__ElementsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__2__Impl"


    // $ANTLR start "rule__Guidance__Group_4__3"
    // InternalPDL.g:2139:1: rule__Guidance__Group_4__3 : rule__Guidance__Group_4__3__Impl rule__Guidance__Group_4__4 ;
    public final void rule__Guidance__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2143:1: ( rule__Guidance__Group_4__3__Impl rule__Guidance__Group_4__4 )
            // InternalPDL.g:2144:2: rule__Guidance__Group_4__3__Impl rule__Guidance__Group_4__4
            {
            pushFollow(FOLLOW_14);
            rule__Guidance__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__3"


    // $ANTLR start "rule__Guidance__Group_4__3__Impl"
    // InternalPDL.g:2151:1: rule__Guidance__Group_4__3__Impl : ( ( rule__Guidance__Group_4_3__0 )* ) ;
    public final void rule__Guidance__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2155:1: ( ( ( rule__Guidance__Group_4_3__0 )* ) )
            // InternalPDL.g:2156:1: ( ( rule__Guidance__Group_4_3__0 )* )
            {
            // InternalPDL.g:2156:1: ( ( rule__Guidance__Group_4_3__0 )* )
            // InternalPDL.g:2157:2: ( rule__Guidance__Group_4_3__0 )*
            {
             before(grammarAccess.getGuidanceAccess().getGroup_4_3()); 
            // InternalPDL.g:2158:2: ( rule__Guidance__Group_4_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPDL.g:2158:3: rule__Guidance__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Guidance__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getGuidanceAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__3__Impl"


    // $ANTLR start "rule__Guidance__Group_4__4"
    // InternalPDL.g:2166:1: rule__Guidance__Group_4__4 : rule__Guidance__Group_4__4__Impl ;
    public final void rule__Guidance__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2170:1: ( rule__Guidance__Group_4__4__Impl )
            // InternalPDL.g:2171:2: rule__Guidance__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__4"


    // $ANTLR start "rule__Guidance__Group_4__4__Impl"
    // InternalPDL.g:2177:1: rule__Guidance__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Guidance__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2181:1: ( ( ')' ) )
            // InternalPDL.g:2182:1: ( ')' )
            {
            // InternalPDL.g:2182:1: ( ')' )
            // InternalPDL.g:2183:2: ')'
            {
             before(grammarAccess.getGuidanceAccess().getRightParenthesisKeyword_4_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__4__Impl"


    // $ANTLR start "rule__Guidance__Group_4_3__0"
    // InternalPDL.g:2193:1: rule__Guidance__Group_4_3__0 : rule__Guidance__Group_4_3__0__Impl rule__Guidance__Group_4_3__1 ;
    public final void rule__Guidance__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2197:1: ( rule__Guidance__Group_4_3__0__Impl rule__Guidance__Group_4_3__1 )
            // InternalPDL.g:2198:2: rule__Guidance__Group_4_3__0__Impl rule__Guidance__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Guidance__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4_3__0"


    // $ANTLR start "rule__Guidance__Group_4_3__0__Impl"
    // InternalPDL.g:2205:1: rule__Guidance__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Guidance__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2209:1: ( ( ',' ) )
            // InternalPDL.g:2210:1: ( ',' )
            {
            // InternalPDL.g:2210:1: ( ',' )
            // InternalPDL.g:2211:2: ','
            {
             before(grammarAccess.getGuidanceAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4_3__0__Impl"


    // $ANTLR start "rule__Guidance__Group_4_3__1"
    // InternalPDL.g:2220:1: rule__Guidance__Group_4_3__1 : rule__Guidance__Group_4_3__1__Impl ;
    public final void rule__Guidance__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2224:1: ( rule__Guidance__Group_4_3__1__Impl )
            // InternalPDL.g:2225:2: rule__Guidance__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4_3__1"


    // $ANTLR start "rule__Guidance__Group_4_3__1__Impl"
    // InternalPDL.g:2231:1: rule__Guidance__Group_4_3__1__Impl : ( ( rule__Guidance__ElementsAssignment_4_3_1 ) ) ;
    public final void rule__Guidance__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2235:1: ( ( ( rule__Guidance__ElementsAssignment_4_3_1 ) ) )
            // InternalPDL.g:2236:1: ( ( rule__Guidance__ElementsAssignment_4_3_1 ) )
            {
            // InternalPDL.g:2236:1: ( ( rule__Guidance__ElementsAssignment_4_3_1 ) )
            // InternalPDL.g:2237:2: ( rule__Guidance__ElementsAssignment_4_3_1 )
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_4_3_1()); 
            // InternalPDL.g:2238:2: ( rule__Guidance__ElementsAssignment_4_3_1 )
            // InternalPDL.g:2238:3: rule__Guidance__ElementsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__ElementsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4_3__1__Impl"


    // $ANTLR start "rule__Ressource__Group__0"
    // InternalPDL.g:2247:1: rule__Ressource__Group__0 : rule__Ressource__Group__0__Impl rule__Ressource__Group__1 ;
    public final void rule__Ressource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2251:1: ( rule__Ressource__Group__0__Impl rule__Ressource__Group__1 )
            // InternalPDL.g:2252:2: rule__Ressource__Group__0__Impl rule__Ressource__Group__1
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
    // InternalPDL.g:2259:1: rule__Ressource__Group__0__Impl : ( 'Ressource' ) ;
    public final void rule__Ressource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2263:1: ( ( 'Ressource' ) )
            // InternalPDL.g:2264:1: ( 'Ressource' )
            {
            // InternalPDL.g:2264:1: ( 'Ressource' )
            // InternalPDL.g:2265:2: 'Ressource'
            {
             before(grammarAccess.getRessourceAccess().getRessourceKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalPDL.g:2274:1: rule__Ressource__Group__1 : rule__Ressource__Group__1__Impl rule__Ressource__Group__2 ;
    public final void rule__Ressource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2278:1: ( rule__Ressource__Group__1__Impl rule__Ressource__Group__2 )
            // InternalPDL.g:2279:2: rule__Ressource__Group__1__Impl rule__Ressource__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalPDL.g:2286:1: rule__Ressource__Group__1__Impl : ( ( rule__Ressource__NameAssignment_1 ) ) ;
    public final void rule__Ressource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2290:1: ( ( ( rule__Ressource__NameAssignment_1 ) ) )
            // InternalPDL.g:2291:1: ( ( rule__Ressource__NameAssignment_1 ) )
            {
            // InternalPDL.g:2291:1: ( ( rule__Ressource__NameAssignment_1 ) )
            // InternalPDL.g:2292:2: ( rule__Ressource__NameAssignment_1 )
            {
             before(grammarAccess.getRessourceAccess().getNameAssignment_1()); 
            // InternalPDL.g:2293:2: ( rule__Ressource__NameAssignment_1 )
            // InternalPDL.g:2293:3: rule__Ressource__NameAssignment_1
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
    // InternalPDL.g:2301:1: rule__Ressource__Group__2 : rule__Ressource__Group__2__Impl rule__Ressource__Group__3 ;
    public final void rule__Ressource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2305:1: ( rule__Ressource__Group__2__Impl rule__Ressource__Group__3 )
            // InternalPDL.g:2306:2: rule__Ressource__Group__2__Impl rule__Ressource__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Ressource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__3();

            state._fsp--;


            }

        }
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
    // InternalPDL.g:2313:1: rule__Ressource__Group__2__Impl : ( '{' ) ;
    public final void rule__Ressource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2317:1: ( ( '{' ) )
            // InternalPDL.g:2318:1: ( '{' )
            {
            // InternalPDL.g:2318:1: ( '{' )
            // InternalPDL.g:2319:2: '{'
            {
             before(grammarAccess.getRessourceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Ressource__Group__3"
    // InternalPDL.g:2328:1: rule__Ressource__Group__3 : rule__Ressource__Group__3__Impl rule__Ressource__Group__4 ;
    public final void rule__Ressource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2332:1: ( rule__Ressource__Group__3__Impl rule__Ressource__Group__4 )
            // InternalPDL.g:2333:2: rule__Ressource__Group__3__Impl rule__Ressource__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Ressource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__3"


    // $ANTLR start "rule__Ressource__Group__3__Impl"
    // InternalPDL.g:2340:1: rule__Ressource__Group__3__Impl : ( 'quantity' ) ;
    public final void rule__Ressource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2344:1: ( ( 'quantity' ) )
            // InternalPDL.g:2345:1: ( 'quantity' )
            {
            // InternalPDL.g:2345:1: ( 'quantity' )
            // InternalPDL.g:2346:2: 'quantity'
            {
             before(grammarAccess.getRessourceAccess().getQuantityKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getQuantityKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__3__Impl"


    // $ANTLR start "rule__Ressource__Group__4"
    // InternalPDL.g:2355:1: rule__Ressource__Group__4 : rule__Ressource__Group__4__Impl rule__Ressource__Group__5 ;
    public final void rule__Ressource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2359:1: ( rule__Ressource__Group__4__Impl rule__Ressource__Group__5 )
            // InternalPDL.g:2360:2: rule__Ressource__Group__4__Impl rule__Ressource__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Ressource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__4"


    // $ANTLR start "rule__Ressource__Group__4__Impl"
    // InternalPDL.g:2367:1: rule__Ressource__Group__4__Impl : ( ( rule__Ressource__QuantityAssignment_4 ) ) ;
    public final void rule__Ressource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2371:1: ( ( ( rule__Ressource__QuantityAssignment_4 ) ) )
            // InternalPDL.g:2372:1: ( ( rule__Ressource__QuantityAssignment_4 ) )
            {
            // InternalPDL.g:2372:1: ( ( rule__Ressource__QuantityAssignment_4 ) )
            // InternalPDL.g:2373:2: ( rule__Ressource__QuantityAssignment_4 )
            {
             before(grammarAccess.getRessourceAccess().getQuantityAssignment_4()); 
            // InternalPDL.g:2374:2: ( rule__Ressource__QuantityAssignment_4 )
            // InternalPDL.g:2374:3: rule__Ressource__QuantityAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__QuantityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getQuantityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__4__Impl"


    // $ANTLR start "rule__Ressource__Group__5"
    // InternalPDL.g:2382:1: rule__Ressource__Group__5 : rule__Ressource__Group__5__Impl ;
    public final void rule__Ressource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2386:1: ( rule__Ressource__Group__5__Impl )
            // InternalPDL.g:2387:2: rule__Ressource__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__5"


    // $ANTLR start "rule__Ressource__Group__5__Impl"
    // InternalPDL.g:2393:1: rule__Ressource__Group__5__Impl : ( '}' ) ;
    public final void rule__Ressource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2397:1: ( ( '}' ) )
            // InternalPDL.g:2398:1: ( '}' )
            {
            // InternalPDL.g:2398:1: ( '}' )
            // InternalPDL.g:2399:2: '}'
            {
             before(grammarAccess.getRessourceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__5__Impl"


    // $ANTLR start "rule__UsefulRessource__Group__0"
    // InternalPDL.g:2409:1: rule__UsefulRessource__Group__0 : rule__UsefulRessource__Group__0__Impl rule__UsefulRessource__Group__1 ;
    public final void rule__UsefulRessource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2413:1: ( rule__UsefulRessource__Group__0__Impl rule__UsefulRessource__Group__1 )
            // InternalPDL.g:2414:2: rule__UsefulRessource__Group__0__Impl rule__UsefulRessource__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalPDL.g:2421:1: rule__UsefulRessource__Group__0__Impl : ( 'UsefulRessource' ) ;
    public final void rule__UsefulRessource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2425:1: ( ( 'UsefulRessource' ) )
            // InternalPDL.g:2426:1: ( 'UsefulRessource' )
            {
            // InternalPDL.g:2426:1: ( 'UsefulRessource' )
            // InternalPDL.g:2427:2: 'UsefulRessource'
            {
             before(grammarAccess.getUsefulRessourceAccess().getUsefulRessourceKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getUsefulRessourceAccess().getUsefulRessourceKeyword_0()); 

            }


            }

        }
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
    // InternalPDL.g:2436:1: rule__UsefulRessource__Group__1 : rule__UsefulRessource__Group__1__Impl rule__UsefulRessource__Group__2 ;
    public final void rule__UsefulRessource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2440:1: ( rule__UsefulRessource__Group__1__Impl rule__UsefulRessource__Group__2 )
            // InternalPDL.g:2441:2: rule__UsefulRessource__Group__1__Impl rule__UsefulRessource__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalPDL.g:2448:1: rule__UsefulRessource__Group__1__Impl : ( '{' ) ;
    public final void rule__UsefulRessource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2452:1: ( ( '{' ) )
            // InternalPDL.g:2453:1: ( '{' )
            {
            // InternalPDL.g:2453:1: ( '{' )
            // InternalPDL.g:2454:2: '{'
            {
             before(grammarAccess.getUsefulRessourceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUsefulRessourceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalPDL.g:2463:1: rule__UsefulRessource__Group__2 : rule__UsefulRessource__Group__2__Impl rule__UsefulRessource__Group__3 ;
    public final void rule__UsefulRessource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2467:1: ( rule__UsefulRessource__Group__2__Impl rule__UsefulRessource__Group__3 )
            // InternalPDL.g:2468:2: rule__UsefulRessource__Group__2__Impl rule__UsefulRessource__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalPDL.g:2475:1: rule__UsefulRessource__Group__2__Impl : ( 'usefulQuantity' ) ;
    public final void rule__UsefulRessource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2479:1: ( ( 'usefulQuantity' ) )
            // InternalPDL.g:2480:1: ( 'usefulQuantity' )
            {
            // InternalPDL.g:2480:1: ( 'usefulQuantity' )
            // InternalPDL.g:2481:2: 'usefulQuantity'
            {
             before(grammarAccess.getUsefulRessourceAccess().getUsefulQuantityKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getUsefulRessourceAccess().getUsefulQuantityKeyword_2()); 

            }


            }

        }
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
    // InternalPDL.g:2490:1: rule__UsefulRessource__Group__3 : rule__UsefulRessource__Group__3__Impl rule__UsefulRessource__Group__4 ;
    public final void rule__UsefulRessource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2494:1: ( rule__UsefulRessource__Group__3__Impl rule__UsefulRessource__Group__4 )
            // InternalPDL.g:2495:2: rule__UsefulRessource__Group__3__Impl rule__UsefulRessource__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__UsefulRessource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsefulRessource__Group__4();

            state._fsp--;


            }

        }
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
    // InternalPDL.g:2502:1: rule__UsefulRessource__Group__3__Impl : ( ( rule__UsefulRessource__UsefulQuantityAssignment_3 ) ) ;
    public final void rule__UsefulRessource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2506:1: ( ( ( rule__UsefulRessource__UsefulQuantityAssignment_3 ) ) )
            // InternalPDL.g:2507:1: ( ( rule__UsefulRessource__UsefulQuantityAssignment_3 ) )
            {
            // InternalPDL.g:2507:1: ( ( rule__UsefulRessource__UsefulQuantityAssignment_3 ) )
            // InternalPDL.g:2508:2: ( rule__UsefulRessource__UsefulQuantityAssignment_3 )
            {
             before(grammarAccess.getUsefulRessourceAccess().getUsefulQuantityAssignment_3()); 
            // InternalPDL.g:2509:2: ( rule__UsefulRessource__UsefulQuantityAssignment_3 )
            // InternalPDL.g:2509:3: rule__UsefulRessource__UsefulQuantityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UsefulRessource__UsefulQuantityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUsefulRessourceAccess().getUsefulQuantityAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__UsefulRessource__Group__4"
    // InternalPDL.g:2517:1: rule__UsefulRessource__Group__4 : rule__UsefulRessource__Group__4__Impl rule__UsefulRessource__Group__5 ;
    public final void rule__UsefulRessource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2521:1: ( rule__UsefulRessource__Group__4__Impl rule__UsefulRessource__Group__5 )
            // InternalPDL.g:2522:2: rule__UsefulRessource__Group__4__Impl rule__UsefulRessource__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__UsefulRessource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsefulRessource__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__Group__4"


    // $ANTLR start "rule__UsefulRessource__Group__4__Impl"
    // InternalPDL.g:2529:1: rule__UsefulRessource__Group__4__Impl : ( 'ressource' ) ;
    public final void rule__UsefulRessource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2533:1: ( ( 'ressource' ) )
            // InternalPDL.g:2534:1: ( 'ressource' )
            {
            // InternalPDL.g:2534:1: ( 'ressource' )
            // InternalPDL.g:2535:2: 'ressource'
            {
             before(grammarAccess.getUsefulRessourceAccess().getRessourceKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getUsefulRessourceAccess().getRessourceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__Group__4__Impl"


    // $ANTLR start "rule__UsefulRessource__Group__5"
    // InternalPDL.g:2544:1: rule__UsefulRessource__Group__5 : rule__UsefulRessource__Group__5__Impl rule__UsefulRessource__Group__6 ;
    public final void rule__UsefulRessource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2548:1: ( rule__UsefulRessource__Group__5__Impl rule__UsefulRessource__Group__6 )
            // InternalPDL.g:2549:2: rule__UsefulRessource__Group__5__Impl rule__UsefulRessource__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__UsefulRessource__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsefulRessource__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__Group__5"


    // $ANTLR start "rule__UsefulRessource__Group__5__Impl"
    // InternalPDL.g:2556:1: rule__UsefulRessource__Group__5__Impl : ( ( rule__UsefulRessource__RessourceAssignment_5 ) ) ;
    public final void rule__UsefulRessource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2560:1: ( ( ( rule__UsefulRessource__RessourceAssignment_5 ) ) )
            // InternalPDL.g:2561:1: ( ( rule__UsefulRessource__RessourceAssignment_5 ) )
            {
            // InternalPDL.g:2561:1: ( ( rule__UsefulRessource__RessourceAssignment_5 ) )
            // InternalPDL.g:2562:2: ( rule__UsefulRessource__RessourceAssignment_5 )
            {
             before(grammarAccess.getUsefulRessourceAccess().getRessourceAssignment_5()); 
            // InternalPDL.g:2563:2: ( rule__UsefulRessource__RessourceAssignment_5 )
            // InternalPDL.g:2563:3: rule__UsefulRessource__RessourceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__UsefulRessource__RessourceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUsefulRessourceAccess().getRessourceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__Group__5__Impl"


    // $ANTLR start "rule__UsefulRessource__Group__6"
    // InternalPDL.g:2571:1: rule__UsefulRessource__Group__6 : rule__UsefulRessource__Group__6__Impl ;
    public final void rule__UsefulRessource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2575:1: ( rule__UsefulRessource__Group__6__Impl )
            // InternalPDL.g:2576:2: rule__UsefulRessource__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsefulRessource__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__Group__6"


    // $ANTLR start "rule__UsefulRessource__Group__6__Impl"
    // InternalPDL.g:2582:1: rule__UsefulRessource__Group__6__Impl : ( '}' ) ;
    public final void rule__UsefulRessource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2586:1: ( ( '}' ) )
            // InternalPDL.g:2587:1: ( '}' )
            {
            // InternalPDL.g:2587:1: ( '}' )
            // InternalPDL.g:2588:2: '}'
            {
             before(grammarAccess.getUsefulRessourceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUsefulRessourceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__Group__6__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalPDL.g:2598:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2602:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalPDL.g:2603:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalPDL.g:2610:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2614:1: ( ( ( '-' )? ) )
            // InternalPDL.g:2615:1: ( ( '-' )? )
            {
            // InternalPDL.g:2615:1: ( ( '-' )? )
            // InternalPDL.g:2616:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalPDL.g:2617:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPDL.g:2617:3: '-'
                    {
                    match(input,39,FOLLOW_2); 

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
    // InternalPDL.g:2625:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2629:1: ( rule__EInt__Group__1__Impl )
            // InternalPDL.g:2630:2: rule__EInt__Group__1__Impl
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
    // InternalPDL.g:2636:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2640:1: ( ( RULE_INT ) )
            // InternalPDL.g:2641:1: ( RULE_INT )
            {
            // InternalPDL.g:2641:1: ( RULE_INT )
            // InternalPDL.g:2642:2: RULE_INT
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
    // InternalPDL.g:2652:1: rule__Process__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2656:1: ( ( ruleEString ) )
            // InternalPDL.g:2657:2: ( ruleEString )
            {
            // InternalPDL.g:2657:2: ( ruleEString )
            // InternalPDL.g:2658:3: ruleEString
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


    // $ANTLR start "rule__Process__ProcessElementsAssignment_4_2"
    // InternalPDL.g:2667:1: rule__Process__ProcessElementsAssignment_4_2 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2671:1: ( ( ruleProcessElement ) )
            // InternalPDL.g:2672:2: ( ruleProcessElement )
            {
            // InternalPDL.g:2672:2: ( ruleProcessElement )
            // InternalPDL.g:2673:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ProcessElementsAssignment_4_2"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_4_3_1"
    // InternalPDL.g:2682:1: rule__Process__ProcessElementsAssignment_4_3_1 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2686:1: ( ( ruleProcessElement ) )
            // InternalPDL.g:2687:2: ( ruleProcessElement )
            {
            // InternalPDL.g:2687:2: ( ruleProcessElement )
            // InternalPDL.g:2688:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ProcessElementsAssignment_4_3_1"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_2"
    // InternalPDL.g:2697:1: rule__WorkDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__WorkDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2701:1: ( ( ruleEString ) )
            // InternalPDL.g:2702:2: ( ruleEString )
            {
            // InternalPDL.g:2702:2: ( ruleEString )
            // InternalPDL.g:2703:3: ruleEString
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


    // $ANTLR start "rule__WorkDefinition__LinksToPredecessorsAssignment_4_2"
    // InternalPDL.g:2712:1: rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinksToPredecessorsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2716:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2717:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2717:2: ( ( ruleEString ) )
            // InternalPDL.g:2718:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_2_0()); 
            // InternalPDL.g:2719:3: ( ruleEString )
            // InternalPDL.g:2720:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__LinksToPredecessorsAssignment_4_2"


    // $ANTLR start "rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1"
    // InternalPDL.g:2731:1: rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2735:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2736:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2736:2: ( ( ruleEString ) )
            // InternalPDL.g:2737:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_3_1_0()); 
            // InternalPDL.g:2738:3: ( ruleEString )
            // InternalPDL.g:2739:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1"


    // $ANTLR start "rule__WorkDefinition__LinksToSuccessorsAssignment_5_2"
    // InternalPDL.g:2750:1: rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinksToSuccessorsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2754:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2755:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2755:2: ( ( ruleEString ) )
            // InternalPDL.g:2756:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_2_0()); 
            // InternalPDL.g:2757:3: ( ruleEString )
            // InternalPDL.g:2758:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__LinksToSuccessorsAssignment_5_2"


    // $ANTLR start "rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1"
    // InternalPDL.g:2769:1: rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2773:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2774:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2774:2: ( ( ruleEString ) )
            // InternalPDL.g:2775:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_3_1_0()); 
            // InternalPDL.g:2776:3: ( ruleEString )
            // InternalPDL.g:2777:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1"


    // $ANTLR start "rule__WorkDefinition__UsefulRessourcesAssignment_6_2"
    // InternalPDL.g:2788:1: rule__WorkDefinition__UsefulRessourcesAssignment_6_2 : ( ruleUsefulRessource ) ;
    public final void rule__WorkDefinition__UsefulRessourcesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2792:1: ( ( ruleUsefulRessource ) )
            // InternalPDL.g:2793:2: ( ruleUsefulRessource )
            {
            // InternalPDL.g:2793:2: ( ruleUsefulRessource )
            // InternalPDL.g:2794:3: ruleUsefulRessource
            {
             before(grammarAccess.getWorkDefinitionAccess().getUsefulRessourcesUsefulRessourceParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUsefulRessource();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getUsefulRessourcesUsefulRessourceParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__UsefulRessourcesAssignment_6_2"


    // $ANTLR start "rule__WorkDefinition__UsefulRessourcesAssignment_6_3_1"
    // InternalPDL.g:2803:1: rule__WorkDefinition__UsefulRessourcesAssignment_6_3_1 : ( ruleUsefulRessource ) ;
    public final void rule__WorkDefinition__UsefulRessourcesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2807:1: ( ( ruleUsefulRessource ) )
            // InternalPDL.g:2808:2: ( ruleUsefulRessource )
            {
            // InternalPDL.g:2808:2: ( ruleUsefulRessource )
            // InternalPDL.g:2809:3: ruleUsefulRessource
            {
             before(grammarAccess.getWorkDefinitionAccess().getUsefulRessourcesUsefulRessourceParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUsefulRessource();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getUsefulRessourcesUsefulRessourceParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__UsefulRessourcesAssignment_6_3_1"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_3"
    // InternalPDL.g:2818:1: rule__WorkSequence__LinkTypeAssignment_3 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2822:1: ( ( ruleWorkSequenceType ) )
            // InternalPDL.g:2823:2: ( ruleWorkSequenceType )
            {
            // InternalPDL.g:2823:2: ( ruleWorkSequenceType )
            // InternalPDL.g:2824:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_3"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_5"
    // InternalPDL.g:2833:1: rule__WorkSequence__PredecessorAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2837:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2838:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2838:2: ( ( ruleEString ) )
            // InternalPDL.g:2839:3: ( ruleEString )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_5_0()); 
            // InternalPDL.g:2840:3: ( ruleEString )
            // InternalPDL.g:2841:4: ruleEString
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_5"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_7"
    // InternalPDL.g:2852:1: rule__WorkSequence__SuccessorAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2856:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2857:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2857:2: ( ( ruleEString ) )
            // InternalPDL.g:2858:3: ( ruleEString )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_7_0()); 
            // InternalPDL.g:2859:3: ( ruleEString )
            // InternalPDL.g:2860:4: ruleEString
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_7"


    // $ANTLR start "rule__Guidance__TextAssignment_3_1"
    // InternalPDL.g:2871:1: rule__Guidance__TextAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Guidance__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2875:1: ( ( ruleEString ) )
            // InternalPDL.g:2876:2: ( ruleEString )
            {
            // InternalPDL.g:2876:2: ( ruleEString )
            // InternalPDL.g:2877:3: ruleEString
            {
             before(grammarAccess.getGuidanceAccess().getTextEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getTextEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__TextAssignment_3_1"


    // $ANTLR start "rule__Guidance__ElementsAssignment_4_2"
    // InternalPDL.g:2886:1: rule__Guidance__ElementsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Guidance__ElementsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2890:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2891:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2891:2: ( ( ruleEString ) )
            // InternalPDL.g:2892:3: ( ruleEString )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_2_0()); 
            // InternalPDL.g:2893:3: ( ruleEString )
            // InternalPDL.g:2894:4: ruleEString
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__ElementsAssignment_4_2"


    // $ANTLR start "rule__Guidance__ElementsAssignment_4_3_1"
    // InternalPDL.g:2905:1: rule__Guidance__ElementsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Guidance__ElementsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2909:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2910:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2910:2: ( ( ruleEString ) )
            // InternalPDL.g:2911:3: ( ruleEString )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_3_1_0()); 
            // InternalPDL.g:2912:3: ( ruleEString )
            // InternalPDL.g:2913:4: ruleEString
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__ElementsAssignment_4_3_1"


    // $ANTLR start "rule__Ressource__NameAssignment_1"
    // InternalPDL.g:2924:1: rule__Ressource__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Ressource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2928:1: ( ( ruleEString ) )
            // InternalPDL.g:2929:2: ( ruleEString )
            {
            // InternalPDL.g:2929:2: ( ruleEString )
            // InternalPDL.g:2930:3: ruleEString
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


    // $ANTLR start "rule__Ressource__QuantityAssignment_4"
    // InternalPDL.g:2939:1: rule__Ressource__QuantityAssignment_4 : ( ruleEInt ) ;
    public final void rule__Ressource__QuantityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2943:1: ( ( ruleEInt ) )
            // InternalPDL.g:2944:2: ( ruleEInt )
            {
            // InternalPDL.g:2944:2: ( ruleEInt )
            // InternalPDL.g:2945:3: ruleEInt
            {
             before(grammarAccess.getRessourceAccess().getQuantityEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRessourceAccess().getQuantityEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__QuantityAssignment_4"


    // $ANTLR start "rule__UsefulRessource__UsefulQuantityAssignment_3"
    // InternalPDL.g:2954:1: rule__UsefulRessource__UsefulQuantityAssignment_3 : ( ruleEInt ) ;
    public final void rule__UsefulRessource__UsefulQuantityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2958:1: ( ( ruleEInt ) )
            // InternalPDL.g:2959:2: ( ruleEInt )
            {
            // InternalPDL.g:2959:2: ( ruleEInt )
            // InternalPDL.g:2960:3: ruleEInt
            {
             before(grammarAccess.getUsefulRessourceAccess().getUsefulQuantityEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getUsefulRessourceAccess().getUsefulQuantityEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__UsefulQuantityAssignment_3"


    // $ANTLR start "rule__UsefulRessource__RessourceAssignment_5"
    // InternalPDL.g:2969:1: rule__UsefulRessource__RessourceAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__UsefulRessource__RessourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2973:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2974:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2974:2: ( ( ruleEString ) )
            // InternalPDL.g:2975:3: ( ruleEString )
            {
             before(grammarAccess.getUsefulRessourceAccess().getRessourceRessourceCrossReference_5_0()); 
            // InternalPDL.g:2976:3: ( ruleEString )
            // InternalPDL.g:2977:4: ruleEString
            {
             before(grammarAccess.getUsefulRessourceAccess().getRessourceRessourceEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUsefulRessourceAccess().getRessourceRessourceEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getUsefulRessourceAccess().getRessourceRessourceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsefulRessource__RessourceAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000488300000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000006420000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000300020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});

}
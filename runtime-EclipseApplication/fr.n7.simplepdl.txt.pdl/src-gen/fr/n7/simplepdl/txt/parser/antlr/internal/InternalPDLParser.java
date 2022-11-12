package fr.n7.simplepdl.txt.parser.antlr.internal;

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
import fr.n7.simplepdl.txt.services.PDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'}'", "'ProcessElement'", "'wd'", "'ws'", "'from'", "'to'", "'note'", "'ressource'", "'needs'", "'of'", "'-'", "'s2s'", "'f2s'", "'s2f'", "'f2f'"
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

        public InternalPDLParser(TokenStream input, PDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected PDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalPDL.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalPDL.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalPDL.g:66:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL.g:72:1: ruleProcess returns [EObject current=null] : ( () otherlv_1= 'process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_processElements_4_0= ruleProcessElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_processElements_4_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:78:2: ( ( () otherlv_1= 'process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_processElements_4_0= ruleProcessElement ) )* otherlv_5= '}' ) )
            // InternalPDL.g:79:2: ( () otherlv_1= 'process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_processElements_4_0= ruleProcessElement ) )* otherlv_5= '}' )
            {
            // InternalPDL.g:79:2: ( () otherlv_1= 'process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_processElements_4_0= ruleProcessElement ) )* otherlv_5= '}' )
            // InternalPDL.g:80:3: () otherlv_1= 'process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_processElements_4_0= ruleProcessElement ) )* otherlv_5= '}'
            {
            // InternalPDL.g:80:3: ()
            // InternalPDL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcessAccess().getProcessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getProcessKeyword_1());
            		
            // InternalPDL.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPDL.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalPDL.g:92:4: (lv_name_2_0= ruleEString )
            // InternalPDL.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.n7.simplepdl.txt.PDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPDL.g:114:3: ( (lv_processElements_4_0= ruleProcessElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=16)||(LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPDL.g:115:4: (lv_processElements_4_0= ruleProcessElement )
            	    {
            	    // InternalPDL.g:115:4: (lv_processElements_4_0= ruleProcessElement )
            	    // InternalPDL.g:116:5: lv_processElements_4_0= ruleProcessElement
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_processElements_4_0=ruleProcessElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processElements",
            	    						lv_processElements_4_0,
            	    						"fr.n7.simplepdl.txt.PDL.ProcessElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL.g:141:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // InternalPDL.g:141:55: (iv_ruleProcessElement= ruleProcessElement EOF )
            // InternalPDL.g:142:2: iv_ruleProcessElement= ruleProcessElement EOF
            {
             newCompositeNode(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessElement=ruleProcessElement();

            state._fsp--;

             current =iv_ruleProcessElement; 
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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL.g:148:1: ruleProcessElement returns [EObject current=null] : (this_ProcessElement_Impl_0= ruleProcessElement_Impl | this_WorkDefinition_1= ruleWorkDefinition | this_WorkSequence_2= ruleWorkSequence | this_Guidance_3= ruleGuidance | this_Ressource_4= ruleRessource ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_ProcessElement_Impl_0 = null;

        EObject this_WorkDefinition_1 = null;

        EObject this_WorkSequence_2 = null;

        EObject this_Guidance_3 = null;

        EObject this_Ressource_4 = null;



        	enterRule();

        try {
            // InternalPDL.g:154:2: ( (this_ProcessElement_Impl_0= ruleProcessElement_Impl | this_WorkDefinition_1= ruleWorkDefinition | this_WorkSequence_2= ruleWorkSequence | this_Guidance_3= ruleGuidance | this_Ressource_4= ruleRessource ) )
            // InternalPDL.g:155:2: (this_ProcessElement_Impl_0= ruleProcessElement_Impl | this_WorkDefinition_1= ruleWorkDefinition | this_WorkSequence_2= ruleWorkSequence | this_Guidance_3= ruleGuidance | this_Ressource_4= ruleRessource )
            {
            // InternalPDL.g:155:2: (this_ProcessElement_Impl_0= ruleProcessElement_Impl | this_WorkDefinition_1= ruleWorkDefinition | this_WorkSequence_2= ruleWorkSequence | this_Guidance_3= ruleGuidance | this_Ressource_4= ruleRessource )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPDL.g:156:3: this_ProcessElement_Impl_0= ruleProcessElement_Impl
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getProcessElement_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessElement_Impl_0=ruleProcessElement_Impl();

                    state._fsp--;


                    			current = this_ProcessElement_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPDL.g:165:3: this_WorkDefinition_1= ruleWorkDefinition
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkDefinition_1=ruleWorkDefinition();

                    state._fsp--;


                    			current = this_WorkDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPDL.g:174:3: this_WorkSequence_2= ruleWorkSequence
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkSequence_2=ruleWorkSequence();

                    state._fsp--;


                    			current = this_WorkSequence_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPDL.g:183:3: this_Guidance_3= ruleGuidance
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Guidance_3=ruleGuidance();

                    state._fsp--;


                    			current = this_Guidance_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPDL.g:192:3: this_Ressource_4= ruleRessource
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ressource_4=ruleRessource();

                    state._fsp--;


                    			current = this_Ressource_4;
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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleEString"
    // InternalPDL.g:204:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPDL.g:204:47: (iv_ruleEString= ruleEString EOF )
            // InternalPDL.g:205:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPDL.g:211:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPDL.g:217:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPDL.g:218:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPDL.g:218:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalPDL.g:219:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPDL.g:227:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleProcessElement_Impl"
    // InternalPDL.g:238:1: entryRuleProcessElement_Impl returns [EObject current=null] : iv_ruleProcessElement_Impl= ruleProcessElement_Impl EOF ;
    public final EObject entryRuleProcessElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement_Impl = null;


        try {
            // InternalPDL.g:238:60: (iv_ruleProcessElement_Impl= ruleProcessElement_Impl EOF )
            // InternalPDL.g:239:2: iv_ruleProcessElement_Impl= ruleProcessElement_Impl EOF
            {
             newCompositeNode(grammarAccess.getProcessElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessElement_Impl=ruleProcessElement_Impl();

            state._fsp--;

             current =iv_ruleProcessElement_Impl; 
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
    // $ANTLR end "entryRuleProcessElement_Impl"


    // $ANTLR start "ruleProcessElement_Impl"
    // InternalPDL.g:245:1: ruleProcessElement_Impl returns [EObject current=null] : ( () otherlv_1= 'ProcessElement' ) ;
    public final EObject ruleProcessElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPDL.g:251:2: ( ( () otherlv_1= 'ProcessElement' ) )
            // InternalPDL.g:252:2: ( () otherlv_1= 'ProcessElement' )
            {
            // InternalPDL.g:252:2: ( () otherlv_1= 'ProcessElement' )
            // InternalPDL.g:253:3: () otherlv_1= 'ProcessElement'
            {
            // InternalPDL.g:253:3: ()
            // InternalPDL.g:254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcessElement_ImplAccess().getProcessElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessElement_ImplAccess().getProcessElementKeyword_1());
            		

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
    // $ANTLR end "ruleProcessElement_Impl"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL.g:268:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalPDL.g:268:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalPDL.g:269:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL.g:275:1: ruleWorkDefinition returns [EObject current=null] : ( () otherlv_1= 'wd' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_usefulRessources_4_0= ruleUsefulRessource ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_usefulRessources_4_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:281:2: ( ( () otherlv_1= 'wd' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_usefulRessources_4_0= ruleUsefulRessource ) )* otherlv_5= '}' )? ) )
            // InternalPDL.g:282:2: ( () otherlv_1= 'wd' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_usefulRessources_4_0= ruleUsefulRessource ) )* otherlv_5= '}' )? )
            {
            // InternalPDL.g:282:2: ( () otherlv_1= 'wd' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_usefulRessources_4_0= ruleUsefulRessource ) )* otherlv_5= '}' )? )
            // InternalPDL.g:283:3: () otherlv_1= 'wd' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_usefulRessources_4_0= ruleUsefulRessource ) )* otherlv_5= '}' )?
            {
            // InternalPDL.g:283:3: ()
            // InternalPDL.g:284:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkDefinitionAccess().getWdKeyword_1());
            		
            // InternalPDL.g:294:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPDL.g:295:4: (lv_name_2_0= ruleEString )
            {
            // InternalPDL.g:295:4: (lv_name_2_0= ruleEString )
            // InternalPDL.g:296:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.n7.simplepdl.txt.PDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDL.g:313:3: (otherlv_3= '{' ( (lv_usefulRessources_4_0= ruleUsefulRessource ) )* otherlv_5= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPDL.g:314:4: otherlv_3= '{' ( (lv_usefulRessources_4_0= ruleUsefulRessource ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalPDL.g:318:4: ( (lv_usefulRessources_4_0= ruleUsefulRessource ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==21) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPDL.g:319:5: (lv_usefulRessources_4_0= ruleUsefulRessource )
                    	    {
                    	    // InternalPDL.g:319:5: (lv_usefulRessources_4_0= ruleUsefulRessource )
                    	    // InternalPDL.g:320:6: lv_usefulRessources_4_0= ruleUsefulRessource
                    	    {

                    	    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getUsefulRessourcesUsefulRessourceParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_usefulRessources_4_0=ruleUsefulRessource();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"usefulRessources",
                    	    							lv_usefulRessources_4_0,
                    	    							"fr.n7.simplepdl.txt.PDL.UsefulRessource");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_3_2());
                    			

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL.g:346:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalPDL.g:346:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalPDL.g:347:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL.g:353:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_linkType_1_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:359:2: ( (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalPDL.g:360:2: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalPDL.g:360:2: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            // InternalPDL.g:361:3: otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWsKeyword_0());
            		
            // InternalPDL.g:365:3: ( (lv_linkType_1_0= ruleWorkSequenceType ) )
            // InternalPDL.g:366:4: (lv_linkType_1_0= ruleWorkSequenceType )
            {
            // InternalPDL.g:366:4: (lv_linkType_1_0= ruleWorkSequenceType )
            // InternalPDL.g:367:5: lv_linkType_1_0= ruleWorkSequenceType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_linkType_1_0=ruleWorkSequenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"linkType",
            						lv_linkType_1_0,
            						"fr.n7.simplepdl.txt.PDL.WorkSequenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getFromKeyword_2());
            		
            // InternalPDL.g:388:3: ( (otherlv_3= RULE_ID ) )
            // InternalPDL.g:389:4: (otherlv_3= RULE_ID )
            {
            // InternalPDL.g:389:4: (otherlv_3= RULE_ID )
            // InternalPDL.g:390:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getToKeyword_4());
            		
            // InternalPDL.g:405:3: ( (otherlv_5= RULE_ID ) )
            // InternalPDL.g:406:4: (otherlv_5= RULE_ID )
            {
            // InternalPDL.g:406:4: (otherlv_5= RULE_ID )
            // InternalPDL.g:407:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0());
            				

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL.g:422:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalPDL.g:422:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalPDL.g:423:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL.g:429:1: ruleGuidance returns [EObject current=null] : ( () otherlv_1= 'note' ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_2_0=null;


        	enterRule();

        try {
            // InternalPDL.g:435:2: ( ( () otherlv_1= 'note' ( (lv_text_2_0= RULE_STRING ) ) ) )
            // InternalPDL.g:436:2: ( () otherlv_1= 'note' ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // InternalPDL.g:436:2: ( () otherlv_1= 'note' ( (lv_text_2_0= RULE_STRING ) ) )
            // InternalPDL.g:437:3: () otherlv_1= 'note' ( (lv_text_2_0= RULE_STRING ) )
            {
            // InternalPDL.g:437:3: ()
            // InternalPDL.g:438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGuidanceAccess().getGuidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getGuidanceAccess().getNoteKeyword_1());
            		
            // InternalPDL.g:448:3: ( (lv_text_2_0= RULE_STRING ) )
            // InternalPDL.g:449:4: (lv_text_2_0= RULE_STRING )
            {
            // InternalPDL.g:449:4: (lv_text_2_0= RULE_STRING )
            // InternalPDL.g:450:5: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_2_0, grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuidanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_2_0,
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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleRessource"
    // InternalPDL.g:470:1: entryRuleRessource returns [EObject current=null] : iv_ruleRessource= ruleRessource EOF ;
    public final EObject entryRuleRessource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessource = null;


        try {
            // InternalPDL.g:470:50: (iv_ruleRessource= ruleRessource EOF )
            // InternalPDL.g:471:2: iv_ruleRessource= ruleRessource EOF
            {
             newCompositeNode(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRessource=ruleRessource();

            state._fsp--;

             current =iv_ruleRessource; 
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
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalPDL.g:477:1: ruleRessource returns [EObject current=null] : (otherlv_0= 'ressource' ( (lv_name_1_0= ruleEString ) ) ( (lv_quantity_2_0= ruleEInt ) ) ) ;
    public final EObject ruleRessource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_quantity_2_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:483:2: ( (otherlv_0= 'ressource' ( (lv_name_1_0= ruleEString ) ) ( (lv_quantity_2_0= ruleEInt ) ) ) )
            // InternalPDL.g:484:2: (otherlv_0= 'ressource' ( (lv_name_1_0= ruleEString ) ) ( (lv_quantity_2_0= ruleEInt ) ) )
            {
            // InternalPDL.g:484:2: (otherlv_0= 'ressource' ( (lv_name_1_0= ruleEString ) ) ( (lv_quantity_2_0= ruleEInt ) ) )
            // InternalPDL.g:485:3: otherlv_0= 'ressource' ( (lv_name_1_0= ruleEString ) ) ( (lv_quantity_2_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRessourceAccess().getRessourceKeyword_0());
            		
            // InternalPDL.g:489:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPDL.g:490:4: (lv_name_1_0= ruleEString )
            {
            // InternalPDL.g:490:4: (lv_name_1_0= ruleEString )
            // InternalPDL.g:491:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRessourceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRessourceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.n7.simplepdl.txt.PDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDL.g:508:3: ( (lv_quantity_2_0= ruleEInt ) )
            // InternalPDL.g:509:4: (lv_quantity_2_0= ruleEInt )
            {
            // InternalPDL.g:509:4: (lv_quantity_2_0= ruleEInt )
            // InternalPDL.g:510:5: lv_quantity_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRessourceAccess().getQuantityEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_quantity_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRessourceRule());
            					}
            					set(
            						current,
            						"quantity",
            						lv_quantity_2_0,
            						"fr.n7.simplepdl.txt.PDL.EInt");
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
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleUsefulRessource"
    // InternalPDL.g:531:1: entryRuleUsefulRessource returns [EObject current=null] : iv_ruleUsefulRessource= ruleUsefulRessource EOF ;
    public final EObject entryRuleUsefulRessource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsefulRessource = null;


        try {
            // InternalPDL.g:531:56: (iv_ruleUsefulRessource= ruleUsefulRessource EOF )
            // InternalPDL.g:532:2: iv_ruleUsefulRessource= ruleUsefulRessource EOF
            {
             newCompositeNode(grammarAccess.getUsefulRessourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsefulRessource=ruleUsefulRessource();

            state._fsp--;

             current =iv_ruleUsefulRessource; 
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
    // $ANTLR end "entryRuleUsefulRessource"


    // $ANTLR start "ruleUsefulRessource"
    // InternalPDL.g:538:1: ruleUsefulRessource returns [EObject current=null] : (otherlv_0= 'needs' ( (lv_usefulQuantity_1_0= ruleEInt ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleUsefulRessource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_usefulQuantity_1_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:544:2: ( (otherlv_0= 'needs' ( (lv_usefulQuantity_1_0= ruleEInt ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalPDL.g:545:2: (otherlv_0= 'needs' ( (lv_usefulQuantity_1_0= ruleEInt ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalPDL.g:545:2: (otherlv_0= 'needs' ( (lv_usefulQuantity_1_0= ruleEInt ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) )
            // InternalPDL.g:546:3: otherlv_0= 'needs' ( (lv_usefulQuantity_1_0= ruleEInt ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getUsefulRessourceAccess().getNeedsKeyword_0());
            		
            // InternalPDL.g:550:3: ( (lv_usefulQuantity_1_0= ruleEInt ) )
            // InternalPDL.g:551:4: (lv_usefulQuantity_1_0= ruleEInt )
            {
            // InternalPDL.g:551:4: (lv_usefulQuantity_1_0= ruleEInt )
            // InternalPDL.g:552:5: lv_usefulQuantity_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getUsefulRessourceAccess().getUsefulQuantityEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_usefulQuantity_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUsefulRessourceRule());
            					}
            					set(
            						current,
            						"usefulQuantity",
            						lv_usefulQuantity_1_0,
            						"fr.n7.simplepdl.txt.PDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getUsefulRessourceAccess().getOfKeyword_2());
            		
            // InternalPDL.g:573:3: ( (otherlv_3= RULE_ID ) )
            // InternalPDL.g:574:4: (otherlv_3= RULE_ID )
            {
            // InternalPDL.g:574:4: (otherlv_3= RULE_ID )
            // InternalPDL.g:575:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsefulRessourceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getUsefulRessourceAccess().getRessourceRessourceCrossReference_3_0());
            				

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
    // $ANTLR end "ruleUsefulRessource"


    // $ANTLR start "entryRuleEInt"
    // InternalPDL.g:590:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalPDL.g:590:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalPDL.g:591:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalPDL.g:597:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalPDL.g:603:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalPDL.g:604:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalPDL.g:604:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalPDL.g:605:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalPDL.g:605:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPDL.g:606:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL.g:623:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPDL.g:629:2: ( ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) )
            // InternalPDL.g:630:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            {
            // InternalPDL.g:630:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPDL.g:631:3: (enumLiteral_0= 's2s' )
                    {
                    // InternalPDL.g:631:3: (enumLiteral_0= 's2s' )
                    // InternalPDL.g:632:4: enumLiteral_0= 's2s'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:639:3: (enumLiteral_1= 'f2s' )
                    {
                    // InternalPDL.g:639:3: (enumLiteral_1= 'f2s' )
                    // InternalPDL.g:640:4: enumLiteral_1= 'f2s'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:647:3: (enumLiteral_2= 's2f' )
                    {
                    // InternalPDL.g:647:3: (enumLiteral_2= 's2f' )
                    // InternalPDL.g:648:4: enumLiteral_2= 's2f'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:655:3: (enumLiteral_3= 'f2f' )
                    {
                    // InternalPDL.g:655:3: (enumLiteral_3= 'f2f' )
                    // InternalPDL.g:656:4: enumLiteral_3= 'f2f'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000019E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});

}
/*
 * generated by Xtext 2.28.0
 */
package fr.n7.simplepdl.txt.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PDLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ProcessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.Process");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cProcessAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cProcessKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cProcessElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cProcessElementsProcessElementParserRuleCall_4_0 = (RuleCall)cProcessElementsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Process returns Process:
		//    {Process}
		//    'process' name=EString '{'
		//        processElements+=ProcessElement*
		//    '}' ;
		@Override public ParserRule getRule() { return rule; }
		
		//{Process}
		//'process' name=EString '{'
		//    processElements+=ProcessElement*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{Process}
		public Action getProcessAction_0() { return cProcessAction_0; }
		
		//'process'
		public Keyword getProcessKeyword_1() { return cProcessKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//processElements+=ProcessElement*
		public Assignment getProcessElementsAssignment_4() { return cProcessElementsAssignment_4; }
		
		//ProcessElement
		public RuleCall getProcessElementsProcessElementParserRuleCall_4_0() { return cProcessElementsProcessElementParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ProcessElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.ProcessElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cProcessElement_ImplParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWorkDefinitionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cWorkSequenceParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cGuidanceParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cRessourceParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//ProcessElement returns ProcessElement:
		//    ProcessElement_Impl | WorkDefinition | WorkSequence | Guidance | Ressource ;
		@Override public ParserRule getRule() { return rule; }
		
		//ProcessElement_Impl | WorkDefinition | WorkSequence | Guidance | Ressource
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ProcessElement_Impl
		public RuleCall getProcessElement_ImplParserRuleCall_0() { return cProcessElement_ImplParserRuleCall_0; }
		
		//WorkDefinition
		public RuleCall getWorkDefinitionParserRuleCall_1() { return cWorkDefinitionParserRuleCall_1; }
		
		//WorkSequence
		public RuleCall getWorkSequenceParserRuleCall_2() { return cWorkSequenceParserRuleCall_2; }
		
		//Guidance
		public RuleCall getGuidanceParserRuleCall_3() { return cGuidanceParserRuleCall_3; }
		
		//Ressource
		public RuleCall getRessourceParserRuleCall_4() { return cRessourceParserRuleCall_4; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID ;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class ProcessElement_ImplElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.ProcessElement_Impl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cProcessElementAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cProcessElementKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//ProcessElement_Impl returns ProcessElement:
		//    {ProcessElement}
		//    'ProcessElement' ;
		@Override public ParserRule getRule() { return rule; }
		
		//{ProcessElement}
		//'ProcessElement'
		public Group getGroup() { return cGroup; }
		
		//{ProcessElement}
		public Action getProcessElementAction_0() { return cProcessElementAction_0; }
		
		//'ProcessElement'
		public Keyword getProcessElementKeyword_1() { return cProcessElementKeyword_1; }
	}
	public class WorkDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.WorkDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cWorkDefinitionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cWdKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cUsefulRessourcesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cUsefulRessourcesUsefulRessourceParserRuleCall_3_1_0 = (RuleCall)cUsefulRessourcesAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		
		//WorkDefinition returns WorkDefinition:
		//    {WorkDefinition}
		//    'wd' name=EString ( '{'
		//        usefulRessources+=UsefulRessource*
		//    '}' )? ;
		@Override public ParserRule getRule() { return rule; }
		
		//{WorkDefinition}
		//'wd' name=EString ( '{'
		//    usefulRessources+=UsefulRessource*
		//'}' )?
		public Group getGroup() { return cGroup; }
		
		//{WorkDefinition}
		public Action getWorkDefinitionAction_0() { return cWorkDefinitionAction_0; }
		
		//'wd'
		public Keyword getWdKeyword_1() { return cWdKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//( '{'
		//       usefulRessources+=UsefulRessource*
		//   '}' )?
		public Group getGroup_3() { return cGroup_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_0() { return cLeftCurlyBracketKeyword_3_0; }
		
		//usefulRessources+=UsefulRessource*
		public Assignment getUsefulRessourcesAssignment_3_1() { return cUsefulRessourcesAssignment_3_1; }
		
		//UsefulRessource
		public RuleCall getUsefulRessourcesUsefulRessourceParserRuleCall_3_1_0() { return cUsefulRessourcesUsefulRessourceParserRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_2() { return cRightCurlyBracketKeyword_3_2; }
	}
	public class WorkSequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.WorkSequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cLinkTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLinkTypeWorkSequenceTypeEnumRuleCall_1_0 = (RuleCall)cLinkTypeAssignment_1.eContents().get(0);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPredecessorAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cPredecessorWorkDefinitionCrossReference_3_0 = (CrossReference)cPredecessorAssignment_3.eContents().get(0);
		private final RuleCall cPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1 = (RuleCall)cPredecessorWorkDefinitionCrossReference_3_0.eContents().get(1);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSuccessorAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cSuccessorWorkDefinitionCrossReference_5_0 = (CrossReference)cSuccessorAssignment_5.eContents().get(0);
		private final RuleCall cSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1 = (RuleCall)cSuccessorWorkDefinitionCrossReference_5_0.eContents().get(1);
		
		//WorkSequence returns WorkSequence:
		//    'ws' linkType=WorkSequenceType
		//    'from' predecessor=[WorkDefinition]
		//    'to' successor=[WorkDefinition] ;
		@Override public ParserRule getRule() { return rule; }
		
		//'ws' linkType=WorkSequenceType
		//'from' predecessor=[WorkDefinition]
		//'to' successor=[WorkDefinition]
		public Group getGroup() { return cGroup; }
		
		//'ws'
		public Keyword getWsKeyword_0() { return cWsKeyword_0; }
		
		//linkType=WorkSequenceType
		public Assignment getLinkTypeAssignment_1() { return cLinkTypeAssignment_1; }
		
		//WorkSequenceType
		public RuleCall getLinkTypeWorkSequenceTypeEnumRuleCall_1_0() { return cLinkTypeWorkSequenceTypeEnumRuleCall_1_0; }
		
		//'from'
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }
		
		//predecessor=[WorkDefinition]
		public Assignment getPredecessorAssignment_3() { return cPredecessorAssignment_3; }
		
		//[WorkDefinition]
		public CrossReference getPredecessorWorkDefinitionCrossReference_3_0() { return cPredecessorWorkDefinitionCrossReference_3_0; }
		
		//ID
		public RuleCall getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1() { return cPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1; }
		
		//'to'
		public Keyword getToKeyword_4() { return cToKeyword_4; }
		
		//successor=[WorkDefinition]
		public Assignment getSuccessorAssignment_5() { return cSuccessorAssignment_5; }
		
		//[WorkDefinition]
		public CrossReference getSuccessorWorkDefinitionCrossReference_5_0() { return cSuccessorWorkDefinitionCrossReference_5_0; }
		
		//ID
		public RuleCall getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1() { return cSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1; }
	}
	public class GuidanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.Guidance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGuidanceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNoteKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTextAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTextSTRINGTerminalRuleCall_2_0 = (RuleCall)cTextAssignment_2.eContents().get(0);
		
		//Guidance returns Guidance:
		//    {Guidance}
		//    'note' text=STRING ;
		@Override public ParserRule getRule() { return rule; }
		
		//{Guidance}
		//'note' text=STRING
		public Group getGroup() { return cGroup; }
		
		//{Guidance}
		public Action getGuidanceAction_0() { return cGuidanceAction_0; }
		
		//'note'
		public Keyword getNoteKeyword_1() { return cNoteKeyword_1; }
		
		//text=STRING
		public Assignment getTextAssignment_2() { return cTextAssignment_2; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_2_0() { return cTextSTRINGTerminalRuleCall_2_0; }
	}
	public class RessourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.Ressource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRessourceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cQuantityAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQuantityEIntParserRuleCall_2_0 = (RuleCall)cQuantityAssignment_2.eContents().get(0);
		
		//Ressource returns Ressource:
		//    'ressource' name=EString quantity=EInt ;
		@Override public ParserRule getRule() { return rule; }
		
		//'ressource' name=EString quantity=EInt
		public Group getGroup() { return cGroup; }
		
		//'ressource'
		public Keyword getRessourceKeyword_0() { return cRessourceKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//quantity=EInt
		public Assignment getQuantityAssignment_2() { return cQuantityAssignment_2; }
		
		//EInt
		public RuleCall getQuantityEIntParserRuleCall_2_0() { return cQuantityEIntParserRuleCall_2_0; }
	}
	public class UsefulRessourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.UsefulRessource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNeedsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cUsefulQuantityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cUsefulQuantityEIntParserRuleCall_1_0 = (RuleCall)cUsefulQuantityAssignment_1.eContents().get(0);
		private final Keyword cOfKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRessourceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cRessourceRessourceCrossReference_3_0 = (CrossReference)cRessourceAssignment_3.eContents().get(0);
		private final RuleCall cRessourceRessourceIDTerminalRuleCall_3_0_1 = (RuleCall)cRessourceRessourceCrossReference_3_0.eContents().get(1);
		
		//UsefulRessource returns UsefulRessource:
		//    'needs' usefulQuantity=EInt 'of' ressource=[Ressource] ;
		@Override public ParserRule getRule() { return rule; }
		
		//'needs' usefulQuantity=EInt 'of' ressource=[Ressource]
		public Group getGroup() { return cGroup; }
		
		//'needs'
		public Keyword getNeedsKeyword_0() { return cNeedsKeyword_0; }
		
		//usefulQuantity=EInt
		public Assignment getUsefulQuantityAssignment_1() { return cUsefulQuantityAssignment_1; }
		
		//EInt
		public RuleCall getUsefulQuantityEIntParserRuleCall_1_0() { return cUsefulQuantityEIntParserRuleCall_1_0; }
		
		//'of'
		public Keyword getOfKeyword_2() { return cOfKeyword_2; }
		
		//ressource=[Ressource]
		public Assignment getRessourceAssignment_3() { return cRessourceAssignment_3; }
		
		//[Ressource]
		public CrossReference getRessourceRessourceCrossReference_3_0() { return cRessourceRessourceCrossReference_3_0; }
		
		//ID
		public RuleCall getRessourceRessourceIDTerminalRuleCall_3_0_1() { return cRessourceRessourceIDTerminalRuleCall_3_0_1; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt returns ecore::EInt:
		//    '-'? INT ;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	
	public class WorkSequenceTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.WorkSequenceType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStartToStartEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStartToStartS2sKeyword_0_0 = (Keyword)cStartToStartEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFinishToStartEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFinishToStartF2sKeyword_1_0 = (Keyword)cFinishToStartEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cStartToFinishEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cStartToFinishS2fKeyword_2_0 = (Keyword)cStartToFinishEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cFinishToFinishEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cFinishToFinishF2fKeyword_3_0 = (Keyword)cFinishToFinishEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum WorkSequenceType returns WorkSequenceType: startToStart = 's2s'
		//    | finishToStart = 'f2s'
		//    | startToFinish = 's2f'
		//    | finishToFinish = 'f2f' ;
		public EnumRule getRule() { return rule; }
		
		//startToStart = 's2s'
		//   | finishToStart = 'f2s'
		//   | startToFinish = 's2f'
		//   | finishToFinish = 'f2f'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//startToStart = 's2s'
		public EnumLiteralDeclaration getStartToStartEnumLiteralDeclaration_0() { return cStartToStartEnumLiteralDeclaration_0; }
		
		//'s2s'
		public Keyword getStartToStartS2sKeyword_0_0() { return cStartToStartS2sKeyword_0_0; }
		
		//finishToStart = 'f2s'
		public EnumLiteralDeclaration getFinishToStartEnumLiteralDeclaration_1() { return cFinishToStartEnumLiteralDeclaration_1; }
		
		//'f2s'
		public Keyword getFinishToStartF2sKeyword_1_0() { return cFinishToStartF2sKeyword_1_0; }
		
		//startToFinish = 's2f'
		public EnumLiteralDeclaration getStartToFinishEnumLiteralDeclaration_2() { return cStartToFinishEnumLiteralDeclaration_2; }
		
		//'s2f'
		public Keyword getStartToFinishS2fKeyword_2_0() { return cStartToFinishS2fKeyword_2_0; }
		
		//finishToFinish = 'f2f'
		public EnumLiteralDeclaration getFinishToFinishEnumLiteralDeclaration_3() { return cFinishToFinishEnumLiteralDeclaration_3; }
		
		//'f2f'
		public Keyword getFinishToFinishF2fKeyword_3_0() { return cFinishToFinishF2fKeyword_3_0; }
	}
	
	private final ProcessElements pProcess;
	private final ProcessElementElements pProcessElement;
	private final EStringElements pEString;
	private final ProcessElement_ImplElements pProcessElement_Impl;
	private final WorkDefinitionElements pWorkDefinition;
	private final WorkSequenceElements pWorkSequence;
	private final GuidanceElements pGuidance;
	private final RessourceElements pRessource;
	private final UsefulRessourceElements pUsefulRessource;
	private final EIntElements pEInt;
	private final WorkSequenceTypeElements eWorkSequenceType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PDLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProcess = new ProcessElements();
		this.pProcessElement = new ProcessElementElements();
		this.pEString = new EStringElements();
		this.pProcessElement_Impl = new ProcessElement_ImplElements();
		this.pWorkDefinition = new WorkDefinitionElements();
		this.pWorkSequence = new WorkSequenceElements();
		this.pGuidance = new GuidanceElements();
		this.pRessource = new RessourceElements();
		this.pUsefulRessource = new UsefulRessourceElements();
		this.pEInt = new EIntElements();
		this.eWorkSequenceType = new WorkSequenceTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.n7.simplepdl.txt.PDL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Process returns Process:
	//    {Process}
	//    'process' name=EString '{'
	//        processElements+=ProcessElement*
	//    '}' ;
	public ProcessElements getProcessAccess() {
		return pProcess;
	}
	
	public ParserRule getProcessRule() {
		return getProcessAccess().getRule();
	}
	
	//ProcessElement returns ProcessElement:
	//    ProcessElement_Impl | WorkDefinition | WorkSequence | Guidance | Ressource ;
	public ProcessElementElements getProcessElementAccess() {
		return pProcessElement;
	}
	
	public ParserRule getProcessElementRule() {
		return getProcessElementAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID ;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//ProcessElement_Impl returns ProcessElement:
	//    {ProcessElement}
	//    'ProcessElement' ;
	public ProcessElement_ImplElements getProcessElement_ImplAccess() {
		return pProcessElement_Impl;
	}
	
	public ParserRule getProcessElement_ImplRule() {
		return getProcessElement_ImplAccess().getRule();
	}
	
	//WorkDefinition returns WorkDefinition:
	//    {WorkDefinition}
	//    'wd' name=EString ( '{'
	//        usefulRessources+=UsefulRessource*
	//    '}' )? ;
	public WorkDefinitionElements getWorkDefinitionAccess() {
		return pWorkDefinition;
	}
	
	public ParserRule getWorkDefinitionRule() {
		return getWorkDefinitionAccess().getRule();
	}
	
	//WorkSequence returns WorkSequence:
	//    'ws' linkType=WorkSequenceType
	//    'from' predecessor=[WorkDefinition]
	//    'to' successor=[WorkDefinition] ;
	public WorkSequenceElements getWorkSequenceAccess() {
		return pWorkSequence;
	}
	
	public ParserRule getWorkSequenceRule() {
		return getWorkSequenceAccess().getRule();
	}
	
	//Guidance returns Guidance:
	//    {Guidance}
	//    'note' text=STRING ;
	public GuidanceElements getGuidanceAccess() {
		return pGuidance;
	}
	
	public ParserRule getGuidanceRule() {
		return getGuidanceAccess().getRule();
	}
	
	//Ressource returns Ressource:
	//    'ressource' name=EString quantity=EInt ;
	public RessourceElements getRessourceAccess() {
		return pRessource;
	}
	
	public ParserRule getRessourceRule() {
		return getRessourceAccess().getRule();
	}
	
	//UsefulRessource returns UsefulRessource:
	//    'needs' usefulQuantity=EInt 'of' ressource=[Ressource] ;
	public UsefulRessourceElements getUsefulRessourceAccess() {
		return pUsefulRessource;
	}
	
	public ParserRule getUsefulRessourceRule() {
		return getUsefulRessourceAccess().getRule();
	}
	
	//EInt returns ecore::EInt:
	//    '-'? INT ;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//enum WorkSequenceType returns WorkSequenceType: startToStart = 's2s'
	//    | finishToStart = 'f2s'
	//    | startToFinish = 's2f'
	//    | finishToFinish = 'f2f' ;
	public WorkSequenceTypeElements getWorkSequenceTypeAccess() {
		return eWorkSequenceType;
	}
	
	public EnumRule getWorkSequenceTypeRule() {
		return getWorkSequenceTypeAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
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
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class RootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Root");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRootAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRootKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cActivitiesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cActivitiesAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cActivitiesActivityParserRuleCall_4_2_0 = (RuleCall)cActivitiesAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cActivitiesAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cActivitiesActivityParserRuleCall_4_3_1_0 = (RuleCall)cActivitiesAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Root returns Root:
		//    {Root}
		//    'Root'
		//    name=EString
		//    '{'
		//        ('activities' '{' activities+=Activity ( "," activities+=Activity)* '}' )?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Root}
		//'Root'
		//name=EString
		//'{'
		//    ('activities' '{' activities+=Activity ( "," activities+=Activity)* '}' )?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{Root}
		public Action getRootAction_0() { return cRootAction_0; }
		
		//'Root'
		public Keyword getRootKeyword_1() { return cRootKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('activities' '{' activities+=Activity ( "," activities+=Activity)* '}' )?
		public Group getGroup_4() { return cGroup_4; }
		
		//'activities'
		public Keyword getActivitiesKeyword_4_0() { return cActivitiesKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//activities+=Activity
		public Assignment getActivitiesAssignment_4_2() { return cActivitiesAssignment_4_2; }
		
		//Activity
		public RuleCall getActivitiesActivityParserRuleCall_4_2_0() { return cActivitiesActivityParserRuleCall_4_2_0; }
		
		//( "," activities+=Activity)*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//activities+=Activity
		public Assignment getActivitiesAssignment_4_3_1() { return cActivitiesAssignment_4_3_1; }
		
		//Activity
		public RuleCall getActivitiesActivityParserRuleCall_4_3_1_0() { return cActivitiesActivityParserRuleCall_4_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class ActivityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Activity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActivityAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cActivityKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cSequencesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cSequencesAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cSequencesSequenceParserRuleCall_4_2_0 = (RuleCall)cSequencesAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cSequencesAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cSequencesSequenceParserRuleCall_4_3_1_0 = (RuleCall)cSequencesAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Activity returns Activity:
		//    {Activity}
		//    'Activity'
		//    name=EString
		//    '{'
		//        ('sequences' '{' sequences+=Sequence ( "," sequences+=Sequence)* '}' )?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Activity}
		//'Activity'
		//name=EString
		//'{'
		//    ('sequences' '{' sequences+=Sequence ( "," sequences+=Sequence)* '}' )?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{Activity}
		public Action getActivityAction_0() { return cActivityAction_0; }
		
		//'Activity'
		public Keyword getActivityKeyword_1() { return cActivityKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('sequences' '{' sequences+=Sequence ( "," sequences+=Sequence)* '}' )?
		public Group getGroup_4() { return cGroup_4; }
		
		//'sequences'
		public Keyword getSequencesKeyword_4_0() { return cSequencesKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//sequences+=Sequence
		public Assignment getSequencesAssignment_4_2() { return cSequencesAssignment_4_2; }
		
		//Sequence
		public RuleCall getSequencesSequenceParserRuleCall_4_2_0() { return cSequencesSequenceParserRuleCall_4_2_0; }
		
		//( "," sequences+=Sequence)*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//sequences+=Sequence
		public Assignment getSequencesAssignment_4_3_1() { return cSequencesAssignment_4_3_1; }
		
		//Sequence
		public RuleCall getSequencesSequenceParserRuleCall_4_3_1_0() { return cSequencesSequenceParserRuleCall_4_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class SequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Sequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSequenceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSequenceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Sequence returns Sequence:
		//    {Sequence}
		//    'Sequence'
		//    name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{Sequence}
		//'Sequence'
		//name=EString
		public Group getGroup() { return cGroup; }
		
		//{Sequence}
		public Action getSequenceAction_0() { return cSequenceAction_0; }
		
		//'Sequence'
		public Keyword getSequenceKeyword_1() { return cSequenceKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
	}
	
	
	private final RootElements pRoot;
	private final EStringElements pEString;
	private final ActivityElements pActivity;
	private final SequenceElements pSequence;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRoot = new RootElements();
		this.pEString = new EStringElements();
		this.pActivity = new ActivityElements();
		this.pSequence = new SequenceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
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

	
	//Root returns Root:
	//    {Root}
	//    'Root'
	//    name=EString
	//    '{'
	//        ('activities' '{' activities+=Activity ( "," activities+=Activity)* '}' )?
	//    '}';
	public RootElements getRootAccess() {
		return pRoot;
	}
	
	public ParserRule getRootRule() {
		return getRootAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Activity returns Activity:
	//    {Activity}
	//    'Activity'
	//    name=EString
	//    '{'
	//        ('sequences' '{' sequences+=Sequence ( "," sequences+=Sequence)* '}' )?
	//    '}';
	public ActivityElements getActivityAccess() {
		return pActivity;
	}
	
	public ParserRule getActivityRule() {
		return getActivityAccess().getRule();
	}
	
	//Sequence returns Sequence:
	//    {Sequence}
	//    'Sequence'
	//    name=EString;
	public SequenceElements getSequenceAccess() {
		return pSequence;
	}
	
	public ParserRule getSequenceRule() {
		return getSequenceAccess().getRule();
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

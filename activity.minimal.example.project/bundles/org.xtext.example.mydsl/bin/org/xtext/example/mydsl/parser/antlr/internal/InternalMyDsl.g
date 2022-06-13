/*
 * generated by Xtext 2.25.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Root";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRoot
entryRuleRoot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootRule()); }
	iv_ruleRoot=ruleRoot
	{ $current=$iv_ruleRoot.current; }
	EOF;

// Rule Root
ruleRoot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRootAccess().getRootAction_0(),
					$current);
			}
		)
		otherlv_1='Root'
		{
			newLeafNode(otherlv_1, grammarAccess.getRootAccess().getRootKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRootAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='activities'
			{
				newLeafNode(otherlv_4, grammarAccess.getRootAccess().getActivitiesKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getActivitiesActivityParserRuleCall_4_2_0());
					}
					lv_activities_6_0=ruleActivity
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						add(
							$current,
							"activities",
							lv_activities_6_0,
							"org.xtext.example.mydsl.MyDsl.Activity");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getRootAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRootAccess().getActivitiesActivityParserRuleCall_4_3_1_0());
						}
						lv_activities_8_0=ruleActivity
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRootRule());
							}
							add(
								$current,
								"activities",
								lv_activities_8_0,
								"org.xtext.example.mydsl.MyDsl.Activity");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleActivity
entryRuleActivity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActivityRule()); }
	iv_ruleActivity=ruleActivity
	{ $current=$iv_ruleActivity.current; }
	EOF;

// Rule Activity
ruleActivity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActivityAccess().getActivityAction_0(),
					$current);
			}
		)
		otherlv_1='Activity'
		{
			newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActivityAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActivityRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='sequences'
			{
				newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getSequencesKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActivityAccess().getSequencesSequenceParserRuleCall_4_2_0());
					}
					lv_sequences_6_0=ruleSequence
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActivityRule());
						}
						add(
							$current,
							"sequences",
							lv_sequences_6_0,
							"org.xtext.example.mydsl.MyDsl.Sequence");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getActivityAccess().getSequencesSequenceParserRuleCall_4_3_1_0());
						}
						lv_sequences_8_0=ruleSequence
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getActivityRule());
							}
							add(
								$current,
								"sequences",
								lv_sequences_8_0,
								"org.xtext.example.mydsl.MyDsl.Sequence");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleSequence
entryRuleSequence returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSequenceRule()); }
	iv_ruleSequence=ruleSequence
	{ $current=$iv_ruleSequence.current; }
	EOF;

// Rule Sequence
ruleSequence returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSequenceAccess().getSequenceAction_0(),
					$current);
			}
		)
		otherlv_1='Sequence'
		{
			newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getSequenceKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSequenceAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSequenceRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

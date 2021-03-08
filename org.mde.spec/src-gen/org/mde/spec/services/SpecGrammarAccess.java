/*
 * generated by Xtext 2.20.0
 */
package org.mde.spec.services;

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
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SpecGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.Model");
		private final Assignment cCommandsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cCommandsCommandParserRuleCall_0 = (RuleCall)cCommandsAssignment.eContents().get(0);
		
		//Model:
		//	commands+=Command*;
		@Override public ParserRule getRule() { return rule; }
		
		//commands+=Command*
		public Assignment getCommandsAssignment() { return cCommandsAssignment; }
		
		//Command
		public RuleCall getCommandsCommandParserRuleCall_0() { return cCommandsCommandParserRuleCall_0; }
	}
	public class CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.Command");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cOpenCommandParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cClickCommandParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSelectCommandParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cPropertyCommandParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cTypeCommandParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cSleepCommandParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Action cCommandAction_6_0 = (Action)cGroup_6.eContents().get(0);
		private final RuleCall cSL_COMMENTTerminalRuleCall_6_1 = (RuleCall)cGroup_6.eContents().get(1);
		private final Assignment cCustomAssignment_7 = (Assignment)cAlternatives.eContents().get(7);
		private final RuleCall cCustomCUSTOM_COMMANDTerminalRuleCall_7_0 = (RuleCall)cCustomAssignment_7.eContents().get(0);
		private final RuleCall cVarDeclarationParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		
		//Command:
		//	OpenCommand
		//	| ClickCommand
		//	| SelectCommand
		//	| PropertyCommand
		//	| TypeCommand
		//	| SleepCommand
		//	| {Command} SL_COMMENT
		//	| custom=CUSTOM_COMMAND
		//	| VarDeclaration;
		@Override public ParserRule getRule() { return rule; }
		
		//OpenCommand | ClickCommand | SelectCommand | PropertyCommand | TypeCommand | SleepCommand | {Command} SL_COMMENT |
		//custom=CUSTOM_COMMAND | VarDeclaration
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//OpenCommand
		public RuleCall getOpenCommandParserRuleCall_0() { return cOpenCommandParserRuleCall_0; }
		
		//ClickCommand
		public RuleCall getClickCommandParserRuleCall_1() { return cClickCommandParserRuleCall_1; }
		
		//SelectCommand
		public RuleCall getSelectCommandParserRuleCall_2() { return cSelectCommandParserRuleCall_2; }
		
		//PropertyCommand
		public RuleCall getPropertyCommandParserRuleCall_3() { return cPropertyCommandParserRuleCall_3; }
		
		//TypeCommand
		public RuleCall getTypeCommandParserRuleCall_4() { return cTypeCommandParserRuleCall_4; }
		
		//SleepCommand
		public RuleCall getSleepCommandParserRuleCall_5() { return cSleepCommandParserRuleCall_5; }
		
		//{Command} SL_COMMENT
		public Group getGroup_6() { return cGroup_6; }
		
		//{Command}
		public Action getCommandAction_6_0() { return cCommandAction_6_0; }
		
		//SL_COMMENT
		public RuleCall getSL_COMMENTTerminalRuleCall_6_1() { return cSL_COMMENTTerminalRuleCall_6_1; }
		
		//custom=CUSTOM_COMMAND
		public Assignment getCustomAssignment_7() { return cCustomAssignment_7; }
		
		//CUSTOM_COMMAND
		public RuleCall getCustomCUSTOM_COMMANDTerminalRuleCall_7_0() { return cCustomCUSTOM_COMMANDTerminalRuleCall_7_0; }
		
		//VarDeclaration
		public RuleCall getVarDeclarationParserRuleCall_8() { return cVarDeclarationParserRuleCall_8; }
	}
	public class OpenCommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.OpenCommand");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOpenCommandAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cNameOpenKeyword_1_0 = (Keyword)cNameAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cValAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cValSTRINGTerminalRuleCall_2_0_0 = (RuleCall)cValAssignment_2_0.eContents().get(0);
		private final Assignment cVarAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final CrossReference cVarVarDeclarationCrossReference_2_1_0 = (CrossReference)cVarAssignment_2_1.eContents().get(0);
		private final RuleCall cVarVarDeclarationIDTerminalRuleCall_2_1_0_1 = (RuleCall)cVarVarDeclarationCrossReference_2_1_0.eContents().get(1);
		
		//OpenCommand:
		//	{OpenCommand} name="Open" (val=STRING | var=[VarDeclaration]);
		@Override public ParserRule getRule() { return rule; }
		
		//{OpenCommand} name="Open" (val=STRING | var=[VarDeclaration])
		public Group getGroup() { return cGroup; }
		
		//{OpenCommand}
		public Action getOpenCommandAction_0() { return cOpenCommandAction_0; }
		
		//name="Open"
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//"Open"
		public Keyword getNameOpenKeyword_1_0() { return cNameOpenKeyword_1_0; }
		
		//(val=STRING | var=[VarDeclaration])
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//val=STRING
		public Assignment getValAssignment_2_0() { return cValAssignment_2_0; }
		
		//STRING
		public RuleCall getValSTRINGTerminalRuleCall_2_0_0() { return cValSTRINGTerminalRuleCall_2_0_0; }
		
		//var=[VarDeclaration]
		public Assignment getVarAssignment_2_1() { return cVarAssignment_2_1; }
		
		//[VarDeclaration]
		public CrossReference getVarVarDeclarationCrossReference_2_1_0() { return cVarVarDeclarationCrossReference_2_1_0; }
		
		//ID
		public RuleCall getVarVarDeclarationIDTerminalRuleCall_2_1_0_1() { return cVarVarDeclarationIDTerminalRuleCall_2_1_0_1; }
	}
	public class ClickCommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.ClickCommand");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameClickKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cOnKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cSelectorAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cSelectorSelectorParserRuleCall_1_0_1_0 = (RuleCall)cSelectorAssignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cAtKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cPointAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cPointPointParserRuleCall_1_1_1_0 = (RuleCall)cPointAssignment_1_1_1.eContents().get(0);
		
		//ClickCommand:
		//	name="Click" ("on" selector=Selector | "at" point=Point)?;
		@Override public ParserRule getRule() { return rule; }
		
		//name="Click" ("on" selector=Selector | "at" point=Point)?
		public Group getGroup() { return cGroup; }
		
		//name="Click"
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//"Click"
		public Keyword getNameClickKeyword_0_0() { return cNameClickKeyword_0_0; }
		
		//("on" selector=Selector | "at" point=Point)?
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"on" selector=Selector
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//"on"
		public Keyword getOnKeyword_1_0_0() { return cOnKeyword_1_0_0; }
		
		//selector=Selector
		public Assignment getSelectorAssignment_1_0_1() { return cSelectorAssignment_1_0_1; }
		
		//Selector
		public RuleCall getSelectorSelectorParserRuleCall_1_0_1_0() { return cSelectorSelectorParserRuleCall_1_0_1_0; }
		
		//"at" point=Point
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"at"
		public Keyword getAtKeyword_1_1_0() { return cAtKeyword_1_1_0; }
		
		//point=Point
		public Assignment getPointAssignment_1_1_1() { return cPointAssignment_1_1_1; }
		
		//Point
		public RuleCall getPointPointParserRuleCall_1_1_1_0() { return cPointPointParserRuleCall_1_1_1_0; }
	}
	public class SelectCommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.SelectCommand");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final Keyword cNameWithinKeyword_0_0_0 = (Keyword)cNameAssignment_0_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueSelectorParserRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Keyword cNameSelectKeyword_1_0_0 = (Keyword)cNameAssignment_1_0.eContents().get(0);
		private final Keyword cVisibleKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cValueAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cValueSelectorParserRuleCall_1_2_0 = (RuleCall)cValueAssignment_1_2.eContents().get(0);
		
		//SelectCommand:
		//	name="Within" value=Selector
		//	| name="Select" "visible"? value=Selector;
		@Override public ParserRule getRule() { return rule; }
		
		//name="Within" value=Selector | name="Select" "visible"? value=Selector
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//name="Within" value=Selector
		public Group getGroup_0() { return cGroup_0; }
		
		//name="Within"
		public Assignment getNameAssignment_0_0() { return cNameAssignment_0_0; }
		
		//"Within"
		public Keyword getNameWithinKeyword_0_0_0() { return cNameWithinKeyword_0_0_0; }
		
		//value=Selector
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//Selector
		public RuleCall getValueSelectorParserRuleCall_0_1_0() { return cValueSelectorParserRuleCall_0_1_0; }
		
		//name="Select" "visible"? value=Selector
		public Group getGroup_1() { return cGroup_1; }
		
		//name="Select"
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }
		
		//"Select"
		public Keyword getNameSelectKeyword_1_0_0() { return cNameSelectKeyword_1_0_0; }
		
		//"visible"?
		public Keyword getVisibleKeyword_1_1() { return cVisibleKeyword_1_1; }
		
		//value=Selector
		public Assignment getValueAssignment_1_2() { return cValueAssignment_1_2; }
		
		//Selector
		public RuleCall getValueSelectorParserRuleCall_1_2_0() { return cValueSelectorParserRuleCall_1_2_0; }
	}
	public class SelectorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.Selector");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeElementTypeEnumRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cVarAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final CrossReference cVarVarDeclarationCrossReference_1_0_0 = (CrossReference)cVarAssignment_1_0.eContents().get(0);
		private final RuleCall cVarVarDeclarationIDTerminalRuleCall_1_0_0_1 = (RuleCall)cVarVarDeclarationCrossReference_1_0_0.eContents().get(1);
		private final Assignment cValAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cValSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cValAssignment_1_1.eContents().get(0);
		
		//Selector:
		//	type=ElementType? (var=[VarDeclaration] | val=STRING);
		@Override public ParserRule getRule() { return rule; }
		
		//type=ElementType? (var=[VarDeclaration] | val=STRING)
		public Group getGroup() { return cGroup; }
		
		//type=ElementType?
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//ElementType
		public RuleCall getTypeElementTypeEnumRuleCall_0_0() { return cTypeElementTypeEnumRuleCall_0_0; }
		
		//(var=[VarDeclaration] | val=STRING)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//var=[VarDeclaration]
		public Assignment getVarAssignment_1_0() { return cVarAssignment_1_0; }
		
		//[VarDeclaration]
		public CrossReference getVarVarDeclarationCrossReference_1_0_0() { return cVarVarDeclarationCrossReference_1_0_0; }
		
		//ID
		public RuleCall getVarVarDeclarationIDTerminalRuleCall_1_0_0_1() { return cVarVarDeclarationIDTerminalRuleCall_1_0_0_1; }
		
		//val=STRING
		public Assignment getValAssignment_1_1() { return cValAssignment_1_1; }
		
		//STRING
		public RuleCall getValSTRINGTerminalRuleCall_1_1_0() { return cValSTRINGTerminalRuleCall_1_1_0; }
	}
	public class PropertyCommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.PropertyCommand");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNamePropertyKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Assignment cPropAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPropPropertyEnumRuleCall_1_0 = (RuleCall)cPropAssignment_1.eContents().get(0);
		private final Assignment cCondAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCondConditionEnumRuleCall_2_0 = (RuleCall)cCondAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cValAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cValSTRINGTerminalRuleCall_3_0_0 = (RuleCall)cValAssignment_3_0.eContents().get(0);
		private final Assignment cVarAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final CrossReference cVarVarDeclarationCrossReference_3_1_0 = (CrossReference)cVarAssignment_3_1.eContents().get(0);
		private final RuleCall cVarVarDeclarationIDTerminalRuleCall_3_1_0_1 = (RuleCall)cVarVarDeclarationCrossReference_3_1_0.eContents().get(1);
		
		////RememberCommand:
		////	name="Remember" prop=Property "as" var=Variable
		////;
		//PropertyCommand:
		//	name="Property" prop=Property cond=Condition (val=STRING | var=[VarDeclaration]);
		@Override public ParserRule getRule() { return rule; }
		
		//name="Property" prop=Property cond=Condition (val=STRING | var=[VarDeclaration])
		public Group getGroup() { return cGroup; }
		
		//name="Property"
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//"Property"
		public Keyword getNamePropertyKeyword_0_0() { return cNamePropertyKeyword_0_0; }
		
		//prop=Property
		public Assignment getPropAssignment_1() { return cPropAssignment_1; }
		
		//Property
		public RuleCall getPropPropertyEnumRuleCall_1_0() { return cPropPropertyEnumRuleCall_1_0; }
		
		//cond=Condition
		public Assignment getCondAssignment_2() { return cCondAssignment_2; }
		
		//Condition
		public RuleCall getCondConditionEnumRuleCall_2_0() { return cCondConditionEnumRuleCall_2_0; }
		
		//(val=STRING | var=[VarDeclaration])
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//val=STRING
		public Assignment getValAssignment_3_0() { return cValAssignment_3_0; }
		
		//STRING
		public RuleCall getValSTRINGTerminalRuleCall_3_0_0() { return cValSTRINGTerminalRuleCall_3_0_0; }
		
		//var=[VarDeclaration]
		public Assignment getVarAssignment_3_1() { return cVarAssignment_3_1; }
		
		//[VarDeclaration]
		public CrossReference getVarVarDeclarationCrossReference_3_1_0() { return cVarVarDeclarationCrossReference_3_1_0; }
		
		//ID
		public RuleCall getVarVarDeclarationIDTerminalRuleCall_3_1_0_1() { return cVarVarDeclarationIDTerminalRuleCall_3_1_0_1; }
	}
	public class TypeCommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.TypeCommand");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameTypeKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cStrAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cStrSTRINGTerminalRuleCall_1_0_0 = (RuleCall)cStrAssignment_1_0.eContents().get(0);
		private final Assignment cVarAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final CrossReference cVarVarDeclarationCrossReference_1_1_0 = (CrossReference)cVarAssignment_1_1.eContents().get(0);
		private final RuleCall cVarVarDeclarationIDTerminalRuleCall_1_1_0_1 = (RuleCall)cVarVarDeclarationCrossReference_1_1_0.eContents().get(1);
		
		//TypeCommand:
		//	name="Type" (str=STRING | var=[VarDeclaration]);
		@Override public ParserRule getRule() { return rule; }
		
		//name="Type" (str=STRING | var=[VarDeclaration])
		public Group getGroup() { return cGroup; }
		
		//name="Type"
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//"Type"
		public Keyword getNameTypeKeyword_0_0() { return cNameTypeKeyword_0_0; }
		
		//(str=STRING | var=[VarDeclaration])
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//str=STRING
		public Assignment getStrAssignment_1_0() { return cStrAssignment_1_0; }
		
		//STRING
		public RuleCall getStrSTRINGTerminalRuleCall_1_0_0() { return cStrSTRINGTerminalRuleCall_1_0_0; }
		
		//var=[VarDeclaration]
		public Assignment getVarAssignment_1_1() { return cVarAssignment_1_1; }
		
		//[VarDeclaration]
		public CrossReference getVarVarDeclarationCrossReference_1_1_0() { return cVarVarDeclarationCrossReference_1_1_0; }
		
		//ID
		public RuleCall getVarVarDeclarationIDTerminalRuleCall_1_1_0_1() { return cVarVarDeclarationIDTerminalRuleCall_1_1_0_1; }
	}
	public class SleepCommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.SleepCommand");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameSleepKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Keyword cForKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTimeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTimeINTTerminalRuleCall_2_0 = (RuleCall)cTimeAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Keyword cSecondKeyword_3_0 = (Keyword)cAlternatives_3.eContents().get(0);
		private final Keyword cSecondsKeyword_3_1 = (Keyword)cAlternatives_3.eContents().get(1);
		
		//SleepCommand:
		//	name="Sleep" "for" time=INT ("second" | "seconds");
		@Override public ParserRule getRule() { return rule; }
		
		//name="Sleep" "for" time=INT ("second" | "seconds")
		public Group getGroup() { return cGroup; }
		
		//name="Sleep"
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//"Sleep"
		public Keyword getNameSleepKeyword_0_0() { return cNameSleepKeyword_0_0; }
		
		//"for"
		public Keyword getForKeyword_1() { return cForKeyword_1; }
		
		//time=INT
		public Assignment getTimeAssignment_2() { return cTimeAssignment_2; }
		
		//INT
		public RuleCall getTimeINTTerminalRuleCall_2_0() { return cTimeINTTerminalRuleCall_2_0; }
		
		//("second" | "seconds")
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//"second"
		public Keyword getSecondKeyword_3_0() { return cSecondKeyword_3_0; }
		
		//"seconds"
		public Keyword getSecondsKeyword_3_1() { return cSecondsKeyword_3_1; }
	}
	public class PointElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.Point");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cXAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cXINTTerminalRuleCall_1_0 = (RuleCall)cXAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cYAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cYINTTerminalRuleCall_3_0 = (RuleCall)cYAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Point:
		//	"{" x=INT "," y=INT "}";
		@Override public ParserRule getRule() { return rule; }
		
		//"{" x=INT "," y=INT "}"
		public Group getGroup() { return cGroup; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//x=INT
		public Assignment getXAssignment_1() { return cXAssignment_1; }
		
		//INT
		public RuleCall getXINTTerminalRuleCall_1_0() { return cXINTTerminalRuleCall_1_0; }
		
		//","
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//y=INT
		public Assignment getYAssignment_3() { return cYAssignment_3; }
		
		//INT
		public RuleCall getYINTTerminalRuleCall_3_0() { return cYINTTerminalRuleCall_3_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class VarDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.VarDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStoreKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cAsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueSTRINGTerminalRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//VarDeclaration:
		//	"Store" name=ID 'as' value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//"Store" name=ID 'as' value=STRING
		public Group getGroup() { return cGroup; }
		
		//"Store"
		public Keyword getStoreKeyword_0() { return cStoreKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'as'
		public Keyword getAsKeyword_2() { return cAsKeyword_2; }
		
		//value=STRING
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_3_0() { return cValueSTRINGTerminalRuleCall_3_0; }
	}
	
	public class ElementTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.ElementType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cButtonEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cButtonButtonKeyword_0_0 = (Keyword)cButtonEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cElementEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cElementElementKeyword_1_0 = (Keyword)cElementEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cLinkEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cLinkLinkKeyword_2_0 = (Keyword)cLinkEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cInputEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cInputInputKeyword_3_0 = (Keyword)cInputEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cTextareaEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cTextareaTextareaKeyword_4_0 = (Keyword)cTextareaEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum ElementType:
		//	button | element | link | input | textarea;
		public EnumRule getRule() { return rule; }
		
		//button | element | link | input | textarea
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//button
		public EnumLiteralDeclaration getButtonEnumLiteralDeclaration_0() { return cButtonEnumLiteralDeclaration_0; }
		
		//"button"
		public Keyword getButtonButtonKeyword_0_0() { return cButtonButtonKeyword_0_0; }
		
		//element
		public EnumLiteralDeclaration getElementEnumLiteralDeclaration_1() { return cElementEnumLiteralDeclaration_1; }
		
		//"element"
		public Keyword getElementElementKeyword_1_0() { return cElementElementKeyword_1_0; }
		
		//link
		public EnumLiteralDeclaration getLinkEnumLiteralDeclaration_2() { return cLinkEnumLiteralDeclaration_2; }
		
		//"link"
		public Keyword getLinkLinkKeyword_2_0() { return cLinkLinkKeyword_2_0; }
		
		//input
		public EnumLiteralDeclaration getInputEnumLiteralDeclaration_3() { return cInputEnumLiteralDeclaration_3; }
		
		//"input"
		public Keyword getInputInputKeyword_3_0() { return cInputInputKeyword_3_0; }
		
		//textarea
		public EnumLiteralDeclaration getTextareaEnumLiteralDeclaration_4() { return cTextareaEnumLiteralDeclaration_4; }
		
		//"textarea"
		public Keyword getTextareaTextareaKeyword_4_0() { return cTextareaTextareaKeyword_4_0; }
	}
	public class PropertyElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.Property");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTextEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTextTextKeyword_0_0 = (Keyword)cTextEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cClassEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cClassClassKeyword_1_0 = (Keyword)cClassEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cValueEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cValueValueKeyword_2_0 = (Keyword)cValueEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Property:
		//	text | class | value;
		public EnumRule getRule() { return rule; }
		
		//text | class | value
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//text
		public EnumLiteralDeclaration getTextEnumLiteralDeclaration_0() { return cTextEnumLiteralDeclaration_0; }
		
		//"text"
		public Keyword getTextTextKeyword_0_0() { return cTextTextKeyword_0_0; }
		
		//class
		public EnumLiteralDeclaration getClassEnumLiteralDeclaration_1() { return cClassEnumLiteralDeclaration_1; }
		
		//"class"
		public Keyword getClassClassKeyword_1_0() { return cClassClassKeyword_1_0; }
		
		//value
		public EnumLiteralDeclaration getValueEnumLiteralDeclaration_2() { return cValueEnumLiteralDeclaration_2; }
		
		//"value"
		public Keyword getValueValueKeyword_2_0() { return cValueValueKeyword_2_0; }
	}
	public class ConditionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.Condition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cShouldBeEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cShouldBeShouldBeKeyword_0_0 = (Keyword)cShouldBeEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cShouldNotBeEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cShouldNotBeShouldNotBeKeyword_1_0 = (Keyword)cShouldNotBeEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Condition:
		//	shouldBe="should be"
		//	| shouldNotBe="should not be";
		public EnumRule getRule() { return rule; }
		
		//shouldBe="should be" | shouldNotBe="should not be"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//shouldBe="should be"
		public EnumLiteralDeclaration getShouldBeEnumLiteralDeclaration_0() { return cShouldBeEnumLiteralDeclaration_0; }
		
		//"should be"
		public Keyword getShouldBeShouldBeKeyword_0_0() { return cShouldBeShouldBeKeyword_0_0; }
		
		//shouldNotBe="should not be"
		public EnumLiteralDeclaration getShouldNotBeEnumLiteralDeclaration_1() { return cShouldNotBeEnumLiteralDeclaration_1; }
		
		//"should not be"
		public Keyword getShouldNotBeShouldNotBeKeyword_1_0() { return cShouldNotBeShouldNotBeKeyword_1_0; }
	}
	
	private final ModelElements pModel;
	private final CommandElements pCommand;
	private final OpenCommandElements pOpenCommand;
	private final ClickCommandElements pClickCommand;
	private final SelectCommandElements pSelectCommand;
	private final SelectorElements pSelector;
	private final ElementTypeElements eElementType;
	private final PropertyCommandElements pPropertyCommand;
	private final PropertyElements eProperty;
	private final ConditionElements eCondition;
	private final TypeCommandElements pTypeCommand;
	private final SleepCommandElements pSleepCommand;
	private final PointElements pPoint;
	private final TerminalRule tCUSTOM_COMMAND;
	private final TerminalRule tSL_COMMENT;
	private final VarDeclarationElements pVarDeclaration;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SpecGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pCommand = new CommandElements();
		this.pOpenCommand = new OpenCommandElements();
		this.pClickCommand = new ClickCommandElements();
		this.pSelectCommand = new SelectCommandElements();
		this.pSelector = new SelectorElements();
		this.eElementType = new ElementTypeElements();
		this.pPropertyCommand = new PropertyCommandElements();
		this.eProperty = new PropertyElements();
		this.eCondition = new ConditionElements();
		this.pTypeCommand = new TypeCommandElements();
		this.pSleepCommand = new SleepCommandElements();
		this.pPoint = new PointElements();
		this.tCUSTOM_COMMAND = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.CUSTOM_COMMAND");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.mde.spec.Spec.SL_COMMENT");
		this.pVarDeclaration = new VarDeclarationElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.mde.spec.Spec".equals(grammar.getName())) {
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

	
	//Model:
	//	commands+=Command*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Command:
	//	OpenCommand
	//	| ClickCommand
	//	| SelectCommand
	//	| PropertyCommand
	//	| TypeCommand
	//	| SleepCommand
	//	| {Command} SL_COMMENT
	//	| custom=CUSTOM_COMMAND
	//	| VarDeclaration;
	public CommandElements getCommandAccess() {
		return pCommand;
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}
	
	//OpenCommand:
	//	{OpenCommand} name="Open" (val=STRING | var=[VarDeclaration]);
	public OpenCommandElements getOpenCommandAccess() {
		return pOpenCommand;
	}
	
	public ParserRule getOpenCommandRule() {
		return getOpenCommandAccess().getRule();
	}
	
	//ClickCommand:
	//	name="Click" ("on" selector=Selector | "at" point=Point)?;
	public ClickCommandElements getClickCommandAccess() {
		return pClickCommand;
	}
	
	public ParserRule getClickCommandRule() {
		return getClickCommandAccess().getRule();
	}
	
	//SelectCommand:
	//	name="Within" value=Selector
	//	| name="Select" "visible"? value=Selector;
	public SelectCommandElements getSelectCommandAccess() {
		return pSelectCommand;
	}
	
	public ParserRule getSelectCommandRule() {
		return getSelectCommandAccess().getRule();
	}
	
	//Selector:
	//	type=ElementType? (var=[VarDeclaration] | val=STRING);
	public SelectorElements getSelectorAccess() {
		return pSelector;
	}
	
	public ParserRule getSelectorRule() {
		return getSelectorAccess().getRule();
	}
	
	//enum ElementType:
	//	button | element | link | input | textarea;
	public ElementTypeElements getElementTypeAccess() {
		return eElementType;
	}
	
	public EnumRule getElementTypeRule() {
		return getElementTypeAccess().getRule();
	}
	
	////RememberCommand:
	////	name="Remember" prop=Property "as" var=Variable
	////;
	//PropertyCommand:
	//	name="Property" prop=Property cond=Condition (val=STRING | var=[VarDeclaration]);
	public PropertyCommandElements getPropertyCommandAccess() {
		return pPropertyCommand;
	}
	
	public ParserRule getPropertyCommandRule() {
		return getPropertyCommandAccess().getRule();
	}
	
	//enum Property:
	//	text | class | value;
	public PropertyElements getPropertyAccess() {
		return eProperty;
	}
	
	public EnumRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}
	
	//enum Condition:
	//	shouldBe="should be"
	//	| shouldNotBe="should not be";
	public ConditionElements getConditionAccess() {
		return eCondition;
	}
	
	public EnumRule getConditionRule() {
		return getConditionAccess().getRule();
	}
	
	//TypeCommand:
	//	name="Type" (str=STRING | var=[VarDeclaration]);
	public TypeCommandElements getTypeCommandAccess() {
		return pTypeCommand;
	}
	
	public ParserRule getTypeCommandRule() {
		return getTypeCommandAccess().getRule();
	}
	
	//SleepCommand:
	//	name="Sleep" "for" time=INT ("second" | "seconds");
	public SleepCommandElements getSleepCommandAccess() {
		return pSleepCommand;
	}
	
	public ParserRule getSleepCommandRule() {
		return getSleepCommandAccess().getRule();
	}
	
	//Point:
	//	"{" x=INT "," y=INT "}";
	public PointElements getPointAccess() {
		return pPoint;
	}
	
	public ParserRule getPointRule() {
		return getPointAccess().getRule();
	}
	
	//terminal CUSTOM_COMMAND:
	//	'!' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getCUSTOM_COMMANDRule() {
		return tCUSTOM_COMMAND;
	}
	
	//@Override
	//terminal SL_COMMENT:
	//	'#' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//VarDeclaration:
	//	"Store" name=ID 'as' value=STRING;
	public VarDeclarationElements getVarDeclarationAccess() {
		return pVarDeclaration;
	}
	
	public ParserRule getVarDeclarationRule() {
		return getVarDeclarationAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

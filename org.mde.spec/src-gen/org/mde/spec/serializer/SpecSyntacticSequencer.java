/*
 * generated by Xtext 2.20.0
 */
package org.mde.spec.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.mde.spec.services.SpecGrammarAccess;

@SuppressWarnings("all")
public class SpecSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SpecGrammarAccess grammarAccess;
	protected AbstractElementAlias match_SelectCommand_VisibleKeyword_1_1_q;
	protected AbstractElementAlias match_SleepCommand_SecondKeyword_3_0_or_SecondsKeyword_3_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SpecGrammarAccess) access;
		match_SelectCommand_VisibleKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getSelectCommandAccess().getVisibleKeyword_1_1());
		match_SleepCommand_SecondKeyword_3_0_or_SecondsKeyword_3_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSleepCommandAccess().getSecondKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getSleepCommandAccess().getSecondsKeyword_3_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_SelectCommand_VisibleKeyword_1_1_q.equals(syntax))
				emit_SelectCommand_VisibleKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SleepCommand_SecondKeyword_3_0_or_SecondsKeyword_3_1.equals(syntax))
				emit_SleepCommand_SecondKeyword_3_0_or_SecondsKeyword_3_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'visible'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name='Select' (ambiguity) value=Selector
	 */
	protected void emit_SelectCommand_VisibleKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'second' | 'seconds'
	 *
	 * This ambiguous syntax occurs at:
	 *     time=INT (ambiguity) (rule end)
	 */
	protected void emit_SleepCommand_SecondKeyword_3_0_or_SecondsKeyword_3_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

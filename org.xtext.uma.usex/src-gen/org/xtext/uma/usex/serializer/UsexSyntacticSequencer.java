/*
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.uma.usex.services.UsexGrammarAccess;

@SuppressWarnings("all")
public class UsexSyntacticSequencer extends AbstractSyntacticSequencer {

	protected UsexGrammarAccess grammarAccess;
	protected AbstractElementAlias match_EnumerationElem_CommaKeyword_1_q;
	protected AbstractElementAlias match_Model_ConstraintsKeyword_3_0_q;
	protected AbstractElementAlias match_Parameter_CommaKeyword_3_q;
	protected AbstractElementAlias match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q;
	protected AbstractElementAlias match_UseClass_AttributesKeyword_4_0_q;
	protected AbstractElementAlias match_UseClass_ConstraintsKeyword_6_0_q;
	protected AbstractElementAlias match_UseClass_OperationsKeyword_5_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (UsexGrammarAccess) access;
		match_EnumerationElem_CommaKeyword_1_q = new TokenAlias(false, true, grammarAccess.getEnumerationElemAccess().getCommaKeyword_1());
		match_Model_ConstraintsKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getModelAccess().getConstraintsKeyword_3_0());
		match_Parameter_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getParameterAccess().getCommaKeyword_3());
		match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2()));
		match_UseClass_AttributesKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getUseClassAccess().getAttributesKeyword_4_0());
		match_UseClass_ConstraintsKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getUseClassAccess().getConstraintsKeyword_6_0());
		match_UseClass_OperationsKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getUseClassAccess().getOperationsKeyword_5_0());
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
			if (match_EnumerationElem_CommaKeyword_1_q.equals(syntax))
				emit_EnumerationElem_CommaKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Model_ConstraintsKeyword_3_0_q.equals(syntax))
				emit_Model_ConstraintsKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Parameter_CommaKeyword_3_q.equals(syntax))
				emit_Parameter_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q.equals(syntax))
				emit_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UseClass_AttributesKeyword_4_0_q.equals(syntax))
				emit_UseClass_AttributesKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UseClass_ConstraintsKeyword_6_0_q.equals(syntax))
				emit_UseClass_ConstraintsKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UseClass_OperationsKeyword_5_0_q.equals(syntax))
				emit_UseClass_OperationsKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_EnumerationElem_CommaKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'constraints'?
	 *
	 * This ambiguous syntax occurs at:
	 *     elements+=AbstractElement (ambiguity) (rule end)
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_Model_ConstraintsKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     type=AttributeType (ambiguity) (rule end)
	 */
	protected void emit_Parameter_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name='Tuple' (ambiguity) (rule end)
	 *     name='Tuple' (ambiguity) ownedMultiplicity=MultiplicityCS
	 */
	protected void emit_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'attributes'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) 'operations' operations+=Operation
	 *     name=ID (ambiguity) 'operations'? 'constraints' constraints+=Constraint
	 *     name=ID (ambiguity) 'operations'? 'constraints'? 'end' (rule end)
	 *     parentClass=ID (ambiguity) 'operations' operations+=Operation
	 *     parentClass=ID (ambiguity) 'operations'? 'constraints' constraints+=Constraint
	 *     parentClass=ID (ambiguity) 'operations'? 'constraints'? 'end' (rule end)
	 */
	protected void emit_UseClass_AttributesKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'constraints'?
	 *
	 * This ambiguous syntax occurs at:
	 *     attributes+=Attribute 'operations'? (ambiguity) 'end' (rule end)
	 *     name=ID 'attributes'? 'operations'? (ambiguity) 'end' (rule end)
	 *     operations+=Operation (ambiguity) 'end' (rule end)
	 *     parentClass=ID 'attributes'? 'operations'? (ambiguity) 'end' (rule end)
	 */
	protected void emit_UseClass_ConstraintsKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'operations'?
	 *
	 * This ambiguous syntax occurs at:
	 *     attributes+=Attribute (ambiguity) 'constraints' constraints+=Constraint
	 *     attributes+=Attribute (ambiguity) 'constraints'? 'end' (rule end)
	 *     name=ID 'attributes'? (ambiguity) 'constraints' constraints+=Constraint
	 *     name=ID 'attributes'? (ambiguity) 'constraints'? 'end' (rule end)
	 *     parentClass=ID 'attributes'? (ambiguity) 'constraints' constraints+=Constraint
	 *     parentClass=ID 'attributes'? (ambiguity) 'constraints'? 'end' (rule end)
	 */
	protected void emit_UseClass_OperationsKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

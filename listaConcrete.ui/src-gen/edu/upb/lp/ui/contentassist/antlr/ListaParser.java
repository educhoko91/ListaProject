/*
* generated by Xtext
*/
package edu.upb.lp.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import edu.upb.lp.services.ListaGrammarAccess;

public class ListaParser extends AbstractContentAssistParser {
	
	@Inject
	private ListaGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected edu.upb.lp.ui.contentassist.antlr.internal.InternalListaParser createParser() {
		edu.upb.lp.ui.contentassist.antlr.internal.InternalListaParser result = new edu.upb.lp.ui.contentassist.antlr.internal.InternalListaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSimpleExpressionAccess().getAlternatives(), "rule__SimpleExpression__Alternatives");
					put(grammarAccess.getBooleanExpressionAccess().getAlternatives_1(), "rule__BooleanExpression__Alternatives_1");
					put(grammarAccess.getLevel1OperatorAccess().getAlternatives(), "rule__Level1Operator__Alternatives");
					put(grammarAccess.getLevel2OperatorAccess().getAlternatives(), "rule__Level2Operator__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup(), "rule__FunctionDefinition__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_3(), "rule__FunctionDefinition__Group_3__0");
					put(grammarAccess.getEvaluationAccess().getGroup(), "rule__Evaluation__Group__0");
					put(grammarAccess.getLevel4ExpressionAccess().getGroup(), "rule__Level4Expression__Group__0");
					put(grammarAccess.getLevel4ExpressionAccess().getGroup_1(), "rule__Level4Expression__Group_1__0");
					put(grammarAccess.getLevel3ExpressionAccess().getGroup(), "rule__Level3Expression__Group__0");
					put(grammarAccess.getLevel3ExpressionAccess().getGroup_1(), "rule__Level3Expression__Group_1__0");
					put(grammarAccess.getLevel2ExpressionAccess().getGroup(), "rule__Level2Expression__Group__0");
					put(grammarAccess.getLevel2ExpressionAccess().getGroup_1(), "rule__Level2Expression__Group_1__0");
					put(grammarAccess.getLevel1ExpressionAccess().getGroup(), "rule__Level1Expression__Group__0");
					put(grammarAccess.getLevel1ExpressionAccess().getGroup_1(), "rule__Level1Expression__Group_1__0");
					put(grammarAccess.getSimpleExpressionAccess().getGroup_10(), "rule__SimpleExpression__Group_10__0");
					put(grammarAccess.getInputExpressionAccess().getGroup(), "rule__InputExpression__Group__0");
					put(grammarAccess.getOutputExpressionAccess().getGroup(), "rule__OutputExpression__Group__0");
					put(grammarAccess.getIfExpressionAccess().getGroup(), "rule__IfExpression__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_2(), "rule__FunctionCall__Group_2__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_2_1(), "rule__FunctionCall__Group_2_1__0");
					put(grammarAccess.getNotExpressionAccess().getGroup(), "rule__NotExpression__Group__0");
					put(grammarAccess.getBooleanExpressionAccess().getGroup(), "rule__BooleanExpression__Group__0");
					put(grammarAccess.getSeqExpressionAccess().getGroup(), "rule__SeqExpression__Group__0");
					put(grammarAccess.getSeqExpressionAccess().getGroup_3(), "rule__SeqExpression__Group_3__0");
					put(grammarAccess.getProgramAccess().getFunctionDefinitionsAssignment_0(), "rule__Program__FunctionDefinitionsAssignment_0");
					put(grammarAccess.getProgramAccess().getEvaluationAssignment_1(), "rule__Program__EvaluationAssignment_1");
					put(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_0(), "rule__FunctionDefinition__NameAssignment_0");
					put(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_2(), "rule__FunctionDefinition__ParametersAssignment_2");
					put(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_3_1(), "rule__FunctionDefinition__ParametersAssignment_3_1");
					put(grammarAccess.getFunctionDefinitionAccess().getExpressionAssignment_6(), "rule__FunctionDefinition__ExpressionAssignment_6");
					put(grammarAccess.getEvaluationAccess().getExpressionAssignment_1(), "rule__Evaluation__ExpressionAssignment_1");
					put(grammarAccess.getIdentifierAccess().getNameAssignment(), "rule__Identifier__NameAssignment");
					put(grammarAccess.getLevel4ExpressionAccess().getOperatorAssignment_1_1(), "rule__Level4Expression__OperatorAssignment_1_1");
					put(grammarAccess.getLevel4ExpressionAccess().getSubExpressionsAssignment_1_2(), "rule__Level4Expression__SubExpressionsAssignment_1_2");
					put(grammarAccess.getLevel3ExpressionAccess().getOperatorAssignment_1_1(), "rule__Level3Expression__OperatorAssignment_1_1");
					put(grammarAccess.getLevel3ExpressionAccess().getSubExpressionsAssignment_1_2(), "rule__Level3Expression__SubExpressionsAssignment_1_2");
					put(grammarAccess.getLevel2ExpressionAccess().getOperatorAssignment_1_1(), "rule__Level2Expression__OperatorAssignment_1_1");
					put(grammarAccess.getLevel2ExpressionAccess().getSubExpressionsAssignment_1_2(), "rule__Level2Expression__SubExpressionsAssignment_1_2");
					put(grammarAccess.getLevel1ExpressionAccess().getOperatorAssignment_1_1(), "rule__Level1Expression__OperatorAssignment_1_1");
					put(grammarAccess.getLevel1ExpressionAccess().getSubExpressionsAssignment_1_2(), "rule__Level1Expression__SubExpressionsAssignment_1_2");
					put(grammarAccess.getInputExpressionAccess().getMessageAssignment_2(), "rule__InputExpression__MessageAssignment_2");
					put(grammarAccess.getOutputExpressionAccess().getParameterAssignment_2(), "rule__OutputExpression__ParameterAssignment_2");
					put(grammarAccess.getIfExpressionAccess().getCondAssignment_2(), "rule__IfExpression__CondAssignment_2");
					put(grammarAccess.getIfExpressionAccess().getConsequentAssignment_4(), "rule__IfExpression__ConsequentAssignment_4");
					put(grammarAccess.getIfExpressionAccess().getAlternativeAssignment_6(), "rule__IfExpression__AlternativeAssignment_6");
					put(grammarAccess.getFunctionCallAccess().getFunctionAssignment_0(), "rule__FunctionCall__FunctionAssignment_0");
					put(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_0(), "rule__FunctionCall__ArgumentsAssignment_2_0");
					put(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_1_1(), "rule__FunctionCall__ArgumentsAssignment_2_1_1");
					put(grammarAccess.getStringExpressionAccess().getStringAssignment(), "rule__StringExpression__StringAssignment");
					put(grammarAccess.getNotExpressionAccess().getSubExprAssignment_1(), "rule__NotExpression__SubExprAssignment_1");
					put(grammarAccess.getNumberExpressionAccess().getNumberAssignment(), "rule__NumberExpression__NumberAssignment");
					put(grammarAccess.getBooleanExpressionAccess().getBooleanAssignment_1_0(), "rule__BooleanExpression__BooleanAssignment_1_0");
					put(grammarAccess.getSeqExpressionAccess().getSubExpressionsAssignment_2(), "rule__SeqExpression__SubExpressionsAssignment_2");
					put(grammarAccess.getSeqExpressionAccess().getSubExpressionsAssignment_3_1(), "rule__SeqExpression__SubExpressionsAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			edu.upb.lp.ui.contentassist.antlr.internal.InternalListaParser typedParser = (edu.upb.lp.ui.contentassist.antlr.internal.InternalListaParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ListaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ListaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

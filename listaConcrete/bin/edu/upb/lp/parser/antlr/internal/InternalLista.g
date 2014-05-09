/*
* generated by Xtext
*/
grammar InternalLista;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package edu.upb.lp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package edu.upb.lp.parser.antlr.internal; 

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
import edu.upb.lp.services.ListaGrammarAccess;

}

@parser::members {

 	private ListaGrammarAccess grammarAccess;
 	
    public InternalListaParser(TokenStream input, ListaGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Program";	
   	}
   	
   	@Override
   	protected ListaGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	 iv_ruleProgram=ruleProgram 
	 { $current=$iv_ruleProgram.current; } 
	 EOF 
;

// Rule Program
ruleProgram returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getProgramAccess().getFunctionDefinitionsFunctionDefinitionParserRuleCall_0_0()); 
	    }
		lv_functionDefinitions_0_0=ruleFunctionDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramRule());
	        }
       		add(
       			$current, 
       			"functionDefinitions",
        		lv_functionDefinitions_0_0, 
        		"FunctionDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getProgramAccess().getEvaluationEvaluationParserRuleCall_1_0()); 
	    }
		lv_evaluation_1_0=ruleEvaluation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramRule());
	        }
       		set(
       			$current, 
       			"evaluation",
        		lv_evaluation_1_0, 
        		"Evaluation");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleFunctionDefinition
entryRuleFunctionDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionDefinitionRule()); }
	 iv_ruleFunctionDefinition=ruleFunctionDefinition 
	 { $current=$iv_ruleFunctionDefinition.current; } 
	 EOF 
;

// Rule FunctionDefinition
ruleFunctionDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersIdentifierParserRuleCall_2_0()); 
	    }
		lv_parameters_2_0=ruleIdentifier		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_2_0, 
        		"Identifier");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersIdentifierParserRuleCall_3_1_0()); 
	    }
		lv_parameters_4_0=ruleIdentifier		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_4_0, 
        		"Identifier");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_4());
    }
	otherlv_6='=' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getFunctionDefinitionAccess().getEqualsSignKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getExpressionExpressionParserRuleCall_6_0()); 
	    }
		lv_expression_7_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_7_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getFunctionDefinitionAccess().getSemicolonKeyword_7());
    }
)
;





// Entry rule entryRuleEvaluation
entryRuleEvaluation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEvaluationRule()); }
	 iv_ruleEvaluation=ruleEvaluation 
	 { $current=$iv_ruleEvaluation.current; } 
	 EOF 
;

// Rule Evaluation
ruleEvaluation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='?' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEvaluationAccess().getQuestionMarkKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_1_0()); 
	    }
		lv_expression_1_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEvaluationRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_1_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEvaluationAccess().getSemicolonKeyword_2());
    }
)
;





// Entry rule entryRuleIdentifier
entryRuleIdentifier returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIdentifierRule()); }
	 iv_ruleIdentifier=ruleIdentifier 
	 { $current=$iv_ruleIdentifier.current; } 
	 EOF 
;

// Rule Identifier
ruleIdentifier returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIdentifierRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getLevel4ExpressionParserRuleCall()); 
    }
    this_Level4Expression_0=ruleLevel4Expression
    { 
        $current = $this_Level4Expression_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleLevel4Expression
entryRuleLevel4Expression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLevel4ExpressionRule()); }
	 iv_ruleLevel4Expression=ruleLevel4Expression 
	 { $current=$iv_ruleLevel4Expression.current; } 
	 EOF 
;

// Rule Level4Expression
ruleLevel4Expression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getLevel4ExpressionAccess().getLevel3ExpressionParserRuleCall_0()); 
    }
    this_Level3Expression_0=ruleLevel3Expression
    { 
        $current = $this_Level3Expression_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndAdd(
            grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLevel4ExpressionAccess().getOperatorLevel4OperatorEnumRuleCall_1_1_0()); 
	    }
		lv_operator_2_0=ruleLevel4Operator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLevel4ExpressionRule());
	        }
       		set(
       			$current, 
       			"operator",
        		lv_operator_2_0, 
        		"Level4Operator");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLevel4ExpressionAccess().getSubExpressionsLevel4ExpressionParserRuleCall_1_2_0()); 
	    }
		lv_subExpressions_3_0=ruleLevel4Expression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLevel4ExpressionRule());
	        }
       		add(
       			$current, 
       			"subExpressions",
        		lv_subExpressions_3_0, 
        		"Level4Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleLevel3Expression
entryRuleLevel3Expression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLevel3ExpressionRule()); }
	 iv_ruleLevel3Expression=ruleLevel3Expression 
	 { $current=$iv_ruleLevel3Expression.current; } 
	 EOF 
;

// Rule Level3Expression
ruleLevel3Expression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getLevel3ExpressionAccess().getLevel2ExpressionParserRuleCall_0()); 
    }
    this_Level2Expression_0=ruleLevel2Expression
    { 
        $current = $this_Level2Expression_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndAdd(
            grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLevel3ExpressionAccess().getOperatorLevel3OperatorEnumRuleCall_1_1_0()); 
	    }
		lv_operator_2_0=ruleLevel3Operator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLevel3ExpressionRule());
	        }
       		set(
       			$current, 
       			"operator",
        		lv_operator_2_0, 
        		"Level3Operator");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLevel3ExpressionAccess().getSubExpressionsLevel3ExpressionParserRuleCall_1_2_0()); 
	    }
		lv_subExpressions_3_0=ruleLevel3Expression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLevel3ExpressionRule());
	        }
       		add(
       			$current, 
       			"subExpressions",
        		lv_subExpressions_3_0, 
        		"Level3Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleLevel2Expression
entryRuleLevel2Expression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLevel2ExpressionRule()); }
	 iv_ruleLevel2Expression=ruleLevel2Expression 
	 { $current=$iv_ruleLevel2Expression.current; } 
	 EOF 
;

// Rule Level2Expression
ruleLevel2Expression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getLevel2ExpressionAccess().getLevel1ExpressionParserRuleCall_0()); 
    }
    this_Level1Expression_0=ruleLevel1Expression
    { 
        $current = $this_Level1Expression_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndAdd(
            grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLevel2ExpressionAccess().getOperatorLevel2OperatorEnumRuleCall_1_1_0()); 
	    }
		lv_operator_2_0=ruleLevel2Operator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLevel2ExpressionRule());
	        }
       		set(
       			$current, 
       			"operator",
        		lv_operator_2_0, 
        		"Level2Operator");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLevel2ExpressionAccess().getSubExpressionsLevel2ExpressionParserRuleCall_1_2_0()); 
	    }
		lv_subExpressions_3_0=ruleLevel2Expression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLevel2ExpressionRule());
	        }
       		add(
       			$current, 
       			"subExpressions",
        		lv_subExpressions_3_0, 
        		"Level2Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleLevel1Expression
entryRuleLevel1Expression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLevel1ExpressionRule()); }
	 iv_ruleLevel1Expression=ruleLevel1Expression 
	 { $current=$iv_ruleLevel1Expression.current; } 
	 EOF 
;

// Rule Level1Expression
ruleLevel1Expression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getLevel1ExpressionAccess().getSimpleExpressionParserRuleCall_0()); 
    }
    this_SimpleExpression_0=ruleSimpleExpression
    { 
        $current = $this_SimpleExpression_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndAdd(
            grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLevel1ExpressionAccess().getOperatorLevel1OperatorEnumRuleCall_1_1_0()); 
	    }
		lv_operator_2_0=ruleLevel1Operator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLevel1ExpressionRule());
	        }
       		set(
       			$current, 
       			"operator",
        		lv_operator_2_0, 
        		"Level1Operator");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLevel1ExpressionAccess().getSubExpressionsLevel1ExpressionParserRuleCall_1_2_0()); 
	    }
		lv_subExpressions_3_0=ruleLevel1Expression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLevel1ExpressionRule());
	        }
       		add(
       			$current, 
       			"subExpressions",
        		lv_subExpressions_3_0, 
        		"Level1Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleSimpleExpression
entryRuleSimpleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSimpleExpressionRule()); }
	 iv_ruleSimpleExpression=ruleSimpleExpression 
	 { $current=$iv_ruleSimpleExpression.current; } 
	 EOF 
;

// Rule SimpleExpression
ruleSimpleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getSeqExpressionParserRuleCall_0()); 
    }
    this_SeqExpression_0=ruleSeqExpression
    { 
        $current = $this_SeqExpression_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getBooleanExpressionParserRuleCall_1()); 
    }
    this_BooleanExpression_1=ruleBooleanExpression
    { 
        $current = $this_BooleanExpression_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getNumberExpressionParserRuleCall_2()); 
    }
    this_NumberExpression_2=ruleNumberExpression
    { 
        $current = $this_NumberExpression_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getStringExpressionParserRuleCall_3()); 
    }
    this_StringExpression_3=ruleStringExpression
    { 
        $current = $this_StringExpression_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getFunctionCallParserRuleCall_4()); 
    }
    this_FunctionCall_4=ruleFunctionCall
    { 
        $current = $this_FunctionCall_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getIdentifierParserRuleCall_5()); 
    }
    this_Identifier_5=ruleIdentifier
    { 
        $current = $this_Identifier_5.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getIfExpressionParserRuleCall_6()); 
    }
    this_IfExpression_6=ruleIfExpression
    { 
        $current = $this_IfExpression_6.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getNotExpressionParserRuleCall_7()); 
    }
    this_NotExpression_7=ruleNotExpression
    { 
        $current = $this_NotExpression_7.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getInputExpressionParserRuleCall_8()); 
    }
    this_InputExpression_8=ruleInputExpression
    { 
        $current = $this_InputExpression_8.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getOutputExpressionParserRuleCall_9()); 
    }
    this_OutputExpression_9=ruleOutputExpression
    { 
        $current = $this_OutputExpression_9.current; 
        afterParserOrEnumRuleCall();
    }

    |(	otherlv_10='(' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getSimpleExpressionAccess().getLeftParenthesisKeyword_10_0());
    }

    { 
        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getExpressionParserRuleCall_10_1()); 
    }
    this_Expression_11=ruleExpression
    { 
        $current = $this_Expression_11.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_12=')' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getSimpleExpressionAccess().getRightParenthesisKeyword_10_2());
    }
))
;





// Entry rule entryRuleInputExpression
entryRuleInputExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInputExpressionRule()); }
	 iv_ruleInputExpression=ruleInputExpression 
	 { $current=$iv_ruleInputExpression.current; } 
	 EOF 
;

// Rule InputExpression
ruleInputExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='input' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getInputExpressionAccess().getInputKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getInputExpressionAccess().getLeftParenthesisKeyword_1());
    }
(
(
		lv_message_2_0=RULE_STRING
		{
			newLeafNode(lv_message_2_0, grammarAccess.getInputExpressionAccess().getMessageSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInputExpressionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"message",
        		lv_message_2_0, 
        		"STRING");
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getInputExpressionAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleOutputExpression
entryRuleOutputExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOutputExpressionRule()); }
	 iv_ruleOutputExpression=ruleOutputExpression 
	 { $current=$iv_ruleOutputExpression.current; } 
	 EOF 
;

// Rule OutputExpression
ruleOutputExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='output' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getOutputExpressionAccess().getOutputKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOutputExpressionAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOutputExpressionAccess().getParameterExpressionParserRuleCall_2_0()); 
	    }
		lv_parameter_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOutputExpressionRule());
	        }
       		set(
       			$current, 
       			"parameter",
        		lv_parameter_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getOutputExpressionAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleIfExpression
entryRuleIfExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIfExpressionRule()); }
	 iv_ruleIfExpression=ruleIfExpression 
	 { $current=$iv_ruleIfExpression.current; } 
	 EOF 
;

// Rule IfExpression
ruleIfExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='if' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getIfKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getIfExpressionAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfExpressionAccess().getCondExpressionParserRuleCall_2_0()); 
	    }
		lv_cond_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfExpressionRule());
	        }
       		set(
       			$current, 
       			"cond",
        		lv_cond_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getIfExpressionAccess().getCommaKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfExpressionAccess().getConsequentExpressionParserRuleCall_4_0()); 
	    }
		lv_consequent_4_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfExpressionRule());
	        }
       		set(
       			$current, 
       			"consequent",
        		lv_consequent_4_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getIfExpressionAccess().getCommaKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfExpressionAccess().getAlternativeExpressionParserRuleCall_6_0()); 
	    }
		lv_alternative_6_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfExpressionRule());
	        }
       		set(
       			$current, 
       			"alternative",
        		lv_alternative_6_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=')' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getIfExpressionAccess().getRightParenthesisKeyword_7());
    }
)
;





// Entry rule entryRuleFunctionCall
entryRuleFunctionCall returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionCallRule()); }
	 iv_ruleFunctionCall=ruleFunctionCall 
	 { $current=$iv_ruleFunctionCall.current; } 
	 EOF 
;

// Rule FunctionCall
ruleFunctionCall returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionCallRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getFunctionFunctionDefinitionCrossReference_0_0()); 
	}

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsExpressionParserRuleCall_2_0_0()); 
	    }
		lv_arguments_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionCallRule());
	        }
       		add(
       			$current, 
       			"arguments",
        		lv_arguments_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsExpressionParserRuleCall_2_1_1_0()); 
	    }
		lv_arguments_4_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionCallRule());
	        }
       		add(
       			$current, 
       			"arguments",
        		lv_arguments_4_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleStringExpression
entryRuleStringExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringExpressionRule()); }
	 iv_ruleStringExpression=ruleStringExpression 
	 { $current=$iv_ruleStringExpression.current; } 
	 EOF 
;

// Rule StringExpression
ruleStringExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_string_0_0=RULE_STRING
		{
			newLeafNode(lv_string_0_0, grammarAccess.getStringExpressionAccess().getStringSTRINGTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStringExpressionRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"string",
        		lv_string_0_0, 
        		"STRING");
	    }

)
)
;





// Entry rule entryRuleNotExpression
entryRuleNotExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNotExpressionRule()); }
	 iv_ruleNotExpression=ruleNotExpression 
	 { $current=$iv_ruleNotExpression.current; } 
	 EOF 
;

// Rule NotExpression
ruleNotExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='!' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getExclamationMarkKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExprSimpleExpressionParserRuleCall_1_0()); 
	    }
		lv_subExpr_1_0=ruleSimpleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNotExpressionRule());
	        }
       		set(
       			$current, 
       			"subExpr",
        		lv_subExpr_1_0, 
        		"SimpleExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleNumberExpression
entryRuleNumberExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNumberExpressionRule()); }
	 iv_ruleNumberExpression=ruleNumberExpression 
	 { $current=$iv_ruleNumberExpression.current; } 
	 EOF 
;

// Rule NumberExpression
ruleNumberExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_number_0_0=RULE_INT
		{
			newLeafNode(lv_number_0_0, grammarAccess.getNumberExpressionAccess().getNumberINTTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNumberExpressionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"number",
        		lv_number_0_0, 
        		"INT");
	    }

)
)
;





// Entry rule entryRuleBooleanExpression
entryRuleBooleanExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanExpressionRule()); }
	 iv_ruleBooleanExpression=ruleBooleanExpression 
	 { $current=$iv_ruleBooleanExpression.current; } 
	 EOF 
;

// Rule BooleanExpression
ruleBooleanExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getBooleanExpressionAccess().getBooleanExpressionAction_0(),
            $current);
    }
)((
(
		lv_value_1_0=	'TRUE' 
    {
        newLeafNode(lv_value_1_0, grammarAccess.getBooleanExpressionAccess().getValueTRUEKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanExpressionRule());
	        }
       		setWithLastConsumed($current, "value", true, "TRUE");
	    }

)
)
    |	otherlv_2='FALSE' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getBooleanExpressionAccess().getFALSEKeyword_1_1());
    }
))
;





// Entry rule entryRuleSeqExpression
entryRuleSeqExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSeqExpressionRule()); }
	 iv_ruleSeqExpression=ruleSeqExpression 
	 { $current=$iv_ruleSeqExpression.current; } 
	 EOF 
;

// Rule SeqExpression
ruleSeqExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='seq' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSeqExpressionAccess().getSeqKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSeqExpressionAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSeqExpressionAccess().getSubExpressionsExpressionParserRuleCall_2_0()); 
	    }
		lv_subExpressions_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSeqExpressionRule());
	        }
       		add(
       			$current, 
       			"subExpressions",
        		lv_subExpressions_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSeqExpressionAccess().getCommaKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSeqExpressionAccess().getSubExpressionsExpressionParserRuleCall_3_1_0()); 
	    }
		lv_subExpressions_4_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSeqExpressionRule());
	        }
       		add(
       			$current, 
       			"subExpressions",
        		lv_subExpressions_4_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSeqExpressionAccess().getRightParenthesisKeyword_4());
    }
)
;





// Rule Level1Operator
ruleLevel1Operator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='*' 
	{
        $current = grammarAccess.getLevel1OperatorAccess().getTIMESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getLevel1OperatorAccess().getTIMESEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='/' 
	{
        $current = grammarAccess.getLevel1OperatorAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getLevel1OperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='::' 
	{
        $current = grammarAccess.getLevel1OperatorAccess().getCONCATEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getLevel1OperatorAccess().getCONCATEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='&' 
	{
        $current = grammarAccess.getLevel1OperatorAccess().getANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getLevel1OperatorAccess().getANDEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='|' 
	{
        $current = grammarAccess.getLevel1OperatorAccess().getOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getLevel1OperatorAccess().getOREnumLiteralDeclaration_4()); 
    }
));



// Rule Level2Operator
ruleLevel2Operator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='-' 
	{
        $current = grammarAccess.getLevel2OperatorAccess().getMINUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getLevel2OperatorAccess().getMINUSEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='+' 
	{
        $current = grammarAccess.getLevel2OperatorAccess().getPLUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getLevel2OperatorAccess().getPLUSEnumLiteralDeclaration_1()); 
    }
));



// Rule Level3Operator
ruleLevel3Operator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
(	enumLiteral_0='<' 
	{
        $current = grammarAccess.getLevel3OperatorAccess().getSMALLERTHANEnumLiteralDeclaration().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getLevel3OperatorAccess().getSMALLERTHANEnumLiteralDeclaration()); 
    }
);



// Rule Level4Operator
ruleLevel4Operator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
(	enumLiteral_0='=' 
	{
        $current = grammarAccess.getLevel4OperatorAccess().getEQUALSEnumLiteralDeclaration().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getLevel4OperatorAccess().getEQUALSEnumLiteralDeclaration()); 
    }
);



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



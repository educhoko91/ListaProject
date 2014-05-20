package edu.upb.lp.serializer;

import Lista.BooleanExpression;
import Lista.CompositeExpr;
import Lista.Evaluation;
import Lista.FunctionCall;
import Lista.FunctionDefinition;
import Lista.GetExpression;
import Lista.Identifier;
import Lista.IfExpression;
import Lista.InputExpression;
import Lista.ListaPackage;
import Lista.MapExpression;
import Lista.NegExpr;
import Lista.NumberExpression;
import Lista.OutputExpression;
import Lista.Pair;
import Lista.Program;
import Lista.PutExpression;
import Lista.RemoveExpression;
import Lista.SeqExpression;
import Lista.StringExpression;
import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.upb.lp.services.ListaGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ListaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ListaGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ListaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ListaPackage.BOOLEAN_EXPRESSION:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel2ExpressionRule() ||
				   context == grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel3ExpressionRule() ||
				   context == grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel4ExpressionRule() ||
				   context == grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule()) {
					sequence_BooleanExpression(context, (BooleanExpression) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.COMPOSITE_EXPR:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel2ExpressionRule() ||
				   context == grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel3ExpressionRule() ||
				   context == grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel4ExpressionRule() ||
				   context == grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule()) {
					sequence_Level1Expression_Level2Expression_Level3Expression_Level4Expression(context, (CompositeExpr) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.EVALUATION:
				if(context == grammarAccess.getEvaluationRule()) {
					sequence_Evaluation(context, (Evaluation) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.FUNCTION_CALL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunctionCallRule() ||
				   context == grammarAccess.getLevel1ExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel2ExpressionRule() ||
				   context == grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel3ExpressionRule() ||
				   context == grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel4ExpressionRule() ||
				   context == grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule()) {
					sequence_FunctionCall(context, (FunctionCall) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.FUNCTION_DEFINITION:
				if(context == grammarAccess.getFunctionDefinitionRule()) {
					sequence_FunctionDefinition(context, (FunctionDefinition) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.GET_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getGetExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel2ExpressionRule() ||
				   context == grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel3ExpressionRule() ||
				   context == grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel4ExpressionRule() ||
				   context == grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule()) {
					sequence_GetExpression(context, (GetExpression) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.IDENTIFIER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIdentifierRule() ||
				   context == grammarAccess.getLevel1ExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel2ExpressionRule() ||
				   context == grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel3ExpressionRule() ||
				   context == grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel4ExpressionRule() ||
				   context == grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule()) {
					sequence_Identifier(context, (Identifier) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.IF_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel2ExpressionRule() ||
				   context == grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel3ExpressionRule() ||
				   context == grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel4ExpressionRule() ||
				   context == grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule()) {
					sequence_IfExpression(context, (IfExpression) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.INPUT_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getInputExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel2ExpressionRule() ||
				   context == grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel3ExpressionRule() ||
				   context == grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel4ExpressionRule() ||
				   context == grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule()) {
					sequence_InputExpression(context, (InputExpression) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.MAP_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel2ExpressionRule() ||
				   context == grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel3ExpressionRule() ||
				   context == grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel4ExpressionRule() ||
				   context == grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMapExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionRule()) {
					sequence_MapExpression(context, (MapExpression) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.NEG_EXPR:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel2ExpressionRule() ||
				   context == grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel3ExpressionRule() ||
				   context == grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel4ExpressionRule() ||
				   context == grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionRule()) {
					sequence_NotExpression(context, (NegExpr) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.NUMBER_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel2ExpressionRule() ||
				   context == grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel3ExpressionRule() ||
				   context == grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel4ExpressionRule() ||
				   context == grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionRule()) {
					sequence_NumberExpression(context, (NumberExpression) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.OUTPUT_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel2ExpressionRule() ||
				   context == grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel3ExpressionRule() ||
				   context == grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel4ExpressionRule() ||
				   context == grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getOutputExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionRule()) {
					sequence_OutputExpression(context, (OutputExpression) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.PAIR:
				if(context == grammarAccess.getPairExprRule()) {
					sequence_PairExpr(context, (Pair) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.PUT_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel2ExpressionRule() ||
				   context == grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel3ExpressionRule() ||
				   context == grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel4ExpressionRule() ||
				   context == grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getPutExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionRule()) {
					sequence_PutExpression(context, (PutExpression) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.REMOVE_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel2ExpressionRule() ||
				   context == grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel3ExpressionRule() ||
				   context == grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel4ExpressionRule() ||
				   context == grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getRemoveExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionRule()) {
					sequence_RemoveExpression(context, (RemoveExpression) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.SEQ_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel2ExpressionRule() ||
				   context == grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel3ExpressionRule() ||
				   context == grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel4ExpressionRule() ||
				   context == grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getSeqExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionRule()) {
					sequence_SeqExpression(context, (SeqExpression) semanticObject); 
					return; 
				}
				else break;
			case ListaPackage.STRING_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionRule() ||
				   context == grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel2ExpressionRule() ||
				   context == grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel3ExpressionRule() ||
				   context == grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLevel4ExpressionRule() ||
				   context == grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getStringExpressionRule()) {
					sequence_StringExpression(context, (StringExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (value?='TRUE'?)
	 */
	protected void sequence_BooleanExpression(EObject context, BooleanExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_Evaluation(EObject context, Evaluation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.EVALUATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.EVALUATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (function=[FunctionDefinition|ID] (arguments+=Expression arguments+=Expression*)?)
	 */
	protected void sequence_FunctionCall(EObject context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parameters+=Identifier parameters+=Identifier* expression=Expression)
	 */
	protected void sequence_FunctionDefinition(EObject context, FunctionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Map=[MapExpression|ID] keyExpr=Expression)
	 */
	protected void sequence_GetExpression(EObject context, GetExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.GET_EXPRESSION__MAP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.GET_EXPRESSION__MAP));
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.GET_EXPRESSION__KEY_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.GET_EXPRESSION__KEY_EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGetExpressionAccess().getMapMapExpressionIDTerminalRuleCall_2_0_1(), semanticObject.getMap());
		feeder.accept(grammarAccess.getGetExpressionAccess().getKeyExprExpressionParserRuleCall_4_0(), semanticObject.getKeyExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Identifier(EObject context, Identifier semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.IDENTIFIER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.IDENTIFIER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (cond=Expression consequent=Expression alternative=Expression)
	 */
	protected void sequence_IfExpression(EObject context, IfExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.IF_EXPRESSION__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.IF_EXPRESSION__COND));
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.IF_EXPRESSION__CONSEQUENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.IF_EXPRESSION__CONSEQUENT));
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.IF_EXPRESSION__ALTERNATIVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.IF_EXPRESSION__ALTERNATIVE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIfExpressionAccess().getCondExpressionParserRuleCall_2_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getIfExpressionAccess().getConsequentExpressionParserRuleCall_4_0(), semanticObject.getConsequent());
		feeder.accept(grammarAccess.getIfExpressionAccess().getAlternativeExpressionParserRuleCall_6_0(), semanticObject.getAlternative());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     message=STRING
	 */
	protected void sequence_InputExpression(EObject context, InputExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.INPUT_EXPRESSION__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.INPUT_EXPRESSION__MESSAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInputExpressionAccess().getMessageSTRINGTerminalRuleCall_2_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (subExpressions+=Level2Expression_CompositeExpr_1_0 operator=Level2Operator subExpressions+=Level2Expression) | 
	 *         (subExpressions+=Level1Expression_CompositeExpr_1_0 operator=Level1Operator subExpressions+=Level1Expression) | 
	 *         (subExpressions+=Level3Expression_CompositeExpr_1_0 operator=Level3Operator subExpressions+=Level3Expression) | 
	 *         (subExpressions+=Level4Expression_CompositeExpr_1_0 operator=Level4Operator subExpressions+=Level4Expression)
	 *     )
	 */
	protected void sequence_Level1Expression_Level2Expression_Level3Expression_Level4Expression(EObject context, CompositeExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (keyType='String' | keyType='int') (valueType='String' | valueType='int') (values+=PairExpr values+=PairExpr*)?)
	 */
	protected void sequence_MapExpression(EObject context, MapExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     subExpr=SimpleExpression
	 */
	protected void sequence_NotExpression(EObject context, NegExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.NEG_EXPR__SUB_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.NEG_EXPR__SUB_EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNotExpressionAccess().getSubExprSimpleExpressionParserRuleCall_1_0(), semanticObject.getSubExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     number=INT
	 */
	protected void sequence_NumberExpression(EObject context, NumberExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.NUMBER_EXPRESSION__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.NUMBER_EXPRESSION__NUMBER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberExpressionAccess().getNumberINTTerminalRuleCall_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     parameter=Expression
	 */
	protected void sequence_OutputExpression(EObject context, OutputExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.OUTPUT_EXPRESSION__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.OUTPUT_EXPRESSION__PARAMETER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOutputExpressionAccess().getParameterExpressionParserRuleCall_2_0(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (key=Expression value=Expression)
	 */
	protected void sequence_PairExpr(EObject context, Pair semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.PAIR__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.PAIR__KEY));
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.PAIR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.PAIR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPairExprAccess().getKeyExpressionParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getPairExprAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (functionDefinitions+=FunctionDefinition* evaluation=Evaluation)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Map=[MapExpression|ID] keyExpr=Expression valExpr=Expression)
	 */
	protected void sequence_PutExpression(EObject context, PutExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.PUT_EXPRESSION__MAP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.PUT_EXPRESSION__MAP));
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.PUT_EXPRESSION__KEY_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.PUT_EXPRESSION__KEY_EXPR));
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.PUT_EXPRESSION__VAL_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.PUT_EXPRESSION__VAL_EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPutExpressionAccess().getMapMapExpressionIDTerminalRuleCall_2_0_1(), semanticObject.getMap());
		feeder.accept(grammarAccess.getPutExpressionAccess().getKeyExprExpressionParserRuleCall_4_0(), semanticObject.getKeyExpr());
		feeder.accept(grammarAccess.getPutExpressionAccess().getValExprExpressionParserRuleCall_6_0(), semanticObject.getValExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (Map=[MapExpression|ID] keyExpr=Expression)
	 */
	protected void sequence_RemoveExpression(EObject context, RemoveExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.REMOVE_EXPRESSION__MAP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.REMOVE_EXPRESSION__MAP));
			if(transientValues.isValueTransient(semanticObject, ListaPackage.Literals.REMOVE_EXPRESSION__KEY_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaPackage.Literals.REMOVE_EXPRESSION__KEY_EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRemoveExpressionAccess().getMapMapExpressionIDTerminalRuleCall_2_0_1(), semanticObject.getMap());
		feeder.accept(grammarAccess.getRemoveExpressionAccess().getKeyExprExpressionParserRuleCall_4_0(), semanticObject.getKeyExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (subExpressions+=Expression subExpressions+=Expression*)
	 */
	protected void sequence_SeqExpression(EObject context, SeqExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     string+=STRING
	 */
	protected void sequence_StringExpression(EObject context, StringExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

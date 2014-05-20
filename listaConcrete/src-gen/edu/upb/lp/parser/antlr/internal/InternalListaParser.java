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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalListaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "','", "')'", "'='", "';'", "'?'", "'input'", "'output'", "'if'", "'!'", "'TRUE'", "'FALSE'", "'seq'", "'['", "'String'", "'int'", "']'", "'{'", "'}'", "'->'", "'put'", "'get'", "'remove'", "'*'", "'/'", "'::'", "'&'", "'|'", "'-'", "'+'", "'<'", "'=='"
    };
    public static final int T__42=42;
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalListaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalListaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalListaParser.tokenNames; }
    public String getGrammarFileName() { return "../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g"; }



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



    // $ANTLR start "entryRuleProgram"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:68:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:69:2: (iv_ruleProgram= ruleProgram EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:70:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:77:1: ruleProgram returns [EObject current=null] : ( ( (lv_functionDefinitions_0_0= ruleFunctionDefinition ) )* ( (lv_evaluation_1_0= ruleEvaluation ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_functionDefinitions_0_0 = null;

        EObject lv_evaluation_1_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:80:28: ( ( ( (lv_functionDefinitions_0_0= ruleFunctionDefinition ) )* ( (lv_evaluation_1_0= ruleEvaluation ) ) ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:81:1: ( ( (lv_functionDefinitions_0_0= ruleFunctionDefinition ) )* ( (lv_evaluation_1_0= ruleEvaluation ) ) )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:81:1: ( ( (lv_functionDefinitions_0_0= ruleFunctionDefinition ) )* ( (lv_evaluation_1_0= ruleEvaluation ) ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:81:2: ( (lv_functionDefinitions_0_0= ruleFunctionDefinition ) )* ( (lv_evaluation_1_0= ruleEvaluation ) )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:81:2: ( (lv_functionDefinitions_0_0= ruleFunctionDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:82:1: (lv_functionDefinitions_0_0= ruleFunctionDefinition )
            	    {
            	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:82:1: (lv_functionDefinitions_0_0= ruleFunctionDefinition )
            	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:83:3: lv_functionDefinitions_0_0= ruleFunctionDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getFunctionDefinitionsFunctionDefinitionParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionDefinition_in_ruleProgram131);
            	    lv_functionDefinitions_0_0=ruleFunctionDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"functionDefinitions",
            	            		lv_functionDefinitions_0_0, 
            	            		"FunctionDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:99:3: ( (lv_evaluation_1_0= ruleEvaluation ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:100:1: (lv_evaluation_1_0= ruleEvaluation )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:100:1: (lv_evaluation_1_0= ruleEvaluation )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:101:3: lv_evaluation_1_0= ruleEvaluation
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getEvaluationEvaluationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEvaluation_in_ruleProgram153);
            lv_evaluation_1_0=ruleEvaluation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		set(
                   			current, 
                   			"evaluation",
                    		lv_evaluation_1_0, 
                    		"Evaluation");
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunctionDefinition"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:125:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:126:2: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:127:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefinitionRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition189);
            iv_ruleFunctionDefinition=ruleFunctionDefinition();

            state._fsp--;

             current =iv_ruleFunctionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinition199); 

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
    // $ANTLR end "entryRuleFunctionDefinition"


    // $ANTLR start "ruleFunctionDefinition"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:134:1: ruleFunctionDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIdentifier ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleIdentifier ) ) )* otherlv_5= ')' otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ';' ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_expression_7_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:137:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIdentifier ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleIdentifier ) ) )* otherlv_5= ')' otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ';' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:138:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIdentifier ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleIdentifier ) ) )* otherlv_5= ')' otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ';' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:138:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIdentifier ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleIdentifier ) ) )* otherlv_5= ')' otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ';' )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:138:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIdentifier ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleIdentifier ) ) )* otherlv_5= ')' otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ';'
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:138:2: ( (lv_name_0_0= RULE_ID ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:139:1: (lv_name_0_0= RULE_ID )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:139:1: (lv_name_0_0= RULE_ID )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:140:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDefinition241); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleFunctionDefinition258); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_1());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:160:1: ( (lv_parameters_2_0= ruleIdentifier ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:161:1: (lv_parameters_2_0= ruleIdentifier )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:161:1: (lv_parameters_2_0= ruleIdentifier )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:162:3: lv_parameters_2_0= ruleIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersIdentifierParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleFunctionDefinition279);
            lv_parameters_2_0=ruleIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_2_0, 
                    		"Identifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:178:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleIdentifier ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:178:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleIdentifier ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleFunctionDefinition292); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_3_0());
            	        
            	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:182:1: ( (lv_parameters_4_0= ruleIdentifier ) )
            	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:183:1: (lv_parameters_4_0= ruleIdentifier )
            	    {
            	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:183:1: (lv_parameters_4_0= ruleIdentifier )
            	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:184:3: lv_parameters_4_0= ruleIdentifier
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersIdentifierParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIdentifier_in_ruleFunctionDefinition313);
            	    lv_parameters_4_0=ruleIdentifier();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_4_0, 
            	            		"Identifier");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleFunctionDefinition327); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_4());
                
            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleFunctionDefinition339); 

                	newLeafNode(otherlv_6, grammarAccess.getFunctionDefinitionAccess().getEqualsSignKeyword_5());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:208:1: ( (lv_expression_7_0= ruleExpression ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:209:1: (lv_expression_7_0= ruleExpression )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:209:1: (lv_expression_7_0= ruleExpression )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:210:3: lv_expression_7_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getExpressionExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleFunctionDefinition360);
            lv_expression_7_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_7_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDefinition372); 

                	newLeafNode(otherlv_8, grammarAccess.getFunctionDefinitionAccess().getSemicolonKeyword_7());
                

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
    // $ANTLR end "ruleFunctionDefinition"


    // $ANTLR start "entryRuleEvaluation"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:238:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:239:2: (iv_ruleEvaluation= ruleEvaluation EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:240:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation408);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation418); 

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
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:247:1: ruleEvaluation returns [EObject current=null] : (otherlv_0= '?' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:250:28: ( (otherlv_0= '?' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:251:1: (otherlv_0= '?' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:251:1: (otherlv_0= '?' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:251:3: otherlv_0= '?' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleEvaluation455); 

                	newLeafNode(otherlv_0, grammarAccess.getEvaluationAccess().getQuestionMarkKeyword_0());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:255:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:256:1: (lv_expression_1_0= ruleExpression )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:256:1: (lv_expression_1_0= ruleExpression )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:257:3: lv_expression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleEvaluation476);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEvaluationRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEvaluation488); 

                	newLeafNode(otherlv_2, grammarAccess.getEvaluationAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "entryRuleIdentifier"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:285:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:286:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:287:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier524);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier534); 

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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:294:1: ruleIdentifier returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:297:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:298:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:298:1: ( (lv_name_0_0= RULE_ID ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:299:1: (lv_name_0_0= RULE_ID )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:299:1: (lv_name_0_0= RULE_ID )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:300:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdentifier575); 

            			newLeafNode(lv_name_0_0, grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIdentifierRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:324:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:325:2: (iv_ruleExpression= ruleExpression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:326:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression615);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression625); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:333:1: ruleExpression returns [EObject current=null] : this_Level4Expression_0= ruleLevel4Expression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Level4Expression_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:336:28: (this_Level4Expression_0= ruleLevel4Expression )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:338:5: this_Level4Expression_0= ruleLevel4Expression
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getLevel4ExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleLevel4Expression_in_ruleExpression671);
            this_Level4Expression_0=ruleLevel4Expression();

            state._fsp--;

             
                    current = this_Level4Expression_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLevel4Expression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:354:1: entryRuleLevel4Expression returns [EObject current=null] : iv_ruleLevel4Expression= ruleLevel4Expression EOF ;
    public final EObject entryRuleLevel4Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevel4Expression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:355:2: (iv_ruleLevel4Expression= ruleLevel4Expression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:356:2: iv_ruleLevel4Expression= ruleLevel4Expression EOF
            {
             newCompositeNode(grammarAccess.getLevel4ExpressionRule()); 
            pushFollow(FOLLOW_ruleLevel4Expression_in_entryRuleLevel4Expression705);
            iv_ruleLevel4Expression=ruleLevel4Expression();

            state._fsp--;

             current =iv_ruleLevel4Expression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLevel4Expression715); 

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
    // $ANTLR end "entryRuleLevel4Expression"


    // $ANTLR start "ruleLevel4Expression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:363:1: ruleLevel4Expression returns [EObject current=null] : (this_Level3Expression_0= ruleLevel3Expression ( () ( (lv_operator_2_0= ruleLevel4Operator ) ) ( (lv_subExpressions_3_0= ruleLevel4Expression ) ) )? ) ;
    public final EObject ruleLevel4Expression() throws RecognitionException {
        EObject current = null;

        EObject this_Level3Expression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:366:28: ( (this_Level3Expression_0= ruleLevel3Expression ( () ( (lv_operator_2_0= ruleLevel4Operator ) ) ( (lv_subExpressions_3_0= ruleLevel4Expression ) ) )? ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:367:1: (this_Level3Expression_0= ruleLevel3Expression ( () ( (lv_operator_2_0= ruleLevel4Operator ) ) ( (lv_subExpressions_3_0= ruleLevel4Expression ) ) )? )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:367:1: (this_Level3Expression_0= ruleLevel3Expression ( () ( (lv_operator_2_0= ruleLevel4Operator ) ) ( (lv_subExpressions_3_0= ruleLevel4Expression ) ) )? )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:368:5: this_Level3Expression_0= ruleLevel3Expression ( () ( (lv_operator_2_0= ruleLevel4Operator ) ) ( (lv_subExpressions_3_0= ruleLevel4Expression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getLevel4ExpressionAccess().getLevel3ExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleLevel3Expression_in_ruleLevel4Expression762);
            this_Level3Expression_0=ruleLevel3Expression();

            state._fsp--;

             
                    current = this_Level3Expression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:376:1: ( () ( (lv_operator_2_0= ruleLevel4Operator ) ) ( (lv_subExpressions_3_0= ruleLevel4Expression ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==42) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:376:2: () ( (lv_operator_2_0= ruleLevel4Operator ) ) ( (lv_subExpressions_3_0= ruleLevel4Expression ) )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:376:2: ()
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:377:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getLevel4ExpressionAccess().getCompositeExprSubExpressionsAction_1_0(),
                                current);
                        

                    }

                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:382:2: ( (lv_operator_2_0= ruleLevel4Operator ) )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:383:1: (lv_operator_2_0= ruleLevel4Operator )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:383:1: (lv_operator_2_0= ruleLevel4Operator )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:384:3: lv_operator_2_0= ruleLevel4Operator
                    {
                     
                    	        newCompositeNode(grammarAccess.getLevel4ExpressionAccess().getOperatorLevel4OperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLevel4Operator_in_ruleLevel4Expression792);
                    lv_operator_2_0=ruleLevel4Operator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLevel4ExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"Level4Operator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:400:2: ( (lv_subExpressions_3_0= ruleLevel4Expression ) )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:401:1: (lv_subExpressions_3_0= ruleLevel4Expression )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:401:1: (lv_subExpressions_3_0= ruleLevel4Expression )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:402:3: lv_subExpressions_3_0= ruleLevel4Expression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLevel4ExpressionAccess().getSubExpressionsLevel4ExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLevel4Expression_in_ruleLevel4Expression813);
                    lv_subExpressions_3_0=ruleLevel4Expression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLevel4ExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"subExpressions",
                            		lv_subExpressions_3_0, 
                            		"Level4Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleLevel4Expression"


    // $ANTLR start "entryRuleLevel3Expression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:426:1: entryRuleLevel3Expression returns [EObject current=null] : iv_ruleLevel3Expression= ruleLevel3Expression EOF ;
    public final EObject entryRuleLevel3Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevel3Expression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:427:2: (iv_ruleLevel3Expression= ruleLevel3Expression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:428:2: iv_ruleLevel3Expression= ruleLevel3Expression EOF
            {
             newCompositeNode(grammarAccess.getLevel3ExpressionRule()); 
            pushFollow(FOLLOW_ruleLevel3Expression_in_entryRuleLevel3Expression851);
            iv_ruleLevel3Expression=ruleLevel3Expression();

            state._fsp--;

             current =iv_ruleLevel3Expression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLevel3Expression861); 

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
    // $ANTLR end "entryRuleLevel3Expression"


    // $ANTLR start "ruleLevel3Expression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:435:1: ruleLevel3Expression returns [EObject current=null] : (this_Level2Expression_0= ruleLevel2Expression ( () ( (lv_operator_2_0= ruleLevel3Operator ) ) ( (lv_subExpressions_3_0= ruleLevel3Expression ) ) )? ) ;
    public final EObject ruleLevel3Expression() throws RecognitionException {
        EObject current = null;

        EObject this_Level2Expression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:438:28: ( (this_Level2Expression_0= ruleLevel2Expression ( () ( (lv_operator_2_0= ruleLevel3Operator ) ) ( (lv_subExpressions_3_0= ruleLevel3Expression ) ) )? ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:439:1: (this_Level2Expression_0= ruleLevel2Expression ( () ( (lv_operator_2_0= ruleLevel3Operator ) ) ( (lv_subExpressions_3_0= ruleLevel3Expression ) ) )? )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:439:1: (this_Level2Expression_0= ruleLevel2Expression ( () ( (lv_operator_2_0= ruleLevel3Operator ) ) ( (lv_subExpressions_3_0= ruleLevel3Expression ) ) )? )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:440:5: this_Level2Expression_0= ruleLevel2Expression ( () ( (lv_operator_2_0= ruleLevel3Operator ) ) ( (lv_subExpressions_3_0= ruleLevel3Expression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getLevel3ExpressionAccess().getLevel2ExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleLevel2Expression_in_ruleLevel3Expression908);
            this_Level2Expression_0=ruleLevel2Expression();

            state._fsp--;

             
                    current = this_Level2Expression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:448:1: ( () ( (lv_operator_2_0= ruleLevel3Operator ) ) ( (lv_subExpressions_3_0= ruleLevel3Expression ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:448:2: () ( (lv_operator_2_0= ruleLevel3Operator ) ) ( (lv_subExpressions_3_0= ruleLevel3Expression ) )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:448:2: ()
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:449:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getLevel3ExpressionAccess().getCompositeExprSubExpressionsAction_1_0(),
                                current);
                        

                    }

                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:454:2: ( (lv_operator_2_0= ruleLevel3Operator ) )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:455:1: (lv_operator_2_0= ruleLevel3Operator )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:455:1: (lv_operator_2_0= ruleLevel3Operator )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:456:3: lv_operator_2_0= ruleLevel3Operator
                    {
                     
                    	        newCompositeNode(grammarAccess.getLevel3ExpressionAccess().getOperatorLevel3OperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLevel3Operator_in_ruleLevel3Expression938);
                    lv_operator_2_0=ruleLevel3Operator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLevel3ExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"Level3Operator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:472:2: ( (lv_subExpressions_3_0= ruleLevel3Expression ) )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:473:1: (lv_subExpressions_3_0= ruleLevel3Expression )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:473:1: (lv_subExpressions_3_0= ruleLevel3Expression )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:474:3: lv_subExpressions_3_0= ruleLevel3Expression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLevel3ExpressionAccess().getSubExpressionsLevel3ExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLevel3Expression_in_ruleLevel3Expression959);
                    lv_subExpressions_3_0=ruleLevel3Expression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLevel3ExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"subExpressions",
                            		lv_subExpressions_3_0, 
                            		"Level3Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleLevel3Expression"


    // $ANTLR start "entryRuleLevel2Expression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:498:1: entryRuleLevel2Expression returns [EObject current=null] : iv_ruleLevel2Expression= ruleLevel2Expression EOF ;
    public final EObject entryRuleLevel2Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevel2Expression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:499:2: (iv_ruleLevel2Expression= ruleLevel2Expression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:500:2: iv_ruleLevel2Expression= ruleLevel2Expression EOF
            {
             newCompositeNode(grammarAccess.getLevel2ExpressionRule()); 
            pushFollow(FOLLOW_ruleLevel2Expression_in_entryRuleLevel2Expression997);
            iv_ruleLevel2Expression=ruleLevel2Expression();

            state._fsp--;

             current =iv_ruleLevel2Expression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLevel2Expression1007); 

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
    // $ANTLR end "entryRuleLevel2Expression"


    // $ANTLR start "ruleLevel2Expression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:507:1: ruleLevel2Expression returns [EObject current=null] : (this_Level1Expression_0= ruleLevel1Expression ( () ( (lv_operator_2_0= ruleLevel2Operator ) ) ( (lv_subExpressions_3_0= ruleLevel2Expression ) ) )? ) ;
    public final EObject ruleLevel2Expression() throws RecognitionException {
        EObject current = null;

        EObject this_Level1Expression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:510:28: ( (this_Level1Expression_0= ruleLevel1Expression ( () ( (lv_operator_2_0= ruleLevel2Operator ) ) ( (lv_subExpressions_3_0= ruleLevel2Expression ) ) )? ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:511:1: (this_Level1Expression_0= ruleLevel1Expression ( () ( (lv_operator_2_0= ruleLevel2Operator ) ) ( (lv_subExpressions_3_0= ruleLevel2Expression ) ) )? )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:511:1: (this_Level1Expression_0= ruleLevel1Expression ( () ( (lv_operator_2_0= ruleLevel2Operator ) ) ( (lv_subExpressions_3_0= ruleLevel2Expression ) ) )? )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:512:5: this_Level1Expression_0= ruleLevel1Expression ( () ( (lv_operator_2_0= ruleLevel2Operator ) ) ( (lv_subExpressions_3_0= ruleLevel2Expression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getLevel2ExpressionAccess().getLevel1ExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleLevel1Expression_in_ruleLevel2Expression1054);
            this_Level1Expression_0=ruleLevel1Expression();

            state._fsp--;

             
                    current = this_Level1Expression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:520:1: ( () ( (lv_operator_2_0= ruleLevel2Operator ) ) ( (lv_subExpressions_3_0= ruleLevel2Expression ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=39 && LA5_0<=40)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:520:2: () ( (lv_operator_2_0= ruleLevel2Operator ) ) ( (lv_subExpressions_3_0= ruleLevel2Expression ) )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:520:2: ()
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:521:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getLevel2ExpressionAccess().getCompositeExprSubExpressionsAction_1_0(),
                                current);
                        

                    }

                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:526:2: ( (lv_operator_2_0= ruleLevel2Operator ) )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:527:1: (lv_operator_2_0= ruleLevel2Operator )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:527:1: (lv_operator_2_0= ruleLevel2Operator )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:528:3: lv_operator_2_0= ruleLevel2Operator
                    {
                     
                    	        newCompositeNode(grammarAccess.getLevel2ExpressionAccess().getOperatorLevel2OperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLevel2Operator_in_ruleLevel2Expression1084);
                    lv_operator_2_0=ruleLevel2Operator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLevel2ExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"Level2Operator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:544:2: ( (lv_subExpressions_3_0= ruleLevel2Expression ) )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:545:1: (lv_subExpressions_3_0= ruleLevel2Expression )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:545:1: (lv_subExpressions_3_0= ruleLevel2Expression )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:546:3: lv_subExpressions_3_0= ruleLevel2Expression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLevel2ExpressionAccess().getSubExpressionsLevel2ExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLevel2Expression_in_ruleLevel2Expression1105);
                    lv_subExpressions_3_0=ruleLevel2Expression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLevel2ExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"subExpressions",
                            		lv_subExpressions_3_0, 
                            		"Level2Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleLevel2Expression"


    // $ANTLR start "entryRuleLevel1Expression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:570:1: entryRuleLevel1Expression returns [EObject current=null] : iv_ruleLevel1Expression= ruleLevel1Expression EOF ;
    public final EObject entryRuleLevel1Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevel1Expression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:571:2: (iv_ruleLevel1Expression= ruleLevel1Expression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:572:2: iv_ruleLevel1Expression= ruleLevel1Expression EOF
            {
             newCompositeNode(grammarAccess.getLevel1ExpressionRule()); 
            pushFollow(FOLLOW_ruleLevel1Expression_in_entryRuleLevel1Expression1143);
            iv_ruleLevel1Expression=ruleLevel1Expression();

            state._fsp--;

             current =iv_ruleLevel1Expression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLevel1Expression1153); 

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
    // $ANTLR end "entryRuleLevel1Expression"


    // $ANTLR start "ruleLevel1Expression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:579:1: ruleLevel1Expression returns [EObject current=null] : (this_SimpleExpression_0= ruleSimpleExpression ( () ( (lv_operator_2_0= ruleLevel1Operator ) ) ( (lv_subExpressions_3_0= ruleLevel1Expression ) ) )? ) ;
    public final EObject ruleLevel1Expression() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:582:28: ( (this_SimpleExpression_0= ruleSimpleExpression ( () ( (lv_operator_2_0= ruleLevel1Operator ) ) ( (lv_subExpressions_3_0= ruleLevel1Expression ) ) )? ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:583:1: (this_SimpleExpression_0= ruleSimpleExpression ( () ( (lv_operator_2_0= ruleLevel1Operator ) ) ( (lv_subExpressions_3_0= ruleLevel1Expression ) ) )? )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:583:1: (this_SimpleExpression_0= ruleSimpleExpression ( () ( (lv_operator_2_0= ruleLevel1Operator ) ) ( (lv_subExpressions_3_0= ruleLevel1Expression ) ) )? )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:584:5: this_SimpleExpression_0= ruleSimpleExpression ( () ( (lv_operator_2_0= ruleLevel1Operator ) ) ( (lv_subExpressions_3_0= ruleLevel1Expression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getLevel1ExpressionAccess().getSimpleExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSimpleExpression_in_ruleLevel1Expression1200);
            this_SimpleExpression_0=ruleSimpleExpression();

            state._fsp--;

             
                    current = this_SimpleExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:592:1: ( () ( (lv_operator_2_0= ruleLevel1Operator ) ) ( (lv_subExpressions_3_0= ruleLevel1Expression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=34 && LA6_0<=38)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:592:2: () ( (lv_operator_2_0= ruleLevel1Operator ) ) ( (lv_subExpressions_3_0= ruleLevel1Expression ) )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:592:2: ()
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:593:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getLevel1ExpressionAccess().getCompositeExprSubExpressionsAction_1_0(),
                                current);
                        

                    }

                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:598:2: ( (lv_operator_2_0= ruleLevel1Operator ) )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:599:1: (lv_operator_2_0= ruleLevel1Operator )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:599:1: (lv_operator_2_0= ruleLevel1Operator )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:600:3: lv_operator_2_0= ruleLevel1Operator
                    {
                     
                    	        newCompositeNode(grammarAccess.getLevel1ExpressionAccess().getOperatorLevel1OperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLevel1Operator_in_ruleLevel1Expression1230);
                    lv_operator_2_0=ruleLevel1Operator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLevel1ExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"Level1Operator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:616:2: ( (lv_subExpressions_3_0= ruleLevel1Expression ) )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:617:1: (lv_subExpressions_3_0= ruleLevel1Expression )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:617:1: (lv_subExpressions_3_0= ruleLevel1Expression )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:618:3: lv_subExpressions_3_0= ruleLevel1Expression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLevel1ExpressionAccess().getSubExpressionsLevel1ExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLevel1Expression_in_ruleLevel1Expression1251);
                    lv_subExpressions_3_0=ruleLevel1Expression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLevel1ExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"subExpressions",
                            		lv_subExpressions_3_0, 
                            		"Level1Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleLevel1Expression"


    // $ANTLR start "entryRuleSimpleExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:642:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:643:2: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:644:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
             newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            pushFollow(FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression1289);
            iv_ruleSimpleExpression=ruleSimpleExpression();

            state._fsp--;

             current =iv_ruleSimpleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpression1299); 

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
    // $ANTLR end "entryRuleSimpleExpression"


    // $ANTLR start "ruleSimpleExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:651:1: ruleSimpleExpression returns [EObject current=null] : (this_SeqExpression_0= ruleSeqExpression | this_BooleanExpression_1= ruleBooleanExpression | this_NumberExpression_2= ruleNumberExpression | this_StringExpression_3= ruleStringExpression | this_FunctionCall_4= ruleFunctionCall | this_Identifier_5= ruleIdentifier | this_IfExpression_6= ruleIfExpression | this_NotExpression_7= ruleNotExpression | this_InputExpression_8= ruleInputExpression | this_OutputExpression_9= ruleOutputExpression | (otherlv_10= '(' this_Expression_11= ruleExpression otherlv_12= ')' ) | this_MapExpression_13= ruleMapExpression | this_PutExpression_14= rulePutExpression | this_RemoveExpression_15= ruleRemoveExpression | this_GetExpression_16= ruleGetExpression ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_SeqExpression_0 = null;

        EObject this_BooleanExpression_1 = null;

        EObject this_NumberExpression_2 = null;

        EObject this_StringExpression_3 = null;

        EObject this_FunctionCall_4 = null;

        EObject this_Identifier_5 = null;

        EObject this_IfExpression_6 = null;

        EObject this_NotExpression_7 = null;

        EObject this_InputExpression_8 = null;

        EObject this_OutputExpression_9 = null;

        EObject this_Expression_11 = null;

        EObject this_MapExpression_13 = null;

        EObject this_PutExpression_14 = null;

        EObject this_RemoveExpression_15 = null;

        EObject this_GetExpression_16 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:654:28: ( (this_SeqExpression_0= ruleSeqExpression | this_BooleanExpression_1= ruleBooleanExpression | this_NumberExpression_2= ruleNumberExpression | this_StringExpression_3= ruleStringExpression | this_FunctionCall_4= ruleFunctionCall | this_Identifier_5= ruleIdentifier | this_IfExpression_6= ruleIfExpression | this_NotExpression_7= ruleNotExpression | this_InputExpression_8= ruleInputExpression | this_OutputExpression_9= ruleOutputExpression | (otherlv_10= '(' this_Expression_11= ruleExpression otherlv_12= ')' ) | this_MapExpression_13= ruleMapExpression | this_PutExpression_14= rulePutExpression | this_RemoveExpression_15= ruleRemoveExpression | this_GetExpression_16= ruleGetExpression ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:655:1: (this_SeqExpression_0= ruleSeqExpression | this_BooleanExpression_1= ruleBooleanExpression | this_NumberExpression_2= ruleNumberExpression | this_StringExpression_3= ruleStringExpression | this_FunctionCall_4= ruleFunctionCall | this_Identifier_5= ruleIdentifier | this_IfExpression_6= ruleIfExpression | this_NotExpression_7= ruleNotExpression | this_InputExpression_8= ruleInputExpression | this_OutputExpression_9= ruleOutputExpression | (otherlv_10= '(' this_Expression_11= ruleExpression otherlv_12= ')' ) | this_MapExpression_13= ruleMapExpression | this_PutExpression_14= rulePutExpression | this_RemoveExpression_15= ruleRemoveExpression | this_GetExpression_16= ruleGetExpression )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:655:1: (this_SeqExpression_0= ruleSeqExpression | this_BooleanExpression_1= ruleBooleanExpression | this_NumberExpression_2= ruleNumberExpression | this_StringExpression_3= ruleStringExpression | this_FunctionCall_4= ruleFunctionCall | this_Identifier_5= ruleIdentifier | this_IfExpression_6= ruleIfExpression | this_NotExpression_7= ruleNotExpression | this_InputExpression_8= ruleInputExpression | this_OutputExpression_9= ruleOutputExpression | (otherlv_10= '(' this_Expression_11= ruleExpression otherlv_12= ')' ) | this_MapExpression_13= ruleMapExpression | this_PutExpression_14= rulePutExpression | this_RemoveExpression_15= ruleRemoveExpression | this_GetExpression_16= ruleGetExpression )
            int alt7=15;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:656:5: this_SeqExpression_0= ruleSeqExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExpressionAccess().getSeqExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSeqExpression_in_ruleSimpleExpression1346);
                    this_SeqExpression_0=ruleSeqExpression();

                    state._fsp--;

                     
                            current = this_SeqExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:666:5: this_BooleanExpression_1= ruleBooleanExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExpressionAccess().getBooleanExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleSimpleExpression1373);
                    this_BooleanExpression_1=ruleBooleanExpression();

                    state._fsp--;

                     
                            current = this_BooleanExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:676:5: this_NumberExpression_2= ruleNumberExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExpressionAccess().getNumberExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumberExpression_in_ruleSimpleExpression1400);
                    this_NumberExpression_2=ruleNumberExpression();

                    state._fsp--;

                     
                            current = this_NumberExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:686:5: this_StringExpression_3= ruleStringExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExpressionAccess().getStringExpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleSimpleExpression1427);
                    this_StringExpression_3=ruleStringExpression();

                    state._fsp--;

                     
                            current = this_StringExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:696:5: this_FunctionCall_4= ruleFunctionCall
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExpressionAccess().getFunctionCallParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleSimpleExpression1454);
                    this_FunctionCall_4=ruleFunctionCall();

                    state._fsp--;

                     
                            current = this_FunctionCall_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:706:5: this_Identifier_5= ruleIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExpressionAccess().getIdentifierParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleSimpleExpression1481);
                    this_Identifier_5=ruleIdentifier();

                    state._fsp--;

                     
                            current = this_Identifier_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:716:5: this_IfExpression_6= ruleIfExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExpressionAccess().getIfExpressionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleIfExpression_in_ruleSimpleExpression1508);
                    this_IfExpression_6=ruleIfExpression();

                    state._fsp--;

                     
                            current = this_IfExpression_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:726:5: this_NotExpression_7= ruleNotExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExpressionAccess().getNotExpressionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleSimpleExpression1535);
                    this_NotExpression_7=ruleNotExpression();

                    state._fsp--;

                     
                            current = this_NotExpression_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:736:5: this_InputExpression_8= ruleInputExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExpressionAccess().getInputExpressionParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleInputExpression_in_ruleSimpleExpression1562);
                    this_InputExpression_8=ruleInputExpression();

                    state._fsp--;

                     
                            current = this_InputExpression_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:746:5: this_OutputExpression_9= ruleOutputExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExpressionAccess().getOutputExpressionParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleOutputExpression_in_ruleSimpleExpression1589);
                    this_OutputExpression_9=ruleOutputExpression();

                    state._fsp--;

                     
                            current = this_OutputExpression_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:755:6: (otherlv_10= '(' this_Expression_11= ruleExpression otherlv_12= ')' )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:755:6: (otherlv_10= '(' this_Expression_11= ruleExpression otherlv_12= ')' )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:755:8: otherlv_10= '(' this_Expression_11= ruleExpression otherlv_12= ')'
                    {
                    otherlv_10=(Token)match(input,11,FOLLOW_11_in_ruleSimpleExpression1607); 

                        	newLeafNode(otherlv_10, grammarAccess.getSimpleExpressionAccess().getLeftParenthesisKeyword_10_0());
                        
                     
                            newCompositeNode(grammarAccess.getSimpleExpressionAccess().getExpressionParserRuleCall_10_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleSimpleExpression1629);
                    this_Expression_11=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_11; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleSimpleExpression1640); 

                        	newLeafNode(otherlv_12, grammarAccess.getSimpleExpressionAccess().getRightParenthesisKeyword_10_2());
                        

                    }


                    }
                    break;
                case 12 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:774:5: this_MapExpression_13= ruleMapExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExpressionAccess().getMapExpressionParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleMapExpression_in_ruleSimpleExpression1669);
                    this_MapExpression_13=ruleMapExpression();

                    state._fsp--;

                     
                            current = this_MapExpression_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:784:5: this_PutExpression_14= rulePutExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExpressionAccess().getPutExpressionParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_rulePutExpression_in_ruleSimpleExpression1696);
                    this_PutExpression_14=rulePutExpression();

                    state._fsp--;

                     
                            current = this_PutExpression_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:794:5: this_RemoveExpression_15= ruleRemoveExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExpressionAccess().getRemoveExpressionParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleRemoveExpression_in_ruleSimpleExpression1723);
                    this_RemoveExpression_15=ruleRemoveExpression();

                    state._fsp--;

                     
                            current = this_RemoveExpression_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:804:5: this_GetExpression_16= ruleGetExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExpressionAccess().getGetExpressionParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleGetExpression_in_ruleSimpleExpression1750);
                    this_GetExpression_16=ruleGetExpression();

                    state._fsp--;

                     
                            current = this_GetExpression_16; 
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
    // $ANTLR end "ruleSimpleExpression"


    // $ANTLR start "entryRuleInputExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:820:1: entryRuleInputExpression returns [EObject current=null] : iv_ruleInputExpression= ruleInputExpression EOF ;
    public final EObject entryRuleInputExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputExpression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:821:2: (iv_ruleInputExpression= ruleInputExpression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:822:2: iv_ruleInputExpression= ruleInputExpression EOF
            {
             newCompositeNode(grammarAccess.getInputExpressionRule()); 
            pushFollow(FOLLOW_ruleInputExpression_in_entryRuleInputExpression1785);
            iv_ruleInputExpression=ruleInputExpression();

            state._fsp--;

             current =iv_ruleInputExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputExpression1795); 

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
    // $ANTLR end "entryRuleInputExpression"


    // $ANTLR start "ruleInputExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:829:1: ruleInputExpression returns [EObject current=null] : (otherlv_0= 'input' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleInputExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_message_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:832:28: ( (otherlv_0= 'input' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:833:1: (otherlv_0= 'input' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:833:1: (otherlv_0= 'input' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:833:3: otherlv_0= 'input' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleInputExpression1832); 

                	newLeafNode(otherlv_0, grammarAccess.getInputExpressionAccess().getInputKeyword_0());
                
            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleInputExpression1844); 

                	newLeafNode(otherlv_1, grammarAccess.getInputExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:841:1: ( (lv_message_2_0= RULE_STRING ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:842:1: (lv_message_2_0= RULE_STRING )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:842:1: (lv_message_2_0= RULE_STRING )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:843:3: lv_message_2_0= RULE_STRING
            {
            lv_message_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInputExpression1861); 

            			newLeafNode(lv_message_2_0, grammarAccess.getInputExpressionAccess().getMessageSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"message",
                    		lv_message_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleInputExpression1878); 

                	newLeafNode(otherlv_3, grammarAccess.getInputExpressionAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleInputExpression"


    // $ANTLR start "entryRuleOutputExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:871:1: entryRuleOutputExpression returns [EObject current=null] : iv_ruleOutputExpression= ruleOutputExpression EOF ;
    public final EObject entryRuleOutputExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputExpression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:872:2: (iv_ruleOutputExpression= ruleOutputExpression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:873:2: iv_ruleOutputExpression= ruleOutputExpression EOF
            {
             newCompositeNode(grammarAccess.getOutputExpressionRule()); 
            pushFollow(FOLLOW_ruleOutputExpression_in_entryRuleOutputExpression1914);
            iv_ruleOutputExpression=ruleOutputExpression();

            state._fsp--;

             current =iv_ruleOutputExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputExpression1924); 

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
    // $ANTLR end "entryRuleOutputExpression"


    // $ANTLR start "ruleOutputExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:880:1: ruleOutputExpression returns [EObject current=null] : (otherlv_0= 'output' otherlv_1= '(' ( (lv_parameter_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleOutputExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameter_2_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:883:28: ( (otherlv_0= 'output' otherlv_1= '(' ( (lv_parameter_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:884:1: (otherlv_0= 'output' otherlv_1= '(' ( (lv_parameter_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:884:1: (otherlv_0= 'output' otherlv_1= '(' ( (lv_parameter_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:884:3: otherlv_0= 'output' otherlv_1= '(' ( (lv_parameter_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleOutputExpression1961); 

                	newLeafNode(otherlv_0, grammarAccess.getOutputExpressionAccess().getOutputKeyword_0());
                
            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleOutputExpression1973); 

                	newLeafNode(otherlv_1, grammarAccess.getOutputExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:892:1: ( (lv_parameter_2_0= ruleExpression ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:893:1: (lv_parameter_2_0= ruleExpression )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:893:1: (lv_parameter_2_0= ruleExpression )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:894:3: lv_parameter_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getOutputExpressionAccess().getParameterExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleOutputExpression1994);
            lv_parameter_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutputExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"parameter",
                    		lv_parameter_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleOutputExpression2006); 

                	newLeafNode(otherlv_3, grammarAccess.getOutputExpressionAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleOutputExpression"


    // $ANTLR start "entryRuleIfExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:922:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:923:2: (iv_ruleIfExpression= ruleIfExpression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:924:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
             newCompositeNode(grammarAccess.getIfExpressionRule()); 
            pushFollow(FOLLOW_ruleIfExpression_in_entryRuleIfExpression2042);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;

             current =iv_ruleIfExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExpression2052); 

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
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:931:1: ruleIfExpression returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_alternative_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_cond_2_0 = null;

        EObject lv_consequent_4_0 = null;

        EObject lv_alternative_6_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:934:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_alternative_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:935:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_alternative_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:935:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_alternative_6_0= ruleExpression ) ) otherlv_7= ')' )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:935:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_alternative_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleIfExpression2089); 

                	newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleIfExpression2101); 

                	newLeafNode(otherlv_1, grammarAccess.getIfExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:943:1: ( (lv_cond_2_0= ruleExpression ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:944:1: (lv_cond_2_0= ruleExpression )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:944:1: (lv_cond_2_0= ruleExpression )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:945:3: lv_cond_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getIfExpressionAccess().getCondExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleIfExpression2122);
            lv_cond_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"cond",
                    		lv_cond_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleIfExpression2134); 

                	newLeafNode(otherlv_3, grammarAccess.getIfExpressionAccess().getCommaKeyword_3());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:965:1: ( (lv_consequent_4_0= ruleExpression ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:966:1: (lv_consequent_4_0= ruleExpression )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:966:1: (lv_consequent_4_0= ruleExpression )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:967:3: lv_consequent_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getIfExpressionAccess().getConsequentExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleIfExpression2155);
            lv_consequent_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"consequent",
                    		lv_consequent_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleIfExpression2167); 

                	newLeafNode(otherlv_5, grammarAccess.getIfExpressionAccess().getCommaKeyword_5());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:987:1: ( (lv_alternative_6_0= ruleExpression ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:988:1: (lv_alternative_6_0= ruleExpression )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:988:1: (lv_alternative_6_0= ruleExpression )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:989:3: lv_alternative_6_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getIfExpressionAccess().getAlternativeExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleIfExpression2188);
            lv_alternative_6_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"alternative",
                    		lv_alternative_6_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleIfExpression2200); 

                	newLeafNode(otherlv_7, grammarAccess.getIfExpressionAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleFunctionCall"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1017:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1018:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1019:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall2236);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall2246); 

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1026:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1029:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1030:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1030:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1030:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1030:2: ( (otherlv_0= RULE_ID ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1031:1: (otherlv_0= RULE_ID )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1031:1: (otherlv_0= RULE_ID )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1032:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionCall2291); 

            		newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getFunctionFunctionDefinitionCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleFunctionCall2303); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1047:1: ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_INT)||LA9_0==11||(LA9_0>=17 && LA9_0<=23)||(LA9_0>=31 && LA9_0<=33)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1047:2: ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1047:2: ( (lv_arguments_2_0= ruleExpression ) )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1048:1: (lv_arguments_2_0= ruleExpression )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1048:1: (lv_arguments_2_0= ruleExpression )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1049:3: lv_arguments_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsExpressionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall2325);
                    lv_arguments_2_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_2_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1065:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==12) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1065:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleFunctionCall2338); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1069:1: ( (lv_arguments_4_0= ruleExpression ) )
                    	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1070:1: (lv_arguments_4_0= ruleExpression )
                    	    {
                    	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1070:1: (lv_arguments_4_0= ruleExpression )
                    	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1071:3: lv_arguments_4_0= ruleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsExpressionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall2359);
                    	    lv_arguments_4_0=ruleExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_4_0, 
                    	            		"Expression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleFunctionCall2375); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleStringExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1099:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1100:2: (iv_ruleStringExpression= ruleStringExpression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1101:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
             newCompositeNode(grammarAccess.getStringExpressionRule()); 
            pushFollow(FOLLOW_ruleStringExpression_in_entryRuleStringExpression2411);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;

             current =iv_ruleStringExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpression2421); 

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
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1108:1: ruleStringExpression returns [EObject current=null] : ( (lv_string_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;

         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1111:28: ( ( (lv_string_0_0= RULE_STRING ) ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1112:1: ( (lv_string_0_0= RULE_STRING ) )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1112:1: ( (lv_string_0_0= RULE_STRING ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1113:1: (lv_string_0_0= RULE_STRING )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1113:1: (lv_string_0_0= RULE_STRING )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1114:3: lv_string_0_0= RULE_STRING
            {
            lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringExpression2462); 

            			newLeafNode(lv_string_0_0, grammarAccess.getStringExpressionAccess().getStringSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringExpressionRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"string",
                    		lv_string_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleNotExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1138:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1139:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1140:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
             newCompositeNode(grammarAccess.getNotExpressionRule()); 
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression2502);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;

             current =iv_ruleNotExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression2512); 

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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1147:1: ruleNotExpression returns [EObject current=null] : (otherlv_0= '!' ( (lv_subExpr_1_0= ruleSimpleExpression ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_subExpr_1_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1150:28: ( (otherlv_0= '!' ( (lv_subExpr_1_0= ruleSimpleExpression ) ) ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1151:1: (otherlv_0= '!' ( (lv_subExpr_1_0= ruleSimpleExpression ) ) )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1151:1: (otherlv_0= '!' ( (lv_subExpr_1_0= ruleSimpleExpression ) ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1151:3: otherlv_0= '!' ( (lv_subExpr_1_0= ruleSimpleExpression ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleNotExpression2549); 

                	newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getExclamationMarkKeyword_0());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1155:1: ( (lv_subExpr_1_0= ruleSimpleExpression ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1156:1: (lv_subExpr_1_0= ruleSimpleExpression )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1156:1: (lv_subExpr_1_0= ruleSimpleExpression )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1157:3: lv_subExpr_1_0= ruleSimpleExpression
            {
             
            	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExprSimpleExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleExpression_in_ruleNotExpression2570);
            lv_subExpr_1_0=ruleSimpleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNotExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"subExpr",
                    		lv_subExpr_1_0, 
                    		"SimpleExpression");
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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleNumberExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1181:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1182:2: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1183:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
             newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            pushFollow(FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression2606);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;

             current =iv_ruleNumberExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpression2616); 

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
    // $ANTLR end "entryRuleNumberExpression"


    // $ANTLR start "ruleNumberExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1190:1: ruleNumberExpression returns [EObject current=null] : ( (lv_number_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;

         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1193:28: ( ( (lv_number_0_0= RULE_INT ) ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1194:1: ( (lv_number_0_0= RULE_INT ) )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1194:1: ( (lv_number_0_0= RULE_INT ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1195:1: (lv_number_0_0= RULE_INT )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1195:1: (lv_number_0_0= RULE_INT )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1196:3: lv_number_0_0= RULE_INT
            {
            lv_number_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberExpression2657); 

            			newLeafNode(lv_number_0_0, grammarAccess.getNumberExpressionAccess().getNumberINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumberExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"number",
                    		lv_number_0_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleNumberExpression"


    // $ANTLR start "entryRuleBooleanExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1220:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1221:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1222:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression2697);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression2707); 

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1229:1: ruleBooleanExpression returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | otherlv_2= 'FALSE' ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1232:28: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | otherlv_2= 'FALSE' ) ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1233:1: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | otherlv_2= 'FALSE' ) )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1233:1: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | otherlv_2= 'FALSE' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1233:2: () ( ( (lv_value_1_0= 'TRUE' ) ) | otherlv_2= 'FALSE' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1233:2: ()
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1234:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanExpressionAccess().getBooleanExpressionAction_0(),
                        current);
                

            }

            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1239:2: ( ( (lv_value_1_0= 'TRUE' ) ) | otherlv_2= 'FALSE' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1239:3: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1239:3: ( (lv_value_1_0= 'TRUE' ) )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1240:1: (lv_value_1_0= 'TRUE' )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1240:1: (lv_value_1_0= 'TRUE' )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1241:3: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,21,FOLLOW_21_in_ruleBooleanExpression2760); 

                            newLeafNode(lv_value_1_0, grammarAccess.getBooleanExpressionAccess().getValueTRUEKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "value", true, "TRUE");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1255:7: otherlv_2= 'FALSE'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleBooleanExpression2791); 

                        	newLeafNode(otherlv_2, grammarAccess.getBooleanExpressionAccess().getFALSEKeyword_1_1());
                        

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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleSeqExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1267:1: entryRuleSeqExpression returns [EObject current=null] : iv_ruleSeqExpression= ruleSeqExpression EOF ;
    public final EObject entryRuleSeqExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeqExpression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1268:2: (iv_ruleSeqExpression= ruleSeqExpression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1269:2: iv_ruleSeqExpression= ruleSeqExpression EOF
            {
             newCompositeNode(grammarAccess.getSeqExpressionRule()); 
            pushFollow(FOLLOW_ruleSeqExpression_in_entryRuleSeqExpression2828);
            iv_ruleSeqExpression=ruleSeqExpression();

            state._fsp--;

             current =iv_ruleSeqExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSeqExpression2838); 

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
    // $ANTLR end "entryRuleSeqExpression"


    // $ANTLR start "ruleSeqExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1276:1: ruleSeqExpression returns [EObject current=null] : (otherlv_0= 'seq' otherlv_1= '(' ( (lv_subExpressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_subExpressions_4_0= ruleExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleSeqExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_subExpressions_2_0 = null;

        EObject lv_subExpressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1279:28: ( (otherlv_0= 'seq' otherlv_1= '(' ( (lv_subExpressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_subExpressions_4_0= ruleExpression ) ) )* otherlv_5= ')' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1280:1: (otherlv_0= 'seq' otherlv_1= '(' ( (lv_subExpressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_subExpressions_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1280:1: (otherlv_0= 'seq' otherlv_1= '(' ( (lv_subExpressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_subExpressions_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1280:3: otherlv_0= 'seq' otherlv_1= '(' ( (lv_subExpressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_subExpressions_4_0= ruleExpression ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleSeqExpression2875); 

                	newLeafNode(otherlv_0, grammarAccess.getSeqExpressionAccess().getSeqKeyword_0());
                
            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleSeqExpression2887); 

                	newLeafNode(otherlv_1, grammarAccess.getSeqExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1288:1: ( (lv_subExpressions_2_0= ruleExpression ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1289:1: (lv_subExpressions_2_0= ruleExpression )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1289:1: (lv_subExpressions_2_0= ruleExpression )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1290:3: lv_subExpressions_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getSeqExpressionAccess().getSubExpressionsExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSeqExpression2908);
            lv_subExpressions_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSeqExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"subExpressions",
                    		lv_subExpressions_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1306:2: (otherlv_3= ',' ( (lv_subExpressions_4_0= ruleExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==12) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1306:4: otherlv_3= ',' ( (lv_subExpressions_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSeqExpression2921); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSeqExpressionAccess().getCommaKeyword_3_0());
            	        
            	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1310:1: ( (lv_subExpressions_4_0= ruleExpression ) )
            	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1311:1: (lv_subExpressions_4_0= ruleExpression )
            	    {
            	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1311:1: (lv_subExpressions_4_0= ruleExpression )
            	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1312:3: lv_subExpressions_4_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSeqExpressionAccess().getSubExpressionsExpressionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSeqExpression2942);
            	    lv_subExpressions_4_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSeqExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subExpressions",
            	            		lv_subExpressions_4_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleSeqExpression2956); 

                	newLeafNode(otherlv_5, grammarAccess.getSeqExpressionAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSeqExpression"


    // $ANTLR start "entryRuleMapExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1340:1: entryRuleMapExpression returns [EObject current=null] : iv_ruleMapExpression= ruleMapExpression EOF ;
    public final EObject entryRuleMapExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapExpression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1341:2: (iv_ruleMapExpression= ruleMapExpression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1342:2: iv_ruleMapExpression= ruleMapExpression EOF
            {
             newCompositeNode(grammarAccess.getMapExpressionRule()); 
            pushFollow(FOLLOW_ruleMapExpression_in_entryRuleMapExpression2992);
            iv_ruleMapExpression=ruleMapExpression();

            state._fsp--;

             current =iv_ruleMapExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapExpression3002); 

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
    // $ANTLR end "entryRuleMapExpression"


    // $ANTLR start "ruleMapExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1349:1: ruleMapExpression returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_keyType_2_1= 'String' | lv_keyType_2_2= 'int' ) ) ) otherlv_3= ',' ( ( (lv_valueType_4_1= 'String' | lv_valueType_4_2= 'int' ) ) ) otherlv_5= ']' otherlv_6= '=' otherlv_7= '{' ( ( (lv_values_8_0= rulePairExpr ) ) (otherlv_9= ',' ( (lv_values_10_0= rulePairExpr ) ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleMapExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_keyType_2_1=null;
        Token lv_keyType_2_2=null;
        Token otherlv_3=null;
        Token lv_valueType_4_1=null;
        Token lv_valueType_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_values_8_0 = null;

        EObject lv_values_10_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1352:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_keyType_2_1= 'String' | lv_keyType_2_2= 'int' ) ) ) otherlv_3= ',' ( ( (lv_valueType_4_1= 'String' | lv_valueType_4_2= 'int' ) ) ) otherlv_5= ']' otherlv_6= '=' otherlv_7= '{' ( ( (lv_values_8_0= rulePairExpr ) ) (otherlv_9= ',' ( (lv_values_10_0= rulePairExpr ) ) )* )? otherlv_11= '}' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1353:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_keyType_2_1= 'String' | lv_keyType_2_2= 'int' ) ) ) otherlv_3= ',' ( ( (lv_valueType_4_1= 'String' | lv_valueType_4_2= 'int' ) ) ) otherlv_5= ']' otherlv_6= '=' otherlv_7= '{' ( ( (lv_values_8_0= rulePairExpr ) ) (otherlv_9= ',' ( (lv_values_10_0= rulePairExpr ) ) )* )? otherlv_11= '}' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1353:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_keyType_2_1= 'String' | lv_keyType_2_2= 'int' ) ) ) otherlv_3= ',' ( ( (lv_valueType_4_1= 'String' | lv_valueType_4_2= 'int' ) ) ) otherlv_5= ']' otherlv_6= '=' otherlv_7= '{' ( ( (lv_values_8_0= rulePairExpr ) ) (otherlv_9= ',' ( (lv_values_10_0= rulePairExpr ) ) )* )? otherlv_11= '}' )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1353:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_keyType_2_1= 'String' | lv_keyType_2_2= 'int' ) ) ) otherlv_3= ',' ( ( (lv_valueType_4_1= 'String' | lv_valueType_4_2= 'int' ) ) ) otherlv_5= ']' otherlv_6= '=' otherlv_7= '{' ( ( (lv_values_8_0= rulePairExpr ) ) (otherlv_9= ',' ( (lv_values_10_0= rulePairExpr ) ) )* )? otherlv_11= '}'
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1353:2: ( (lv_name_0_0= RULE_ID ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1354:1: (lv_name_0_0= RULE_ID )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1354:1: (lv_name_0_0= RULE_ID )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1355:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapExpression3044); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMapExpressionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMapExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleMapExpression3061); 

                	newLeafNode(otherlv_1, grammarAccess.getMapExpressionAccess().getLeftSquareBracketKeyword_1());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1375:1: ( ( (lv_keyType_2_1= 'String' | lv_keyType_2_2= 'int' ) ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1376:1: ( (lv_keyType_2_1= 'String' | lv_keyType_2_2= 'int' ) )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1376:1: ( (lv_keyType_2_1= 'String' | lv_keyType_2_2= 'int' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1377:1: (lv_keyType_2_1= 'String' | lv_keyType_2_2= 'int' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1377:1: (lv_keyType_2_1= 'String' | lv_keyType_2_2= 'int' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1378:3: lv_keyType_2_1= 'String'
                    {
                    lv_keyType_2_1=(Token)match(input,25,FOLLOW_25_in_ruleMapExpression3081); 

                            newLeafNode(lv_keyType_2_1, grammarAccess.getMapExpressionAccess().getKeyTypeStringKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "keyType", lv_keyType_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1390:8: lv_keyType_2_2= 'int'
                    {
                    lv_keyType_2_2=(Token)match(input,26,FOLLOW_26_in_ruleMapExpression3110); 

                            newLeafNode(lv_keyType_2_2, grammarAccess.getMapExpressionAccess().getKeyTypeIntKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "keyType", lv_keyType_2_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleMapExpression3138); 

                	newLeafNode(otherlv_3, grammarAccess.getMapExpressionAccess().getCommaKeyword_3());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1409:1: ( ( (lv_valueType_4_1= 'String' | lv_valueType_4_2= 'int' ) ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1410:1: ( (lv_valueType_4_1= 'String' | lv_valueType_4_2= 'int' ) )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1410:1: ( (lv_valueType_4_1= 'String' | lv_valueType_4_2= 'int' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1411:1: (lv_valueType_4_1= 'String' | lv_valueType_4_2= 'int' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1411:1: (lv_valueType_4_1= 'String' | lv_valueType_4_2= 'int' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==26) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1412:3: lv_valueType_4_1= 'String'
                    {
                    lv_valueType_4_1=(Token)match(input,25,FOLLOW_25_in_ruleMapExpression3158); 

                            newLeafNode(lv_valueType_4_1, grammarAccess.getMapExpressionAccess().getValueTypeStringKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "valueType", lv_valueType_4_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1424:8: lv_valueType_4_2= 'int'
                    {
                    lv_valueType_4_2=(Token)match(input,26,FOLLOW_26_in_ruleMapExpression3187); 

                            newLeafNode(lv_valueType_4_2, grammarAccess.getMapExpressionAccess().getValueTypeIntKeyword_4_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "valueType", lv_valueType_4_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleMapExpression3215); 

                	newLeafNode(otherlv_5, grammarAccess.getMapExpressionAccess().getRightSquareBracketKeyword_5());
                
            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleMapExpression3227); 

                	newLeafNode(otherlv_6, grammarAccess.getMapExpressionAccess().getEqualsSignKeyword_6());
                
            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleMapExpression3239); 

                	newLeafNode(otherlv_7, grammarAccess.getMapExpressionAccess().getLeftCurlyBracketKeyword_7());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1451:1: ( ( (lv_values_8_0= rulePairExpr ) ) (otherlv_9= ',' ( (lv_values_10_0= rulePairExpr ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_INT)||LA15_0==11||(LA15_0>=17 && LA15_0<=23)||(LA15_0>=31 && LA15_0<=33)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1451:2: ( (lv_values_8_0= rulePairExpr ) ) (otherlv_9= ',' ( (lv_values_10_0= rulePairExpr ) ) )*
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1451:2: ( (lv_values_8_0= rulePairExpr ) )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1452:1: (lv_values_8_0= rulePairExpr )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1452:1: (lv_values_8_0= rulePairExpr )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1453:3: lv_values_8_0= rulePairExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapExpressionAccess().getValuesPairExprParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePairExpr_in_ruleMapExpression3261);
                    lv_values_8_0=rulePairExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"values",
                            		lv_values_8_0, 
                            		"PairExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1469:2: (otherlv_9= ',' ( (lv_values_10_0= rulePairExpr ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==12) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1469:4: otherlv_9= ',' ( (lv_values_10_0= rulePairExpr ) )
                    	    {
                    	    otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleMapExpression3274); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getMapExpressionAccess().getCommaKeyword_8_1_0());
                    	        
                    	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1473:1: ( (lv_values_10_0= rulePairExpr ) )
                    	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1474:1: (lv_values_10_0= rulePairExpr )
                    	    {
                    	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1474:1: (lv_values_10_0= rulePairExpr )
                    	    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1475:3: lv_values_10_0= rulePairExpr
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapExpressionAccess().getValuesPairExprParserRuleCall_8_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePairExpr_in_ruleMapExpression3295);
                    	    lv_values_10_0=rulePairExpr();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"values",
                    	            		lv_values_10_0, 
                    	            		"PairExpr");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleMapExpression3311); 

                	newLeafNode(otherlv_11, grammarAccess.getMapExpressionAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleMapExpression"


    // $ANTLR start "entryRulePairExpr"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1503:1: entryRulePairExpr returns [EObject current=null] : iv_rulePairExpr= rulePairExpr EOF ;
    public final EObject entryRulePairExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePairExpr = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1504:2: (iv_rulePairExpr= rulePairExpr EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1505:2: iv_rulePairExpr= rulePairExpr EOF
            {
             newCompositeNode(grammarAccess.getPairExprRule()); 
            pushFollow(FOLLOW_rulePairExpr_in_entryRulePairExpr3347);
            iv_rulePairExpr=rulePairExpr();

            state._fsp--;

             current =iv_rulePairExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePairExpr3357); 

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
    // $ANTLR end "entryRulePairExpr"


    // $ANTLR start "rulePairExpr"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1512:1: rulePairExpr returns [EObject current=null] : ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= '->' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject rulePairExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_key_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1515:28: ( ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= '->' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1516:1: ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= '->' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1516:1: ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= '->' ( (lv_value_2_0= ruleExpression ) ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1516:2: ( (lv_key_0_0= ruleExpression ) ) otherlv_1= '->' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1516:2: ( (lv_key_0_0= ruleExpression ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1517:1: (lv_key_0_0= ruleExpression )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1517:1: (lv_key_0_0= ruleExpression )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1518:3: lv_key_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getPairExprAccess().getKeyExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_rulePairExpr3403);
            lv_key_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPairExprRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulePairExpr3415); 

                	newLeafNode(otherlv_1, grammarAccess.getPairExprAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1538:1: ( (lv_value_2_0= ruleExpression ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1539:1: (lv_value_2_0= ruleExpression )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1539:1: (lv_value_2_0= ruleExpression )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1540:3: lv_value_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getPairExprAccess().getValueExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_rulePairExpr3436);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPairExprRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Expression");
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
    // $ANTLR end "rulePairExpr"


    // $ANTLR start "entryRulePutExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1564:1: entryRulePutExpression returns [EObject current=null] : iv_rulePutExpression= rulePutExpression EOF ;
    public final EObject entryRulePutExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutExpression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1565:2: (iv_rulePutExpression= rulePutExpression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1566:2: iv_rulePutExpression= rulePutExpression EOF
            {
             newCompositeNode(grammarAccess.getPutExpressionRule()); 
            pushFollow(FOLLOW_rulePutExpression_in_entryRulePutExpression3472);
            iv_rulePutExpression=rulePutExpression();

            state._fsp--;

             current =iv_rulePutExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePutExpression3482); 

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
    // $ANTLR end "entryRulePutExpression"


    // $ANTLR start "rulePutExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1573:1: rulePutExpression returns [EObject current=null] : (otherlv_0= 'put' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_keyExpr_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_valExpr_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
    public final EObject rulePutExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_keyExpr_4_0 = null;

        EObject lv_valExpr_6_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1576:28: ( (otherlv_0= 'put' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_keyExpr_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_valExpr_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1577:1: (otherlv_0= 'put' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_keyExpr_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_valExpr_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1577:1: (otherlv_0= 'put' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_keyExpr_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_valExpr_6_0= ruleExpression ) ) otherlv_7= ')' )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1577:3: otherlv_0= 'put' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_keyExpr_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_valExpr_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_rulePutExpression3519); 

                	newLeafNode(otherlv_0, grammarAccess.getPutExpressionAccess().getPutKeyword_0());
                
            otherlv_1=(Token)match(input,11,FOLLOW_11_in_rulePutExpression3531); 

                	newLeafNode(otherlv_1, grammarAccess.getPutExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1585:1: ( (otherlv_2= RULE_ID ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1586:1: (otherlv_2= RULE_ID )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1586:1: (otherlv_2= RULE_ID )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1587:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPutExpressionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePutExpression3551); 

            		newLeafNode(otherlv_2, grammarAccess.getPutExpressionAccess().getMapMapExpressionCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_rulePutExpression3563); 

                	newLeafNode(otherlv_3, grammarAccess.getPutExpressionAccess().getCommaKeyword_3());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1602:1: ( (lv_keyExpr_4_0= ruleExpression ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1603:1: (lv_keyExpr_4_0= ruleExpression )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1603:1: (lv_keyExpr_4_0= ruleExpression )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1604:3: lv_keyExpr_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getPutExpressionAccess().getKeyExprExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_rulePutExpression3584);
            lv_keyExpr_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPutExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"keyExpr",
                    		lv_keyExpr_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_rulePutExpression3596); 

                	newLeafNode(otherlv_5, grammarAccess.getPutExpressionAccess().getCommaKeyword_5());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1624:1: ( (lv_valExpr_6_0= ruleExpression ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1625:1: (lv_valExpr_6_0= ruleExpression )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1625:1: (lv_valExpr_6_0= ruleExpression )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1626:3: lv_valExpr_6_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getPutExpressionAccess().getValExprExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_rulePutExpression3617);
            lv_valExpr_6_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPutExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"valExpr",
                    		lv_valExpr_6_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_rulePutExpression3629); 

                	newLeafNode(otherlv_7, grammarAccess.getPutExpressionAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "rulePutExpression"


    // $ANTLR start "entryRuleGetExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1654:1: entryRuleGetExpression returns [EObject current=null] : iv_ruleGetExpression= ruleGetExpression EOF ;
    public final EObject entryRuleGetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetExpression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1655:2: (iv_ruleGetExpression= ruleGetExpression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1656:2: iv_ruleGetExpression= ruleGetExpression EOF
            {
             newCompositeNode(grammarAccess.getGetExpressionRule()); 
            pushFollow(FOLLOW_ruleGetExpression_in_entryRuleGetExpression3665);
            iv_ruleGetExpression=ruleGetExpression();

            state._fsp--;

             current =iv_ruleGetExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetExpression3675); 

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
    // $ANTLR end "entryRuleGetExpression"


    // $ANTLR start "ruleGetExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1663:1: ruleGetExpression returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_keyExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleGetExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyExpr_4_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1666:28: ( (otherlv_0= 'get' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_keyExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1667:1: (otherlv_0= 'get' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_keyExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1667:1: (otherlv_0= 'get' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_keyExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1667:3: otherlv_0= 'get' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_keyExpr_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleGetExpression3712); 

                	newLeafNode(otherlv_0, grammarAccess.getGetExpressionAccess().getGetKeyword_0());
                
            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleGetExpression3724); 

                	newLeafNode(otherlv_1, grammarAccess.getGetExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1675:1: ( (otherlv_2= RULE_ID ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1676:1: (otherlv_2= RULE_ID )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1676:1: (otherlv_2= RULE_ID )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1677:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGetExpressionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetExpression3744); 

            		newLeafNode(otherlv_2, grammarAccess.getGetExpressionAccess().getMapMapExpressionCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleGetExpression3756); 

                	newLeafNode(otherlv_3, grammarAccess.getGetExpressionAccess().getCommaKeyword_3());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1692:1: ( (lv_keyExpr_4_0= ruleExpression ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1693:1: (lv_keyExpr_4_0= ruleExpression )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1693:1: (lv_keyExpr_4_0= ruleExpression )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1694:3: lv_keyExpr_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getGetExpressionAccess().getKeyExprExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleGetExpression3777);
            lv_keyExpr_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGetExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"keyExpr",
                    		lv_keyExpr_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleGetExpression3789); 

                	newLeafNode(otherlv_5, grammarAccess.getGetExpressionAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleGetExpression"


    // $ANTLR start "entryRuleRemoveExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1722:1: entryRuleRemoveExpression returns [EObject current=null] : iv_ruleRemoveExpression= ruleRemoveExpression EOF ;
    public final EObject entryRuleRemoveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveExpression = null;


        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1723:2: (iv_ruleRemoveExpression= ruleRemoveExpression EOF )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1724:2: iv_ruleRemoveExpression= ruleRemoveExpression EOF
            {
             newCompositeNode(grammarAccess.getRemoveExpressionRule()); 
            pushFollow(FOLLOW_ruleRemoveExpression_in_entryRuleRemoveExpression3825);
            iv_ruleRemoveExpression=ruleRemoveExpression();

            state._fsp--;

             current =iv_ruleRemoveExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRemoveExpression3835); 

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
    // $ANTLR end "entryRuleRemoveExpression"


    // $ANTLR start "ruleRemoveExpression"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1731:1: ruleRemoveExpression returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_keyExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleRemoveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyExpr_4_0 = null;


         enterRule(); 
            
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1734:28: ( (otherlv_0= 'remove' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_keyExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1735:1: (otherlv_0= 'remove' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_keyExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1735:1: (otherlv_0= 'remove' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_keyExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1735:3: otherlv_0= 'remove' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_keyExpr_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleRemoveExpression3872); 

                	newLeafNode(otherlv_0, grammarAccess.getRemoveExpressionAccess().getRemoveKeyword_0());
                
            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleRemoveExpression3884); 

                	newLeafNode(otherlv_1, grammarAccess.getRemoveExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1743:1: ( (otherlv_2= RULE_ID ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1744:1: (otherlv_2= RULE_ID )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1744:1: (otherlv_2= RULE_ID )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1745:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRemoveExpressionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRemoveExpression3904); 

            		newLeafNode(otherlv_2, grammarAccess.getRemoveExpressionAccess().getMapMapExpressionCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleRemoveExpression3916); 

                	newLeafNode(otherlv_3, grammarAccess.getRemoveExpressionAccess().getCommaKeyword_3());
                
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1760:1: ( (lv_keyExpr_4_0= ruleExpression ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1761:1: (lv_keyExpr_4_0= ruleExpression )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1761:1: (lv_keyExpr_4_0= ruleExpression )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1762:3: lv_keyExpr_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getRemoveExpressionAccess().getKeyExprExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleRemoveExpression3937);
            lv_keyExpr_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRemoveExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"keyExpr",
                    		lv_keyExpr_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleRemoveExpression3949); 

                	newLeafNode(otherlv_5, grammarAccess.getRemoveExpressionAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleRemoveExpression"


    // $ANTLR start "ruleLevel1Operator"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1790:1: ruleLevel1Operator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '::' ) | (enumLiteral_3= '&' ) | (enumLiteral_4= '|' ) ) ;
    public final Enumerator ruleLevel1Operator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1792:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '::' ) | (enumLiteral_3= '&' ) | (enumLiteral_4= '|' ) ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1793:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '::' ) | (enumLiteral_3= '&' ) | (enumLiteral_4= '|' ) )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1793:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '::' ) | (enumLiteral_3= '&' ) | (enumLiteral_4= '|' ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt16=1;
                }
                break;
            case 35:
                {
                alt16=2;
                }
                break;
            case 36:
                {
                alt16=3;
                }
                break;
            case 37:
                {
                alt16=4;
                }
                break;
            case 38:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1793:2: (enumLiteral_0= '*' )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1793:2: (enumLiteral_0= '*' )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1793:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_34_in_ruleLevel1Operator3999); 

                            current = grammarAccess.getLevel1OperatorAccess().getTIMESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLevel1OperatorAccess().getTIMESEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1799:6: (enumLiteral_1= '/' )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1799:6: (enumLiteral_1= '/' )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1799:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_35_in_ruleLevel1Operator4016); 

                            current = grammarAccess.getLevel1OperatorAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLevel1OperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1805:6: (enumLiteral_2= '::' )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1805:6: (enumLiteral_2= '::' )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1805:8: enumLiteral_2= '::'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_36_in_ruleLevel1Operator4033); 

                            current = grammarAccess.getLevel1OperatorAccess().getCONCATEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLevel1OperatorAccess().getCONCATEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1811:6: (enumLiteral_3= '&' )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1811:6: (enumLiteral_3= '&' )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1811:8: enumLiteral_3= '&'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_37_in_ruleLevel1Operator4050); 

                            current = grammarAccess.getLevel1OperatorAccess().getANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLevel1OperatorAccess().getANDEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1817:6: (enumLiteral_4= '|' )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1817:6: (enumLiteral_4= '|' )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1817:8: enumLiteral_4= '|'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_38_in_ruleLevel1Operator4067); 

                            current = grammarAccess.getLevel1OperatorAccess().getOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getLevel1OperatorAccess().getOREnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleLevel1Operator"


    // $ANTLR start "ruleLevel2Operator"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1827:1: ruleLevel2Operator returns [Enumerator current=null] : ( (enumLiteral_0= '-' ) | (enumLiteral_1= '+' ) ) ;
    public final Enumerator ruleLevel2Operator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1829:28: ( ( (enumLiteral_0= '-' ) | (enumLiteral_1= '+' ) ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1830:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= '+' ) )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1830:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= '+' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            else if ( (LA17_0==40) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1830:2: (enumLiteral_0= '-' )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1830:2: (enumLiteral_0= '-' )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1830:4: enumLiteral_0= '-'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleLevel2Operator4112); 

                            current = grammarAccess.getLevel2OperatorAccess().getMINUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLevel2OperatorAccess().getMINUSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1836:6: (enumLiteral_1= '+' )
                    {
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1836:6: (enumLiteral_1= '+' )
                    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1836:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleLevel2Operator4129); 

                            current = grammarAccess.getLevel2OperatorAccess().getPLUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLevel2OperatorAccess().getPLUSEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleLevel2Operator"


    // $ANTLR start "ruleLevel3Operator"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1846:1: ruleLevel3Operator returns [Enumerator current=null] : (enumLiteral_0= '<' ) ;
    public final Enumerator ruleLevel3Operator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1848:28: ( (enumLiteral_0= '<' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1849:1: (enumLiteral_0= '<' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1849:1: (enumLiteral_0= '<' )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1849:3: enumLiteral_0= '<'
            {
            enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleLevel3Operator4173); 

                    current = grammarAccess.getLevel3OperatorAccess().getSMALLERTHANEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getLevel3OperatorAccess().getSMALLERTHANEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleLevel3Operator"


    // $ANTLR start "ruleLevel4Operator"
    // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1859:1: ruleLevel4Operator returns [Enumerator current=null] : (enumLiteral_0= '==' ) ;
    public final Enumerator ruleLevel4Operator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1861:28: ( (enumLiteral_0= '==' ) )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1862:1: (enumLiteral_0= '==' )
            {
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1862:1: (enumLiteral_0= '==' )
            // ../listaConcrete/src-gen/edu/upb/lp/parser/antlr/internal/InternalLista.g:1862:3: enumLiteral_0= '=='
            {
            enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleLevel4Operator4216); 

                    current = grammarAccess.getLevel4OperatorAccess().getEQUALSEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getLevel4OperatorAccess().getEQUALSEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleLevel4Operator"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\21\uffff";
    static final String DFA7_eofS =
        "\5\uffff\1\20\13\uffff";
    static final String DFA7_minS =
        "\1\4\4\uffff\1\13\13\uffff";
    static final String DFA7_maxS =
        "\1\41\4\uffff\1\52\13\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\11\1\12\1\13\1\15\1"+
        "\16\1\17\1\14\1\5\1\6";
    static final String DFA7_specialS =
        "\21\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\5\1\4\1\3\4\uffff\1\12\5\uffff\1\10\1\11\1\6\1\7\2\2\1\1"+
            "\7\uffff\1\13\1\15\1\14",
            "",
            "",
            "",
            "",
            "\1\17\2\20\1\uffff\1\20\10\uffff\1\16\4\uffff\2\20\3\uffff"+
            "\11\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "655:1: (this_SeqExpression_0= ruleSeqExpression | this_BooleanExpression_1= ruleBooleanExpression | this_NumberExpression_2= ruleNumberExpression | this_StringExpression_3= ruleStringExpression | this_FunctionCall_4= ruleFunctionCall | this_Identifier_5= ruleIdentifier | this_IfExpression_6= ruleIfExpression | this_NotExpression_7= ruleNotExpression | this_InputExpression_8= ruleInputExpression | this_OutputExpression_9= ruleOutputExpression | (otherlv_10= '(' this_Expression_11= ruleExpression otherlv_12= ')' ) | this_MapExpression_13= ruleMapExpression | this_PutExpression_14= rulePutExpression | this_RemoveExpression_15= ruleRemoveExpression | this_GetExpression_16= ruleGetExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_ruleProgram131 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleEvaluation_in_ruleProgram153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinition199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDefinition241 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleFunctionDefinition258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleFunctionDefinition279 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionDefinition292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleFunctionDefinition313 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionDefinition327 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionDefinition339 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionDefinition360 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDefinition372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEvaluation455 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEvaluation476 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvaluation488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevel4Expression_in_ruleExpression671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevel4Expression_in_entryRuleLevel4Expression705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLevel4Expression715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevel3Expression_in_ruleLevel4Expression762 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleLevel4Operator_in_ruleLevel4Expression792 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleLevel4Expression_in_ruleLevel4Expression813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevel3Expression_in_entryRuleLevel3Expression851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLevel3Expression861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevel2Expression_in_ruleLevel3Expression908 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleLevel3Operator_in_ruleLevel3Expression938 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleLevel3Expression_in_ruleLevel3Expression959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevel2Expression_in_entryRuleLevel2Expression997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLevel2Expression1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevel1Expression_in_ruleLevel2Expression1054 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleLevel2Operator_in_ruleLevel2Expression1084 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleLevel2Expression_in_ruleLevel2Expression1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevel1Expression_in_entryRuleLevel1Expression1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLevel1Expression1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleLevel1Expression1200 = new BitSet(new long[]{0x0000007C00000002L});
    public static final BitSet FOLLOW_ruleLevel1Operator_in_ruleLevel1Expression1230 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleLevel1Expression_in_ruleLevel1Expression1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression1289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpression1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeqExpression_in_ruleSimpleExpression1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleSimpleExpression1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSimpleExpression1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleSimpleExpression1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleSimpleExpression1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleSimpleExpression1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpression_in_ruleSimpleExpression1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleSimpleExpression1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputExpression_in_ruleSimpleExpression1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputExpression_in_ruleSimpleExpression1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSimpleExpression1607 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimpleExpression1629 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSimpleExpression1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapExpression_in_ruleSimpleExpression1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePutExpression_in_ruleSimpleExpression1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRemoveExpression_in_ruleSimpleExpression1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetExpression_in_ruleSimpleExpression1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputExpression_in_entryRuleInputExpression1785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputExpression1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleInputExpression1832 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleInputExpression1844 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInputExpression1861 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInputExpression1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputExpression_in_entryRuleOutputExpression1914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputExpression1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOutputExpression1961 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleOutputExpression1973 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleOutputExpression1994 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOutputExpression2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpression_in_entryRuleIfExpression2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExpression2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleIfExpression2089 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleIfExpression2101 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfExpression2122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleIfExpression2134 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfExpression2155 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleIfExpression2167 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfExpression2188 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIfExpression2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall2236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionCall2291 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleFunctionCall2303 = new BitSet(new long[]{0x0000000380FE2870L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall2325 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionCall2338 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall2359 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionCall2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_entryRuleStringExpression2411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpression2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringExpression2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression2502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNotExpression2549 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleNotExpression2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression2606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpression2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberExpression2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression2697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBooleanExpression2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBooleanExpression2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeqExpression_in_entryRuleSeqExpression2828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSeqExpression2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSeqExpression2875 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSeqExpression2887 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSeqExpression2908 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleSeqExpression2921 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSeqExpression2942 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_ruleSeqExpression2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapExpression_in_entryRuleMapExpression2992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapExpression3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapExpression3044 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMapExpression3061 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleMapExpression3081 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_26_in_ruleMapExpression3110 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMapExpression3138 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleMapExpression3158 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26_in_ruleMapExpression3187 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMapExpression3215 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMapExpression3227 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMapExpression3239 = new BitSet(new long[]{0x00000003A0FE0870L});
    public static final BitSet FOLLOW_rulePairExpr_in_ruleMapExpression3261 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_12_in_ruleMapExpression3274 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_rulePairExpr_in_ruleMapExpression3295 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_29_in_ruleMapExpression3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePairExpr_in_entryRulePairExpr3347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePairExpr3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePairExpr3403 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePairExpr3415 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePairExpr3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePutExpression_in_entryRulePutExpression3472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePutExpression3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePutExpression3519 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePutExpression3531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePutExpression3551 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePutExpression3563 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePutExpression3584 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePutExpression3596 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePutExpression3617 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePutExpression3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetExpression_in_entryRuleGetExpression3665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetExpression3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleGetExpression3712 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleGetExpression3724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetExpression3744 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGetExpression3756 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleGetExpression3777 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGetExpression3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRemoveExpression_in_entryRuleRemoveExpression3825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRemoveExpression3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRemoveExpression3872 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleRemoveExpression3884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRemoveExpression3904 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRemoveExpression3916 = new BitSet(new long[]{0x0000000380FE0870L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRemoveExpression3937 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRemoveExpression3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleLevel1Operator3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLevel1Operator4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleLevel1Operator4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleLevel1Operator4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleLevel1Operator4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleLevel2Operator4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleLevel2Operator4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleLevel3Operator4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLevel4Operator4216 = new BitSet(new long[]{0x0000000000000002L});

}
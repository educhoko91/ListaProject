/*
* generated by Xtext
*/
package edu.upb.lp.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import edu.upb.lp.services.ListaGrammarAccess;

public class ListaParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ListaGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected edu.upb.lp.parser.antlr.internal.InternalListaParser createParser(XtextTokenStream stream) {
		return new edu.upb.lp.parser.antlr.internal.InternalListaParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}
	
	public ListaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ListaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
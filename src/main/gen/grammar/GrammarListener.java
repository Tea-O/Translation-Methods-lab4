// Generated from D:/dasha/C_MIR/MT/lab4/src/main/java/grammar/GrammarForGrammar.g4 by ANTLR 4.13.1
package grammar;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(GrammarParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(GrammarParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(GrammarParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(GrammarParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inh}.
	 * @param ctx the parse tree
	 */
	void enterInh(GrammarParser.InhContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inh}.
	 * @param ctx the parse tree
	 */
	void exitInh(GrammarParser.InhContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#syn}.
	 * @param ctx the parse tree
	 */
	void enterSyn(GrammarParser.SynContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#syn}.
	 * @param ctx the parse tree
	 */
	void exitSyn(GrammarParser.SynContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ntRule}.
	 * @param ctx the parse tree
	 */
	void enterNtRule(GrammarParser.NtRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ntRule}.
	 * @param ctx the parse tree
	 */
	void exitNtRule(GrammarParser.NtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(GrammarParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(GrammarParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#subsequence}.
	 * @param ctx the parse tree
	 */
	void enterSubsequence(GrammarParser.SubsequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#subsequence}.
	 * @param ctx the parse tree
	 */
	void exitSubsequence(GrammarParser.SubsequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#eps}.
	 * @param ctx the parse tree
	 */
	void enterEps(GrammarParser.EpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#eps}.
	 * @param ctx the parse tree
	 */
	void exitEps(GrammarParser.EpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(GrammarParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(GrammarParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tRule}.
	 * @param ctx the parse tree
	 */
	void enterTRule(GrammarParser.TRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tRule}.
	 * @param ctx the parse tree
	 */
	void exitTRule(GrammarParser.TRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grName}.
	 * @param ctx the parse tree
	 */
	void enterGrName(GrammarParser.GrNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grName}.
	 * @param ctx the parse tree
	 */
	void exitGrName(GrammarParser.GrNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#regexp}.
	 * @param ctx the parse tree
	 */
	void enterRegexp(GrammarParser.RegexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#regexp}.
	 * @param ctx the parse tree
	 */
	void exitRegexp(GrammarParser.RegexpContext ctx);
}
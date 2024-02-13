// Generated from D:/dasha/C_MIR/MT/lab4/src/main/java/grammar/GrammarForGrammar.g4 by ANTLR 4.13.1
package grammar;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(GrammarParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(GrammarParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#inh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInh(GrammarParser.InhContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#syn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyn(GrammarParser.SynContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ntRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNtRule(GrammarParser.NtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(GrammarParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#subsequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsequence(GrammarParser.SubsequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#eps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEps(GrammarParser.EpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(GrammarParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(GrammarParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#tRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTRule(GrammarParser.TRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrName(GrammarParser.GrNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#regexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexp(GrammarParser.RegexpContext ctx);
}
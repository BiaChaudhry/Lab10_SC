// Generated from Expression.g4 by ANTLR 4.4

package expresso.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#rootExpression}.
	 * @param ctx the parse tree
	 */
	void enterRootExpression(@NotNull ExpressionParser.RootExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#rootExpression}.
	 * @param ctx the parse tree
	 */
	void exitRootExpression(@NotNull ExpressionParser.RootExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ExpressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ExpressionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realMonomial}
	 * labeled alternative in {@link ExpressionParser#monomial}.
	 * @param ctx the parse tree
	 */
	void enterRealMonomial(@NotNull ExpressionParser.RealMonomialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realMonomial}
	 * labeled alternative in {@link ExpressionParser#monomial}.
	 * @param ctx the parse tree
	 */
	void exitRealMonomial(@NotNull ExpressionParser.RealMonomialContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(@NotNull ExpressionParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(@NotNull ExpressionParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const}
	 * labeled alternative in {@link ExpressionParser#monomial}.
	 * @param ctx the parse tree
	 */
	void enterConst(@NotNull ExpressionParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const}
	 * labeled alternative in {@link ExpressionParser#monomial}.
	 * @param ctx the parse tree
	 */
	void exitConst(@NotNull ExpressionParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(@NotNull ExpressionParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(@NotNull ExpressionParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(@NotNull ExpressionParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(@NotNull ExpressionParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#parenExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(@NotNull ExpressionParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#parenExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(@NotNull ExpressionParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code monomialSum}
	 * labeled alternative in {@link ExpressionParser#polynomial}.
	 * @param ctx the parse tree
	 */
	void enterMonomialSum(@NotNull ExpressionParser.MonomialSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code monomialSum}
	 * labeled alternative in {@link ExpressionParser#polynomial}.
	 * @param ctx the parse tree
	 */
	void exitMonomialSum(@NotNull ExpressionParser.MonomialSumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull ExpressionParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull ExpressionParser.LiteralContext ctx);
}
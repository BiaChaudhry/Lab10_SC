// Generated from Expression.g4 by ANTLR 4.4

package expresso.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#rootExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootExpression(@NotNull ExpressionParser.RootExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ExpressionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realMonomial}
	 * labeled alternative in {@link ExpressionParser#monomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealMonomial(@NotNull ExpressionParser.RealMonomialContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(@NotNull ExpressionParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const}
	 * labeled alternative in {@link ExpressionParser#monomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(@NotNull ExpressionParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(@NotNull ExpressionParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#multExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(@NotNull ExpressionParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#parenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(@NotNull ExpressionParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code monomialSum}
	 * labeled alternative in {@link ExpressionParser#polynomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonomialSum(@NotNull ExpressionParser.MonomialSumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull ExpressionParser.LiteralContext ctx);
}
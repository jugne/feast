// Generated from Expression.g4 by ANTLR 4.5
package feast.expressions.parser;
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
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(ExpressionParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ELSEWHERE1}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitELSEWHERE1(ExpressionParser.ELSEWHERE1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(ExpressionParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ELSEWHERE2}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitELSEWHERE2(ExpressionParser.ELSEWHERE2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link ExpressionParser#molecule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(ExpressionParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exponentiation}
	 * labeled alternative in {@link ExpressionParser#molecule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentiation(ExpressionParser.ExponentiationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ELSEWHERE3}
	 * labeled alternative in {@link ExpressionParser#molecule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitELSEWHERE3(ExpressionParser.ELSEWHERE3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Bracketed}
	 * labeled alternative in {@link ExpressionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketed(ExpressionParser.BracketedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link ExpressionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ExpressionParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryOp}
	 * labeled alternative in {@link ExpressionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(ExpressionParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ExpressionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ExpressionParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ExpressionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ExpressionParser.NumberContext ctx);
}
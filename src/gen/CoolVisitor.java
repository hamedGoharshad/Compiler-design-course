package gen;// Generated from /home/sadegh/Projects/cool-lang/res/Cool.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(CoolParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(CoolParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(CoolParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(CoolParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableAccess}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAccess(CoolParser.VariableAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(CoolParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableAssignment}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(CoolParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CoolParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CoolParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperation(CoolParser.BinaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperation(CoolParser.UnaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CoolParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instantiation}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiation(CoolParser.InstantiationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(CoolParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(CoolParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(CoolParser.Conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#while_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop_statement(CoolParser.While_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#let_in_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_in_statement(CoolParser.Let_in_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#let_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_expr(CoolParser.Let_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#case_of_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_of_statement(CoolParser.Case_of_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(CoolParser.LiteralsContext ctx);
}
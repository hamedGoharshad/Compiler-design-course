package gen;// Generated from /home/sadegh/Projects/cool-lang/res/Cool.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(CoolParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(CoolParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(CoolParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(CoolParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(CoolParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(CoolParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(CoolParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(CoolParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableAccess}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableAccess(CoolParser.VariableAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableAccess}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableAccess(CoolParser.VariableAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(CoolParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(CoolParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableAssignment}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(CoolParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableAssignment}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(CoolParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CoolParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CoolParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CoolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CoolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(CoolParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(CoolParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperation(CoolParser.UnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperation(CoolParser.UnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CoolParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CoolParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instantiation}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInstantiation(CoolParser.InstantiationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instantiation}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInstantiation(CoolParser.InstantiationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(CoolParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(CoolParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(CoolParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(CoolParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(CoolParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(CoolParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop_statement(CoolParser.While_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop_statement(CoolParser.While_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#let_in_statement}.
	 * @param ctx the parse tree
	 */
	void enterLet_in_statement(CoolParser.Let_in_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#let_in_statement}.
	 * @param ctx the parse tree
	 */
	void exitLet_in_statement(CoolParser.Let_in_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#let_expr}.
	 * @param ctx the parse tree
	 */
	void enterLet_expr(CoolParser.Let_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#let_expr}.
	 * @param ctx the parse tree
	 */
	void exitLet_expr(CoolParser.Let_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#case_of_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_of_statement(CoolParser.Case_of_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#case_of_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_of_statement(CoolParser.Case_of_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(CoolParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(CoolParser.LiteralsContext ctx);
}
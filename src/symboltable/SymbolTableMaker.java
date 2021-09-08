package symboltable;


import gen.CoolListener;
import gen.CoolParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import symboltable.items.Class;
import symboltable.items.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

public class SymbolTableMaker implements CoolListener {
    private final Scope globalScope = new Scope();
    private final List<Error> errors = new ArrayList<>();
    private Class currentClass;
    private Method currentMethod;
    private final Stack<Block> blocks = new Stack<>();

    @Override
    public void enterProgram(CoolParser.ProgramContext ctx) {

    }

    @Override
    public void exitProgram(CoolParser.ProgramContext ctx) {
        globalScope.print();
    }

    @Override
    public void enterClassDefinition(CoolParser.ClassDefinitionContext ctx) {
        currentClass = new Class(
                ctx.className.getText(),
                ctx.parentName != null ? ctx.parentName.getText() : null);
        var id = "class_" + ctx.className.getText();
        Optional<Item> lookup = globalScope.lookup(id);
        if (lookup.isPresent()) {
            var e = new Error(
                    Error.Type.CLASS_ALREADY_DEFINED,
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine(),
                    List.of(ctx.className.getText()));
            errors.add(e);
        }

        id += "_" + ctx.start.getLine() + "_" + ctx.start.getCharPositionInLine();
        globalScope.insert(id, currentClass);

    }

    @Override
    public void exitClassDefinition(CoolParser.ClassDefinitionContext ctx) {
        currentClass = null;
    }

    @Override
    public void enterMethodDefinition(CoolParser.MethodDefinitionContext ctx) {
        currentMethod = new Method(
                ctx.methodName.getText(),
                ctx.returnType.getText());
        var id = "method_" + ctx.methodName.getText();
        Optional<Item> lookup = currentClass.lookup(id);
        if (lookup.isPresent()) {
            var e = new Error(
                    Error.Type.METHOD_ALREADY_DEFINED,
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine(),
                    List.of(ctx.methodName.getText()));
            errors.add(e);
        }
        currentClass.addMethod(currentMethod);
        id += "_" + ctx.start.getLine() + "_" + ctx.start.getCharPositionInLine();
        currentClass.insert(id + ctx.start.getLine() + ctx.start.getCharPositionInLine(), currentMethod);

    }

    @Override
    public void exitMethodDefinition(CoolParser.MethodDefinitionContext ctx) {
        currentMethod = null;
    }

    @Override
    public void enterFieldDeclaration(CoolParser.FieldDeclarationContext ctx) {
        var field = new Field(
                ctx.fieldName.getText(),
                ctx.fieldType.getText());
        currentClass.addField(field);
        var id = "field_" + ctx.fieldName.getText();
        Optional<Item> lookup = currentClass.lookup(id);
        if (lookup.isPresent()) {
            var e = new Error(
                    Error.Type.FIELD_ALREADY_DEFINED,
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine(),
                    List.of(ctx.fieldName.getText()));
            errors.add(e);
        }
        id += "_" + ctx.start.getLine() + "_" + ctx.start.getCharPositionInLine();
        currentClass.insert(id, field);
    }

    @Override
    public void exitFieldDeclaration(CoolParser.FieldDeclarationContext ctx) {

    }

    @Override
    public void enterParameterDeclaration(CoolParser.ParameterDeclarationContext ctx) {
        var parameter = new Parameter(ctx.parameterName.getText(), ctx.parameterType.getText());
        currentMethod.addParameter(parameter);
        currentMethod.insert("param_" + ctx.parameterName.getText(), parameter);
    }

    @Override
    public void exitParameterDeclaration(CoolParser.ParameterDeclarationContext ctx) {

    }

    @Override
    public void enterVariableAccess(CoolParser.VariableAccessContext ctx) {

    }

    @Override
    public void exitVariableAccess(CoolParser.VariableAccessContext ctx) {

    }

    @Override
    public void enterParentheses(CoolParser.ParenthesesContext ctx) {

    }

    @Override
    public void exitParentheses(CoolParser.ParenthesesContext ctx) {

    }

    @Override
    public void enterVariableAssignment(CoolParser.VariableAssignmentContext ctx) {

    }

    @Override
    public void exitVariableAssignment(CoolParser.VariableAssignmentContext ctx) {

    }

    @Override
    public void enterStatement(CoolParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(CoolParser.StatementContext ctx) {

    }

    @Override
    public void enterBlock(CoolParser.BlockContext ctx) {
        var block = new Block();
        Scope prevScope = blocks.empty() ? currentMethod : blocks.peek();
        prevScope.insert(String.valueOf(prevScope.getSize()), block);
        blocks.push(block);
    }

    @Override
    public void exitBlock(CoolParser.BlockContext ctx) {
        blocks.pop();
    }

    @Override
    public void enterBinaryOperation(CoolParser.BinaryOperationContext ctx) {

    }

    @Override
    public void exitBinaryOperation(CoolParser.BinaryOperationContext ctx) {

    }

    @Override
    public void enterUnaryOperation(CoolParser.UnaryOperationContext ctx) {

    }

    @Override
    public void exitUnaryOperation(CoolParser.UnaryOperationContext ctx) {

    }

    @Override
    public void enterLiteral(CoolParser.LiteralContext ctx) {

    }

    @Override
    public void exitLiteral(CoolParser.LiteralContext ctx) {

    }

    @Override
    public void enterInstantiation(CoolParser.InstantiationContext ctx) {
        if (ctx.TypeIdentifier() != null) {
            Optional<Item> lookup = globalScope.lookup("class_" + ctx.TypeIdentifier().getText());
            if (lookup.isEmpty()) {
                var e = new Error(
                        Error.Type.CLASS_NOT_FOUND,
                        ctx.start.getLine(),
                        ctx.start.getCharPositionInLine(),
                        List.of(ctx.TypeIdentifier().getText())
                );
                errors.add(e);
            }
        }
    }

    @Override
    public void exitInstantiation(CoolParser.InstantiationContext ctx) {

    }

    @Override
    public void enterMethodCall(CoolParser.MethodCallContext ctx) {

    }

    @Override
    public void exitMethodCall(CoolParser.MethodCallContext ctx) {

    }

    @Override
    public void enterStatements(CoolParser.StatementsContext ctx) {

    }

    @Override
    public void exitStatements(CoolParser.StatementsContext ctx) {

    }

    @Override
    public void enterConditional_statement(CoolParser.Conditional_statementContext ctx) {

    }

    @Override
    public void exitConditional_statement(CoolParser.Conditional_statementContext ctx) {

    }

    @Override
    public void enterWhile_loop_statement(CoolParser.While_loop_statementContext ctx) {

    }

    @Override
    public void exitWhile_loop_statement(CoolParser.While_loop_statementContext ctx) {

    }

    @Override
    public void enterLet_in_statement(CoolParser.Let_in_statementContext ctx) {

    }

    @Override
    public void exitLet_in_statement(CoolParser.Let_in_statementContext ctx) {

    }

    @Override
    public void enterLet_expr(CoolParser.Let_exprContext ctx) {
        var variable = new LocalVariable(ctx.Identifier().getText(), ctx.expr().getText());
        var id = "var_" + ctx.Identifier().getText();
        Scope currentScope = blocks.empty() ? currentMethod : blocks.peek();
        id += "_" + ctx.start.getLine() + "_" + ctx.start.getCharPositionInLine();
        currentScope.insert(id, variable);

    }

    @Override
    public void exitLet_expr(CoolParser.Let_exprContext ctx) {

    }

    @Override
    public void enterCase_of_statement(CoolParser.Case_of_statementContext ctx) {

    }

    @Override
    public void exitCase_of_statement(CoolParser.Case_of_statementContext ctx) {

    }

    @Override
    public void enterLiterals(CoolParser.LiteralsContext ctx) {

    }

    @Override
    public void exitLiterals(CoolParser.LiteralsContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
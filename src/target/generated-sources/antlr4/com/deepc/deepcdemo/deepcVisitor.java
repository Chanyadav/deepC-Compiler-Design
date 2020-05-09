// Generated from com\deepc\deepcdemo\deepc.g4 by ANTLR 4.5.1
package com.deepc.deepcdemo;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link deepcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface deepcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link deepcParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(deepcParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#lowerCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowerCharacter(deepcParser.LowerCharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#upperCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpperCharacter(deepcParser.UpperCharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(deepcParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(deepcParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(deepcParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(deepcParser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intDeclaration}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDeclaration(deepcParser.IntDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanDeclaration}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDeclaration(deepcParser.BooleanDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringDeclaration}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDeclaration(deepcParser.StringDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAssignment}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAssignment(deepcParser.IntAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAssignment}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAssignment(deepcParser.BooleanAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAssignment(deepcParser.StringAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nodec}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodec(deepcParser.NodecContext ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#commandList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandList(deepcParser.CommandListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(deepcParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolTernary}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTernary(deepcParser.BoolTernaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(deepcParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forLoopStatement}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopStatement(deepcParser.ForLoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forLoopPython}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopPython(deepcParser.ForLoopPythonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initializeDummy1}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeDummy1(deepcParser.InitializeDummy1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code printdummy}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintdummy(deepcParser.PrintdummyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dummyEnd}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDummyEnd(deepcParser.DummyEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#ternarycondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernarycondition(deepcParser.TernaryconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#for_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range(deepcParser.For_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#elsepart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsepart(deepcParser.ElsepartContext ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(deepcParser.If_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#while_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_condition(deepcParser.While_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#for_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_condition(deepcParser.For_conditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpressionAssignment}
	 * labeled alternative in {@link deepcParser#initialize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpressionAssignment(deepcParser.VariableExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableBooleanAssignment}
	 * labeled alternative in {@link deepcParser#initialize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableBooleanAssignment(deepcParser.VariableBooleanAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableStringAssignment}
	 * labeled alternative in {@link deepcParser#initialize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStringAssignment(deepcParser.VariableStringAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryInitialize}
	 * labeled alternative in {@link deepcParser#ternary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryInitialize(deepcParser.TernaryInitializeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternarbooleanValue}
	 * labeled alternative in {@link deepcParser#ternary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernarbooleanValue(deepcParser.TernarbooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#cond1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond1(deepcParser.Cond1Context ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#cond2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond2(deepcParser.Cond2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code initializeDummy2}
	 * labeled alternative in {@link deepcParser#endCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeDummy2(deepcParser.InitializeDummy2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code incremental}
	 * labeled alternative in {@link deepcParser#endCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremental(deepcParser.IncrementalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decremental}
	 * labeled alternative in {@link deepcParser#endCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecremental(deepcParser.DecrementalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueStatement}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueStatement(deepcParser.TrueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseStatement}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseStatement(deepcParser.FalseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalExpression}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(deepcParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notequalExpression}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotequalExpression(deepcParser.NotequalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negation}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(deepcParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(deepcParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(deepcParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanOrEqual}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqual(deepcParser.GreaterThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lesserThanOrEqual}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesserThanOrEqual(deepcParser.LesserThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanDummy}
	 * labeled alternative in {@link deepcParser#booleanValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDummy(deepcParser.BooleanDummyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAndRelation}
	 * labeled alternative in {@link deepcParser#booleanValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndRelation(deepcParser.LogicalAndRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOrRelation}
	 * labeled alternative in {@link deepcParser#booleanValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrRelation(deepcParser.LogicalOrRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link deepcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(deepcParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term1dummy}
	 * labeled alternative in {@link deepcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm1dummy(deepcParser.Term1dummyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link deepcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(deepcParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link deepcParser#term1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(deepcParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dummyterm2}
	 * labeled alternative in {@link deepcParser#term1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDummyterm2(deepcParser.Dummyterm2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link deepcParser#term1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(deepcParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketExpression}
	 * labeled alternative in {@link deepcParser#term2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(deepcParser.BracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierVariable}
	 * labeled alternative in {@link deepcParser#term2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierVariable(deepcParser.IdentifierVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link deepcParser#term2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(deepcParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printidentifier}
	 * labeled alternative in {@link deepcParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintidentifier(deepcParser.PrintidentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printstring}
	 * labeled alternative in {@link deepcParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstring(deepcParser.PrintstringContext ctx);
	/**
	 * Visit a parse tree produced by {@link deepcParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(deepcParser.PrimaryContext ctx);
}
// Generated from com\deepc\deepcdemo\deepc.g4 by ANTLR 4.5.1
package com.deepc.deepcdemo;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link deepcParser}.
 */
public interface deepcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link deepcParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(deepcParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(deepcParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#lowerCharacter}.
	 * @param ctx the parse tree
	 */
	void enterLowerCharacter(deepcParser.LowerCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#lowerCharacter}.
	 * @param ctx the parse tree
	 */
	void exitLowerCharacter(deepcParser.LowerCharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#upperCharacter}.
	 * @param ctx the parse tree
	 */
	void enterUpperCharacter(deepcParser.UpperCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#upperCharacter}.
	 * @param ctx the parse tree
	 */
	void exitUpperCharacter(deepcParser.UpperCharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(deepcParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(deepcParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(deepcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(deepcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(deepcParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(deepcParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(deepcParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(deepcParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intDeclaration}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterIntDeclaration(deepcParser.IntDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intDeclaration}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitIntDeclaration(deepcParser.IntDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanDeclaration}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDeclaration(deepcParser.BooleanDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanDeclaration}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDeclaration(deepcParser.BooleanDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringDeclaration}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterStringDeclaration(deepcParser.StringDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringDeclaration}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitStringDeclaration(deepcParser.StringDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intAssignment}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterIntAssignment(deepcParser.IntAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intAssignment}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitIntAssignment(deepcParser.IntAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAssignment}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAssignment(deepcParser.BooleanAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAssignment}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAssignment(deepcParser.BooleanAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterStringAssignment(deepcParser.StringAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitStringAssignment(deepcParser.StringAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nodec}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterNodec(deepcParser.NodecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nodec}
	 * labeled alternative in {@link deepcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitNodec(deepcParser.NodecContext ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#commandList}.
	 * @param ctx the parse tree
	 */
	void enterCommandList(deepcParser.CommandListContext ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#commandList}.
	 * @param ctx the parse tree
	 */
	void exitCommandList(deepcParser.CommandListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(deepcParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(deepcParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolTernary}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void enterBoolTernary(deepcParser.BoolTernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolTernary}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void exitBoolTernary(deepcParser.BoolTernaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(deepcParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(deepcParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forLoopStatement}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void enterForLoopStatement(deepcParser.ForLoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forLoopStatement}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void exitForLoopStatement(deepcParser.ForLoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forLoopPython}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void enterForLoopPython(deepcParser.ForLoopPythonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forLoopPython}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void exitForLoopPython(deepcParser.ForLoopPythonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializeDummy1}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void enterInitializeDummy1(deepcParser.InitializeDummy1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code initializeDummy1}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void exitInitializeDummy1(deepcParser.InitializeDummy1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code printdummy}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void enterPrintdummy(deepcParser.PrintdummyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printdummy}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void exitPrintdummy(deepcParser.PrintdummyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dummyEnd}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void enterDummyEnd(deepcParser.DummyEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dummyEnd}
	 * labeled alternative in {@link deepcParser#command}.
	 * @param ctx the parse tree
	 */
	void exitDummyEnd(deepcParser.DummyEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#ternarycondition}.
	 * @param ctx the parse tree
	 */
	void enterTernarycondition(deepcParser.TernaryconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#ternarycondition}.
	 * @param ctx the parse tree
	 */
	void exitTernarycondition(deepcParser.TernaryconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#for_range}.
	 * @param ctx the parse tree
	 */
	void enterFor_range(deepcParser.For_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#for_range}.
	 * @param ctx the parse tree
	 */
	void exitFor_range(deepcParser.For_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#elsepart}.
	 * @param ctx the parse tree
	 */
	void enterElsepart(deepcParser.ElsepartContext ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#elsepart}.
	 * @param ctx the parse tree
	 */
	void exitElsepart(deepcParser.ElsepartContext ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(deepcParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(deepcParser.If_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#while_condition}.
	 * @param ctx the parse tree
	 */
	void enterWhile_condition(deepcParser.While_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#while_condition}.
	 * @param ctx the parse tree
	 */
	void exitWhile_condition(deepcParser.While_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void enterFor_condition(deepcParser.For_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void exitFor_condition(deepcParser.For_conditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpressionAssignment}
	 * labeled alternative in {@link deepcParser#initialize}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpressionAssignment(deepcParser.VariableExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpressionAssignment}
	 * labeled alternative in {@link deepcParser#initialize}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpressionAssignment(deepcParser.VariableExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableBooleanAssignment}
	 * labeled alternative in {@link deepcParser#initialize}.
	 * @param ctx the parse tree
	 */
	void enterVariableBooleanAssignment(deepcParser.VariableBooleanAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableBooleanAssignment}
	 * labeled alternative in {@link deepcParser#initialize}.
	 * @param ctx the parse tree
	 */
	void exitVariableBooleanAssignment(deepcParser.VariableBooleanAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableStringAssignment}
	 * labeled alternative in {@link deepcParser#initialize}.
	 * @param ctx the parse tree
	 */
	void enterVariableStringAssignment(deepcParser.VariableStringAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableStringAssignment}
	 * labeled alternative in {@link deepcParser#initialize}.
	 * @param ctx the parse tree
	 */
	void exitVariableStringAssignment(deepcParser.VariableStringAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryInitialize}
	 * labeled alternative in {@link deepcParser#ternary}.
	 * @param ctx the parse tree
	 */
	void enterTernaryInitialize(deepcParser.TernaryInitializeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryInitialize}
	 * labeled alternative in {@link deepcParser#ternary}.
	 * @param ctx the parse tree
	 */
	void exitTernaryInitialize(deepcParser.TernaryInitializeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternarbooleanValue}
	 * labeled alternative in {@link deepcParser#ternary}.
	 * @param ctx the parse tree
	 */
	void enterTernarbooleanValue(deepcParser.TernarbooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternarbooleanValue}
	 * labeled alternative in {@link deepcParser#ternary}.
	 * @param ctx the parse tree
	 */
	void exitTernarbooleanValue(deepcParser.TernarbooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#cond1}.
	 * @param ctx the parse tree
	 */
	void enterCond1(deepcParser.Cond1Context ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#cond1}.
	 * @param ctx the parse tree
	 */
	void exitCond1(deepcParser.Cond1Context ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#cond2}.
	 * @param ctx the parse tree
	 */
	void enterCond2(deepcParser.Cond2Context ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#cond2}.
	 * @param ctx the parse tree
	 */
	void exitCond2(deepcParser.Cond2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code initializeDummy2}
	 * labeled alternative in {@link deepcParser#endCondition}.
	 * @param ctx the parse tree
	 */
	void enterInitializeDummy2(deepcParser.InitializeDummy2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code initializeDummy2}
	 * labeled alternative in {@link deepcParser#endCondition}.
	 * @param ctx the parse tree
	 */
	void exitInitializeDummy2(deepcParser.InitializeDummy2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code incremental}
	 * labeled alternative in {@link deepcParser#endCondition}.
	 * @param ctx the parse tree
	 */
	void enterIncremental(deepcParser.IncrementalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incremental}
	 * labeled alternative in {@link deepcParser#endCondition}.
	 * @param ctx the parse tree
	 */
	void exitIncremental(deepcParser.IncrementalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decremental}
	 * labeled alternative in {@link deepcParser#endCondition}.
	 * @param ctx the parse tree
	 */
	void enterDecremental(deepcParser.DecrementalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decremental}
	 * labeled alternative in {@link deepcParser#endCondition}.
	 * @param ctx the parse tree
	 */
	void exitDecremental(deepcParser.DecrementalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueStatement}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterTrueStatement(deepcParser.TrueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueStatement}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitTrueStatement(deepcParser.TrueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseStatement}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterFalseStatement(deepcParser.FalseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseStatement}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitFalseStatement(deepcParser.FalseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalExpression}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression(deepcParser.EqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalExpression}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression(deepcParser.EqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notequalExpression}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterNotequalExpression(deepcParser.NotequalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notequalExpression}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitNotequalExpression(deepcParser.NotequalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negation}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterNegation(deepcParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negation}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitNegation(deepcParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(deepcParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(deepcParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(deepcParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(deepcParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanOrEqual}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqual(deepcParser.GreaterThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanOrEqual}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqual(deepcParser.GreaterThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lesserThanOrEqual}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterLesserThanOrEqual(deepcParser.LesserThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lesserThanOrEqual}
	 * labeled alternative in {@link deepcParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitLesserThanOrEqual(deepcParser.LesserThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanDummy}
	 * labeled alternative in {@link deepcParser#booleanValueList}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDummy(deepcParser.BooleanDummyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanDummy}
	 * labeled alternative in {@link deepcParser#booleanValueList}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDummy(deepcParser.BooleanDummyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndRelation}
	 * labeled alternative in {@link deepcParser#booleanValueList}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndRelation(deepcParser.LogicalAndRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndRelation}
	 * labeled alternative in {@link deepcParser#booleanValueList}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndRelation(deepcParser.LogicalAndRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrRelation}
	 * labeled alternative in {@link deepcParser#booleanValueList}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrRelation(deepcParser.LogicalOrRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrRelation}
	 * labeled alternative in {@link deepcParser#booleanValueList}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrRelation(deepcParser.LogicalOrRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link deepcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(deepcParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link deepcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(deepcParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term1dummy}
	 * labeled alternative in {@link deepcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTerm1dummy(deepcParser.Term1dummyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term1dummy}
	 * labeled alternative in {@link deepcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTerm1dummy(deepcParser.Term1dummyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addition}
	 * labeled alternative in {@link deepcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddition(deepcParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link deepcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddition(deepcParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code division}
	 * labeled alternative in {@link deepcParser#term1}.
	 * @param ctx the parse tree
	 */
	void enterDivision(deepcParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code division}
	 * labeled alternative in {@link deepcParser#term1}.
	 * @param ctx the parse tree
	 */
	void exitDivision(deepcParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dummyterm2}
	 * labeled alternative in {@link deepcParser#term1}.
	 * @param ctx the parse tree
	 */
	void enterDummyterm2(deepcParser.Dummyterm2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code dummyterm2}
	 * labeled alternative in {@link deepcParser#term1}.
	 * @param ctx the parse tree
	 */
	void exitDummyterm2(deepcParser.Dummyterm2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link deepcParser#term1}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(deepcParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link deepcParser#term1}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(deepcParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketExpression}
	 * labeled alternative in {@link deepcParser#term2}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(deepcParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketExpression}
	 * labeled alternative in {@link deepcParser#term2}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(deepcParser.BracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierVariable}
	 * labeled alternative in {@link deepcParser#term2}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierVariable(deepcParser.IdentifierVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierVariable}
	 * labeled alternative in {@link deepcParser#term2}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierVariable(deepcParser.IdentifierVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link deepcParser#term2}.
	 * @param ctx the parse tree
	 */
	void enterNumber(deepcParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link deepcParser#term2}.
	 * @param ctx the parse tree
	 */
	void exitNumber(deepcParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printidentifier}
	 * labeled alternative in {@link deepcParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintidentifier(deepcParser.PrintidentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printidentifier}
	 * labeled alternative in {@link deepcParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintidentifier(deepcParser.PrintidentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printstring}
	 * labeled alternative in {@link deepcParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintstring(deepcParser.PrintstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printstring}
	 * labeled alternative in {@link deepcParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintstring(deepcParser.PrintstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link deepcParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(deepcParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link deepcParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(deepcParser.PrimaryContext ctx);
}
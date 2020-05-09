/**
 * Title:        DeepC_Compiler
 * Description:  CSE502 Project
 * Company:      CIDSE, Arizona State University
 * @author Chandan Yadav, Nachiappan Lakshmanan
 * @version 1.0
 */
package com.deepc.deepcdemo;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;



public class Compiler extends deepcBaseListener{
	
	private PrintWriter print_wrt;
	private StringBuilder builder = new StringBuilder();
	private ArrayList<String> integerList = new ArrayList<>();
	private ArrayList<String> booleanList = new ArrayList<>();
	private ArrayList<String> stringList = new ArrayList<>();

	static int whileCount=0;
	static int forCount =0;
	static int forpython=0;
	
	public Compiler(File file)	
	{
		try
		{
		print_wrt = new PrintWriter(file);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}
	
	@Override public void enterProgram(deepcParser.ProgramContext ctx) 
	{ 
		builder.append("BEGIN "+"\n");
	}
	
	
	@Override
	public void enterIntDeclaration(deepcParser.IntDeclarationContext ctx) {
		
		String varName = ctx.name.getText();	
		builder.append("INTEGER "+varName+"\n");
		//System.out.println("This is the variable name"+" "+varName);
		if(!integerList.contains(varName))
		{
		integerList.add(varName);
		//System.out.println("Added "+varName);
		}
		else
		{
			System.out.println("Variable "+varName+" already defined");
		}
	
	}
	
	@Override public void enterBooleanDeclaration(deepcParser.BooleanDeclarationContext ctx) { 
		String varName = ctx.name.getText();	
		builder.append("BOOLEAN "+varName+"\n");
		//System.out.println("This is the variable name"+" "+varName);
		if(!booleanList.contains(varName))
		{
		booleanList.add(varName);
		}
		else
		{
			System.out.println("boolean "+varName+" already defined");
		}
	
	}
	
	@Override public void enterStringDeclaration(deepcParser.StringDeclarationContext ctx) {
		String varName = ctx.name.getText();	
		builder.append("STRING "+varName+"\n");
		//System.out.println("This is the variable name"+" "+varName);
		if(!stringList.contains(varName))
		{
			stringList.add(varName);
		}
		else
		{
			System.out.println("String "+varName+" already defined");
		}
	
	}
	
	
	@Override public void enterNumber(deepcParser.NumberContext ctx) 
	{ 	
		builder.append("PUSH "+ctx.getText()+"\n");
		//System.out.println("PUSHED "+ctx.getText());
	}
	
	@Override public void exitSubtraction(deepcParser.SubtractionContext ctx) 
	{ 
		builder.append("SUBTRACT\n");
		
	}
	
	@Override public void exitAddition(deepcParser.AdditionContext ctx) {
		
		builder.append("ADD\n");
	}

	
	@Override public void exitMultiplication(deepcParser.MultiplicationContext ctx) 
	{
		builder.append("MULTIPLY\n");
		
		
		//System.out.println("Multiply is called");
	}
	
	@Override public void exitDivision(deepcParser.DivisionContext ctx) { 
		
		builder.append("DIVIDE\n");
	}
	
	
	@Override public void exitIntAssignment(deepcParser.IntAssignmentContext ctx) 
	{ 
		builder.append("ASSIGNINT "+ctx.name.getText()+" "+ctx.val.getText()+ "\n");
		builder.append("STORE "+ctx.name.getText()+"\n");
		integerList.add(ctx.name.getText());
		//System.out.println("DOUBLE "+ ctx.name.getText()+" "+ctx.val.getText());
		
	}
	


	@Override public void exitBooleanAssignment(deepcParser.BooleanAssignmentContext ctx) 
	{ 
		builder.append("ASSIGNBOOLEAN "+ctx.name.getText()+" "+ctx.val.getText()+ "\n");
		builder.append("STORE "+ctx.name.getText()+"\n");
		booleanList.add(ctx.name.getText());
		//System.out.println("BOOLEAN "+ ctx.name.getText()+" "+ctx.val.getText());
		
	}
	
	@Override public void exitStringAssignment(deepcParser.StringAssignmentContext ctx) 
	{
		builder.append("ASSIGNSTRING "+ctx.name.getText()+" "+ ctx.val.getText()+ "\n");
		builder.append("STORE "+ctx.name.getText()+"\n");
		stringList.add(ctx.name.getText());
		//System.out.println("STRING "+ ctx.name.getText()+" "+ctx.val.getText());
		
	}
	
	@Override public void exitEqualExpression(deepcParser.EqualExpressionContext ctx) 
	{ 
		
		builder.append("EQUAL "+"\n");
	}
	
	@Override public void exitNotequalExpression(deepcParser.NotequalExpressionContext ctx) 
	{
		builder.append("NOTEQUAL "+"\n");
	}
	

	

	@Override public void exitNegation(deepcParser.NegationContext ctx) 
	{ 
		builder.append("NEGATE"+"\n");
	}

	@Override public void exitLessThan(deepcParser.LessThanContext ctx) 
	{ 
		builder.append("LESSTHAN"+"\n");
	}

	@Override public void exitGreaterThan(deepcParser.GreaterThanContext ctx) 
	{ 
		builder.append("GREATERTHAN"+"\n");
	}

	@Override public void exitGreaterThanOrEqual(deepcParser.GreaterThanOrEqualContext ctx) 
	{ 
		builder.append("GREATERorEQUAL"+"\n");
	}


	@Override public void exitLesserThanOrEqual(deepcParser.LesserThanOrEqualContext ctx) 
	{ 
		builder.append("LESSorEQUAL"+"\n");
	}


	@Override public void exitLogicalAndRelation(deepcParser.LogicalAndRelationContext ctx) 
	{ 
		builder.append("AND"+"\n");
	}

	@Override public void exitLogicalOrRelation(deepcParser.LogicalOrRelationContext ctx) 
	{ 
		builder.append("OR"+"\n");
	}


	@Override public void exitVariableExpressionAssignment(deepcParser.VariableExpressionAssignmentContext ctx) 
	{ 
		if(integerList.contains(ctx.name.getText()))
		{
			//builder.append("ASSIGN "+ctx.name.getText()+" "+ctx.val.getText()+"\n");
			builder.append("STORE "+ctx.name.getText()+"\n");
		}
	}
	
	

	
	
	@Override public void exitVariableStringAssignment(deepcParser.VariableStringAssignmentContext ctx) 
	{ 
		
		if(stringList.contains(ctx.name.getText()))
		{
			builder.append("ASSIGNSTRING "+ctx.name.getText()+" "+ctx.val.getText()+"\n");
			builder.append("STORE "+ctx.val.getText()+"\n");
		}
	}


	@Override public void exitVariableBooleanAssignment(deepcParser.VariableBooleanAssignmentContext ctx) 
	{ 
		if(booleanList.contains(ctx.name.getText()))
		{
			builder.append("ASSIGNBOOLEAN "+ctx.name.getText()+" "+ctx.val.getText()+"\n");
			builder.append("STORE "+ctx.val.getText()+"\n");
		}
	}

	@Override public void exitIncremental(deepcParser.IncrementalContext ctx) 
	{ 
		if(integerList.contains(ctx.name.getText()))
		{
		builder.append("INCREMENT "+ctx.name.getText()+"\n");
		}
		
	}
	
	
	@Override public void exitDecremental(deepcParser.DecrementalContext ctx) 
	{ 
		if(integerList.contains(ctx.name.getText()))
		{
		builder.append("DECREMENT "+ctx.name.getText()+"\n");
		}
	}
	
	
	@Override public void enterWhileStatement(deepcParser.WhileStatementContext ctx) 
	{ 
		whileCount++;
		builder.append("WHILE_BEGIN "+whileCount+"\n");
	}
	
	@Override public void exitWhile_condition(deepcParser.While_conditionContext ctx) 
	{ 
		builder.append("JUMP WHILE_END "+ whileCount+"\n");
		
	}
	
	
	@Override public void exitWhileStatement(deepcParser.WhileStatementContext ctx) 
	{ 
		builder.append("LOOP WHILE_BEGIN "+whileCount+"\n");
		builder.append("WHILE_END "+whileCount+"\n");
		whileCount--;
	}
	
	@Override public void enterForLoopStatement(deepcParser.ForLoopStatementContext ctx)
	{ 
		forCount++;
		builder.append("FORBEGIN "+forCount+"\n");
		
	}
	
	
	@Override public void exitFor_condition(deepcParser.For_conditionContext ctx) 
	{ 
		builder.append("JUMP FOREND "+forCount+"\n");
		//builder.append("INCREASE "+forCount+"\n");
	}
	
	@Override public void enterFor_condition(deepcParser.For_conditionContext ctx) 
	{ 
		builder.append("FOR_EVALUATE "+forCount+"\n");
	}

	
	@Override public void exitForLoopStatement(deepcParser.ForLoopStatementContext ctx) 
	{
		builder.append("LOOP FOR_EVALUATE "+forCount+"\n");
		builder.append("FOREND "+forCount+"\n");
		forCount--;
	}
	
	@Override public void enterForLoopPython(deepcParser.ForLoopPythonContext ctx) 
	{ 
		forpython++;
		builder.append("FOR_PYTHON_BEGIN "+forpython+"\n");
	}
	@Override public void enterFor_range(deepcParser.For_rangeContext ctx) 
	{	
		builder.append("ASSIGNINT "+ctx.name.getText()+" "+ctx.begin.getText()+"\n");
		builder.append("PYTHON_EVALUATE "+forpython+"\n");
		builder.append("COMPARE "+ctx.name.getText()+" "+ctx.end.getText()+"\n");
	}
	
	@Override public void exitFor_range(deepcParser.For_rangeContext ctx) 
	{ 
	builder.append("JUMP FOR_PYTHON_END "+forpython+"\n");
	builder.append("INCREMENT "+ ctx.name.getText()+"\n");
		
	}
	
	
	@Override public void exitForLoopPython(deepcParser.ForLoopPythonContext ctx) 
	{
		
		builder.append("LOOP PYTHON_EVALUATE "+forpython+"\n");
		builder.append("FOR_PYTHON_END "+forpython+"\n");
		forpython--;
	}
	
	@Override public void exitTrueStatement(deepcParser.TrueStatementContext ctx) 
	{
		//builder.append("TRUE "+ctx.getText()+"\n");
		
	}
	
	
	@Override public void exitFalseStatement(deepcParser.FalseStatementContext ctx) 
	{ 
		//builder.append("FALSE "+ctx.getText()+"\n");
	}
	
	@Override public void enterIfElseStatement(deepcParser.IfElseStatementContext ctx) 
	{ 
		builder.append("IFBEGIN "+"\n");
	}
	
	@Override public void exitIfElseStatement(deepcParser.IfElseStatementContext ctx) 
	{
		builder.append("IFEND "+"\n");
	}

	

	@Override public void exitIdentifierVariable(deepcParser.IdentifierVariableContext ctx) 
	{
		String name = ctx.name.getText();
		//System.out.println("Identifier encountered");
		
		if(integerList.contains(name) || booleanList.contains(name)|| stringList.contains(name))
		{
			builder.append("LOAD "+name+"\n");
		}
		else
		{
			System.out.println("Variable is missing");
		}
		

	}
	
	@Override public void exitPrintidentifier(deepcParser.PrintidentifierContext ctx) 
	{ 
		String name = ctx.name.getText();
		if(integerList.contains(name) || booleanList.contains(name)|| stringList.contains(name))
		{
			builder.append("PRINT "+name+"\n");
		}
		else
		{
			System.out.println("Variable not declared");
		}
	}
	
	@Override public void exitPrintstring(deepcParser.PrintstringContext ctx) 
	{ 
		String name = ctx.name.getText();
		
			builder.append("PRINT_STRING "+name+"\n");
	}
	
	
	
	@Override public void exitProgram(deepcParser.ProgramContext ctx) { 
		// TODO Auto-generated method stub
		//System.out.printf(builder.toString());
		builder.append("END "+"\n");
		print_wrt.write(builder.toString());
		print_wrt.close();
	}
	
	@Override public void exitIf_condition(deepcParser.If_conditionContext ctx) 
	{ 
		String ifElse = ctx.getParent().getText();
		if(ifElse.contains("else"))
		{
			builder.append("JUMP ELSE_BEGIN "+"\n");
		}
		else
		{
			builder.append("JUMP IFEND "+"\n");
		}
		
	}
	
	@Override public void enterElsepart(deepcParser.ElsepartContext ctx) 
	{ 
		builder.append("EXIT_IF "+"\n");
		builder.append("ELSE_BEGIN "+"\n");
	}
	
	
	@Override public void exitElsepart(deepcParser.ElsepartContext ctx) 
	{ 
		builder.append("ELSE_END "+"\n");
	
	}
	
	@Override public void enterBoolTernary(deepcParser.BoolTernaryContext ctx) 
	{ 
		builder.append("TERNARY_ENTER "+"\n");
	}
	
	
	@Override public void exitBoolTernary(deepcParser.BoolTernaryContext ctx) 
	{ 
	
		builder.append("TERNARY_EXIT "+"\n");
	}
	
	@Override public void exitTernarycondition(deepcParser.TernaryconditionContext ctx) 
	{ 
		builder.append("TERNARY_COND "+"\n");
//		builder.append("GO COND1 "+"\n");
//		builder.append("GO COND2 "+"\n");
	}
	
	@Override public void enterCond1(deepcParser.Cond1Context ctx) 
	{
		builder.append("COND1 "+"\n");
	}
	
	@Override public void exitCond1(deepcParser.Cond1Context ctx) 
	{
		builder.append("JUMP TERNARY_EXIT "+"\n");
	}
	
	@Override public void enterCond2(deepcParser.Cond2Context ctx) 
	{
		builder.append("COND2 "+"\n");
	}
	
	@Override public void exitCond2(deepcParser.Cond2Context ctx) 
	{
		builder.append("JUMP TERNARY_EXIT "+"\n");
	}
	
	
	
}


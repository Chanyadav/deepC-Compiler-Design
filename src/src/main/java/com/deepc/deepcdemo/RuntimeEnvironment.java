/**
 * Title:        DeepC_RuntimeEnv
 * Description:  CSE502 Project
 * Company:      CIDSE, Arizona State University
 * @author Jain Nayan, GuruPreetam 
 * @version 1.0
 */
package com.deepc.deepcdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;


public class RuntimeEnvironment {
	String intermediateFilePath;
	BufferedReader bufferReader = null;
	FileReader reader = null;
	String line = null;
	static RuntimeEnvironment runtime;
	
	
	Stack<Integer> intStack = new Stack<>();
	Stack<Boolean> booleanStack = new Stack<>();
	Stack<String> stringStack = new Stack<>();
	HashMap<String,Integer> intMap = new HashMap<>();
	HashMap<String,Boolean> booleanMap = new HashMap<>();
	HashMap<String,String> stringMap = new HashMap<>();
	int a=0;
	int b=0;
	
	public RuntimeEnvironment(String path) {
		intermediateFilePath = path;
	}
	
//	public static void main(String args[]) {
//		RuntimeEnvironment.getInstance("output.intermediate").executeProgram();
//	}
//	public static RuntimeEnvironment getInstance(String src) {
//		if (runtime == null) {
//			runtime = new RuntimeEnvironment(src);
//
//		}
//		return runtime;
//	}
	
	public void executeProgram()
	{
		String var;
		String temp1;
		int temp2;
		boolean temp3;
		boolean temp4;
		System.out.println("**************Runtime started*************");
		
		try {
			reader = new FileReader(intermediateFilePath);
			bufferReader = new BufferedReader(reader);
			line = getNextInstruction(bufferReader, "");
			while (line != null) {
			var = line.split(" ")[0];
			//System.out.println(var);
			switch (var)
			{
				case("ASSIGNINT"):
					temp1 = line.split(" ")[1];
					temp2 = Integer.parseInt(line.split(" ")[2]);
					intStack.push(temp2);
					intMap.put(temp1,temp2);
					line=getNextInstruction(bufferReader, "");
					break;
				case("ASSIGNBOOLEAN"):
					temp1 = line.split(" ")[1];
					String booltemp = line.split(" ")[2];
					//System.out.println("Boolean temp "+booltemp);
					boolean asgn;
					if(booltemp.equals("true"))
						 asgn = true;
					else
						 asgn = false;
					//System.out.println("This is put in booleanMap "+temp1+" "+asgn);
					booleanStack.push(asgn);
					booleanMap.put(temp1,asgn);
					//System.out.println("Assigned Boolean Map "+booleanMap);
					line=getNextInstruction(bufferReader, "");
				break;
					
				case("ASSIGNSTRING"):
					temp1 = line.split(" ")[1];
					String strtemp = line.split(" ")[2];
					stringStack.push(strtemp);
					stringMap.put(temp1,strtemp);
					line=getNextInstruction(bufferReader, "");
					break;
					
				case("STORE"):
					//System.out.println(var);
					temp1 = line.split(" ")[1];
					if(intMap.containsKey(temp1))
					{
						int i = intStack.pop();
						//System.out.println(i+"Store popped");
						intMap.put(temp1,i);
						intStack.push(i);
						//System.out.println(intMap);
					}
					
					if(booleanMap.containsKey(temp1))
					{
						
						boolean b1 = booleanStack.pop();
						booleanMap.put(temp1,b1);
						booleanStack.push(b1);
						//System.out.println("Stored BooleanMap"+booleanMap);
					}
					
					if(stringMap.containsKey(temp1))
					{
						String b2 = stringStack.pop();
						stringMap.put(temp1,b2);
						stringStack.push(b2);
					}
					
					
					line=getNextInstruction(bufferReader, "");
					break;
				case("INTEGER"):
					String i = line.split(" ")[1];
					intMap.put(i,0);
					line=getNextInstruction(bufferReader, "");
					break;
					
				case("LOAD"):
					String load = line.split(" ")[1];
					if(intMap.containsKey(load))
					{
						//System.out.println("Loaded "+load);
						intStack.push(intMap.get(load));
					}
					
					if(booleanMap.containsKey(load))
					{
						booleanStack.push(booleanMap.get(load));
					}
					
					line=getNextInstruction(bufferReader, "");
					break;
					
				case("INCREMENT"):
					load = line.split(" ")[1];
					if(intMap.containsKey(load))
					{
					//System.out.println("Initial Map "+intMap);
					int temp = intMap.get(load);
					//System.out.println("The initial Value of "+load+" ="+temp);
					temp = temp + 1;
					intStack.push(temp);
					intMap.put(load,temp);
					//System.out.println("Final Map "+intMap);
					//System.out.println("Present Value of "+load+"="+ temp);
					}
					
					//System.out.println("Increment");
					line=getNextInstruction(bufferReader, "");
					break;
				
				case("INCREASE "):
					line=getNextInstruction(bufferReader, "");
					break;
					
				case("DECREMENT"):
					load = line.split(" ")[1];
					if(intMap.containsKey(load))
					{
					int temp = intMap.get(load);
					temp = temp - 1;
					intMap.put(load,temp);
					intStack.push(temp);
					}
					line=getNextInstruction(bufferReader, "");
					break;
					
				case("MULTIPLY"):
					a = intStack.pop();
					b = intStack.pop();
					intStack.push(a*b);
					//System.out.println("Top after MUL"+intStack.peek());
					line=getNextInstruction(bufferReader, "");
					break;
					
				case("ADD"):
					a = intStack.pop();
					b = intStack.pop();
					intStack.push(a+b);
					//System.out.println("Top after ADD "+intStack.peek());
					line=getNextInstruction(bufferReader, "");
					break;
					
				case("SUBTRACT"):
					a = intStack.pop();
					b = intStack.pop();
					intStack.push(b-a);
					//System.out.println("Top after SUBTRACT "+intStack.peek());
					line=getNextInstruction(bufferReader, "");
					break;
					
				case("DIVIDE"):
					a = intStack.pop();
					b = intStack.pop();
					intStack.push(b/a);
					//System.out.println("Top after DIVIDE "+intStack.peek());
					line=getNextInstruction(bufferReader, "");
					break;
					
					
				case("PRINT"):
				var=line.split(" ")[1];
				//System.out.println(booleanMap);
				if(intMap.containsKey(var))
				{
					//System.out.println("PRINT REACHED");
					System.out.println(intMap.get(var));
				}
				if(booleanMap.containsKey(var))
				{
					//System.out.println("Printed value of "+var+" "+booleanMap);
					System.out.println(booleanMap.get(var));
				}
				if(stringMap.containsKey(var))
				{
					System.out.println(stringMap.get(var));
					
				}
				
				//System.out.println("evaluated");
				line=getNextInstruction(bufferReader, "");
				break;
				
				case("PRINT_STRING"):
					var=line.split(" ")[1];
				System.out.println(var);
					line=getNextInstruction(bufferReader, "");
				break;
				
				case("EQUAL"):
					if(intStack.pop() == intStack.pop())
					{
						booleanStack.push(true);
					}
					else
					{
						booleanStack.push(false);
					}
					line=getNextInstruction(bufferReader, "");
					break;
				
				case("NOTEQUAL "):
					if(intStack.pop() != intStack.pop())
					{
						booleanStack.push(true);
					}
					else
					{
						booleanStack.push(false);
					}
					line=getNextInstruction(bufferReader, "");
					break;
					
				case("NEGATE "):
					if(booleanStack.pop()==true)
					{
						booleanStack.push(false);
					}
					else
					{
						booleanStack.push(true);
					}
				line=getNextInstruction(bufferReader, "");
				break;
				
				
				case("AND"):
					//temp3 = booleanStack.pop();
				    //temp4 = booleanStack.pop();
				    if(booleanStack.pop() && booleanStack.pop())
				    {
				    	booleanStack.push(true);
				    }
				    else
				    {
				    	booleanStack.push(false);
				    }
				    line=getNextInstruction(bufferReader, "");
					break;
					
					
				case("OR"):
				temp3 = booleanStack.pop();
			    temp4 = booleanStack.pop();
			    if(temp3 || temp4)
			    {
			    	booleanStack.push(true);
			    }
			    else
			    {
			    	booleanStack.push(false);
			    }
			    line=getNextInstruction(bufferReader, "");
				break;
				
				case("JUMP"):
				if(line.split(" ")[1].equals("TERNARY_EXIT"))
				{
					line = getNextInstruction(bufferReader,line.split(" ")[1]);
					break;
				}
				//System.out.println(booleanStack);
				temp3 = booleanStack.pop();
				
				//System.out.println("JUMP encountered "+ temp3+" "+ line.split(" ")[1]);
				if(temp3)
				{
					
					line = getNextInstruction(bufferReader, "");
					//System.out.println(line);
				}
				else
				{	
					String jump = line.split(" ")[1];
					//System.out.println("This is jump "+jump);
					
					if(jump.contains("WHILE_END"))
					{
						//System.out.println("While end initiated");
						line = getNextInstruction(bufferReader,jump+" "+line.split(" ")[2]);
					}
					else if(jump.contains("FOREND"))
					{
						//System.out.println("For End initiated");
						line = getNextInstruction(bufferReader,jump+" "+line.split(" ")[2]);
					}
					else if(jump.contains("FOR_PYTHON_END"))
					{
						//System.out.println("For End initiated");
						line = getNextInstruction(bufferReader,jump+" "+line.split(" ")[2]);
					}
					
					else if(jump.contains("TERNARY_EXIT"))
					{
						//System.out.println("Ternary Exited");
						line = getNextInstruction(bufferReader,jump);
					}
					
					else if(jump.equals("COND1"))
					{
						//System.out.println("Condition 1 entered");
						line = getNextInstruction(bufferReader,jump);
					}
					
					else if(jump.equals("COND2"))
					{
						//System.out.println("Condition 2 entered");
						line = getNextInstruction(bufferReader,jump);
					}
					
					else if(jump.equals("ELSE_BEGIN"))
					{
						line = getNextInstruction(bufferReader,jump);
					}
					
					else
					{
						line=getNextInstruction(bufferReader, "");
					}
					
					
				}
				//System.out.println("The End");
				break;
//				case("JUMP"):
//					System.out.println("JUMP KANO");
//				String label = "";
//				boolean test_bool = booleanStack.pop();
//				booleanStack.push(test_bool);
//				if (booleanStack.pop()) {
//					label = line.split(" ")[1];
//					line = getNextInstruction(bufferReader, "");
//				} 
//				else {
//					label = line.split(" ")[1];
//					line = getNextInstruction(bufferReader, label);
//					if (label.equals("WHILE_END")) {
//						line = getNextInstruction(bufferReader, label + " " + line.split(" ")[2]);
//					}
//					System.out.println("elseappa");
//				}
//				
//				break;
				
				case("ELSE_BEGIN"):
				//System.out.println("ELSE began reached");
				line=getNextInstruction(bufferReader, "");
				break;
				
				case("ELSE_END"):
				line=getNextInstruction(bufferReader, "");
				break;
				
				case("IFBEGIN"):
					line=getNextInstruction(bufferReader, "");
					break;
					
					
				case("IFEND"):
					line=getNextInstruction(bufferReader, "");
					break;
					
				
				case("BEGIN"):
					line=getNextInstruction(bufferReader, "");
					break;
					
				case("END"):
					line=getNextInstruction(bufferReader, "");
					break;
					
					
				
				case("GREATERTHAN"):
//					a = intStack.pop();
//					b = intStack.pop();
					if(intStack.pop()<intStack.pop())
					{
						booleanStack.push(true);
					}
					else
					{
						booleanStack.push(false);
					}
				//System.out.println("Greater than executed "+booleanStack.peek());
				
				line=getNextInstruction(bufferReader, "");
				break;
				
				case("GREATERorEQUAL"):
					if(intStack.pop()<=intStack.pop())
					{
						booleanStack.push(true);
					}
					else
					{
						booleanStack.push(false);
					}
				
				line=getNextInstruction(bufferReader, "");
				break;	
				
				case("LESSorEQUAL"):
					if(intStack.pop()>=intStack.pop())
					{
						booleanStack.push(true);
					}
					else
					{
						booleanStack.push(false);
					}
				//System.out.println("LESS THAN");
				
				line=getNextInstruction(bufferReader, "");
				break;
					
					

				case("LESSTHAN"):
//					a = intStack.pop();
//					b = intStack.pop();
					if(intStack.pop()>intStack.pop())
					{
						booleanStack.push(true);
					}
					else
					{
						booleanStack.push(false);
					}
				//System.out.println("LESS THAN");
				
				line=getNextInstruction(bufferReader, "");
				break;
				
				
				case("PUSH"):
					var = line.split(" ")[1];
				//System.out.println(var+" PUSH Entered");
				if(isInteger(var))
				{	
					//System.out.println("PUSH int Entered");
					intStack.push(Integer.parseInt(var));
					//System.out.println(intStack.peek()+" peeked Value");
				}
				else if(var=="true" || var=="false")
				{
					if(var=="true")
					booleanStack.push(true);
					else
						booleanStack.push(false);
				}
				else
				{
					stringStack.push(var);
				}
					line=getNextInstruction(bufferReader, "");
					break;
				
					
				case("WHILE_BEGIN"):
					//System.out.println("WHILE ENTERED");
					line=getNextInstruction(bufferReader, "");
					break;
				
				case("WHILE_END"):
					//System.out.println("WHILE ENDED");
					line=getNextInstruction(bufferReader, "");
					break;
					
					
				case ("LOOP"):
					var = line.split(" ")[1];
				//System.out.println("Loop entered "+var);
					if (line.contains("WHILE")) {
						bufferReader.close();
						reader = new FileReader(intermediateFilePath);
						bufferReader = new BufferedReader(reader);
						line = getNextInstruction(bufferReader, "WHILE_BEGIN " + line.split(" ")[2]);
					}
					else if(line.contains("FOR_EVALUATE"))
					{
						bufferReader.close();
						reader = new FileReader(intermediateFilePath);
						bufferReader = new BufferedReader(reader);
						line = getNextInstruction(bufferReader, "FOR_EVALUATE " + line.split(" ")[2]);
						//System.out.println("LOOPING");
					}
					else if(line.contains("PYTHON_EVALUATE"))
					{
						bufferReader.close();
						reader = new FileReader(intermediateFilePath);
						bufferReader = new BufferedReader(reader);
						line = getNextInstruction(bufferReader, "PYTHON_EVALUATE " + line.split(" ")[2]);
						//System.out.println(line);
						//System.out.println("Python For loop LOOP");
						
					}
					else 
					{
//						line=getNextInstruction(bufferReader, "");
//						break;
						//continue;
						
					}
					
					//System.out.println("Loop entered");
					break;
				
				case("EXIT_IF"):
					String jump = line.split(" ")[0];
				//System.out.println("if exited");
				line=getNextInstruction(bufferReader, "IFEND");
				break;
					
				case("FOR_EVALUATE"):
					line=getNextInstruction(bufferReader, "");
					break;
					
				case("FOR_PYTHON_BEGIN"):	
					line=getNextInstruction(bufferReader, "");
					break;
					
					
				case("PYTHON_EVALUATE"):
					line=getNextInstruction(bufferReader, "");
				break;
					
					
				case("COMPARE"):
					if(intMap.containsKey(line.split(" ")[1]))
					{
						int t = intMap.get(line.split(" ")[1]);
						if(t<Integer.parseInt(line.split(" ")[2]))
						{
							booleanStack.push(true);
							//System.out.println("Compare true");
						}
						else
						{
							booleanStack.push(false);
							//System.out.println("Compare false");
						}
					}
				
				
				line=getNextInstruction(bufferReader, "");
				break;
					
					
					
				case("FOR_PYTHON_END"):
					line=getNextInstruction(bufferReader, "");
					break;
					
					
				case("TERNARY_ENTER"):
					//System.out.println("Ternanry enter");
					line=getNextInstruction(bufferReader, "");
					break;
				
				case("TERNARY_EXIT"):
					line=getNextInstruction(bufferReader, "");
					break;
					
				case("COND1"):
					//System.out.println("Condition1 is entered");
					line=getNextInstruction(bufferReader, "");
					break;

				case("COND2"):
					line=getNextInstruction(bufferReader, "");
					break;
					
				case("TERNARY_COND"):
					//System.out.println("Ternary cond entered");
					//boolean prt = booleanStack.pop();
					//System.out.println("Ternary Condition "+prt);
					
					if(booleanStack.pop()==true)
					{
						line=getNextInstruction(bufferReader, "COND1");
					}
					else
					{
						line=getNextInstruction(bufferReader, "COND2");
						//line=getNextInstruction(bufferReader, "");
					}
					
					break;
					
					
				
					
				default:
					line=getNextInstruction(bufferReader, "");
					break;
			}
				
			}
			
			}
		catch(Exception obj)
		{
			System.out.println("Exception O");
			obj.printStackTrace();
		}
	}
	
	String getNextInstruction(BufferedReader bufferReader, String label) {
		String line = "";
		try {
			line = bufferReader.readLine();

			if (label == "")
				return line;
			else {
				while (!(line.startsWith(label)))
					line = bufferReader.readLine();
				//System.out.println(line);
				return line;
			}
		} 
		
		catch (Exception obj) {
			obj.printStackTrace();
		}
		
		return "";
	}
	
	boolean isInteger(String string) {
		try {
			Integer.parseInt(string);
			return true;
		} catch (NumberFormatException e) {
			System.out.println(e);
			return false;
		}
	}

}

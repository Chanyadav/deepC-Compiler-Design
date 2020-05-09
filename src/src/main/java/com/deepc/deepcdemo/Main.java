/**
 * Title:        DeepC_Main
 * Description:  CSE502 Project
 * Company:      CIDSE, Arizona State University
 * @author Nachiappan Lakshmanan 
 * @version 1.0
 */
package com.deepc.deepcdemo;
import java.io.IOException;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.deepc.deepcdemo.deepcParser.ProgramContext;

public class Main {

	private static final String EXTENSION = "dpc";

	public static void main(String[] args) throws IOException {
		//String program = args.length > 1 ? args[1] : "C:/Users/Chandan Yadav/eclipse-workspace/deepcdemo/test/test." + EXTENSION;
		
		try
		{
			String program = args[0];
		
		System.out.println("Interpreting file " + program);

		deepcLexer lexer = new deepcLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		deepcParser parser = new deepcParser(tokens);
		ProgramContext tree = parser.program();
		String outputDirectory = program.replace("dpc", "idpc");
		File file = new File(outputDirectory);
		Compiler comp = new Compiler(file);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(comp, tree);
		System.out.println("Interpretation finished");
		System.err.println(tree.toStringTree(parser));
		Trees.inspect(tree, parser);
		RuntimeEnvironment runTime = new RuntimeEnvironment(outputDirectory);
		runTime.executeProgram();
	}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
	}

}

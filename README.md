# SER502-Spring2020-Team17

Contributors:

1. GuruPreetam
2. Nachiappan
3. Nayan Jain
4. Chandan Yadav

Introduction

Our Language is mainly inspired from imperative languages and Object-Oriented Languages such as C, C++, Java, Python. It is named as DeepC. Easy to code as the keywords are mostly familiar and is highly user friendly. Compiler and the Run time environment are created using Java.

Tools:
  1.Windows
  2.ANTLR
  3.Java
  4.Maven

Compilers:
1. Developed in Java
2. ANTLR (Another Tool for Language Recognition) : Lexer and parsing is taken care by the tool.
3. Intermediate code is generated using Java in the ListenerClass.
4. Parser generates a parse tree by using all the tokens that are generated after Lexer analysis.

Interpreter:
1. The Interpreter is developed using Java by using the intermediate code.
2. The input is fed to the intermediate code and output is generated.

Lexical Analysis and Parsing using ANTLR:
1. ANTLR tools reads the program and tokenizes them according to the grammar defined in the .g4 file.
2. The tokens generated are later fed into the parser.
3. The parser generates the parse tree for a given input of tokens.
4. Every node in the parse tree has been given semantics using the intermediate code in Java.
5. Internally we plan to use Stack and HashMap and if needed any other Data Structures to extend implementation in the future.


Steps to execute the program:
1. Download the repository
2. Navigate to the src/target folder
3. Enter the command java -jar deepcdemo-0.0.1-SNAPSHOT-jar-with-dependencies path/filename.dpc
4. Example: C:\SER502-Spring2020-Team17\src\target>java -jar deepcdemo-0.0.1-SNAPSHOT-jar-with-dependencies.jar C:\SER502-Spring2020-Team17\data\factorial_while.dpc
5. The intermediate code is generated in the same folder with a .idpc extension.

 
 Note: If jar file not found please add  .jar extension to jar file

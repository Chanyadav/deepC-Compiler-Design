grammar deepc;

DIGIT
    : [0-9]+ ('.'[0-9]+)?
    | [0-9]+ '.' [0-9]+ ('.'[0-9]+)?
    ;

string : (lowerCharacter | upperCharacter)+;
lowerCharacter : 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' ;
upperCharacter : 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z' ;

identifier : lowerCharacter;

program: block '.' ;
block: 'begin' declarationList ';' commandList ';' 'end' ;

declarationList : declaration| declaration ';' declarationList;

declaration
: datatype='integer' name=identifier #intDeclaration
| datatype='booleanValue' name=identifier #BooleanDeclaration
| datatype='string' name=identifier #StringDeclaration
| 'integer' name=identifier ':=' val=primary #intAssignment
| 'booleanValue' name=identifier ':=' val=booleanValue #booleanAssignment
| 'string' name=identifier ':=' val=string #stringAssignment
| #nodec
;

commandList: command| command ';' commandList;

command: 'if' if_condition 'then' commandList elsepart 'end_if' #ifElseStatement
|  booleanValueList ternarycondition ternary	#boolTernary
| 'while' while_condition 'do' commandList 'end_while' #whileStatement
| 'for' '('initialize ';'for_condition';' endCondition ')' 'do' commandList 'end_for' #forLoopStatement
| 'for' for_range commandList 'end_for' #forLoopPython
|  initialize #initializeDummy1
|  print #printdummy
|endCondition #dummyEnd
;

ternarycondition: '?';

for_range: name=identifier 'in' 'range' '(' begin=DIGIT ',' end=DIGIT ')';
elsepart: 'else' commandList;

if_condition: booleanValueList;

while_condition:booleanValueList; 

for_condition: booleanValueList;

initialize: name = identifier ':=' val=expression #variableExpressionAssignment
| name = identifier ':=' val=booleanValue #variableBooleanAssignment
| name = identifier ':=' val=string #variableStringAssignment
;

ternary: cond1 ':' cond2 #ternaryInitialize
| booleanValue ':' booleanValue    #ternarbooleanValue
; 

cond1 : initialize;
cond2 : initialize;

endCondition : initialize #initializeDummy2
| name=identifier '+' '+' #incremental
| name=identifier '-' '-' #decremental
;

booleanValue: 'true' #trueStatement
|'false' #falseStatement
| expression '==' expression  #equalExpression
| expression '!=' expression  #notequalExpression
| 'not' '('booleanValue')'  #negation
| expression '<' expression   #lessThan
| expression '>' expression   #greaterThan
| expression '>=' expression  #greaterThanOrEqual
| expression '<=' expression  #lesserThanOrEqual
; 

booleanValueList: booleanValue #booleanDummy
| booleanValue 'and' booleanValueList #logicalAndRelation
| booleanValue 'or' booleanValueList  #logicalOrRelation 
;

expression :  expression '+' term1#addition
| expression  '-' term1#subtraction
| term1 #term1dummy;

term1: term1 '*' term2   #multiplication
| term1  '/'  term2      #division
| term2 #dummyterm2
; 

term2: 
'(' expression ')' #bracketExpression
| name=identifier #identifierVariable
| primary #number;

print: 'print' '(' name=identifier ')' #printidentifier 
|'print' '(' name=string ')' #printstring
;

primary: DIGIT 
;

COMMENT
    : '~' ~[\r\n]* -> skip
    ;

WHITESPACE
    : [ \t\r\n]+ -> skip
    ;

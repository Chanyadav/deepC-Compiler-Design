 /* digit */
digit(t_digit(X)) --> [X],{number(X)}.

/*string*/
string(Z) --> [Z], {string(Z)}.

/* identifier */
identifier(x) --> [x].
identifier(y) --> [y].
identifier(z) --> [z].
identifier(u) --> [u].
identifier(v) --> [v].
identifier(f) --> [f].
identifier(i) --> [i].

/* program */
program(t_program(X,.)) --> block(X),[.].
block(t_function_block(begin, X, Y, ;, end)) --> [begin], declarationList(X), [;], commandList(Y), [end].


/* declaration */
declarationList(t_declaration(X)) --> declaration(X).
declarationList(t_declaration(X,Y)) --> declaration(X), [;], declarationList(Y).
declaration(t_declaration(const, Y, =, Z)) --> [const], identifier(Y), [=], primary(Z).


declaration(t_declaration(double, Y, =, Z)) --> [double], identifier(Y), [=], primary(Z).
declaration(t_declaration(var, X)) --> [var], identifier(X).


declaration(t_declaration(bool, X)) --> [bool], identifier(X).
declaration(t_declaration(bool, Y, =, Z)) --> [bool], identifier(Y), [=], boolean(Z).
declaration(t_declaration(string, X)) --> [string], identifier(X).
declaration(t_declaration(string, Y, =, Z)) --> [string], identifier(Y), [=], string(Z).

/* command  */

commandList(t_command(X)) --> command(X).
commandList(t_command(X,Y)) --> command(X), [;], commandList(Y).
command(t_command(if,X,then,Y,else,Z,endif)) --> [if], boolean(X), [then],commandList(Y), [else], commandList(Z), [endif]. 
command(t_command(X,?,Y)) -->  boolean(X), [?], ternary(Y).




command(t_command(while,X,do,Y,endwhile)) --> [while], boolean(X), [do], 
    commandList(Y), [endwhile].
command(t_command(for,C,X,Z,do,Y,endfor)) --> [for], initialize(C), booleanList(X), endCondition(Z),[do], 
    commandList(Y), [endfor].
command(t_command(for,X,in,range,Y,Z,do,W,endfor)) --> [for], identifier(X), [in], [range], 
    ['('],digit(Y), [,] ,digit(Z) ,[')’], [do], commandList(W),[endfor].

command(X) --> initialize(X).
initialize(t_initialize(X,:=,Y)) --> identifier(X), [:=], expression(Y).
initialize(t_initialize(X,:=,Y)) --> identifier(X), [:=], string(Y).

ternary(t_ternary(X,Y)) --> initialize(X),[:],initialize(Y).    
ternary(t_ternary(X,Y)) --> boolean(X),[:],boolean(Y).




endCondition(t_end(X)) --> initialize(X).
endCondition(t_end(X,+,+))  --> identifier(X), [+], [+].
endCondition(t_end(X,-,-))  --> identifier(X), [-], [-].

/* boolean */
boolean(t_boolean(true)) -->  [true].
boolean(t_boolean(false)) --> [false].
boolean(t_boolean(X,=,=,Y)) --> expression(X), [=,=], expression(Y).


boolean(t_boolean(not,X))   -->  [not], boolean(X). 
boolean(t_boolean(X,<,Y))  -->  expression(X), [<], expression(Y).
boolean(t_boolean(X,>,Y))  -->  expression(X), [>], expression(Y).
boolean(t_boolean(X,>=,Y)) -->  expression(X), [>=], expression(Y).
boolean(t_boolean(X,<=,Y)) -->  expression(X), [<=], expression(Y).



booleanList(X) --> boolean(X).
booleanList(t_boolean(X,and,Y)) --> boolean(X) ,[and], booleanList(Y).
booleanList(t_boolean(X,or,Y)) -->  boolean(X) ,[or], booleanList(Y).


/* expression */
expression(t_add(X,Y)) --> alphabeta(X), expressionBar(Y).
expressionBar(t_add(X,Y)) --> [+],alphabeta(X),expressionBar(Y).
expressionBar(t_add[]) --> [].

alphabeta(t_subtract(X,Y)) --> alphabeta1(X), expessionBar1(Y).
expessionBar1(t_subtract(X,Y)) --> [-],alphabeta1(X),expessionBar1(Y).
expessionBar1(t_subtract[]) --> [].

alphabeta1(t_multiply(X,Y)) -->  alphabeta2(X),expessionBar2(Y).
expessionBar2(t_multiply(X,Y)) --> [*],alphabeta2(X),expessionBar2(Y).
expessionBar2(t_multiply[]) --> [].

alphabeta2(t_division(X,Y)) --> alphabeta3(X), expessionBar3(Y).
expessionBar3(t_division(X,Y)) --> [/],alphabeta3(X),expessionBar3(Y).
expessionBar3(t_divison[]) --> [].
   
alphabeta3(t_identifier(X)) --> identifier(X).
alphabeta3(t_digit(X)) --> primary(X).

print(t_print(Y)) --> [print],['('],[Y],[')'].
primary(C) --> digit(C).

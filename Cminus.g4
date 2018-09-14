grammar Cminus;

// Lexer Rules
SEMI_COLON : ';' ;
OPEN_SQUARE_BRACKET : '[';
CLOSE_SQUARE_BRACKET : ']';
INT  : 'int';
VOID : 'void';
OPEN_BRACKET : '(';
CLOSE_BRACKET : ')';
COMMA : ',';
OPEN_PARENTHESIS : '{';
CLOSE_PARENTHESIS : '}';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
RETURN : 'return';
EQUAL : '=';
GREATER_THAN_EQUAL : '>=';
GREATER_THAN : '>';
LESS_THAN : '<';
LESS_THAN_EQUAL : '<=';
IS_EQUAL : '==';
NOT_EQUAL : '!=';
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';
ID: LETTER LETTER*;
NUM: DIGIT DIGIT*;
LETTER: 'a'..'z'| 'A'..'Z';
DIGIT: '0'..'9';
WS : [ \t\n\r]+ -> skip ;
COMMENTS : ('/*' .*? '*/' | '//' ~'\n' '\n' ) -> skip;

// Parser rule
program : declaration_list;
declaration_list : declaration_list_;
declaration_list_ : declaration declaration_list_ | /* epsilon */;
declaration : var_declaration | fun_declaration;
var_declaration : type_specifier ID SEMI_COLON | type_specifier ID OPEN_SQUARE_BRACKET NUM CLOSE_SQUARE_BRACKET SEMI_COLON;
type_specifier : INT | VOID;
fun_declaration : type_specifier ID OPEN_BRACKET params CLOSE_BRACKET compound_stmt;
params : param_list | VOID;
param_list : param param_list_;
param_list_ : COMMA param param_list_ | /* epsilon */;
param : type_specifier ID | type_specifier ID OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET;
compound_stmt : OPEN_PARENTHESIS local_declarations statement_list CLOSE_PARENTHESIS;
local_declarations : local_declarations_;
local_declarations_ : var_declaration local_declarations_ | /* epsilon */;
statement_list : /* epsilon */ statement_list_;
statement_list_ : statement statement_list_|  /* epsilon */;
statement : expression_stmt | compound_stmt | selection_stmt | iteration_stmt | return_stmt;
expression_stmt : expression SEMI_COLON | SEMI_COLON;
selection_stmt : IF OPEN_BRACKET expression CLOSE_BRACKET statement | IF OPEN_BRACKET expression CLOSE_BRACKET statement
ELSE statement;
iteration_stmt : WHILE OPEN_BRACKET expression CLOSE_BRACKET statement;
return_stmt : RETURN SEMI_COLON | RETURN expression SEMI_COLON;
expression : var EQUAL expression | simple_expression;
var : ID | ID OPEN_SQUARE_BRACKET expression CLOSE_SQUARE_BRACKET ;
simple_expression : additive_expression relop additive_expression | additive_expression;
relop : GREATER_THAN_EQUAL | GREATER_THAN | LESS_THAN | LESS_THAN_EQUAL | IS_EQUAL | NOT_EQUAL;
additive_expression : term additive_expression_;
additive_expression_ : addop term additive_expression_ | /* epsilon */;
addop : PLUS | MINUS;
term : factor term_;
term_ : mulop factor term_ |  /* epsilon */;
mulop : MULTIPLY | DIVIDE;
factor : OPEN_BRACKET expression CLOSE_BRACKET | var | call | NUM;
call : ID OPEN_BRACKET args CLOSE_BRACKET ;
args : arg_list | /* epsilon */;
arg_list : expression arg_list_;
arg_list_ : COMMA expression arg_list_ | /* epsilon */;






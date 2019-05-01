grammar rules;

//test  ==============================================================
TEST_SYMBOL: 'TEST';


//basic tokens ==============================================================
LEFT_CURLY_BRACE: '{';
RIGHT_CURLY_BRACE: '}';

LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';

LEFT_PARENTHESES: '(';
RIGHT_PARENTHESES: ')';

SEMICOLON: ';';
COMMA: ',';
DOT: '.';

//SINGLE_QUOTATION_MARK: '\'';
//DOUBLE_QUOTATION_MARK: '"';

ASSIGN_SYMBOL: '=';

EQUAL_SYMBOL: '==';
LOGIC_OR: '||';
LOGIC_AND: '&&';
LOGIC_NOT: '!';

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
XOR: '^';
AND: '&';
OR: '|';
NOT: '~';

//TODO: scientific notation support
DOUBLE_LITERAL: [+-]?[0-9]*'.'?[0-9]+;
INT_LITERAL: [+-]?[0-9]+;
//TODO: unicode support
CHAR_LITERAL: '\'' [a-zA-Z] '\'';
//TODO: unicode support
STRING_LITERAL: '"' [a-zA-Z0-9 \t]* '"';
BOOL_LITERAL: 'true' | 'false';

arrayInitialization:
    simpleArrayInitialization
    | '{' (simpleArrayInitialization ',') simpleArrayInitialization '}'
    ;

simpleArrayInitialization:
    '{' rValueList '}'
    ;

rValueList:
    (rValue ',')* rValue
    ;

//keywords ==============================================================
NAMESPACE_SYMBOL: 'namespace';
FUNCTION_DEFINITION_SYMBOL: 'def';
CLASS_DEFINITION_SYMNOL: 'struct';

IF_SYMBOL: 'if';
WHILE_SYMBOL: 'while';
ELSE_SYMBOL: 'else';
ELSE_IF_SYMBOL: 'elif';
RETURN_SYMBOL: 'return';
CONTINUE_SYMBOL: 'continue';
FOR_SYMBOL: 'for';
BREAK_SYMBOL: 'break';


//data type
//INT_SYMBOL: 'int';
//DOUBLE_SYMBOL: 'double';
//CHAR_SYMBOL: 'char';
//STRING_SYMBOL: 'string';
//BOOL_SYMBOL: 'bool';


//identifier ==============================================================
IDENTIFIER: [a-zA-Z_$][a-zA-Z_$0-9]*;




//common ==============================================================
WHITE_SPACE: [ \t\r\n]+ -> skip;

LINE_COMMENT:
    '//' ~[\r\n]*  -> skip
    ;

COMMENT
    : '/*' .*? '*/' -> skip
;


////TODO
rValue:
    INT_LITERAL
    | DOUBLE_LITERAL
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | expression
    | arrayInitialization
    | functionCall
    ;

//TODO
lValue:
    IDENTIFIER
//    | lValue DOT IDENTIFIER
    | lValue LEFT_BRACKET expression RIGHT_BRACKET
    ;

expression:
    IDENTIFIER
    | arithmeticExpression
    ;

//namespace definition
namespaceDefinition:
    NAMESPACE_SYMBOL IDENTIFIER LEFT_CURLY_BRACE code RIGHT_CURLY_BRACE
    ;


//program general rules ==============================================================
program:
    (namespaceDefinition)+
//    | code //default namespace
    ;

//code is the content of a namespace, which cannot contain namespace
code: //empty
    | codeContent+
    ;

codeContent:
    variableDefinition SEMICOLON
    | functionDefinitionBlock
    | structDefinition
    ;



//arithmetic or bool expression ==============================================================
arithmeticExpression:
    IDENTIFIER
    | INT_LITERAL
    | DOUBLE_LITERAL
    | STRING_LITERAL
    | CHAR_LITERAL
    | BOOL_LITERAL
    | functionCall
    | arithmeticExpression ADD arithmeticExpression
    | arithmeticExpression SUB arithmeticExpression
    | arithmeticExpression MUL arithmeticExpression
    | arithmeticExpression DIV arithmeticExpression
    | SUB arithmeticExpression
    | arithmeticExpression XOR arithmeticExpression
    | arithmeticExpression OR arithmeticExpression
    | arithmeticExpression AND arithmeticExpression
    | NOT arithmeticExpression
    | LEFT_PARENTHESES arithmeticExpression RIGHT_PARENTHESES
    ;


//assignment ==============================================================
assignment: lValue ASSIGN_SYMBOL rValue;

//basic structure ==============================================================
block:
	forBlock
	| whileBlock
    | logicBlock
//	| functionDefinitionBlock
	| pureBlock
	;

pureBlock:
    LEFT_CURLY_BRACE blockBodyCode RIGHT_CURLY_BRACE
    ;

statementWithoutSemicolon: //TODO
    returnStatement
    | assignment
    | variableDefinition
    | rValue
    ;

statementList: /*empty */
    | statementOrBlock statementList
    ;

statementOrBlock: block
    | statement
    ;

statement:
    statementWithoutSemicolon SEMICOLON
    ;

blockBodyCode:
    statementList
    | structDefinition
    ;

returnStatement:
    RETURN_SYMBOL rValue
    | RETURN_SYMBOL
    ;


//function definition ==============================================================
functionDefinitionBlock:
	FUNCTION_DEFINITION_SYMBOL IDENTIFIER IDENTIFIER functionParameterDefinition functionBody;

functionParameterDefinition: LEFT_PARENTHESES parameterList RIGHT_PARENTHESES;

parameterList:
    //empty
    | (variableDeclaration ',')* variableDeclaration
    ;

functionBody: LEFT_CURLY_BRACE blockBodyCode RIGHT_CURLY_BRACE;


////logic block ==============================================================
logicBlock:
    ifBlock elseIfBlock* elseBlock?
    ;


ifBlock: IF_SYMBOL '(' rValue ')' '{' blockBodyCode '}';

elseIfBlock:
    ELSE_IF_SYMBOL '(' rValue ')' '{' blockBodyCode '}'
    ;

elseBlock:
    ELSE_SYMBOL '{' blockBodyCode '}'
    ;

//loop ==============================================================
//TODO: do-while
forBlock:
	FOR_SYMBOL '(' forCondition ')' '{' blockBodyCode '}';

forCondition:
    initOrStepCondition ';' terminateCondition ';' initOrStepCondition
    ;

initOrStepCondition:
    //empty
    | (statementWithoutSemicolon ',')* statementWithoutSemicolon
    ;

terminateCondition:
    //empty
    | rValue
    ;


whileBlock: WHILE_SYMBOL '(' rValue ')' '{' blockBodyCode '}';


//variable definition ==============================================================
//without semicolon
variableDefinition:
    ordinaryVariableDefinition
    | ordinaryArrayDefinition
	| variableDeclaration
    ;

ordinaryVariableDefinition: simpleVariableDeclaration ASSIGN_SYMBOL rValue;

ordinaryArrayDefinition: arrayDeclaration ASSIGN_SYMBOL rValue;

variableDeclaration:
    simpleVariableDeclaration
    | arrayDeclaration
;

simpleVariableDeclaration: IDENTIFIER IDENTIFIER;

arrayDeclaration: IDENTIFIER (LEFT_BRACKET RIGHT_BRACKET)* IDENTIFIER;



//call function ==============================================================
functionCall:
    IDENTIFIER '(' rValueList ')'
    ;


//struct ==============================================================
structFieldStatementList:
    (variableDefinition ';')*
    ;

structDefinition:
    CLASS_DEFINITION_SYMNOL IDENTIFIER '{' structFieldStatementList '}'
    ;

//TODO: identifier.identifier
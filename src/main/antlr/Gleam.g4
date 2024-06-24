grammar Gleam;

// Root, parsing begins from here
sourceFileRoot: (statement | expressionTryList1 | targetGroup)* EOF;

// Enforce javascript | erlang with an intellij annotator
targetGroup: IF (identifier) CURLY_OPEN (statement)* CURLY_CLOSE;

module : LOWERCASE_IDENT (SLASH LOWERCASE_IDENT)*;
unqualifiedImport: LOWERCASE_IDENT (AS LOWERCASE_IDENT)?
    | TYPE? UPPERCASE_IDENT (AS UPPERCASE_IDENT)?
    ;
unqualifiedImports: CURLY_OPEN (unqualifiedImport (COMMA unqualifiedImport)* (COMMA)?)? CURLY_CLOSE;
imports: IMPORT module (DOT unqualifiedImports)? (AS LOWERCASE_IDENT)?;

// Literal function type: fn (ArgType, ...) -> RetType
literalFuncTypeParameters: PAR_OPEN (typeLiteralSpecial (COMMA typeLiteralSpecial)* (COMMA)?)? PAR_CLOSE;
literalFuncType: FN (literalFuncTypeParameters)? R_ARROW typeLiteralSpecial;

// Literal tuple { value1, value2... }
literalTuple: HASH PAR_OPEN (literal (COMMA literal)* (COMMA)?)? PAR_CLOSE;
// Literal tuple of types { Type1, Type2... }
literalTupleType: HASH PAR_OPEN (typeLiteralSpecial (COMMA typeLiteralSpecial)* (COMMA)?)? PAR_CLOSE;

// Literal type: type arguments ( Type1, Type2, ... )
literalTypeArgument: typeLiteralSpecial;
literalTypeArguments: PAR_OPEN (literalTypeArgument (COMMA literalTypeArgument)* (COMMA)?)? PAR_CLOSE;

literalList: SQUARE_OPEN (literal (COMMA literal )* (COMMA)?)? SQUARE_CLOSE;

litRecordArgument: (label COLON)? literal;
litRecordArguments: PAR_OPEN (litRecordArgument (COMMA (litRecordArgument)* (COMMA)?))? PAR_CLOSE;
literalRecord : (ctorName | remoteCtorName) (litRecordArguments)?;

integer: INT;
bitstringSegmentOptionSize : identifier PAR_OPEN integer PAR_CLOSE;
// 'binary' | 'bytes' | 'int' | 'float' | 'bit_string' | 'bits' | 'utf8' | 'utf16' | 'utf32' | 'utf8_codepoint' | 'utf16_codepoint' | 'utf32_codepoint' | 'signed' | 'unsigned' | 'big' | 'little' | 'native' | 'unit' '(' INTEGER ')';
// enforce value for identifier for these surrounding 2 rules with an intelliJ annotator
bitstringNamedSegmentOption: identifier | bitstringSegmentOptionSize;
bitstringSegmentOption: bitstringNamedSegmentOption | integer;
bitstringSegmentOptions: bitstringSegmentOption (MINUS bitstringSegmentOption)*  (MINUS)?;
literalBitstringSegment: literal (COLON bitstringSegmentOptions)?;
literalBitstring: LTLT  (literalBitstringSegment (COMMA literalBitstringSegment)* (COMMA)?)? GTGT;

typeLiteral: (typeIdentifier | remoteTypeIdentifier) (literalTypeArguments)?;
typeLiteralSpecial: typeHole | literalTupleType | literalFuncType | typeLiteral;
constantTypeAnnotation: COLON typeLiteral;
constantFieldAccess: identifier DOT label;
literal: literalTuple | literalList | literalBitstring | literalRecord | identifier | constantFieldAccess | literalExpression;
constantDefinition: (visibilityModifier)? CONST LOWERCASE_IDENT (constantTypeAnnotation)? EQ literal;

typeParameters: PAR_OPEN (typeParameter (COMMA typeParameter)* (COMMA)?)? PAR_CLOSE;
typeName: (typeIdentifier | remoteTypeIdentifier) (typeParameters)?;
//external_type: (visibility_modifier)? EXTERNAL TYPE type_name;
externalType: visibilityModifier TYPE typeName;

funcParameterTypes : PAR_OPEN (typeBase (COMMA typeBase)* (COMMA)?)? PAR_CLOSE;
tupleType: HASH PAR_OPEN (typeBase (COMMA typeBase)* (COMMA)?)? PAR_CLOSE;
funcType: FN (funcParameterTypes)? R_ARROW typeBase;

typeBase: typeHole | tupleType | funcType | type | typeVar;
typeAnnotation: COLON typeBase;
typeArgument: typeBase;
typeArguments: PAR_OPEN (typeArgument (COMMA typeArgument)* (COMMA)?)? PAR_CLOSE;
type: (typeIdentifier | remoteTypeIdentifier) (typeArguments)?;

// FIX ME: Deprecated syntax? use @external(lang, mod, fn)? https://exercism.org/tracks/gleam/concepts/external-functions
//external_function_body: STRING STRING;
//external_function_parameter: (identifier COLON)? type_base;
//external_function_parameters: LEFT_PAREN (external_function_parameter (COMMA external_function_parameter)* (COMMA)?)? RIGHT_PAREN;
//external_function: (visibility_modifier)? EXTERNAL FN identifier external_function_parameters R_ARROW type_base EQ external_function_body;

funcParameterArgs: labeledDiscardParam | discardParam | labeledNameParam | nameParam;
funcParameter: funcParameterArgs (typeAnnotation)?;
funcParameters: PAR_OPEN (funcParameter (COMMA funcParameter)* (COMMA)?)? PAR_CLOSE;
// A function can contain either a single expression after -> or a { block of expressions }.
// External functions are functions too.
funcBody: (CURLY_OPEN expressionTryList0 CURLY_CLOSE) | expression;
function: (visibilityModifier)? FN identifier funcParameters (R_ARROW typeBase)? funcBody?;

listPatternTail: DOT_DOT (identifier | discard)?;
listPattern: SQUARE_OPEN (pattern (COMMA pattern)* (COMMA)?)? (listPatternTail)? SQUARE_CLOSE;

bitstringPatternSegment: pattern (COLON bitstringSegmentOptions)?;
bitstringPattern: LTLT (bitstringPatternSegment (COMMA bitstringPatternSegment)* (COMMA)?)? GTGT;

tuplePattern: HASH PAR_OPEN (pattern (COMMA pattern)* (COMMA)?)? PAR_CLOSE;
patternSpread: (DOT_DOT (COMMA)?);
recordPatternArgument: (label COLON)? pattern;
recordPatternArguments: PAR_OPEN (recordPatternArgument (COMMA recordPatternArgument)* (COMMA)?)? (patternSpread)? PAR_CLOSE;
recordPattern: (ctorName | remoteCtorName) (recordPatternArguments)?;
pattern: (identifier | discard | recordPattern | literalExpression | tuplePattern | bitstringPattern | listPattern) (AS identifier)?;

try: TRY pattern (typeAnnotation)? EQ expression;
expressionTryList1: (expression | try)+;
expressionTryList0: (expression | try)*;

recordArgument: (label ':')? (hole | expression);
recordArgumentList: PAR_OPEN (recordArgument (COMMA recordArgument)* (COMMA)?)? PAR_CLOSE;
record: (ctorName | remoteCtorName) (recordArgumentList)?;

expressionBitstringSegment: expressionUnit (COLON bitstringSegmentOptions)?;
expressionBitstring: LTLT (expressionBitstringSegment (COMMA expressionBitstringSegment)* (COMMA)?)? GTGT;

todo: TODO (PAR_OPEN STRING PAR_CLOSE)?;
tuple: HASH PAR_OPEN (expression (COMMA expression)* (COMMA)?)? PAR_CLOSE;

listSpread: DOT_DOT expression;
listBody: expression (COMMA expression)* COMMA? listSpread?;
list: SQUARE_OPEN listBody? SQUARE_CLOSE;

anonFuncParameterArgs: discardParam | nameParam;
anonFuncParameter: anonFuncParameterArgs (typeAnnotation)?;
anonFuncParameters: PAR_OPEN (anonFuncParameter (COMMA anonFuncParameter)* (COMMA)?)? PAR_CLOSE;
anonFunc: FN anonFuncParameters (R_ARROW type)? funcBody;

expressionGroup: CURLY_OPEN expressionTryList1 CURLY_CLOSE;

caseClauseTupleAccess: identifier DOT integer;
caseClauseGuardUnit: identifier | caseClauseTupleAccess | CURLY_OPEN caseClauseGuardExpression CURLY_CLOSE | literal;
caseClauseGuardBinaryOperator: BARBAR | ANDAND | EQEQ | NEQ | LESS | LESS_EQUAL | LESS_DOT
    | LESS_EQUAL_DOT | GREATER | GREATER_EQUAL | GREATER_DOT | GREATER_EQUAL_DOT;
caseClauseGuardExpression: caseClauseGuardExpression caseClauseGuardBinaryOperator
    caseClauseGuardExpression | caseClauseGuardUnit;
caseClauseGuard: IF caseClauseGuardExpression;
caseClausePattern: pattern (COMMA pattern)*  (COMMA)?;
caseClausePatterns: caseClausePattern (BAR caseClausePattern)* (BAR)?;
caseClause: caseClausePatterns (caseClauseGuard)? R_ARROW expression;
//caseClauses: (caseClause)+;
caseSubjects: expressionTryList1;
case: CASE caseSubjects CURLY_OPEN caseClause+ CURLY_CLOSE;

useArgs: identifier | identifier COMMA useArgs;
use: USE (useArgs)? L_ARROW expression;

assignment: pattern (typeAnnotation)? EQ expression;
let: LET assignment;
assert: ASSERT assignment;
negation: BANG expressionUnit;

recordUpdateArgument: label COLON expression;
recordUpdateArguments: recordUpdateArgument (COMMA recordUpdateArgument)* (COMMA)?;
recordUpdate: (ctorName | remoteCtorName) PAR_OPEN DOT_DOT expression COMMA recordUpdateArguments PAR_CLOSE;

callOrAccessOptions: recordArgumentList | (DOT label) | (DOT integer);
// this deviates from the treesitter spec - it is function_call + field_access + tuple_access all in one rule to avoid indirect left recursion
callOrAccess
     : callOrAccess     callOrAccessOptions
     | case             callOrAccessOptions
     | identifier       callOrAccessOptions
     | expressionGroup  callOrAccessOptions
     | record DOT label
     | recordUpdate DOT label
     | tuple DOT integer
     | anonFunc recordArgumentList;

literalExpression: STRING | FLOAT | integer | boolean;
expressionUnit
    : record
    | anonFunc
    | identifier
    | todo
    | tuple
    | list
    | expressionBitstring
    | expressionGroup
    | case
    | let
    | use
    | assert
    | negation
    | recordUpdate
    | callOrAccess
    | literalExpression;

expression
    : expressionUnit #unit
    | left=expression EQEQ right=expression #eq
    | left=expression NEQ right=expression #neq
    | left=expression LESS right=expression #lt
    | left=expression LESS_EQUAL right=expression #lte
    | left=expression LESS_DOT right=expression #ltf
    | left=expression LESS_EQUAL_DOT right=expression #ltef
    | left=expression GREATER right=expression #gt
    | left=expression GREATER_EQUAL right=expression #gte
    | left=expression GREATER_DOT right=expression #gtf
    | left=expression GREATER_EQUAL_DOT right=expression #gtef
    | left=expression LT_GT right=expression #ltgt
    | left=expression PIPE right=expression #pipe
    | left=expression PLUS right=expression #plus
    | left=expression PLUS_DOT right=expression #plusf
    | left=expression MINUS right=expression #minus
    | left=expression MINUS_DOT right=expression #minusf
    | left=expression STAR right=expression #star
    | left=expression STAR_DOT right=expression #starf
    | left=expression SLASH right=expression #slash
    | left=expression SLASH_DOT right=expression #slashf
    | left=expression PERCENT right=expression #percent
    | left=expression ANDAND right=expression #and
    | left=expression BARBAR right=expression #or ;

dataCtorArgument: (label COLON)? typeBase;
dataCtorArguments: PAR_OPEN (dataCtorArgument (COMMA dataCtorArgument)* (COMMA)?)? PAR_CLOSE;
dataConstructor: ctorName (dataCtorArguments)?;
//data_constructors: (data_constructor)+;

typeDefinition: (visibilityModifier)? (opacityModifier)? TYPE typeName CURLY_OPEN dataConstructor+ CURLY_CLOSE;
typeAlias: (visibilityModifier)? (opacityModifier)? TYPE typeName EQ type;

//func_attribute_arg: STRING | LOWERCASE_IDENT;
//func_attribute_args: func_attribute_arg (COMMA func_attribute_arg)*;
//func_attribute_generic: AT LOWERCASE_IDENT LEFT_BRACE func_attribute_args RIGHT_BRACE;
funcAttrDeprecated: AT 'deprecated' PAR_OPEN STRING? PAR_CLOSE;
funcAttrExternal: AT 'external' PAR_OPEN LOWERCASE_IDENT COMMA STRING COMMA STRING PAR_CLOSE;
funcAttr: funcAttrDeprecated | funcAttrExternal;
statement
    : imports
    | constantDefinition
    | externalType
    | (funcAttr* function)
    | typeDefinition
    | typeAlias
    ;

///// Aliases (maybe not needed by why not have them for now and we can delete later
// any_ident:  LOWERCASE_IDENT | UPPERCASE_IDENT | IGNORED_IDENT;
identifier: LOWERCASE_IDENT;
ctorName: UPPERCASE_IDENT;
typeIdentifier: UPPERCASE_IDENT;
discard: IGNORED_IDENT;
label: LOWERCASE_IDENT;
typeParameter: LOWERCASE_IDENT;
typeVar: LOWERCASE_IDENT;
typeHole: LOWERCASE_IDENT;
hole: IGNORED_IDENT;
discardParam: discard;
nameParam: identifier;
labeledNameParam: label identifier;
labeledDiscardParam: label discard;
remoteCtorName: identifier DOT ctorName;
remoteTypeIdentifier: identifier DOT typeIdentifier;
visibilityModifier: PUB;
opacityModifier: OPAQUE;
boolean: TRUE | FALSE;

// Keywords
AS: 'as';
ASSERT: 'assert';
CASE: 'case';
CONST: 'const';
//EXTERNAL: 'external';
FN: 'fn';
IF: 'if';
IMPORT: 'import';
LET: 'let';
OPAQUE: 'opaque';
PUB: 'pub';
TODO: 'todo';
TRY: 'try';
TYPE: 'type';
USE: 'use';

// Unofficial Tokens
TRUE: 'True';
FALSE: 'False';

// Groupings
PAR_OPEN: '(';
PAR_CLOSE: ')';
SQUARE_OPEN: '[';
SQUARE_CLOSE: ']';
CURLY_OPEN: '{';
CURLY_CLOSE: '}';

// Operators
AT: '@';
// Int
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
LESS: '<';
GREATER: '>';
LESS_EQUAL: '<=';
GREATER_EQUAL: '>=';
PERCENT: '%';
// Float
PLUS_DOT: '+.';
MINUS_DOT: '-.';
STAR_DOT: '*.';
SLASH_DOT: '/.';
LESS_DOT: '<.';
GREATER_DOT: '>.';
LESS_EQUAL_DOT: '<=.';
GREATER_EQUAL_DOT: '>=.';
// String
LT_GT: '<>';

// Other Punctuation
COLON: ':';
COMMA: ',';
HASH: '#';
BANG: '!';
EQ: '=';
EQEQ: '==';
NEQ: '!=';
BAR: '|';
BARBAR: '||';
ANDAND: '&&';
LTLT: '<<';
GTGT: '>>';
PIPE: '|>';
DOT: '.';
R_ARROW: '->';
L_ARROW: '<-';
DOT_DOT: '..';
END_OF_FILE: 'EOF';

// Extra
COMMENT:        '//'    .*? ('\n'|EOF)  -> channel(HIDDEN) ;
DOC_COMMENT:     '///'   .*? ('\n'|EOF)	-> channel(HIDDEN) ;
MODULE_COMMENT:  '////'  .*? ('\n'|EOF)	-> channel(HIDDEN) ;

// Identifiers
LOWERCASE_IDENT:     [a-z_][_0-9a-z]*;
UPPERCASE_IDENT:     [A-Z][0-9a-zA-Z]*;
IGNORED_IDENT:       '_'[_0-9a-z]*;
IDENT:              LOWERCASE_IDENT | UPPERCASE_IDENT | IGNORED_IDENT;

// Lexer: Numbers (integers)
fragment SIGN: [+-];
fragment BIN_DIGIT: [01];
fragment OCT_DIGIT: [0-7];
fragment DEC_DIGIT: [0-9];
fragment HEX_DIGIT: [0-9a-fA-F];

// Lexer: Literals
fragment DEC_INT:   DEC_DIGIT ('_'? DEC_DIGIT+) *;
fragment BIN_INT:   ('0b' | '0B') BIN_DIGIT ('_'? BIN_DIGIT+) *;
fragment HEX_INT:   ('0x' | '0X') HEX_DIGIT ('_'? HEX_DIGIT+) *;
fragment OCT_INT:   ('0o' | '0O') [0-7] ('_'? [0-7]+) *;
INT:        SIGN? (BIN_INT | OCT_INT | DEC_INT | HEX_INT); // order of ascending base 2, 8, 10, 16

// Lexer: Float
fragment E: [Ee];
fragment FLOAT1: DEC_INT '.' DEC_INT?;      // 1.35, 1.35E-9, 0.3, -4.5, +1. 10_000.0
fragment FLOAT2: ('.' DEC_INT);             // .3, -.4, .0_000_000_1
fragment FLOAT_EXPONENT: E SIGN? DEC_INT;
FLOAT: SIGN? (FLOAT1 | FLOAT2) FLOAT_EXPONENT? ;

// Lexer: String
fragment BACKSLASH:     '\\';
fragment ESC_CHAR:      BACKSLASH ["\bfnrt] ;
fragment ESC_CODEPOINT: BACKSLASH 'u{' HEX_DIGIT+ '}' ;
STRING:             '"' (ESC_CHAR | ESC_CODEPOINT | ~["\\])* '"' ;

WHITESPACE: [ \t\n\r]+ -> channel(HIDDEN) ;
//CRLF: [\r?\n]+ -> channel(HIDDEN) ;

/* "catch all" rule for any char not matched in a token rule of your grammar. Lexers in Intellij must return all
   tokens good and bad. There must be a token to cover all characters, which makes sense, for an IDE. The parser,
   however, should not see these bad tokens because it just confuses the issue. Hence, the hidden channel. */
ERRCHAR
    :	.	-> channel(HIDDEN)
    ;

grammar Gleam;

// Root
source_file: (statement | expression_try_list1 | target_group)* EOF;

// Enforce javascript | erlang with an intellij annotator
target_group: IF (identifier) CURLY_OPEN (statement)* CURLY_CLOSE;

module : LOWERCASE_IDENT (SLASH LOWERCASE_IDENT)*;
unqualified_import
    : LOWERCASE_IDENT (AS LOWERCASE_IDENT)?
    | TYPE? UPPERCASE_IDENT (AS UPPERCASE_IDENT)?
    ;
unqualified_imports
    : CURLY_OPEN (unqualified_import (COMMA unqualified_import)* (COMMA)?)? CURLY_CLOSE
    ;
imports
    : IMPORT module (DOT unqualified_imports)? (AS LOWERCASE_IDENT)?
    ;

constant_function_parameter_types
    : PAR_OPEN (constant_type_special (COMMA constant_type_special)* (COMMA)?)? PAR_CLOSE;
constant_type_function
    : FN (constant_function_parameter_types)? R_ARROW constant_type_special
    ;

constant_tuple: HASH PAR_OPEN (constant_value (COMMA constant_value)* (COMMA)?)? PAR_CLOSE;
constant_type_tuple
    : HASH PAR_OPEN (constant_type_special (COMMA constant_type_special)* (COMMA)?)? PAR_CLOSE;

constant_type_arguement: constant_type_special;
constant_type_arguements: PAR_OPEN (constant_type_arguement (COMMA constant_type_arguement)* (COMMA)?)? PAR_CLOSE;

constant_list: SQUARE_OPEN (constant_value (COMMA constant_value )* (COMMA)?)? SQUARE_CLOSE;

constant_record_argument: (label COLON)? constant_value;
constant_record_arguments: PAR_OPEN (constant_record_argument (COMMA (constant_record_argument)* (COMMA)?))? PAR_CLOSE;
constant_record : (constructor_name | remote_constructor_name) (constant_record_arguments)?;

integer: INT;
bit_string_segment_option_size : identifier PAR_OPEN integer PAR_CLOSE;
// 'binary' | 'bytes' | 'int' | 'float' | 'bit_string' | 'bits' | 'utf8' | 'utf16' | 'utf32' | 'utf8_codepoint' | 'utf16_codepoint' | 'utf32_codepoint' | 'signed' | 'unsigned' | 'big' | 'little' | 'native' | 'unit' '(' INTEGER ')';
// enforce value for identifier for these surrounding 2 rules with an intelliJ annotator
bit_string_named_segment_option: identifier | bit_string_segment_option_size;
bit_string_segment_option: bit_string_named_segment_option | integer;
bit_string_segment_options: bit_string_segment_option (MINUS bit_string_segment_option)*  (MINUS)?;
constant_bit_string_segment: constant_value (COLON bit_string_segment_options)?;
constant_bit_string: LTLT  (constant_bit_string_segment (COMMA constant_bit_string_segment)* (COMMA)?)? GTGT;

constant_type: (type_identifier | remote_type_identifier) (constant_type_arguements)?;
constant_type_special
    : type_hole
    | constant_type_tuple
    | constant_type_function
    | constant_type
    ;
constant_type_annotation: COLON constant_type;
constant_field_access: identifier DOT label;
constant_value: constant_tuple | constant_list | constant_bit_string | constant_record | identifier | constant_field_access | expression_literal;
constant
    : (visibility_modifier)? CONST LOWERCASE_IDENT (constant_type_annotation)? EQ constant_value
    ;

type_parameters: PAR_OPEN (type_parameter (COMMA type_parameter)* (COMMA)?)? PAR_CLOSE;
type_name: (type_identifier | remote_type_identifier) (type_parameters)?;
//external_type: (visibility_modifier)? EXTERNAL TYPE type_name;
external_type: visibility_modifier TYPE type_name;

function_parameter_types : PAR_OPEN (type_base (COMMA type_base)* (COMMA)?)? PAR_CLOSE;
tuple_type: HASH PAR_OPEN (type_base (COMMA type_base)* (COMMA)?)? PAR_CLOSE;
function_type: FN (function_parameter_types)? R_ARROW type_base;

type_base: type_hole | tuple_type | function_type | type | type_var;
type_annotation: COLON type_base;
type_argument: type_base;
type_arguments: PAR_OPEN (type_argument (COMMA type_argument)* (COMMA)?)? PAR_CLOSE;
type: (type_identifier | remote_type_identifier) (type_arguments)?;

// FIX ME: Deprecated syntax? use @external(lang, mod, fn)? https://exercism.org/tracks/gleam/concepts/external-functions
//external_function_body: STRING STRING;
//external_function_parameter: (identifier COLON)? type_base;
//external_function_parameters: LEFT_PAREN (external_function_parameter (COMMA external_function_parameter)* (COMMA)?)? RIGHT_PAREN;
//external_function: (visibility_modifier)? EXTERNAL FN identifier external_function_parameters R_ARROW type_base EQ external_function_body;

function_parameter_args: labeled_discard_param | discard_param | labeled_name_param | name_param;
function_parameter: function_parameter_args (type_annotation)?;
function_parameters: PAR_OPEN (function_parameter (COMMA function_parameter)* (COMMA)?)? PAR_CLOSE;
// Gleam: parse.rs/parse_function implementation - body can follow an OPTIONAL left brace, this is not allowed in anon functions
function_body: CURLY_OPEN expression_try_list0 CURLY_CLOSE;
function: (visibility_modifier)? FN identifier function_parameters (R_ARROW type_base)? function_body;

list_pattern_tail: DOT_DOT (identifier | discard)?;
list_pattern: SQUARE_OPEN (pattern (COMMA pattern)* (COMMA)?)? (list_pattern_tail)? SQUARE_CLOSE;

pattern_bit_string_segment: pattern (COLON bit_string_segment_options)?;
pattern_bit_string: LTLT (pattern_bit_string_segment (COMMA pattern_bit_string_segment)* (COMMA)?)? GTGT;

tuple_pattern: HASH PAR_OPEN (pattern (COMMA pattern)* (COMMA)?)? PAR_CLOSE;
pattern_spread: (DOT_DOT (COMMA)?);
record_pattern_argument: (label COLON)? pattern;
record_pattern_arguments: PAR_OPEN (record_pattern_argument (COMMA record_pattern_argument)* (COMMA)?)? (pattern_spread)? PAR_CLOSE;
record_pattern: (constructor_name | remote_constructor_name) (record_pattern_arguments)?;
pattern: (identifier | discard | record_pattern | expression_literal | tuple_pattern | pattern_bit_string | list_pattern) (AS identifier)?;

try: TRY pattern (type_annotation)? EQ expression;
expression_try_list1: (expression | try)+;
expression_try_list0: (expression | try)*;

argument: (label ':')? (hole | expression);
argument_list: PAR_OPEN (argument (COMMA argument)* (COMMA)?)? PAR_CLOSE;
record: (constructor_name | remote_constructor_name) (argument_list)?;

expression_bit_string_segment: expression_unit (COLON bit_string_segment_options)?;
expression_bit_string: LTLT (expression_bit_string_segment (COMMA expression_bit_string_segment)* (COMMA)?)? GTGT;

todo: TODO (PAR_OPEN STRING PAR_CLOSE)?;
tuple: HASH PAR_OPEN (expression (COMMA expression)* (COMMA)?)? PAR_CLOSE;

list_ellipsis: DOT_DOT expression;
list_body: expression (COMMA expression)* COMMA? list_ellipsis?;
list: SQUARE_OPEN list_body? SQUARE_CLOSE;

anonymous_function_parameter_args: discard_param | name_param;
anonymous_function_parameter: anonymous_function_parameter_args (type_annotation)?;
anonymous_function_parameters: PAR_OPEN (anonymous_function_parameter (COMMA anonymous_function_parameter)* (COMMA)?)? PAR_CLOSE;
anonymous_function: FN anonymous_function_parameters (R_ARROW type)? function_body;

expression_group: CURLY_OPEN expression_try_list1 CURLY_CLOSE;

case_clause_tuple_access: identifier DOT integer;
case_clause_guard_unit: identifier | case_clause_tuple_access | CURLY_OPEN case_clause_guard_expression CURLY_CLOSE | constant_value;
case_clause_guard_binary_operator: BARBAR | ANDAND | EQEQ | NEQ | LESS | LESS_EQUAL | LESS_DOT
    | LESS_EQUAL_DOT | GREATER | GREATER_EQUAL | GREATER_DOT | GREATER_EQUAL_DOT;
case_clause_guard_expression
    : case_clause_guard_expression case_clause_guard_binary_operator case_clause_guard_expression
    | case_clause_guard_unit;
case_clause_guard: IF case_clause_guard_expression;
case_clause_pattern: pattern (COMMA pattern)*  (COMMA)?;
case_clause_patterns: case_clause_pattern (BAR case_clause_pattern)* (BAR)?;
case_clause: case_clause_patterns (case_clause_guard)? R_ARROW expression;
case_clauses: (case_clause)+;
case_subjects: expression_try_list1;
case: CASE case_subjects CURLY_OPEN case_clauses CURLY_CLOSE;

use_args: identifier | identifier COMMA use_args;
use: USE (use_args)? L_ARROW expression;

assignment: pattern (type_annotation)? EQ expression;
let: LET assignment;
assert: ASSERT assignment;
negation: BANG expression_unit;

record_update_argument: label COLON expression;
record_update_arguments: record_update_argument (COMMA record_update_argument)* (COMMA)?;
record_update: (constructor_name | remote_constructor_name) PAR_OPEN DOT_DOT expression COMMA record_update_arguments PAR_CLOSE;

call_or_access_options: argument_list | (DOT label) | (DOT integer);
// this deviates from the treesitter spec - it is function_call + field_access + tuple_access all in one rule to avoid indirect left recursion
call_or_access
     : call_or_access   call_or_access_options
     | case             call_or_access_options
     | identifier       call_or_access_options
     | expression_group call_or_access_options
     | record DOT label
     | record_update DOT label
     | tuple DOT integer
     | anonymous_function argument_list
     ;

expression_literal: STRING | FLOAT | integer | boolean;
expression_unit
    : record
    | anonymous_function
    | identifier
    | todo
    | tuple
    | list
    | expression_bit_string
    | expression_group
    | case
    | let
    | use
    | assert
    | negation
    | record_update
    | call_or_access
    | expression_literal
    ;

expression
    : expression_unit #unit
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
    | left=expression BARBAR right=expression #or
    ;

data_constructor_argument: (label COLON)? type_base;
data_constructor_arguments: PAR_OPEN (data_constructor_argument (COMMA data_constructor_argument)* (COMMA)?)? PAR_CLOSE;
data_constructor: constructor_name (data_constructor_arguments)?;
data_constructors: (data_constructor)+;

type_definition: (visibility_modifier)? (opacity_modifier)? TYPE type_name CURLY_OPEN data_constructors CURLY_CLOSE;
type_alias: (visibility_modifier)? (opacity_modifier)? TYPE type_name EQ type;

//func_attribute_arg: STRING | LOWERCASE_IDENT;
//func_attribute_args: func_attribute_arg (COMMA func_attribute_arg)*;
//func_attribute_generic: AT LOWERCASE_IDENT LEFT_BRACE func_attribute_args RIGHT_BRACE;
func_attribute_deprecated: AT 'deprecated' PAR_OPEN STRING? PAR_CLOSE;
func_attribute_external: AT 'external' PAR_OPEN LOWERCASE_IDENT COMMA STRING COMMA STRING PAR_CLOSE;
func_attribute: func_attribute_deprecated | func_attribute_external;
statement
    : imports
    | constant
    | external_type
    | (func_attribute* function)
    | type_definition
    | type_alias
    ;

///// Aliases (maybe not needed by why not have them for now and we can delete later
// any_ident:  LOWERCASE_IDENT | UPPERCASE_IDENT | IGNORED_IDENT;
identifier: LOWERCASE_IDENT;
constructor_name: UPPERCASE_IDENT;
type_identifier: UPPERCASE_IDENT;
discard: IGNORED_IDENT;
label: LOWERCASE_IDENT;
type_parameter: LOWERCASE_IDENT;
type_var: LOWERCASE_IDENT;
type_hole: LOWERCASE_IDENT;
hole: IGNORED_IDENT;
discard_param: discard;
name_param: identifier;
labeled_name_param: label identifier;
labeled_discard_param: label discard;
remote_constructor_name: identifier DOT constructor_name;
remote_type_identifier: identifier DOT type_identifier;
visibility_modifier: PUB;
opacity_modifier: OPAQUE;
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

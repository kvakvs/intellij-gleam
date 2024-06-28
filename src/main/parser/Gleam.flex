package se.clau.gleam.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import se.clau.gleam.lang.parser.GleamParserUtil;import se.clau.gleam.lang.parser.GleamTokenType;
import se.clau.gleam.lang.psi.GleamTypes;

%%

// public instead of package-local to make testing easier.
%public
%class GleamFlexLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

%{
    // While in string state, detected symbols belonging to a string are interpreted and collected here
    StringBuffer stringAccumulator = new StringBuffer();
%}

ANY_CHARACTER = [^]
ANY_WHITESPACE = [ \t\r\n]

// Extra
ALL_TILL_EOL = [^\r\n]*
COMMENT = "//" {ALL_TILL_EOL}
DOC_COMMENT = "///" {ALL_TILL_EOL}
MODULE_COMMENT = "////" {ALL_TILL_EOL}

// Identifiers

LOWERCASE_IDENT     = [a-z_] [_0-9a-z]*
CAPITALIZED_IDENT   = [A-Z] [0-9a-zA-Z]*
IGNORED_IDENT       = '_' [_0-9a-z]*
//IDENT             = LOWERCASE_IDENT | UPPERCASE_IDENT | IGNORED_IDENT

// Lexer: Numbers (integers)
SIGN = [+-]
BIN_DIGIT = [01]
OCT_DIGIT = [0-7]
DEC_DIGIT = [0-9]
HEX_DIGIT = [0-9a-fA-F]

// Lexer: Literals
DEC_INT = {SIGN}? {DEC_DIGIT} ("_"? {DEC_DIGIT}+) *
BIN_INT = {SIGN}? ("0b" | "0B") {BIN_DIGIT} ("_"? {BIN_DIGIT}+) *
HEX_INT = {SIGN}? ("0x" | "0X") {HEX_DIGIT} ("_"? {HEX_DIGIT}+) *
OCT_INT = {SIGN}? ("0o" | "0O") [0-7] ("_"? [0-7]+) *
//INT     = {SIGN}? ({BIN_INT} | {OCT_INT} | {DEC_INT} | {HEX_INT}) // order of ascending base 2, 8, 10, 16

// Lexer: Float
FLOAT1          = {DEC_INT} '.' {DEC_INT}?   // 1.35, 1.35E-9, 0.3, -4.5, +1. 10_000.0
FLOAT2          = '.' {DEC_INT}            // .3, -.4, .0_000_000_1
FLOAT_EXPONENT  = [Ee] {SIGN}? {DEC_INT}
FLOAT           = {SIGN}? ({FLOAT1} | {FLOAT2}) {FLOAT_EXPONENT}?

// Lexer: String
DQUOT           = "\""
ESC_CHAR        = "\\" {ANY_CHARACTER}
// TODO: \u{H+( H+)*} code point from more parts
ESC_CODEPOINT_U = "\\u{" {HEX_DIGIT} "}"
ESC_CODEPOINT_HEX = "\\x" {HEX_DIGIT}{2}
// Newlines allowed
DQUOT_STRING_BODY = [^\\\"]+

%state DQUOT_STRING

%%

<YYINITIAL> {
    "assert"                { return GleamTypes.ASSERT_KEYWORD; }
    "as"                    { return GleamTypes.AS_KEYWORD; }
    "case"                  { return GleamTypes.CASE_KEYWORD; }
    "const"                 { return GleamTypes.CONST_KEYWORD; }
    "fn"                    { return GleamTypes.FN_KEYWORD; }
    "if"                    { return GleamTypes.IF_KEYWORD; }
    "import"                { return GleamTypes.IMPORT_KEYWORD; }
    "let"                   { return GleamTypes.LET_KEYWORD; }
    "opaque"                { return GleamTypes.OPAQUE_KEYWORD; }
    "pub"                   { return GleamTypes.PUB_KEYWORD; }
    "todo"                  { return GleamTypes.TODO_KEYWORD; }
    "try"                   { return GleamTypes.TRY_KEYWORD; }
    "type"                  { return GleamTypes.TYPE_KEYWORD; }
    "use"                   { return GleamTypes.USE_KEYWORD; }
    "True"                  { return GleamTypes.TRUE_ATOM; }
    "False"                 { return GleamTypes.FALSE_ATOM; }
    "Nil"                   { return GleamTypes.NIL_ATOM; }

    ","                     { return GleamTypes.COMMA; }
    "("                     { return GleamTypes.PAR_OPEN; }
    ")"                     { return GleamTypes.PAR_CLOSE; }
    "["                     { return GleamTypes.SQUARE_OPEN; }
    "]"                     { return GleamTypes.SQUARE_CLOSE; }
    "{"                     { return GleamTypes.CURLY_OPEN; }
    "}"                     { return GleamTypes.CURLY_CLOSE; }
    ".."                    { return GleamTypes.DOT_DOT; }
    "."                     { return GleamTypes.DOT; }
    "->"                    { return GleamTypes.R_ARROW; }
    "<-"                    { return GleamTypes.L_ARROW; }
    "@"                     { return GleamTypes.AT; }
    "%"                     { return GleamTypes.PERCENT; }
    "+."                    { return GleamTypes.PLUS_DOT; }
    "-."                    { return GleamTypes.MINUS_DOT; }
    "*."                    { return GleamTypes.STAR_DOT; }
    "/."                    { return GleamTypes.SLASH_DOT; }
    "+"                     { return GleamTypes.PLUS; }
    "-"                     { return GleamTypes.MINUS; }
    "*"                     { return GleamTypes.STAR; }
    "/"                     { return GleamTypes.SLASH; }
    "<."                    { return GleamTypes.LT_DOT; }
    ">."                    { return GleamTypes.GT_DOT; }
    "<=."                   { return GleamTypes.LTEQ_DOT; }
    ">=."                   { return GleamTypes.GTEQ_DOT; }
    "<="                    { return GleamTypes.LTEQ; }
    ">="                    { return GleamTypes.GTEQ; }
    "<>"                    { return GleamTypes.LT_GT; }
    "<<"                    { return GleamTypes.LTLT; }
    ">>"                    { return GleamTypes.GTGT; }
    "<"                     { return GleamTypes.LT; }
    ">"                     { return GleamTypes.GT; }
    ":"                     { return GleamTypes.COLON; }
    "#"                     { return GleamTypes.HASH; }
    "=="                    { return GleamTypes.EQEQ; }
    "!="                    { return GleamTypes.NEQ; }
    "="                     { return GleamTypes.EQ; }
    "!"                     { return GleamTypes.BANG; }
    "|>"                    { return GleamTypes.BAR_GT; }
    "||"                    { return GleamTypes.BARBAR; }
    "|"                     { return GleamTypes.BAR; }
    "&&"                    { return GleamTypes.ANDAND; }

    // Longest match first, then shorter matches
    {MODULE_COMMENT}        { return GleamTypes.MODULE_COMMENT; }
    {DOC_COMMENT}           { return GleamTypes.DOC_COMMENT; }
    // Comments can occur almost anywhere, we remove them in tokenizer
    {COMMENT}               { /* return GleamTypes.COMMENT; */ }

    {LOWERCASE_IDENT}       { return GleamTypes.LOWERCASE_IDENT; }
    {CAPITALIZED_IDENT}     { return GleamTypes.CAPITALIZED_IDENT; }
    {IGNORED_IDENT}         { return GleamTypes.IGNORED_IDENT; }

    {BIN_INT}               { return GleamTypes.BIN_INT; }
    {OCT_INT}               { return GleamTypes.OCT_INT; }
    {DEC_INT}               { return GleamTypes.DEC_INT; }
    {HEX_INT}               { return GleamTypes.HEX_INT; }
    {FLOAT}                 { return GleamTypes.FLOAT; }
    {DQUOT}                 { yybegin(DQUOT_STRING); stringAccumulator.setLength(0); }

    {ANY_WHITESPACE}+       { return TokenType.WHITE_SPACE; }
    // Do not match any here lol, it will consume all
}

// Inside a double quoted "string"
<DQUOT_STRING> {
    // Body of string
    {DQUOT_STRING_BODY}     { stringAccumulator.append(yytext()); }
    // Exit condition
    {DQUOT}                 { yybegin(YYINITIAL); return GleamTokenType.makeString(stringAccumulator.toString()); }
    // \u{xxxx} unicode code points
    {ESC_CODEPOINT_U}       { stringAccumulator.append(GleamParserUtil.interpretUnicodeCodepoint(yytext())); }
    {ESC_CODEPOINT_HEX}     { stringAccumulator.append(GleamParserUtil.interpretHexCodepoint(yytext())); }
    // \escape characters
    {ESC_CHAR}              { stringAccumulator.append(GleamParserUtil.interpretEscSequence(yytext())); } // take one
}
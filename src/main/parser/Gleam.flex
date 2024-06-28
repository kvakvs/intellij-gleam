package se.clau.gleam.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import se.clau.gleam.lang.parser.GleamTokenType;
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
    StringBuffer stringAccumulator = new StringBuffer();
%}

ANY_INPUT = [^]

// Extra
COMMENT = "//" [^\r\n]*
DOC_COMMENT = "///" [^\r\n]*
MODULE_COMMENT = "////" [^\r\n]*

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
DEC_INT = DEC_DIGIT ('_'? DEC_DIGIT+) *
BIN_INT = ('0b' | '0B') BIN_DIGIT ('_'? BIN_DIGIT+) *
HEX_INT = ('0x' | '0X') HEX_DIGIT ('_'? HEX_DIGIT+) *
OCT_INT = ('0o' | '0O') [0-7] ('_'? [0-7]+) *
INT     = SIGN? (BIN_INT | OCT_INT | DEC_INT | HEX_INT) // order of ascending base 2, 8, 10, 16

// Lexer: Float
FLOAT1          = DEC_INT '.' DEC_INT?   // 1.35, 1.35E-9, 0.3, -4.5, +1. 10_000.0
FLOAT2          = '.' DEC_INT            // .3, -.4, .0_000_000_1
FLOAT_EXPONENT  = [Ee] SIGN? DEC_INT
FLOAT           = SIGN? (FLOAT1 | FLOAT2) FLOAT_EXPONENT?

// Lexer: String
BACKSLASH       = "\\"
DQUOT           = "\""
ESC_CHAR        = BACKSLASH [\b\f\n\r\t]
ESC_CODEPOINT   = BACKSLASH "u" CURLY_OPEN HEX_DIGIT+ CURLY_CLOSE
//DQUOT_STRING_BODY = ( ESC_CHAR | ESC_CODEPOINT | [^\\] )*
DQUOT_STRING_BODY = [^\"\\]+

WHITESPACE = [ \t\n\r]+
//ERRCHAR
//    :	.	-> channel(HIDDEN)

%state DQUOT_STRING

%%

<YYINITIAL> {
    ","                     { return GleamTypes.COMMA; }
    "("                     { return GleamTypes.PAR_OPEN; }
    ")"                     { return GleamTypes.PAR_CLOSE; }
    "["                     { return GleamTypes.SQUARE_OPEN; }
    "]"                     { return GleamTypes.SQUARE_CLOSE; }
    "{"                     { return GleamTypes.CURLY_OPEN; }
    "}"                     { return GleamTypes.CURLY_CLOSE; }
    "."                     { return GleamTypes.DOT; }
    ".."                    { return GleamTypes.DOT_DOT; }

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
    "|>"                    { return GleamTypes.PIPE; }
    "||"                    { return GleamTypes.BARBAR; }
    "|"                     { return GleamTypes.BAR; }
    "&&"                    { return GleamTypes.ANDAND; }
    "."                     { return GleamTypes.DOT; }
    ".."                    { return GleamTypes.DOT_DOT; }

    {COMMENT}               { return GleamTypes.COMMENT; }
    {DOC_COMMENT}           { return GleamTypes.COMMENT; }
    {MODULE_COMMENT}        { return GleamTypes.COMMENT; }

    {LOWERCASE_IDENT}       { return GleamTypes.LOWERCASE_IDENT; }
    {CAPITALIZED_IDENT}     { return GleamTypes.CAPITALIZED_IDENT; }
    {IGNORED_IDENT}         { return GleamTypes.IGNORED_IDENT; }

    {DQUOT}                 { yybegin(DQUOT_STRING);
                              stringAccumulator.setLength(0); }

    {WHITESPACE}            { /* return TokenType.WHITE_SPACE; */ }
    {ANY_INPUT}             { /* return TokenType.BAD_CHARACTER; */ }
}

// Inside a double quoted "string"
<DQUOT_STRING> {
    // Exit condition
    {DQUOT}                 { yybegin(YYINITIAL); return GleamTokenType.makeString(stringAccumulator.toString()); }
    // Body of string
    {DQUOT_STRING_BODY}     { stringAccumulator.append(yytext()); }
    // TODO: \escape chars, \u{xxxx} unicode code points
}
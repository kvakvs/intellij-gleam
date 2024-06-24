package se.clau.gleam.ide.highlight

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import GleamLexer
import se.clau.gleam.ide.colors.GleamColor
import se.clau.gleam.lang.GleamLanguage

class GleamHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = ANTLRLexerAdaptor(GleamLanguage, GleamLexer(null))

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> =
        pack(map(tokenType)?.textAttributesKey)

}

fun map(tokenType: IElementType?): GleamColor? {
    if (tokenType !is TokenIElementType) return null
    return when (tokenType.antlrTokenType) {
        GleamLexer.COMMENT -> GleamColor.COMMENT
        GleamLexer.DOC_COMMENT -> GleamColor.DOC_COMMENT
        GleamLexer.MODULE_COMMENT -> GleamColor.MODULE_COMMENT

        GleamLexer.AS, GleamLexer.ASSERT, GleamLexer.CASE, GleamLexer.CONST,
        GleamLexer.EXTERNAL, GleamLexer.FN, GleamLexer.IF, GleamLexer.IMPORT,
        GleamLexer.LET, GleamLexer.OPAQUE, GleamLexer.PUB, GleamLexer.TODO,
        GleamLexer.TRY, GleamLexer.TYPE, GleamLexer.USE -> GleamColor.KEYWORD

        GleamLexer.STRING -> GleamColor.STRING
        GleamLexer.DEC_INT, GleamLexer.BIN_INT, GleamLexer.OCT_INT, GleamLexer.HEX_INT -> GleamColor.NUMBER
        GleamLexer.FLOAT -> GleamColor.FLOAT
        GleamLexer.TRUE, GleamLexer.FALSE -> GleamColor.BOOLEAN

        GleamLexer.LEFT_BRACE, GleamLexer.RIGHT_BRACE -> GleamColor.BRACES
        GleamLexer.LEFT_PAREN, GleamLexer.RIGHT_PAREN -> GleamColor.PARENTHESES

        GleamLexer.EQUAL, GleamLexer.EQUAL_EQUAL, GleamLexer.NOT_EQUAL,
        GleamLexer.GREATER, GleamLexer.GREATER_EQUAL, GleamLexer.GREATER_EQUAL_DOT,
        GleamLexer.GREATER_DOT, GleamLexer.LESS, GleamLexer.LESS_EQUAL,
        GleamLexer.LESS_EQUAL_DOT, GleamLexer.LESS_DOT,
        GleamLexer.L_ARROW, GleamLexer.R_ARROW -> GleamColor.OPERATION_SIGN

        GleamLexer.IGNORED_IDENT -> GleamColor.DISCARDED_VARIABLE

        else -> null
    }
}
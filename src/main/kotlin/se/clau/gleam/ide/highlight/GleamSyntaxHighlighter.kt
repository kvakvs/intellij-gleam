package se.clau.gleam.ide.highlight

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import se.clau.gleam.ide.colors.GleamColor
import se.clau.gleam.lang.parser.GleamLexerAdapter
import se.clau.gleam.lang.psi.GleamTypes

class GleamSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = GleamLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType): Array<out TextAttributesKey> {
        return when (tokenType) {
            TokenType.BAD_CHARACTER -> TextAttrKeys.BAD_CHAR_KEYS
            GleamTypes.COMMENT -> TextAttrKeys.COMMENT_KEYS
            else -> TextAttrKeys.EMPTY_KEYS
        }
    }

    object TextAttrKeys {
        val BAD_CHAR_KEYS = arrayOf(GleamColor.BAD_CHARACTER.textAttributesKey)

        //private val SEPARATOR_KEYS = arrayOf(SEPARATOR)
//private val KEY_KEYS = arrayOf(KEY)
//private val VALUE_KEYS: Array<TextAttributesKey> = arrayOf<TextAttributesKey>(VALUE)
        val COMMENT_KEYS = arrayOf(GleamColor.COMMENT.textAttributesKey)
        val EMPTY_KEYS: Array<TextAttributesKey> = emptyArray()
    }
}

//fun map(tokenType: IElementType?): GleamColor? {
//    if (tokenType !is TokenIElementType) return null
//    return when (tokenType.antlrTokenType) {
//        GleamLexer.COMMENT -> GleamColor.COMMENT
//
//        GleamLexer.DOC_COMMENT -> GleamColor.DOC_COMMENT
//
//        GleamLexer.MODULE_COMMENT -> GleamColor.MODULE_COMMENT
//
//        GleamLexer.AS, GleamLexer.ASSERT, GleamLexer.CASE, GleamLexer.CONST,
//        GleamLexer.FN, GleamLexer.IF, GleamLexer.IMPORT,
//        GleamLexer.LET, GleamLexer.OPAQUE, GleamLexer.PUB, GleamLexer.TODO,
//        GleamLexer.TRY, GleamLexer.TYPE, GleamLexer.USE -> GleamColor.KEYWORD
//
//        GleamLexer.STRING -> GleamColor.STRING
//
//        GleamLexer.INT -> GleamColor.NUMBER
//
//        GleamLexer.FLOAT -> GleamColor.FLOAT
//
//        GleamLexer.TRUE, GleamLexer.FALSE -> GleamColor.BOOLEAN
//
//        GleamLexer.CURLY_OPEN, GleamLexer.CURLY_CLOSE -> GleamColor.BRACES
//
//        GleamLexer.PAR_OPEN, GleamLexer.PAR_CLOSE -> GleamColor.PARENTHESES
//
//        GleamLexer.EQ, GleamLexer.EQEQ, GleamLexer.NEQ,
//        GleamLexer.GREATER, GleamLexer.GREATER_EQUAL, GleamLexer.GREATER_EQUAL_DOT,
//        GleamLexer.GREATER_DOT, GleamLexer.LESS, GleamLexer.LESS_EQUAL,
//        GleamLexer.LESS_EQUAL_DOT, GleamLexer.LESS_DOT,
//        GleamLexer.L_ARROW, GleamLexer.R_ARROW -> GleamColor.OPERATION_SIGN
//
//        GleamLexer.IGNORED_IDENT -> GleamColor.DISCARDED_VARIABLE
//
//        else -> null
//    }
//}

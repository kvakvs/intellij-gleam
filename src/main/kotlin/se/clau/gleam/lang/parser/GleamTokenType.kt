package se.clau.gleam.lang.parser

import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import se.clau.gleam.lang.GleamLanguage

class GleamStringToken(content: String): GleamTokenType(content)

/**
 * Additional tokens, used in the lexer
 */
open class GleamTokenType(@NonNls debugName: String) :
    IElementType(debugName, GleamLanguage) {
    companion object {
        //used from TokenType library class: val BAD_CHARACTER: IElementType = GleamPremadeTokenTypes("BAD_CHARACTER")
        //generated val COMMENT: IElementType = GleamTokenType("comment // /// or ////")
        @JvmStatic
        fun makeString(content: String): IElementType = GleamStringToken(content)
    }
}
package se.clau.gleam.lang.parser

import com.intellij.psi.tree.TokenSet
import se.clau.gleam.lang.psi.GleamTypes


class GleamTokenSets {
    companion object {
        val IDENTIFIERS: TokenSet = TokenSet.create(GleamTypes.IDENTIFIER)
        val COMMENTS: TokenSet = TokenSet.create(GleamTypes.COMMENT)
    }
}
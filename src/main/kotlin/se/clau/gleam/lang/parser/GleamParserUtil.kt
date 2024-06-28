package se.clau.gleam.lang.parser

import com.intellij.lang.parser.GeneratedParserUtilBase
import com.intellij.lang.*
import com.intellij.psi.tree.*

object GleamParserUtil : GeneratedParserUtilBase() {
    private fun parseLineTokens(builder: PsiBuilder, tokens: Set<IElementType>): Boolean {
        // accept everything till the end of line
        var hasAny = false
        do {
            if (builder.tokenType in tokens || builder.tokenType == null) return hasAny
            builder.advanceLexer()
            hasAny = true
        } while (true)
    }

    @JvmStatic
    fun interpretEscSequence(seq: CharSequence): CharSequence {
        return when (seq) {
            "\\n" -> "\n"
            "\\r" -> "\r"
            "\\t" -> "\t"
            "\\\"" -> "\""
            "\\\'" -> "\'"
            else -> seq
        }
    }

    // Given a \x{####} code point take ## and interpret as hexadecimal unicode codepoint
    @JvmStatic
    fun interpretUnicodeCodepoint(seq: CharSequence): CharSequence {
        return seq.subSequence(3, seq.length - 1).toString().toInt(16).toChar().toString()
    }

    // Given a \x## code point take ## and interpret as hexadecimal character code
    @JvmStatic
    fun interpretHexCodepoint(seq: CharSequence): CharSequence {
        return seq.subSequence(2, seq.length).toString().toInt(16).toChar().toString()
    }
}
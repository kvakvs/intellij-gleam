package se.clau.gleam.lang

import com.intellij.lang.Language

object GleamLanguage : Language("Gleam") {
    private fun readResolve(): Any = GleamLanguage
    override fun getDisplayName() = "Gleam"
}
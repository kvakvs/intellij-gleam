package se.clau.gleam.lang

import com.intellij.openapi.fileTypes.LanguageFileType
import se.clau.gleam.ide.icons.GleamIcons
import javax.swing.Icon

object GleamFileType : LanguageFileType(GleamLanguage) {
    override fun getName(): String = "Gleam"

    override fun getDescription(): String = "Gleam source file"

    override fun getDefaultExtension(): String = "gleam"

    override fun getIcon(): Icon = GleamIcons.GLEAM
}
package se.clau.gleam.ide.icons

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object GleamIcons {
    val GLEAM_16x16 = load("/icons/gleam.svg")

    private fun load(path: String): Icon = IconLoader.getIcon(path, GleamIcons::class.java)
}
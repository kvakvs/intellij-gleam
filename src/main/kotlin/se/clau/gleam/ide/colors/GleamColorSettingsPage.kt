package se.clau.gleam.ide.colors

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import com.intellij.openapi.util.io.StreamUtil
import se.clau.gleam.GleamBundle
import se.clau.gleam.ide.highlight.GleamHighlighter
//import se.clau.gleam.ide.highlight.GleamHighlighter
import se.clau.gleam.ide.icons.GleamIcons

class GleamColorSettingsPage : ColorSettingsPage {
    override fun getDisplayName() = GleamBundle.message("settings.gleam.color.scheme.title")
    override fun getIcon() = GleamIcons.GLEAM_16x16
    override fun getAttributeDescriptors() = ATTRS
    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY
    override fun getHighlighter() = GleamHighlighter()
    override fun getAdditionalHighlightingTagToDescriptorMap() = ANNOTATOR_TAGS
    override fun getDemoText() = DEMO_TEXT

}

private val ATTRS: Array<AttributesDescriptor> = GleamColor.entries.map { it.attributesDescriptor }.toTypedArray()
private val ANNOTATOR_TAGS: Map<String, TextAttributesKey> =
    GleamColor.entries.associateBy({ it.name }, { it.textAttributesKey })
private val DEMO_TEXT: String by lazy {
    val stream = GleamColorSettingsPage::class.java.classLoader
        .getResourceAsStream("run/gleam/ide/colors/highlighterDemoText.gleam")
    val reader = stream?.bufferedReader()
    val text = reader?.readText() ?: ""
    StreamUtil.convertSeparators(text)
}
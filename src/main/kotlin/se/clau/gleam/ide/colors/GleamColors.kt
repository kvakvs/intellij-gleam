package se.clau.gleam.ide.colors

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.util.NlsContexts.AttributeDescriptor
import se.clau.gleam.GleamBundle
import java.util.function.Supplier
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Default

enum class GleamColor(humanName: Supplier<@AttributeDescriptor String>, default: TextAttributesKey? = null) {
    COMMENT(GleamBundle.messagePointer("settings.gleam.color.comment.normal"), Default.LINE_COMMENT),
    DOC_COMMENT(GleamBundle.messagePointer("settings.gleam.color.comment.doc"), Default.DOC_COMMENT),
    MODULE_COMMENT(GleamBundle.messagePointer("settings.gleam.color.comment.mod_doc"), Default.LINE_COMMENT),

    KEYWORD(GleamBundle.messagePointer("settings.gleam.color.keyword"), Default.KEYWORD),

    STRING(GleamBundle.messagePointer("settings.gleam.color.string"), Default.STRING),
    NUMBER(GleamBundle.messagePointer("settings.gleam.color.number"), Default.NUMBER),
    FLOAT(GleamBundle.messagePointer("settings.gleam.color.float"), Default.NUMBER),
    BOOLEAN(GleamBundle.messagePointer("settings.gleam.color.boolean"), Default.KEYWORD),

    BRACES(GleamBundle.messagePointer("settings.gleam.color.brace"), Default.BRACES),
    PARENTHESES(GleamBundle.messagePointer("settings.gleam.color.paren"), Default.PARENTHESES),

    LOCAL_VARIABLE(GleamBundle.messagePointer("settings.gleam.color.variable.local"), Default.LOCAL_VARIABLE),
    DISCARDED_VARIABLE(GleamBundle.messagePointer("settings.gleam.color.variable.discard"), Default.LINE_COMMENT),

    FUNCTION_DECLARATION(GleamBundle.messagePointer("settings.gleam.color.function"), Default.FUNCTION_DECLARATION),
    FUNCTION_PARAM(GleamBundle.messagePointer("settings.gleam.color.function.param"), Default.PARAMETER),
    FUNCTION_PARAM_LABEL(GleamBundle.messagePointer("settings.gleam.color.function.param.label"), Default.DOC_COMMENT),

    TYPE_IDENTIFIER(GleamBundle.messagePointer("settings.gleam.color.type_identifier"), Default.CLASS_REFERENCE),

    OPERATION_SIGN(GleamBundle.messagePointer("settings.gleam.color.operation_sign"), Default.OPERATION_SIGN)
    ;

    val textAttributesKey = TextAttributesKey.createTextAttributesKey("run.gleam.$name", default)
    val attributesDescriptor = AttributesDescriptor(humanName, textAttributesKey)
//    val testSeverity: HighlightSeverity = HighlightSeverity(name, HighlightSeverity.INFORMATION.myVal)
}
package se.clau.gleam.ide.highlight

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.ExternalAnnotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import org.antlr.intellij.adaptor.xpath.XPath
import se.clau.gleam.ide.colors.GleamColor
import se.clau.gleam.lang.GleamLanguage


class GleamAnnotator : ExternalAnnotator<PsiFile, List<GleamAnnotator.IAnnotation>>() {
    interface IAnnotation {
        fun annotate(holder: AnnotationHolder)
    }


    override fun collectInformation(file: PsiFile): PsiFile {
        return file
    }

    override fun collectInformation(file: PsiFile, editor: Editor, hasErrors: Boolean): PsiFile {
        return file
    }

    fun findAndMark(root: PsiElement, xpath: String, annotations: MutableList<IAnnotation>, color: GleamColor) {
        XPath.findAll(GleamLanguage, root, xpath)
            .forEach { annotations.add(ColorAnnotation(it.textRange, color)) }
    }

    override fun doAnnotate(file: PsiFile): List<IAnnotation> {
        val annotations: MutableList<IAnnotation> = ArrayList()

        // Local Variables
        findAndMark(file, "//function//assignment/pattern/identifier", annotations, GleamColor.LOCAL_VARIABLE)

        // Find all functions...
        val funcs = XPath.findAll(GleamLanguage, file, "//function")
        val extfuncs = XPath.findAll(GleamLanguage, file, "//external_function")

        (funcs + extfuncs).forEach { func ->
            // Labeled function parameters
            findAndMark(
                func,
                "/function/function_parameters//label",
                annotations,
                GleamColor.FUNCTION_PARAM_LABEL
            )
            findAndMark(
                func,
                "/function//labeled_discard_param/label",
                annotations,
                GleamColor.FUNCTION_PARAM_LABEL
            )
            findAndMark(func, "/function/identifier", annotations, GleamColor.FUNCTION_DECLARATION)
            findAndMark(func, "/function/function_parameters//identifier", annotations, GleamColor.FUNCTION_PARAM)
        }

        // Type Identifiers
        findAndMark(file, "//type_identifier", annotations, GleamColor.TYPE_IDENTIFIER)

        // Constructors
        XPath.findAll(GleamLanguage, file, "//record").forEach { record ->
            findAndMark(record, "//constructor_name", annotations, GleamColor.TYPE_IDENTIFIER)
            findAndMark(record, "//argument/label", annotations, GleamColor.FUNCTION_PARAM)
        }

        // TODO error when function call on function not defined in file

        return annotations
    }

    override fun apply(file: PsiFile, annotationResult: List<IAnnotation>, holder: AnnotationHolder) {
        for (annotation in annotationResult) {
            annotation.annotate(holder)
        }
    }
}

class ColorAnnotation(private val range: TextRange, private val color: GleamColor) : GleamAnnotator.IAnnotation {
    override fun annotate(holder: AnnotationHolder) {
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
            .range(range)
            .textAttributes(color.textAttributesKey)
            .create()
    }

}
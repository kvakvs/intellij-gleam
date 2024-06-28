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

    fun mark(root: PsiElement, xpath: String, annotations: MutableList<IAnnotation>, color: GleamColor) {
        //XPath.findAll(GleamLanguage, root, xpath)
        //    .forEach { annotations.add(ColorAnnotation(it.textRange, color)) }
    }

    override fun doAnnotate(file: PsiFile): List<IAnnotation> {
        return emptyList()
        //val annotations: MutableList<IAnnotation> = ArrayList()
        //
        //// Local Variables
        //mark(file, "//function//assignment/pattern/identifier", annotations, GleamColor.LOCAL_VARIABLE)
        //
        //// Find all functions...
        //XPath.findAll(GleamLanguage, file, "//function")
        //    .forEach { func ->
        //        // Labeled function parameters
        //        mark(func, "/function//funcParameters//label", annotations, GleamColor.FUNCTION_PARAM_LABEL)
        //        //mark(func, "/function//labeledDiscardParam/label", annotations, GleamColor.FUNCTION_PARAM_LABEL)
        //        mark(func, "/identifier", annotations, GleamColor.FUNCTION_DECLARATION)
        //        mark(func, "//funcParameters//identifier", annotations, GleamColor.FUNCTION_PARAM)
        //        mark(func, "//funcBody//identifier", annotations, GleamColor.LOCAL_VARIABLE) // too broad
        //    }
        //
        //// Type Identifiers
        //mark(file, "//typeIdentifier", annotations, GleamColor.TYPE_IDENTIFIER)
        //
        //// Constructors
        //XPath.findAll(GleamLanguage, file, "//record")
        //    .forEach { record ->
        //        mark(record, "//ctorName", annotations, GleamColor.TYPE_IDENTIFIER)
        //        mark(record, "//recordArgument/label", annotations, GleamColor.FUNCTION_PARAM)
        //    }
        //
        //// TODO error when function call on function not defined in file
        //
        //return annotations
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
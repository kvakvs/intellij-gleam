package se.clau.gleam.ide

import com.intellij.lang.ASTNode
import com.intellij.lang.folding.FoldingBuilderEx
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.editor.Document
import com.intellij.psi.PsiElement


class GleamFoldingBuilder : FoldingBuilderEx() {
    override fun buildFoldRegions(root: PsiElement, document: Document, quick: Boolean): Array<FoldingDescriptor> {
        return emptyArray()
        //val group = FoldingGroup.newGroup(FOLDING_GROUP_FUNCTIONS)
        //return XPath.findAll(GleamLanguage, root, "//function//funcBody")
        //    .filter { it.textLength > 0 }
        //    .map { FoldingDescriptor(it.node, it.textRange, group) }
        //    .toTypedArray()
    }

    override fun getPlaceholderText(node: ASTNode): String {
        return node.firstChildNode.text + "..." + node.lastChildNode.text
    }

    override fun isCollapsedByDefault(node: ASTNode): Boolean {
        return false
    }

    companion object {
        const val FOLDING_GROUP_FUNCTIONS = "foldingbuilder.functions"
    }
}
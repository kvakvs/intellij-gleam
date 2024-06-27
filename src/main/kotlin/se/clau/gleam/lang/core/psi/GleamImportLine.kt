package se.clau.gleam.lang.core.psi

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement

interface GleamImportLine : PsiElement {
    class ImportLine(node: ASTNode) : GleamPsiNode(node), GleamImportLine

    companion object {
        fun fromAst(node: ASTNode): GleamImportLine {
            return ImportLine(node)
        }
    }
}

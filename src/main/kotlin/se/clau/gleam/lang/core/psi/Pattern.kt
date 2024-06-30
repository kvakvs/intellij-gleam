package se.clau.gleam.lang.core.psi

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement

class Pattern(node: ASTNode) : GleamPsiNode(node) {
    companion object {
        fun fromAst(node: ASTNode): PsiElement {
            return Pattern(node)
        }
    }
}

package se.clau.gleam.lang.core.psi

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement

interface GleamExpression : PsiElement {
    class Expression(node: ASTNode) : GleamPsiNode(node), GleamExpression

    companion object {
        fun fromAst(node: ASTNode): PsiElement {
            return Expression(node)
        }
    }
}

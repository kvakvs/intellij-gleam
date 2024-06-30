package se.clau.gleam.lang.core.psi

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.util.containers.stream

/**
 * Represents a function definition with name, arguments, return type, also which is possibly prefixed by
 * some attributes. Related stuff is reachable dynamically through queries.
 */
class Func(node: ASTNode) : GleamPsiNode(node) {
    val funcName: String get() = ""
    val funcReturnType: PsiElement?
        get() = this.children.stream()
            .filter { astNode -> GleamPsiPredicate.isType(astNode) }
            .findFirst()
            .orElse(null)
    val funcArgs: List<PsiElement>
        get() {
            val paramsNode = this.children.stream()
                .filter(GleamPsiPredicate::isFuncParameters)
                .findFirst().orElse(null)
            if (paramsNode == null) {
                return emptyList()
            }
            return paramsNode.children.filter(GleamPsiPredicate::isFuncParameter).toList()
        }

    val funcAttrs: List<ASTNode> get() = emptyList()
}

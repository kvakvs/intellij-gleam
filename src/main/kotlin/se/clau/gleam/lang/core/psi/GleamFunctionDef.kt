package se.clau.gleam.lang.core.psi

import GleamParser
import com.intellij.lang.ASTNode
import com.intellij.lang.tree.util.siblings
import com.intellij.psi.PsiElement
import com.intellij.util.containers.stream

/**
 * Represents a function definition with name, arguments, return type, also which is possibly prefixed by some attributes
 */
interface GleamFunctionDef : PsiElement {
    class FunctionDef(
        node: ASTNode,
        val funcName: String,
        val funcReturnType: ASTNode?,
        val funcArgs: List<ASTNode>,
        val funcAttrs: List<ASTNode>
    ) : GleamPsiNode(node),
        GleamFunctionDef

    companion object {
        fun fromAst(node: ASTNode): GleamFunctionDef {
            val children = node.getChildren(null)
            val funcName = children.stream().filter(GleamPsiBuilder::isIdentifier).findFirst().toString()
            val funcReturnType = children.stream().filter { astNode ->
                GleamPsiBuilder.isType(astNode) && GleamPsiBuilder.isToken(
                    astNode.treePrev,
                    GleamParser.R_ARROW
                )
            }.findFirst().orElse(null)
            val funcArgs = children.stream().filter(GleamPsiBuilder::isPattern).toList()
            val funcAttrs = node.siblings(forward = false, withSelf = false)
                .toList().stream()
                .filter(GleamPsiBuilder::isFunctionAttr)
                .toList()
            // Find and go into 'funcParameters' in children
            return FunctionDef(node, funcName, funcReturnType, funcArgs, funcAttrs)
        }
    }
}

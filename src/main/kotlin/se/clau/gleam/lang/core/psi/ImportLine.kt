package se.clau.gleam.lang.core.psi

import com.intellij.lang.ASTNode

class ImportLine(node: ASTNode) : GleamPsiNode(node) {

    companion object {
        fun fromAst(node: ASTNode): ImportLine {
            return ImportLine(node)
        }
    }
}

package se.clau.gleam.lang.core.psi

import GleamParser
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.PsiErrorElementImpl
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

class GleamPsiErrorElement(s: String) : PsiErrorElementImpl(s)
open class GleamPsiNode(node: ASTNode) : ANTLRPsiNode(node) {
    val antlrRule: Int = GleamPsiBuilder.getAntlrRule(node)
}

/**
 * Takes AST created by the ANTLR generated parser, and turns it into something we can work with.
 */
class GleamPsiBuilder {
    companion object {
        /**
         * Creates a new PsiElement based on the given ASTNode.
         */
        fun from(node: ASTNode): PsiElement {
            return when (val elType = node.elementType) {
                is TokenIElementType -> {
                    // Raw tokens should not be present in the final PSI tree and create an PSI error
                    GleamPsiErrorElement("Unexpected TOKEN type: $elType")
                }

                is RuleIElementType -> {
                    fromRule(node, elType)
                }

                else -> GleamPsiErrorElement("Unexpected AST element: $elType")
            } // ?: GleamPsiErrorElement("Error constructing PSI from AST: ${node.text}")
        }

        private fun fromRule(node: ASTNode, elType: RuleIElementType): PsiElement {
            //println("Constructing PSI element for node: $node")
            return when (elType.ruleIndex) {
                // Known ghost nodes serve as containers but do not create PSI
                GleamParser.RULE_importLine -> ImportLine.fromAst(node)
                GleamParser.RULE_function -> Func(node)
                // funcAttr wraps all other funcAttr* types, do not construct here: GleamParser.RULE_funcAttr -> GleamFunctionAttr.fromAst(node)
                GleamParser.RULE_funcAttrExternal -> FuncAttr(node)
                GleamParser.RULE_funcAttrDeprecated -> FuncAttr(node)
                GleamParser.RULE_expression -> Expression.fromAst(node)
                GleamParser.RULE_pattern -> Pattern.fromAst(node)


                else -> GleamPsiNode(node)
            }
        }

        fun getAntlrRule(node: ASTNode): Int {
            return when (val elementType = node.elementType) {
                is RuleIElementType -> elementType.ruleIndex
                else -> -1
            }
        }
    }
}
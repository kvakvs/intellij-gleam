package se.clau.gleam.lang.psi

import com.intellij.lang.ASTNode
import com.intellij.psi.impl.source.tree.PsiErrorElementImpl
import org.antlr.intellij.adaptor.psi.ANTLRPsiLeafNode
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

// All unknown leaf nodes are created as this generic node, they are leaf nodes without going deeper
class GleamPsiLeafNode(node: ASTNode) : ANTLRPsiLeafNode(node.elementType, node.text)
class GleamPsiTokenLeaf(node: ASTNode, val token: Int) : ANTLRPsiLeafNode(node.elementType, node.text)

// All known container nodes are created as this generic Composite node
open class GleamPsiNode(node: ASTNode) : ANTLRPsiNode(node)

class GleamPsiErrorElement(s: String) : PsiErrorElementImpl(s)

/**
 * Takes AST created by the ANTLR generated parser, and turns it into something we can work with.
 */
class GleamPsiBuilder {
    companion object {
        /**
         * Creates a new PsiElement based on the given ASTNode.
         */
        //fun from(node: ASTNode): PsiElement {
        //    return when (val elType = node.elementType) {
        //        is TokenIElementType -> {
        //            // Raw tokens should not be present in the final PSI tree and create an PSI error
        //            // GleamPsiErrorElement("Unexpected TOKEN type: $elType")
        //            fromToken(node, elType)
        //        }
        //
        //        is RuleIElementType -> {
        //            fromRule(node, elType)
        //        }
        //
        //        else -> GleamPsiErrorElement("Unexpected AST element: $elType")
        //    } // ?: GleamPsiErrorElement("Error constructing PSI from AST: ${node.text}")
        //}

        //    // NOTE: This is never called for some reason, AST doesn't contain token nodes?
        //    private fun fromToken(node: ASTNode, elType: TokenIElementType): PsiElement {
        //        println("Constructing PSI for ($elType) $node")
        //        return when (val tok = elType.antlrTokenType) {
        //            // GleamParser.PIPE -> GleamPsiToken(...
        //            else -> GleamPsiTokenLeaf(node, tok)
        //        }
        //    }
        //
        //    private fun fromRule(node: ASTNode, elType: RuleIElementType): PsiElement {
        //        //println("Constructing PSI for ($elType): $node")
        //        return when (elType.ruleIndex) {
        //            // Known ghost nodes serve as containers but do not create PSI
        //            GleamParser.RULE_importLine -> GleamImportLine.fromAst(node)
        //            GleamParser.RULE_function -> GleamFunctionDef.fromAst(node)
        //            // funcAttr wraps all other funcAttr* types, do not construct here: GleamParser.RULE_funcAttr -> GleamFunctionAttr.fromAst(node)
        //            GleamParser.RULE_funcAttrExternal -> GleamFunctionAttr.fromAst(node)
        //            GleamParser.RULE_funcAttrDeprecated -> GleamFunctionAttr.fromAst(node)
        //            GleamParser.RULE_expression -> GleamExpression.fromAst(node)
        //            GleamParser.RULE_pattern -> GleamPattern.fromAst(node)
        //
        //
        //            else -> GleamPsiNode(node)
        //        }
        //    }
        //
        //    /**
        //     * Predicate for filtering node.getChildren(null) for expressions
        //     */
        //    fun isExpression(child: ASTNode): Boolean = when (val elType = child.elementType) {
        //        is RuleIElementType -> elType.ruleIndex == GleamParser.RULE_expression
        //        else -> false
        //    }
        //
        //    /**
        //     * Predicate for filtering node.getChildren(null) for patterns (expressions suitable for function args and matching)
        //     */
        //    fun isPattern(child: ASTNode): Boolean = when (val elType = child.elementType) {
        //        is RuleIElementType -> elType.ruleIndex == GleamParser.RULE_pattern
        //        else -> false
        //    }
        //
        //    /**
        //     * Predicate for filtering node.getChildren(null) for identifier names
        //     */
        //    fun isIdentifier(child: ASTNode): Boolean = when (val elType = child.elementType) {
        //        is RuleIElementType -> elType.ruleIndex == GleamParser.RULE_identifier
        //        else -> false
        //    }
        //
        //    /**
        //     * Predicate for filtering node.getChildren(null) for types
        //     */
        //    fun isType(child: ASTNode): Boolean = when (val elType = child.elementType) {
        //        is RuleIElementType -> elType.ruleIndex == GleamParser.RULE_typeBase
        //        else -> false
        //    }
        //
        //    /**
        //     * Predicate for filtering node.getChildren(null) for function attrs
        //     */
        //    fun isFunctionAttr(child: ASTNode): Boolean = when (val elType = child.elementType) {
        //        is RuleIElementType -> GleamFunctionAttr.isFunctionAttrRuleType(elType.ruleIndex)
        //        else -> false
        //    }
        //
        //    /**
        //     * Predicate for ASTNode to be a specific token
        //     */
        //    fun isToken(node: ASTNode?, tok: Int): Boolean = when (val elType = node?.elementType) {
        //        is TokenIElementType -> elType.antlrTokenType == tok
        //        else -> false
        //    }
    }

}
package se.clau.gleam.lang.core.psi

import GleamParser
import com.intellij.lang.ASTNode
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.lexer.TokenIElementType

/**
 * Predicate helpers for filtering AST stuff. For PSI filtering use [GleamPsiPredicate]
 */
interface GleamASTPredicate {
    companion object {
        /**
         * Predicate for filtering node.getChildren(null) for expressions
         */
        fun isExpression(child: ASTNode): Boolean = when (val elType = child.elementType) {
            is RuleIElementType -> elType.ruleIndex == GleamParser.RULE_expression
            else -> false
        }

        /**
         * Predicate for filtering node.getChildren(null) for patterns (expressions suitable for function args and matching)
         */
        fun isPattern(child: ASTNode): Boolean = when (val elType = child.elementType) {
            is RuleIElementType -> elType.ruleIndex == GleamParser.RULE_pattern
            else -> false
        }

        /**
         * Predicate for filtering node.getChildren(null) for identifier names
         */
        fun isIdentifier(child: ASTNode): Boolean = when (val elType = child.elementType) {
            is RuleIElementType -> elType.ruleIndex == GleamParser.RULE_identifier
            else -> false
        }

        /**
         * Predicate for filtering node.getChildren(null) for types
         */
        fun isType(child: ASTNode): Boolean = when (val elType = child.elementType) {
            is RuleIElementType -> elType.ruleIndex == GleamParser.RULE_typeBase
            else -> false
        }

        /**
         * Predicate for filtering node.getChildren(null) for function attrs
         */
        fun isFunctionAttr(child: ASTNode): Boolean = when (val elType = child.elementType) {
            is RuleIElementType -> FuncAttr.isFunctionAttrRuleType(elType.ruleIndex)
            else -> false
        }

        /**
         * Predicate for ASTNode to be a specific token
         */
        fun isToken(node: ASTNode?, tok: Int): Boolean = when (val elType = node?.elementType) {
            is TokenIElementType -> elType.antlrTokenType == tok
            else -> false
        }
    }

}
package se.clau.gleam.lang.core.psi

import GleamParser
import com.intellij.psi.PsiElement

/**
 * Predicate helpers for filtering PSI stuff. For AST filtering use [GleamASTPredicate]
 */
interface GleamPsiPredicate {
    companion object {
        // Predicate for filtering expression nodes
        fun isExpression(node: PsiElement): Boolean = (node as GleamPsiNode).antlrRule == GleamParser.RULE_expression

        // Predicate for filtering type literals
        fun isType(node: PsiElement): Boolean = (node as GleamPsiNode).antlrRule == GleamParser.RULE_type

        // Predicate for filtering identifiers
        fun isIdentifier(node: PsiElement): Boolean = (node as GleamPsiNode).antlrRule == GleamParser.RULE_identifier

        // Predicate for filtering function parameter group (contains funcParameter)
        fun isFuncParameters(node: PsiElement): Boolean =
            (node as GleamPsiNode).antlrRule == GleamParser.RULE_funcParameters

        // Predicate for filtering individual function parameters
        fun isFuncParameter(node: PsiElement): Boolean =
            (node as GleamPsiNode).antlrRule == GleamParser.RULE_funcParameter
    }
}
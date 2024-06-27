package se.clau.gleam.lang.core.psi

import GleamParser
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.util.containers.stream
import java.util.stream.Collectors

/**
 * Represents a function attribute
 */
interface GleamFunctionAttr : PsiElement {
    // No generic attr in parser for now, but we declare it here anyway
    open class FunctionAttr(node: ASTNode, val attrName: ASTString, val attrArgs: List<ASTNode>) : GleamPsiNode(node),
        GleamFunctionAttr

    class FunctionAttrObsolete(node: ASTNode, val reason: ASTString) :
        FunctionAttr(node, ASTString("obsolete"), emptyList())

    class FunctionAttrExternal(
        node: ASTNode,
        val language: ASTString,
        val extModule: ASTString,
        val extFunc: ASTString
    ) :
        FunctionAttr(node, ASTString("external"), emptyList())

    companion object {
        /**
         * Construct a function attr from AST. Detect known types and pre-build them.
         */
        fun fromAst(node: ASTNode): PsiElement {
            val attrName =
                ASTString(
                    node.getChildren(null).stream().filter(GleamPsiBuilder.Companion::isIdentifier).findFirst()
                        .orElse(GleamPsiErrorElement("Function attribute name is expected in this position"))
                )
            val attrArgs = node.getChildren(null).stream().filter(GleamPsiBuilder.Companion::isPattern).collect(
                Collectors.toList()
            )
            return when (attrName.toString()) {
                "obsolete" -> FunctionAttrObsolete(node, ASTString(attrArgs[0]))
                "external" -> FunctionAttrExternal(
                    node,
                    ASTString(attrArgs[0]),
                    ASTString(attrArgs[1]),
                    ASTString(attrArgs[2])
                )

                else -> return FunctionAttr(node, attrName, attrArgs)
            }
        }

        fun isFunctionAttrRuleType(ruleIndex: Int): Boolean =
            // funcAttr node wraps other attr type nodes, do not use like this -- ruleIndex == GleamParser.RULE_funcAttr
            ruleIndex == GleamParser.RULE_funcAttrExternal
                    || ruleIndex == GleamParser.RULE_funcAttrDeprecated
    }
}
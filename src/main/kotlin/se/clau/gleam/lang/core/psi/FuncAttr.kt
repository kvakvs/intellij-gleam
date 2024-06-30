package se.clau.gleam.lang.core.psi

import GleamParser
import com.intellij.lang.ASTNode
import com.intellij.util.containers.stream
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

/**
 * A Function Attribute PSI, e.g. @external(language, "module", "func").
 * Related stuff is reachable dynamically through queries.
 */
open class FuncAttr(node: ASTNode) : ANTLRPsiNode(node) {
    val attrName: ASTNode get() = node.firstChildNode
    val attrArgs: List<Expression>
        get() = children.stream()
            .filter(GleamPsiPredicate::isExpression)
            .map { el -> el as Expression }
            .toList()

    class FuncAttrObsolete(node: ASTNode) : FuncAttr(node)

    class FuncAttrExternal(node: ASTNode) : FuncAttr(node)

    companion object {
        /**
         * Construct a function attr from AST. Detect known types and pre-build them.
         */
        //fun fromAst(node: ASTNode): PsiElement {
        //val children = node.getChildren(null)
        //if (children.isEmpty()) {
        //    return GleamPsiErrorElement("Function attribute node is malformed")
        //}
        //if (children.first().elementType)
        //    return when (children.toString()) {
        //        "obsolete" -> FuncAttrObsolete(node, ASTString(attrArgs[0]))
        //        "external" -> FuncAttrExternal(
        //            node,
        //            ASTString(attrArgs[0]),
        //            ASTString(attrArgs[1]),
        //            ASTString(attrArgs[2])
        //        )
        //
        //        else -> return FuncAttr(node, attrName, attrArgs)
        //    }
        //}

        // A rule id check whether a given id is one of supported function attribute types
        fun isFunctionAttrRuleType(ruleIndex: Int): Boolean =
            ruleIndex == GleamParser.RULE_funcAttrExternal
                    || ruleIndex == GleamParser.RULE_funcAttrDeprecated
    }
}
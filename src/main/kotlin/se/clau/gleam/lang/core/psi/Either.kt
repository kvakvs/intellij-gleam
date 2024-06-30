//package se.clau.gleam.lang.core.psi
//
//import com.intellij.lang.ASTNode
//
///**
// * Contains one or both or no values (technically).
// * Suggested use: Contains one and only one.
// */
//open class Either<T, U>(val left: T?, val right: U?) {
//    fun isLeft() = left != null
//    fun isRight() = right != null
//}
//
///**
// * A class used as a source of string in PSI, for example for places where a literal expression can be used, or
// * maybe the caller of the constructor has the string ready.
// * Example: Reason for @deprecated(Reason) attribute, can be a string if created from code, or a string literal AST.
// */
//class ASTString : Either<String, ASTNode> {
//    override fun toString(): String {
//        return if (isLeft()) { left!! } else { right.toString() }
//    }
//
//    constructor(s: String) : super(s, null)
//    constructor(node: ASTNode) : super(null, node)
//}

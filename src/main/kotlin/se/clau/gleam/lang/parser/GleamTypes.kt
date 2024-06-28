package se.clau.gleam.lang.parser

import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import se.clau.gleam.lang.GleamLanguage

class GleamElementType(@NonNls debugName: String) :
    IElementType(debugName, GleamLanguage)

//class GleamTypes {
//    val COMMA: IElementType = GleamElementType("COMMA")
//    val PAR_OPEN: IElementType = GleamElementType("(")
//    val PAR_CLOSE: IElementType = GleamElementType(")")
//    val CURLY_OPEN: IElementType = GleamElementType("{")
//    val CURLY_CLOSE: IElementType = GleamElementType("}")
//    val SQUARE_OPEN: IElementType = GleamElementType("[")
//    val SQUARE_CLOSE: IElementType = GleamElementType("]")
//    val AS: IElementType = GleamElementType("AS")
//    val ASSERT: IElementType = GleamElementType("ASSERT")
//    val CASE: IElementType = GleamElementType("CASE")
//    val CONST: IElementType = GleamElementType("CONST")
//    val FN: IElementType = GleamElementType("FN")
//    val IF: IElementType = GleamElementType("IF")
//    val IMPORT: IElementType = GleamElementType("IMPORT")
//    val LET: IElementType = GleamElementType("LET")
//    val OPAQUE: IElementType = GleamElementType("OPAQUE")
//    val PUB: IElementType = GleamElementType("PUB")
//    val TODO: IElementType = GleamElementType("TODO")
//    val TRY: IElementType = GleamElementType("TRY")
//    val TYPE: IElementType = GleamElementType("TYPE")
//    val USE: IElementType = GleamElementType("USE")
//    val TRUE: IElementType = GleamElementType("TRUE")
//    val FALSE: IElementType = GleamElementType("FALSE")
//}
//
package se.clau.gleam.lang.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import se.clau.gleam.lang.GleamFlexLexer
import se.clau.gleam.lang.GleamLanguage
import se.clau.gleam.lang.psi.GleamFile
import se.clau.gleam.lang.psi.GleamPsiBuilder
import se.clau.gleam.lang.psi.GleamTypes
import java.io.Reader

class GleamLexerAdapter : FlexAdapter(GleamFlexLexer(null as Reader?))

class GleamParserDefinition : ParserDefinition {
    private val file = IFileElementType(GleamLanguage)

    override fun createLexer(project: Project?): Lexer = GleamLexerAdapter()
    override fun createParser(project: Project?): PsiParser = GleamParser()

    // Delegate work to the GleamPsiFactory.
    override fun createElement(node: ASTNode): PsiElement = GleamTypes.Factory.createElement(node)
    override fun createFile(viewProvider: FileViewProvider): PsiFile = GleamFile(viewProvider)

    override fun getFileNodeType(): IFileElementType = file
    override fun getCommentTokens(): TokenSet = GleamTokenSets.COMMENTS
    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    //companion object {
    //    var ID: TokenIElementType
    //
    //    init {
    //        PSIElementTypeFactory.defineLanguageIElementTypes(
    //            GleamLanguage,
    //            GleamParser.tokenNames,
    //            GleamParser.ruleNames
    //        )
    //        val tokenIElementTypes: List<TokenIElementType> = PSIElementTypeFactory.getTokenIElementTypes(GleamLanguage)
    //        ID = tokenIElementTypes[GleamLexer.IDENT]
    //    }
    //}
}
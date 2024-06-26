package se.clau.gleam.lang.core.parser

import GleamLexer
import GleamParser
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.impl.source.tree.PsiErrorElementImpl
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor
import org.antlr.v4.runtime.Parser
import org.antlr.v4.runtime.tree.ParseTree
import se.clau.gleam.lang.GleamLanguage
import se.clau.gleam.lang.core.psi.GleamFile
import se.clau.gleam.lang.core.psi.GleamPsiBuilder

class GleamParserDefinition : ParserDefinition {
    private val file = IFileElementType(GleamLanguage)
    override fun createLexer(project: Project?): Lexer = ANTLRLexerAdaptor(GleamLanguage, GleamLexer(null))

    override fun createParser(project: Project?): PsiParser {
        val parser = GleamParser(null)
        return object : ANTLRParserAdaptor(GleamLanguage, parser) {
            override fun parse(parser: Parser, root: IElementType?): ParseTree? {
                // start rule depends on root passed in; sometimes we want to create an ID node etc...
                return if (root is IFileElementType) {
                    (parser as GleamParser).sourceFileRoot()
                } else (parser as GleamParser).identifier()
                // let's hope it's an ID as needed by "rename function"
            }
        }
    }

    // Delegate work to the GleamPsiFactory.
    override fun createElement(node: ASTNode): PsiElement = GleamPsiBuilder.from(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = GleamFile(viewProvider)

    override fun getFileNodeType(): IFileElementType = file
    override fun getCommentTokens(): TokenSet = PSIElementTypeFactory.createTokenSet(
        GleamLanguage,
        GleamLexer.DOC_COMMENT,
        GleamLexer.MODULE_COMMENT,
        GleamLexer.COMMENT
    )

    override fun getWhitespaceTokens(): TokenSet =
        PSIElementTypeFactory.createTokenSet(GleamLanguage, GleamLexer.WHITESPACE)

    override fun getStringLiteralElements(): TokenSet =
        PSIElementTypeFactory.createTokenSet(GleamLanguage, GleamLexer.STRING)

    companion object {
        var ID: TokenIElementType

        init {
            PSIElementTypeFactory.defineLanguageIElementTypes(
                GleamLanguage,
                GleamParser.tokenNames,
                GleamParser.ruleNames
            )
            val tokenIElementTypes: List<TokenIElementType> = PSIElementTypeFactory.getTokenIElementTypes(GleamLanguage)
            ID = tokenIElementTypes[GleamLexer.IDENT]
        }
    }
}
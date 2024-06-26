package se.clau.gleam.ide.commenter

import com.intellij.lang.Commenter

class GleamCommenter : Commenter {
    override fun getLineCommentPrefixes(): MutableList<String> = mutableListOf("//", "///")
    override fun getLineCommentPrefix(): String = "//"

    override fun getBlockCommentPrefix(): String? = null
    override fun getBlockCommentSuffix(): String? = null

    override fun getCommentedBlockCommentPrefix(): String? = null
    override fun getCommentedBlockCommentSuffix(): String? = null
}
package se.clau.gleam.lang.core.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import se.clau.gleam.lang.GleamFileType
import se.clau.gleam.lang.GleamLanguage

class GleamFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, GleamLanguage) {
    override fun getFileType(): FileType = GleamFileType
}
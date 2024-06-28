package se.clau.gleam

//import com.intellij.testFramework.TestDataPath
//import com.intellij.testFramework.fixtures.BasePlatformTestCase
import com.intellij.psi.PsiErrorElement
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.util.PsiErrorElementUtil
import se.clau.gleam.lang.psi.GleamFile

//@TestDataPath("\$CONTENT_ROOT/src/test/testData")
class FloatTest : BaseGleamTestCase() {

    fun testFloats() {
        val input = myFixture.configureByFile("numbers/float.gleam")
        assertInstanceOf(input, GleamFile::class.java)

        println(PsiTreeUtil.findChildOfType(input, PsiErrorElement::class.java))

        assertFalse(PsiErrorElementUtil.hasErrors(project, input.virtualFile))

//        assertNotNull(parsedFile.rootTag)
//        parsedFile.rootTag?.let {
//            assertEquals("foo", it.name)
//            assertEquals("bar", it.value.text)
//        }
    }

//    override fun getTestDataPath() = "src/test/testData"

//    fun testRename() {
//        myFixture.testRename("foo.xml", "foo_after.xml", "a2")
//    }
}

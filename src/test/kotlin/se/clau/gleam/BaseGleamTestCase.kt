package se.clau.gleam

import com.intellij.testFramework.fixtures.BasePlatformTestCase

open class BaseGleamTestCase: BasePlatformTestCase() {
    override fun getTestDataPath() = "src/test/testData"
}

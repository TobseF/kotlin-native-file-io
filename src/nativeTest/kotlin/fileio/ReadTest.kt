package fileio

import kotlin.test.Test
import kotlin.test.assertEquals

class ReadTest {

    @Test
    fun `test read file`() {
        val fileName = resourceDir("hello.txt")
        println("Reading file $fileName")
        assertEquals("My Name is Tom", readAllText(fileName))
    }

    @Test
    fun `test write file`() {
        writeAllLines(outputDir("response.txt"), listOf("Hi", "My name is Alex"))
        // If no error occurs it worked. You can check the output file: build/tmp/response.txt.
    }

    private fun resourceDir(fileName: String) = "src/nativeTest/resources/$fileName"

    private fun outputDir(fileName: String) = "build/tmp/$fileName"
}
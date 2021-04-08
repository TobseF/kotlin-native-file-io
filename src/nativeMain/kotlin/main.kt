import fileio.readAllText

/**
 * Reads and prints the content of the provided file.
 */
fun main(arg: Array<String>) {
    if (arg.isEmpty()) {
        print("Provide a file path as argument")
    } else {
        val fileName = arg.first()
        println("Reading file $fileName")
        println(readAllText(fileName))
    }
}

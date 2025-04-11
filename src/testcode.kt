fun main() {
    val names = mutableListOf<String>()

    println("Enter names (type 'done' to finish):")
    while (true) {
        val input = readlnOrNull()
        if (input.equals("done", ignoreCase = true)) {
            break
        }
        input?.let { names.add(it) }
    }
    println(names)
}
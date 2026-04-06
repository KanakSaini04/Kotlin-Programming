fun main() {
    val names = listOf("Gopal", "Asad", "Shubham", "Aditya", "Devarsh", "Nikhil", "Gagan")

    // Method 1: Simple For Loop
    for (name in names) {
        print("$name, ")
    }
    println()

    // Method 2: Using indices
    for (i in 0 until names.size) {
        print("${names[i]} ")
    }
    println()

    // Method 3: Using forEachIndexed
    names.forEachIndexed { index, value ->
        println("names[$index] = $value")
    }

    // Method 4: Using ListIterator
    val it = names.listIterator()
    while (it.hasNext()) {
        print("${it.next()} ")
    }
}
fun main() {
    val names = listOf("Ram", "Shyam", "Raja", "Rani")
    println("List size: ${names.size}")
    println("Index of 'Raja': ${names.indexOf("Raja")}")
    println("Element at index 2: ${names[2]}")

    for (i in names.indices) {
        println(names[i])
    }
}
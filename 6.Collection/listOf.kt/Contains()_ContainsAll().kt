fun main() {
    val list = listOf(8, 4, 7, 1, 2, 3, 0, 5, 6)

    if (list.contains(0))
        println("List contains 0")
    else
        println("List does not contain 0")

    if (list.containsAll(listOf(3, -1)))
        println("List contains 3 and -1")
    else
        println("List does not contain 3 and -1")
}
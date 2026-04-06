fun main() {
    val list = listOf(8, 4, 7, 1, 2, 3, 0, 5, 6)

    val ascending = list.sorted()
    println(ascending)

    val descending = list.sortedDescending()
    println(descending)
}
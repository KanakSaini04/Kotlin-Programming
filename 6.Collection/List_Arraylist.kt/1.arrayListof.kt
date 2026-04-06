fun main() {
    val list = arrayListOf(1, 2, 3)

    println("Initial list: $list")

    // Add elements to the list
    list.add(4)
    list.add(1, 5) // Adds 5 at index 1

    println("After adding elements: $list")

    // Remove elements from the list
    list.remove(2)
    list.removeAt(0) // Removes element at index 0

    println("After removing elements: $list")

    // Update elements in the list
    list[0] = 6

    println("After updating elements: $list")

    // Access elements in the list
    val first = list[0]
    val last = list.last()

    println("First element: $first")
    println("Last element: $last")

    // Iterate over the list
    for (element in list) {
        println(element)
    }
}
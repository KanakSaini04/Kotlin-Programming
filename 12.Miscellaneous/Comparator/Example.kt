fun main() {
    data class Player(val firstName: String, val lastName: String)

    val players = listOf(
        Player("Steve", "Waugh"),
        Player("Steve", "Smith"),
        Player("Virat", "Kohli"),
        Player("Kane", "Williamson"),
        Player("Joe", "Root")
    )

    println("Original List:")
    println(players)

    // Sort by first name
    val firstNameComparator = compareBy<Player> { it.firstName }
    val sortedByFirstName = players.sortedWith(firstNameComparator)
    println("Sorted by First Name:")
    println(sortedByFirstName)

    // Sort by first name, then last name
    val sortedByFirstThenLast = players.sortedWith(
        firstNameComparator.then(compareBy { it.lastName })
    )
    println("Sorted by First Name then Last Name:")
    println(sortedByFirstThenLast)

    // Reverse order
    val reversed = players.sortedWith(firstNameComparator.reversed())
    println("Reversed Order:")
    println(reversed)
}
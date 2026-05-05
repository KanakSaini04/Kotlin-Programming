fun main() {
    val pairs = listOf(
        "A" to 0,
        "B" to 1,
        "A" to 3,
        "G" to 345,
        "E" to 20,
        "J" to 0
    )
    
    // Sort by string, then by integer
    val sortedByStringThenInt = pairs.sortedWith(
        compareBy<Pair<String, Int>> { it.first }
            .thenComparator { a, b -> a.second.compareTo(b.second) }
    )
    println("Sorted by String then Integer:")
    println(sortedByStringThenInt)
    
    // Sort by integer, then by string in descending order
    val sortedByIntThenStringDesc = pairs.sortedWith(
        compareBy<Pair<String, Int>> { it.second }
            .thenDescending(compareBy { it.first })
    )
    println("Sorted by Integer then String Descending:")
    println(sortedByIntThenStringDesc)
}
fun main() {
    val triple1 = Triple(1, 2, 3)
    val triple2 = Triple("Hello", 2.0, listOf(10, 20, 30))
    
    println(triple1.toList())
    
    // The following will not compile because the types are different
    // println(triple2.toList()) // Error: Type mismatch
    // To convert mixed types, we can do the following
    val list = listOf(triple2.first, triple2.second, triple2.third)
    println(list)
}
fun main() {
    // Tests demonstrating replacement functions
    val pattern4 = Regex("xyz")
    // replace all xyz with abc in the string
    println(pattern4.replace("xyzxyzzzzzzzzz", "abc"))
    // replace only first xyz with abc not all
    println(pattern4.replaceFirst("xyzddddddxyz", "abc"))
    println()
}
fun main() {
    // Regex to match "ll" in a string
    val pattern1 = Regex("ll")
    val ans : MatchResult? = pattern1.find("HelloHello", 5)
    println(ans ?.value)
}
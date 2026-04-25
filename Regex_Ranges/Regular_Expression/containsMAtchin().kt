fun main() {
    // Regex to match any string starting with 'a'
    val pattern = Regex("^a")
    println(pattern.containsMatchIn("abc"))
    println(pattern.containsMatchIn("bac"))
}
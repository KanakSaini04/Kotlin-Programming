fun main() {
    // Tests demonstrating split function 
    val pattern = Regex("\\s+")  // separate for white-spaces
    val ans : List<String> = pattern.split("This is a sentence")
    ans.forEach { word -> println(word) }
}
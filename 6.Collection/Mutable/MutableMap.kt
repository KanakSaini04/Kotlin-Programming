fun main() {
    val mutableMap = mutableMapOf(1 to "Raj", 2 to "Ram", 3 to "Sita")

    mutableMap[1] = "Laxman"
    mutableMap[4] = "Ravan"
    for (value in mutableMap.values) {
        println(value)
    }
}
fun main() {
    val immutableMap = mapOf(1 to "Ram", 2 to "Raj", 3 to "Sita")

    for (key in immutableMap.keys) {
        println(immutableMap[key])
    }
}
fun main() {
    val mutableSet = mutableSetOf(6, 10)
    mutableSet.add(2)
    mutableSet.add(5)
    mutableSet.add(6) // duplicate, ignored

    for (item in mutableSet) {
        println(item)
    }
}
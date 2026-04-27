fun main() {
    // created a list contains names
    var stringlist: List<String?> = listOf("Geeks","for", null, "Geeks")
    // created new list
    var newlist = listOf<String?>()
    for (item in stringlist) {
        // executes only for non-nullable values
        item?.let { newlist = newlist.plus(it) }
        item?.also{it -> println(it)}
    }
}
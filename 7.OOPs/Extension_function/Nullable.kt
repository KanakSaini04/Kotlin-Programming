// An extension function as a nullable receiver
fun String?.printName() {
    if (this == null) {
        println("Null")
    } else {
        println("Name is $this")
    }
}

fun main() {
    val name: String? = "Charchit"
    val nullName: String? = null

    name.printName()
    nullName.printName()
}
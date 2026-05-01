var x = 10

fun main() {
    val propRef = ::x
    println(propRef.get())
    propRef.set(20)
    println(x)
}
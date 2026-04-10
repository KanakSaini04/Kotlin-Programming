class B{
    private val int = 5
    fun show() {
        println("Inside A: $int")
    }
}

fun main() {
    val obj = A()
    println(obj.int)    // Error: Cannot access 'int': it is private in 'A'
    obj.show()          // Can be accessed
}
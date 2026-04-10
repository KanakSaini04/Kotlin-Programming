open class D {
    protected open val int = 10
}

class B : D() {
    override val int = 20
    fun printValue() {
        println("The value of integer is: $int")
    }
}

fun main() {
    val obj = B()
    obj.printValue()
}
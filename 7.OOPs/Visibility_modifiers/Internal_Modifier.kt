internal class C {
    internal val number = 100
    internal fun display() {
        println("Number is: $number")
    }
}open class A {
    protected open val int = 10
}

class B : A() {
    override val int = 20
    fun printValue() {
        println("The value of integer is: $int")
    }
}

fun main() {
    val obj = B()
    obj.printValue()
}
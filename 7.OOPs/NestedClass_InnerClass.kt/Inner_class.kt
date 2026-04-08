class OuterClass {
    private val message = "Outer class property"

    inner class InnerClass {
        fun showMessage() {
            println(message) // Can access outer class property
        }
    }
}
fun main() {
    val outer = OuterClass()
    val inner = outer.InnerClass()
    inner.showMessage()
}
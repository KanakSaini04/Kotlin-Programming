class MyClass {
    companion object
}

fun MyClass.Companion.showMessage() {
    println("Function declared in companion object")
}

fun main() {
    MyClass.showMessage()
}
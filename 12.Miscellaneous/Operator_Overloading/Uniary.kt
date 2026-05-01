class MyString(val text: String) {
    // overloading the function
    operator fun unaryMinus(): MyString {
        return MyString(text.reversed())
    }
    
    override fun toString() = text
}

fun main() {
    val str = MyString("HELLO")
    println("Initial string is ${str}")
    //calling the overloaded function unaryMinus()
    val reversed = -str
    println("String after applying unary operator $reversed")
}
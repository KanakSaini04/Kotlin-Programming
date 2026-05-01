class CustomString(var value: String) {
    // overloading increment function
    operator fun inc(): CustomString {
        value += "a"
        return this
    }

    override fun toString() = value
}

fun main() {
    var str = CustomString("Hello")
    println(str) 
    str++
    println(str)    
}
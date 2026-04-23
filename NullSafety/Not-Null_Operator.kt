
fun main() {
    var str: String? = "GeeksforGeeks"
    println(str!!.length) // OK
    
    str = null
    println(str!!.length) // Throws exception
}
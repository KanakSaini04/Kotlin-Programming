fun main() {
    var str : String?  = "GeeksforGeeks"
    println(str?.length)
    str = null
    println(str?.length ?: "-1")
    
}
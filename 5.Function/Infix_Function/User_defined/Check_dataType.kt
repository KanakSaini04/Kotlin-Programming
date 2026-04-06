class check{
    // user defined infix member function
    infix fun dataType(x: Any):Any{
    var i = when(x){
            is String -> "String"
            is Int -> "Integer"
            is Double -> "Double"
            else -> "invalid"
        }
        return i
    }
}
fun main(args: Array<String>){
    var chk = check()
    // call using infix notation
    var result = chk dataType 3.3
    println(result)
}
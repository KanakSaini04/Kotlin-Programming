fun main(args: Array<String>){
    var str1: Any = "Safe casting"
    val str2: String? = str1 as? String     // it works 
    str1 = 11
    // type casting not possible so returns null to str3
    val str3: String? = str1 as? String    
    val str4: Int? = str1 as? Int          // it works
    println(str2)
    println(str3)
    println(str4)
}
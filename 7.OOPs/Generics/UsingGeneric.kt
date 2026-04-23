class CompanyB<T>(name: T) {
    var companyName = name
}

fun main() {
    val c1 = CompanyB("GeeksforGeeks")
    val c2 = CompanyB(1234)
    
    println(c1.companyName)
    println(c2.companyName)
}
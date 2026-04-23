class CompanyA(name: String) {
    var companyNameA = name
}

fun main(){
    val c = CompanyA(12) // compile time error
}
class Company {
    var name: String = "abc"
        private set

    fun updateName(newName: String) {
        name = newName
    }
}

fun main() {
    val company = Company()
    println("Initial name: ${company.name}")

    company.updateName("GeeksforGeeks")
    println("Updated name: ${company.name}")
}
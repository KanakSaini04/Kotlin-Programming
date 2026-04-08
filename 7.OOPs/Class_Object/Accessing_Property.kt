class Employee(val name: String, val age: Int, val gender: Char, val salary: Double) {
    fun showDetails() {
        println("Name of the employee: $name")
        println("Age of the employee: $age")
        println("Gender of the employee: $gender")
        println("Salary of the employee: $salary")
    }
}

fun main() {
    val emp1 = Employee("Praveen", 50, 'M', 500000.0)
    emp1.showDetails()

    val emp2 = Employee("Aliena", 30, 'F', 400000.0)
    println("Name of the new employee: ${emp2.name}")
}
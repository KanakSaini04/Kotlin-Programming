data class Employee(val id: Int, val salary: Double)

fun main() {
    val employee = Employee(101, 50000.0)
    val (empId, empSalary) = employee
    println("ID: $empId, Salary: $empSalary")
}
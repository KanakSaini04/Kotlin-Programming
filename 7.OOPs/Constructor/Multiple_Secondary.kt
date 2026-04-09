class Employee {
    constructor(empId: Int, empName: String) {
        println("Employee id is: $empId, Employee name: $empName")
    }

    constructor(empId: Int, empName: String, salary: Double) {
        println("Employee id is: $empId, Employee name: $empName, Salary: $salary")
    }
}

fun main() {
    val e1 = Employee(18018, "Sagnik")
    val e2 = Employee(11011, "Praveen", 600000.5)
}
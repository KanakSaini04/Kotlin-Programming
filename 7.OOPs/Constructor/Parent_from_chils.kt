open class Employee {
    constructor(empId: Int, empName: String) {
        println("Employee id is: $empId")
        println("Employee name: $empName")
    }
}

class Manager : Employee {
    constructor(empId: Int, empName: String, salary: Double) : super(empId, empName) {
        println("Employee salary: $salary")
    }
}

fun main() {
    val manager = Manager(18018, "Sagnik", 500000.55)
}
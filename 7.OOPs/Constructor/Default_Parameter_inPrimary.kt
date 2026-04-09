class Employee1(val empId: Int = 100, val empName: String = "abc")

fun main() {
    val emp1 = Employee1(18018, "Sagnik")
    val emp2 = Employee1(11011)
    val emp3 = Employee1()

    println("Employee id is: ${emp1.empId}, Employee name: ${emp1.empName}")
    println("Employee id is: ${emp2.empId}, Employee name: ${emp2.empName}")
    println("Employee id is: ${emp3.empId}, Employee name: ${emp3.empName}")
}
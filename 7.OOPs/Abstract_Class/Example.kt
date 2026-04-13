abstract class Employee4(val name: String) {   // Non-abstract property
    abstract var experience: Int               // Abstract property

    abstract fun salary(): Double              // Abstract method

    fun employeeDetails() {                    // Non-abstract method
        println("Name of the employee: $name")
        println("Experience in years: $experience")
        println("Annual Salary: ${salary()}")
    }

    abstract fun dateOfBirth(date: String)     // Abstract method
}

class Engineer(name: String, override var experience: Int) : Employee4(name) {
    override fun salary(): Double {
        return 500000.0
    }

    override fun dateOfBirth(date: String) {
        println("Date of Birth is: $date")
    }
}

fun main() {
    val eng = Engineer("Praveen", 2)
    eng.employeeDetails()
    eng.dateOfBirth("02 December 1994")
}
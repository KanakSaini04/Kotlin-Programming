// The list of different standard library functions and their use :

// sqrt() : Used to calculate the square root of a number.
// print() : Used to print a message to standard output.
// rem() : To find the remainder of one number when divided by another.
// toInt() : To convert a number to an integer value.
// readline() : Used for standard input.
// compareTo() : To compare two numbers and return a boolean value.
fun student( name: String , grade: Char , roll_no: Int) {
    println("Name of the student is: $name")
    println("Grade of the student is: $grade")
    println("Roll no of the student is: $roll_no")

}

fun main(args: Array<String>) {
    val name = "Praveen"
    val rollno = 25
    val grade = 'A'
    student(name,grade,rollno)
    student("Gaurav",'B',30)
}



fun main(args: Array<String>) {
    var sum = arrayOf(1,2,3,4,5,6,7,8,9,10).sum()

    println("The sum of all the elements of an array is: $sum")
}

fun main(args: Array<String>) {
    var num1 = 26
    var num2 = 3

    var result = num1.rem(num2)
    println("The remainder when $num1 is divided by $num2 is: $result")
}
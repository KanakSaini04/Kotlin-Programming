fun main(args: Array<String>) {

    var num1 = 4
    outer@ while (num1 > 0) {
        num1--
        var num2 = 4

        inner@ while (num2 > 0) {
            if (num1 <= 2)
                continue@outer   // i will know
            println("num1 = $num1, num2 = $num2")
            num2--
        }
    }
}
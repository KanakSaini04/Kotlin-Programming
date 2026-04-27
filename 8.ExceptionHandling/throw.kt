fun checkPassword(password: String) {
    // check length of string
    if (password.length < 6) {
        throw ArithmeticException("Password is too short")
    }
}

fun main() {
    checkPassword("123")
}
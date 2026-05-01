fun add(a: String, b: String): String = a + b
fun add(a: Int, b: Int): Int = a + b

val stringAdd: (String, String) -> String = ::add
val intAdd = ::add as (Int, Int) -> Int

fun main() {
    println(stringAdd("Kotlin", " Reflection"))
    println(intAdd(5, 3))
}
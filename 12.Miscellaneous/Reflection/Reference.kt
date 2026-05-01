// A sample empty class
class ReflectionDemo

fun main() {
    // Reference obtained using class name
    val classRef = ReflectionDemo::class
    println("This is a class reference: $classRef")

    // Reference obtained using object
    val demoInstance = ReflectionDemo()
    val boundedRef = demoInstance::class
    println("This is a bounded class reference: $boundedRef")
}
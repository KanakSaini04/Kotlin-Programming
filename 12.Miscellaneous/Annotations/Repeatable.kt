@Repeatable
@Retention(AnnotationRetention.SOURCE)
annotation class AnnotationDemo4 (val value: Int)

@AnnotationDemo4(4)
@AnnotationDemo4(5)
fun main(){
    println("Repeatable Annotation applied on main")
}
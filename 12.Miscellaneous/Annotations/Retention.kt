//Specifying an annotation with runtime policy 
@Retention(AnnotationRetention.RUNTIME)
annotation class AnnotationDemo3 

@AnnotationDemo3 fun main(){
    println("Main function annotated")
}
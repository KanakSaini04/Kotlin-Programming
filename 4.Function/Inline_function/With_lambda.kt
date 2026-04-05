fun main(args: Array<String>){
    println("Main function starts")
    inlinedFunc({ println("Lambda expression 1")
    return },      // inlined function allow return 
                   // statement in lambda expression
                   // so, does not give compile time error

    { println("Lambda expression 2")} )

    println("Main function ends")
}
    // inlined function
inline fun inlinedFunc( lmbd1: () -> Unit, lmbd2: () -> Unit  ) {  
    lmbd1()
    lmbd2()
}
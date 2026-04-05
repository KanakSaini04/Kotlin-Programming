fun main(args: Array<String>) {
    println("Main function starts")

    inlinedfunc({
        println("Lambda expression 1")
        return@inlinedfunc   // ✅ Correct
    }, {
        println("Lambda expression 2")
    })

    println("Main function ends")
}

inline fun inlinedfunc(
    crossinline lmbd1: () -> Unit,
    lmbd2: () -> Unit
) {
    lmbd1()
    lmbd2()
}
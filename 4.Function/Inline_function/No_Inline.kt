fun main(args: Array<String>) {
    println("Main function starts")

    inlinedFunc(
        {
            println("Lambda expression 1")
            return   // ✅ non-local return (exits main)
        },
        {
            println("Lambda expression 2")
            return@inlinedFunc   // ✅ local return (only exits this lambda)
        }
    )

    println("Main function ends") // ❌ will NOT execute
}

inline fun inlinedFunc(
    lmbd1: () -> Unit,
    noinline lmbd2: () -> Unit
) {
    lmbd1()
    lmbd2()
}
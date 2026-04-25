fun main() {
    // Tests demonstrating entire string match
    var pattern = Regex("geeks?")
    println(pattern.matchEntire("geeks")?.value)
    println(pattern.matchEntire("geeeeeeeks")?.value)
    pattern = Regex("""\D+""")
    println(pattern.matchEntire("geeks")?.value)
    println(pattern.matchEntire("geeks12345")?.value)
}
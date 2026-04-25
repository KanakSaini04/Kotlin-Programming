fun main() {
    // Regex to match a 3 letter pattern beginning with ab
    val pattern2 = Regex("ab.")
    val ans1 : Sequence<MatchResult> = pattern2.findAll("abcfffgdbabs", 0)
    // forEach loop used to display all the matches
    ans1.forEach()
    {
            matchResult -> println(matchResult.value)
    }
    println()
}
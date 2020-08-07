fun main() {
    var wordOne = "Modern"
    var wordtwo = "Concise"
    var wordThree= "Pragmatic"
    var wordFour = "Safe"
    val text = """
        Kotlin is $wordOne
        Kotlin is $wordtwo
        Kotlin is $wordThree
        Kotlin is $wordFour 
        """.trimIndent()

    print(text)

}
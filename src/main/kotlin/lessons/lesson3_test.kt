package lessons

fun main() {
    val greeting = "Hello my dear friend"
    val userName1 = "Ayder"
    val userName2 = "Emir"
    val phrase: String = "$greeting $userName1, how are u?"
//    println(phrase)
//    Тестим trimIndent
    val multiStringTest = """
        123
            123
                123
                    123
    """.trimIndent()
    println("Now we can see trimIndent()")
    println(multiStringTest)
    val multiStringTest2 = """
        |123
            |123
                |123
                    |123
    """.trimMargin()
    println("And now we see trimMargin(), обязательно добавь |")
    println(multiStringTest2)
    val testPhrase1: String = "Blah blah blah, some text and then \"WOW\""
    println("Видим спец. символ \\")
    println("${testPhrase1}")


}
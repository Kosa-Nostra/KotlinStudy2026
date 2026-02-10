package org.example.lessons_1_10

fun main() {


    val greet = "Hi"
    val space = ' '
    val userName = "Ayder"
//    конкатенация строк (сложение строк)
//    println(greet+", "+ userName+ space+"How are u?")

//    интерполяция строк
    println("$greet,$userName! How are u?")
    println("test ${40+23}")

    val multiString = """
                    |aaaaaaaaa
               bbbbbbbb
                     ccccc
    """.trimMargin()
   println(multiString)

    val phrase = "And he said - \"it is wonderful!\""
    println(phrase)
}
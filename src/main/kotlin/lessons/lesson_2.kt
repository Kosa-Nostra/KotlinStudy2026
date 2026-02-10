package org.example.lessons_1_10

fun main() {

    val a = 5
    val b = 23
    val sum = a+b
    println(a+b)
    println(sum)
    println(10/3)
    println(10%3)

    val complexExpression: Int

    println(sum::class.simpleName)

//    инкеремент / декремент
    var counter = 0
    counter = counter + 1
    counter +=1
    counter++
    println(counter)

    counter = counter - 1
    counter -= 1
    counter--
    println(counter)

//    операторы сравнения
    println(a>b)
    println(a<b)
    println(a>=b)
    println(a<=b)
    println(a==b)
    println(a!=b)
}
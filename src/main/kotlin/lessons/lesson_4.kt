package org.example.lessons_1_10

fun main() {
//    операторы сравнения
    val b = (1==1)
//    <,>,>=,<=,==,!=, ===, !==

//    операторы присваивания
    val a = 1+1

    val userAge = 42
    val comparisonResult: Boolean = (userAge >= AGE_OF_MAJORITY) && !(userAge >= RETIRE_AGE)
    val result = userAge in AGE_OF_MAJORITY..RETIRE_AGE
    println("Result is: $comparisonResult")

//    логические операторы
//    &&,||,!

    val c =true
    val d = !c
    println(d)

}


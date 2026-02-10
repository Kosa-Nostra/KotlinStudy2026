package org.example.lessons_1_10
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var numberOfOrders: Int = 42
    val welcomeMessage: String = "Welcome bro!"

    println(numberOfOrders)
    println(welcomeMessage)

    numberOfOrders = 23
    println(numberOfOrders)

//const val - константа

//целочисленные
val intNumber: Int = 15
//    сюда же long,short,byte,unsigned(для онли положительных)

//    вещественные
    val doubleNum: Double = 232.42 // 64 bit
    val floatNum: Float = 123.15f //32 bit

//    строковые
    val stringValue: String = "test"
    val charValue: Char = 'a'
//    String в двойных кавычках, char в одинарных, т.к 1 символ!!!

//    логические
    val trueValue: Boolean = true
    val falseValue: Boolean = false
}
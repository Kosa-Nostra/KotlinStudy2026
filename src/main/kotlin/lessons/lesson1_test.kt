package lessons

fun main() {
//    val greet: String = "Hello my friend!"
//    val ask: String = "How are u?"
//    var numberOfNames = 12
//    println(greet)
//    println(ask)
//    println(numberOfNames)
//    numberOfNames = 24
//    println("Now number is $numberOfNames")
    println("Введите возраст: ")
    val myAge = readln().toInt()
    println("Введите имя: ")
    val name = readln().toString()
    println("Меня зовут $name и мне $myAge ${yearsWord(myAge)} ")


}

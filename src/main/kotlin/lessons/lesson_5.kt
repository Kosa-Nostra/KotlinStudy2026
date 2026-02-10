package org.example.lessons_1_10

fun main() {

    val userAge = readln().toInt()
    val resultMessage = if(userAge >= AGE_OF_MAJORITY){
        "Show content"
    } else if (userAge == 16 || userAge == 17){
        "Show limited content"
    }
    else{
        "Access denied!"
    }
//    println(resultMessage)

    val result = when(userAge){
        10 -> {
            println("Addition action")
            "Your number is 10"
        }
        20 -> "Your number is 20"
        40 -> "Your number is 40"
        else -> "Another number"
    }
    println(result)

}
const val AGE_OF_MAJORITY = 18
const val RETIRE_AGE = 65
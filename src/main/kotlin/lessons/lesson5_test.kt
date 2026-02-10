package lessons

fun main() {
    println("Введите ваш возраст: ")
    val userAge: Int = readln().toInt()
    val resultMessage = if (userAge<AGE_OF_MAJORITY123){
        "Тебе еще рано для этого контента"
    }else if (userAge > RETIRE_AGE123){
        "Ты слишком стар для этого контента"
    }else{
        "Показать контент"
    }
//    println(resultMessage)
    val consoleMessage = when{
        userAge == 21 -> {"Тебе $userAge год"}
        userAge !in 18..99 ->{
            "Тебе сюда нельзя :("
        }
        else -> "Доступ разрешен, ведь тебе $userAge"
    }
//    println(consoleMessage)
    val newMessage = when{
        userAge !in 18..99 -> {"Прости, доступ закрыт"}
        userAge == 19 -> {"Вау, тебе уже 19 лет"}
        else -> "Доступ разрешен, ведь тебе $userAge ${yearsWord(userAge)}"
    }
    println(newMessage)
}
fun yearsWord(age: Int): String = when{
    age%100 in 11..19 -> "лет"
    age%10 == 1 -> "год"
    age%10 in 2..4 -> "года"
    else -> "лет"
}

const val AGE_OF_MAJORITY123 = 18
const val RETIRE_AGE123 = 99
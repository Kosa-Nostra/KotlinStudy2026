package lessons

fun main() {
    printNameAndAge(userName = getName(),userAge = getAge())
}

fun getName() : String? = readln()

fun getAge() : Int? = readln()?.toInt()

fun printNameAndAge(userName: String?, userAge: Int?){
    println("Данные пользователя: $userName, $userAge лет")
}
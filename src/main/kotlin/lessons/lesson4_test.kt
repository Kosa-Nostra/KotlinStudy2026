package lessons

fun main() {
    val userAge: Int = 34
    val result = userAge in AGE_OF_MAJORITY..RETIRE_AGE
//    val result2 = userAge >= AGE_OF_MAJORITY && userAge <= RETIRE_AGE
    if (result == true){
        println("Наш юзер с возрастом $userAge может зайти дальше")
        println("Результат сравнения: $result")
    }else if (userAge<=AGE_OF_MAJORITY){
        println("Наш юзер еще слишком мал, ведь ему всего $userAge лет")
        println("Результат сравнения: $result")
    }else if (userAge>=RETIRE_AGE){
        println("Наш юзер уже слишком стар для этого, ему уже $userAge лет")
        println("Результат сравнения: $result")
    }

}
const val AGE_OF_MAJORITY = 18
const val RETIRE_AGE = 99
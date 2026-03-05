package lesson18

fun main() {
    val ex1 = PushUp()
    val ex2 = Plank()
    val ex3 = Stretching()
    val workoutList = mutableListOf<Exercise>(ex1, ex2, ex3)
    println("НОВАЯ ВЕРСИЯ ПРИЛОЖЕНИЯ!!!")
    workoutList.forEach {
        println()
        it.start()
    }
    println("Общее время тренировки:")
    println(workoutList.sumOf { it.duration })

}
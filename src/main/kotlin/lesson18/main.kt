package lesson18

fun main() {
    val ex1 = PushUp()
    val ex2 = Plank()
    val ex3 = Stretching()
    val workoutList = listOf<Exercise>(ex1, ex2, ex3)
    workoutList.forEach {
        println()
        it.start()
    }
}
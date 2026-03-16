package final_learning.task1.interfaces

fun main() {
    val trainings = listOf<Workout>(
        PowerTraining(70.0,10),
        PowerTraining(80.0,12),
        CardioTraining(50.0, 45),
        CardioTraining(20.5,26),
    )
    trainings.forEach {
        println("Упражнение: ${it.title} | Статус: ${it.getStatus()}|XP: ${it.calculateXP()}")
    }

}
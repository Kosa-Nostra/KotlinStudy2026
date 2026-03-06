package lesson20

data class RawExercise(
    val name: String,
    val duration: Int,
    val intensity: String,
)

fun main() {
    val exerciseList = listOf(
        RawExercise("Жим",10,"HIGH"),
        RawExercise("Присед",15,"MEDIUM"),
        RawExercise("Тяга",13,"HIGH"),
    )
    println("Список упражнений: ")
    exerciseList.forEach {
        println("Название: ${it.name}, интенсивность: ${it.intensity}, длительность: ${it.duration}")
    }
    println("Самые тяжелые тренировки:")
    exerciseList.filter { it.intensity == "HIGH" }.forEach {println("Упражнение: ${it.name}, длительность: ${it.duration}")}
    println("Самые длинные тренировки: ")
    exerciseList.filter { it.duration >= 10 }.forEach {println("Упражнение: ${it.name}, интенсивность: ${it.intensity}")}
    val highWorkoutsDuration = exerciseList.filter { it.intensity == "HIGH" }.sumOf { it.duration }
    println("Длительность тяжелых тренировок: $highWorkoutsDuration")

}
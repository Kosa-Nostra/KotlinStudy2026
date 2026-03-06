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
    val heavyWorkout = exerciseList.filter { it.intensity == "HIGH" }
    println("Самые тяжелые тренировки: $heavyWorkout")
    val longWorkout = exerciseList.filter { it.duration >= 10 }
    println("Самые длинные тренировки: $longWorkout")
    val highWorkoutsDuration = exerciseList.filter { it.intensity == "HIGH" }.sumOf { it.duration }
    println("Длительность тяжелых тренировок: $highWorkoutsDuration")
}
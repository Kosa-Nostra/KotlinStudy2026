package lessons_final
data class Set(val weight: Double, val reps: Int)
data class Workout(val name: String, val sets: List<Set>)


fun Workout.totalTonnage(): Double {
    return this.sets.sumOf { it.weight * it.reps }
}

fun main() {
    val trainingDay = listOf(
        Workout("Жим", listOf(Set(80.0, 5), Set(90.0, 3))),
        Workout("Тяга", listOf(Set(100.0, 8), Set(110.0, 5))),
        Workout("Разводка", listOf(Set(10.0, 20)))
    )

    println("--- ОТЧЕТ ПО ТРЕНИРОВКЕ ---")
trainingDay.forEach {
    println("${it.name}, общий тоннаж: ${it.totalTonnage()}")
}
    println("Тяжёлые тренировки: ")
trainingDay.filter { it.totalTonnage() > 500 }.forEach {
    println("${it.name},${it.totalTonnage()} кг")
}
}
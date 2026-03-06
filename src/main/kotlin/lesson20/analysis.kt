package lesson20

data class Set(
    val name: String,
    val reps: Int,
    val weight: Double,
)

fun main() {
    val workoutResults = listOf<Set>(
        Set("Жим",4,80.0),
        Set("Жим",3,90.0),
        Set("Жим",2,120.0),
        Set("Тяга блока",8,65.0),
        Set("Отведения гантелей",36,10.0)
    )
    workoutResults.filter { it.weight>50 }.forEach {println("Тяжелый подход: ${it.name}, вес: ${it.weight}")}
    val totalWeight = workoutResults.sumOf { it.weight * it.reps }
    println("Общий тоннаж за тренировку: $totalWeight кг")
    println("Рекордный вес: ${workoutResults.maxByOrNull { it.weight }}")
    println("Кол-во упражнений \"Жим\": ${workoutResults.count { it.name == "Жим" }}")
}
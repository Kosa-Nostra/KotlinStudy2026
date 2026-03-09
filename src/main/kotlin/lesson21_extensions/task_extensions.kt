package lesson21_extensions

data class RawExercise(val name: String, val duration: Int, val weight: Double)

fun RawExercise.printSummary() {
    println(this.name.toWorkoutTitle())
    println(this.duration.toTimeFormat())
    println(this.weight.formatSafeWeight())
}

fun main() {
    val gymSession = listOf(
        RawExercise("Жим", 120, 80.0),
        RawExercise("Присед", 150, 100.0)
    )
    gymSession.forEach { it.printSummary() }
}

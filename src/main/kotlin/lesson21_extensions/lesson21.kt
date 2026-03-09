package lesson21_extensions

fun main() {
    val myWeight: Double = 70.0
    val exerciseName: String = "BENCH PRESS"
    val duration: Int = 145
    println(myWeight.formatWeight())
    println(exerciseName.toWorkoutTitle())
    println(duration.toTimeFormat())
    println(myWeight.formatWeight())
}
fun Double.formatWeight(): String {
    return "$this кг"
}
fun String.toWorkoutTitle(): String {
    return "\uD83C\uDFCB\uFE0F" + this
}
fun Int.toTimeFormat(): String {
    return "Минуты: ${this/60}; Секунды: ${this%60}"
}
fun Double?.formatSafeWeight(): String {
    return this?.formatWeight() ?: "Вес не указан"
}
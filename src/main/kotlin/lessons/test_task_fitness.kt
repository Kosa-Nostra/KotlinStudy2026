package lessons

fun main() {
    println("Привет, сколько шагов ты сегодня прошёл?")
    val steps = readln().toIntOrNull() ?: 0
    val result = when{
        steps<0->"Ошибка: ты не можешь ходить назад во времени!"
        steps in 0..1000 -> "нужно хотя бы встать с дивана!"
        steps in 1001..5000 -> "неплохо,но маловато"
        steps in 5001..10000 ->"отличная прогулка!"
        else -> "Ты просто машина!"
    }
    println(result)
}
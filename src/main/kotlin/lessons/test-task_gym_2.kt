package lessons

fun main() {
    val weekWeights = mutableListOf(85, 100, 120, 95, 120, 110, 70)
//test
    // 1. Максимальный (используй maxOrNull)
println("Максимальный вес: ${weekWeights.maxOrNull()}")
    // 2. Минимальный (используй minOrNull)
println("Минимальный вес: ${weekWeights.minOrNull()}")
    // 3. Сумма всех весов
println("Общий тоннаж: ${weekWeights.sum()}")
    // 4. Среднее значение
println("Средний вес: ${weekWeights.average()}")
    // 5. Первый и последний элементы
println("Первый поднятый вес: ${weekWeights.first()}")
    println("Последний поднятый вес: ${weekWeights.last()}")
    // 6. Топ-3 самых тяжелых подхода
    val sorted = weekWeights.sortedDescending()
    println("Топ 3 веса: ${sorted.take(3)}")
}
package lessons

fun main() {
    // 1. Исходные данные
    val weights = mutableListOf(80, 120, 95, 120, 110, 80, 130)
    weights.sort()
    // 2. Цикл и условия (Разминка vs Тяжелая)
    for (i in weights.indices){
        if (weights[i]>100){
            println("Тяжёлая тренировка: ${weights[i]} кг")
        }else{
            println("Разминка: ${weights[i]} кг")
        }
    }
    // 3. Считаем количество повторений веса 120
    var ctr = 0
    weights.forEach {
        if (it==120){
            ctr++
        }
    }
    println("Вес 120 встречается: $ctr раз")

    // 4. Фильтруем рекорды (> 115)
val records = weights.filter {
    it>115
}
    println("Рекорды: $records")
    // 5. Итоги: среднее и проверка на пустоту
    if (records.isEmpty()){
        println("Список рекордов пуст")
    }else{
        println("Список рекордов не пуст")
    }
    var allWeights = 0
    weights.forEach {
        allWeights+=it
    }
    var average: Double = allWeights/7.0
    println("Средний вес: $average")
}
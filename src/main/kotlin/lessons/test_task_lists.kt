package lessons

fun main() {
    val trainingLog = mutableListOf(70, 85, 60, 90, 85, 100)
    // ТВОЙ КОД ЗДЕСЬ:
    // 2. Добавь 110
trainingLog.add(110)
    // 3. Найди минимальный и удали его (подсказка: trainingLog.minOrNull())
trainingLog.remove(trainingLog.minOrNull())
    // 4. Выведи результат проверки на наличие "100" через println
if (trainingLog.contains(100)){
    println("Найдено 100")
    }else{
        println("В списке нет 100")
    }
    // 5. Отфильтруй те, что > 80
val filtered = trainingLog.filter{
    it>80
}
    // 6. Прибавь ко всем по 2 кг через .map
val doubled_weights = trainingLog.map{
    it*2
}
    // 7. Отсортируй и выведи финальный список
    trainingLog.sort()
    trainingLog.forEach {
        println(it)
    }
}
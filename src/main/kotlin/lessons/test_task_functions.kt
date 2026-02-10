package lessons

fun main() {
val currentWeek = mutableListOf<Int>()
    val previousWeek = mutableListOf<Int>()
    println("Введите ваши веса за эту неделю(для выхода ввести 0): ")
    while (true){
        val num = readln().toIntOrNull()?:0
        if(num == 0){break}
        currentWeek.add(num)
    }

    println("Введите ваши веса за прошлую неделю(для выхода ввести 0): ")
    while (true){
        val num = readln().toIntOrNull()?:0
        if(num == 0){break}
        previousWeek.add(num)
    }
    println(analyzeProgress(currentWeek,previousWeek))
}
fun analyzeProgress(current: List<Int>, previous: List<Int>): String{
    val currMax = current.maxOrNull()?: 0
    val prevMax = previous.maxOrNull()?: 0
    val currAvg = current.average()
    val prevAvg = previous.average()
    var message = if (currAvg>prevAvg){"Есть прогресс! "}else{"Нужен отдых "}
    if (currMax>prevMax){
        message+="Кстати, на этой неделе у тебя новый рекорд: $currMax кг"
    }
    return message
}
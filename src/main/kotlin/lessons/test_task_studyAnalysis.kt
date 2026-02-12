package lessons

fun main() {
    val dataList = collectDetailedData()
    if (dataList.isEmpty()) {
        println("Данных нет, учиться будем?")
    } else {
        generateFullReport(dataList)
    }
}

// 1. Сбор данных (используй continue для защиты от отрицательных чисел)
fun collectDetailedData(): List<Int> {
    val dataList = mutableListOf<Int>()
    println("Введите кол-во часов(0 для выхода): ")
    while (true){
        val hour = readln().toIntOrNull()?:continue
        if (hour==0){break}
        else if (hour<0){
            println("Кол-во часов не может быть отрицательным, ошибка!")
            continue}
        dataList.add(hour)
    }
    return dataList
}
// 2. Оценка одного дня
fun evaluateDay(hours: Int): String {//оценка дня
    return when{
        hours in 1..3-> "Хороший темп"
        hours >=4-> "Продуктивный гигант"
        hours==0-> "День отдыха"
        else-> "Ошибка: отрицательное число!"
    }
}

// 3. Финальный отчет (используй цикл внутри для перебора списка)
fun generateFullReport(dataList: List<Int>) {
    println("--- Детальный отчет по дням ---")
    for (i in dataList) {
            val message = "День №${dataList.indexOf(i)+1}: $i ч.; ${evaluateDay(i)}"
            println(message)
    }
}
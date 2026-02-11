package lessons

fun main() {
    // Здесь мы будем вызывать наши функции
    val studyHours = collectStudyData()
    println(studyHours)
    val report = generateReport(studyHours)
    showResult(report)
}

// Сюда мы добавим функции по одной
fun collectStudyData(): MutableList<Int> {
    println("Сколько часов учил сегодня?(0 для выхода): ")
    val studyHours = mutableListOf<Int>()
    while (true) {
        val hour = readln().toIntOrNull() ?: 0
        if (hour == 0){
            break
        }
        studyHours.add(hour)
    }
    return studyHours
}
fun generateReport(hours: List<Int>): String {
    val allHours = hours.sum()
    val topHour = hours.maxOrNull()?: 0
    return "Общее время учебы: ${allHours}ч. Твой рекорд за день: $topHour ч."
}
fun showResult(report: String){
    println(report)
}
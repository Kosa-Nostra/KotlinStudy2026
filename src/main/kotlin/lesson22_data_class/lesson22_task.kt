package lesson22_data_class

data class Progress(
    val date: String,
    val weight: Double,
    val maxBenchPress: Double,
    val status: String,
)

fun main() {
    val start = Progress("01.03.2026",70.0,70.0,"active")
    val afterMonth = start.copy(date = "01.04.2026", weight = 72.0,maxBenchPress = 75.0)
    val finalResult = afterMonth.copy(date = "01.05.2026", maxBenchPress = 80.0, status = "Pro")
    println(finalResult)
    val finalResultAgain = finalResult.copy()
    println(finalResult == finalResultAgain)
    val(date, weight,maxBenchPress)=finalResult
    println("Дата:$date,рекорд:$maxBenchPress")
}
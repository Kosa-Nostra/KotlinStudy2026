package final_learning.task4.nullSafety

sealed class FlightStatus {
    object InHangar: FlightStatus()
    data class InFlight(val altitude: Int): FlightStatus()
    data class Emergency(val message: String): FlightStatus()
}
fun checkStatus(status: FlightStatus){
    when(status){
        is FlightStatus.InHangar -> {println("Отдыхаем")}
        is FlightStatus.Emergency -> {println("Ошибка, ${status.message}")}
        is FlightStatus.InFlight -> {println("Летим, высота: ${status.altitude}")}
    }
}
fun main() {
    val statusHangar = FlightStatus.InHangar
    val statusFlight = FlightStatus.InFlight(12000)
    val statusEmergency = FlightStatus.Emergency("Отказ систем")
    val statuses = listOf<FlightStatus>( statusHangar, statusFlight, statusEmergency)
    statuses.forEach { checkStatus(it) }
}
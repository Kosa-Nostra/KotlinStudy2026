package final_learning.task4.nullSafety

fun main() {
    val pilot1 = Pilot("Maverick","12344321")
    val plane1 = Aircraft("A-330",pilot1)
    val plane2 = Aircraft("MQ-9 Reaper",null)
    printFlightInfo(plane1)
    printFlightInfo(plane2)
}
fun printFlightInfo(aircraft: Aircraft) {
    val pilot = aircraft.pilot?.name ?: "Отсутствует"
    val license = aircraft.pilot?.licenseId ?: "Отсутствует"
    println("Модель: ${aircraft.model}")
    println("Пилот: $pilot")
    println("Лицензия: $license")
    println("Модель: ${aircraft.model} | Пилот: $pilot | Лицензия: $license")
}
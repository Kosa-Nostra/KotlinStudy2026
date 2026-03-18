package final_learning.task4.nullSafety

fun main() {
    val pilot1 = Pilot("Ayder","MAR12344321")
    val pilot2 = Pilot("Ayder",null)
    val hangar = listOf<Aircraft>(
        Aircraft("A-330",pilot1),
        Aircraft("A-380",pilot2),
        Aircraft("F-22",pilot1),
        Aircraft("MQ-9",null),
        Aircraft("MQ-1",null),
        Aircraft("TB-2",null),
    )
    val dangerZone = hangar.filter { it.pilot != null && it.pilot.licenseId == null }
    println("Опасная зона: ")
    dangerZone.forEach { println("Воздушное судно: ${it.model},пилот: ${it.pilot?.name}")}
    val droneCount = hangar.count(){it.pilot == null}
    println("Количество дронов в ангаре: $droneCount")
    println(hangar.any(){it.model == "F-22"})
}
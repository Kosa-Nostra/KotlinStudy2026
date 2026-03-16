package final_learning.task3.interfaces

fun main() {
    val hangar = listOf(
        PassengerPlane("Airbus A330", 220, 890),
        FighterJet("F-16",2690,true)
    )
    hangar.forEach {
        performCheck(it)
        println(it.takeOff())
        println(it.land())
    }
}
fun performCheck(unit: Serviceable){
    println(unit.repair())
}
package final_learning.task2.interfaces

fun main() {
    val hangar = listOf(
        PassengerPlane("Airbus A380", 420, 900),
        FighterJet("F-18 Super-hornet",2800,true)
    )
    hangar.forEach {
        println(it.takeOff())
        println(it.land())
    }
}
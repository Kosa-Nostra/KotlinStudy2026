package final_learning.task4.nullSafety

fun main() {
    val pilot1 = Pilot("Test","MAR232323")
    val air1 = Aircraft("A-320 neo",null)
    val air2 = air1.copy(pilot = pilot1)
    println(air1)
    println(air2)

}
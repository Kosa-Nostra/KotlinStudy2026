package lesson22_data_class

data class Athlete(
    val name: String,
    val age: Int,
    val weight: Double,
    val rank: String,
)

fun main() {
    val guy1 = Athlete("Ayder",19,70.0,"Average")
    println(guy1)
    val guy2 = guy1.copy(name="Not Ayder")
    println(guy2)
}
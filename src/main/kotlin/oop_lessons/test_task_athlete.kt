package oop_lessons
data class Athlete(
    val name: String,
    val sport: String,
    val trainingHours: Double,
){
    fun printInfo(){
        println("Атлет $name занимается видом спорта: \"$sport\"")
    }
    fun checkOverload(){
        if (trainingHours>20.0){
            println("Внимание! У атлета $name перебор с нагрузкой")
        }else println("У атлета $name все в норме с нагрузкой")
    }
}
fun main() {
val myAthlete = Athlete("Ayder","Bodybuilding",8.0)
    myAthlete.printInfo()
    myAthlete.checkOverload()
}
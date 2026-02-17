package oop_lessons

data class Plane(
    var model: String,
    private var maxSpeed: Double,
    private var currentSpeed: Double,
){
    fun showStatus(){
        println("Модель: $model, текущая скорость: $currentSpeed")
    }
    fun accelerate(boost:Double){
        currentSpeed += boost
        if (currentSpeed>maxSpeed){
            println("Достигнут предел скорости!")
        }
    }
    fun decelerate(brake:Double){
        if(currentSpeed-brake<=0){
            println("Самолет остановился")
            currentSpeed = 0.0
        }else {
            currentSpeed -= brake
            println("Скорость опущена до $currentSpeed")
        }
    }
}

fun main() {
    val myPlane = Plane("Airbus",3500.5,3000.0)
    myPlane.showStatus()
    println("Введите ускорение: ")
    val boost = readln().toDoubleOrNull()?:0.0
    myPlane.accelerate(boost)
    myPlane.showStatus()
    println("Введите торможение: ")
    val brake = readln().toDoubleOrNull()?:0.0
    myPlane.decelerate(brake)
}
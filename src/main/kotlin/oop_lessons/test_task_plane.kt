package oop_lessons
data class Plane123(//renamed to Plane123
    val model:String,
    val category:String = "unknown",
    val speed: Double,
)
fun main() {
    val listOfPlanes = mutableListOf<Plane123>()
    while (true){
        var create = false
        println("Создать самолет?(true/false): ")
        create = readln().toBoolean()
        if (create) {
            val plane: Plane123 = createPlane()
            listOfPlanes.add(plane)
        }else break
    }
    printPlane(listOfPlanes)
}
fun createPlane(): Plane123 {
    println("Введите модель: ")
    val model = readln()
    println("Введите класс воздушного судна $model : ")
    val category = readln()
    println("Введите скорость $model : ")
    val speed = readln().toDoubleOrNull()?:0.0
    return Plane123(model,category,speed)
}
fun printPlane(planes: List<Plane123>) {
    for((index,plane) in planes.withIndex()){
        println("Самолет №${index+1}: ${plane.model},категория: ${plane.category}, скорость: ${plane.speed}")
    }
}
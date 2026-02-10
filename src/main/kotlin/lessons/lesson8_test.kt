package lessons

fun main() {
    val workouts = arrayOf("Присед","Жим","Становая")
    for (i in workouts){
        println("Упражнение номер ${workouts.indexOf(i)+1}: $i ")
    }
}
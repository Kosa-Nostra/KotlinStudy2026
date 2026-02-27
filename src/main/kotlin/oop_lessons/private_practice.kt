package oop_lessons

class Smartphone(
    val model: String,
    private var batteryLevel: Int,
){
    var osVersion:String="Android 16"
    private set
    fun playGame() {
        if (batteryLevel >= 10) {
            batteryLevel -= 10
            println("Играем... Заряд: $batteryLevel")
        } else {
            batteryLevel = 0 // Обнуляем на случай, если там было 5%
            println("Смартфон выключен. Зарядите устройство.")
        }
    }
    fun updateOS(newVersion: String) {
        osVersion = newVersion
    }
    fun showStats(){
        println("$model, $osVersion")
    }
}

fun main() {
    val phone1 = Smartphone("Pixel 10",100)
    for (i in 1..10){
        phone1.playGame()
    }
    phone1.showStats()
    phone1.updateOS("Android 17")
    phone1.showStats()
}

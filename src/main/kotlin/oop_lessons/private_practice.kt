package oop_lessons

class Smartphone(
    val model: String,
){
    var batteryLevel: Int = 0
        private set
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
        println("$model,$osVersion, $batteryLevel")
    }
    fun recharge(amount: Int){
        batteryLevel = (batteryLevel + amount).coerceAtMost(100)
        println("Текущий заряд: $batteryLevel")
    }
    fun setBatteryLevel(newLevel: Int){
        if (newLevel in 0..100){
            batteryLevel = newLevel
        }else println("Ошибка, недопустимое значение!")
    }
}

fun main() {
    val phone1 = Smartphone("Pixel 10")
    phone1.setBatteryLevel(9999)
    for (i in 1..10){
        phone1.playGame()
    }
    phone1.showStats()
    phone1.updateOS("Android 17")
    phone1.showStats()
    phone1.recharge(10)
    phone1.showStats()
}

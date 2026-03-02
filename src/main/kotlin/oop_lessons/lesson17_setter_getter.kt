package oop_lessons

class Thermostat(
    var roomName: String,
    private var isBoilerOn: Boolean = false,
){
    var currentTemp = 20
    private set
    fun setTemp(newTemp: Int) {
        if (newTemp > 35) {
            println("Ошибка, слишком высокая температура, установлено 35 градусов")
            currentTemp = 35
        }else
        if (newTemp in 10..35){
            currentTemp = newTemp
            println("Установлена температура $newTemp")
            when{
                currentTemp > 25 -> {
                    println("Включаю обогрев в $roomName")
                    isBoilerOn = true
                }
                currentTemp < 15 -> {
                    println("Выключаю всё!, слишком холодно")
                    isBoilerOn = false
                }
            }
        }else println("Ошибка, $newTemp вне безопасного диапазона")
    }
    fun showStatus(){
        println("Комната: $roomName, температура: $currentTemp, Обогрев: ${if(isBoilerOn)"ВКЛ" else {"ВЫКЛ"}}")
    }
}

fun main() {
    val term = Thermostat("Kitchen")
    term.setTemp(26)
    term.setTemp(5)
    term.showStatus()
    term.setTemp(14)
    term.showStatus()
    term.setTemp(100)
    term.showStatus()
}
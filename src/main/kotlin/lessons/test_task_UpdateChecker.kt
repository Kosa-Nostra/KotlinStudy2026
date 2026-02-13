package lessons

fun main() {
val updates = listOf("Security update","Driver update","macOs 26.2")
    for (i in updates){
        var isCharging: Boolean = false
        var batteryLevel: Int = 0
        var isWifi: Boolean = false
        println("Доступно новое обновление: $i")
        println("Подключено ли устройство к wifi?: ")
        isWifi = readln().toBoolean()
        println("Подключено ли зарядное устройство?: ")
        isCharging = readln().toBoolean()
        if (!isCharging){
            println("Зарядное устройство не обнаружено, введите уровень заряда: ")
            batteryLevel = readln().toIntOrNull()?:0
        }
        if(isUpdateAllowed(batteryLevel, isWifi, isCharging)){
            println("Начинаю обновление ...")
        }else if (!isWifi){
            println("Подключите устройство к WIFI")
        }else if (!isCharging && batteryLevel<50){
            println("Ошибка")
        }else if (!isCharging && batteryLevel>50){
            println("Начинаю обновление")
        }
        else println("Ошибка ...")
    }
}
fun isUpdateAllowed(battery: Int, isWifi: Boolean, isCharging: Boolean): Boolean = (battery>50 && isWifi) || (isCharging && isWifi)

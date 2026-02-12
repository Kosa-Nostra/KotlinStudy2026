package lessons

fun main() {
val batteryLogs = collectBatteryLogs()
    if (batteryLogs.isNotEmpty()) {
        for ((index,value) in batteryLogs.withIndex()) {
                println("Замер № ${index+1}: $value ${analyzeBatteryLevel(value)}")
        }
    }
}
fun analyzeBatteryLevel(level: Int): String {
    return when(level) {
        100->"Полный заряд"
        in 20..99 -> "Работаем стабильно"
        in 1..19 ->"Нужна зарядка"
        else->"Ошибка датчика"
    }
}
fun collectBatteryLogs(): List<Int>{
    println("Введите заряд батареи(0 для выхода): ")
    val batteryData = mutableListOf<Int>()
    var battery: Int
    while (true){
        battery = readln().toIntOrNull()?:continue
        if(battery==0)break
        if (battery !in 0..100){
            println("Введите корректное число!")
            continue
        }
        batteryData.add(battery)
    }
    return batteryData
}
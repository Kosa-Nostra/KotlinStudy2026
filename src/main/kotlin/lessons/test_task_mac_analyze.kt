package lessons

fun main() {
    val apps = listOf("IntelliJ IDEA", "Chrome", "Safari", "Spotify")
    for ((index, value) in apps.withIndex()) {
        println(getAction(isSystemStable(getTemp(), getRam())))
    }
}

fun isSystemStable(temp: Int, ram: Double): Boolean = temp < 80 && ram < 90.0
fun getAction(isSystemStable: Boolean): String {
    return if (isSystemStable) {
        "Всё ок, кодим дальше!"
    } else "Внимание, дай ноуту остыть!"
}

fun getTemp(): Int {
    println("Укажите температуру: ")
    return readln().toIntOrNull() ?: 0
}

fun getRam(): Double {
    println("Укажите нагрузку ОЗУ:")
    return readln().toDoubleOrNull() ?: 0.0
}
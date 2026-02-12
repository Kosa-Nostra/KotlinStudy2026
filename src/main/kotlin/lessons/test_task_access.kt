package lessons

fun main() {
    val queue = listOf<String>("Алексей", "Мария", "Иван")
    for (human in queue) {
        println("${human},введите возраст:")
        val age = readln().toIntOrNull() ?: 0
        println("${human},есть ли у вас карта?(true/false): ")
        val hasCard = readln().toBoolean()
        if (canEnter(age, hasCard)) {
            println("$human: проход разрешён")
        } else println("$human: проход воспрещён")
    }
}

fun canEnter(age: Int, hasCard: Boolean): Boolean {
    var status: Boolean = false
    if (age > 18 && hasCard) {
        status = true
    }
    return status
}
//функцию еще можно сократить до fun canEnter(age: Int, hasCard: Boolean) = age >= 18 && hasCard
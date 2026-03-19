package final_learning.task4.nullSafety

fun main() {
    val pilot_one = Pilot("Ayder", "MAR12344321123")
    val pilot_two = Pilot("John", null)
    val hangar = listOf<Aircraft>(
        Aircraft("A-330", pilot_one),
        Aircraft("A-380", pilot_two),
        Aircraft("F-22", pilot_one),
        Aircraft("MQ-9", null),
        Aircraft("MQ-1", null),
        Aircraft("TB-2", null),
    )
    hangar.find { it.model == "A-330" }.let { println(it?.pilot?.name) }
    hangar.also {
        println("В ангаре проверено судов: ${hangar.count()}")
    }
    hangar.find { it.model == "A-380" }?.apply { println("Сборка новой модели ${this.model} завершена") }
    println(hangar.find { it.model == "F-22" }?.model)
    val newPlane = hangar.find { it.model == "F-22" }.apply { this?.model = "F-35" }
    println(newPlane?.model)

}
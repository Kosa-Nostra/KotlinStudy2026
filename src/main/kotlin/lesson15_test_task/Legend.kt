package lesson15_test_task

abstract class Legend(
    val name: String,
    var health: Double,
)
{
    fun heal(){
        health = 100.0
        println("$name восстановил здоровье")
    }
    abstract fun ultimateAbility()
}
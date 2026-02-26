package lesson15_test_task

abstract class Legend(
    val name: String,
    var health: Double,
    var isAlive: Boolean=true,
)
{
    fun heal(){
        if (isAlive){
        health = 100.0
        println("$name восстановил здоровье")}else println("Легенда мертва")
    }
    abstract fun ultimateAbility()
}
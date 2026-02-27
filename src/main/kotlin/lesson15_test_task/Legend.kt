package lesson15_test_task

abstract class Legend(
    val name: String,
    var isAlive: Boolean=true,
)
{
    var health: Double= 100.0
        private set
    fun heal(){
        if (isAlive){
        health = 100.0
        println("$name восстановил здоровье")}else println("Легенда мертва")
    }
    fun setHealth(health: Double){
        this.health = health
    }
    abstract fun ultimateAbility()
}
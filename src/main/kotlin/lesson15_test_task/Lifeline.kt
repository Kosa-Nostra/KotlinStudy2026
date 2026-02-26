package lesson15_test_task

class Lifeline(
    health:Double,
    name:String="Lifeline",
): Legend(name, health), Support,Reviver {
    override fun ultimateAbility() {
        println("Heal drone released")
    }

    override fun dropLoot() {
       println("Loot has been dropped")
    }

    override fun revive(target: Legend) {
        target.isAlive = true
        target.health=20.0
        println("Legend: ${target.name} is revived by $name")
    }
}
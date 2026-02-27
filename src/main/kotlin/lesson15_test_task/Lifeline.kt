package lesson15_test_task

class Lifeline(
    health:Double,
    name:String="Lifeline",
): Legend(name), Support,Reviver {
    override fun ultimateAbility() {
        println("Heal drone released")
    }

    override fun dropLoot() {
       println("Loot has been dropped")
    }
}
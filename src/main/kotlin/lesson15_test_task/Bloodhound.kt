package lesson15_test_task

class Bloodhound(
    health:Double,
    name: String="Bloodhound",
): Legend(name,health), Recon,Reviver {
    override fun ultimateAbility() {
        println("Ability used by Bloodhound")
    }

    override fun scanArea() {
        println("Area scanned")
    }

    override fun revive(target: Legend) {
        target.isAlive = true
        target.health=20.0
        println("Legend: ${target.name} is revived by $name")
    }
}
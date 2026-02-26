package lesson15_test_task

class Bloodhound(
    health:Double,
    name: String="Bloodhound",
): Legend(name,health), Recon {
    override fun ultimateAbility() {
        println("Ability used by Bloodhound")
    }

    override fun scanArea() {
        println("Area scanned")
    }
}
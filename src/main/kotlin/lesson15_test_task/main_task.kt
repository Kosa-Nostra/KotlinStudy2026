package lesson15_test_task

fun main() {
    val char1 = Bloodhound(150.0)
//    char1.heal()
//    char1.scanArea()
//    char1.ultimateAbility()
    val char2 = Lifeline(100.0)
//    char2.heal()
//    char2.dropLoot()
//    char2.ultimateAbility()
val squad = listOf(char1, char2)
    println("Командная работа")
    squad.forEach { it.ultimateAbility()
        if (it is Recon) {it.scanArea()}
        if (it is Support) {it.dropLoot()}
    }
    println("Вылечить всю команду")
    squad.forEach { it.heal() }

}
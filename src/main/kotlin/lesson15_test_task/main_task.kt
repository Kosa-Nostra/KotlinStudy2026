package lesson15_test_task

fun main() {
    val char1 = Bloodhound(150.0)
    char1.isAlive = false
    val char2 = Lifeline(100.0)
    char2.revive(char1)
}
package lesson15

class StealthJet(
    name: String,

): BasePlane(name), StealthCapable {
    override fun attack() {
        println("$name атакует")
    }

    override fun activateStealth() {
        println("Невидимость активирована")
    }
}
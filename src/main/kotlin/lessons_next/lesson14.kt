package lessons_next

fun main() {
    val hangar = mutableListOf(
        Plane("C-17", 900.0, "Cargo"),
        Jet("F-22", 2100.0, "Fighter", gunType = "Vulcan"),
        Plane("An-225", 800.0, "Super Heavy")
    )
    hangar.forEach {
        it.boost()
        if (it is Jet){
            it.reloadGun()
        }
    }
}
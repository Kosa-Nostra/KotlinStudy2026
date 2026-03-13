package inheritance_task

class Dog(
    name: String,
    override val image: String = "\uD83D\uDC36"
):Animal(name,image) {
    override fun makeSound() {
        super.makeSound()
        println("Gaw gaw")
    }
}
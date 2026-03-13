package inheritance_task

class Cat(
    name: String,
    val isLazy: Boolean,
    override val image: String = "\uD83D\uDC31"
): Animal(name, image) {
    override fun makeSound() {
        if (isLazy) {
            println("Cat is sleep")
        }else {
            super.makeSound()
            println("meow!")
        }
    }
}
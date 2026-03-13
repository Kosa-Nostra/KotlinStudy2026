package inheritance_task

open class Animal(
    val name: String,
    open val image: String = "\uD83D\uDC3E",
) {
    open fun makeSound(){
        println("Animal make sound")
    }
    fun eat(){
        println("Animal: $name is eating")
    }
}
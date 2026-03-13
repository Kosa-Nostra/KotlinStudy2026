package inheritance_task

fun main() {
    val zoo = listOf<Animal>(
        Dog("Bulldog"),
        Cat("Some cat",true),
    )
    zoo.forEach {
        println(it.name)
        println(it.image)
        it.makeSound()
    }
}
package lesson18

open class Exercise(
    val name: String,
) {
    open fun start(){
        println("Подготовка к упражнению: $name")
    }
}
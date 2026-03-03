package lesson18

open class Exercise(
    val name: String,
    val duration: Int,
) {
    open fun start(){
        println("Подготовка к упражнению: $name")
    }
}
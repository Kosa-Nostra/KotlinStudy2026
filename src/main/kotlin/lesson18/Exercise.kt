package lesson18

open class Exercise(
    val name: String,
    val duration: Int,
    val intensity: Intensity,
) {
    open fun start(){
        val alert = when (intensity) {
            Intensity.HIGH -> " !!!"
            else -> ""
        }
        println("Подготовка к упражнению: $name$alert")
    }
}
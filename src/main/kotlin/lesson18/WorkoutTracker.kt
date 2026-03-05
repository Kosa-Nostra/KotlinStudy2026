package lesson18

open class Exercise(
    val name: String,
    val duration: Int,
    val intensity: Intensity,
    val restTime: Int = 30,
) {
    open fun start(){
        val alert = when (intensity) {
            Intensity.HIGH -> " !!!"
            else -> ""
        }
        println("Подготовка к упражнению: $name$alert")
    }
}
class Stretching: Exercise("Растяжка",100,Intensity.LOW) {
    override fun start() {
        super.start()
        println("Тянемся плавно") }
}
class PushUp:Exercise("Отжимания",0, Intensity.HIGH) {
    override fun start() {
        super.start()
        println("Отжимаемся! Считаю повторения")
    }
}
class Plank:Exercise("Планка",60, Intensity.MEDIUM) {
    override fun start() {
        super.start()
        println("Замираем! Запускаю таймер на 60 секунд")
    }
}
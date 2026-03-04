package lesson18

class Plank:Exercise("Планка",60, Intensity.MEDIUM) {
    override fun start() {
        super.start()
        println("Замираем! Запускаю таймер на 60 секунд")
    }
}
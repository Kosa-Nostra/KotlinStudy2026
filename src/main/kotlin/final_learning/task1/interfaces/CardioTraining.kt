package final_learning.task1.interfaces

data class CardioTraining(
    val distance: Double,
    val minutes: Int,
    override val title: String = "Кардио тренировка",
): Workout {
    override fun calculateXP(): Int {
        return ((distance*10)+minutes).toInt()
    }

    override fun getStatus(): String {
        return if (minutes >60){
            "EPIC"
        }else "CASUAL"
    }
}
package final_learning.task1.interfaces

data class CardioTraining(
    val distance: Double,
    val minutes: Int,
): Workout {
    override fun calculateXP(): Int {
        return ((distance*10)+minutes).toInt()
    }
}
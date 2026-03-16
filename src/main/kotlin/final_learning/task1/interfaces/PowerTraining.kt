package final_learning.task1.interfaces

data class PowerTraining(
    val weight: Double,
    val reps: Int,
    override val title: String = "Силовая тренировка"
): Workout {
    override fun calculateXP(): Int {
        return (weight * reps).toInt()
    }

    override fun getStatus(): String {
        return if (weight > 100){
            "HARD"
        }else "NORMAL"
    }
}
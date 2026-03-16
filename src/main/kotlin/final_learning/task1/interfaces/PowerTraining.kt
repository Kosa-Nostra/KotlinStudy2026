package final_learning.task1.interfaces

data class PowerTraining(
    val weight: Double,
    val reps: Int,
): Workout {
    override fun calculateXP(): Int {
        return (weight * reps).toInt()
    }
}
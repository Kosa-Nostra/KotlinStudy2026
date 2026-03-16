package final_learning.task2.interfaces

open class Aircraft(
    val model: String,
    val maxSpeed: Int,
): Flyable {
    override fun takeOff(): String {
        return "Самолет $model взлетает!"
    }

    override fun land(): String {
        return "Самолет $model приземляется!"
    }
}
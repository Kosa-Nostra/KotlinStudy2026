package final_learning.task3.interfaces

import final_learning.task2.interfaces.Flyable

open class Aircraft(
    val model: String,
    val maxSpeed: Int,
): Flyable, Serviceable {
    override fun takeOff(): String {
        return "Самолет $model взлетает!"
    }

    override fun land(): String {
        return "Самолет $model приземляется!"
    }
}
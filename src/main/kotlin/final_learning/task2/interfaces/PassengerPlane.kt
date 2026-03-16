package final_learning.task2.interfaces

class PassengerPlane(
    model: String,
    val numberOfPassengers: Int,
    maxSpeed: Int,
): Aircraft(model, maxSpeed) {
    override fun takeOff(): String {
        val parentAction = super.takeOff()
        return "$parentAction.Начата диагностика всех систем авиалайнера"
    }
    override fun land(): String {
        val parentAction = super.land()
        return "$parentAction.Выполняется рулёжка к терминалу аэропорта"
    }
}
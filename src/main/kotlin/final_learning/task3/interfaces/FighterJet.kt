package final_learning.task3.interfaces

class FighterJet(
    model: String,
    maxSpeed: Int,
    val hasWeapons: Boolean,
): Aircraft(model, maxSpeed) {
    override fun takeOff(): String {
        val parentAction = super.takeOff()
        return "$parentAction.И направляется в зону боевой задачи"
    }
    override fun land(): String {
        val parentAction = super.land()
        return "$parentAction.Выпуск парашюта для торможения"
    }

    override fun repair(): String {
        val defaultRepair = super.repair()
        return "$defaultRepair. Оружие перезаряжено, системы наведения в норме"
    }
}
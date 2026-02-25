package lesson15

abstract class BasePlane(
    val name: String,
) {
    fun takeoff(){//общий метод для всех
        println("$name взлетает")
    }

    abstract fun attack()//абстрактный метод(БЕЗ ТЕЛА!), типо все самолеты как то атакуют, но как - решай сам

}
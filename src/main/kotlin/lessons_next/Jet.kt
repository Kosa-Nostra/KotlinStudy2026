package lessons_next

class Jet(
    name: String,
    speed: Double,
    type: String,
    val gunType: String,
    unmanned: Boolean = false,
): Plane(name,speed, type,unmanned){
    fun reloadGun(){
        println("$name: Перезарядка")
    }
    override fun boost(){
        super.boost()//вызов изначального родительского метода
        println("${name}:Включен турбо режим")
    }
}
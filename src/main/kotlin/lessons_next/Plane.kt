package lessons_next

open class Plane(
    val name: String,
    val speed: Double,
    val type: String,
    val unmanned: Boolean= false,
){
    fun switchRadar(){
        println("$name: Радар активен")
    }
    open fun boost(){
        println("$name: Скорость увеличена;")
    }
}
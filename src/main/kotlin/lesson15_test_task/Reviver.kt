package lesson15_test_task

interface Reviver {
    fun revive(target: Legend){
        if(target.isAlive){
            println("Target is alive already!")
        }else{
        target.isAlive = true
        target.setHealth(20.0)
        println("Legend: ${target.name} is revived")}
    }
}
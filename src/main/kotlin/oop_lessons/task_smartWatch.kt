package oop_lessons

class SmartWatch(
    var goal:Int = 10000
){
    var steps: Int = 0
        private set
    init {
        if (goal<0){
            println("Вы не можете установить отрицательное количество шагов!")
            goal = 0
        }
    }
    fun addSteps(amount: Int) {
        steps += amount
        println("Добавлено $amount шагов")
        println("Текущий показатель: $steps")
        if ((goal>0)&&steps>=goal){
            println("Цель в $goal шагов достигнута!")
        }
    }
}

fun main() {
    println("Введите вашу цель по шагам: ")
    val goal: Int = readln().toInt()
    val mySmartWatch = SmartWatch(goal)
    while(mySmartWatch.steps<goal){
        println("Введите количество пройденных шагов: ")
        mySmartWatch.addSteps(readln().toInt())
    }
}
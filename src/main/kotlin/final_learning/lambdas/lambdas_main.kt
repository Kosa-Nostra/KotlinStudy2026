package final_learning.lambdas

fun main() {
    saySomething("Ayder"){println(it)}
    saySomething("Ayder"){
        name -> println("Тут : ${name.length} букв")
    }
    saySomething("Ayder"){
        name -> println("Наоборот будет: ${name.reversed()}")
    }
    calculate(5,4){a,b->println("Умножение($a,$b): ${a*b} ")}
    println("Просто не хочу терять серию на гите :)")
}
fun saySomething(name: String, speech: (String)->Unit){//speech - это какое-то действие
    speech(name)
}
fun calculate(num1: Int, num2: Int, action: (Int,Int)->Unit){ action(num1,num2)}
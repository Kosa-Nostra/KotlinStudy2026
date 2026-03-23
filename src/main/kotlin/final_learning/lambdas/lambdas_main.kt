package final_learning.lambdas

fun main() {
    saySomething("Ayder"){println(it)}
    saySomething("Ayder"){
        name -> println("Тут : ${name.length} букв")
    }
    saySomething("Ayder"){
        name -> println("Наоборот будет: ${name.reversed()}")
    }
}
fun saySomething(name: String, speech: (String)->Unit){//speech - это какое-то действие
    speech(name)
}
package lessons

fun main() {
    val list1 = mutableListOf<String>("Жим","Становая","Присед","Махи гантелями")
    list1.sort()
    list1.add("Тяга верхнего блока")
    list1.add(5,"Подъем штанги")
//    println(list1.contains("Присед"))
//    println(list1.indexOf("Жим"))
    list1.forEach {
        println("Упражнение №${list1.indexOf(it)+1}: $it")
    }
    val upper = list1.filter {
        it == "Махи гантелями" || it == "Жим"
    }
    println("Упражнения для верха тела:")
    upper.forEach {
        println("№${upper.indexOf(it)+1}: $it")

    }
}
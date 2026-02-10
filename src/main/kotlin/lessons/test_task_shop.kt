package lessons

fun main() {
    println("Введите цену: ")
    val price = readln().toDoubleOrNull() ?: 0.0
    println("Введите количество товара: ")
    val amount: Int = readln().toIntOrNull() ?: 0
    println("Введите ваш уровень лояльности: ")
    val loyalty = readln().toIntOrNull() ?: 0
    val sum = price*amount
    val skidka: Double = when{
        sum > 5000.0 -> {
            println("Применена скидка 10%")
            sum*0.10}
        sum in 2000.0..5000.0 ->{
            println("Применена скидка 5%")
            sum*0.05}
        else-> 0.0
    }
    val finalSum: Double = (sum-skidka)
    val bonus = when(loyalty){
        1-> finalSum+100
        2->finalSum+0
        3->finalSum-200
        else-> {
            println("у нас всего 3 уровня лояльности")
            finalSum
        }
    }
    if (bonus <0){
        println("Товар бесплатно, ваша лояльность всё покрывает")
    }else{
        println("Итого к оплате: $bonus")
    }
}
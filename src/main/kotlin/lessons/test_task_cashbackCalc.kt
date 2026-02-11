package lessons

fun main() {
    val purchases = inputPurchasesPrices()
    if (purchases.isNotEmpty()) {
        println("Введите стоимость вашей покупки(0 для выхода): ")
        for (i in purchases) {
            println("Покупка: $i , кэшбэк: ${calculateCashback(i)}")
        }
    }else println("Список покупок пуст")
}
fun calculateCashback(price: Double): Double{
    return when{
        price > 1000.0 -> price*0.1
        else->price*0.02
    }
}
fun inputPurchasesPrices(): MutableList<Double>{
    println("Введите стоимость вашей покупки(0 для выхода): ")
    val purchases = mutableListOf<Double>()
    while (true){
        val price = readln().toDoubleOrNull()?: continue
        if (price == 0.0){break}
        else if (price<0){
            println("Вы платили магазину? :)")
            println("Введите стоимость заново: ")
            continue
        }
        purchases.add(price)
    }
    return purchases
}
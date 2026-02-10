package lessons

fun main() {
var balance: Double = 0.0
while (balance<15000){
        println("Сколько сегодня отложим в копилку?")
        var sum = readln().toDoubleOrNull() ?: 0.0
    balance += sum
    println("Сейчас в копилке $balance")
    println("Осталось накопить ${15000-balance}")
    if (balance>=15000.0){
        println("ура, можно идти в магазин!")
    }
    }
}
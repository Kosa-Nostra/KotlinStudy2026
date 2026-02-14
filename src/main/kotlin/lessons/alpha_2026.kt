package lessons

const val BALANCE = 100000.0
fun main() {
    val expenses = mutableListOf<Double>()
    println("Какая у вас цель?: ")
    val target: String = readln()
    println("Какова стоимость для \"$target\"?")
    val price: Double = readln().toDoubleOrNull() ?: 0.0
    println("Введите список ваших текущих трат(0 для выхода): ")
    while (true) {
        val expense = readln().toDoubleOrNull() ?: 0.0
        if (expense==0.0){break}
        else if (expense<0.0){
            println("Введите корректные данные!")
            continue
        }
        expenses.add(expense)
    }
    finalReview(target,price,expenses,expenses.sum())
}

fun analyzePossibility(allExpenses: Double, priceOfTarget: Double, balance: Double): String {
    val remainingMoney = balance - allExpenses
    return when {
        priceOfTarget>remainingMoney->"Пока что цель вне досягаемости"
        (priceOfTarget>(remainingMoney/2.0))->"Рискованно, но достижимо!"
        else-> "Цель достижима!"
    }
}
fun weekExpenses(allExpenses: Double): String {
    return when(allExpenses){
        in 0.0..10000.0->"Экономный режим"
        in 10001.0..50000.0->"Умеренные траты"
        else -> "Высокие траты"
    }
}
fun finalReview(target: String,priceOfTarget: Double,listOfExpenses: List<Double>, allExpenses:Double){
    println("Цель: $target")
    println("Цена: $priceOfTarget")
    println("Траты: ")
    for((index,expense) in listOfExpenses.withIndex()) {
        println("№:${index+1}: $expense")
    }
    println("Общая сумма всех расходов: ")
    println(allExpenses)
    println(weekExpenses(allExpenses))
    println(analyzePossibility(allExpenses, priceOfTarget,BALANCE))
}
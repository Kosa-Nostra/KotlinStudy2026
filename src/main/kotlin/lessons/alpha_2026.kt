package lessons

const val BALANCE = 100000.0
data class PurchaseGoal(
    val target: String,
    val price: Double,
    val expenses: List<Double>,
)
fun main() {
    val myGoal = collectGoalData()
    analyzePossibility(myGoal,BALANCE)
    weekExpenses(myGoal.expenses.sum())
    finalReview(myGoal)
}
fun collectGoalData(): PurchaseGoal{
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
    return PurchaseGoal(target,price,expenses)
}
fun analyzePossibility(goal: PurchaseGoal, balance: Double): String {
    val remainingMoney = balance - goal.expenses.sum()
    return when {
        goal.price>remainingMoney->"Пока что цель вне досягаемости"
        (goal.price>(remainingMoney/2.0))->"Рискованно, но достижимо!"
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
fun finalReview(goal: PurchaseGoal){
    println("Цель: ${goal.target}")
    println("Цена: ${goal.price}")
    println("Траты: ")
    for((index,expense) in goal.expenses.withIndex()) {
        println("№:${index+1}: $expense")
    }
    println("Общая сумма всех расходов: ")
    println(goal.expenses.sum())
    println(weekExpenses(goal.expenses.sum()))
    println(analyzePossibility(goal,BALANCE))
}
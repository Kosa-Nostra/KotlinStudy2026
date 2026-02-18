package oop_lessons

class BankAccount(
    val owner: String,
    private var balance: Double,
){
    init {
        if (balance < 0.0) {
            println("Баланс не может быть $balance, установлено 0.0")
            balance = 0.0
        }
    }
    fun getBalance(): Double {//геттер
        return balance
    }
    fun showBalance() {
        println(getBalance())
    }
    fun putMoney(){
        println("Введите сумму для пополнения: ")
        balance += readln().toDoubleOrNull()?:0.0
        showBalance()
    }
    fun withdrawMoney(){
        println("Введите сумму для снятия: ")
        val withdraw = readln().toDoubleOrNull()?:0.0
        if (balance-withdraw < 0.0){
            println("Недостаточно средств")
        }else balance -= withdraw
        showBalance()
    }
}

fun main() {
    val myBankAccount = BankAccount("Ayder",100000.0)
    while (true) {
        println("Выберите операцию: ")
        println("Пополнить счёт - 1")
        println("Снять деньги - 2")
        println("Показать баланс - 3")
        println("Выход - 0")
        val choice = readln().toIntOrNull()
        if (choice == 0) {break}
        if (choice in 1..3) {
            when (choice) {
                1 -> myBankAccount.putMoney()
                2 -> myBankAccount.withdrawMoney()
                3 -> myBankAccount.showBalance()
            }
        } else println("Выберите пункт из списка!")
    }
}
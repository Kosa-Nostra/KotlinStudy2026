package oop_lessons

class SmartWallet(
    val owner: String,
) {
    var balance: Double = 0.0
    private set
    init {
        if (balance<0.0){
            println("Вы не можете ввести отрицательный баланс, установлено 0.0")
            balance = 0.0
        }
    }
    fun addMoney(amount: Double) {
        balance += amount
        println("Текущий баланс: $balance")
    }
    fun pay(amount: Double,category: String) {
        if (balance>=amount){
            balance -= amount
            println("Оплачено: $amount руб. в категории: $category")
        }else println("Недостаточно средств для оплаты в категории \"$category\" :(")
    }
}

fun main() {
    val myWallet = SmartWallet("Ayder")
    println("Выберите операцию: ")
    while (true){
        println("1-Пополнить счёт")
        println("2-Оплатить")
        println("3-Посмотреть баланс")
        println("0-Выход")
        val choice:Int = readln().toInt()
        when(choice){
            1->{
                println("Введите сумму для пополнения:")
                val addAmount:Double = readln().toDouble()
                myWallet.addMoney(addAmount)
            }
            2->{
                println("Введите сумму к оплате: ")
                val payAmount:Double = readln().toDouble()
                if(myWallet.balance>=payAmount) {
                    println("Введите категорию: ")
                    val category: String = readln()
                    myWallet.pay(payAmount, category)
                }else println("Недостаточно средств")
            }
            3->println("Баланс: ${myWallet.balance}")
            0->break
        }

    }
}
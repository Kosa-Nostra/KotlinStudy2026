package oop_lessons

data class Product(
    private val name: String,
    private var quantity: Int,
    private var price: Double,
){
    fun printInfo(){
        println("Товар: $name, количество: $quantity, цена за ед.: $price")
    }
    fun sell(amount: Int){
        if (quantity>=amount){
            quantity -= amount
            println("Продано $amount шт.")
        }else{
            println("Недостаточно товара на складе!")
        }
    }
}

fun main() {
    val product1 = Product("Macbook",23,80000.0)
    val product2 = Product("LG tb",10,90000.0)
    val product3 = Product("Samsung",49,60000.0)
    val listOfProducts = mutableListOf<Product>(product1,product2,product3)
   listOfProducts.forEach {
       it.printInfo()
   }
    product1.sell(22)
    product2.sell(13)
    product3.sell(12)
    listOfProducts.forEach {
        it.printInfo()
    }
}
package oop_lessons

class Car(
    val model: String,
    initialPrice:Double,
) {
    var price: Double = if(initialPrice > 0.0) initialPrice else 0.0
        private set
    var isSold: Boolean = false
        private set
    fun sell() {
        isSold = true
    }

}
fun showCars(cars: List<Car>) {
    for ((index, car) in cars.withIndex()) {
        println("Автомобиль №${index + 1}: ${car.model}, стоимость: ${car.price} руб., статус: ${if (car.isSold) "Продана" else "Доступна"} ")
    }
}
fun buyCar(cars: List<Car>){
    println("Введите номер желаемого авто(от 1 до ${cars.size}): ")
    val input = readln().toInt()
    val index = input-1
    if (index in cars.indices){
        val selectedCar = cars[index]//берем нужную машину из списка
        if (selectedCar.isSold) {
            println("Простите, но машина ${selectedCar.model} уже продана")
        }else{
            selectedCar.sell()
            println("Поздравляем, вы купили ${selectedCar.model} за ${selectedCar.price} руб.")
        }
    }else println("Машина с номером $input не найдена!")
}
fun main() {
    val car1 = Car("Cadillac Escalade",2900000.0)
    val car2 = Car("ZAZ Sens",3500000.0)
    val car3 = Car("Kia Sportage",1500000.0)
    val carList = mutableListOf<Car>(car1, car2, car3)
    while(true){
        println("Выберите пункт меню: ")
        println("Показать список авто - 1")
        println("Купить авто - 2 ")
        println("Выход - 0")
        val choice = readln().toInt()
        if (choice == 0) {break}
        if (choice in 1..2){
            when (choice) {
                1-> showCars(carList)
                2 -> buyCar(carList)
            }
        }
    }
}
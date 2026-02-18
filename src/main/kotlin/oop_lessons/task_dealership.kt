package oop_lessons

class Car(
    private var model: String,
    private var price: Double,
    private var isSold: Boolean = false,
){
    init {
        if(price<0.0){
            println("Вы не можете установить цену $price, установлено 0.0")
            price = 0.0
        }
    }
    fun getModel(): String {
        return model
    }
    fun getPrice(): Double {
        return price
    }
    fun isSold(): Boolean {
        return isSold
    }
    fun sell(){
        isSold = true
    }
}
fun showCars(cars: List<Car>){
    for((index, car) in cars.withIndex()){
        println("Автомобиль №${index+1}: ${car.getModel()}, стоимость: ${car.getPrice()} руб., статус: ${if (car.isSold())"Продана" else "Доступна"} ")
    }
}
fun buyCar(cars: List<Car>){
    println("Введите номер желаемого авто(от 1 до ${cars.size}): ")
    val input = readln().toInt()
    val index = input-1
    if (index in cars.indices){
        val selectedCar = cars[index]//берем нужную машину из списка
        if (selectedCar.isSold()) {
            println("Простите, но машина ${selectedCar.getModel()} уже продана")
        }else{
            selectedCar.sell()
            println("Поздравляем, вы купили ${selectedCar.getModel()} за ${selectedCar.getPrice()} руб.")
        }
    }else println("Машина с номером $input не найдена!")
}
fun main() {
    val car1 = Car("Cadillac Escalade",12000000.0,false)
    val car2 = Car("ZAZ Sens", 350000.0,false)
    val car3 = Car("Kia Sportage",1500000.0,true)
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
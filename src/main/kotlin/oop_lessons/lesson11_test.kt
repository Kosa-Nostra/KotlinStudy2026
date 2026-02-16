package oop_lessons
data class Car(
    val brand: String,
    val model: String,
    val mileage: Double,
    val lastServiceMileage: Double,
)
fun main() {
    val myCar = getCarInfo()
    checkService(myCar)
}
fun getCarInfo(): Car{
        println("Введите марку авто: ")
        val brand: String = readln()
        println("Введите модель авто: ")
        val model: String = readln()
        println("Введите пробег авто: ")
        val mileage = readln().toDoubleOrNull()?:0.0
        println("Введите пробег на последнем ТО: ")
        val lastServiceMileage = readln().toDoubleOrNull()?:0.0
    return Car(brand,model, mileage, lastServiceMileage)
}
fun checkService(car: Car){
    if ((car.mileage - car.lastServiceMileage)>10000) {
        println("Машине ${car.brand} ${car.model} пора на сервис!")
    }else{
        println("С машиной ${car.brand} ${car.model} всё в порядке, можно ездить еще ${10000-(car.mileage-car.lastServiceMileage)} км")
    }
}

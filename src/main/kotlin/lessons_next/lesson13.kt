package lessons_next
//Урок 13: NullPointerException
class Passenger(
    var name: String,
    var passportNumber: String?,//может быть null если еще не ввели данные
    var baggageWeight: Double?,//null будет если без багажа
)

fun main() {
    val passenger1 = Passenger("Ayder",1234123321.toString(), 2.0)
    val passenger2 = Passenger("Anonymous",null,null)
    checkInfo(passenger1)
    checkInfo(passenger2)
    val listOfPassengers = listOf(passenger1, passenger2)
    val allWeight = listOfPassengers.sumOf { it.baggageWeight?:0.0 }
    println("Общий вес багажа: $allWeight кг")
    listOfPassengers.forEach {
        println("Длина номера паспорта(${it.name}): ${it.passportNumber?.length ?: 0}")
    }
}
fun checkInfo(passenger: Passenger){
    println(passenger.passportNumber?:"Данные не заполнены")
    println(passenger.baggageWeight?:0.0)
}
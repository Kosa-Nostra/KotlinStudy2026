package oop_lessons

class Employee(
    val name: String,
    val role: String,
    inputCode:Int
){
    var isAccessGranted: Boolean = if (inputCode == 2026) true else false
        private set
    fun checkAccess(){
        println("Сотрудник: $name($role); Доступ: ${if (isAccessGranted)"Доступ разрешен" else "Отказано в доступе"}")
    }
}

fun main() {
    val guy1 = Employee("guy1", "admin",2026)
    val guy2 = Employee("guy2", "admin",1515)
    val listOfEmployees = mutableListOf<Employee>(guy1, guy2)
    listOfEmployees.forEach {
        it.checkAccess()
    }
}
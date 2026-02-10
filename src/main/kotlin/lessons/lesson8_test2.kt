package lessons

fun main() {
    val records = IntArray(3)
    for (i in records.indices){
        println("Введите ваш рекорд №${i+1}: ")
        records[i]=readln().toIntOrNull() ?: 0
    }
    for (i in records.indices){
        println("Рекорд №${i+1}: ${records[i]}")
    }
}
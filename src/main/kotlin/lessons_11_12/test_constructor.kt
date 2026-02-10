package lessons_11_12

import java.awt.print.Book

class book(val title: String, val author: String,val year: Int = 2024) {
    init {
        require(title.isNotBlank()) { "Название не может быть пустым" }
        println("Создана книга под названием $title")
    }
    constructor(title: String):this(title, "Неизвестен")
    }

fun main() {
    val book1 = book("Война и мир","Толстой", 1869)
    val book2 = book("Тестовая книга")
    println(book1.title)
    println(book1.author)
    println(book1.year)
    println(book2.title)
    println(book2.author)
    println(book2.year)
}

package lessons

fun main() {
    var pushUps = 10
    var day = 1
    for (i in 1..7){
        println("День $day: сегодня отжимаемся $pushUps раз")
        day++
        pushUps +=2
    }
}
package org.example.lessons_1_10

fun main() {
//    диапазоны (инетрвалы)
    val range0: IntRange = 0..12
    val range: IntRange = 42..442
    val range2: IntRange = 42 until 442
    val range3: LongRange = 42L..442L
    val range4: CharRange = 'a'..'z'
    val range5: ClosedRange<Double> =  42.1..442.1
    val range6: ClosedRange<Float> = 24.1f..442.1f

    val range7: IntProgression = 42..442 step 2
    val range8: IntProgression = 442 downTo 42 step 2

//    in, !in
    val a = 52 in range
    val b = 52 !in range
    println(a)
    println(b)

//    for
//    break,continue, return
    for(i in 5 downTo 1){
        if(i == 3){
//            println("юзер нажал на кнопку \"Пропустить\"")
//            break
//
            return
        }
        println("Реклама закончится через $i")
        Thread.sleep(1000)
    }
    println("Продолжение работы вне цикла")
//    for(i in range2 step 8){
//        println(i)
//    }
}
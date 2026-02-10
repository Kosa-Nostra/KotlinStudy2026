package lessons

fun main() {
    var allWeights = 0
    var maxWeight = 0
    var minWeight = 0
    val days = IntArray(7)
    for(i in days.indices){//ввод данных и общий вес
        println("Введите вес в упражнении за день №${i+1}:")
        val weight = readln().toIntOrNull() ?: 0
        days[i]=weight
        allWeights += weight
        if(weight>0 &&(weight<minWeight || minWeight==0)){
            minWeight=weight
        }
        if (weight >= maxWeight){
            maxWeight = weight
        }
    }
    val averageWeight = allWeights.toDouble()/7
    println("Общий вес: $allWeights кг")
    println("Средний вес: $averageWeight кг")
    println("Рекордный вес: $maxWeight кг")
    println("Худший вес: $minWeight кг")
    print("Пропущенные дни: ")
    for(i in days.indices){
        if (days[i]==0){
            print(" №${i+1}")
        }
    }
    println()
    if (averageWeight<50){
        println("На этой неделе ты отдыхал, пора поднажать")
    }else if (averageWeight in 50.0..100.0){
        println("Хорошая работа, есть куда расти")
    }else{
        println("Мощная неделя! Так держать!")
    }
    println("Обновлённые веса:")
    for (i in days.indices){
        days[i]=days[i] * 2
    }
    print(days.contentToString())

}
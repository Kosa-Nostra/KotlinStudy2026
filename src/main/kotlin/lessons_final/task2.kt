package lessons_final

data class Exercise(
    val name: String,
    val weight: Double,
    val reps: Int,
)
data class TrainingDay(
    val date: String,
    val listOfExercises: List<Exercise>,
)
fun TrainingDay.intensity(): Double{
    return if(listOfExercises.isEmpty()) 0.0 else{
        (listOfExercises.sumOf { it.weight * it.reps }/listOfExercises.sumOf { it.reps })
    }//average weight
}
fun main() {
    val upperBody = listOf<Exercise>(
        Exercise("Жим гантелей в наклоне", 50.0,10),
        Exercise("Тяга верхнего блока",60.0,10),
        Exercise("Сгибания на трицепс в блоке",55.0,15)
    )
    val lowerBody = listOf<Exercise>(
        Exercise("Жим ногами",100.0,10),
        Exercise("Разгибания ног",55.0,24),
        Exercise("Сгибания ног",60.0,15)
    )
    val trainingWeek = listOf<TrainingDay>(
        TrainingDay("09.03.2026",upperBody),
        TrainingDay("10.03.2026",lowerBody),
        TrainingDay("11.03.2026",listOf()),//restDay
        TrainingDay("12.03.2026",upperBody),
        TrainingDay("13.03.2026",lowerBody),
    )
    trainingWeek.forEach {
        println("Дата: ${it.date},Интенсивность: ${it.intensity()},Статус: ${if (it.intensity()>60.0)"Тяжелая тренировка" else "Легкая тренировка"}  ")
    }
    println("Список тренировочных дней: ")
    trainingWeek.filter { it.listOfExercises.isNotEmpty() }.forEach { println(it.date)  }
    val hardest = trainingWeek.maxByOrNull { it.intensity() }
    println("Самый тяжелый тренировочный день: ${hardest?.date}, ${hardest?.intensity()}")
}
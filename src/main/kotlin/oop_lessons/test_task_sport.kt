package oop_lessons
data class Athlete(
    val name: String,
    val sport: String,
    val trainingHourPerWeek: Double,
    val isProfessional: Boolean,
)
fun main() {
val someAthlete = registerAthlete()
    getTrainingStatus(someAthlete)
}
fun registerAthlete(): Athlete{
    println("Ваше имя: ")
    val name = readln()
    println("Ваша спортивная дисциплина: ")
    val sport = readln()
    println("Сколько часов в неделю тренируетесь?: ")
    val trainingHourPerWeek = readln().toDoubleOrNull()?:0.0
    println("Вы профессионал?(true/false): ")
    val isProfessional = readln().toBoolean()
    return Athlete(name,sport,trainingHourPerWeek,isProfessional)
}
fun getTrainingStatus(athlete: Athlete){
    if (athlete.isProfessional){
        println("\"${athlete.name}\" — серьезный профи в дисциплине \"${athlete.sport}\"!")
    }else if(athlete.trainingHourPerWeek > 10.0){
        println("У атлета \"${athlete.name}\" отличный темп подготовки")
    }else println("Атлет \"${athlete.name}\" занимается для души")
}
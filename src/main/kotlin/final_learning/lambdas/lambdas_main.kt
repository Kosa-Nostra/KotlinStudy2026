package final_learning.lambdas

fun main() {
    saySomething("Ayder"){println(it)}

}
fun saySomething(name: String, speech: (String)->Unit){
    speech(name)
}
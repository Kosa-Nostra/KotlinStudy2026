package lessons

fun main() {
    val a = 23
    val b = 7
    val c: Int
    c = a+b
    println(c)
    var ctr = 15
    println(ctr)
    println(ctr++)
    println(ctr)
    var srav: Boolean
    srav = a==b
    println(srav)
    println(a==b)
    println(a!=b)

    val a1: Int = 9
    val a2: Double = 9.0
    val a3 = a1+a2
    println(a3)
    println(a3::class.simpleName)
    val tip = a3::class.simpleName
    println("a3 успешно приведено к $tip")
}
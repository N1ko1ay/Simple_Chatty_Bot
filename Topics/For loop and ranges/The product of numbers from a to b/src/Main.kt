fun main() {
    val a = readln().toLong()
    val b = readln().toLong()
    var res :Long = 1
    for (i in a until b) {
        res *= i
    }
    println(res)
}
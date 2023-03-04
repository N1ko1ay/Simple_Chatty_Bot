fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    val e = readln().toInt()
    if (e in a..b || e in c..d) {
        println("true")
    } else {
        println("false")
    }
}
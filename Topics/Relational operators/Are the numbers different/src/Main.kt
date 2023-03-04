fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val res = a != b && b != c && a != c
    println(res)
}


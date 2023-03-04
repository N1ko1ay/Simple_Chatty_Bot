fun main() {
    var sum = 0
    do {
        val i = readln().toInt()
        sum += i
    } while (i != 0)
    println(sum)
}
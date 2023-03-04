fun main() {
    val n = readln().toInt()
    var sum = 0
    var i = 0
    repeat(n) {
       i = readln().toInt()
       sum += i
    }
    println(sum)
}
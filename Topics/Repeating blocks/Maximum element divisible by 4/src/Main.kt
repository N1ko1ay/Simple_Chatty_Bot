fun main() {
    val inp = readln().toInt()
    var max = 0
    repeat(inp) {
        val num = readln().toInt()
        if (num % 4 == 0 && num >= max) {
            max = num
        }
    }
    println(max)
}

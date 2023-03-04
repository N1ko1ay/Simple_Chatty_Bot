fun main() {
    val n = readln().toInt()
    var i = 0
    var min = 0
    repeat(n) {
        i = readln().toInt()
        if (i < min) {
            min = i
        } else if (i > min && min == 0) {
            min = i
        }
    }
    println(min)
}

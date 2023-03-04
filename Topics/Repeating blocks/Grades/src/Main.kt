fun main() {
    val student = readln().toInt()
    var A = 0
    var B = 0
    var C = 0
    var D = 0
    repeat(student) {
        val num = readln().toInt()
        if (num == 2) {
            D++
        } else if (num == 3) {
            C++
        } else if (num == 4) {
            B++
        } else if (num == 5) {
            A++
        }
    }
    println("$D $C $B $A")
}
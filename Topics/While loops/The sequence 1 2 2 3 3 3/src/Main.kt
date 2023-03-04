fun main() {
    val n = readln().toInt()
    var num = 0
    var num2 = 0
    while (num2 <= n) {
        repeat(num) {
        if (num2 < n) {
            print("$num ")
            num2++
        } else return
    }
        num++
    }
}
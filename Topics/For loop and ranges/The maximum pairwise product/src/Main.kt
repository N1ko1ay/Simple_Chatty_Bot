fun main() {
    val n = readln().toInt()
    if (n == 1) {
        println(readln().toInt())
    } else {
        var arr = Array(n) { readLine()!!.toInt() }
        arr.sortDescending()
        print(arr[0] * arr[1])
    }
}
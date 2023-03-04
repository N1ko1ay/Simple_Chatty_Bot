import java.util.Scanner
fun main() {
    var count = 0
    var i = 0
    var int = Int.MIN_VALUE
    val scanner = Scanner(System.`in`)
    while (scanner.hasNextInt()) {
        i++
        var next = scanner.nextInt()
        if (int < next) {
            int = next
            count = i
        }
    }
    print(int)
    print(" $count")
}
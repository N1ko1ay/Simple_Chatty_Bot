fun main() {
    var num = readln().toInt()
    print("$num ")
    do {
        if (num % 2 == 0) {
            num /= 2
            print("$num ")
        } else if (num != 1) {
            num = num * 3 + 1
            print("$num ")
        }
    } while (num != 1)
}
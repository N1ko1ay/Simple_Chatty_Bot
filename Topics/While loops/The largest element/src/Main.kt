fun main() {
    var max = 0
    do {
        val i = readln().toInt()
        if (i > max){
            max = i
        }
    } while (i != 0)
    println(max)
}
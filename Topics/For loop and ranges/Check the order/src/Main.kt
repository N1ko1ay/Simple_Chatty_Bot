import java.util.*
fun isSorted(a: IntArray): Unit{
    for (i in 0 until a.size - 1){
        if (a[i] > a[i + 1]) return println("NO")  }
    return println("YES") }
fun createArray(number:Int): IntArray{
    val scanner = Scanner(System.`in`)
    val array = IntArray(number)
    for (i in 1..number) {  array[i - 1] = scanner.nextInt()  }
    return array }
fun main() {
    val scanner = readln().toInt()
    val n = scanner
    val sortedArray = createArray(n)
    isSorted(sortedArray) }

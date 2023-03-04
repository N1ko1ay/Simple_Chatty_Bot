fun isRightEquation(a: Int, b: Int, c: Int): Boolean = a * b == c // write your code here

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(isRightEquation(a, b, c))
}
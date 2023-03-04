fun getLastDigit(a: Int) = a.toString().last() // write your code here

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}
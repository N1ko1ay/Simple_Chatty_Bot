fun main() {
    val value = readLine()!!.toInt() 
    var yes = false 
    if (value > -15 && value <= 12) {yes = true} 
    if (value > 14 && value < 17) {yes = true} 
    if (value >= 19) {yes = true} 
    print(if(yes) "True" else "False")

}

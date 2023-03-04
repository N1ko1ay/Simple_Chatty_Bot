fun main() {
    val i :Char = readln().first()
    if (i.isUpperCase() == true || i >= '\u0031' && i <= '\u0039') {
        println(true)
    } else {
        println(false)
    }
}
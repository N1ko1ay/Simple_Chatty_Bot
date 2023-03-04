fun main() {
    val cup = readln().toInt()
    val day = readln().toBoolean()
    println(cup in 10..20 && day != true || cup in 15..25 && day == true)

}

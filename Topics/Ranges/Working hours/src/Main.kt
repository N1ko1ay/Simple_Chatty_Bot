fun main() {
    val time = readln().toInt()
    val workTime = 9..18
    val lunchTime = 13..14
    // do not change the code above
    if (time in workTime && time !in lunchTime) {
        println("true")
    } else {
        println("false")
    }
}
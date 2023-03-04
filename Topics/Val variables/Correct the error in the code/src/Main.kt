fun main() {
    val CONST: Int = 100
    var listNumber = mutableListOf<Int>()
    listNumber.add(CONST * CONST)
    listNumber.add(CONST * CONST * CONST)
    listNumber.add(CONST * CONST * CONST * CONST)
    println(listNumber)
}
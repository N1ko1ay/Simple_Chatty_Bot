import java.util.Scanner
fun main() {
    var balance = readln().toInt()
    val scanner = Scanner(System.`in`)
    var cost = 0
    var sumCost = 0
    while (scanner.hasNextInt()) {
        cost = scanner.nextInt()
        sumCost += cost
    }
    if (balance >= sumCost)
        print("Thank you for choosing us to manage your account! Your balance is ${balance - sumCost}.")
    if (balance < sumCost)
        print("Error, insufficient funds for the purchase. Your balance is ${balance - (sumCost - cost)}, but you need $cost.")
}
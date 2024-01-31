import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val number = nextInt()
    val sortedDigits = number.toString().toCharArray().sortedDescending().joinToString("")
    println(sortedDigits)
}
import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val string = next()
    var res = 0
    if (string.equals(string.reversed())) res = 1
    println(res)
}
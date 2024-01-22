import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt()
    val bite = 4
    var res = ""

    repeat(a / bite) {
        res += "long "
    }

    println(res + "int")
}
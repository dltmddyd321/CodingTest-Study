import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val T = nextInt()

    for (i in 0 until T) {
        val word = next()
        println("${word[0]}${word[word.lastIndex]}")
    }
}
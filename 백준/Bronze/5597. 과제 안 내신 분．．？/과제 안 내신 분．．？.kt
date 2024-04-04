import java.io.*
import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val student = IntArray(31)
    
    for (i in 1..28) {
        val success = nextInt()
        student[success] = 1
    }
    for (i in 1 until student.size) {
        if (student[i] != 1) println(i)
    }
}
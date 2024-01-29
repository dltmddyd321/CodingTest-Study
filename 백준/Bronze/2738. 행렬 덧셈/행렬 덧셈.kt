import java.util.*
import kotlin.collections.ArrayList

fun main() = with(Scanner(System.`in`)) {
    val size = nextInt()
    val line = nextInt()
    val array = Array(size) { IntArray(line) }
    val sb = StringBuilder()

    for (i in 0 until size) {
        for (j in 0 until line) {
            array[i][j] = nextInt() //첫 번째 행렬을 만들어주고
        }
    }
    for (i in 0 until size) {
        for (j in 0 until line) {
            array[i][j] += nextInt() //두 번째 행렬 값을 그대로 더한다.
            sb.append(array[i][j].toString()+ " ")
        }
        sb.append("\n")
    }
    println(sb)
}
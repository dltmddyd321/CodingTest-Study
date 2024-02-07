import java.util.*
import kotlin.collections.ArrayList

fun main() = with(Scanner(System.`in`)) {
    val goods = arrayListOf(1, 1, 2, 2, 2, 8)
    repeat(6) {
        goods[it] = goods[it] - nextInt()
    }
    println(goods.joinToString(" "))
}
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.LinkedHashSet

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val set = LinkedHashSet<String>()

    val arr = bufferedReader.readLine().split(" ")
    for (i in 0 until arr[1].toInt()) {
        val number = bufferedReader.readLine()
        if (set.contains(number)) { set.remove(number) }
        set.add(number)
    }

    val iterator = set.iterator()
    var count = 1
    while (iterator.hasNext()) {

        println(iterator.next())
        if (count == arr[0].toInt()) break
        count++
    }
}
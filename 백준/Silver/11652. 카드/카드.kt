import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

fun main() {
    //    val n = readln().toInt()
    //    val list = mutableListOf<Long>()
    //    repeat(n) { list.add(readln().toLong()) }
    //
    //    val frequencyMap = list.groupingBy { it }.eachCount()
    //    val mostFrequentEntries = frequencyMap.filter { it.value == frequencyMap.values.maxOrNull() }.keys.toList()
    //    println(mostFrequentEntries.max())
    
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    val map: MutableMap<Long, Int> = HashMap()
    var max = 1
    var input: Long
    for (i in 0 until num) {
        input = br.readLine().toLong()
        if (map.containsKey(input)) {
            val `val` = map[input]!!
            if (`val` + 1 > max) {
                max = `val` + 1
            }
            map[input] = `val` + 1
        } else {
            map[input] = 1
        }
    }
    val list: MutableList<Long> = ArrayList()
    for ((key, value) in map) {
        if (value == max) list.add(key)
    }
    list.sort()
    println(list[0])
}
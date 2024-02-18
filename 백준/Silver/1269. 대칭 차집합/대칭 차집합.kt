import java.util.*
import kotlin.collections.ArrayList
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val input = readLine()!!.split(" ").map{it.toInt()}
    val array1 = readLine()!!.split(" ").map{it.toInt()}
    val array2 = readLine()!!.split(" ").map{it.toInt()}

    println(getSymmetricDifference(array1, array2))
}

fun getSymmetricDifference(array1: List<Int>, array2: List<Int>): Int {
    val set1 = array1.toSet()
    val set2 = array2.toSet()

    val difference1 = set1.subtract(set2)
    val difference2 = set2.subtract(set1)

    return (difference1 union difference2).size
}
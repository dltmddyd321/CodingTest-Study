import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer

fun main() {
    val sc = Scanner(System.`in`)
    val current = sc.next().split(":".toRegex()).dropLastWhile { it.isEmpty() }
        .toTypedArray()
    val drop = sc.next().split(":".toRegex()).dropLastWhile { it.isEmpty() }
        .toTypedArray()
    val currentHour = current[0].toInt()
    val currentMinute = current[1].toInt()
    val currentSecond = current[2].toInt()
    val currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond
    val dropHour = drop[0].toInt()
    val dropMinute = drop[1].toInt()
    val dropSecond = drop[2].toInt()
    val dropSecondAmount = dropHour * 3600 + dropMinute * 60 + dropSecond
    var needSecondAmount = dropSecondAmount - currentSecondAmount
    if (needSecondAmount <= 0) needSecondAmount += 24 * 3600
    val needHour = needSecondAmount / 3600
    val needMinute = needSecondAmount % 3600 / 60
    val needSecond = needSecondAmount % 60
    System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond)
}
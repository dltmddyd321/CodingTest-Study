import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.Deque
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer
import java.util.TreeMap
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.sqrt

fun main() {
    val scanner = Scanner(System.`in`)
    val S = scanner.nextLine()

    // 접미사 리스트 생성
    val suffixArray = mutableListOf<String>()

    // 모든 접미사를 리스트에 추가
    for (i in S.indices) {
        suffixArray.add(S.substring(i))
    }

    // 접미사를 사전순으로 정렬
    suffixArray.sort()

    // 정렬된 접미사들을 출력
    for (suffix in suffixArray) {
        println(suffix)
    }
}
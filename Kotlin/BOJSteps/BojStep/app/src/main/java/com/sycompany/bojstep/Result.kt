@file:Suppress("BlockingMethodInNonBlockingContext")

package com.sycompany.bojstep

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import java.util.regex.Pattern
import kotlin.math.roundToInt

fun main() {
    searchSameCard()
}

//3003번
fun chess() {
    val scanner = Scanner(System.`in`)

    val white = arrayOf(1, 1, 2, 2, 2, 8)
    val input = arrayOfNulls<Int>(6)

    for (i in input.indices) {
        input[i] = scanner.nextInt()
    }

    for (i in white.indices) {
        input[i] = white[i] - input[i]!!
        println(input[i])
    }
}

//14681
fun quadrant(x: Int, y: Int) : Int {
    return if (x > 0 && y > 0) {
        1
    } else if (x < 0 && y > 0) {
        2
    } else if (x < 0 && y < 0) {
        3
    } else 4
}

//2525
fun ovenClock() = with(Scanner(System.`in`)) {
    var (h , m) = Pair(nextInt(), nextInt())
    val cookingTime = nextInt()

    if (m + cookingTime >= 60) {
        val plusHour = (m + cookingTime) / 60
        m = (m + cookingTime) % 60
        if (h + plusHour >= 24) {
            h = (h + plusHour) % 24
        } else {
            h += plusHour
        }
    } else {
        m += cookingTime
    }

    println("$h $m")
}

//2480
fun diceResult() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    val c = nextInt()

    val values = listOf(a, b, c)

    if(a==b && b==c) {
        println("${10000+(a*1000)}")
    } else if (a==b && b!=c) {
        println("${1000+(a*100)}")
    } else if (a!=b && b==c) {
        println("${1000+(c*100)}")
    } else if (a==c && b!=c) {
        println("${1000+(c*100)}")
    } else if (a!=b && b!=c && a!=c) {
        //배열에서 최대 값을 추출한다.
        println("${Collections.max(values)*100}")
    }
}

//8393
fun allPlus() = with(Scanner(System.`in`)) {
    val num = nextInt()
    var result = 0
    for (i in 1..num) {
        result += i
    }
    println(result)
}

//영수증
fun receipt() = with(Scanner(System.`in`)) {
    val allPrice = nextInt()
    val typeCnt = nextInt()
    var checkPrice = 0

    for (i in 1..typeCnt) {
        checkPrice += (nextInt() * nextInt())
    }

    if (checkPrice == allPrice) {
        println("Yes")
    } else {
        println("No")
    }
}

//15552 -> 시간 초과 대응 처리
/*
BufferedReader & BufferedWriter : 입력된 데이터가 바로 전달되지 않고 버퍼를 거친 후 전달되므로 Scanner보다 속도가 삐름
readLine : 입력받은 값을 String으로 변환 (여기서는 숫자를 사용하므로 int로 변환)
StringTokenizer : 공백을 기준으로 String을 나눠줌
 */
fun fastAPlusB() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..readLine().toInt()) {
        StringTokenizer(readLine()).run {
            val a = nextToken().toInt()
            val b = nextToken().toInt()

            w.write("Case #$i: ${a + b}\n")
        }
    }
    w.flush()
    w.close()
    close()
}

fun plusCycle() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var number = readLine().toInt()
    val copy = number
    var cnt = 0   // 싸이클 길이 카운트

    do {
        number = number % 10 * 10 + (number / 10 + number % 10) % 10
        cnt ++
    } while (copy != number)

    w.write(cnt.toString())
    w.flush()
    w.close()
    close()
}

//4344
fun average() = with(Scanner(System.`in`)){
    val c = nextInt()

    for (i in 0 until c) {
        var sum = 0
        var avg = 0.0
        var cnt = 0
        val size = nextInt()
        val array = IntArray(size)

        for (j in array.indices) {
            array[j] = nextInt()
        }
        for (j in array.indices) {
            sum += array[j]
        }
        avg = sum.toDouble() / size
        for (j in array.indices) {
            if (array[j] > avg) {
                cnt ++
            }
        }
        System.out.printf("%.3f%s\n", cnt.toDouble() / size * 100, "%")
    }
}

//4673
fun selfNumber() {
    val max = 10000
    val arr = IntArray(max)
    var ori = 1

    fun d(n: Int) {
        var num = n
        var sum = n

        while (num > 0) {
            sum += num%10
            num /= 10
        }

        if (sum >= max) {
            return
        } else {
            arr[sum]++
            d(sum)
        }
    }

    while (ori< max) {
        d(ori++)
    }

    for (i in arr.indices) {
        if (i != 0 && arr[i] == 0) {
            println(i)
        }
    }
}

//그룹 단어 체커
fun groupWord() {
    val n = readln().toInt()
    var groupWords = n

    //단어 개수만큼 반복
    repeat(n) {
        val word = readln()
        val charSet = mutableSetOf<Char>()
        var lastChar : Char? = null
        var isGroup = true

        word.forEach {
            if (lastChar != it) {
                lastChar = it
                //이미 포함되어 있다면 그룹 단어가 아니다.
                if (!charSet.add(it)) isGroup = false
            }
        }
        if (!isGroup) groupWords --
    }
    println(groupWords)
}

//아스키코드
fun dial() {
    val arr = intArrayOf(3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10)

    val br = BufferedReader(InputStreamReader(System.`in`))
    var res = 0
    val str = br.readLine().toCharArray()

    fun checkNum(num: Char): Int = arr[num.toInt() - 65]

    for (ch in str) {
        res += checkNum(ch)
    }

    println(res)
}

//손익분기점
fun test() {
    val s = Scanner(System.`in`)
    val a = s.nextInt()
    val b = s.nextInt()
    val c = s.nextInt()

    val n: Int = if (c-b > 0) {
        a/(c-b) + 1
    } else {
        -1
    }

    println(n)
}

//소수 찾기
fun findNum() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var checkCnt = 0
    var totalCnt = 0

    for (i in 0 until n) {
        val a = sc.nextInt()

        for (j in 2..a) {
            //소수 조건
            if (a % j == 0) {
                checkCnt ++
            }
        }
        if (checkCnt == 1) totalCnt ++
        checkCnt = 0
    }
    println(totalCnt)
}

fun rangeNum() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val m = readLine().toInt()
    val n = readLine().toInt()
    var min = 0
    var sum = 0

    val arr = Array(n + 1) { true }

    //0과 1은 소수가 아니다.
    arr[0] = false
    arr[1] = false

    for (i in 2..n) {
        if (arr[i]) {
            //소수의 배수는 전부 소수가 아니다.
            for(j in (2 * i)..n step i) {
                arr[j] = false
            }
        }
    }

    for (i in m..n) {
        if (arr[i]) {
            if (min == 0) {
                min = i
            }
            sum += i
        }
    }

    if (min == 0) {
        println(-1)
    } else {
        println(sum)
        println(min)
    }
}

fun findFountain() = with(Scanner(System.`in`)) {
    val x = nextInt()
    var sum = 1 //분자와 분모의 합
    var tmp = 0

    //분자 분모 합 구하기
    while (tmp < x) {
        tmp += sum
        sum ++
    }

    //합이 짝수라면
    if (sum % 2 == 0) {
        val m = (tmp - x + 1)
        val d = sum - m
        println("${m/d}")
    }

    //합이 홀수라면
    else {
        val d = (tmp - x + 1)
        val m = sum - d
        println("${m/d}")
    }
}

//수 정렬하기
fun sortOne() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val list = mutableListOf<Int>()

    repeat(n) {
        list.add(nextInt())
    }

    list.sorted()
        .forEach { println(it) }
}

//피보나치 수열
fun fibo() = with(BufferedReader(InputStreamReader(System.`in`))) {
    fun fibonacci(N: Int): Int {
        return if (N < 2) N else fibonacci(N-1) + fibonacci(N-2)
    }
    val n = readLine().toInt()
    println(fibonacci(n))
}

fun dungchi() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val cnt = readln().toInt()
    val inputs = Array(cnt) {
        readln().split(' ').map { it.toInt() }
    }
    val res = StringBuilder()
    for (first in inputs) {
        var rank = 1
        for (second in inputs) {
            if (second[0] > first[0] && second[1] > first[1]) rank++
        }
        res.append(rank).append(' ')
    }
    println(res)
}

fun cutLine() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readln().toInt()
    val p = readln().toInt()
    val arr = ArrayList<Int>()

    for (i in 0 until n) {
        arr.add(readln().toInt())
    }

    arr.sortedDescending()
    println(arr[p-1])
}

fun sorted() = with(Scanner(System.`in`)) {
    val str = next()
    val arr = arrayOfNulls<String>(str.length)

    for (i in arr.indices) {
        arr[i] = str[i].toString()
    }
    Arrays.sort(arr, Collections.reverseOrder())
    for (i in 1 until arr.size) {
        arr[0] += arr[1]
    }
    println(arr[0])
}

fun numberCard() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readln().toInt()
    val cardSet = readln().split(" ").map { it.toInt() }.toMutableSet()
    val m = readln().toInt()

    readln().split(" ").map { it.toInt() }.forEach {
        if (!cardSet.add(it)) print("1")
        else print("0")
    }
}

fun counter() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val arr = IntArray(n)
    var cnt = 0

    //배열에 입력 값만큼 ADD
    for (i in 0 until n) {
        arr[i] = nextInt()
    }
    val v = nextInt()

    for (i in arr.indices) {
        if (v == arr[i]) cnt++
    }

    println(cnt)
}

fun ceoValue() = with(Scanner(System.`in`)) {
    val arr = IntArray(5)
    var hap = 0

    for (i in arr.indices) {
        arr[i] = nextInt()
        hap += arr[i]
    }

    println(hap / arr.size)
    println(arr[2])
}

fun checkMission() = with(Scanner(System.`in`)) {
    val student = IntArray(31)

    for (i in 1..28) {
        val success = nextInt()
        student[success] = 1
    }
    for (i in 1 until student.size) {
        if (student[i] != 1) println(i)
    }
}

fun croatiaAlphabetSearch() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val croatiaAlphabet = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var str = readLine()

    croatiaAlphabet.forEach {
        str = str.replace(it, "A")
    }
    println(str.length)
}

fun statistics() {
    fun getAvg(numList: MutableList<Int>): Int = numList.average().roundToInt()

    fun getMid(numList: MutableList<Int>): Int {
        val sortedList = numList.sorted()
        val mid = numList.size / 2
        return sortedList[mid]
    }

    fun getFreq(numList: MutableList<Int>): Int {
        val freqMap = numList.groupingBy { it }.eachCount()
        val maxValue = freqMap.maxOf { it.value }
        val maxFreqMap = freqMap.filter { it.value == maxValue }
        val mapKeys = maxFreqMap.keys.sorted()

        return if (mapKeys.size == 1) {
            mapKeys.first()
        } else {
            mapKeys[1]
        }
    }

    fun getRange(numList: MutableList<Int>): Int {
        val maxValue = numList.maxOf { it }
        val minValue = numList.minOf { it }
        return maxValue - minValue
    }
}

fun zeroStack() = with(System.`in`.bufferedReader()) {
    val k = readLine().toInt()
    val stack = arrayListOf<Int>()

    for (i in 0 until k) {
        val temp = readLine().toInt()
        if (temp == 0) stack.removeAt(stack.size - 1)
        else stack.add(temp)
    }
    println(stack.sum())
}

fun setPointUp() = with(Scanner(System.`in`)) {
    data class Point(
        val x: Int,
        val y: Int
    )
    val list = arrayListOf<Point>()
    val cnt = nextInt()
    repeat(cnt) {
        list.add(Point(nextInt(), nextInt()))
    }

    val result = list.sortedWith(compareBy({it.x}, {it.y}))

    println(result)
}

fun yaksu() = with(Scanner(System.`in`)) {
    val list = arrayListOf<Int>()
    val cnt = nextInt()
    repeat(cnt) {
        list.add(nextInt())
    }
    val result = list.max() * list.min()
    println(result)
}

fun stringSet() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val m = nextInt()
    val setList = arrayListOf<String>()
    val inputList = arrayListOf<String>()

    repeat(n) {
        setList.add(nextLine())
    }
    repeat(m) {
        inputList.add(nextLine())
    }

    val result = setList.intersect(inputList).size
    println(result)
}

fun stringSetTwo() = with(System.out.bufferedWriter()){
    val br = System.`in`.bufferedReader()
    val set = HashSet<String>()
    val (n,m) = br.readLine().split(' ').map{it.toInt()}
    var answer=0
    for(i in 0 until n){
        set.add(br.readLine())
    }
    for(i in 0 until m){
        if(set.contains(br.readLine()))
            answer++
    }

    write("$answer")
    close()
}

//듣보잡
fun noSeeNoHeard() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val neverHeard = HashMap<String, Boolean>()
    val neverSeen = HashMap<String, Boolean>()
    val never = mutableListOf<String>()

    val cnt = br.readLine().split("")

    repeat(cnt[0].toInt() + cnt[1].toInt()) {
        val man = br.readLine()

        if (it < cnt[0].toInt()) {
            neverHeard[man] = true
        } else {
            neverSeen[man] = true
        }
    }

    if (neverHeard.size < neverSeen.size) {
        neverSeen.forEach {
            if (neverHeard[it.key] == true) never.add(it.key)
        }
    } else {
        neverHeard.forEach {
            if (neverSeen[it.key] == true) never.add(it.key)
        }
    }

    bw.write("${never.size}")
    never.sort()
    never.forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
}

fun anotherStringSet() = with(Scanner(System.`in`)) {
    val s = nextLine()
    val resultSet = mutableSetOf<String>()

    for (i in 0..s.length) {
        for (j in i + 1..s.length) {
            resultSet.add(s.substring(i, j))
        }
    }
    println(resultSet.size)
}

fun setNumber(x: String, y: String) {

    fun exchangeNum(s: String): IntArray {
        val digits = IntArray(s.length)
        for (i in s.indices) {
            digits[i] = s[i] - '0'
        }
        return digits
    }

    val xArray: IntArray = exchangeNum(x)
    val yArray: IntArray = exchangeNum(y)
    val equalArray = mutableListOf<Int>()

    xArray.forEach { if (it in yArray) equalArray.add(it) }

    if (equalArray.isEmpty()) {
        println("-1")
        return
    }

    xArray.sortedDescending()
    println(xArray.toString())
}

fun symmetricDifference() = with(Scanner(System.`in`)) {
    val (m, n) = readLine()!!.split(" ").map { it.toInt() }
    val aList = mutableListOf<Int>()
    val bList = mutableListOf<Int>()

    fun setList(c: Int, list: MutableList<Int>) {
        repeat(c) {
            list.add(nextInt())
        }
    }

    setList(m, aList)
    setList(n, bList)

    println(((aList - bList) + (bList - aList)).size)
}

//정규식 활용 이메일 형식 체크
fun isEmailValid(email: String): Boolean {
    var isValid = false
    val expression = "^[\\w.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$"
    val inputStr: CharSequence = email
    val pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE)
    val matcher = pattern.matcher(inputStr)
    if (matcher.matches()) {
        isValid = true
    }
    return isValid
}

fun searchSameCard() = with(Scanner(System.`in`)) {
    val allCards = mutableListOf<Int>()
    val selectedCards = mutableListOf<Int>()
    val allCnt = nextInt()
    val resultCounts = mutableListOf<Int>()
    repeat(allCnt) {
        allCards.add(nextInt())
    }
    val selectCnt = nextInt()
    repeat(selectCnt) {
        selectedCards.add(nextInt())
    }

    selectedCards.forEach { selectNum ->
        var resultCnt = 0
        allCards.forEach { allNum ->
            if (selectNum == allNum) {
                resultCnt ++
            }
        }
        resultCounts.add(resultCnt)
    }

    println(resultCounts)
}

fun parenthesisCheck() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()

    fun solve(str: String) {
        val stack = Stack<Char>()

        for (i in str) {
            if (i == '(') {
                stack.add(i)
            }
            else if (i == ')') {
                if (stack.isEmpty()) {
                    println("NO")
                    return
                }
                if (stack.pop() == ')') {
                    println("NO")
                    return
                }
            }
        }
        if (stack.isEmpty()) {
            println("YES")
        } else {
            println("NO")
        }
    }

    for (i in 0 until n) {
        val str = readLine()
        solve(str)
    }
}

//삼총사 - 프로그래머스 -> 세 수를 더하면 0이 나오는 모든 경우의 횟수를 구한다.
fun solution(number: IntArray): Int {
    var answer = 0
    for (i in number.indices) {
        for (j in i + 1 until number.size) {
            for (k in j + 1 until number.size) {
                if (number[i] + number[j] + number[k] == 0) {
                    answer++
                }
            }
        }
    }
    return answer
}

fun solution(n: Int): Int {
    var answer = 0
    for (i in 1..n) {
        if (i % 2 == 0) answer += i
    }
    return answer
}
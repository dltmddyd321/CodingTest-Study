package com.sycompany.bojstep

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    ovenClock()
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
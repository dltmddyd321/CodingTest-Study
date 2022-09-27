package com.example.progremmerslevelone

import kotlin.math.sqrt

//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
// 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
// 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
fun minNumberDelete(arr: IntArray): IntArray = if (arr.size == 1) intArrayOf(-1)
else arr.filter { it != arr.minOrNull() }.toIntArray()

fun main() {
    val arr: IntArray = intArrayOf(1, 3, 4)
    minNumberDelete(arr)
}

fun pickTwoNumberPlus(numbers: IntArray): IntArray {
    val answer = mutableSetOf<Int>()

    //서로 다른 인덱스의 값을 조회하여 합산
    for (i in 0 until numbers.size - 1) {
        for (j in i + 1 until numbers.size) {
            answer.add(numbers[i] + numbers[j])
        }
    }
    //오름차순 정렬
    return answer.sorted().toIntArray()
}

//문자열 내림차순 정렬
fun solution(s: String): String {
    return s.toCharArray().sortedDescending().joinToString("")
}

//자연수 n을 뒤집어 배열로 반환
fun solution(n: Long): IntArray {
    return n.toString().reversed().map {
        it.toString().toInt()
    }.toIntArray()
}

//자릿수 더하기
fun sumPosition() {
    fun solution(n: Int): Int {
        return n.toString().map {
            it.toInt() - 48
        }.sum()
    }
}

//부족한 금액 구하기
fun scarceMoney(price: Int, money: Int, count: Int): Long {
    return (1..count).sumOf {
        it * price.toLong()
    }.let { sum ->
        if (money > sum) 0 else sum - money
    }
}

fun sumSolution(n: Int): Int = (1..n).filter {
    n % it == 0
}.sum()

fun divisionArr(arr: IntArray, divisor: Int): IntArray {
    var answer = intArrayOf()
    val temp = mutableListOf<Int>()

    for (i in arr.indices) {
        if (arr[i] % divisor == 0){
            temp.add(arr[i])
        } else continue
    }
    if (temp.size == 0) {
        temp.add(-1)
    }
    temp.sort()
    answer = temp.toIntArray()
    return answer
}

//정수 제곱근 판별
fun doubleCheck(n: Long): Long {
    val a = sqrt(n.toDouble()).toLong()
    return if (a*a == n) (a+1)*(a+1) else -1
}

//내적
fun solution(a: IntArray, b: IntArray): Int {
    var answer = 0
    for (i in a.indices) {
        answer += a[i]*b[i]
    }
    return answer
}

//최대공약수와 최소공배수 -> 유클리드 호제법
fun solution(n: Int, m: Int): IntArray = intArrayOf(gcd(n, m), lcm(n, m))

//최대공약수
fun gcd(n: Int, m: Int): Int {
    return if (n < m) {
        if (n == 0) m else gcd(n, m % n)
    } else {
        if (m == 0) n else gcd(m, n % m)
    }
}

//최소공배수
fun lcm(n: Int, m: Int) = n * m / gcd(n, m)

//시저 암호
//공백은 아무리 밀어도 공백이다.
fun solution(s: String, n: Int): String {
    return s.toCharArray().map {
        when(it) {
            in 'A'..'Z' -> {
                if (it + n > 'Z') it + n - 26 else it + n
            }
            in 'a'..'z' -> {
                if (it + n > 'z') it + n - 26 else it + n
            }
            else -> { it }
        }
        //공백없이 문자열 연결
    }.joinToString("")
}
import java.util.Scanner

fun sumOfDigits(s: String): Int {
    return s.filter { it.isDigit() }.sumOf { it.toString().toInt() }
}

fun sortSerialNumbers(serialNumbers: List<String>): List<String> {
    return serialNumbers.sortedWith(compareBy({ it.length }, { sumOfDigits(it) }, { it }))
}

fun main() {
    // 입력을 받는 부분
    val n = readln().toInt()
    val serialNumbers = mutableListOf<String>()
    repeat(n) {
        serialNumbers.add(readln())
    }

    // 정렬된 시리얼 번호를 출력하는 부분
    val sortedSerialNumbers = sortSerialNumbers(serialNumbers)
    sortedSerialNumbers.forEach { println(it) }
}
package com.example.progremmerslevelone

//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
// 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
// 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
fun minNumberDelete(arr: IntArray): IntArray = if (arr.size == 1) intArrayOf(-1)
    else arr.filter {  it != arr.minOrNull() }.toIntArray()

fun main() {
    val arr : IntArray = intArrayOf(1, 3, 4)
    minNumberDelete(arr)
}

fun pickTwoNumberPlus(numbers: IntArray) : IntArray {
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
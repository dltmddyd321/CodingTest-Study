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

//가변 인자 : 함수 호출 시 인자 개수를 유동적으로 지정 가능
fun sum(vararg num: Int) = num.sum()

fun main(args: Array<String>) {
    val n1 = sum(1)
    val n2 = sum(1, 2, 3, 4)
}

fun showAll(vararg s: String) {
    println(s.joinToString())
}

//이미 존재하는 배열을 vararg 함수의 인자로 넘겨야할 때가 있다. 이런 경우에는 배열명 앞에 *(Spread Operator)를 붙인다.
fun showMain(args: Array<String>) {
    val test = arrayOf("A", "B", "C")
    showAll(*test)
}
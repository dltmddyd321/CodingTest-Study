class Solution {
    fun solution(X: String, Y: String): String = X.filter { Y.contains(it) }
        .groupBy { it }
        .map {if (it.value.size < Y.groupBy { it }[it.key]!!.size) it.value else Y.groupBy { it }[it.key]!!}
        .flatten() //중첩 컬렉션을 모두 열어 하나의 배열로 정리한다.
        .sortedByDescending { it }
        .joinToString("")
        .let { it.ifEmpty { "-1" } }
        .let { if (it.all { it == '0' }) "0" else it }
}
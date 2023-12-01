class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        return strings.sortedWith { a, b ->
            //문자열 길이가 같으면 바로 문자 순서 비교
            if (a[n] == (b[n])) a.compareTo(b)
            //문자열 길이 다르면 제한 인덱스 값의 문자 순서 비교
            else a[n].compareTo(b[n])
        }.toTypedArray()
    }
}
import java.util.*

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            val arr = readLine().split(" ").map(String::toInt)
            val sortedArr = arr.distinct().sorted()

            //이미 오름차순 정렬이 적용된 배열에 이분 탐색을 활용한다.
            for (i in 0 until N) {
                write(sortedArr.binarySearch(arr[i]).toString() + " ")
            }
            close()
        }
        close()
    }
}
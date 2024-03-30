import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val num = sc.nextInt()
    val arr = Array(num){0}
    val newArr = DoubleArray(num){0.0}
    var max = 0
    var sum : Double= 0.0

    for (i in 0 until num) {
        arr[i] = sc.nextInt()
        if (arr[i] > max) max = arr[i]
    }

    for (i in 0 until num) {
        newArr[i] = arr[i].toDouble() / max.toDouble() * 100
        sum += newArr[i]
    }
    println(sum/num.toDouble())
}

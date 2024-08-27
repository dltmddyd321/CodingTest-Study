var N = 0
var input = listOf<String>()
val check = BooleanArray(10)
val list = mutableListOf<String>()

fun main() = with(System.`in`.bufferedReader()) {
    N = readLine().toInt()
    input = readLine().split(" ")

    for (now in 0 until 10) {
        check[now] = true
        dfs(now, 0, now.toString())
    }

    println(list.last())
    println(list.first())
}

fun dfs(prev: Int, count: Int, str: String) {
    if (count == N) {
        list.add(str)
    } else {
        for (next in 0 until 10) {
            if (!check[next]) {
                if (input[count] == "<") {
                    if (prev > next) continue
                } else {
                    if (prev < next) continue
                }

                check[next] = true
                dfs(next, count + 1, str + next)
            }
        }
    }

    check[prev] = false
}
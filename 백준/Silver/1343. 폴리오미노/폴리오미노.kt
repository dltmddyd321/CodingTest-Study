fun main() {
    val line = readln().replace("XXXX", "AAAA").replace("XX", "BB")
    println(if (line.indexOf('X') == -1) line else -1)
}
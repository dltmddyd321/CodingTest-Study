fun main() {
    // 16진수 입력받기
    val hex = readLine()!!

    // 16진수를 10진수로 변환
    val decimal = Integer.parseInt(hex, 16)

    // 출력
    println(decimal)
}
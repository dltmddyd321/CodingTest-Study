import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer

fun main() {
    //입력값 처리하는 BufferedReader
    val br = BufferedReader(InputStreamReader(System.`in`))
    //결과값 출력하는 BufferedWriter
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = br.readLine() //입력되는 문자열 저장
    var check = false //<, > 에 덮인 단어인지 확인하는 변수
    val sb = java.lang.StringBuilder() //뒤집기를 진행한 문자열 저장
    var temp = java.lang.StringBuilder() //현재 단어 저장
    //문자열 각 글자 탐색!
    for (element in input) {
        val c = element
        if (c == '<') {        //'<'일 경우 덮인 단어로 진행
            check = true //덮인 단어 확인
            sb.append(temp.reverse()) //이전 단어 뒤집기 진행
            sb.append(c) //'<' 추가
            temp = java.lang.StringBuilder() //현재 단어 초기화
        } else if (c == '>') {        //'>' 덮인 단어 종료시
            check = false //덮인 단어 취소
            sb.append(temp).append(c) //덮인 단어 추가
            temp = java.lang.StringBuilder() //현재 단어 초기화
        } else if (c == ' ') {
            if (check) //덮인 단어 안에 ' '인 경우
                temp.append(c) else {        //덮인 단어가 아닌 ' '인 경우
                sb.append(temp.reverse()).append(c) //이전 단어 뒤집기 진행
                temp = java.lang.StringBuilder() //현재 단어 초기화
            }
        } else temp.append(c) //현재 단어의 글자 추가
    }
    if (temp.toString() != "") //마지막 단어가 남은 경우
        sb.append(temp.reverse())
    bw.write(sb.toString()) //뒤집은 문자열 BufferedWriter 저장
    bw.flush() //결과 출력
    bw.close()
    br.close()
}
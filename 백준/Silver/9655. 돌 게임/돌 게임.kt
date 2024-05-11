fun main() = with(System.out.bufferedWriter()){
    val br = System.`in`.bufferedReader()
    //홀SK 짝CY
    var n = Integer.parseInt(br.readLine())
    if(n and 1 ==1){
        write("SK")
    }
    else{
        write("CY")
    }
    close()
}

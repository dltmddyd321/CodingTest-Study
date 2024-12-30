fun main(){
    var answer = 0
    var num  = readLine()!!.toInt()
    var str = readLine()!!.split(" ")
    var list = ArrayList<Int>()
    var temp = 0
    for(i in 0 until num){
        list.add(str[i].toInt())
    }

    list.sort()

    for(i in list.indices){
        answer += temp+list[i]
        temp +=list[i]
    }

    println(answer)
}
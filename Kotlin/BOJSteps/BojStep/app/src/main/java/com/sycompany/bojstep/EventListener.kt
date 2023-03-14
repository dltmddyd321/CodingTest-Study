package com.sycompany.bojstep

interface EventListener {
    fun onEvent(cnt: Int)
}

class Counter(var listener: EventListener) {
    fun count() {
        repeat(100) {
            if (it % 5 == 0) {
                listener.onEvent(it)
            }
        }
    }
}

class EventPrinter {
    fun start() {
        val counter = Counter(object : EventListener {
            override fun onEvent(cnt: Int) {
                print("${cnt}!!\n")
            }
        })
        counter.count()
    }
    //콜백 메서드를 구현
//    override fun onEvent(cnt: Int) {
//        print("${cnt}!!\n")
//    }

    //실제 동작 구현부를 구성
//    fun start() {
//        Counter(this).count()
//    }
}

fun main() {
    EventPrinter().start()
}

fun pizzaOne(n: Int) = if (n % 7 == 0) {
    n / 7
} else {
    n / 7 + 1
}

fun checking(angle: Int): Int {
    if (angle == 180) return 4
    return when (angle) {
        in 1..89 -> 1
        90 -> 2
        in 91..179 -> 3
        else -> 0
    }
}

fun hidePlus(my_string: String): Int {
    val a = my_string.split("")
    var res = 0
    for (i in a.indices) {
        if (a[i].toIntOrNull() != null) { //Int형 변환에 성공 시
            res += a[i].toInt()
        }
    }
    return res
}
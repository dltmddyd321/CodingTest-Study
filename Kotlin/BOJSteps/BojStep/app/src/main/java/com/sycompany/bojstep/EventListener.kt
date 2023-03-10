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
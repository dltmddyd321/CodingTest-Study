package com.sycompany.bojstep

import java.util.*

fun main() {
    ovenClock()
}

//3003번
fun chess() {
    val scanner = Scanner(System.`in`)

    val white = arrayOf(1, 1, 2, 2, 2, 8)
    val input = arrayOfNulls<Int>(6)

    for (i in input.indices) {
        input[i] = scanner.nextInt()
    }

    for (i in white.indices) {
        input[i] = white[i] - input[i]!!
        println(input[i])
    }
}

//14681
fun quadrant(x: Int, y: Int) : Int {
    return if (x > 0 && y > 0) {
        1
    } else if (x < 0 && y > 0) {
        2
    } else if (x < 0 && y < 0) {
        3
    } else 4
}

//2525
fun ovenClock() = with(Scanner(System.`in`)) {
    var (h , m) = Pair(nextInt(), nextInt())
    val cookingTime = nextInt()

    if (m + cookingTime >= 60) {
        val plusHour = (m + cookingTime) / 60
        m = (m + cookingTime) % 60
        if (h + plusHour >= 24) {
            h = (h + plusHour) % 24
        } else {
            h += plusHour
        }
    } else {
        m += cookingTime
    }

    println("$h $m")
}
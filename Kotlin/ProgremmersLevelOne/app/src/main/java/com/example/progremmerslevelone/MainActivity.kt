package com.example.progremmerslevelone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main(progresses: IntArray, speeds: IntArray): IntArray { //오답
    val stack = Stack<Pair<Int, Int>>()

    progresses.forEachIndexed { index, value ->
        val needProgress = (100 - value)
        val needDays = if (needProgress % speeds[index] != 0) {
            needProgress / speeds[index] + 1
        } else {
            needProgress / speeds[index]
        }
        if (stack.isNotEmpty()) {
            val first = stack.peek()
            if (needDays > first.first) {
                stack.push(Pair(needDays, 1))
            } else {
                stack.pop()
                stack.push(Pair(needDays, first.second + 1))
            }
        } else {
            stack.push(Pair(needDays, 1))
        }
    }
    return stack.map { it.second }.toIntArray()
}

fun solution(progresses: IntArray, speeds: IntArray): IntArray { //정답
    val daysToComplete = progresses.mapIndexed { index, progress ->
        val remainingProgress = 100 - progress
        if (remainingProgress % speeds[index] == 0) {
            remainingProgress / speeds[index]
        } else {
            remainingProgress / speeds[index] + 1
        }
    }

    val result = mutableListOf<Int>()
    var maxDays = daysToComplete[0]
    var count = 1

    for (i in 1 until daysToComplete.size) {
        if (daysToComplete[i] <= maxDays) {
            count++
        } else {
            result.add(count)
            maxDays = daysToComplete[i]
            count = 1
        }
    }
    result.add(count)

    return result.toIntArray()
}

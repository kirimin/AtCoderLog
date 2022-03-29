package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.next()
    println(problem234e(x))
}

fun problem234e(x: String): String {
    var min = Long.MAX_VALUE.toString()
    start@ for (start in 1..9) {
        for (diff in 0..9) {
            var current = start
            var str = current.toString()
            for (i in 1 until x.length) {
                if (current + diff >= 10) {
                    continue@start
                }
                current += diff
                str += current
            }
            if (str >= x) {
                min = listOf(str.toLong(), min.toLong()).min().toString()
            }
        }
    }
    start@ for (start in 9 downTo 1) {
        for (diff in 0.. 9) {
            var current = start
            var str = current.toString()
            for (i in 1 until x.length) {
                if (current - diff < 0) {
                    continue@start
                }
                current -= diff
                str += current
            }
            if (str.toLong() >= x.toLong()) {
                min = listOf(str.toLong(), min.toLong()).min().toString()
            }
        }
    }
    return min
}


// 234735
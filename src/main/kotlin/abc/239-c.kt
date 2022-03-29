package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x1 = sc.nextLong()
    val y1 = sc.nextLong()
    val x2 = sc.nextLong()
    val y2 = sc.nextLong()
    println(problem239c(x1, y1, x2, y2))
}

fun problem239c(x1: Long, y1: Long, x2: Long, y2: Long): String {
    /**
     * Doubleを使わないpow
     */
    fun longPow(a: Long, b: Long): Long {
        var ans = 1L
        for (i in 0 until b) {
            ans *= a
        }
        return ans
    }
    fun double(a: Long, b: Long): Long {
        return longPow(a - b, 2)
    }
    for (i in -2..2) {
        val x1plus = x1 + i
        val x2plus = x1 + i
        for (j in -2..2) {
            val y1plus = y1 + j
            val y2plus = y1 + j
            val tmp1 = double(x1plus, x1) + double(y1plus, y1)
            val tmp2 = double(x2plus, x2) + double(y2plus, y2)
            if (tmp1 == 5L && tmp2 == 5L) return "Yes"
        }
    }
    return "No"
}
package other_contests.jsc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    println(problem2021c(a, b))
}

fun problem2021c(a: Long, b: Long): Long? {
    /**
     * 最大公約数
     */
    fun computeGreatestCommonDivisor(a: Long, b: Long): Long {
        val big: Long
        val small: Long
        if (a > b) {
            big = a
            small = b
        } else {
            small = a
            big = b
        }
        val rest = big % small
        return if (rest == 0L) small else computeGreatestCommonDivisor(small, rest)
    }

    var max2 = 0L
    for (x in a..b) {
        var max = 0L
        val gcd = computeGreatestCommonDivisor(x, b - a)
        if (max <= gcd) {
            max = gcd
        }
        max2 = Math.max(max, max2)
    }
    return max2
}
package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next()
    println(problem238c(n))
}

fun problem238c(n: String): Long {
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

    val modNum = 998244353L
    var sum = 0L
    var prev = 0L
    for (i in 0 until n.length) {
        var x = (longPow(10, i + 1L) - 1) % modNum
        val tmp = x % modNum
        if (n.toLong() <= x) {
            x = (n.toLong() - longPow(10, i.toLong()) + 1) % modNum
        } else {
            x -= prev % modNum
        }
        x % modNum
        val sumTmp = (x * (x + 1) / 2) % modNum
        prev = tmp % modNum
        sum += sumTmp % modNum
    }
    return sum % modNum
}
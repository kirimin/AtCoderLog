package arc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem106a(n))
}

fun problem106a(n: Long): String {
    /**
     * Doubleを使わないpow
     */
    fun longPow(a: Long, b: Long, needMod: Boolean = false): Long {
        /***
         * 10^9 + 7
         */
        val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()
        var ans = 1L
        for (i in 0 until b) {
            ans *= a
            if (needMod) ans %= mod
        }
        return ans
    }
    for (a in 1..37) {
        for (b in 1..25) {
            if (longPow(3, a.toLong()) + longPow(5, b.toLong()) == n) {
                return "$a $b"
            }
        }
    }
    return "-1"
}
package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem238a(n))
}

fun problem238a(n: Long): String {
    /**
     * Doubleを使わないpow
     */
    fun longPow(a: Long, b: Long): Long {
        var ans = 1L
        for (i in 0 until b) {
            ans = Math.multiplyExact(ans, a)
        }
        return ans
    }

    val n2 = n * n
    for (i in 1..n) {
        try {
            val x = longPow(2, i)
            if (n2 < x) {
                return "Yes"
            }
        } catch (e: Exception) {
            return "Yes"
        }
    }
    return "No"
}
package abc

import java.lang.Exception
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem215b(n))
}

fun problem215b(n: Long): Long {
    /**
     * Doubleを使わないpow
     */
    fun longPow(a: Long, b: Long): Long {
        /***
         * 10^9 + 7
         */
        var ans = 1L
        for (i in 0 until b) {
            ans = Math.multiplyExact(a, ans)
        }
        return ans
    }

    var k = 1L
    while (true) {
        try {
        if (longPow(2, k) > n) {
            k--
            break
        }
        } catch (e : Exception) {
            k--
            break
        }
        k++
    }
    return k
}
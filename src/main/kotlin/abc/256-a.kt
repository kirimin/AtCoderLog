package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem256a(n))
}

fun problem256a(n: Int): Long {
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

    return longPow(2, n.toLong())
}
package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem283a(a, b))
}

fun problem283a(a: Int, b: Int): Long {
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
    return longPow(a.toLong(), b.toLong())
}
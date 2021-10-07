package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val k = sc.nextLong()
    val a = sc.nextLong()
    val b = sc.nextLong()
    println(problem220b(k, a, b))
}

fun problem220b(k: Long, a: Long, b: Long): Long {
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
    val aStr = a.toString()
    var a10 = 0L
    for (i in 0 until aStr.length) {
        a10 += aStr[aStr.length - i - 1].toString().toLong() * (longPow(k, i.toLong()))
    }
    val bStr = b.toString()
    var b10 = 0L
    for (i in 0 until bStr.length) {
        b10 += bStr[bStr.length - i - 1].toString().toLong() * (longPow(k, i.toLong()))
    }
    return a10 * b10
}
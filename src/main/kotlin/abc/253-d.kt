package abc

import utilities.MathSample
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val a = sc.nextLong()
    val b = sc.nextLong()
    println(problema253d(n, a, b))
}

fun problema253d(n: Long, a: Long, b: Long): Long {
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
    /**
     * 最小公倍数
     * @param big 2つの値の大きな方
     * @param small 2つの値の小さな方
     */
    fun computeLeastCommonMultiple(a: Long, b: Long): Long {
        val big: Long
        val small: Long
        if (a > b) {
            big = a
            small = b
        } else {
            small = a
            big = b
        }
        return small * big / computeGreatestCommonDivisor(big, small)
    }

    fun arithmeticSequence(n: Long, d: Long): Long {
        return (d + n - n % d) * (n / d) / 2
    }
    val allSum = arithmeticSequence(n, 1)
    val aSum = arithmeticSequence(n, a)
    val bSum = arithmeticSequence(n, b)
    val abSum = arithmeticSequence(n, computeLeastCommonMultiple(a, b))
    return allSum - aSum - bSum + abSum
}
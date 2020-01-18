package abc

import utilities.debugLog
import java.math.BigDecimal
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val t = (0 until n).map { sc.nextLong() }
    println(problem070c(n, t))
}

fun problem070c(n: Int, t: List<Long>): Long {
    /**
     * 最大公約数
     * @param big 2つの値の大きな方
     * @param small 2つの値の小さな方
     */
    fun computeGreatestCommonDivisor(big: Long, small: Long): Long {
        val rest = big % small
        return if (rest == 0L) small else computeGreatestCommonDivisor(small, rest)
    }

    /**
     * 最小公倍数
     * @param big 2つの値の大きな方
     * @param small 2つの値の小さな方
     */
    fun computeLeastCommonMultiple(small: Long, big: Long): Long {
        return BigDecimal(small).multiply(BigDecimal(big)).div(BigDecimal(computeGreatestCommonDivisor(big, small))).toLong()
    }

    var ans = t[0]
    for (i in 1 until n) {
       ans = computeLeastCommonMultiple(Math.min(ans, t[i]), Math.max(ans, t[i]))
    }
    return ans
}
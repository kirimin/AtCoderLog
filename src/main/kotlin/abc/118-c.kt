package abc

import utilities.MathSample
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem118c(n, a))
}

fun problem118c(n: Int, a: List<Long>): Long {
    /**
     * 最大公約数
     * @param big 2つの値の大きな方
     * @param small 2つの値の小さな方
     */
    fun computeGreatestCommonDivisor(big: Long, small: Long): Long {
        val rest = big % small
        return if (rest == 0L) small else computeGreatestCommonDivisor(small, rest)
    }
    var num = a[0]
    for (i in 1 until n) {
        num = computeGreatestCommonDivisor(Math.min(a[i], num), Math.max(a[i], num))
    }
    return num
}
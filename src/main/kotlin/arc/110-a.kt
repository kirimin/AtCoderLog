package arc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem110a(n))
}

fun problem110a(n: Long): Long {
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
        return small * big / computeGreatestCommonDivisor(big, small)
    }

    var m = 2L
    for (i in 3L..n) {
        m = computeLeastCommonMultiple(m, i)
    }

    return m + 1
}
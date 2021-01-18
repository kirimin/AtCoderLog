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

    fun computeLeastCommonMultiple(list: List<Long>): Long {
        var result = list[0]
        for (i in 1 until list.size) {
            result = computeLeastCommonMultiple(result, list[i])
        }
        return result
    }

    return computeLeastCommonMultiple((2L..n).toList()) + 1
}
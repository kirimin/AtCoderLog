package abc

import utilities.debugLog
import utilities.debugSpeedEnd
import utilities.debugSpeedStart
import java.util.*
import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {
    debugSpeedStart("a")
    val sc = Scanner(System.`in`)
    val k = sc.nextInt()
    println(problem162c(k))
    debugSpeedEnd("a")
}

fun problem162c(k: Int): Long {
    /**
     * 最大公約数
     * @param big 2つの値の大きな方
     * @param small 2つの値の小さな方
     */
    fun computeGreatestCommonDivisor(big: Long, small: Long): Long {
        val rest = big % small
        return if (rest == 0L) small else computeGreatestCommonDivisor(small, rest)
    }
    var sum = 0L
    for (a in 1L..k) {
        for (b in 1L..k) {
            for (c in 1L..k) {
                val big = listOf(a, b).max()!!
                val small = listOf(a, b).min()!!
                val tmp = computeGreatestCommonDivisor(big, small)
                sum += computeGreatestCommonDivisor(min(tmp, c), max(tmp, c))
            }
        }
    }
    return sum
}
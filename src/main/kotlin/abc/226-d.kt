package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val xy = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem226d(n, xy))
}

fun problem226d(n: Int, xy: List<Pair<Long, Long>>): Int {
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
        if (small == 0L) return big
        val rest = big % small
        return if (rest == 0L) small else computeGreatestCommonDivisor(small, rest)
    }

    val set = mutableSetOf<Pair<Long, Long>>()
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == j) continue
            val xyi = xy[i]
            val xyj = xy[j]
            val xd = xyj.first - xyi.first
            val yd = xyj.second - xyi.second
            val g = computeGreatestCommonDivisor(Math.abs(xd), Math.abs(yd))
            set.add(xd / g to yd / g)
        }
    }
    return set.count()
}
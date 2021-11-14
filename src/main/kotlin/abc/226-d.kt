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
        val rest = big % small
        return if (rest == 0L) small else computeGreatestCommonDivisor(small, rest)
    }

    val list = mutableSetOf<Pair<Long, Long>>()
    for (i in 0 until n) {
        val xyi = xy[i]
        for (j in 0 until n) {

            val xyj = xy[j]
            val xDiff = xyi.first - xyj.first
            val yDiff = xyi.second -xyj.second
            if (xDiff == 0L || yDiff == 0L) {
                list.add(Math.min(Math.abs(xDiff), 1L) to Math.min(Math.abs(yDiff), 1L))
            } else {
                val tmp = computeGreatestCommonDivisor(Math.abs(xDiff), Math.abs(yDiff))
                list.add(Math.abs(xDiff) / tmp to Math.abs(yDiff) / tmp)
            }
        }
    }
    return list.count() * 2
}
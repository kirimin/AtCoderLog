package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val w = sc.nextLong()
    val ab = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem229c(n, w, ab))
}

fun problem229c(n: Int, w: Long, ab: List<Pair<Long, Long>>): Long {
    val sortedByA = ab.sortedByDescending { it.first }
    var oishisa = 0L
    var g = 0L
    for (i in 0 until n) {
        val (ai, bi) = sortedByA[i]
        if (g + bi <= w) {
            oishisa += (ai * bi)
            g += bi
        } else {
            val can = w - g
            oishisa += (ai * can)
            g += can
        }
        if (g == w) break
    }
    return oishisa
}
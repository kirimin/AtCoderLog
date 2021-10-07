package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val c = (0 until n).map { sc.next().toLong() }
    val p = (0 until n).map { sc.next().toLong() }
    println(problem008e(n, k, c, p))
}

fun problem008e(n: Int, k: Int, c: List<Long>, p: List<Long>): Long {
    val cp = mutableListOf<Pair<Long, Long>>()
    for (i in 0 until n) {
        cp.add(c[i] to p[i])
    }
    val cp2 = cp.sortedBy { it.second }.groupBy { it.first }.toList()
    var sum = 0L
    for (i in 0 until k) {
        if (i == cp2.size) return -1L
        sum += cp2[i].second.minBy { it.second }!!.second
    }
    return sum
}
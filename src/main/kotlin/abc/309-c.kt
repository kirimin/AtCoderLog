package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextLong()
    val ab = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem309c(n, k, ab))
}

fun problem309c(n: Int, k: Long, ab: List<Pair<Long, Long>>): Long {
    val ab = ab.sortedBy { it.first }
    var count = 0L
    val sum = mutableListOf<Pair<Long, Long>>()
    for (i in 0 until n) {
        count += ab[i].second
    }
    if (count <= k) return 1
    for (i in 0 until n) {
        val (a, b) = ab[i]
        count -= b
        sum.add(a to count)
    }
    return sum.find { it.second <= k }!!.first + 1
}
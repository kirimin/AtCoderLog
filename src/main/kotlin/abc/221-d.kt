package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val ab = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem221d(n, ab))
}

fun problem221d(n: Int, ab: List<Pair<Long, Long>>): String {
    val x = mutableListOf<Pair<Long, Int>>()
    for (i in 0 until n) {
        val (a, b) = ab[i]
        x.add(a to 1)
        x.add(a + b to -1)
    }
    val sorted = x.sortedBy { it.first }
    val ans = LongArray(n * 2)
    var count = 0
    for (i in 0 until sorted.size - 1) {
        count += sorted[i].second
        ans[count] += sorted[i + 1].first - sorted[i].first
    }
    return ans.dropLast(n - 1).drop(1).joinToString(" ")
}
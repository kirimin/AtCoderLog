package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val fs = (0 until n).map { sc.next().toInt() to sc.next().toLong() }
    println(problem315c(n, fs))
}

fun problem315c(n: Int, fs: List<Pair<Int, Long>>): Long {
    var max = 0L
    val group = fs.sortedByDescending { it.second }.groupBy { it.first }
    for (g in group.values) {
        if (g.size == 1) continue
        val s = g[0].second
        val t = g[1].second
        val num = s + (t / 2)
        max = Math.max(max, num)
    }
    val list = group.values.toList()
    if (list.size == 1) {
        return max
    }
    val s = list[0][0].second
    val t = list[1][0].second
    val num = s + t
    max = Math.max(max, num)
    return max
}
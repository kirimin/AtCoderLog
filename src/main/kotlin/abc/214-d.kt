package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val uvw = (0 until n - 1).map { Triple(sc.next().toInt(), sc.next().toInt(), sc.next().toLong()) }
    println(problem214d(n, uvw))
}

fun problem214d(n: Int, uvw: List<Triple<Int, Int, Long>>): Long {
    val routes = Array(n + 1) { mutableListOf<Pair<Int, Long>>() }
    for (i in 0 until n - 1) {
        val (a, b, w) = uvw[i]
        val u = Math.min(a, b)
        val v = Math.max(a, b)
        routes[u - 1].add(v - 1 to w)
    }

    var sum = 0L
    fun dfs(current: Int, max: Long, depth: Int) {
        debugLog(current, max, depth)
        sum += max * depth
        val next = routes[current]
        if (next.size == 0) {
            return
        }
        for (i in 0 until next.size) {
            val (r, w) = next[i]
            dfs(r, Math.max(max, w), depth + 1)
        }
    }
    dfs(0, 0, 0)
    return sum
}
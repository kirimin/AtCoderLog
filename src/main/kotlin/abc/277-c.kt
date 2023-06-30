package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val ab = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem277c(n, ab))
}

fun problem277c(n: Int, ab: List<Pair<Long, Long>>): Long {
    val routes = mutableMapOf<Long, MutableList<Long>>()
    for (i in 0 until n) {
        val (a, b) = ab[i]
        if (routes[a - 1] == null) {
            routes[a - 1] = mutableListOf()
        }
        if (routes[b - 1] == null) {
            routes[b - 1] = mutableListOf()
        }
        routes[a - 1]!!.add(b - 1)
        routes[b - 1]!!.add(a - 1)
    }

    val distances = mutableMapOf<Long, Int>()
    val queue = ArrayDeque<Long>()
    queue.offer(0)
    distances[0] = 0

    while(!queue.isEmpty()) {
        val current = queue.poll()
        if (routes[current] == null) {
            continue
        }
        for (i in 0 until routes[current]!!.size) {
            val next = routes[current]!![i]
            if (distances[next] != null) continue

            distances[next] = distances[current]!! + 1
            queue.offer(next)
        }
    }

    return distances.maxBy { it.key }!!.key + 1
}
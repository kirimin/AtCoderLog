package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ab = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem075c(n, m, ab))
}

fun problem075c(n: Int, m: Int, ab: List<Pair<Int, Int>>): Int {
    var count = 0
    for (i in 0 until m) {
        val routes = Array(n) { mutableListOf<Int>() }
        for (j in 0 until m) {
            if (i == j) continue
            val (a, b) = ab[j]
            routes[a - 1].add(b - 1)
            routes[b - 1].add(a - 1)
        }
        if (routes.find { it.isEmpty() } != null) {
            count++
            continue
        }

        val visited = Array(n) { false }
        val queue = ArrayDeque<Int>()
        queue.offer(routes[0][0])
        visited[routes[0][0]] = true
        while (!queue.isEmpty()) {
            val current = queue.poll()
            for (k in 0 until routes[current].size) {
                val next = routes[current][k]
                if (visited[next]) continue
                visited[next] = true
                queue.offer(next)
            }
        }
        if (visited.count { !it } != 0) count++
    }
    return count
}
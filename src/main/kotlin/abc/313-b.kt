package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ab = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem313b(n, m, ab))
}

fun problem313b(n: Int, m: Int, ab: List<Pair<Int, Int>>): Int {
    val routes = Array(n + 1) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val (a, b) = ab[i]
        routes[a - 1].add(b - 1)
    }

    for (i in 0 until n) {
        val distances = IntArray(n) { -1 }
        val queue = ArrayDeque<Int>()
        queue.offer(i)
        distances[i] = 0
        while (!queue.isEmpty()) {
            val current = queue.poll()
            for (i in 0 until routes[current].size) {
                val next = routes[current][i]
                if (distances[next] != -1) continue

                distances[next] = distances[current] + 1
                queue.offer(next)
            }
        }
//        debugLog(distances.toList())
        if (!distances.contains(-1)) {
            return i + 1
        }
    }

    return -1
}
package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ab = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem204c(n, m, ab))
}

fun problem204c(n: Int, m: Int, ab: List<Pair<Int, Int>>): Long {
    val routes = Array(n + 1) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val (a, b) = ab[i]
        routes[a - 1].add(b - 1)
    }

    var sum = 0L
    for (i in 0 until n) {
        val distances = IntArray(n) { -1 }
        val parents = IntArray(n) { -1 }
        val queue = ArrayDeque<Int>()
        queue.offer(i)
        distances[i] = 0
        var count = 1L

        while (!queue.isEmpty()) {
            val current = queue.poll()
            for (j in 0 until routes[current].size) {
                val next = routes[current][j]
                if (distances[next] != -1) continue

                distances[next] = distances[current] + 1
                count++
                parents[next] = current
                queue.offer(next)
            }
        }
        sum += count
    }

    return sum
}
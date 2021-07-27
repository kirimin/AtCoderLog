package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ab = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem211d(n, m, ab))
}

fun problem211d(n: Int, m: Int, ab: List<Pair<Int, Int>>): Long {
    /***
     * 10^9 + 7
     */
    val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()

    val routes = Array(n + 1) { mutableListOf<Int>() }
    val counts = LongArray(n)
    for (i in 0 until m) {
        val (a, b) = ab[i]
        routes[a - 1].add(b - 1)
        routes[b - 1].add(a - 1)
    }

    val distances = IntArray(n) { -1 }
    val queue = ArrayDeque<Int>()
    queue.offer(0)
    distances[0] = 0
    counts[0] = 1

    while(!queue.isEmpty()) {
        val current = queue.poll()
        for (i in 0 until routes[current].size) {
            val next = routes[current][i]
            if (distances[next] == -1) {
                distances[next] = distances[current] + 1
                counts[next] = counts[current]
                queue.offer(next)
            } else if (distances[next] == distances[current] + 1) {
                counts[next] = (counts[next] + counts[current]) % mod
            }
        }
    }

    return counts[n - 1]
}
package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ab = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem168d(n, m, ab))
}

fun problem168d(n: Int, m: Int, ab: List<Pair<Int, Int>>): String {
    val routes = Array(n + 1) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val (a, b) = ab[i]
        routes[a].add(b)
        routes[b].add(a)
    }

    val distances = IntArray(n + 1) { -1 }
    val parents = IntArray(n + 1) { -1 }
    val queue = ArrayDeque<Int>()
    queue.offer(1)
    distances[1] = 0

    while(!queue.isEmpty()) {
        val current = queue.poll()
        for (i in 0 until routes[current].size) {
            val next = routes[current][i]
            if (distances[next] != -1) continue

            distances[next] = distances[current] + 1
            parents[next] = current
            queue.offer(next)
        }
    }
    return "Yes\n" + parents.drop(2).map { it }.joinToString("\n")
}
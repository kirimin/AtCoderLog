package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val q = sc.nextInt()
    val ab = (0 until n - 1).map { sc.next().toInt() to sc.next().toInt() }
    val cd = (0 until q).map { sc.next().toInt() to sc.next().toInt() }
    println(problem209d(n, q, ab, cd))
}

fun problem209d(n: Int, q: Int, ab: List<Pair<Int, Int>>, cd: List<Pair<Int, Int>>): String {
    val routes = Array(n) { mutableListOf<Int>() }
    for (i in 0 until n - 1) {
        val (a, b) = ab[i]
        routes[a - 1].add(b - 1)
        routes[b - 1].add(a - 1)
    }

    val distances = IntArray(n) { -1 }
    val queue = ArrayDeque<Int>()
    queue.offer(0)
    distances[0] = 0

    while(!queue.isEmpty()) {
        val current = queue.poll()
        for (i in 0 until routes[current].size) {
            val next = routes[current][i]
            if (distances[next] != -1) continue

            distances[next] = distances[current] + 1
            queue.offer(next)
        }
    }
    val ans = mutableListOf<String>()
    for (i in 0 until q) {
        var (c, d) = cd[i]
        val cp = distances[c - 1]
        val dp = distances[d - 1]
        if (cp % 2 == dp % 2) ans.add("Town") else ans.add("Road")
    }
    return ans.joinToString("\n")
}
package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n1 = sc.nextInt()
    val n2 = sc.nextInt()
    val m = sc.nextInt()
    val ab = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem309d(n1, n2, m, ab))
}

fun problem309d(n1: Int, n2: Int, m: Int, ab: List<Pair<Int, Int>>): Int {
    val routes = Array(n1 + n2 + 1) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val (a, b) = ab[i]
        routes[a - 1].add(b - 1)
        routes[b - 1].add(a - 1)
    }

    val distances = IntArray(n1 + n2) { -1 }
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

    val distances2 = IntArray(n1 + n2) { -1 }
    val queue2 = ArrayDeque<Int>()
    queue2.offer(n1 + n2 - 1)
    distances2[n1 + n2 - 1] = 0

    while(!queue2.isEmpty()) {
        val current = queue2.poll()
        for (i in 0 until routes[current].size) {
            val next = routes[current][i]
            if (distances2[next] != -1) continue

            distances2[next] = distances2[current] + 1
            queue2.offer(next)
        }
    }
    return distances.max()!! + distances2.max()!! + 1
}
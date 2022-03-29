package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ab = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem231d(n, m, ab))
}

fun problem231d(n: Int, m: Int, ab: List<Pair<Int, Int>>): String {
    val routes = Array(n + 1) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val (a, b) = ab[i]
        routes[a - 1].add(b - 1)
        routes[b - 1].add(a - 1)
    }

    val distances = IntArray(n) { -1 }
    for (i in 0 until n) {
        if (distances[i] != -1) continue
        val queue = Stack<Int>()
        queue.push(i)
        distances[i] = 0
        val count = mutableMapOf<Int, Int>()

        while (!queue.isEmpty()) {
            val current = queue.pop()
//            debugLog(routes[current].size)
            if (routes[current].size == 0) break
            if (routes[current].size != 1 && routes[current].size != 2) return "No"
            count[routes[current].size] = (count[routes[current].size] ?: 0) + 1
            for (j in 0 until routes[current].size) {
                val next = routes[current][j]
                if (distances[next] != -1) continue

                distances[next] = distances[current] + 1
                queue.push(next)
            }
        }
//        debugLog(count)
        if (count.isEmpty()) continue
        if ((count[1] ?: 0) != 2 && (count[1] ?: 0) != 1) return "No"
    }
    return "Yes"
}

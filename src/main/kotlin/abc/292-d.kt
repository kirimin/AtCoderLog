package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val uv = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem292d(n, m, uv))
}

fun problem292d(n: Int, m: Int, uv: List<Pair<Int, Int>>): String {
    if (m != n) return "No"
    val routes = Array(n + 1) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val (a, b) = uv[i]
        routes[a - 1].add(b - 1)
        routes[b - 1].add(a - 1)
    }

    val branchCount = IntArray(n)
    val nodeCount = IntArray(n)
    var graphsCount = 0
    val distances = IntArray(n) { -1 }
    distances[0] = 0
    for (j in 0 until n) {
        if (distances[j] != -1 && j != 0) continue
        val queue = ArrayDeque<Int>()
        queue.offer(j)
        while (!queue.isEmpty()) {
            val current = queue.poll()
            for (i in 0 until routes[current].size) {
                val next = routes[current][i]
                branchCount[graphsCount]++
                if (distances[next] != -1) continue
                distances[next] = distances[current] + 1
                queue.offer(next)
                nodeCount[graphsCount]++
            }
        }
        graphsCount++
    }

//    debugLog(branchCount.joinToString(" "))
//    debugLog(nodeCount.joinToString(" "))
    for (i in 0 until n) {
        if (branchCount[i] != (nodeCount[i] + 1) * 2 && (branchCount[i] != 0 || nodeCount[i] != 0)) return "No"
    }
    return "Yes"
}
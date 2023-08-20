package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = (0 until n).map {
        val c = sc.next().toInt()
        (0 until c).map { sc.next().toInt() }
    }
    println(problem315e(n, p))
}

fun problem315e(n: Int, p: List<List<Int>>): String {
    fun topologicalSort(graph: List<List<Int>>): List<Int>? {
        val n = graph.size
        val inDegree = IntArray(n)
        val result = mutableListOf<Int>()

        graph.forEach { edges ->
            edges.forEach { node ->
                inDegree[node]++
            }
        }

        val queue = ArrayDeque<Int>()
        for (i in 0 until n) {
            if (inDegree[i] == 0) {
                queue.add(i)
            }
        }

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()
            result.add(current)

            graph[current].forEach { neighbor ->
                if (--inDegree[neighbor] == 0) {
                    queue.add(neighbor)
                }
            }
        }

        return if (result.size == n) result else null
    }

    val routes = Array(n + 1) { mutableListOf<Int>() }
    for (i in 0 until n) {
        val pi = p[i]
        for (j in 0 until pi.size) {
            routes[i + 1].add(pi[j])
        }
    }

    val distances = IntArray(n + 1) { -1 }
    val queue = ArrayDeque<Int>()
    queue.offer(1)
    distances[1] = 0

    while(!queue.isEmpty()) {
        val current = queue.poll()
        for (i in 0 until routes[current].size) {
            val next = routes[current][i]
            if (distances[next] != -1) continue

            distances[next] = distances[current] + 1
            queue.offer(next)
        }
    }
    val ans = mutableListOf<Int>()
    val sorted = topologicalSort(routes.toList())!!
    for (i in 0 until sorted.size) {
        val current = sorted[i]
        if (distances[current] == -1) continue
        ans.add(current)
    }
    return ans.drop(1).reversed().joinToString(" ")
}
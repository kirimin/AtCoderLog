package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until m).map {
        val k = sc.next().toInt()
        (0 until k).map { sc.next().toInt() }
    }
    println(problem216d(n, m, a))
}

fun problem216d(n: Int, m: Int, a: List<List<Int>>): String {
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
    for (i in 0 until m) {
        val ai = a[i]
        for (j in 0 until ai.size - 1) {
            routes[ai[j]].add(ai[j + 1])
        }
    }
//    debugLog(routes.toList())
    val sorted = topologicalSort(routes.toList())
    return if (sorted == null) "No" else "Yes"
}
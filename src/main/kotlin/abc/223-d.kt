package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ab = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem223d(n, m, ab))
}

fun problem223d(n: Int, m: Int, ab: List<Pair<Int, Int>>): String {
    fun topologicalSort(graph: List<List<Int>>): List<Int>? {
        val n = graph.size
        val inDegree = IntArray(n)
        val result = mutableListOf<Int>()

        graph.forEach { edges ->
            edges.forEach { node ->
                inDegree[node]++
            }
        }

        val queue = PriorityQueue<Int>()
        for (i in 0 until n) {
            if (inDegree[i] == 0) {
                queue.add(i)
            }
        }

        while (queue.isNotEmpty()) {
            val current = queue.remove()
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
        val (ai, bi) = ab[i]
        routes[ai].add(bi)
    }
    val sorted = topologicalSort(routes.toList()) ?: return "-1"
    return sorted.drop(1).joinToString(" ")
}
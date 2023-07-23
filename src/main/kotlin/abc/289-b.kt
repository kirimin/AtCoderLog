package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until m).map { sc.next().toInt() }
    println(problem289b(n, m, a))
}

fun problem289b(n: Int, m: Int, a: List<Int>): String {
    val routes = Array(n + 1) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val ai = a[i]
        routes[ai].add(ai + 1)
        routes[ai + 1].add(ai)
    }

    val distanceList = mutableListOf<IntArray>()
    for (i in 1 until n + 1) {
        val distances = IntArray(n + 1) { -1 }
        val queue = ArrayDeque<Int>()
        queue.offer(i)
        distances[i] = 0

        while (!queue.isEmpty()) {
            val current = queue.poll()
            for (i in 0 until routes[current].size) {
                val next = routes[current][i]
                if (distances[next] != -1) continue

                distances[next] = distances[current] + 1
                queue.offer(next)
            }
        }
        distanceList.add(distances)
    }
    val ans = mutableListOf<Int>()
    for (i in 0 until distanceList.size) {
        val distance = distanceList[i]
        var list = mutableListOf<Int>()
        for (j in 1 until distance.size) {
            if (distance[j] == -1) continue
            list.add(j)
        }
        if (!ans.contains(list.first())) {
            ans.addAll(list.sortedDescending())
        }
    }

    return ans.joinToString(" ")
}
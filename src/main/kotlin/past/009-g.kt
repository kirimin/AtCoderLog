package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val q = sc.nextInt()
    val uv = (0 until q).map { Triple(sc.next().toInt(), sc.next().toInt(), sc.next().toInt()) }
    println(problem009g(n, q, uv))
}

fun problem009g(n: Int, q: Int, uv: List<Triple<Int, Int, Int>>): String {
    val routes = Array(n + 1) { mutableListOf<Int>() }
    val ans = mutableListOf<String>()

    for (i in 0 until q) {
        val (t, u, v) = uv[i]
        if (t == 1) {
            if (routes[u - 1].contains(v - 1)) {
                routes[u - 1].remove(v - 1)
                routes[v - 1].remove(u - 1)
            } else {
                routes[u - 1].add(v - 1)
                routes[v - 1].add(u - 1)
            }
        } else {
            val distances = IntArray(n) { -1 }
            val queue = ArrayDeque<Int>()
            queue.offer(u - 1)
            distances[u - 1] = 0

            while (!queue.isEmpty()) {
                val current = queue.poll()
                for (j in 0 until routes[current].size) {
                    val next = routes[current][j]
                    if (distances[next] != -1) continue

                    distances[next] = distances[current] + 1
                    queue.offer(next)
                }
            }
            if (distances[v - 1] != -1) ans.add("Yes") else ans.add("No")
        }
    }
    return ans.joinToString("\n")
}
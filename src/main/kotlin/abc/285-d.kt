package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val st = (0 until n).map { sc.next() to sc.next() }
    println(problem285d(n, st))
}

fun problem285d(n: Int, st: List<Pair<String, String>>): String {
    val routes = mutableMapOf<String, String>()
    for (i in 0 until n) {
        val (a, b) = st[i]
        routes[a] = b
    }

    val queue = ArrayDeque<String>()
    val sList = routes.keys.toList()
    for (s in sList) {
        queue.add(s)
        val seen = mutableSetOf<String>()
        while(queue.isNotEmpty()) {
            val v = queue.poll()

            if (v in seen) {
                // 閉路検知
                return "No"
            }

            seen.add(v)
            if (v in routes) {
                queue.add(routes[v]!!)
                routes.remove(v)
            }
        }
    }

    return "Yes"
}
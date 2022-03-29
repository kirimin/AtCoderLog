package abc

import utilities.debugLog
import java.lang.Exception
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val n = sc.nextInt()
    println(problem235d(a, n))
}

fun problem235d(a: Int, n: Int): Int {
    val queue = ArrayDeque<Int>()
    queue.offer(1)
    val distances = IntArray(10000000) { -1 }
    distances[1] = 0
    while(!queue.isEmpty()) {
        val x = queue.poll()
        if (x == n) return distances[x]
        val routes = mutableListOf<Int>()
        try {
            routes.add(Math.multiplyExact(x, a))
        } catch (e: Exception) {
        }
        if (x >= 10 && x % 10 != 0) {
            val str = x.toString()
            routes.add((str.last() + str.dropLast(1)).toInt())
        }
        for (i in 0 until routes.size) {
            val next = routes[i]
            if (distances[next] != -1) {
                continue
            }
            if (next.toString().length > n.toString().length) {
                continue
            }
            distances[next] = distances[x] + 1
            queue.offer(next)
        }
    }
    return -1
}
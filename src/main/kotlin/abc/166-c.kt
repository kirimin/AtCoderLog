package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val h = (0 until n).map { it + 1 to sc.next().toLong() }
    val ab = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem166c(n, m, h, ab))
}

fun problem166c(
    n: Int,
    m: Int,
    h: List<Pair<Int, Long>>,
    ab: List<Pair<Int, Int>>
): Int {
    val heights = h.sortedBy { it.second }.toMap()
    val routes = hashMapOf<Int, Long>()
    for (i in 0 until m) {
        val abi = ab[i]
        if (routes.containsKey(abi.first)) {
            routes[abi.first] = (Math.max(routes[abi.first]!!, heights[abi.second]!!))
        } else {
            routes[abi.first] = heights[abi.second]!!
        }
        if (routes.containsKey(abi.second)) {
            routes[abi.second] = (Math.max(routes[abi.second]!!, heights[abi.first]!!))
        } else {
            routes[abi.second] = heights[abi.first]!!
        }
    }
    var count = 0
    for (i in 1..n) {
        if (!routes.containsKey(i)) {
            count++
            continue
        }
        if (routes[i]!! < heights[i]!!) count++
    }
    return count
}
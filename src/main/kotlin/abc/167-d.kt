package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextLong()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem167d(n, k, a))
}

fun problem167d(n: Int, k: Long, a: List<Int>): Int {
    data class LoopPoint(val range: Int, val point: Int)
    val visited = hashMapOf<Int, Int>()
    visited[1] = 0
    var loopPoint = LoopPoint(-1, -1)
    var current = 1
    for (i in 0 until n) {
        val next = a[current - 1]
        if (i.toLong() >= k - 1) {
            return next
        }
        if (visited.contains(next)) {
            loopPoint = LoopPoint(i + 1 - visited[next]!!, next)
            break
        }
        visited[next] = i + 1
        current = next
    }

    val loopIndex = (k - visited[loopPoint.point]!!) % loopPoint.range
    current = loopPoint.point
    for (i in 0 until loopIndex) {
        current = a[current - 1]
    }
    return current
}
package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val h = (0 until n).map { sc.next().toLong() }
    println(problem139c(n, h))
}

fun problem139c(n: Long, h: List<Long>): Int {
    var count = 0
    var max = 0
    for (i in h.indices) {
        if (i >= h.size - 1) {
            max = Math.max(max, count)
            break
        }
        val hi = h[i]
        val hiNext = h[i + 1]
        if (hi >= hiNext) {
            count++
        } else {
            max = Math.max(max, count)
            count = 0
        }
    }
    return max
}
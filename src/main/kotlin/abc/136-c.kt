package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val h = (0 until n).map { sc.next().toLong() }

    println(problem136c(n, h))
}

fun problem136c(n: Long, h:List<Long>): String {
    var max = 0L
    h.forEachIndexed { i, hi ->
        if (i == 0) return@forEachIndexed
        max = Math.max(h[i - 1].toDouble(), max.toDouble()).toLong()
        if (hi + 1 < max) {
            return "No"
        }
    }
    return "Yes"
}
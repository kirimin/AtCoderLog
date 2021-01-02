package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val ab = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem181b(n, ab))
}

fun problem181b(n: Int, ab: List<Pair<Long, Long>>): Long {
    var sum = 0L
    for (i in 0 until n) {
        var (a, b) = ab[i]
        a--
        val b2 = b * (b + 1) / 2
        val a2 = a * (a + 1) / 2
        sum += b2 - a2
    }
    return sum
}
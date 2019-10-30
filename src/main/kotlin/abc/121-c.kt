package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ab = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem121c(n, m, ab))
}

fun problem121c(n: Int, m: Int, ab: List<Pair<Long, Long>>): Long {
    val ab = ab.sortedBy { it.first }
    var sum = 0L
    var count = 0L
    for (i in 0 until n) {
        val (a, b) = ab[i]
        if (count + b > m) {
            sum += a * (m - count)
            count += m - count
            break
        }
        sum += a * b
        count += b
    }
    return sum
}
package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextLong()
    val ab = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem203c(n, k, ab))
}

fun problem203c(n: Int, k: Long, ab: List<Pair<Long, Long>>): Long {
    val ab = ab.sortedBy { it.first }
    var current = 0L
    var money = k
    for (i in 0 until n) {
        val (a, b) = ab[i]
        val cost = a - current
        if (cost > money) {
            current += money
            return current
        }
        current += cost
        money -= cost

        money += b
    }
    return current + money
}
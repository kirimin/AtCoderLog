package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until m).map { sc.next().toLong() }
    println(problem312c(n, m, a, b))
}

fun problem312c(n: Int, m: Int, a: List<Long>, b: List<Long>): Long {
    val a = a.sorted()
    val b = b.sorted()
    var left = -1L
    var right = 1_000_000_001L
    while (right - left > 1) {
        val mid = (left + right) / 2
        val sellers = a.count { it <= mid }
        val buyers = b.count { it >= mid }

        if (sellers >= buyers) {
            right = mid
        } else {
            left = mid
        }
    }
    return right
}
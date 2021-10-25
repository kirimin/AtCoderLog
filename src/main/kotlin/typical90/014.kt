package typical90

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until n).map { sc.next().toLong() }
    println(problem014(n, a, b))
}

fun problem014(n: Int, a: List<Long>, b: List<Long>): Long {
    val a = a.sorted()
    val b = b.sorted()
    var diffSum = 0L
    for (i in 0 until n) {
        diffSum += Math.abs(a[i] - b[i])
    }
    return diffSum
}
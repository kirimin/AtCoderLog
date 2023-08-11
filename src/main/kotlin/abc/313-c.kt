package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem313c(n, a))
}

fun problem313c(n: Int, a: List<Long>): Long {
    val a = a.sorted()
    var ans = 0L
    val sum = a.sum()
    val b = LongArray(n) { sum / n }
    for (i in 0 until sum % n) {
        b[n - 1 - i.toInt()]++
    }
    for (i in 0 until n) {
        ans += Math.abs(a[i] - b[i])
    }
    return ans / 2
}
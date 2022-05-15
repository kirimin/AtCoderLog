package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextLong()
    val x = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem246c(n, k, x, a))
}

fun problem246c(n: Int, k: Long, x: Long, a: List<Long>): Long {
    val a = a.sortedDescending()
    val ans = mutableListOf<Long>()
    var k = k
    for (i in 0 until n) {
        val ai = a[i]
        if (k == 0L) {
            ans.add(ai)
            continue
        }
        val count = ai / x
        if (k < count) {
            ans.add(Math.max(0, ai - (k * x)))
            k = 0L
            continue
        }
        k -= count
        ans.add(ai % x)
    }
    val sorted = ans.sortedDescending()
    var sum = 0L
    for (i in 0 until ans.size) {
        val ai = sorted[i]
        if (i >= k) {
            sum += ai
        }
    }
    return sum
}
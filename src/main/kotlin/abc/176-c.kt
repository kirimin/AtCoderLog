package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem176c(n, a))
}

fun problem176c(n: Int, a: List<Long>): Long {
    val dp = LongArray(n) { 0L }
    var sum = 0L
    dp[0] = a[0]
    for (i in 0 until a.size - 1) {
        var diff = dp[i] - a[i + 1]
        if (diff < 0) diff = 0
        dp[i + 1] = a[i + 1] + diff
        sum += diff
    }
    return sum
}
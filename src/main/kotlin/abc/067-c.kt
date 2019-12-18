package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem067c(n, a))
}

fun problem067c(n: Int, a: List<Long>): Long {
    val dp = Array<MutableList<Long>>(n - 1) { mutableListOf() }
    dp[0].add(a[0])
    dp[0].add(a.takeLast(n - 1).sum())
    dp[0].add(Math.abs(dp[0][0] - dp[0][1]))
    for (i in 1 until n - 1) {
        dp[i].add(dp[i - 1][0] + a[i])
        dp[i].add(dp[i - 1][1] - a[i])
        dp[i].add(Math.abs(dp[i][0] - dp[i][1]))
    }
    return dp.map { it[2] }.min()!!
}
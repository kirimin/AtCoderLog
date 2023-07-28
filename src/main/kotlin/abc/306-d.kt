package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val xy = (0 until n).map { sc.next().toInt() to sc.next().toLong() }
    println(problem306d(n, xy))
}

fun problem306d(n: Int, xy: List<Pair<Int, Long>>): Long {
    val dp = Array(n + 1) { LongArray(2) { -100000000000 } }
    dp[0][0] = 0
    for (i in 0 until n) {
        val (x, y) = xy[i]
        dp[i + 1][0] = dp[i][0]
        if (x == 0) {
            dp[i + 1][0] = Math.max(dp[i + 1][0], dp[i][0] + y)
            dp[i + 1][0] = Math.max(dp[i + 1][0], dp[i][1] + y)
        }
        dp[i + 1][1] = dp[i][1]
        if (x == 1) {
            dp[i + 1][1] = Math.max(dp[i + 1][1], dp[i][0] + y)
        }
    }
    debugLog(dp.map { it.toList() }.joinToString("\n"))
    return Math.max(dp[n][0], dp[n][1])
}
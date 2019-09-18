package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val lr = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem127c(n, m, lr))
}

fun problem127c(n: Int, m: Int, lr: List<Pair<Int, Int>>): Int {
    val dp = (0 until m).map { mutableListOf(0, Int.MAX_VALUE) }.toMutableList()
    dp[0][0] = lr[0].first
    dp[0][1] = lr[0].second
    for (i in 1 until m) {
        dp[i][0] = Math.max(lr[i].first, dp[i - 1][0])
        dp[i][1] = Math.min(lr[i].second, dp[i - 1][1])
    }
    val ans = dp[m - 1][1] - dp[m - 1][0] + 1
    return if (ans >= 0) ans else 0
}
package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val h = (0 until n).map { sc.next().toLong() }
    println(problem115c(n, k, h))
}

fun problem115c(n: Int, k: Int, h: List<Long>): Long {
    val h = h.sorted()
    val dp = (0 until n).map { Long.MAX_VALUE }.toMutableList()
    for (i in 0 until n) {
        if (i + k - 1 >= n) break
        if (i == 0) {
            dp[i] = h[i + k - 1] - h[i]
        } else {
            dp[i] = Math.min(dp[i - 1], h[i + k - 1] - h[i])
        }
    }
    return dp.min()!!
}
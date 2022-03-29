package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until n).map { sc.next().toLong() }
    println(problem245c(n, k, a, b))
}

fun problem245c(n: Int, k: Long, a: List<Long>, b: List<Long>): String {
    val dp = Array(n) { BooleanArray(2) { false } }
    dp[0][0] = true
    dp[0][0] = true
    for (i in 1 until n) {
        if (dp[i - 1][0]) {
            dp[i][0] = Math.abs(a[i - 1] - a[i]) <= k
            dp[i][1] = Math.abs(a[i - 1] - b[i]) <= k
        }
        if (dp[i - 1][1]) {
            dp[i][0] = Math.abs(b[i - 1] - a[i]) <= k || dp[i][0]
            dp[i][1] = Math.abs(b[i - 1] - b[i]) <= k || dp[i][1]
        }
    }
    return if (dp[n - 1][0] || dp[n - 1][1]) "Yes" else "No"
}
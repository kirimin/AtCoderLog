package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem220d(n, a))
}

fun problem220d(n: Int, a: List<Int>): String {
    val mod = 998244353

    val dp = Array(n + 1) { LongArray(10) }
    dp[0][a[0]] = 1
    for (i in 0 until n - 1) {
        for (j in 0 until 10) {
            dp[i + 1][(j + a[i + 1]) % 10] += dp[i][j] % mod
            dp[i + 1][(j * a[i + 1]) % 10] += dp[i][j] % mod
        }
    }

    return dp[n - 1].map { it % mod }.joinToString("\n")
}
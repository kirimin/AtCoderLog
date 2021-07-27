package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem211c(s))
}

fun problem211c(s: String): Long {
    /***
     * 10^9 + 7
     */
    val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()

    val T = charArrayOf('c', 'h', 'o', 'k', 'u', 'd', 'a', 'i')

    val dp = Array(s.length + 1) { LongArray(8 + 1) }
    for (i in -1 until s.length) {
        for (j in -1 until 8) {
            if (j == -1) {
                dp[i + 1][j + 1] = 1
                continue
            }
            if (i == -1) {
                dp[i + 1][j + 1] = 0
                continue
            }
            if (s[i] != T[j]) {
                dp[i + 1][j + 1] = dp[i][j + 1]
            } else {
                dp[i + 1][j + 1] = (dp[i][j + 1] + dp[i][j]) % mod
            }
        }
    }
    dp.map { debugLog(it.toList()) }
    return dp[s.length][8]
}
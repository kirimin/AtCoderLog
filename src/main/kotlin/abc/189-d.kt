package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem189d(n, s))
}

fun problem189d(n: Int, s: List<String>): Long {
    val dp = Array(n + 1) { LongArray(2) { 0 } }
    dp[0][0] = 1
    dp[0][1] = 1
    for (i in 1 until n + 1) {
        for (j in 0..1) {
            for (k in 0..1) {
                val y = if (s[i - 1] == "AND") j and k else j or k
                dp[i][y] += dp[i - 1][j]
            }
        }
    }
    return dp[n][1]
}
package edpc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val w = sc.nextInt()
    val wv = (0 until n).map { sc.next().toInt() to sc.next().toLong() }
    println(edpcD(n, w, wv))
}

fun edpcD(n: Int, w: Int, wv: List<Pair<Int, Long>>): Long {
    val dp = mutableListOf<LongArray>()
    for (i in 0..n) {
        dp.add(LongArray(w + 1) { 0 })
    }
    for (i in 0 until n) {
        for (j in 1..w) {
            if (j - wv[i].first >= 0) {
                dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - wv[i].first] + wv[i].second)
            }
            dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j])
        }
    }
    return dp[n][w]
}
package edpc

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val w = sc.nextLong()
    val wv = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(edpcE(n, w, wv))
}

fun edpcE(n: Int, w: Long, wv: List<Pair<Int, Int>>): Long {
    val dp = mutableListOf<LongArray>()
    for (i in 0..110) {
        dp.add(LongArray(100100) { Integer.MAX_VALUE.toLong() })
    }
    dp[0][0] = 0
    for (i in 0 until n) {
        for (sumV in dp[0].indices) {
            if (sumV - wv[i].second >= 0) {
                dp[i + 1][sumV] = Math.min(dp[i + 1][sumV], dp[i][sumV - wv[i].second] + wv[i].first)
            }
            dp[i + 1][sumV] = Math.min(dp[i + 1][sumV], dp[i][sumV])
        }
    }
    var res = 0L
    for (i in dp[0].indices) {
        if (dp[n][i] <= w) res = i.toLong()
    }
    return res
}
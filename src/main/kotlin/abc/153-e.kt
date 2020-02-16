package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val n = sc.nextInt()
    val ab = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem153e(h, n, ab))
}

fun problem153e(h: Int, n: Int, ab: List<Pair<Int, Int>>): Int {
    val pow = Math.pow(10.0, 9.0).toInt()
    val dp = Array(n + 1) { IntArray(h + 1) { pow } }
    dp[0][0] = 0;
    for (i in 0 until n) {
        for (j in 0..h) {
            dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j])
            dp[i + 1][Math.min(j + ab[i].first, h)] = Math.min(dp[i + 1][Math.min(j + ab[i].first, h)], dp[i + 1][j] + ab[i].second)
        }
    }
    return dp[n][h]
}
package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val ab = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem131d(n, ab))
}

fun problem131d(n: Int, ab: List<Pair<Long, Long>>): String {
    val dp = (0 until n).map { 0L to 0L }.toMutableList()
    val ab = ab.sortedBy { it.second }
    dp[0] = ab[0]
    if (dp[0].first > dp[0].second) return "No"
    for (i in 1 until ab.size) {
        dp[i] = (dp[i - 1].first + ab[i].first) to ab[i].second
        if (dp[i].first > dp[i].second) return "No"
    }
    return "Yes"
}
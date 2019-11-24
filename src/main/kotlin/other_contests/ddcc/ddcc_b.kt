package other_contests.ddcc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problemddccb(n, a))
}

fun problemddccb(n: Int, a: List<Long>): Long {
    val dp = LongArray(n)
    var minAbs = Long.MAX_VALUE
    var remainingSum = a.takeLast(n - 1).sum()
    dp[0] = a[0]
    minAbs = Math.min(minAbs, Math.abs(dp[0] - remainingSum))
    for (i in 1 until n) {
        val first = dp[i - 1] + a[i]
        dp[i] = first
        remainingSum -= a[i]
        minAbs = Math.min(minAbs, Math.abs(remainingSum - first))
    }
    return minAbs
}
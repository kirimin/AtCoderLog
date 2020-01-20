package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = (0 until n).map { sc.next().toLong() }
    println(problem152c(n, p))
}

fun problem152c(n: Int, p: List<Long>): Int {
    val p = p.toLongArray()
    var count = 0
    val dp = LongArray(n)
    dp[0] = p[0]
    for (i in 1 until n) {
        dp[i] = Math.min(dp[i - 1], p[i])
    }
    for (i in 0 until n) {
        if (p[i] <= dp[i]) count++
    }
    return count
}
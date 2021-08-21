package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next().toInt() }
    val t = (0 until n).map { sc.next().toLong() }
    println(problem214c(n, s, t))
}

fun problem214c(n: Int, s: List<Int>, t: List<Long>): String {
    val dp = LongArray(n)
    dp[0] = t[0]
    for (i in 1 until n) {
        dp[i] = Math.min(t[i], dp[i - 1] + s[i - 1])
    }
    dp[0] = Math.min(dp[0], dp[n - 1] + s[n - 1])
    for (i in 1 until n) {
        dp[i] = Math.min(t[i], dp[i - 1] + s[i - 1])
    }
    return dp.joinToString("\n")
}
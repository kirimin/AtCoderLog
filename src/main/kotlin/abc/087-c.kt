package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until 2).map { (0 until n).map { sc.next().toInt() } }
    println(problem087c(n, a))
}

fun problem087c(n: Int, a: List<List<Int>>): Int {
    val dp = ((0 until 2).map { (0 until n).map { 0 }.toMutableList() }).toMutableList()
    dp[0][0] = a[0][0]
    dp[1][0] = dp[0][0] + a[1][0]
    for (i in 0 until n - 1) {
        dp[0][i + 1] += dp[0][i] + a[0][i + 1]
        dp[1][i + 1] = Math.max(dp[1][i] + a[1][i + 1], dp[0][i + 1] + a[1][i + 1])
    }
    return Math.max(dp[0][n - 1], dp[1][n - 1])
}
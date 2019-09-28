package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val h = (0 until n).map { sc.next().toInt() }
    println(problem124a(n, h))
}

fun problem124a(n: Int, h: List<Int>): Int {
    val dp = (0 until n).map { 0 }.toMutableList()
    var count = 1
    dp[0] = h[0]
    for (i in 1 until n) {
        if (dp[i - 1] <= h[i]) count++
        dp[i] = Math.max(dp[i - 1], h[i])
    }
    return count
}
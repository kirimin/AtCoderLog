package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val b = (0 until n - 1).map { sc.next().toInt() }
    println(problem140c(n, b))
}

fun problem140c(n: Int, b: List<Int>): Long {
    val dp = (0 until n).map { 0L }.toMutableList()
    dp[0] = b[0].toLong()
    for (i in 1 until n) {
        if (i >= n - 1) {
            dp[i] += b[i - 1].toLong()
        } else {
            dp[i] = Math.min(b[i], b[i - 1]).toLong()
        }
    }
    return dp.sum()
}
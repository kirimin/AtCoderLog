package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = (0 until 3).map { (0 until 3).map { sc.next().toInt() } }
    println(problem088c(a))
}

fun problem088c(a: List<List<Int>>): String {
    val dp = (0 until 3).map { (0 until 3).map { 0 }.toMutableList() }
    for (i in 0 until 3) {
        for (j in 0 until 2) {
            dp[i][j] = Math.abs(a[i][j] - a[i][j + 1])
        }
    }
    return if (dp[0] == dp[1] && dp[0] == dp[1] && dp[0] == dp[2]) "Yes" else "No"
}
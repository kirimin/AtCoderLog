package abc

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next().toInt() }
    println(problem063c(n, s))
}

fun problem063c(n: Int, s: List<Int>): Int {
    val dp = (0 until n).map { IntArray(n + 1) { 0 } }
    for (i in 1 until n + 1) {
        dp[0][i] = s[0]
    }
    for (i in 1 until n) {
        for (j in 0 until n + 1) {
            if (i == j) {
                dp[i][j] = dp[i - 1][j]
            } else {
                dp[i][j] = dp[i - 1][j] + s[i]
            }
        }
    }
    dp.forEach {
        debugLog(it.toList())
    }
    var max = 0
    dp[n - 1].forEach {
        if (it % 10 != 0) max = Math.max(max, it)
    }
    return max
}
package agc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problemagc040a(s))
}

fun problemagc040a(s: String): Long {
    val dp = LongArray(s.length + 1)
    for (i in 0 until s.length) {
        if (s[i] == '<') {
            dp[i + 1] = Math.max(dp[i + 1], dp[i] + 1)
        }
    }
    for (i in s.length - 1 downTo 0) {
        if (s[i] == '>') {
            dp[i] = Math.max(dp[i], dp[i + 1] + 1)
        }
    }
    return dp.sum()
}
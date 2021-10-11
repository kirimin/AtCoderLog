package edpc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problemf(s, t))
}

fun problemf(s: String, t: String): String {
    val dp = Array(s.length + 1) { IntArray(t.length + 1) }
    for (i in 1 until s.length + 1) {
        for (j in 1 until t.length + 1) {
            if (s[i - 1] == t[j - 1]) dp[i][j] = dp[i-1][j-1]+1
            else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1])
        }
    }
    var len = dp[s.length][t.length]
    var i = s.length
    var j = t.length
    val ans = CharArray(len)
    while (len > 0) {
        if (s[i - 1] == t[j - 1]) {
            ans[len - 1] = s[i - 1]
            i--
            j--
            len--
        } else if (dp[i][j] == dp[i-1][j]) {
            i--
        } else {
            j--
        }
    }
    return ans.joinToString("")
}
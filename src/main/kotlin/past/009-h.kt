package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem009h(s, t))
}

fun problem009h(s: String, t: String): Int {
    val dp = Array(s.length + 1) { IntArray(t.length + 1) }
    for (i in 1..s.length) {
        for (j in 1..t.length) {
            if (s[i - 1] != t[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1
            } else {
                dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j])
            }
        }
    }
    return dp[s.length][t.length]
}

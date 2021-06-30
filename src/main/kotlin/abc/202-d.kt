package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val k = sc.nextLong()
    println(problem202d(a, b, k))
}

fun problem202d(a: Int, b: Int, k: Long): String {
    val dp = Array(30 + 1) { LongArray(30 + 1) }
    dp[0][0] = 1
    for (i in 0..a) {
        for (j in 0..b) {
            if (i > 0) {
                dp[i][j] += dp[i - 1][j]
            }
            if (j > 0) {
                dp[i][j] += dp[i][j - 1]
            }
        }
    }

    fun findKth(a: Int, b: Int, k: Long):String {
        if (a == 0) return (1..b).joinToString("") { "b" }
        if (b == 0) return (1..a).joinToString("") { "a" }
        if (k <= dp[a - 1][b]) {
            return "a" + findKth(a - 1, b, k)
        } else {
            return "b" + findKth(a, b - 1, k - dp[a - 1][b])
        }
    }

    return findKth(a, b, k)
}
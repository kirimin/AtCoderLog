package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val t = (0 until n).map { sc.next().toInt() }
    println(problem204d(n, t))
}

fun problem204d(n: Int, t: List<Int>): Int {
    val sum = t.sum()
    val max = (sum + 1) / 2
    val dp = Array(n + 1) { BooleanArray(sum + 1) { false } }
    dp[0][0] = true

    for (i in 1..n) {
        for (x in 0..sum) {
            if (dp[i - 1][x]) {
                dp[i][x] = true
                dp[i][x + t[i - 1]] = true
            }
        }
    }

    for (i in max until sum + 1) {
        if (dp[n][i]) return i
    }
    return 0
}
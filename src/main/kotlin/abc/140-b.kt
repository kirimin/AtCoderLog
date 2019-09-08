package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until 3).map {i ->
        (0 until n).map {j ->
            if (i == 2 && j == n - 1) {
                0
            } else {
                sc.next().toInt()
            }
        }.toMutableList()
    }
    println(problem140b(n, a))
}

fun problem140b(n: Int, a: List<MutableList<Int>>): Int {
    val dp = (0 until 2).map {
        (0..n).map {
            0
        }.toMutableList()
    }
    dp[1][0] = a[0][0]
    for (i in 1..n) {
        val tmp1 = a[1][a[0][i - 1] - 1]
        val tmp2 = dp[0][i - 1]
        dp[0][i] = tmp2 + tmp1
        dp[1][i] = a[0][i - 1]
        if (dp[1][i] == dp[1][i - 1] + 1) {
            dp[0][i] += a[2][dp[1][i - 1] - 1]
        }
    }
    return dp[0][n]
}
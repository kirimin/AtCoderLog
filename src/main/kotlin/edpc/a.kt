package edpc

import utilities.debugLog
import utilities.debugSpeedEnd
import utilities.debugSpeedStart
import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val h = (0 until n).map { sc.next().toInt() }
    println(edpcA(n, h))
}

fun edpcA(n: Int, h: List<Int>): Int {
    val dp = (0 until n).map { Integer.MAX_VALUE }.toMutableList()
    dp[0] = 0
    for (i in 1 until n) {
        dp[i] = Math.min(dp[i], dp[i - 1] + Math.abs(h[i] - h[i - 1]))
        if (i != 1) {
            dp[i] = Math.min(dp[i], dp[i - 2] +  Math.abs(h[i] - h[i - 2]))
        }
    }
    return dp[n - 1]
}
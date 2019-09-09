package edpc

import utilities.debugLog
import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val h = (0 until n).map { sc.next().toInt() }
    println(edpcB(n, k, h))
}

fun edpcB(n: Int, k: Int, h: List<Int>): Int {
    val dp = (0 until n).map { Integer.MAX_VALUE }.toMutableList()
    dp[0] = 0
    for (i in 1 until n) {
        for (j in 1..k) {
            if (i - j >= 0) {
                dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]))
            }
        }
    }
    return dp[n - 1]
}
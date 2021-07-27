package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val c = sc.nextLong()
    val a = (0 until h).map { (0 until w).map { sc.next().toLong() } }
    println(problem210d(h, w, c, a))
}

fun problem210d(h: Int, w: Int, c: Long, a: List<List<Long>>): Long {
    val dp = Array(h + 1) { LongArray(w + 1) }

    for (i in 0..h) {
        for (j in 0..w) {
            if (i == 0 || j == 0) {
                dp[i][j] = 3000000001
            } else {
                dp[i][j] = listOf(a[i - 1][j - 1], dp[i - 1][j] + c, dp[i][j - 1] + c).min()!!
            }
        }
    }
    var min = Long.MAX_VALUE
    for (i in 1..h) {
        for (j in 1..w) {
            min = Math.min(min, Math.min(dp[i - 1][j] + c + a[i - 1][j - 1], dp[i][j - 1] + c + a[i - 1][j - 1]))
        }
    }

    return min
}
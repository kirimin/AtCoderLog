package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val r = sc.nextInt()
    val s = sc.nextInt()
    val p = sc.nextInt()
    val t = sc.next()
    println(problem149d(n, k, r, s, p, t))
}

fun problem149d(n: Int, k: Int, r: Int, s: Int, p: Int, t: String): Long {
    val getPoint = fun(c: Char): Pair<Long, Char> = when(c) {
        'r' -> p.toLong() to 'p'
        's' -> r.toLong() to 'r'
        'p' -> s.toLong() to 's'
        else -> 0L to '_'
    }
    val dp = Array(n) { 0L to '_' }
    dp[0] = getPoint(t[0])
    for (i in 1 until n) {
        val win = getPoint(t[i])
        if (i >= k && win.second == dp[i - k].second) {
            dp[i] = dp[i - 1].first to '_'
        } else {
            dp[i] = dp[i - 1].first + win.first to win.second
        }
    }
    return dp[n - 1].first
}

// r = グー
// s = チョキ
// p = パー
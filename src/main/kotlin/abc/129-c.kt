package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = hashSetOf<Int>()
    (0 until m).forEach { a.add(sc.next().toInt()) }
    println(problem129c(n, m, a))
}

fun problem129c(n: Int, m: Int, a: HashSet<Int>): Long {
    val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()
    val dp = LongArray(n + 1) { 0 }
    dp[0] = 1
    dp[1] = 1
    for (i in 2..n) {
        dp[i] += when {
            a.contains(i - 1) && a.contains(i - 2) -> {
                return 0
            }
            a.contains(i) -> {
                dp[i - 1]
            }
            a.contains(i - 1) || a.contains(i - 2) -> {
                dp[i - 1]
            }
            else -> {
                dp[i - 1] + dp[i - 2]
            }
        }
        dp[i] = dp[i] % mod
    }
    return dp[n]
}
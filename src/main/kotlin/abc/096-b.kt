package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val k = sc.nextInt()
    println(problem096b(a, b, c, k))
}

fun problem096b(a: Int, b: Int, c: Int, k: Int): Int {
    val dp = (0..k).map { IntArray(3) }.toMutableList()
    dp[0] = (intArrayOf(a, b, c))
    for (i in 1..k) {
        val abc = dp[i - 1]
        val a = abc[0]
        val b = abc[1]
        val c = abc[2]
        when {
            a >= b && a >= c -> dp[i] = (intArrayOf(a * 2, b, c))
            b >= a && b >= c -> dp[i] = (intArrayOf(a, b * 2, c))
            c >= a && c >= b -> dp[i] = (intArrayOf(a, b, c * 2))
        }
    }
    return dp[k].sum()
}
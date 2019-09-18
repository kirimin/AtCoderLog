package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val r = sc.nextInt()
    val d = sc.nextInt()
    val x2000 = sc.nextInt()
    println(problem127b(r, d, x2000))
}

fun problem127b(r: Int, d: Int, x2000: Int): String {
    val dp = (0..10).map { 0 }.toMutableList()
    dp[0] = x2000
    for (i in 1..10) {
        dp[i] = r * dp[i - 1] - d
    }
    return dp.drop(1).joinToString("\n")
}
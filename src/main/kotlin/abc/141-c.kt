package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextLong()
    val q = sc.nextInt()
    val a = (0 until q).map { sc.next().toInt() }
    println(problem141c(n, q, k, a))
}

fun problem141c(n: Int, q: Int, k: Long, a: List<Int>): String {
    val dp =  LongArray(n)
    for (i in 0 until q) {
        val winner = a[i]
        dp[winner - 1] = dp[winner - 1] + 1
    }
    val sb = StringBuilder()
    for (element in dp) {
        sb.append((if (q - k >= element) "No" else "Yes") + "\n")
    }
    return sb.toString()
}
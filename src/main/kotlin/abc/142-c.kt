package abc

import utilities.debugLog
import java.lang.StringBuilder
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem142c(n, a))
}

fun problem142c(n: Int, a: List<Int>): String {
    val dp = (0 until n).toMutableList()
    for (i in 0 until n) {
        dp[a[i] - 1] = i + 1
    }
    val sb = StringBuilder()
    dp.forEachIndexed { index, num ->
        sb.append(num)
        if (index != dp.size - 1) sb.append(" ")
    }
    return sb.toString()
}
package edpc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = mutableListOf<MutableList<Int>>()
    (0 until n).forEach { i ->
        a.add(mutableListOf())
        (0 until 3).forEach { j ->
            a[i].add(sc.next().toInt())
        }
    }
    println(edpcB(n, a))
}

fun edpcB(n: Int, a: MutableList<MutableList<Int>>): Int {
    val dp = (0..n).map { (0 until 3).map { 0 }.toMutableList() }.toMutableList()
    for (i in 0 until n) {
        for (j in 0 until 3) {
            for (k in 0 until 3) {
                if (j != k) {
                    dp[i + 1][k] = Math.max(dp[i + 1][k], dp[i][j] + a[i][k])
                }
            }
        }
    }
    return listOf(dp[n][0], dp[n][1], dp[n][2]).max()!!
}
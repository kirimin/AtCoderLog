package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val abc = (0 until m).map { Triple(sc.next().toInt(), sc.next().toInt(), sc.next().toLong()) }
    println(problem208d(n, m, abc))
}

fun problem208d(n: Int, m: Int, abc: List<Triple<Int, Int, Long>>): Long {
    var dist = Array(n) { LongArray(n) { Integer.MAX_VALUE.toLong() } }
    for (i in 0 until m) {
        val (a, b, c) = abc[i]
        dist[a - 1][b - 1] = c
    }
    for (i in 0 until n) {
        dist[i][i] = 0
    }

    var ans = 0L
    for (k in 0 until n) {
        val next = Array(n) { LongArray(n) { Integer.MAX_VALUE.toLong() } }
        for (i in 0 until n) {
            for (j in 0 until n) {
                next[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j])
                if (next[i][j] != Integer.MAX_VALUE.toLong()) {
                    ans += next[i][j]
                }
            }
        }
        dist = next
    }
    return ans
}
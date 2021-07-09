package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val abc = (0 until m).map { Triple(sc.next().toInt(), sc.next().toInt(), sc.next().toLong()) }
    println(problem191e(n, m, abc))
}

fun problem191e(n: Int, m: Int, abc: List<Triple<Int, Int, Long>>): Long {
    val dist = Array(n) { LongArray(n) { Integer.MAX_VALUE.toLong() } }
    for (i in 0 until m) {
        val (a, b, c) = abc[i]
        dist[a - 1][b - 1] = c
    }
    for (i in 0 until n) {
        dist[i][i] = 0
    }

    var ans = 0L
    for (k in 1..n) {
        for (k1 in 0 until k) {
            for (x in 0 until k) {
                for (y in 0 until k) {
                    dist[x][y] = Math.min(dist[x][y], dist[x][k1] + dist[k1][y])
                }
            }
        }
        for (s in 0 until n) {
            for (t in 0 until n) {
                if (dist[s][t] != Integer.MAX_VALUE.toLong()) {
                    ans += dist[s][t]
                }
            }
        }
    }
    return ans
}
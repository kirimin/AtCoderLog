package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val bc = (0 until m).map { sc.next().toInt() to sc.next().toLong() }
    println(problem127d(n, m, a, bc))
}

fun problem127d(n: Int, m: Int, a: List<Long>, bc: List<Pair<Int, Long>>): Long {
    val ans = a.sorted().toLongArray()
    val bc = bc.sortedByDescending { it.second }
    var prev = 0L
    for (i in 0 until m) {
        val (b, c) = bc[i]
        for (j in prev until b + prev) {
            if (j >= ans.size) break
            val j = j.toInt()
            if (ans[j] < c) ans[j] = c
        }
        prev += b
    }
    return ans.sum()
}
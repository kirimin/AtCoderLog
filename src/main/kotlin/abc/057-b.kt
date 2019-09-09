package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ab = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    val cd = (0 until m).map { sc.next().toLong() to sc.next().toLong() }
    println(problem057b(n, m, ab, cd))
}

fun problem057b(
    n: Int,
    m: Int,
    ab: List<Pair<Long, Long>>,
    cd: List<Pair<Long, Long>>
): String {
    val ans = (0 until n).toMutableList()
    for (i in 0 until n) {
        var minPoint = Long.MAX_VALUE
        for (j in 0 until m) {
            val distance = Math.abs(ab[i].first - cd[j].first) + Math.abs(ab[i].second - cd[j].second)
            if (minPoint > distance) {
                minPoint = distance
                ans[i] = j + 1
            }
        }
    }
    return ans.joinToString("\n")
}
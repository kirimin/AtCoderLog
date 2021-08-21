package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextLong()
    val w = sc.nextLong()
    val n = sc.nextInt()
    val ab = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem213c(h, w, n, ab))
}

fun problem213c(h: Long, w: Long, n: Int, ab: List<Pair<Long, Long>>): String {
    val ans = Array(n)  { 0L to 0L }
    val ab = ab.mapIndexed { index, pair -> index to pair }
    val aSorted = ab.sortedBy { it.second.first }
    val bSorted = ab.sortedBy { it.second.second }
    var prev = aSorted[0].second.first
    var count = 1L
    for (i in 0 until n) {
        if (prev != aSorted[i].second.first) {
            count++
        }
        ans[aSorted[i].first] = count to 0L
        prev = aSorted[i].second.first
    }

    prev = bSorted[0].second.second
    count = 1L
    for (i in 0 until n) {
        if (prev != bSorted[i].second.second) {
            count++
        }
        ans[bSorted[i].first] = ans[bSorted[i].first].first to count
        prev = bSorted[i].second.second
    }

    return ans.map { "${it.first} ${it.second}" }.joinToString("\n")
}
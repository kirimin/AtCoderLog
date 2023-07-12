package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val sa = (0 until n).map { sc.next() to sc.next().toLong() }
    println(problem304a(n, sa))
}

fun problem304a(n: Int, sa: List<Pair<String, Long>>): String {
    val ans = mutableListOf<String>()
    val minIndex = sa.indexOf(sa.minBy { it.second })
    for (i in 0 until n) {
        if (minIndex + i >= n) {
            ans.add(sa[minIndex + i - n].first)
        } else {
            ans.add(sa[minIndex + i].first)
        }
    }
    return ans.joinToString("\n")
}
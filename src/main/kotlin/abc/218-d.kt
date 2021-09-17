package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val xy = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem218d(n, xy))
}

fun problem218d(n: Int, xy: List<Pair<Long, Long>>): Int {
    val square = mutableSetOf<List<Pair<Long, Long>>>()
    val xy = xy.sortedBy { it.second }.sortedBy { it.first }
    val set = xy.toSet()
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            val a = xy[i]
            val b = xy[j]
            if (a.first == b.first || a.second == b.second) continue
            if (set.contains(b.first to a.second) &&
                set.contains(a.first to b.second)) {
                if (square.contains(listOf(a, b, b.first to a.second, a.first to b.second).sortedBy { it.second }.sortedBy { it.first })) {
                    continue
                } else {
                    square.add(listOf(a, b, b.first to a.second, a.first to b.second).sortedBy { it.second }.sortedBy { it.first })
                }
            }
        }
    }
    return square.size
}
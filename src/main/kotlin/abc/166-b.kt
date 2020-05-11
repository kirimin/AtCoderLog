package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val d = (0 until k).map {
        val di = sc.next().toInt()
        val list = (0 until di).map {
            sc.next().toInt()
        }
        di to list
    }
    println(problem166b(n, k, d))
}

fun problem166b(
    n: Int,
    k: Int,
    d: List<Pair<Int, List<Int>>>
): Int {
    val sunukes = Array(n) { mutableSetOf<Int>() }
    for (i in 0 until k) {
        for (j in 0 until d[i].first) {
            sunukes[d[i].second[j] - 1].add(i + 1)
        }
    }
    return sunukes.count { it.isEmpty() }
}
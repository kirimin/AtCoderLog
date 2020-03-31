package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val k = sc.nextLong()
    val n = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem160c(k, n, a))
}

fun problem160c(k: Long, n: Long, a: List<Long>): Long {
    var maxDiff = a[0]
    var maxI = -1
    for (i in 1 until a.size) {
        val diff = a[i] - a[i - 1]
        if (maxDiff < diff) maxI = i
        maxDiff = Math.max(maxDiff, diff)
    }
    if (maxDiff <= k - a.last() + a[0]) maxI = -1

    if (maxI == -1) {
        return a.last() - a[0]
    }
    return a[maxI - 1] + k - a[maxI]
}
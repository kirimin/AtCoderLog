package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until n).map { sc.next().toLong() }
    val c = (0 until m).map { sc.next().toLong() }
    val d = (0 until m).map { sc.next().toLong() }
    println(problem245e(n, m, a, b, c, d))
}

fun problem245e(n: Int, m: Int, a: List<Long>, b: List<Long>, c: List<Long>, d: List<Long>): String {
    var ab = Array(n) { 0L to 0L }
    for (i in 0 until n) {
        ab[i] = a[i] to b[i]
    }
    var cd = Array(m) { 0L to 0L }
    for (i in 0 until m) {
        cd[i] = c[i] to d[i]
    }
    ab = ab.sortedBy { it.first }.toTypedArray()
    cd = cd.sortedBy { it.first }.toTypedArray()
    val c = mutableListOf<Long>()
    val d = mutableListOf<Long>()
    for (i in 0 until m) {
        c.add(cd[i].first)
        d.add(cd[i].second)
    }

    val used = BooleanArray(m) { false }
    for (i in 0 until n) {
        val abi = ab[i]
        var flag = false
        var first = c.binarySearch(abi.first)
        if (first * -1 > m) return "No"
        if (first < 0) first = (first * -1) - 1
        for (j in first until m) {
            if (used[j]) continue
            val cdj = cd[j]
            if (abi.first <= cdj.first && abi.second <= cdj.second) {
                used[j] = true
                c.remove(cdj.first)
                flag = true
                break
            }
        }
        if (!flag) return "No"
    }
    return "Yes"
}
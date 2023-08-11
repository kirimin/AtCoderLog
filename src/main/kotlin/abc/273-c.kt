package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem273c(n, a))
}

fun problem273c(n: Int, a: List<Long>): String {
    val ad = a.distinct().sorted()
    val map = mutableMapOf<Int, Int>()
    for (i in 0 until n) {
        val ai = a[i]
        val index = ad.binarySearch(ai)
        val count = ad.size - index - 1
        debugLog(ad, ai, count)
        map[count] = map.getOrDefault(count, 0) + 1
    }
    debugLog(map)
    val ans = mutableListOf<Int>()
    for (k in 0 until n) {
        ans.add(map[k]?:0)
    }
    return ans.joinToString("\n")
}
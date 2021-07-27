package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem209e(n, s))
}

fun problem209e(n: Int, s: List<String>): String {
    val s = s.map { it.take(3) to it.takeLast(3) }
    val set = s.map { it.first }.toSet()
    debugLog(s)
    debugLog(set)

    val map = mutableMapOf<String, Int>()
    val ans = IntArray(n)
    for (i in 0 until n) {
        if (set.contains(s[i].second)) {
            if (map[s[i].first] == null) map[s[i].first] = 0
            map[s[i].first] = map[s[i].first]!!.plus(1)
        }
    }
    for (i in 0 until n) {
        ans[i] = map[s[i].first] ?: -1
    }

    return ans.joinToString("\n")
}
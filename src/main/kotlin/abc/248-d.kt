package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    val q = sc.nextInt()
    val query = (0 until q).map { Triple(sc.next().toInt(), sc.next().toInt(), sc.next().toInt()) }
    println(problem248d(n, a, q, query))
}

fun problem248d(n: Int, a: List<Int>, q: Int, query: List<Triple<Int, Int, Int>>): String {
    val global = mutableMapOf<Int, Pair<Int, Int>>()
    val s = Array(n + 1) { mutableMapOf<Int, Int>() }
    for (i in 0 until n) {
        val ai = a[i]
        s[i + 1][ai] = (global[ai]?.first ?: 0) + 1
            }
    debugLog(s.toList())
    val ans = mutableListOf<Int>()
    for (i in 0 until q) {
        val (left, right, x) = query[i]
        ans.add((s[right - 1][x] ?: 0) - (s[left - 1][x] ?: 0))
    }
    return ans.joinToString("\n")
}

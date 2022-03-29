package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val q = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val xk = (0 until q).map { sc.next().toLong() to sc.next().toInt() }
    println(problem235c(n, q, a, xk))
}

fun problem235c(n: Int, q: Int, a: List<Long>, xk: List<Pair<Long, Int>>): String {
    val map = mutableMapOf<Long, MutableList<Int>>()
    for (i in 0 until n) {
        val ai = a[i]
        if (!map.containsKey(ai)) {
            map[ai] = mutableListOf()
        }
        map[ai]!!.add(i + 1)
    }
    val ans = mutableListOf<Int>()
    for (i in 0 until q) {
        val (x, k) = xk[i]
        val xList = map[x]
        if (xList == null) {
            ans.add(-1)
            continue
        }
        if (xList.size <= k - 1) {
            ans.add(-1)
            continue
        }
        ans.add(xList[k - 1])
    }
    return ans.joinToString("\n")
}
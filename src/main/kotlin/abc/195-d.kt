package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val q = sc.nextInt()
    val wv = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    val x = (0 until m).map { sc.next().toInt() }
    val query = (0 until q).map { sc.next().toInt() to sc.next().toInt() }
    println(problem195d(n, m, q, wv, x, query))
}

fun problem195d(n: Int, m: Int, q: Int, wv: List<Pair<Int, Int>>, x: List<Int>, query: List<Pair<Int, Int>>): String {
    val values = LongArray(q)
    val wv = wv.sortedByDescending { it.second }
    val x = x.mapIndexed { index, i -> index to i }.sortedBy { it.second }
    for (k in 0 until q) {
        var (l, r) = query[k]
        l--
        r--
        val used = mutableSetOf<Int>()
        for (i in 0 until m) {
            val (index, xi) = x[i]
            if (index in l..r) continue
            var max = -1 to -1
            for (j in 0 until n) {
                val (w, v) = wv[j]
                if (w <= xi && !used.contains(j)) {
                    if (max.second < v) {
                        max = j to v
                    }
                }
            }
            if (max.first != -1) {
                values[k] = values[k] + max.second
                used.add(max.first)
            }
        }
    }
    return values.joinToString("\n")
}
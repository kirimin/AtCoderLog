package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val q = sc.nextInt()
    val v = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    val c = (0 until n).map { sc.next().toInt() }
    val s = (0 until q).map {
        val num = sc.next().toInt()
        if (num == 1) {
            listOf(num, sc.next().toInt())
        } else {
            listOf(num, sc.next().toInt(), sc.next().toInt())
        }
    }
    println(problem3e(n, m, q, v, c, s))
}

fun problem3e(
    n: Int,
    m: Int,
    q: Int,
    v: List<Pair<Int, Int>>,
    c: List<Int>,
    s: List<List<Int>>
): String {
    val res = mutableListOf<Int>()
    val graph = Array(n) { mutableListOf<Int>() to 0 }
    for (i in 0 until m) {
        val vi = v[i]
        graph[vi.first - 1].first.add(vi.second - 1)
        graph[vi.second - 1].first.add(vi.first - 1)
    }
    for (i in 0 until n) {
        graph[i] = graph[i].first to c[i]
    }
    for (i in 0 until s.size) {
        val si = s[i]
        when (si[0]) {
            1 -> {
                val position = graph[si[1] - 1]
                res.add(position.second)
                for (j in 0 until position.first.size) {
                    graph[position.first[j]] = graph[position.first[j]].first to position.second
                }
            }
            2 -> {
                val position = graph[si[1] - 1]
                res.add(position.second)
                graph[si[1] - 1] = graph[si[1] - 1].first to si[2]
            }
        }
    }
    return res.joinToString("\n")
}
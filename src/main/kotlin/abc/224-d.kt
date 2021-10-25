package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val m = sc.nextInt()
    val uv = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    val p = (0 until 8).map { sc.next().toInt() }
    println(problem224d(m, uv, p))
}

fun problem224d(m: Int, uv: List<Pair<Int, Int>>, p: List<Int>): Int {
    val g = Array(10) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val (u, v) = uv[i]
        g[u - 1].add(v - 1)
        g[v - 1].add(u - 1)
    }

    val s = "999999999".toCharArray()
    for (i in 0 until 8) {
        s[p[i] - 1] = ('0' + (i + 1))
    }

    val q = ArrayDeque<String>()
    q.offer(s.joinToString(""))
    val map = mutableMapOf<String, Int>()
    map[s.joinToString("")] = 0

    while (q.isNotEmpty()) {
        val s = q.poll()
        val v = s.indexOf('9')

        for (u in g[v]) {
            val t = s.toCharArray()
            val tmp = t[v]
            t[v] = t[u]
            t[u] = tmp
            val ts = t.joinToString("")
            if (map[ts] != null) continue
            map[ts] = (map[s] ?: 0) + 1
            q.offer(ts)
        }
    }
    return map["123456789"] ?: -1
}
package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val s = (0 until h).map { sc.next().toCharArray() }
    println(problem088d(h, w, s))
}

fun problem088d(h: Int, w: Int, a: List<CharArray>): Int {
    val seen = Array(h) { Array(w) { "_" } }
    val deque = ArrayDeque<Pair<Int, Int>>()
    seen[0][0] = "0"
    deque.offer(0 to 0)
    while (deque.isNotEmpty()) {
        val v = deque.poll()
        // left
        if (v.second - 1 >= 0 && a[v.first][v.second - 1] != '#' && seen[v.first][v.second - 1] == "_") {
            seen[v.first][v.second - 1] = (seen[v.first][v.second].toInt() + 1).toString()
            deque.offer(v.first to v.second - 1)
        }
        // right
        if (v.second + 1 < w && a[v.first][v.second + 1] != '#' && seen[v.first][v.second + 1] == "_") {
            seen[v.first][v.second + 1] = (seen[v.first][v.second].toInt() + 1).toString()
            deque.offer(v.first to v.second + 1)
        }
        // top
        if (v.first - 1 >= 0 && a[v.first - 1][v.second] != '#' && seen[v.first - 1][v.second] == "_") {
            seen[v.first - 1][v.second] = (seen[v.first][v.second].toInt() + 1).toString()
            deque.offer(v.first - 1 to v.second)
        }
        // bottom
        if (v.first + 1 < h && a[v.first + 1][v.second] != '#' && seen[v.first + 1][v.second] == "_") {
            seen[v.first + 1][v.second] = (seen[v.first][v.second].toInt() + 1).toString()
            deque.offer(v.first + 1 to v.second)
        }
    }
    if (seen[h - 1][w - 1] == "_") return -1
    var whiteCount = -1
    for (i in 0 until a.size) {
        for (j in 0 until a[i].size) {
            if (a[i][j] != '#') whiteCount++
        }
    }
    val minCost = seen[h - 1][w - 1]
    return whiteCount - minCost.toInt()
}
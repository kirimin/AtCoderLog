package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val s = (0 until h).map { sc.next() }
    println(problem253b(h, w, s))
}

fun problem253b(h: Int, w: Int, s: List<String>): String {
    var startAndEnd = mutableListOf<Pair<Int, Int>>()
    loop@for (i in 0 until h) {
        for (j in 0 until w) {
           if (s[i][j] == 'o') {
               startAndEnd.add(i to j)
           }
        }
    }

    val seen = Array(h) { Array(w) { "-" } }
    val deque = ArrayDeque<Pair<Int, Int>>()
    seen[startAndEnd[0].first][startAndEnd[0].second] = "0"
    deque.offer(startAndEnd[0].first to startAndEnd[0].second)
    while (deque.isNotEmpty()) {
        val v = deque.poll()
        fun searchPosition(yOffset: Int = 0, xOffset: Int = 0) {
            val y = v.first + yOffset
            val x = v.second + xOffset
            if (seen[y][x] == "-") {
                seen[y][x] = (seen[v.first][v.second].toInt() + 1).toString()
                deque.offer(y to x)
            }
        }
        // left
        if (v.second - 1 >= 0) {
            searchPosition(xOffset = -1)
        }
        // right
        if (v.second + 1 < w) {
            searchPosition(xOffset = 1)
        }
        // top
        if (v.first - 1 >= 0) {
            searchPosition(yOffset = -1)
        }
        // bottom
        if (v.first + 1 < h) {
            searchPosition(yOffset = 1)
        }
    }
    return seen[startAndEnd[1].first][startAndEnd[1].second]
}
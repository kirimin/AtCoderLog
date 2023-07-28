package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val s = (0 until h).map { sc.next().toCharArray() }
    println(problem308d(h, w, s))
}

fun problem308d(h: Int, w: Int, a: List<CharArray>): String {
    if (a[0][0] != 's') return "No"
    val root = arrayOf('s', 'n', 'u', 'k', 'e' )
    val seen = Array(h) { Array(w) { "_" } }
    val deque = ArrayDeque<Pair<Int, Int>>()
    seen[0][0] = "1"
    deque.offer(0 to 0)
    while (deque.isNotEmpty()) {
        val v = deque.poll()
        fun searchPosition(yOffset: Int = 0, xOffset: Int = 0) {
            val y = v.first + yOffset
            val x = v.second + xOffset
            if (seen[y][x] == "_" && a[y][x] == root[seen[v.first][v.second].toInt() % 5]) {
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
    if (seen[h - 1][w - 1] == "_") return "No"
    return "Yes"
}
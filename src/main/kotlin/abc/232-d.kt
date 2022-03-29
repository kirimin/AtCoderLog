package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val c = (0 until h).map { sc.next() }
    println(problem232d(h, w, c))
}

fun problem232d(h: Int, w: Int, c: List<String>): Int {
    val seen = Array(h) { Array(w) { "_" } }
    val deque = ArrayDeque<Pair<Int, Int>>()
    seen[0][0] = "0"
    deque.offer(0 to 0)
    while (deque.isNotEmpty()) {
        val v = deque.poll()
        fun searchPosition(yOffset: Int = 0, xOffset: Int = 0) {
            val y = v.first + yOffset
            val x = v.second + xOffset
            if (c[y][x] != '#' && seen[y][x] == "_") {
                seen[y][x] = (seen[v.first][v.second].toInt() + 1).toString()
                deque.offer(y to x)
            }
        }
        // right
        if (v.second + 1 < w) {
            searchPosition(xOffset = 1)
        }
        // bottom
        if (v.first + 1 < h) {
            searchPosition(yOffset = 1)
        }
    }
    return seen.map { it.map { if (it != "_") it.toInt() else 0 }.max()!! }.max()!! + 1
}
package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val s = (0 until 3).map { sc.next() }
    println(problem009f(a, b, s))
}

fun problem009f(a: Int, b: Int, s: List<String>): Int {
    val h = 9
    val w = 9

    val seen = Array(h) { Array(w) { "_" } }
    val deque = ArrayDeque<Pair<Int, Int>>()
    seen[a - 1][b - 1] = "0"
    deque.offer(a - 1 to b - 1)
    while (deque.isNotEmpty()) {
        val v = deque.poll()
        fun searchPosition(yOffset: Int = 0, xOffset: Int = 0) {
            val y = v.first + yOffset
            val x = v.second + xOffset
            if (seen[y][x] == "_") {
                seen[y][x] = (seen[v.first][v.second].toInt() + 1).toString()
                deque.offer(y to x)
            }
        }
        // left
        if (v.second - 1 >= 0 && s[1][0] == '#') {
            searchPosition(xOffset = -1)
        }
        // right
        if (v.second + 1 < w && s[1][2] == '#') {
            searchPosition(xOffset = 1)
        }
        // top
        if (v.first - 1 >= 0 && s[0][1] == '#') {
            searchPosition(yOffset = -1)
        }
        // bottom
        if (v.first + 1 < h && s[2][1] == '#') {
            searchPosition(yOffset = 1)
        }
        // left top
        if (v.second - 1 >= 0 && v.first - 1 >= 0 && s[0][0] == '#') {
            searchPosition(xOffset = -1, yOffset =  -1)
        }
        // left bottom
        if (v.second - 1 >= 0 && v.first + 1 < h && s[2][0] == '#') {
            searchPosition(xOffset = -1, yOffset = 1)
        }
        // right top
        if (v.second + 1 < w && v.first - 1 >= 0 && s[0][2] == '#') {
            searchPosition(xOffset = 1, yOffset = -1)
        }
        // right bottom
        if (v.second + 1 < w && v.first + 1 < h && s[2][2] == '#') {
            searchPosition(xOffset = 1, yOffset = 1)
        }
    }
    return seen.sumBy { it.count { it != "_" } }
}

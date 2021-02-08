package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val s = (0 until h).map { sc.next().toCharArray() }
    println(problem191c(h, w, s))
}

fun problem191c(h: Int, w: Int, s: List<CharArray>): Int {
    val seen = Array(h) { Array(w) { "_" } }
    val deque = ArrayDeque<Pair<Int, Int>>()
    seen[0][0] = "0"
    deque.offer(0 to 0)
    var count = 0
    while (deque.isNotEmpty()) {
        val v = deque.poll()
        fun searchPosition(yOffset: Int = 0, xOffset: Int = 0) {
            val y = v.first + yOffset
            val x = v.second + xOffset
            if (s[y][x] == '#' && seen[y][x] == "_") {
                // 右上
                if (s[y + 1][x] == '.' && s[y][x + 1] == '.' && s[y + 1][x + 1] == '.') {
                    count++
                }
                if (s[y + 1][x] == '#' && s[y][x + 1] == '#' && s[y + 1][x + 1] == '.') {
                    count++
                }
                //左上
                if (s[y + 1][x] == '.' && s[y][x - 1] == '.' && s[y + 1][x - 1] == '.') {
                    count++
                }
                if (s[y + 1][x] == '#' && s[y][x - 1] == '#' && s[y + 1][x - 1] == '.') {
                    count++
                }
                // 右下
                if (s[y - 1][x] == '.' && s[y][x + 1] == '.' && s[y - 1][x + 1] == '.') {
                    count++
                }
                if (s[y - 1][x] == '#' && s[y][x + 1] == '#' && s[y - 1][x + 1] == '.') {
                    count++
                }
                //左下
                if (s[y - 1][x] == '.' && s[y][x - 1] == '.' && s[y - 1][x - 1] == '.') {
                    count++
                }
                if (s[y - 1][x] == '#' && s[y][x - 1] == '#' && s[y - 1][x - 1] == '.') {
                    count++
                }
            }
            if (seen[y][x] == "_") {
                seen[y][x] = "1"
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
    return count
}
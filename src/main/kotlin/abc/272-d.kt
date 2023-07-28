package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    println(problem272d(n, m))
}

fun problem272d(n: Int, m: Int): Int {
    val speed = Math.sqrt(m.toDouble()).toInt()
    val seen = Array(n) { Array(n) { "-1" } }
    val deque = ArrayDeque<Pair<Int, Int>>()
    seen[0][0] = "0"
    deque.offer(0 to 0)
    while (deque.isNotEmpty()) {
        val v = deque.poll()
        fun searchPosition(yOffset: Int = 0, xOffset: Int = 0) {
            val y = v.first + yOffset
            val x = v.second + xOffset
            if (seen[y][x] == "-1") {
                seen[y][x] = (seen[v.first][v.second].toInt() + 1).toString()
                deque.offer(y to x)
            }
        }
        // left
        if (v.second - speed >= 0) {
            searchPosition(xOffset = -speed)
        }
        // right
        if (v.second + speed < n) {
            searchPosition(xOffset = speed)
        }
        // top
        if (v.first - speed >= 0) {
            searchPosition(yOffset = -speed)
        }
        // bottom
        if (v.first + speed < n) {
            searchPosition(yOffset = speed)
        }
        // top left
        if (v.second - speed >= 0 && v.first - speed >= 0) {
            searchPosition(xOffset = -speed, yOffset = -speed)
        }
        // top right
        if (v.second + speed < n && v.first - speed >= 0) {
            searchPosition(xOffset = speed, yOffset = -speed)
        }
        // bottom left
        if (v.second - speed >= 0 && v.first + speed < n) {
            searchPosition(xOffset = -speed, yOffset = speed)
        }
        // bottom right
        if (v.second + speed < n && v.first + speed < n) {
            searchPosition(xOffset = speed, yOffset = speed)
        }
    }
    debugLog(seen.map { it.toList() })
    return 0
}

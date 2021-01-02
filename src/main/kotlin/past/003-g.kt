package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    val y = sc.nextInt()
    val xy = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem3g(n, x, y, xy))
}

fun problem3g(
    n: Int,
    x: Int,
    y: Int,
    xy: List<Pair<Int, Int>>
): String {
    val w = 500
    val h = 500
    val start = w / 2
    val seen = Array(h + 1) { Array(w + 1) { "_" } }
    for (i in 0 until xy.size) {
        val block = xy[i]
        seen[block.first + h / 2][block.second + w / 2] = "#"
    }
    val deque = ArrayDeque<Pair<Int, Int>>()
    seen[start][start] = "0"
    deque.offer(start to start)
    while (deque.isNotEmpty()) {
        val v = deque.poll()
        // + +
        if (v.first < w && v.second < h && seen[v.first + 1][v.second + 1] != "#" && seen[v.first + 1][v.second + 1] == "_") {
            seen[v.first + 1][v.second + 1] = (seen[v.first][v.second].toInt() + 1).toString()
            deque.offer(v.first + 1 to v.second + 1)
        }
        //   +
        if (v.second < h && seen[v.first][v.second + 1] != "#" && seen[v.first][v.second + 1] == "_") {
            seen[v.first][v.second + 1] = (seen[v.first][v.second].toInt() + 1).toString()
            deque.offer(v.first to v.second + 1)
        }
        // - +
        if (v.first > 0 && v.second < h && seen[v.first - 1][v.second + 1] != "#" && seen[v.first - 1][v.second + 1] == "_") {
            seen[v.first - 1][v.second + 1] = (seen[v.first][v.second].toInt() + 1).toString()
            deque.offer(v.first - 1 to v.second + 1)
        }
        // +
        if (v.first < w && seen[v.first + 1][v.second] != "#" && seen[v.first + 1][v.second] == "_") {
            seen[v.first + 1][v.second] = (seen[v.first][v.second].toInt() + 1).toString()
            deque.offer(v.first + 1 to v.second)
        }
        // -
        if (v.first > 0 && seen[v.first - 1][v.second] != "#" && seen[v.first - 1][v.second] == "_") {
            seen[v.first - 1][v.second] = (seen[v.first][v.second].toInt() + 1).toString()
            deque.offer(v.first - 1 to v.second)
        }
        //   -
        if (v.second > 0 && seen[v.first][v.second - 1] != "#" && seen[v.first][v.second - 1] == "_") {
            seen[v.first][v.second - 1] = (seen[v.first][v.second].toInt() + 1).toString()
            deque.offer(v.first to v.second - 1)
        }
    }
    val goal = seen[x + h / 2][y + w / 2]
    return if (goal == "_") "-1" else goal
}
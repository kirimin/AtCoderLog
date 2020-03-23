package agc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val s = (0 until h).map { sc.next().toCharArray() }
    println(problem043a(h, w, s))
}

fun problem043a(h: Int, w: Int, s: List<CharArray>): Int {
    val dx = arrayOf(1, 0)
    val dy = arrayOf(0, 1)

    var res = 0
    val dist = Array(h) { Array(w) { -1 to 0 } }
    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.offer(0 to 0)
    dist[0][0] = 0 to if (s[0][0] == '#') 1 else 0

    while (!queue.isEmpty()) {
        val current = queue.poll()

        val (x, y) = current
        for (direction in 0 until 2) {
            val nextX = x + dx[direction]
            val nextY = y + dy[direction]
            if (nextX >= h || nextY >= w) continue
//            debugLog(x, y, dist[x][y], nextX, nextY, dist[nextX][nextY])
            if (dist[nextX][nextY].first == -1 || dist[x][y].second < dist[nextX][nextY].second) {
                queue.offer(nextX to nextY)
                dist[nextX][nextY] = dist[x][y].first + 1 to if (s[x][y] != '#' && s[nextX][nextY] == '#') dist[x][y].second + 1 else dist[x][y].second
            }
        }
    }
    return dist[h - 1][w - 1].second
//    dist.forEach { it.forEach { print(it) }; println() }
}
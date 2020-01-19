package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val s = (0 until h).map { sc.next().toCharArray() }
    println(problem151d(h, w, s))
}

fun problem151d(h: Int, w: Int, s: List<CharArray>): Int {
    val dx = arrayOf(1, 0, -1, 0)
    val dy = arrayOf(0, 1, 0, -1)

    var res = 0
    for (i in 0 until h) {
        for (j in 0 until w) {
            if (s[i][j] == '#') continue
            val dist = Array(h) { IntArray(w) { -1 } }
            val queue = ArrayDeque<Pair<Int, Int>>()
            queue.offer(i to j)
            dist[i][j] = 0

            while (!queue.isEmpty()) {
                val current = queue.poll()
                val (x, y) = current
                for (direction in 0 until 4) {
                    val nextX = x + dx[direction]
                    val nextY = y + dy[direction]
                    if (nextX < 0 || nextX >= h || nextY < 0 || nextY >= w) continue
                    if (s[nextX][nextY] == '#') continue

                    if (dist[nextX][nextY] == -1) {
                        queue.offer(nextX to nextY)
                        dist[nextX][nextY] = dist[x][y] + 1
                    }
                }
            }
            res = Math.max(res, dist.maxBy { it.max()!! }!!.max()!!)
        }
    }
    return res
}
package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val s = (0 until h).map { (0 until w).map { sc.next().toLong() }.toLongArray() }.toTypedArray()
    val n = sc.nextInt()
    val rc = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem011f(h, w, s, n, rc))
}

fun problem011f(h: Int, w: Int, s: Array<LongArray>, n: Int, rc: List<Pair<Int, Int>>): String {
    for (i in 0 until n) {
        val (r, c) = rc[i]
        val shoot = s[r - 1][c - 1]
        if (shoot == 0L) continue
        s[r - 1][c - 1] = 0
        var y = r
        while (y != 1) {
            s[y - 1][c - 1] = s[y - 2][c - 1]
            s[y - 2][c - 1] = 0
            y--
        }
    }
    return s.map { it.joinToString(" ") }.joinToString("\n")
}
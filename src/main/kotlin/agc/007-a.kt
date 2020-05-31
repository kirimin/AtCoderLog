package agc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val a = (0 until h).map { sc.next().toCharArray() }
    println(problem007a(h, w, a))
}

fun problem007a(h: Int, w: Int, a: List<CharArray>): String {
    for (i in 0 until h) {
        for (j in 0 until w) {
            if (a[i][j] != '#') continue
            if (i == h - 1 && j == w - 1) continue

            val top = if (i == 0) '.' else a[i - 1][j]
            val bottom = if (i == h - 1) '.' else a[i + 1][j]
            val left = if (j == 0) '.' else a[i][j - 1]
            val right = if (j == w - 1) '.' else a[i][j + 1]
            if (right == '#' && bottom == '#') {
                return "Impossible"
            }
            if (i == 0 && j == 0) continue
            if (listOf(top, bottom, left, right).count { it == '#' } != 2) {
                return "Impossible"
            }
        }
    }
    return "Possible"
}
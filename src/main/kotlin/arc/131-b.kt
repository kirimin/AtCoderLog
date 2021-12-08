package arc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val c = (0 until h).map { sc.next().toCharArray() }
    println(problem131b(h, w, c))
}

fun problem131b(h: Int, w: Int, a: List<CharArray>): String {
    for (i in 0 until h) {
        for (j in 0 until w) {
            if (a[i][j] != '.') continue
            val set = mutableSetOf<Char>()
            val v = i to j
            fun searchPosition(yOffset: Int = 0, xOffset: Int = 0) {
                val y = v.first + yOffset
                val x = v.second + xOffset
                if (a[y][x] != '.') {
                    val side = (a[y][x])
                    set.add(side)
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
            if (!set.contains('1')) {
                a[i][j] = '1'
            } else if (!set.contains('2')) {
                a[i][j] = '2'
            } else if (!set.contains('3')) {
                a[i][j] = '3'
            } else if (!set.contains('4')) {
                a[i][j] = '4'
            } else if (!set.contains('5')) {
                a[i][j] = '5'
            }
        }
    }
    return a.map { it.joinToString("") }.joinToString("\n")
}
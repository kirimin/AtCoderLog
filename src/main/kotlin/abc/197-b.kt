package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val x = sc.nextInt()
    val y = sc.nextInt()
    val s = (0 until h).map { sc.next() }
    println(problem197b(h, w, x, y, s))
}

fun problem197b(h: Int, w: Int, x: Int, y: Int, s: List<String>): Int {
    val x2 = x - 1
    val y2 = y - 1
    var count = 0
    for (i in y2 + 1 until w) {
        if (s[x2][i] == '.') count++ else break
    }
    for (i in y2 - 1 downTo 0) {
        if (s[x2][i] == '.') count++ else break
    }
    for (i in x2 + 1 until h) {
        if (s[i][y2] == '.') count++ else break
    }
    for (i in x2 - 1 downTo 0) {
        if (s[i][y2] == '.') count++ else break
    }
    return count + 1
}
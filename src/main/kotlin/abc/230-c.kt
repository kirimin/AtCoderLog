package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val a = sc.nextLong()
    val b = sc.nextLong()
    val p = sc.nextLong()
    val q = sc.nextLong()
    val r = sc.nextLong()
    val s = sc.nextLong()
    println(problem230c(n, a, b, p, q, r, s))
}

fun problem230c(n: Long, a: Long, b: Long, p: Long, q: Long, r: Long, s: Long): String {
    val offset = p - 1 to r - 1
    var rightStart = a + (Math.max(1 - a, 1 - b)) - 1 to b + (Math.max(1 - a, 1 - b)) - 1
    var leftStart = a + (Math.max(1 - a, b - n)) - 1 to b - (Math.max(1 - a, b - n)) - 1
    val ans = Array((q - p + 1).toInt()) { CharArray((s - r + 1).toInt()) { '.' } }
    for (i in 0 until ans.size) {
        for (j in 0 until ans[0].size) {
            val y = i + offset.first
            val x = j + offset.second
            if (rightStart.first - rightStart.second == y - x) {
                ans[i][j] = '#'
            }
            if (leftStart.first + leftStart.second == y + x) {
                ans[i][j] = '#'
            }
        }
    }
    return ans.map { it.joinToString("") }.joinToString("\n")
}

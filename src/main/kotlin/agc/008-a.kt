package agc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextLong()
    val y = sc.nextLong()
    println(problem008a(x, y))
}

fun problem008a(x: Long, y: Long): Long {
    var min = Long.MAX_VALUE
    if (x <= y) min = Math.min(min, y - x)
    if (-x <= y) min = Math.min(min, y + x + 1)
    if (x <= -y) min = Math.min(min, -y - x + 1)
    if (-x <= -y) min = Math.min(min, -y + x + 2)
    return min
}
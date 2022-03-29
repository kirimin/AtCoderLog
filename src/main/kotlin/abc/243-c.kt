package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val xy = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    val s = sc.next()
    println(problem243c(n, xy, s))
}

fun problem243c(n: Int, xy: List<Pair<Long, Long>>, s: String): String {
    val xy = xy.mapIndexed{ index, pair -> Triple(pair.first, pair.second, s[index]) }.sortedBy { it.first }.sortedBy { it.second }
//    debugLog(xy)
    var currentY = -1L
    for (i in 0 until n) {
        val (x, y, d) = xy[i]
        if (y != currentY) {
            currentY = y
            continue
        }
        val prevX = xy[i - 1].first
        val prevDirection = xy[i - 1].third
//        debugLog(i, currentY, prevX, prevDirection, x, d)
        if (d != prevDirection) {
            if (d == 'R' && x < prevX) {
                return "Yes"
            } else if (d == 'L' && x > prevX) {
                return "Yes"
            }
        }
    }
    return "No"
}
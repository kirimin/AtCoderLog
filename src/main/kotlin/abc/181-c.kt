package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val xy = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem181c(n, xy))
}

fun problem181c(n: Int, xy: List<Pair<Int, Int>>): String {
    for (i in 0 until n) {
        for (j in 0 until i) {
            for (k in 0 until j) {
                var (x1, y1) = xy[i]
                var (x2, y2) = xy[j]
                var (x3, y3) = xy[k]
                debugLog(xy[i], xy[j], xy[k])
                x1 -= x3
                x2 -= x3
                y1 -= y3
                y2 -= y3
                debugLog(x1 to y1, x2 to y2, x1 * y2, x2 * y1)
                if (x1 * y2 == x2 * y1) return "Yes"
            }
        }
    }
    return "No"
}
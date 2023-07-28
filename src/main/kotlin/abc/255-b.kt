package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val a = (0 until k).map { sc.next().toInt() }
    val xy = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem255b(n, k, a, xy))
}

fun problem255b(n: Int, k: Int, a: List<Int>, xy: List<Pair<Int, Int>>): Double {
    val distance = Array(n) { DoubleArray(n) }
    for (i in 0 until n) {
        val (x1, y1) = xy[i]
        for (j in 0 until n) {
            val (x2, y2) = xy[j]
            val sqrt = Math.sqrt((x1 - x2) * (x1 - x2).toDouble() + (y1 - y2) * (y1 - y2).toDouble())
            distance[i][j] = sqrt
        }
    }
    var max = 0.0
    val a = a.toSet()
    for (i in 0 until n) {
        if (a.contains(i + 1)) {
            continue
        }
        var min = Double.MAX_VALUE
        for (j in 0 until n) {
            if (!a.contains(j + 1)) {
                continue
            }
//            debugLog(j, i, distance[j][i])
            min = Math.min(min, distance[j][i])
        }
//        debugLog(min)
        max = Math.max(max, min)
    }
    return max
}
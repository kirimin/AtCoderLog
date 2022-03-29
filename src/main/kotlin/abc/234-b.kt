package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val xy = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem234b(n, xy))
}

fun problem234b(n: Int, xy: List<Pair<Int, Int>>): Double {
    var max = 0.0
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            val (x1, y1) = xy[i]
            val (x2, y2) = xy[j]
            max = Math.max(max,
                Math.sqrt(Math.pow((x1.toDouble() - x2.toDouble()), 2.0) + Math.pow((y1.toDouble() - y2.toDouble()), 2.0)))
        }
    }
    return max
}
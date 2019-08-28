package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = (0 until n).map {
        Problem086Point(sc.next().toInt(), sc.next().toInt(), sc.next().toInt())
    }
    println(problem086c(p))
}

fun problem086c(p: List<Problem086Point>): String {
    var current = Problem086Point(0, 0, 0)
    for (pi in p) {
        val xyDiff = Math.abs(current.x - pi.x) + Math.abs(current.y - pi.y)
        val tDiff = Math.abs(current.t - pi.t)
        if (tDiff >= xyDiff && ((xyDiff % 2 == 0 && tDiff % 2 == 0) || (xyDiff % 2 == 1 && tDiff % 2 == 1))) {
            current = pi
            continue
        }
        return "No"
    }
    return "Yes"
}

data class Problem086Point(var t: Int, var x: Int, var y: Int)
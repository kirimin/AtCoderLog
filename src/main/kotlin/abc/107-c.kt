package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val x = (0 until n).map { sc.next().toLong() }
    println(problem107c(n, k, x))
}

fun problem107c(n: Int, k: Int, x: List<Long>): Long {
    var min = Long.MAX_VALUE
    for (i in k + 1 .. n) {
        min = Math.min(min, Math.abs(x[i] - x[i - k]) + Math.min(Math.abs(x[i]), Math.abs(x[i - k])))
    }
    if (min == Long.MAX_VALUE) min = 0
    return min
}
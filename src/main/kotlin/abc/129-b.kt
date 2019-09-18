package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val w = (0 until n).map { sc.next().toInt() }
    println(problem129b(n, w))
}

fun problem129b(n: Int, w: List<Int>): Int {
    var min = Integer.MAX_VALUE
    for (t in 1 until n) {
        val current = Math.abs(w.subList(0, t).sum() - w.subList(t, w.size).sum())
        if (min > current) {
            min = current
        }
    }
    return min
}
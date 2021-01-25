package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem189c(n, a))
}

fun problem189c(n: Int, a: List<Int>): Int {
    var max = 0
    for (l in 0 until n) {
        var min = a[l]
        for (r in l + 1..n) {
            min = Math.min(min, a[r - 1])
            max = Math.max(min * (r - l), max)
        }
    }
    return max
}
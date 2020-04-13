package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = (0 until n).map { sc.next().toLong() }
    println(problem094c(n, x))
}

fun problem094c(n: Int, x: List<Long>): String {
    val sorted = x.sorted()
    val res = LongArray(n) { 0 }
    for (i in 0 until n) {
        res[i] = if (x[i] <= sorted[n / 2 - 1]) {
            sorted[n / 2]
        } else {
            sorted[n / 2 - 1]
        }
    }
    return res.joinToString("\n")
}
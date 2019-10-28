package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem144c(n))
}

fun problem144c(n: Long): Long {
    val nR = Math.sqrt(n.toDouble()).toLong()
    var min = Long.MAX_VALUE to Long.MAX_VALUE
    for (i in 1..nR) {
        val j = n / i
        if (i * j == n) {
            min = i to j
        }
    }
    return min.first + min.second - 2
}
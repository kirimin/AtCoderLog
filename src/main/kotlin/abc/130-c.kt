package abc

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem130c(n, a))
}

fun problem130c(n: Long, a: List<Long>): Long {
    return 0L
}
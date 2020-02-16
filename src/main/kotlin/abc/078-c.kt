package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    println(problem078c(n, m))
}

fun problem078c(n: Int, m: Int): Long {
    return (1900 * m + (100 * (n - m))) * Math.pow(2.0, m.toDouble()).toLong()
}
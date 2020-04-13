package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val k = sc.nextLong()
    println(problem161c(n, k))
}

fun problem161c(n: Long, k: Long): Long {
    return Math.min(n % k, k - (n % k))
}
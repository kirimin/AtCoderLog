package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val a = sc.nextLong()
    val b = sc.nextLong()
    val c = sc.nextLong()
    val d = sc.nextLong()
    val e = sc.nextLong()
    println(problem123c(n, a, b, c, d, e))
}

fun problem123c(n: Long, a: Long, b: Long, c: Long, d: Long, e: Long): Long {
    return n / listOf(a, b, c, d, e).min()!! + (if (n % listOf(a, b, c, d, e).min()!! != 0L) 1 else 0) + 4
}
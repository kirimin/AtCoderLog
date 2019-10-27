package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val m = sc.nextLong()
    println(problem090c(n, m))
}

fun problem090c(n: Long, m: Long): Long {
    return Math.abs((m - 2) * (n - 2))
}
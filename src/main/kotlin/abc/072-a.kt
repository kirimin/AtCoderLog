package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextLong()
    val t = sc.nextLong()
    println(problem072a(x, t))
}

fun problem072a(x: Long, t: Long): Long {
    return Math.max(x - t, 0)
}
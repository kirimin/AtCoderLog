package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val c = sc.nextLong()
    val d = sc.nextLong()
    println(problem178b(a, b, c, d))
}

fun problem178b(a: Long, b: Long, c: Long, d: Long): Long {
    return listOf(a * c, a * d, b * c, b * d).max()!!
}
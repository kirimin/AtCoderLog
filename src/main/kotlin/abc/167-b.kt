package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val c = sc.nextLong()
    val k = sc.nextLong()
    println(problem167b(a, b, c, k))
}

fun problem167b(a: Long, b: Long, c: Long, k: Long): Long {
    var k1 = k - a
    if (k1 <= 0L) return Math.min(k, a)
    k1 -= b
    if (k1 <= 0L) return Math.min(k, a)
    return a - k1
}
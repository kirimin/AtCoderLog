package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    println(problem297d(a, b))
}

fun problem297d(a: Long, b: Long): Long {
    var a = a
    var b = b
    if (a < b) {
        val tmp = a
        a = b
        b = tmp
    }
    var count = 0L
    while (b > 0) {
        count += a / b
        a %= b
        val tmp = a
        a = b
        b = tmp
    }
    return count - 1
}
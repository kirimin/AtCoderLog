package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val c = sc.nextLong()
    println(problem205c(a, b, c))
}

fun problem205c(a: Long, b: Long, c: Long): String {
    var a = a
    var b = b
    if (c % 2 == 0L) {
        if (a < 0) {
            a = Math.abs(a)
        }
        if (b < 0) {
            b = Math.abs(b)
        }
    }
    if (a > b) {
        return ">"
    } else if (a < b) {
        return "<"
    } else {
        return "="
    }
}
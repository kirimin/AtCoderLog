package abc

import utilities.debugLog
import java.util.*
import kotlin.math.min

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextLong()
    val k = sc.nextLong()
    val d = sc.nextLong()
    println(problem175c(x, k, d))
}

fun problem175c(x: Long, k: Long, d: Long): Long {
    var x = Math.abs(x)
    val straight = min(k, x / d)
    val k = k - straight
    x -= straight * d

    if (k % 2 == 0L) {
        return x
    } else {
        return d - x
    }
}
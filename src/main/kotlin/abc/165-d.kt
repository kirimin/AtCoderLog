package abc

import utilities.debugLog
import java.util.*
import kotlin.math.floor

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val n = sc.nextLong()
    println(problem165d(a, b, n))
}

fun problem165d(a: Long, b: Long, n: Long): Long {
    val x = Math.min(b - 1, n)
    return (floor(a * x / b.toDouble()) - a * floor(x / b.toDouble())).toLong()
}
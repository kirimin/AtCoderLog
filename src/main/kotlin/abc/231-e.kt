package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem231e(n, x, a))
}

fun problem231e(n: Int, x: Long, a: List<Long>): Int {
    return 0
}
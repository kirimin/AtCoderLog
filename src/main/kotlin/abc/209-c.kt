package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val c = (0 until n).map { sc.next().toLong() }
    println(problem209c(n, c))
}

fun problem209c(n: Int, c: List<Long>): Long {
    /***
     * 10^9 + 7
     */
    val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()

    val c = c.sorted()
    var count = c[0]
    val usedSet = mutableSetOf<Long>()
    for (i in 1 until n) {
        val ci = c[i]
        count *= ci - (i)
        count %= mod
    }
    return count % mod
}
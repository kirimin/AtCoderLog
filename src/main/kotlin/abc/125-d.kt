package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem125d(n, a))
}

fun problem125d(n: Int, a: List<Long>): Long {
    if (a.count { it < 0L } % 2 == 0) {
        return a.map { Math.abs(it) }.sum()
    }
    val min = a.map { Math.abs(it) }.min()!!
    return a.map { Math.abs(it) }.sum() - (min * 2)
}
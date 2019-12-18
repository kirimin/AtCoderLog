package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val l = (0 until n).map { sc.next().toInt() }
    println(problem067b(k, n, l))
}

fun problem067b(k: Int, n: Int, l: List<Int>): Int {
    return l.sortedDescending().take(k).sum()
}
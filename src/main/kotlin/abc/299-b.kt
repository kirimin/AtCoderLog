package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val t = sc.nextLong()
    val c = (0 until n).map { sc.next().toLong() }
    val r = (0 until n).map { sc.next().toLong() }
    println(problem299b(n, t, c, r))
}

fun problem299b(n: Int, t: Long, c: List<Long>, r: List<Long>): Long {
    val cr = c.zip(r)
    val max = cr.filter { it.first == t }.maxBy { it.second }
    if (max != null) {
        return cr.indexOf(max) + 1L
    }
    return (cr.indexOf(cr.filter { it.first == cr[0].first }.maxBy { it.second } ?: 0) + 1L) ?: 0
}
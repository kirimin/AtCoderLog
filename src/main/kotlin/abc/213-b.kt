package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem213b(n, a))
}

fun problem213b(n: Int, a: List<Long>): Int {
    val a = a.mapIndexed { index, l -> l to index + 1 }.sortedByDescending { it.first }
    return a[1].second
}
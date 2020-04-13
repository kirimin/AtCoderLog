package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem098b(n, s))
}

fun problem098b(n: Int, s: String): Int {
    var max = 0
    for (i in 1 until n) {
        val x = s.take(i).toSet()
        val y = s.takeLast(n - i).toSet()
        max = Math.max(max, x.filter { y.contains(it) }.count())
    }
    return max
}
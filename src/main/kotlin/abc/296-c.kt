package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem296c(n, x, a))
}

fun problem296c(n: Int, x: Long, a: List<Long>): String {
    val set = mutableSetOf<Long>()
    set.addAll(a)
    for (i in 0 until n) {
        val j = x + a[i]
        if (set.contains(j)) return "Yes"
    }
    return "No"
}
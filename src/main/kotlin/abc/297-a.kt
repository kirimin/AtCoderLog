package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val d = sc.nextLong()
    val t = (0 until n).map { sc.next().toLong() }
    println(problem297a(n, d, t))
}

fun problem297a(n: Int, d: Long, t: List<Long>): Long {
    for (i in 0 until n - 1) {
        if (t[i + 1] - t[i] <= d) return t[i + 1]
    }
    return -1L
}
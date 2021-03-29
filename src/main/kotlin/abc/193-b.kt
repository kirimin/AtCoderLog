package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val apx = (0 until n).map { Triple(sc.next().toLong(), sc.next().toLong(), sc.next().toLong()) }
    println(problem193b(n, apx))
}

fun problem193b(n: Int, apx: List<Triple<Long, Long, Long>>): Long {
    var min = Long.MAX_VALUE
    for (i in 0 until n) {
        val (a, p, x) = apx[i]
        val zaiko = x - a
        if (zaiko >= 1) min = Math.min(min, p)
    }
    if (min == Long.MAX_VALUE) return -1
    return min
}
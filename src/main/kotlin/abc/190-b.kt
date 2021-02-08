package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.nextLong()
    val d = sc.nextLong()
    val xy = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem190b(n, s, d, xy))
}

fun problem190b(n: Int, s: Long, d: Long, xy: List<Pair<Long, Long>>): String {
    for (i in 0 until n) {
        val (x, y) = xy[i]
        if (x >= s || y <= d) continue
        return "Yes"
    }
    return "No"
}
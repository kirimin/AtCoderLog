package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val d = sc.nextInt()
    val xy = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem174b(n, d, xy))
}

fun problem174b(n: Int, d: Int, xy: List<Pair<Long, Long>>): Int {
    var count = 0
    for (i in 0 until n) {
        val (x, y) = xy[i]
        val ans = Math.sqrt((x * x).toDouble() + (y * y).toDouble())
        if (ans <= d) count++
    }
    return count
}
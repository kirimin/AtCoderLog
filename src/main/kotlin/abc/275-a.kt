package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val h = (0 until n).map { sc.next().toLong() }
    println(problem275a(n, h))
}

fun problem275a(n: Int, h: List<Long>): Int {
    return h.indexOf(h.max()) + 1
}
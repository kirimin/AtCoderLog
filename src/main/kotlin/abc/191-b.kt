package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem191b(n, x, a))
}

fun problem191b(n: Int, x: Long, a: List<Long>): String {
    return a.filter { it != x }.joinToString(" ")
}
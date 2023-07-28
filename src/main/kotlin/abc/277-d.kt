package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem277d(n, m, a))
}

fun problem277d(n: Int, m: Long, a: List<Long>): Int {
    return 0
}
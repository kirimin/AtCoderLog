package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem008c(n, x, a))
}

fun problem008c(n: Int, x: Long, a: List<Long>): Int {
    return a.count { it == x }
}
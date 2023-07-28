package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = (0 until n * 5).map { sc.next().toInt() }
    println(problem291b(n, x))
}

fun problem291b(n: Int, x: List<Int>): Double {
    return x.sortedDescending().drop(n).dropLast(n).sum() / (3 * n).toDouble()
}
package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem240b(n, a))
}

fun problem240b(n: Int, a: List<Long>): Int {
    return a.toSet().size
}
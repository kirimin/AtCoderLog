package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem294a(n, a))
}

fun problem294a(n: Int, a: List<Int>): String {
    return a.filter { it % 2 == 0 }.joinToString(" ")
}
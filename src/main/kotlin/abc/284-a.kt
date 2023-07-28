package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem284a(n, s))
}

fun problem284a(n: Int, s: List<String>): String {
    return s.reversed().joinToString("\n")
}
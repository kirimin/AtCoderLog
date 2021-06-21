package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem205b(n, a))
}

fun problem205b(n: Int, a: List<Int>): String {
    return if (a.sorted() == (1..n).toList()) "Yes" else "No"
}
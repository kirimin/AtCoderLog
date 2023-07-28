package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem287a(n, s))
}

fun problem287a(n: Int, s: List<String>): String {
    return if (s.count { it == "For" } > n / 2) "Yes" else "No"
}
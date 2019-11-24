package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem145b(n, s))
}

fun problem145b(n: Int, s: String): String {
    if (s.length % 2 != 0) return "No"
    return if (s.take(n / 2) == s.takeLast(n / 2)) "Yes" else "No"
}
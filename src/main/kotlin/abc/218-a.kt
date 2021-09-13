package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem218a(n, s))
}

fun problem218a(n: Int, s: String): String {
    return if (s[n - 1] == 'o') "Yes" else "No"
}
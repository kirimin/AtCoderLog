package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem298a(n, s))
}

fun problem298a(n: Int, s: String): String {
    return if (s.count { it == 'o' } >= 1 && s.count { it == 'x' } == 0) "Yes" else "No"
}
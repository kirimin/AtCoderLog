package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    val t = sc.next()
    println(problem303a(n, s, t))
}

fun problem303a(n: Int, s: String, t: String): String {
    val s = s.replace('1', 'l').replace('0', 'o')
    val t = t.replace('1', 'l').replace('0', 'o')
    return if (s == t) "Yes" else "No"
}
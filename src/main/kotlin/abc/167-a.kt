package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem167a(s, t))
}

fun problem167a(s: String, t: String): String {
    return if (s == t.dropLast(1)) "Yes" else "No"
}
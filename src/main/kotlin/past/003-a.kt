package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem3a(s, t))
}

fun problem3a(s: String, t: String): String {
    return if (s == t) "same" else if (s.toUpperCase() == t.toUpperCase()) "case-insensitive" else "different"
}
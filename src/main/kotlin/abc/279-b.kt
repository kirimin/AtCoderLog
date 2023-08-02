package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem279b(s, t))
}

fun problem279b(s: String, t: String): String {
    return if (s.contains(t)) "Yes" else "No"
}
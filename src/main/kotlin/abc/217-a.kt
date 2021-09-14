package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem217a(s, t))
}

fun problem217a(s: String, t: String): String {
    return if (s < t) "Yes" else "No"
}
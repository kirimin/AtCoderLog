package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem224a(s))
}

fun problem224a(s: String): String {
    return if (s.takeLast(2) == "er") "er" else "ist"
}
package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    val b = sc.next()
    println(problem078a(a, b))
}

fun problem078a(a: String, b: String): String {
    return if (a < b) "<" else if (a > b) ">" else "="
}
package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem197a(s))
}

fun problem197a(s: String): String {
    return s.drop(1) + s.first()
}
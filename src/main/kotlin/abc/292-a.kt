package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem292a(s))
}

fun problem292a(s: String): String {
    return s.toUpperCase()
}
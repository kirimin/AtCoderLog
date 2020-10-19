package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem179a(s))
}

fun problem179a(s: String): String {
    return s + if (s.last() == 's') "es" else "s"
}
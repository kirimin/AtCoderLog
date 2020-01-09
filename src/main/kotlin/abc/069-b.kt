package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem069b(s))
}

fun problem069b(s: String): String {
    return s.take(1) + (s.length - 2) + s.takeLast(1)
}
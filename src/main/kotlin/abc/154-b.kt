package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem154b(s))
}

fun problem154b(s: String): String {
    return (0 until s.length).map { "x" }.joinToString("")
}
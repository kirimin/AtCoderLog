package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem279a(s))
}

fun problem279a(s: String): Int {
    return s.count { it == 'v' } + s.count { it == 'w' } * 2
}
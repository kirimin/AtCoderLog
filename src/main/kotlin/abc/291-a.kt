package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem291a(s))
}

fun problem291a(s: String): Int {
    return s.indexOfFirst { it in 'A'..'Z' } + 1
}
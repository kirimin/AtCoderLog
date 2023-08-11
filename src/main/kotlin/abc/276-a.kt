package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem276a(s))
}

fun problem276a(s: String): Int {
    return if (s.contains('a')) s.lastIndexOf('a') + 1 else -1
}
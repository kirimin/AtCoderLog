package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem242b(s))
}

fun problem242b(s: String): String {
    return s.toCharArray().sorted().joinToString("")
}
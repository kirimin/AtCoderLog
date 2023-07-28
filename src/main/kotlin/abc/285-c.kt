package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem285c(s))
}

fun problem285c(s: String): Long {
    var res = 0L
    for (c in s) {
        res *= 26
        res += c - '@'
    }
    return res
}
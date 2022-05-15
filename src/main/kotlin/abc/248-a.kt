package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem248a(s))
}

fun problem248a(s: String): Int {
    (0..9).forEach {
        if (!s.contains(it.toString())) return it
    }
    return -1
}
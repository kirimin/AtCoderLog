package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem175a(s))
}

fun problem175a(s: String): Int {
    return when (s) {
        "RSS", "SRS", "SSR", "RSR" -> 1
        "RRS", "SRR" -> 2
        "RRR" -> 3
        else -> 0
    }
}
package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem149a(s, t))
}

fun problem149a(s: String, t: String): String {
    return t + s
}
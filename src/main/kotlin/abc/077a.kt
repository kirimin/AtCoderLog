package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val c1 = sc.next()
    val c2 = sc.next()
    println(problem077a(c1, c2))
}

fun problem077a(c1: String, c2: String): String {
    return if (c1 == c2.reversed() && c1.reversed() == c2) "YES" else "NO"
}
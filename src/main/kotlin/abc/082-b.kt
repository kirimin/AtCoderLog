package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem082b(s, t))
}

fun problem082b(s: String, t: String): String {
    val sD = s.toList().sorted()
    val tD = t.toList().sortedDescending()
    return if (sD.joinToString() < tD.joinToString()) "Yes" else "No"
}
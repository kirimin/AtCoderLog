package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem104b(s))
}

fun problem104b(s: String): String {
    return if (s[0] == 'A' && s.drop(2).dropLast(1).count { it == 'C' } == 1 && s.filter { it in ('A'..'Z') }.length == 2) "AC" else "WA"
}
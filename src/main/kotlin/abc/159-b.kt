package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem159b(s))
}

fun problem159b(s: String): String {
    val s = s.toCharArray()
    val sRight = s.take(s.size / 2)
    val sLeft = s.takeLast(s.size / 2)
    return if (s.toList() == s.reversed() && sRight == sRight.reversed() && sLeft == sLeft.reversed())"Yes" else "No"
}
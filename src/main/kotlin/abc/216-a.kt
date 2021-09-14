package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.next()
    println(problem216a(x))
}

fun problem216a(x: String): String {
    val y = x.last().toString().toInt()
    val x = x.dropLast(2)
    return if (y <= 2) "$x-" else if (y <= 6) x else "$x+"
}
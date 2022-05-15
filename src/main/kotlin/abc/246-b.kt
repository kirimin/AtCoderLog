package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem246b(a, b))
}

fun problem246b(a: Int, b: Int): String {
    val d = Math.sqrt(Math.pow((0 - a).toDouble(), 2.0) + Math.pow((0 - b).toDouble(), 2.0))
    return "${a / d} ${b / d}"
}
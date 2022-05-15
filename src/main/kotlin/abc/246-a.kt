package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x1 = sc.nextInt()
    val y1 = sc.nextInt()
    val x2 = sc.nextInt()
    val y2 = sc.nextInt()
    val x3 = sc.nextInt()
    val y3 = sc.nextInt()
    println(problem246a(x1, y1, x2, y2, x3, y3))
}

fun problem246a(x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int): String {
    val x = listOf(x1, x2, x3).groupBy { it }.toList().find { it.second.count() == 1 }!!.first
    val y = listOf(y1, y2, y3).groupBy { it }.toList().find { it.second.count() == 1 }!!.first
    return "$x $y"
}
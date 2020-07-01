package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x1 = sc.nextInt()
    val y1 = sc.nextInt()
    val x2 = sc.nextInt()
    val y2 = sc.nextInt()
    println(problem108b(x1, y1, x2, y2))
}

fun problem108b(x1: Int, y1: Int, x2: Int, y2: Int): String {
    val x3 = x2 - x1
    val y3 = y2 - y1
    return listOf(x2 - y3, y2 + x3, x1 - y3, y1 + x3).joinToString(" ")
}
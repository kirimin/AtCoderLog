package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    println(problem070b(a, b, c, d))
}

fun problem070b(a: Int, b: Int, c: Int, d: Int): Int {
    return Math.max(Math.min(b, d) - Math.max(a, c), 0)
}
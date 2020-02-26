package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    println(problem092a(a, b, c, d))
}

fun problem092a(a: Int, b: Int, c: Int, d: Int): Int {
    return Math.min(a, b) + Math.min(c, d)
}